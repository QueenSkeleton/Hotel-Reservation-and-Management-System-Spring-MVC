package com.gmail.queenskeleton.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gmail.queenskeleton.hotel.entity.Floor;
import com.gmail.queenskeleton.hotel.service.FloorService;

@Controller
@RequestMapping("/admin/Floors")
public class AdminFloorController {

	@Autowired
	private FloorService floorService;

	public void setFloorService(FloorService floorService) {
		this.floorService = floorService;
	}
	
	@GetMapping("")
	public String panel() {
		return "admin-floorspanel";
	}
	
	@GetMapping("/Table")
	public String table(Model model) {
		model.addAttribute("floorList", floorService.getList());
		return "admin-floorstable";
	}
	
	@GetMapping("/Add")
	public String add(Model model) {
		model.addAttribute("floor", new Floor());
		return "admin-floorsmodal";
	}
	
	@GetMapping("/Update/{id}")
	public String update(@PathVariable("id") long id, Model model) {
		model.addAttribute("floor", floorService.getByID(id));
		return "admin-floorsmodal";
	}
	
	@PostMapping("/Save")
	public @ResponseBody ResponseEntity<String> save(@ModelAttribute("floor") Floor floor) {
		return floorService.save(floor) ?
			new ResponseEntity<String>("Floor successfully saved.", HttpStatus.OK) :
			new ResponseEntity<String>("An error occured whilet trying to save floor. Please try again.", HttpStatus.INTERNAL_SERVER_ERROR);	
	}
	
	@GetMapping("/Delete/{id}")
	public @ResponseBody ResponseEntity<String> delete(@PathVariable("id") long id) {
		return floorService.deleteByID(id) ?
			new ResponseEntity<String>("Floor successfully removed.", HttpStatus.OK) :
			new ResponseEntity<String>("An error occured whilet trying to remove floor. Please try again.", HttpStatus.INTERNAL_SERVER_ERROR);	
	}
	
}
