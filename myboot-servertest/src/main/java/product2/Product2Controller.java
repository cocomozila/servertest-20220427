package product2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Product2Controller {
	
	@Autowired
	@Qualifier("product2service")
	Product2Service service;
	
	@RequestMapping("/product2list")
	public ModelAndView product2list() {
		
		ModelAndView mv = new ModelAndView();
		List<Product2DTO> list = service.productlist();
		mv.addObject("list", list);
		mv.setViewName("productlist2");
		
		return mv;
		
	}

}
