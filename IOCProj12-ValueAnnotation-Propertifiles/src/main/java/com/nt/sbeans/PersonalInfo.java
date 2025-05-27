package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pInfo")
public class PersonalInfo {

	@Value("23432")
	private Integer regNo;
	@Value("${per.name}")
	private String name;
	
	@Value("${per.id}")
    private Integer pid;
	@Value("${per.addrs}")
	private String paddrs;
	
	
	@Value("${os.version}")
	private String osname;
	
	@Value("${Path}")
	private String pathData;
	
	@Value("${per.id}")
	
	private int pids;
	

	@Override
	public String toString() {
		return "PersonalInfo [regNo=" + regNo + ", name=" + name + ", pid=" + pid + ", paddrs=" + paddrs + ", pids=" + pids + " ,osname="
				+ osname + ", pathData=" + pathData + "]";
	}
	
	
	
	
	
	
}
