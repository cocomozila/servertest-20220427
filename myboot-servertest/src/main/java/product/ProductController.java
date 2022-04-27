package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	@Autowired
	@Qualifier("productservice")
	ProductService service;
	
	@RequestMapping("/productlist")
	public ModelAndView productList(Model model) {
		
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> list = service.productList();
		mv.addObject("prolist", list);
		mv.setViewName("productlist");
				
		return mv;
	}

}
