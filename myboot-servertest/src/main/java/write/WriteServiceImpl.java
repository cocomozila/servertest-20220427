package write;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("writeservice")
public class WriteServiceImpl implements WriteService {
	
	@Autowired
	@Qualifier("postdao")
	PostDAO dao;

	@Override
	public int insertPost(PostDTO dto) {
		return dao.insertPost(dto);
	}

}
