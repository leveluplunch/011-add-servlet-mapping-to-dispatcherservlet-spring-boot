package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tutorials")
public class TutorialsController {
	
	@RequestMapping("/")
	public String index (Model model) {
		
		model.addAttribute("name", "Justin");
		
		return "tutorials";
	}

}
