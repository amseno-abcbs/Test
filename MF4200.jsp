<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Service Balancing</title>
<link href="css/include/Layout.css"  rel="stylesheet" type="text/css" />
<link href="css/include/MenuItemBar.css"  rel="stylesheet" type="text/css" />

<link  href="css/include/jquery-ui.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/common/jquery.min.js"></script>
<script type="text/javascript" src="js/common/jquery-ui.min.js" ></script>

<script type="text/javascript" src="js/common/json2.js"></script>
<script type="text/javascript" src="js/common/General.js"></script>
<script type="text/javascript" src="js/common/TimeOut.js"></script>
<script type="text/javascript" src="js/MF/forms/MF4200.js"></script>
</head>
<body onLoad="houseKeeping()" onUnLoad="cleanUp()" onKeyDown="onKeyDownHandler()">
<form method="post" action="Controller.do" onsubmit="return validateForm()"></form>
<div id="modalDiv" style="display:none;"></div> 
<div id="id_contentSection" >
  <div id="titleBar">&nbsp;Service Balancing (MF4200)</div>
  <div id="notificationBar"></div>
  <div id="screenBar">
      <div id="windowFunctionsBar">
        <div id="windowFunctions">
          <br><span id="windowFunctionsLabel"><b><u>Window Functions</u></b></span><br><br>
          <button type="button" id="b_prevAction"      accesskey="v" tabindex=-1 class="button" onclick="__performPrevAction()">Previous Action</button><br><br>
          <button type="button" id="b_select"          accesskey="s" tabindex=-1 class="button" onclick="performFunction(this)">Select</button><br><br>         
          <button type="button" id="b_read"            accesskey="p" tabindex=-1 class="button" onclick="performFunction(this)">Read</button><br><br>
          <button type="button" id="b_calculate"        accesskey="c" tabindex=-1 class="button" onclick="performFunction(this)">Calculate</button><br><br>               	
        </div>
      </div>
      <div id="formBar"></div><br>
      <div id="modeLabel">Mode:<span id="modeString">None</span>&nbsp;</div><br>
      <label>AMISYS INPUT:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label>BALANCING RESULTS:</label>&nbsp;
      <table>
         <tr></tr>
        <tr></tr>
              	 
	    <tr>
             <td><label>Charge:</label></td>
             <td>
               <input type="text" id="fld_amtcharge" class="entryFields" name="fld_amtcharge" maxlength="9" size="9" value="${BEAN.fld_amtcharge}"/>
             </td>
             <td><label>Charge:</label></td>
             <td>
               <input type="text" id="fld_amtcharge" class="entryFields" name="fld_amtcharge" maxlength="9" size="9" value="${BEAN.fld_amtcharge}"/>
             </td>
             <td><label>Bank Code:</label></td>
           	 <td>
               <input type="text" id="fld_bank" class="entryFields" name="fld_bank" maxlength="2" size="2" value="${BEAN.fld_bank}"/>
             </td>
        </tr>
         
        <tr>
             <td><label>Allow:</label></td>
           	 <td>
               <input type="text" id="fld_amtallow" class="entryFields" name="fld_amtallow" maxlength="9" size="9" value="${BEAN.fld_amtallow}"/>
             </td>
             <td><label>Allow:</label></td>
           	 <td>
               <input type="text" id="fld_amtallow" class="entryFields" name="fld_amtallow" maxlength="9" size="9" value="${BEAN.fld_amtallow}"/>
             </td>
             <td><label>Paid Date:</label></td>
           	 <td>
               <input type="text" id="fld_ymdpaid" class="entryFields" name="fld_ymdpaid" maxlength="8" size="8" value="${BEAN.fld_ymdpaid}"/>
             </td>
        </tr>

        <tr>
          <td><label>Deny:</label></td>
           <td>
            <input type="text" id="fld_amtdeny" class="entryFields" name="fld_amtdeny" maxlength="9" size="9" value="${BEAN.fld_amtdeny}"/>
          </td>
          <td><label>Deny:</label></td>
           <td>
            <input type="text" id="fld_amtdeny" class="entryFields" name="fld_amtdeny" maxlength="9" size="9" value="${BEAN.fld_amtdeny}"/>
          </td>
          <td><label>Check No:</label></td>
           <td>
            <input type="text" id="fld_bank_check_nbr" class="entryFields" name="fld_bank_check_nbr" maxlength="12" size="12" value="${BEAN.fld_bank_check_nbr}"/>
          </td>
        </tr>

        <tr>
          <td><label>Discount:</label></td>
           <td>
            <input type="text" id="fld_amtdiscount" class="entryFields" name="fld_amtdiscount" maxlength="9" size="9" value="${BEAN.fld_amtdiscount}"/>
          </td>
          <td><label>Discount:</label></td>
           <td>
            <input type="text" id="fld_amtdiscount" class="entryFields" name="fld_amtdiscount" maxlength="9" size="9" value="${BEAN.fld_amtdiscount}"/>
          </td>
          <td><label>Previous Check No:</label></td>
           <td>
            <input type="text" id="fld_prior_check_nbr" class="entryFields" name="fld_prior_check_nbr" maxlength="12" size="12" value="${BEAN.fld_prior_check_nbr}"/>
          </td>
        </tr>

        <tr>
          <td><label>Risk:</label></td>
           <td>
            <input type="text" id="fld_amtrisk" class="entryFields" name="fld_amtrisk" maxlength="9" size="9" value="${BEAN.fld_amtrisk}"/>
          </td>
          <td><label>Risk:</label></td>
           <td>
            <input type="text" id="fld_amtrisk" class="entryFields" name="fld_amtrisk" maxlength="9" size="9" value="${BEAN.fld_amtrisk}"/>
          </td>
          <td><label>Trace:</label></td>
           <td>
            <input type="text" id="fld_trace_nbr" class="entryFields" name="fld_trace_nbr" maxlength="9" size="9" value="${BEAN.fld_trace_nbr}"/>
          </td>
        </tr>

        <tr>
          <td><label>TPP:</label></td>
           <td>
            <input type="text" id="fld_amttpp" class="entryFields" name="fld_amttpp" maxlength="9" size="9" value="${BEAN.fld_amttpp}"/>
          </td>
          <td><label>TPP:</label></td>
           <td>
            <input type="text" id="fld_amttpp" class="entryFields" name="fld_amttpp" maxlength="9" size="9" value="${BEAN.fld_amttpp}"/>
          </td>
          <td><label>Trans Date:</label></td>
           <td>
            <input type="text" id="fld_ymdtrans" class="entryFields" name="fld_ymdtrans" maxlength="8" size="8" value="${BEAN.fld_ymdtrans}"/>
          </td>
        </tr>

        <tr>
          <td><label>Medicare Paid:</label></td>
           <td>
            <input type="text" id="fld_amtpay_m" class="entryFields" name="fld_amtpay_m" maxlength="14" size="14" value="${BEAN.fld_amtpay_m}"/>
          </td>
          <td><label>Medicare Paid:</label></td>
           <td>
            <input type="text" id="fld_amtpay_m" class="entryFields" name="fld_amtpay_m" maxlength="14" size="14" value="${BEAN.fld_amtpay_m}"/>
          </td>
          <td><label>Paid Flag:</label></td>
           <td>
            <input type="text" id="fld_paid" class="entryFields" name="fld_paid" maxlength="2" size="2" value="${BEAN.fld_paid}"/>
          </td>
        </tr>

        <tr>
          <td><label>Paid:</label></td>
           <td>
            <input type="text" id="fld_amtpay" class="entryFields" name="fld_amtpay" maxlength="2" size="2" value="${BEAN.fld_amtpay}"/>
          </td>
          <td><label>Paid:</label></td>
           <td>
            <input type="text" id="fld_amtpay" class="entryFields" name="fld_amtpay" maxlength="2" size="2" value="${BEAN.fld_amtpay}"/>
          </td>
          <td><label>Payto:</label></td>
           <td>
            <input type="text" id="fld_payto" class="entryFields" name="fld_payto" maxlength="2" size="2" value="${BEAN.fld_payto}"/>
          </td>
        </tr>

        <tr>
          <td><label>Coinsurance:</label></td>
           <td>
            <input type="text" id="fld_amtcoins" class="entryFields" name="fld_amtcoins" maxlength="9" size="9" value="${BEAN.fld_amtcoins}"/>
          </td>
          <td><label>Coinsurance:</label></td>
           <td>
            <input type="text" id="fld_amtcoins" class="entryFields" name="fld_amtcoins" maxlength="9" size="9" value="${BEAN.fld_amtcoins}"/>
          </td>
          <td><label>In/Out Network:</label></td>
           <td>
            <input type="text" id="fld_payto" class="entryFields" name="fld_payto" maxlength="10" size="10" value="${BEAN.fld_payto}"/>
          </td>
        </tr>

        <tr>
          <td><label>Copay:</label></td>
           <td>
            <input type="text" id="fld_amtcopay" class="entryFields" name="fld_amtcopay" maxlength="9" size="9" value="${BEAN.fld_amtcopay}"/>
          </td>
          <td><label>Copay:</label></td>
           <td>
            <input type="text" id="fld_amtcopay" class="entryFields" name="fld_amtcopay" maxlength="9" size="9" value="${BEAN.fld_amtcopay}"/>
          </td>
          <td><label>Member:</label></td>
           <td>
            <input type="text" id="fld_member_nbr" class="entryFields" name="fld_member_nbr" maxlength="12" size="12" value="${BEAN.fld_member_nbr}"/>
          </td>
        </tr>

        <tr>
          <td><label>Deductible:</label></td>
           <td>
            <input type="text" id="fld_amtdeduct" class="entryFields" name="fld_amtdeduct" maxlength="9" size="9" value="${BEAN.fld_amtdeduct}"/>
          </td>
          <td><label>Deductible:</label></td>
           <td>
            <input type="text" id="fld_amtdeduct" class="entryFields" name="fld_amtdeduct" maxlength="9" size="9" value="${BEAN.fld_amtdeduct}"/>
          </td>
          <td><label>Affiliation:</label></td>
           <td>
            <input type="text" id="fld_aff_nbr" class="entryFields" name="fld_aff_nbr" maxlength="16" size="16" value="${BEAN.fld_aff_nbr}"/>
          </td>
        </tr>

        <tr>
          <td><label>Write Off:</label></td>
           <td>
            <input type="text" id="fld_amtwrite_off" class="entryFields" name="fld_amtwrite_off" maxlength="9" size="9" value="${BEAN.fld_amtwrite_off}"/>
          </td>
          <td><label>Write Off:</label></td>
           <td>
            <input type="text" id="fld_amtwrite_off" class="entryFields" name="fld_amtwrite_off" maxlength="9" size="9" value="${BEAN.fld_amtwrite_off}"/>
          </td>
          <td><label>Other Adjust Ind:</label></td>
           <td>
            <input type="text" id="fld_other_adj_ind" class="entryFields" name="fld_other_adj_ind" maxlength="2" size="2" value="${BEAN.fld_other_adj_ind}"/>
          </td>
        </tr>

        <tr>
          <td><label>Other Adjustment:</label></td>
           <td>
            <input type="text" id="fld_amtother_adj" class="entryFields" name="fld_amtother_adj" maxlength="9" size="9" value="${BEAN.fld_amtother_adj}"/>
          </td>
          <td><label>Other Adjustment:</label></td>
           <td>
            <input type="text" id="fld_amtother_adj" class="entryFields" name="fld_amtother_adj" maxlength="9" size="9" value="${BEAN.fld_amtother_adj}"/>
          </td>
        </tr>

        <tr>
          <td><label>Allow B:</label></td>
           <td>
            <input type="text" id="fld_amtwrite_off" class="entryFields" name="fld_amtwrite_off" maxlength="9" size="9" value="${BEAN.fld_amtwrite_off}"/>
          </td>
          <td><label>Allow B:</label></td>
           <td>
            <input type="text" id="fld_amtwrite_off" class="entryFields" name="fld_amtwrite_off" maxlength="9" size="9" value="${BEAN.fld_amtwrite_off}"/>
          </td>
        </tr>

        <tr>
          <td><label>HRA Coinsurance:</label></td>
           <td>
            <input type="text" id="fld_hra_amtcoins" class="entryFields" name="fld_hra_amtcoins" maxlength="9" size="9" value="${BEAN.fld_hra_amtcoins}"/>
          </td>
          <td><label>HRA Coinsurance:</label></td>
           <td>
            <input type="text" id="fld_hra_amtcoins" class="entryFields" name="fld_hra_amtcoins" maxlength="9" size="9" value="${BEAN.fld_hra_amtcoins}"/>
          </td>
        </tr>

        <tr>
          <td><label>HRA Copay:</label></td>
           <td>
            <input type="text" id="fld_hra_amtcopay" class="entryFields" name="fld_hra_amtcopay" maxlength="9" size="9" value="${BEAN.fld_hra_amtcopay}"/>
          </td>
          <td><label>HRA Copay:</label></td>
           <td>
            <input type="text" id="fld_hra_amtcopay" class="entryFields" name="fld_hra_amtcopay" maxlength="9" size="9" value="${BEAN.fld_hra_amtcopay}"/>
          </td>
        </tr>

        <tr>
          <td><label>HRA Deductible:</label></td>
           <td>
            <input type="text" id="fld_hra_amtdeduct" class="entryFields" name="fld_hra_amtdeduct" maxlength="9" size="9" value="${BEAN.fld_hra_amtdeduct}"/>
          </td>
          <td><label>HRA Deductible:</label></td>
           <td>
            <input type="text" id="fld_hra_amtdeduct" class="entryFields" name="fld_hra_amtdeduct" maxlength="9" size="9" value="${BEAN.fld_hra_amtdeduct}"/>
          </td>
        </tr>
        </table>
        </div>
        </div>
</body>
</html>
