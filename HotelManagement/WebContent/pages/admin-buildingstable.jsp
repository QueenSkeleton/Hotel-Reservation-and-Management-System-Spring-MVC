<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table class="table table-bordered" id="main-table">
	<thead>
		<tr>
			<th>#.</th>
			<th>Name</th>
			<th>Description</th>
			<th>Actions</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${buildingList}" var="building" varStatus="status">
			<tr>
				<td class="align-middle">${status.index + 1}</td>
				<td class="align-middle">${building.name}</td>
				<td class="align-middle">${building.description}</td>
				<td class="align-middle">
					<button type="button" class="btn btn-sm btn-primary btn-update" data-id="${building.id}" data-toggle="modal" data-target="#main-modal">
						<i class="fas fa-edit"></i>
					</button>
					
					|
					
					<button type="button" class="btn btn-sm btn-danger btn-delete" data-id="${building.id}">
						<i class="fas fa-trash"></i>
					</button>
				</td>
			</tr>
		</c:forEach>
	</tbody>
	<tfoot>
		<tr>
			<th>#.</th>
			<th>Name</th>
			<th>Description</th>
			<th>Actions</th>
		</tr>
	</tfoot>
</table>