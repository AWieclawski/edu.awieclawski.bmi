<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="act" scope="session" value="womanresult" />

<c:if test="${ismale}">

	<c:set var="act" scope="session" value="manresult" />

</c:if>

<h1>${sessionScope["head"]}</h1>

<h3>Data to confirm:</h3>

<div>

	<p>

		Age: ${age} ${sessionScope["agemtr"]} <br> Weight: ${wght}
		${sessionScope["wghtmtr"]} <br> Height: ${hght}
		${sessionScope["hghtmtr"]}

	</p>


	<a class="btn btn-large btn-primary" data-toggle="confirmation"
		data-title="Get the result" href="/${act}" target="_top">Confirm</a>

</div>