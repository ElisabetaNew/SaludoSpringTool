package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(name="nom", required=false, defaultValue="UNKNOWN") String name, Model model) {
		model.addAttribute("nom", name);
		return "HelloWorld";
	}
	
//	@GetMapping("/HelloWorld2")
//	public String saluda2(@PathVariable(name="nom2", required=false, defaultValue="UNKNOWN") String name, Model model) {
//		model.addAttribute("nom2", name);
//		return "greeting";
//	}


}
