<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="aa" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>FAQ 리스트 출력</title>
<link rel="stylesheet" type="text/css" href="./css/faq.css?v=8">

</head>
<body>
<section class="faq_view">
	<div class="faq_list">
		<p>FAQ LIST</p>
		<span class="faq_content">
			<ul>
				<li>카테고리</li>
				<li>제목</li>
				<li>글쓴이</li>
				<li>등록일자</li>
			</ul>
		</span>
		
		
		<span class="faq_content_view">

		<aa:if test = "${empty list }">
			<ul class="nodata">
				<li>등록된 FAQ가 없습니다.</li>
			</ul>
		</aa:if>
		</span>
		
		<span class="faq_content_view" onclick="modify(${ll.inx})" > 
			<aa:forEach var="ll" items="${list}" varStatus="status">
			<ul>
				<li><aa:if test="${ll.fcate} "></aa:if></li>
				<li class="left_text"><aa:if test="${ll.faq_qc}"></aa:if></li>
				<li><aa:if test="${ll.fwrite}"></aa:if></li>
				<li><aa:if test="${ll.indate.substring(0,10)}"></aa:if></li>
			</ul>
			</aa:forEach>
		</span>
		
		
	</div>
	<div class="pageing">
	<ol>
	<li>1</li>
	</ol>
	</div>
	<div class="page_btn">
	<input type="button" value="FAQ 등록" class="faq_btn" title="FAQ 등록" onclick="faq_write();">
	</div>
</section>
</body>
</html>