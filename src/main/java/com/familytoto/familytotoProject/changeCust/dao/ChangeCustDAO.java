package com.familytoto.familytotoProject.changeCust.dao;

import java.util.Map;

import com.familytoto.familytotoProject.registerCust.domain.CustVO;
import com.familytoto.familytotoProject.registerCust.domain.RegisterCustVO;

public interface ChangeCustDAO {
	Map<String, Object> getCustInfo(CustVO cVo);
	int updateCustInfo(CustVO cVo, RegisterCustVO rVo);
}
