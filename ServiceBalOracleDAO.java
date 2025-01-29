package com.arbcbs.surround.dao.oracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.arbcbs.framework.persistence.CoreRecord;
import com.arbcbs.framework.persistence.OracleDAO;
import com.arbcbs.surround.valueobject.ServiceBal;

public class ServiceBalOracleDAO extends OracleDAO {
	private static final Logger LOGGER=Logger.getLogger(ServiceBalOracleDAO.class);
	/**
	 * returns the set of VO records satisfying the WHERE clause
	 * @return List of core records
	 * @throws Exception 
	 */
	public List<CoreRecord> get() throws Exception{
		ArrayList<CoreRecord> records=new ArrayList<CoreRecord>();
		String query;
		Statement stmt;
		ResultSet rs;
		Connection con=OracleDAO.getDatasource().getConnection();
		query="SELECT * FROM SERVICE_BAL WHERE "+this.getWhereClause();
		stmt=con.createStatement();
		rs=stmt.executeQuery(query);
		while(rs.next()){
			ServiceBal rec=new ServiceBal();
			
			rec.setSERV_NBR(rs.getString(1));
			rec.setCLAIM_NBR(rs.getString(2));
			rec.setBANK(rs.getString(3));
			rec.setBUSINESS_UNIT(rs.getString(4));
			rec.setPROG_NBR(rs.getString(5));
			rec.setCARRIER(rs.getString(6));
			rec.setREGION(rs.getString(7));
			rec.setDIVISION_NBR(rs.getString(8));
			rec.setMEMBER_NBR(rs.getString(9));
			rec.setAMTCHARGE(rs.getLong(10));
			rec.setAMTALLOW(rs.getLong(11));
			rec.setAMTDENY(rs.getLong(12));
			rec.setAMTDISCOUNT(rs.getLong(13));
			rec.setAMTRISK(rs.getLong(14));
			rec.setAMTTPP(rs.getLong(15));
			rec.setAMTPAY_M(rs.getLong(16));
			rec.setAMTPAY(rs.getLong(17));
			rec.setAMTCOINS(rs.getLong(18));
			rec.setAMTCOPAY(rs.getLong(19));
			rec.setAMTDEDUCT(rs.getLong(20));
			rec.setAMTINTEREST(rs.getLong(21));
			rec.setAMTWRITE_OFF(rs.getLong(22));
			rec.setAMTMEM_RESP(rs.getLong(23));
			rec.setAMTPROV_RESP(rs.getLong(24));
			rec.setAMTOTHER_ADJ(rs.getLong(25));
			rec.setOTHER_ADJ_IND(rs.getString(26))
			rec.setPAID(rs.getString(27));
			rec.setPAYTO(rs.getString(28));
			rec.setPROC_NBR(rs.getString(29));
			rec.setSTATUS_X(rs.getString(30));
			rec.setEX_ARRAY(rs.getString(31));
			rec.setAMTTYPE_ARRAY(rs.getString(32));
			rec.setANSI_CAGC_ARRAY(rs.getString(33));
			rec.setANSI_CARC_ARRAY(rs.getString(34));
			rec.setANSI_RARC_ARRAY(rs.getString(35));
			rec.setAFF_NBR_NPI(rs.getString(36));
			rec.setPRAC_NBR(rs.getString(37));
			rec.setAFF_NBR(rs.getString(38));
			rec.setHRA_AMTCOPAY(rs.getLong(39));
			rec.setHRA_AMTCOINS(rs.getLong(40));
			rec.setHRA_DEDUCT(rs.getLong(41));
			rec.setALTCL_AMTPAY(rs.getLong(42));
			rec.setALTCL_AMTPAY_M(rs.getLong(43));
			rec.setALTCL_AMTALLOW(rs.getLong(44));
			rec.setALTTPOLICY_NBR(rs.getString(45));
			rec.setYMDEFF(rs.getLong(46));
			rec.setYMDEND(rs.getLong(47));
			rec.setYMDPAID(rs.getLong(48));
			rec.setYMDTRANS(rs.getLong(49));
			rec.setBANK_CHECK_NBR(rs.getString(50));
			rec.setPRIOR_CHECK_NBR(rs.getString(51));
			rec.setTRACE_NBR(rs.getLong(52));
			rec.setCLAIM_PAID(rs.getString(53));
			records.add(rec);
		}
		rs.close();
		stmt.close();
		con.close();
		
		return records;
	}

	/**
	 * returns count of rows satisfying the WHERE clause
	 * @return no of rows
	 * @throws Exception 
	 */
	public int getCount() throws Exception {
		int count=0;
		String query;
		Statement stmt;
		ResultSet rs;
		Connection con=OracleDAO.getDatasource().getConnection();
		query="SELECT COUNT(*) FROM SERVICE_BAL WHERE "+this.getWhereClause();
		stmt=con.createStatement();
		rs=stmt.executeQuery(query);
		if(rs.next()){
			count = rs.getInt(1);
		}
		rs.close();
		stmt.close();
		con.close();
		
		return count;
	}

