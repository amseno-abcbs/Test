package com.arbcbs.surround.valueobject;

import com.arbcbs.framework.persistence.CoreRecord;

public class ServiceBal extends CoreRecord{
	public String tableName="SERVICE_BAL";
	/*Oracle Table layout. This comment section is only for reference. The keywords like NUMBER, CHAR may change from one database to another database
	describe SERVICE_BAL

Name            Null    Type      
--------------- -------- --------- 
SERV_NBR        NOT NULL CHAR(18)  
CLAIM_NBR       NOT NULL CHAR(12)  
BANK            NOT NULL CHAR(2)   
BUSINESS_UNIT   NOT NULL CHAR(2)   
PROG_NBR        NOT NULL CHAR(2)   
CARRIER         NOT NULL CHAR(2)   
REGION          NOT NULL CHAR(2)   
DIVISION_NBR    NOT NULL CHAR(10)  
MEMBER_NBR      NOT NULL CHAR(12)  
AMTCHARGE       NOT NULL NUMBER(9) 
AMTALLOW        NOT NULL NUMBER(9) 
AMTDENY         NOT NULL NUMBER(9) 
AMTDISCOUNT     NOT NULL NUMBER(9) 
AMTRISK         NOT NULL NUMBER(9) 
AMTTPP          NOT NULL NUMBER(9) 
AMTPAY_M        NOT NULL NUMBER(9) 
AMTPAY          NOT NULL NUMBER(9) 
AMTCOPAY        NOT NULL NUMBER(9) 
AMTCOINS        NOT NULL NUMBER(9) 
AMTDEDUCT       NOT NULL NUMBER(9) 
AMTINTEREST     NOT NULL NUMBER(9) 
AMTWRITE_OFF    NOT NULL NUMBER(9) 
AMTMEM_RESP     NOT NULL NUMBER(9) 
AMTPROV_RESP    NOT NULL NUMBER(9) 
AMTOTHER_ADJ    NOT NULL NUMBER(9) 
OTHER_ADJ_IND   NOT NULL CHAR(2)   
PAID            NOT NULL CHAR(2)   
PAYTO           NOT NULL CHAR(2)   
PROC_NBR        NOT NULL CHAR(12)  
STATUS_X        NOT NULL CHAR(2)   
EX_ARRAY        NOT NULL CHAR(12)  
AMTTYPE_ARRAY   NOT NULL CHAR(12)  
ANSI_CAGC_ARRAY NOT NULL CHAR(12)  
ANSI_CARC_ARRAY NOT NULL CHAR(24)  
ANSI_RARC_ARRAY NOT NULL CHAR(30)  
AFF_NPI         NOT NULL CHAR(10)  
PRAC_NBR        NOT NULL CHAR(4)   
AFF_NBR         NOT NULL CHAR(16)  
HRA_AMTCOPAY    NOT NULL NUMBER(9) 
HRA_AMTCOINS    NOT NULL NUMBER(9) 
HRA_AMTDEDUCT   NOT NULL NUMBER(9) 
ALTCL_AMTPAY    NOT NULL NUMBER(9) 
ALTCL_AMTPAY_M  NOT NULL NUMBER(9) 
ALTCL_AMTALLOW  NOT NULL NUMBER(9) 
ALTPOLICY_NBR   NOT NULL CHAR(16)  
YMDEFF          NOT NULL NUMBER(8) 
YMDEND          NOT NULL NUMBER(8) 
YMDPAID         NOT NULL NUMBER(8) 
YMDTRANS        NOT NULL NUMBER(8) 
BANK_CHECK_NBR  NOT NULL CHAR(12)  
PRIOR_CHECK_NBR NOT NULL CHAR(12)  
TRACE_NBR       NOT NULL NUMBER(9) 
CLAIM_PAID      NOT NULL CHAR(2)   

	*/
	
