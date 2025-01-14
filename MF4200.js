function enableDisable(mode){
	enaDisButton("b_prevField",1);
}
function screenSpecific(){
	if(document.getElementById("hid_invokeSelScr").value == "Y"){
		document.getElementById("hid_invokeSelScr").value = "N";
		document.getElementById("b_select").click();
		//return;
	}
}
function performFunction(obj){
	var id=obj.id;
	removeError(null);
	document.getElementById("function").value=id;
	var aryArgument = new Array();
	 
	if(id == "b_select"){
		resetEntireScreen();
		document.getElementById("screenMode").value="I";
		document.getElementById("modeString").innerHTML="Find";
		var aryArgument = new Array();
		ModalHelper.showModalDialog('jsp/MF/lists/MF4201.jsp', "Service Balancing (MF4200)", 200, 200, aryArgument, function(retObj) {
	
		if(retObj === undefined){
			return;
		}else{
			if(retObj.FieldName=="fld_lvediServNbr"){
				__putLinkParameter("MF4200","SEL_SERV_NBR",retObj.FieldValue);
				document.getElementById("callSequence").value = "1";
				validateForm("I");
				return;
			}else{
				showError(null,2,"Wrong FieldName. Contact programmer");
			}
		}
		   });
	}else if(id == "b_providerAddress"){
		requestBody="LINKAGE={"+"1="+document.getElementById("fld_ediServNbr").value+"}";
		requestBody+="&ScreenID=General&LinkScreen=MF4201";
		execAJAXScript_Linkage();
		document.getElementById("callSequence").value = "1";
		document.getElementById("previousAction").value="MF4200";
		callScreen("jsp/MF/forms/MF4200.jsp","0","I");
	}
}
function putScreenInModify_ext(){disableAcceptFlag();}
