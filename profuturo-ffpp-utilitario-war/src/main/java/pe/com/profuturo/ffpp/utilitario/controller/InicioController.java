package pe.com.profuturo.ffpp.utilitario.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.com.profuturo.ffpp.utilitario.bean.RespuestaBean;

@Controller
@RequestMapping("/inicio")
public class InicioController {

	@RequestMapping(path="/mensaje/{name}")
	public @ResponseBody RespuestaBean init(@PathVariable String name) {
		return new RespuestaBean(name);
	}
}
