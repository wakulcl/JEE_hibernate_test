<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ page 
language="java"
contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"
%>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="theme/Master.css" rel="stylesheet"
	type="text/css">
<TITLE>login.jsp</TITLE>
</HEAD>
<BODY>

<html:form action="/test">
<table border=0>
<tr>
	<td>rut:</td>
	<td><html:text property="rut"  /></td>
</tr>
<tr>
	<td>password:</td>
	<td><html:password property="password" /></td>
</tr>
<tr>
<td></td>
<td><html:submit property="submit" title="registrar"></html:submit> </td>
</tr>
</table>
</html:form>
</BODY>
</HTML>