	//*** field names
	private String SERV_NBR=" ";
	private String CLAIM_NBR=" ";
	private String BANK=" ";
	private String BUSINESS_UNIT=" ";
	private String PROG_NBR=" ";
	private String CARRIER=" ";
	private String REGION=" ";
	private String DIVISION_NBR=" ";
	private String MEMBER_NBR=" ";
	private long   AMTCHARGE;
	private long   AMTALLOW;
	private long   AMTDENY;
	private long   AMTDISCOUNT;
	private long   AMTRISK;
	private long   AMTTPP;
	private long   AMTPAY_M;
	private long   AMTPAY;
	private long   AMTCOPAY;
	private long   AMTCOINS;
	private long   AMTDEDUCT;
	private long   AMTINTEREST;
	private long   AMTWRITE_OFF;
	private long   AMTMEM_RESP;
	private long   AMTPROV_RESP;
	private long   AMTOTHER_ADJ;
	private String OTHER_ADJ_IND=" ";
	private String PAID=" ";
	private String PAYTO=" ";
	private String PROC_NBR=" ";
	private String STATUS_X=" ";
	private String EX_ARRAY=" ";
	private String AMTTYPE_ARRAY=" ";
	private String ANSI_CAGC_ARRAY=" ";
	private String ANSI_CARC_ARRAY=" ";
	private String ANSI_RARC_ARRAY=" ";
	private String AFF_NPI=" ";
	private String PRAC_NBR=" ";
	private String AFF_NBR=" ";
	private long   HRA_AMTCOPAY;
	private long   HRA_AMTCOINS;
	private long   HRA_AMTDEDUCT;
	private long   ALTCL_AMTPAY;
	private long   ALTCL_AMTPAY_M;
	private long   ALTCL_AMTALLOW;
	private String ALTPOLICY_NBR=" ";
	private long   YMDEFF;
	private long   YMDEND;
	private long   YMDPAID;
	private long   YMDTRANS;
	private String BANK_CHECK_NBR=" ";
	private String PRIOR_CHECK_NBR=" ";
	private long   TRACE_NBR;
	private String CLAIM_PAID=" ";
	
	//*** field lengths
	public static final byte Length_SERV_NBR=18;
	public static final byte Length_CLAIM_NBR=12;
	public static final byte Length_BANK=2;
	public static final byte Length_BUSINESS_UNIT=2;
	public static final byte Length_PROG_NBR=2;
	public static final byte Length_CARRIER=2;
	public static final byte Length_REGION=2;
	public static final byte Length_DIVISION_NBR=10;
	public static final byte Length_MEMBER_NBR=12;
	public static final byte Length_AMTCHARGE=9;
	public static final byte Length_AMTALLOW=9;
	public static final byte Length_AMTDENY=9;
	public static final byte Length_AMTDISCOUNT=9;
	public static final byte Length_AMTRISK=9;
	public static final byte Length_AMTTPP=9;
	public static final byte Length_AMTPAY_M=9;
	public static final byte Length_AMTPAY=9;
	public static final byte Length_AMTCOPAY=9;
	public static final byte Length_AMTCOINS=9;
	public static final byte Length_AMTDEDUCT=9;
	public static final byte Length_AMTINTEREST=9;
	public static final byte Length_AMTWRITE_OFF=9;
	public static final byte Length_AMTMEM_RESP=9;
	public static final byte Length_AMTPROV_RESP=9;
	public static final byte Length_AMTOTHER_ADJ=9;
	public static final byte Length_OTHER_ADJ_IND=2;
	public static final byte Length_PAID=2;
	public static final byte Length_PAYTO=2;
	public static final byte Length_PROC_NBR=12;
	public static final byte Length_STATUS_X=2;
	public static final byte Length_EX_ARRAY=12;
	public static final byte Length_AMTTYPE_ARRAY=12;
	public static final byte Length_CAGC_ARRAY=12;
	public static final byte Length_CARC_ARRAY=24;
	public static final byte Length_RARC_ARRAY=30;
	public static final byte Length_AFF_NPI=10;
	public static final byte Length_PRAC_NBR=4;
	public static final byte Length_AFF_NBR=16;
	public static final byte Length_HRA_AMTCOPAY=9;
	public static final byte Length_HRA_AMTCOINS=9;
	public static final byte Length_HRA_AMTDEDUCT=9;
	public static final byte Length_ALTCL_AMTPAY=9;
	public static final byte Length_ALTCL_AMTPAY_M=9;
	public static final byte Length_ALTCL_AMTALLOW=9;
	public static final byte Length_ALTPOLICY_NBR=16;
	public static final byte Length_YMDEFF=8;
	public static final byte Length_YMDEND=8;
	public static final byte Length_YMDPAID=8;
	public static final byte Length_YMDTRANS=8;
	public static final byte Length_BANK_CHECK_NBR=12;
	public static final byte Length_PRIOR_CHECK_NBR=12;
	public static final byte Length_TRACE_NBR=9;
	public static final byte Length_CLAIM_PAID=2;	

