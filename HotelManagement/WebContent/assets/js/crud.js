// Table (applicable to all)
function table() {
	$.ajax({
		type: "GET",
		url: "Buildings/Table",
		dataType: "html",
		success: function(data) {
			$("#table-container").html(data);
			$("#main-table").DataTable();
		}
	});
}

// Call Table upon load
table();

// Buildings: ADD
$("#btnAddBuilding").click(function() {
	$.ajax({
		type: "GET",
		url: "<c:url value='/admin/Buildings/Add'/>",
		dataType: "html",
		success: function(data) {
			$("#main-modal > .modal-dialog > .modal-content").html(data);
		}
	});
});

// On Submit of Create-Update Forms (applicable to all, for now)
$(document).on("submit", "#main-form", function(e) {
	e.preventDefault();
	
	$.ajax({
		type: $(this).attr("method"),
		url: $(this).attr("action"),
		data: $(this).serialize(),
		dataType: "html",
		success: function(data) {
			$("#main-modal").modal("hide");
			toastr.success(data, "Response from system:");
			table();
		}
	});
});

// Update Buttons (applicable to all)
$(document).on("click", ".btn-update", function() {
	$.ajax({
		type: "GET",
		url: "Buildings/Update/" + $(this).data("id"),
		dataType: "html",
		success: function(data) {
			$("#main-modal > .modal-dialog > .modal-content").html(data);
		}
	});
});

// Delete Buttons (applicable to all)
$(document).on("click", ".btn-delete", function() {
	var id = $(this).data("id");
	
	if(window.confirm("Are you sure you want to delete Building with ID:" + id + "?")) {
		$.ajax({
			type: "GET",
			url: "Buildings/Delete/" + id,
			dataType: "html",
			success: function(data) {
				table();
			}
		});
	}
});