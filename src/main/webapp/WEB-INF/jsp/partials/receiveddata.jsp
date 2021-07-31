<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="act" scope="session" value="confirmwoman" />

<c:if test="${ismale}">

	<c:set var="act" scope="session" value="confirmman" />

</c:if>

<h1>${sessionScope["head"]}</h1>

<h3>Data to confirm:</h3>

<div>


	<div class="card">

		<div class="card-body">

			<p>Age: ${age} ${sessionScope["agemtr"]}</p>

			<p>Weight: ${wght} ${sessionScope["wghtmtr"]}</p>

			<p>Height: ${hght} ${sessionScope["hghtmtr"]}</p>

		</div>

	</div>

	<!-- POST confirm -->

	<form:form class="form-horizontal" action="/${act}" method="post"
		enctype="multipart/form-data">

		<div class="form-group">

			<div class="col-sm-offset-2 col-sm-10">

				<button class="btn btn-primary" type="submit" name="confirm">Confirm</button>

				<button class="btn btn-secondary" type="submit" name="reset">Reset</button>

			</div>

		</div>

	</form:form>

</div>