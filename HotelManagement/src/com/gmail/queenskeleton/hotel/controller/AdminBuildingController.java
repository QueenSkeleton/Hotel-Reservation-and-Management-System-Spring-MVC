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

import com.gmail.queenskeleton.hotel.entity.Building;
import com.gmail.queenskeleton.hotel.service.BuildingService;

@Controller
@RequestMapping("/admin/Buildings")
public class AdminBuildingController {

	@Autowired
	private BuildingService buildingService;

	public void setBuildingService(BuildingService buildingService) {
		this.buildingService = buildingService;
	}
	
	@GetMapping("")
	public String panel() {
		return "admin-buildingspanel";
	}
	
	@GetMapping("/Table")
	public String table(Model model) {
		model.addAttribute("buildingList", buildingService.getList());
		return "admin-buildingstable";
	}
	
	@GetMapping("/Add")
	public String add(Model model) {
		model.addAttribute("building", new Building());
		return "admin-buildingsmodal";
	}
	
	@GetMapping("/Update/{id}")
	public String update(@PathVariable("id") long id, Model model) {
		model.addAttribute("building", buildingService.getByID(id));
		return "admin-buildingsmodal";
	}
	
	@PostMapping("/Save")
	public @ResponseBody ResponseEntity<String> save(@ModelAttribute("building") Building building) {
		return buildingService.save(building) ?
			new ResponseEntity<String>("Building successfully saved.", HttpStatus.OK) :
			new ResponseEntity<String>("An error occured whilet trying to save building. Please try again.", HttpStatus.INTERNAL_SERVER_ERROR);	
	}
	
	@GetMapping("/Delete/{id}")
	public @ResponseBody ResponseEntity<String> delete(@PathVariable("id") long id) {
		return buildingService.deleteByID(id) ?
			new ResponseEntity<String>("Building successfully removed.", HttpStatus.OK) :
			new ResponseEntity<String>("An error occured whilet trying to remove building. Please try again.", HttpStatus.INTERNAL_SERVER_ERROR);	
	}
	
}
