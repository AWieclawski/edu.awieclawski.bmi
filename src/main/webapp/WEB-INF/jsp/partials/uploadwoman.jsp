<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div>

	<h3>Input data to calculate Female BMI</h3>

	<h4>${message}</h4>

	<form:form class="form-horizontal" action="/upwoman" method="post"
		modelAttribute="woman" enctype="multipart/form-data">

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

				<button type="submit" class="btn btn-default">Submit</button>

			</div>

		</div>

	</form:form>

</div>