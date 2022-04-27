package write;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WriteController {
	
	@Autowired
	@Qualifier("writeservice")
	WriteService service;

	@RequestMapping("/write")
	public String write() {
		return "write";
	}
	
	@PostMapping("/writepost")
	public String writePost(PostDTO dto) {
		int result = service.insertPost(dto);		
		
		return "redirect:write";
	}
}