	/**
	 * This will return a list of VOs that meet complex search criteria
	 * @param partialQuery the search criteria which can contain WHERE, GROUP BY, HAVING, ORDER BY clauses
	 * @throws Exception 
	 */
	public List<CoreRecord> getComplex(String partialQuery) throws Exception{
		if(partialQuery.indexOf("SELECT") >= 0){
			try {
				throw new Exception();
			} catch (Exception e) {
				LOGGER.fatal("The partial SQL Query passed should not contain SELECT clause");
				e.printStackTrace();
			}
		}
		
		partialQuery = "SELECT * FROM SERVICE_BAL "+partialQuery;
		ArrayList<CoreRecord> records=new ArrayList<CoreRecord>();
		Statement stmt;
		ResultSet rs;
		Connection con=OracleDAO.getDatasource().getConnection();
		stmt=con.createStatement();
		rs=stmt.executeQuery(partialQuery);
		while(rs.next()){
			ServiceBal rec=new ServiceBal();
			
			rec.setSERV_NBR(rs.getString(1));
			rec.setCLAIM_NBR(rs.getString(2));
			rec.setBANK(rs.getString(3));
			rec.setBUSINESS_UNIT(rs.getString(4));
			rec.setPROG_NBR(rs.getString(5));
			rec.setCARRIER(rs.getString(6));
			rec.setREGION(rs.getString(7));
			rec.setDIVISION_NBR(rs.getString(8));
			rec.setMEMBER_NBR(rs.getString(9));
			rec.setAMTCHARGE(rs.getLong(10));
			rec.setAMTALLOW(rs.getLong(11));
			rec.setAMTDENY(rs.getLong(12));
			rec.setAMTDISCOUNT(rs.getLong(13));
			rec.setAMTRISK(rs.getLong(14));
			rec.setAMTTPP(rs.getLong(15));
			rec.setAMTPAY_M(rs.getLong(16));
			rec.setAMTPAY(rs.getLong(17));
			rec.setAMTCOINS(rs.getLong(18));
			rec.setAMTCOPAY(rs.getLong(19));
			rec.setAMTDEDUCT(rs.getLong(20));
			rec.setAMTINTEREST(rs.getLong(21));
			rec.setAMTWRITE_OFF(rs.getLong(22));
			rec.setAMTMEM_RESP(rs.getLong(23));
			rec.setAMTPROV_RESP(rs.getLong(24));
			rec.setAMTOTHER_ADJ(rs.getLong(25));
			rec.setOTHER_ADJ_IND(rs.getString(26))
			rec.setPAID(rs.getString(27));
			rec.setPAYTO(rs.getString(28));
			rec.setPROC_NBR(rs.getString(29));
			rec.setSTATUS_X(rs.getString(30));
			rec.setEX_ARRAY(rs.getString(31));
			rec.setAMTTYPE_ARRAY(rs.getString(32));
			rec.setANSI_CAGC_ARRAY(rs.getString(33));
			rec.setANSI_CARC_ARRAY(rs.getString(34));
			rec.setANSI_RARC_ARRAY(rs.getString(35));
			rec.setAFF_NBR_NPI(rs.getString(36));
			rec.setPRAC_NBR(rs.getString(37));
			rec.setAFF_NBR(rs.getString(38));
			rec.setHRA_AMTCOPAY(rs.getLong(39));
			rec.setHRA_AMTCOINS(rs.getLong(40));
			rec.setHRA_DEDUCT(rs.getLong(41));
			rec.setALTCL_AMTPAY(rs.getLong(42));
			rec.setALTCL_AMTPAY_M(rs.getLong(43));
			rec.setALTCL_AMTALLOW(rs.getLong(44));
			rec.setALTTPOLICY_NBR(rs.getString(45));
			rec.setYMDEFF(rs.getLong(46));
			rec.setYMDEND(rs.getLong(47));
			rec.setYMDPAID(rs.getLong(48));
			rec.setYMDTRANS(rs.getLong(49));
			rec.setBANK_CHECK_NBR(rs.getString(50));
			rec.setPRIOR_CHECK_NBR(rs.getString(51));
			rec.setTRACE_NBR(rs.getLong(52));
			rec.setCLAIM_PAID(rs.getString(53));
			records.add(rec);
		}
		rs.close();
		stmt.close();
		con.close();
		
		return records;
	}

	@Override
	public CoreRecord getRowAsVO(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void copyVoToRS(ResultSet rs, CoreRecord rec) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
