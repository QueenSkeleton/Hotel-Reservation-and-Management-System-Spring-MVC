<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<aside class="left-sidebar" data-sidebarbg="skin5">
    <div class="scroll-sidebar">
        <nav class="sidebar-nav">
            <ul id="sidebarnav" class="p-t-30">
                <li class="sidebar-item"> 
                	<a class="sidebar-link has-arrow waves-effect waves-dark" href="javascript:void(0)" aria-expanded="false">
                		<i class="fas fa-building"></i>
                		<span class="hide-menu">Hotel Configuration</span>
                	</a>
                    <ul aria-expanded="false" class="collapse first-level">
                        <li class="sidebar-item">
                        	<a href="<c:url value='/admin/Buildings'/>" class="sidebar-link">
                        		<i class="mdi mdi-note-outline"></i>
                        		<span class="hide-menu">Buildings</span>
                        	</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </nav>
    </div>
</aside>