package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n02.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(name="nom", defaultValue="UNKNOWN") String name, Model model) {
		model.addAttribute("nom", name);
		return "HelloWorld";
	}
	
	@GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
	public String saluda2(@PathVariable(required = false) String name, Model model) {
		model.addAttribute("nom", name);
		return "HelloWorld2";
	}


}
