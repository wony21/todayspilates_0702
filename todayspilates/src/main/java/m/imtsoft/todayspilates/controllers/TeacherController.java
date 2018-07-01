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
import m.imtsoft.todayspilates.domain.reservation.teacher.TeacherService;

@Controller
public class TeacherController extends BaseController {
	
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping(value = "/api/teacher", method = RequestMethod.GET, produces = APPLICATION_JSON)
	@ResponseBody
	public List getTeacher(@RequestParam String storCd,
							@RequestParam String empNm) {
		
		String compCd = SessionUtils.getCurrentUser().getCompCd();
		return teacherService.getTeacher(compCd, storCd, empNm);
	}
}
