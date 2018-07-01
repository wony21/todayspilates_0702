package m.imtsoft.todayspilates.domain.reservation.teacher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import m.imtsoft.todayspilates.common.BaseService;
import m.imtsoft.todayspilates.common.ParamNames;

@Service
public class TeacherService extends BaseService {
	
	public List getTeacher(String compCd, String storCd, String empNm) {
		TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put(ParamNames.compCd, compCd);
		parameter.put(ParamNames.storCd, storCd);
		parameter.put(ParamNames.empNm, empNm);
		return mapper.getTeacher(parameter);
	}

}
