package product2;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("product2dao")
public interface Product2DAO {
	
	public List<Product2DTO> productlist2();

}
