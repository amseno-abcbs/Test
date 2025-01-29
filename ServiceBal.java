package updatesbaa;

import java.sql.ResultSet;

import com.abcbs.spw.annotation.*;
import com.abcbs.spw.component.*;
import com.abcbs.spw.deployment.*;
import com.abcbs.spw.enums.*;
import com.abcbs.spw.exception.UserException;
import com.abcbs.spw.persistence.*;
import com.abcbs.spw.utils.*;

public class ServiceBal extends BeanAdapter{
	//TITLE("Service Balancing Screen")
	public STRING      LV_SERV_NBR                   = new STRING("LV_SERV_NBR",18," ");
    public PACKDECIMAL LV_AMTCHARGE                  = new PACKDECIMAL("LV_AMTCHARGE",13,2,14,'N',0);
	public PACKDECIMAL LV_AMTALLOW_B                 = new PACKDECIMAL("LV_AMTALLOW_B",13,2,14,'N',0);