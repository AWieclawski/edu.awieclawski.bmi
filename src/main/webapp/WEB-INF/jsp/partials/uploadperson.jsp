<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="per" scope="session" value="woman" />

<c:set var="act" scope="session" value="upwoman" />

<c:if test="${ismale}">

	<c:set var="per" scope="session" value="man" />

	<c:set var="act" scope="session" value="upman" />

</c:if>

<h1>${sessionScope["head"]}</h1>

<h3>Input data to calculateBMI</h3>

<div>

	<form:form class="form-horizontal" action="/${act}" method="post"
		modelAttribute="${per}" enctype="multipart/form-data">

		<div class="form-group">

			<form:label class="control-label col-sm-2" path="age">Age</form:label>

			<div class="col-sm-10">

				<form:input path="age" placeholder="input age" />
				${sessionScope["agemtr"]}
				<form:errors class="alert alert-warning" path="age" />

			</div>

		</div>

		<div class="form-group">

			<form:label class="control-label col-sm-2" path="weight">Weight</form:label>

			<div class="col-sm-10">

				<form:input path="weight" placeholder="input weight" />

				${sessionScope["wghtmtr"]}

				<form:errors class="alert alert-warning" path="weight" />

			</div>

		</div>

		<div class="form-group">

			<form:label class="control-label col-sm-2" path="height">Height</form:label>

			<div class="col-sm-10">

				<form:input path="height" placeholder="input height" />

				${sessionScope["hghtmtr"]}

				<form:errors class="alert alert-warning" path="height" />

			</div>

		</div>

		<div class="form-group">

			<div class="col-sm-offset-2 col-sm-10">

				<button class="btn btn-primary" type="submit" name="submit">Submit</button>

				<button class="btn btn-secondary" type="submit" name="reset">Reset</button>

			</div>

		</div>

	</form:form>

</div>