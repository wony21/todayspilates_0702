package m.imtsoft.todayspilates.domain.user;

import java.util.List;
import java.util.Map;

public interface UserMapper {
	
	List getUser();
	List loginUser(Map<String, Object> parameter);
	User getUserInfo(Map<String, Object> parameter);
	List existUserInStor(Map<String, Object> parameter);
}
