<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>

	<c:set var="sex" scope="session" value="woman" />
	<c:set var="act" scope="session" value="upwoman" />
	<c:set var="hed" scope="session" value="Female" />
	<c:if test="${ismale}">
		<c:set var="sex" scope="session" value="man" />
		<c:set var="act" scope="session" value="upman" />
		<c:set var="hed" scope="session" value="Male" />
	</c:if>

	<h3>Input data to calculate ${hed} BMI</h3>

	<form:form class="form-horizontal" action="/${act}" method="post"
		modelAttribute="${sex}" enctype="multipart/form-data">

		<div class="form-group">

			<form:label class="control-label col-sm-2" path="age">Age</form:label>

			<div class="col-sm-10">

				<form:input path="age" placeholder="input age" />
				<form:errors class="alert alert-warning" path="age" />

			</div>

		</div>

		<div class="form-group">

			<form:label class="control-label col-sm-2" path="weight">Weight</form:label>

			<div class="col-sm-10">

				<form:input path="weight" placeholder="input weight" />
				<form:errors class="alert alert-warning" path="weight" />

			</div>

		</div>

		<div class="form-group">

			<form:label class="control-label col-sm-2" path="height">Height</form:label>

			<div class="col-sm-10">

				<form:input path="height" placeholder="input height" />
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