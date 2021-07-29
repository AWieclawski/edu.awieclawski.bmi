<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>

	<h1>${sessionScope["head"]}</h1>

	<pre>
	
	Age: ${age} ${sessionScope["agemtr"]} <br>

	Weight: ${weight} ${sessionScope["heightmtr"]} <br>

	Height: ${height} ${sessionScope["weightmtr"]}
	
	</pre>


</div>