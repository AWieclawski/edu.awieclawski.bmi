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

	<jsp:include page="sub/personcard.jsp" />

	<!-- POST confirm / cancel -->

	<form:form class="form-horizontal" action="/${act}" method="post"
		enctype="application/x-www-form-urlencoded">

		<div class="form-group">

			<div class="col-sm-12">

				<button class="btn btn-primary" type="submit" name="confirm">Confirm</button>

				<button class="btn btn-secondary" type="submit" name="cancel">Cancel</button>

			</div>

		</div>

	</form:form>

</div>