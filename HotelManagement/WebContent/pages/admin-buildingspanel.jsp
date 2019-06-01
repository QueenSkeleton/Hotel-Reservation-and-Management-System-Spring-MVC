<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<jsp:include page="include/admin-head.jsp"></jsp:include>
		<title>Admin: Buildings Panel</title>
		
		<!-- DataTable Bootstrap 4 CSS -->
    	<link href="<c:url value='/assets/vendor/datatablesbs4/css/dataTables.bootstrap4.css'/>" rel="stylesheet">
	</head>
	<body>
		
		<jsp:include page="include/admin-preloader.jsp"></jsp:include>
	    
	    <div id="main-wrapper">
	    
	        <jsp:include page="include/admin-topbar.jsp"></jsp:include>
	        
	        <jsp:include page="include/admin-sidebar.jsp"></jsp:include>
	        
	        <div class="page-wrapper">
	        
	             <div class="page-breadcrumb">
	                <div class="row">
	                    <div class="col-12 d-flex no-block align-items-center">
	                        <h4 class="page-title">Buildings Panel</h4>
	                        <div class="ml-auto text-right">
	                            <nav aria-label="breadcrumb">
	                                <ol class="breadcrumb">
	                                    <li class="breadcrumb-item"><a href="<c:url value='/admin/Dashboard'/>">Dashboard</a></li>
	                                    <li class="breadcrumb-item active" aria-current="page">Buildings</li>
	                                </ol>
	                            </nav>
	                        </div>
	                    </div>
	                </div>
	            </div>
	            
	            <div class="container-fluid">
	            
	            	<div class="row">
	            		<div class="col-12">
	            			
	            			<div class="card shadow">
	            				<div class="card-body">
	            				
	            					<h5 class="card-title m-b-0">List of Buildings</h5>
	            					
		            				<div class="table-responsive" id="table-container">
		            				
		            				</div>
	            				
	            				</div>
	            			</div>
	            			
	            		</div>
	            	</div>
	            	
	            </div>
	            
	            <jsp:include page="include/admin-footer.jsp"></jsp:include>
	            
	        </div>
	    </div>
		
		<!-- Bottom Scripts -->
		<jsp:include page="include/admin-foot.jsp"></jsp:include>
		
		<!-- DataTable Scripts -->
    	<script src="<c:url value='/assets/vendor/DataTables/datatables.min.js'/>"></script>
    	
    	<!-- Main Modal -->
    	<jsp:include page="include/admin-mainmodal.jsp"></jsp:include>
	    
	    <!-- Custom CRUD Script (applicable to all) -->
	    <script src="<c:url value='/assets/js/crud.js'/>"></script>
	    
	</body>
</html>