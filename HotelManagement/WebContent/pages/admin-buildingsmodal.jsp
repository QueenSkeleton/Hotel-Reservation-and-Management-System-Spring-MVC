<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div class="modal-header">
	
	<h3 class="modal-title">
		<i class="fas fa-building"></i>
		${building.id eq 0 ? 'Add' : 'Update'} Building
	</h3>
	
	<button type="button" class="close" data-dismiss="modal">
		&times;
	</button>
	
</div>

<form:form modelAttribute="building" id="main-form" method="POST" action="/HotelManagement/admin/Buildings/Save">

	<div class="modal-body">
		
		<form:hidden path="id"/>
		
		<div class="form-group">
			<form:label path="name" class="control-label">Name:</form:label>
			<form:input type="text" path="name" class="form-control" required="true"/>
		</div>
		
		<div class="form-group">
			<form:label path="description" class="control-label">Description:</form:label>
			<form:textarea path="description" class="form-control" rows="3"/>
		</div>
		
	</div>
	
	<div class="modal-footer">
		<button type="submit" class="btn btn-primary">${building.id eq 0 ? 'Add' : 'Update'}</button>
		<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
	</div>

</form:form>