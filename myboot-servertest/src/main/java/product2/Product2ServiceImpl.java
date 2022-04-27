package product2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("product2service")
public class Product2ServiceImpl implements Product2Service {

	@Autowired
	@Qualifier("product2dao")
	Product2DAO dao;
	
	@Override
	public List<Product2DTO> productlist() {
		return dao.productlist2();
	}

}
