<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Enter Service Number (MF4201)</title>
<style>
  <jsp:include page="/css/include/Layout.css" />
  <jsp:include page="/css/include/Popup.css" />
</style>
<script type="text/javascript">
    <jsp:include page="/js/common/General.js" />
    <jsp:include page="/js/common/TimeOut.js" />  
    <jsp:include page="/js/MF/lists/MF4201.js" />
</script>
<link  href="../../../css/include/jquery-ui.css" rel="stylesheet" type="text/css" />  
<script type="text/javascript" src="../../../js/common/jquery.min.js"></script> 
<script type="text/javascript" src="../../../js/common/jquery-ui.min.js" ></script> 
</head>
<body onLoad="houseKeeping()" onUnLoad="cleanUp()" onKeyDown="onKeyDownHandler()">
<div id="modalDiv" style="display:none;">  
			<iframe id="frame" src="" scrolling="yes"></iframe>
</div>
<br>
<form onsubmit="return false;">
<table style="margin-left:10px;">
   <tr>
        <td><label>Enter Service Number: </label></td>
        <td><input type="text" id="fld_lvediServNbr" class="entryFields" name="fld_lvediServNbr" maxlength="18" size="18" /></td>
    </tr>		   
</table>
<%@ include file="/jsp/common/DefaultHiddenFields.jsp" %>
<script type="text/javascript">
document.getElementById("screenID").value="MF4201";
document.getElementById("screenMode").value="M";
document.getElementById("screenType").value="POPUP";
document.addEventListener('keydown', function(event){
	if((event.target.id == 'fld_lvediServNbr'  ) && (event.which == '13' || event.code == 'Enter' || event.key == 'Enter')){

    enableField("fld_lvediServNbr");
    
	}
});

</script>
</form>
</body>
</html>