	// Getters and setters
	public long getIMAGE_RECNBR() {
		return IMAGE_RECNBR;
	}
	public void setIMAGE_RECNBR(long iMAGERECNBR) {
		IMAGE_RECNBR = iMAGERECNBR;
	}
	public String getCLAIM_NBR() {
		return CLAIM_NBR;
	}
	public void setCLAIM_NBR(String cLAIMNBR) {
		CLAIM_NBR = cLAIMNBR;
	}
	public String getSERV_NBR() {
		return SERV_NBR;
	}
	public void setSERV_NBR(String sERVNBR) {
		SERV_NBR = sERVNBR;
	}
	public String getMEMBER_NBR() {
		return MEMBER_NBR;
	}
	public void setMEMBER_NBR(String mEMBERNBR) {
		MEMBER_NBR = mEMBERNBR;
	}
	public String getACCEPTASSIGN() {
		return ACCEPTASSIGN;
	}
	public void setACCEPTASSIGN(String aCCEPTASSIGN) {
		ACCEPTASSIGN = aCCEPTASSIGN;
	}
	public String getACTION_TRIGGER() {
		return ACTION_TRIGGER;
	}
	public void setACTION_TRIGGER(String aCTIONTRIGGER) {
		ACTION_TRIGGER = aCTIONTRIGGER;
	}
	public String getAFF_NBR() {
		return AFF_NBR;
	}
	public void setAFF_NBR(String aFFNBR) {
		AFF_NBR = aFFNBR;
	}
	public long getAGE() {
		return AGE;
	}
	public void setAGE(long aGE) {
		AGE = aGE;
	}
	public long getAMTALLOW() {
		return AMTALLOW;
	}
	public void setAMTALLOW(long aMTALLOWB) {
		AMTALLOW = aMTALLOWB;
	}
	public long getAMTALLOW_M() {
		return AMTALLOW_M;
	}
	public void setAMTALLOW_M(long aMTALLOWM) {
		AMTALLOW_M = aMTALLOWM;
	}
	public long getAMTALLOW_P() {
		return AMTALLOW_P;
	}
	public void setAMTALLOW_P(long aMTALLOWP) {
		AMTALLOW_P = aMTALLOWP;
	}
	public long getAMTBENEFIT() {
		return AMTBENEFIT;
	}
	public void setAMTBENEFIT(long aMTBENEFIT) {
		AMTBENEFIT = aMTBENEFIT;
	}
	public long getAMTCHARGE() {
		return AMTCHARGE;
	}
	public void setAMTCHARGE(long aMTCHARGE) {
		AMTCHARGE = aMTCHARGE;
	}
	public long getAMTCOINS() {
		return AMTCOINS;
	}
	public void setAMTCOINS(long aMTCOINS) {
		AMTCOINS = aMTCOINS;
	}
	public long getAMTCOPAY() {
		return AMTCOPAY;
	}
	public void setAMTCOPAY(long aMTCOPAY) {
		AMTCOPAY = aMTCOPAY;
	}
	public long getAMTDEDUCT() {
		return AMTDEDUCT;
	}
	public void setAMTDEDUCT(long aMTDEDUCT) {
		AMTDEDUCT = aMTDEDUCT;
	}
	public long getAMTDENY() {
		return AMTDENY;
	}
	public void setAMTDENY(long aMTDENYB) {
		AMTDENY = aMTDENYB;
	}
	public long getAMTDENY_P() {
		return AMTDENY_P;
	}
	public void setAMTDENY_P(long aMTDENYP) {
		AMTDENY_P = aMTDENYP;
	}
	public long getAMTDISCOUNT() {
		return AMTDISCOUNT;
	}
	public void setAMTDISCOUNT(long aMTDISCOUNT) {
		AMTDISCOUNT = aMTDISCOUNT;
	}
	public long getAMTFFS() {
		return AMTFFS;
	}
	public void setAMTFFS(long aMTFFS) {
		AMTFFS = aMTFFS;
	}
	public long getAMTFUND() {
		return AMTFUND;
	}
	public void setAMTFUND(long aMTFUND) {
		AMTFUND = aMTFUND;
	}
	public long getAMTINTEREST() {
		return AMTINTEREST;
	}
	public void setAMTINTEREST(long aMTINTEREST) {
		AMTINTEREST = aMTINTEREST;
	}
	public long getAMTLSF() {
		return AMTLSF;
	}
	public void setAMTLSF(long aMTLSF) {
		AMTLSF = aMTLSF;
	}
	public long getAMTPAY() {
		return AMTPAY;
	}
	public void setAMTPAY(long aMTPAY) {
		AMTPAY = aMTPAY;
	}
	public long getAMTPAY_M() {
		return AMTPAY_M;
	}
	public void setAMTPAY_M(long aMTPAYM) {
		AMTPAY_M = aMTPAYM;
	}
	public long getAMTPAY_M_APPLY() {
		return AMTPAY_M_APPLY;
	}
	public void setAMTPAY_M_APPLY(long aMTPAYMAPPLY) {
		AMTPAY_M_APPLY = aMTPAYMAPPLY;
	}
	public long getAMTPENALTY() {
		return AMTPENALTY;
	}
	public void setAMTPENALTY(long aMTPENALTY) {
		AMTPENALTY = aMTPENALTY;
	}
	public long getAMTPPD() {
		return AMTPPD;
	}
	public void setAMTPPD(long aMTPPD) {
		AMTPPD = aMTPPD;
	}
	public long getAMTREIM_COB() {
		return AMTREIM_COB;
	}
	public void setAMTREIM_COB(long aMTREIMCOB) {
		AMTREIM_COB = aMTREIMCOB;
	}
	public long getAMTRISK() {
		return AMTRISK;
	}
	public void setAMTRISK(long aMTRISK) {
		AMTRISK = aMTRISK;
	}
	public long getAMTSAVING() {
		return AMTSAVING;
	}
	public void setAMTSAVING(long aMTSAVING) {
		AMTSAVING = aMTSAVING;
	}
	public long getAMTSAVING_COB() {
		return AMTSAVING_COB;
	}
	public void setAMTSAVING_COB(long aMTSAVINGCOB) {
		AMTSAVING_COB = aMTSAVINGCOB;
	}
	public long getAMTTPP() {
		return AMTTPP;
	}
	public void setAMTTPP(long aMTTPP) {
		AMTTPP = aMTTPP;
	}
	public long getAMTTPP_APPLY() {
		return AMTTPP_APPLY;
	}
	public void setAMTTPP_APPLY(long aMTTPPAPPLY) {
		AMTTPP_APPLY = aMTTPPAPPLY;
	}
	public String getAREA() {
		return AREA;
	}
	public void setAREA(String aREA) {
		AREA = aREA;
	}
	public String getAUTHORIZATION_NBR() {
		return AUTHORIZATION_NBR;
	}
	public void setAUTHORIZATION_NBR(String aUTHORIZATIONNBR) {
		AUTHORIZATION_NBR = aUTHORIZATIONNBR;
	}
	public String getBENEFIT() {
		return BENEFIT;
	}
	public void setBENEFIT(String bENEFIT) {
		BENEFIT = bENEFIT;
	}
	public String getBENEFIT_PKG() {
		return BENEFIT_PKG;
	}
	public void setBENEFIT_PKG(String bENEFITPKG) {
		BENEFIT_PKG = bENEFITPKG;
	}
	public String getBUSINESS_UNIT() {
		return BUSINESS_UNIT;
	}
	public void setBUSINESS_UNIT(String bUSINESSUNIT) {
		BUSINESS_UNIT = bUSINESSUNIT;
	}
	public String getBYPASS() {
		return BYPASS;
	}
	public void setBYPASS(String bYPASS) {
		BYPASS = bYPASS;
	}
	public String getCARRIER() {
		return CARRIER;
	}
	public void setCARRIER(String cARRIER) {
		CARRIER = cARRIER;
	}
	public String getCLAIM_TYPE() {
		return CLAIM_TYPE;
	}
	public void setCLAIM_TYPE(String cLAIMTYPE) {
		CLAIM_TYPE = cLAIMTYPE;
	}
	public String getCOMPONENT() {
		return COMPONENT;
	}
	public void setCOMPONENT(String cOMPONENT) {
		COMPONENT = cOMPONENT;
	}
	public long getCOUNT_X() {
		return COUNT_X;
	}
	public void setCOUNT_X(long cOUNTX) {
		COUNT_X = cOUNTX;
	}
	public long getDAYS() {
		return DAYS;
	}
	public void setDAYS(long dAYS) {
		DAYS = dAYS;
	}
	public long getDAYSDENY() {
		return DAYSDENY;
	}
	public void setDAYSDENY(long dAYSDENY) {
		DAYSDENY = dAYSDENY;
	}
	public String getDIAG_NBR() {
		return DIAG_NBR;
	}
	public void setDIAG_NBR(String dIAGNBR) {
		DIAG_NBR = dIAGNBR;
	}
	public String getDIAG2_NBR() {
		return DIAG2_NBR;
	}
	public void setDIAG2_NBR(String dIAG2NBR) {
		DIAG2_NBR = dIAG2NBR;
	}
	public String getDIAG3_NBR() {
		return DIAG3_NBR;
	}
	public void setDIAG3_NBR(String dIAG3NBR) {
		DIAG3_NBR = dIAG3NBR;
	}
	public String getDIAG4_NBR() {
		return DIAG4_NBR;
	}
	public void setDIAG4_NBR(String dIAG4NBR) {
		DIAG4_NBR = dIAG4NBR;
	}
	public String getDISCHARGE() {
		return DISCHARGE;
	}
	public void setDISCHARGE(String dISCHARGE) {
		DISCHARGE = dISCHARGE;
	}
	public String getDISCHG_PLAN_NBR() {
		return DISCHG_PLAN_NBR;
	}
	public void setDISCHG_PLAN_NBR(String dISCHGPLANNBR) {
		DISCHG_PLAN_NBR = dISCHGPLANNBR;
	}
	public String getDIVISION_NBR() {
		return DIVISION_NBR;
	}
	public void setDIVISION_NBR(String dIVISIONNBR) {
		DIVISION_NBR = dIVISIONNBR;
	}
	public String getEMERG_IND() {
		return EMERG_IND;
	}
	public void setEMERG_IND(String eMERGIND) {
		EMERG_IND = eMERGIND;
	}
	public String getEPISODE_NBR() {
		return EPISODE_NBR;
	}
	public void setEPISODE_NBR(String ePISODENBR) {
		EPISODE_NBR = ePISODENBR;
	}
	public String getEX_ARRAY() {
		return EX_ARRAY;
	}
	public void setEX_ARRAY(String eXARRAY) {
		EX_ARRAY = eXARRAY;
	}
	public String getFEESCHED() {
		return FEESCHED;
	}
	public void setFEESCHED(String fEESCHED) {
		FEESCHED = fEESCHED;
	}
	public String getILLNESS() {
		return ILLNESS;
	}
	public void setILLNESS(String iLLNESS) {
		ILLNESS = iLLNESS;
	}
	public String getINSURANCE() {
		return INSURANCE;
	}
	public void setINSURANCE(String iNSURANCE) {
		INSURANCE = iNSURANCE;
	}
	public long getLINE_CTR() {
		return LINE_CTR;
	}
	public void setLINE_CTR(long lINECTR) {
		LINE_CTR = lINECTR;
	}
	public String getLOCATION() {
		return LOCATION;
	}
	public void setLOCATION(String lOCATION) {
		LOCATION = lOCATION;
	}
	public long getMINUTES() {
		return MINUTES;
	}
	public void setMINUTES(long mINUTES) {
		MINUTES = mINUTES;
	}
	public String getMODIFIER() {
		return MODIFIER;
	}
	public void setMODIFIER(String mODIFIER) {
		MODIFIER = mODIFIER;
	}
	public String getMODIFIER2() {
		return MODIFIER2;
	}
	public void setMODIFIER2(String mODIFIER2) {
		MODIFIER2 = mODIFIER2;
	}
	public String getMODIFIER3() {
		return MODIFIER3;
	}
	public void setMODIFIER3(String mODIFIER3) {
		MODIFIER3 = mODIFIER3;
	}
	public String getMODIFIER4() {
		return MODIFIER4;
	}
	public void setMODIFIER4(String mODIFIER4) {
		MODIFIER4 = mODIFIER4;
	}
	public String getOP_NBR() {
		return OP_NBR;
	}
	public void setOP_NBR(String oPNBR) {
		OP_NBR = oPNBR;
	}
	public String getPAID() {
		return PAID;
	}
	public void setPAID(String pAID) {
		PAID = pAID;
	}
	public long getPAIDEQ_BITS() {
		return PAIDEQ_BITS;
	}
	public void setPAIDEQ_BITS(long pAIDEQBITS) {
		PAIDEQ_BITS = pAIDEQBITS;
	}
	public String getPAY_SERVICE() {
		return PAY_SERVICE;
	}
	public void setPAY_SERVICE(String pAYSERVICE) {
		PAY_SERVICE = pAYSERVICE;
	}
	public String getPAYTO() {
		return PAYTO;
	}
	public void setPAYTO(String pAYTO) {
		PAYTO = pAYTO;
	}
	public String getPCP_AFF_NBR() {
		return PCP_AFF_NBR;
	}
	public void setPCP_AFF_NBR(String pCPAFFNBR) {
		PCP_AFF_NBR = pCPAFFNBR;
	}
	public String getPCP_AREA() {
		return PCP_AREA;
	}
	public void setPCP_AREA(String pCPAREA) {
		PCP_AREA = pCPAREA;
	}
	public long getPLUS_UNITS() {
		return PLUS_UNITS;
	}
	public void setPLUS_UNITS(long pLUSUNITS) {
		PLUS_UNITS = pLUSUNITS;
	}
	public String getPROC_NBR() {
		return PROC_NBR;
	}
	public void setPROC_NBR(String pROCNBR) {
		PROC_NBR = pROCNBR;
	}
	public String getPROC_CLASS() {
		return PROC_CLASS;
	}
	public void setPROC_CLASS(String pROCCLASS) {
		PROC_CLASS = pROCCLASS;
	}
	public String getPROC2_NBR() {
		return PROC2_NBR;
	}
	public void setPROC2_NBR(String pROC2NBR) {
		PROC2_NBR = pROC2NBR;
	}
	public String getPROG_NBR() {
		return PROG_NBR;
	}
	public void setPROG_NBR(String pROGNBR) {
		PROG_NBR = pROGNBR;
	}
	public String getREF_AFF_NBR() {
		return REF_AFF_NBR;
	}
	public void setREF_AFF_NBR(String rEFAFFNBR) {
		REF_AFF_NBR = rEFAFFNBR;
	}
	public String getREGION() {
		return REGION;
	}
	public void setREGION(String rEGION) {
		REGION = rEGION;
	}
	public String getREGION_AFF_NBR() {
		return REGION_AFF_NBR;
	}
	public void setREGION_AFF_NBR(String rEGIONAFFNBR) {
		REGION_AFF_NBR = rEGIONAFFNBR;
	}
	public String getRIDER_TITLE() {
		return RIDER_TITLE;
	}
	public void setRIDER_TITLE(String rIDERTITLE) {
		RIDER_TITLE = rIDERTITLE;
	}
	public String getRISKPOP() {
		return RISKPOP;
	}
	public void setRISKPOP(String rISKPOP) {
		RISKPOP = rISKPOP;
	}
	public long getSERV_BITS() {
		return SERV_BITS;
	}
	public void setSERV_BITS(long sERVBITS) {
		SERV_BITS = sERVBITS;
	}
	public String getSEX() {
		return SEX;
	}
	public void setSEX(String sEX) {
		SEX = sEX;
	}
	public String getSPEC_PROG() {
		return SPEC_PROG;
	}
	public void setSPEC_PROG(String sPECPROG) {
		SPEC_PROG = sPECPROG;
	}
	public String getSTATUS_X() {
		return STATUS_X;
	}
	public void setSTATUS_X(String sTATUSX) {
		STATUS_X = sTATUSX;
	}
	public String getTPSTAT() {
		return TPSTAT;
	}
	public void setTPSTAT(String tPSTAT) {
		TPSTAT = tPSTAT;
	}
	public String getTRANSCODE() {
		return TRANSCODE;
	}
	public void setTRANSCODE(String tRANSCODE) {
		TRANSCODE = tRANSCODE;
	}
	public String getTREATMENT_TYPE() {
		return TREATMENT_TYPE;
	}
	public void setTREATMENT_TYPE(String tREATMENTTYPE) {
		TREATMENT_TYPE = tREATMENTTYPE;
	}
	public long getYMDCLEAN() {
		return YMDCLEAN;
	}
	public void setYMDCLEAN(long yMDCLEAN) {
		YMDCLEAN = yMDCLEAN;
	}
	public String getYMDCLEAN_OV_FLAG() {
		return YMDCLEAN_OV_FLAG;
	}
	public void setYMDCLEAN_OV_FLAG(String yMDCLEANOVFLAG) {
		YMDCLEAN_OV_FLAG = yMDCLEANOVFLAG;
	}
	public long getYMDDUE() {
		return YMDDUE;
	}
	public void setYMDDUE(long yMDDUE) {
		YMDDUE = yMDDUE;
	}
	public long getYMDEFF() {
		return YMDEFF;
	}
	public void setYMDEFF(long yMDEFF) {
		YMDEFF = yMDEFF;
	}
	public long getYMDEND() {
		return YMDEND;
	}
	public void setYMDEND(long yMDEND) {
		YMDEND = yMDEND;
	}
	public long getYMDENTERED() {
		return YMDENTERED;
	}
	public void setYMDENTERED(long yMDENTERED) {
		YMDENTERED = yMDENTERED;
	}
	public long getYMDINIT() {
		return YMDINIT;
	}
	public void setYMDINIT(long yMDINIT) {
		YMDINIT = yMDINIT;
	}
	public long getYMDPAID() {
		return YMDPAID;
	}
	public void setYMDPAID(long yMDPAID) {
		YMDPAID = yMDPAID;
	}
	public long getYMDRCVD() {
		return YMDRCVD;
	}
	public void setYMDRCVD(long yMDRCVD) {
		YMDRCVD = yMDRCVD;
	}
	public long getYMDTRANS() {
		return YMDTRANS;
	}
	public void setYMDTRANS(long yMDTRANS) {
		YMDTRANS = yMDTRANS;
	}
	public long getCHECKSUM_VALUE() {
		return CHECKSUM_VALUE;
	}
	public void setCHECKSUM_VALUE(long cHECKSUMVALUE) {
		CHECKSUM_VALUE = cHECKSUMVALUE;
	}
	public String getORIG_MODIFIER1() {
		return ORIG_MODIFIER1;
	}
	public void setORIG_MODIFIER1(String oRIGMODIFIER1) {
		ORIG_MODIFIER1 = oRIGMODIFIER1;
	}
	public String getORIG_MODIFIER2() {
		return ORIG_MODIFIER2;
	}
	public void setORIG_MODIFIER2(String oRIGMODIFIER2) {
		ORIG_MODIFIER2 = oRIGMODIFIER2;
	}
	public String getORIG_MODIFIER3() {
		return ORIG_MODIFIER3;
	}
	public void setORIG_MODIFIER3(String oRIGMODIFIER3) {
		ORIG_MODIFIER3 = oRIGMODIFIER3;
	}
	public String getORIG_MODIFIER4() {
		return ORIG_MODIFIER4;
	}
	public void setORIG_MODIFIER4(String oRIGMODIFIER4) {
		ORIG_MODIFIER4 = oRIGMODIFIER4;
	}

