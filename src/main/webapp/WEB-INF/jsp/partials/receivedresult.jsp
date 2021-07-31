<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>${sessionScope["head"]}</h1>

<h3>The result is: ${resultreceived}</h3>

<jsp:include page="sub/personcard.jsp" />


