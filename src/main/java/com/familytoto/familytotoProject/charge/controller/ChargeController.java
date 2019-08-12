package com.familytoto.familytotoProject.charge.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.familytoto.familytotoProject.charge.domain.CreditVO;
import com.familytoto.familytotoProject.charge.service.ChargeService;
import com.familytoto.familytotoProject.registerCust.domain.CustVO;

@Controller
public class ChargeController {
	@Autowired
	ChargeService chargeService;
	
	private int nCustNo = 0;
	private int nFamilyCustNo = 0;
	
	@RequestMapping("charge")
    public ModelAndView charge(ModelAndView mv, HttpSession session) {
		CustVO vo = (CustVO) session.getAttribute("cust");
		nCustNo = vo.getCustNo();
		nFamilyCustNo = vo.getFamilyCustNo();
		Map<String, Object> map = chargeService.getCreditInfo(vo);

		mv.addObject("list", map);
		mv.setViewName("shop/charge");
		
        return mv;
    }
	
	@RequestMapping(value="charge/doCharge",method = RequestMethod.POST)
	@ResponseBody
	public int doCharge(@ModelAttribute CreditVO vo, HttpServletRequest request) {
		vo.setRegCustNo(nCustNo);
		vo.setRegIp(request.getRemoteAddr());
		vo.setFamilyCustNo(nFamilyCustNo);
		
		int nResult = chargeService.doCharge(vo);
		
		if(nResult == 1) {
			return 0;
		} else if(nResult==-98) {
			return -98;
		} else {
			return -99;
		}
	}	
}
