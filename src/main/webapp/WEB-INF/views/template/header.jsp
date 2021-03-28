<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #EAE4F8">
  <a class="navbar-brand" href="/whatI/">What I</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
	  <li class="nav-item">
        <a class="nav-link" href="/whatI/game/gameList">Played</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Watched</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Read</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Member
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
        	<c:if test="${empty member}">
      			<a class="dropdown-item" href="/whatI/member/signIn">Sign in</a>
        		<a class="dropdown-item" href="/whatI/member/signUp">Sign up</a>
         		<a class="dropdown-item" href="#"></a>
        	</c:if>
			<c:if test="${not empty member }">
      			<a class="dropdown-item" href="/whatI/member/updateInfo">Manage Account</a>
         		<a class="dropdown-item" href="#">Manage Review</a>			
        		<a class="dropdown-item" href="/whatI/member/signOut">Sign out</a>
			</c:if>
        </div>
      </li>
    </ul>
  </div>
</nav>