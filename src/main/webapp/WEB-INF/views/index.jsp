<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>## LeeGyojin Profile Home</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/span.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/table.css">
</head>
<body>
	<%@ include file="include/header.jsp" %>

	<center>
	<table class="t-type01" width="75%" border="0" cellspacing="0" cellpadding="20">
		<tbody>
			<tr>
				<td><span class="title01">DEVELOPER GYOJIN'S PROFILE</span></td>
			</tr>
			<tr>
				<td><span class="title02">I'm Gyojin Lee, a developer who wants a development job. Please call me back.</span></td>
			</tr>
			<tr>
				<table width="70%" border="0" cellspacing="0" cellpadding="10">
					<tbody>
						<tr>
							<td bgcolor="#D5D5D5"><span class="s-text01">J</span><span class="s-text02">AVA</span></td>
							<!-- <td rowspan="6" bgcolor="#353535" align="center">
									<img alt="" src="${pageContext.request.contextPath}/resources/img/kongyu.jpg">
								</td> -->
							<td height="500" rowspan="6" bgcolor="#353535" align="center">
									<img alt="" src="<c:url value='/resources/img/kongyu.jpg' />" >
							</td>
							
						</tr>
						<tr>
							<td bgcolor="#D5D5D5"><span class="s-text01">J</span><span class="s-text02">SP</span></td>
						</tr>
						<tr>
							<td bgcolor="#D5D5D5"><span class="s-text01">S</span><span class="s-text02">pring</span></td>
						</tr>
						<tr>
							<td bgcolor="#D5D5D5"><span class="s-text01">J</span><span class="s-text02">AVASCRIPT</span></td>
						</tr>
						<tr>
							<td bgcolor="#D5D5D5"><span class="s-text01">H</span><span class="s-text02">TML5</span></td>
						</tr>
						<tr>
							<td bgcolor="#D5D5D5"><span class="s-text01">D</span><span class="s-text02">ATABASE</span></td>
						</tr>					
					</tbody>				
				</table>
			</tr>			
		</tbody>	
	</table>
	</center>
	
	<%@ include file="include/footer.jsp" %>	
</body>
</html>