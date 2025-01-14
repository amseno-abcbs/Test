function screenSpecific(){
	enableField("fld_lvediServNbr",0);
	document.getElementById("fld_lvediServNbr").focus();
}
function validateField(obj){
	
	var id=obj.id;	
	resetError(id);

	requestBody="ElementName="+id+"&ElementValue="+obj.value;
	requestBody+="&ScreenMode=M&ScreenID=MF4201";
	 
	execAJAXScript2(AJAX_ResponseHandler_ADMI);
		 
}
function AJAX_ResponseHandler_ADMI_ext(elementName,idx){
	 
	if(elementName=="fld_lvediServNbr"){
		var retObj=new Object();
		retObj.FieldName=elementName;
		retObj.FieldValue=document.getElementById(elementName).value;
		
		parent.window.ModalHelper.setRetVal(retObj);
		parent.window.ModalHelper.close();
	}
}