package m.imtsoft.todayspilates.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import m.imtsoft.todayspilates.common.BaseController;
import m.imtsoft.todayspilates.common.SessionUtils;
import m.imtsoft.todayspilates.domain.member.MemberService;

@Controller
public class MemberController extends BaseController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/api/member", method = RequestMethod.GET, produces = APPLICATION_JSON)
	@ResponseBody
	public List getMember(@RequestParam String storCd,
							@RequestParam String memberNm) {
		
		String compCd = SessionUtils.getCurrentUser().getCompCd();
		return memberService.getMember(compCd, storCd, memberNm);
	}
}

