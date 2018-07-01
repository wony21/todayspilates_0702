package m.imtsoft.todayspilates.domain.lesson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import m.imtsoft.todayspilates.common.BaseService;
import m.imtsoft.todayspilates.common.ParamNames;

@Service
public class LessonService extends BaseService {
	
	public List getTeacher(String compCd, String storCd) {
		LessonMapper mapper = sqlSession.getMapper(LessonMapper.class);
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put(ParamNames.compCd, compCd);
		parameter.put(ParamNames.storCd, storCd);
		return mapper.getLesson(parameter);
	}

}
