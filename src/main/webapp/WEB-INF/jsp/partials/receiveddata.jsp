<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>

	<c:set var="act" scope="session" value="womanresult" />
	<c:if test="${ismale}">
		<c:set var="act" scope="session" value="manresult" />
	</c:if>

	<h1>${sessionScope["head"]}</h1>

	<pre>
	
	Age: ${age} ${sessionScope["agemtr"]} <br>

	Weight: ${wght} ${sessionScope["hghtmtr"]} <br>

	Height: ${hght} ${sessionScope["wghtmtr"]}
	
	</pre>

	<div class="nav navbar-nav">

		<a class="navbar-brand" href="/${act}"> Male </a>

	</div>

</div>