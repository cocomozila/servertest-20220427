package write;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("postdao")
public interface PostDAO {
	
	public int insertPost(PostDTO dto);

}
