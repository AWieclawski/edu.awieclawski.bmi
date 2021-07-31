<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<c:set var="act" scope="session" value="womanresult" />
	
	<c:if test="${ismale}">
	
		<c:set var="act" scope="session" value="manresult" />
		
	</c:if>

	<h1>${sessionScope["head"]}</h1>
	
	<h3>The result is:</h3>

<div>

	<p>
	
	Age: ${age} ${sessionScope["agemtr"]} <br>

	Weight: ${wght} ${sessionScope["wghtmtr"]} <br>

	Height: ${hght} ${sessionScope["hghtmtr"]}
	
	</p>

</div>