	public void copyRecord(CoreRecord cr){
		ServiceBal ServiceBAL_VO=(ServiceBal) cr;
		this.SERV_NBR=ServiceBal_VO.SERV_NBR;
		this.CLAIM_NBR=ServiceBal_VO.CLAIM_NBR;
		this.BANK=ServiceBal_VO.BANK;
		this.BUSINESS_UNIT=ServiceBal_VO.BUSINESS_UNIT;
		this.PROG_NBR=ServiceBal_VO.PROG_NBR;
		this.CARRIER=ServiceBal_VO.CARRIER;
		this.REGION=ServiceBal_VO.REGION;
		this.DIVISION_NBR=ServiceBal_VO.DIVISION_NBR;
		this.MEMBER_NBR=ServiceBal_VO.MEMBER_NBR;
		this.AMTCHARGE=ServiceBal_VO.AMTCHARGE;
		this.AMTALLOW=ServiceBal_VO.AMTALLOW;
		this.AMTDENY=ServiceBal_VO.AMTDENY;
		this.AMTDISCOUNT=ServiceBal_VO.AMTDISCOUNT;
		this.AMTRISK=ServiceBal_VO.AMTRISK;
		this.AMTTPP=ServiceBal_VO.AMTTPP;
		this.AMTPAY_M=ServiceBal_VO.AMTPAY_M;
		this.AMTPAY=ServiceBal_VO.AMTPAY;
		this.AMTCOPAY=ServiceBal_VO.AMTCOPAY;
		this.AMTCOINS=ServiceBal_VO.AMTCOINS;
		this.AMTDEDUCT=ServiceBal_VO.AMTDEDUCT;
		this.AMTINTEREST=ServiceBal_VO.AMTINTEREST;
		this.AMTWRITE_OFF=ServiceBal_VO.AMTWRITE_OFF;
		this.AMTMEM_RESP=ServiceBal_VO.AMTMEM_RESP;
		this.AMTPROV_RESP=ServiceBal_VO.AMTPROV_RESP;
		this.AMTOTHER_ADJ=ServiceBal_VO.AMTOTHER_ADJ;
		this.OTHER_ADJ_IND=ServiceBal_VO.OTHER_ADJ_IND;
		this.PAID=ServiceBal_VO.PAID;
		this.PAYTO=ServiceBal_VO.PAYTO;
		this.PROC_NBR=ServiceBal_VO.PROC_NBR;
		this.STATUS_X=ServiceBal_VO.STATUS_X;
		this.EX_ARRAY=ServiceBal_VO.EX_ARRAY;
		this.AMTTYPE_ARRAY=ServiceBal_VO.AMTTYPE_ARRAY;
		this.ANSI_CAGC_ARRAY=ServiceBal_VO.ANSI_CAGC_ARRAY;
		this.ANSI_CARC_ARRAY=ServiceBal_VO.ANSI_CARC_ARRAY;
		this.ANSI_RARC_ARRAY=ServiceBal_VO.ANSI_RARC_ARRAY;
		this.AFF_NPI=ServiceBal_VO.AFF_NPI;
		this.PRAC_NBR=ServiceBal_VO.PRAC_NBR;
		this.AFF_NBR=ServiceBal_VO.AFF_NBR;
		this.HRA_AMTCOPAY=ServiceBal_VO.HRA_AMTCOPAY;
		this.HRA_AMTCOINS=ServiceBal_VO.HRA_AMTCOINS;
		this.HRA_AMTDEDUCT=ServiceBal_VO.HRA_AMTDEDUCT;
		this.ALTCL_AMTPAY=ServiceBal_VO.ALTCL_AMTPAY;
		this.ALTCL_AMTPAY_M=ServiceBal_VO.ALTCL_AMTPAY_M;
		this.ALTCL_AMTALLOW=ServiceBal_VO.ALTCL_AMTALLOW;
		this.ALTPOLICY_NBR=ServiceBal_VO.ALTPOLICY_NBR;
		this.YMDEFF=ServiceBal_VO.YMDEFF;
		this.YMDEND=ServiceBal_VO.YMDEND;
		this.YMDPAID=ServiceBal_VO.YMDPAID;
		this.YMDTRANS=ServiceBal_VO.YMDTRANS;
		this.BANK_CHECK_NBR=ServiceBal_VO.BANK_CHECK_NBR;
		this.PRIOR_CHECK_NBR=ServiceBal_VO.PRIOR_CHECK_NBR;
		this.TRACE_NBR=ServiceBal_VO.TRACE_NBR;
		this.CLAIM_PAID=ServiceBal_VO.CLAIM_PAID;
	}
 }
