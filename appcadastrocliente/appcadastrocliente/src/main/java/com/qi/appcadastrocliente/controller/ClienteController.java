package com.qi.appcadastrocliente.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import com.qi.appcadastrocliente.model.Cliente;
import com.qi.appcadastrocliente.repository.ClienteRepository;


@Service
@Transactional
@Controller
public class ClienteController {
	
	@Autowired
	private ClienteRepository rep;
	
	public List<Cliente> listarTodos(){
		return rep.findAll();
	}
	
	public Cliente getCliente(long id) {
		return rep.findById(id).get();
	}
	
	public void salvar(Cliente cli) {
		rep.save(cli);
	}
	
	public void excluir(long id) {
		rep.deleteById(id);
	}
	
	@RequestMapping("/")
	public String chamarLista(Model modelo) {
		List<Cliente> listaClientes = listarTodos();
		modelo.addAttribute("listaClientes", listaClientes);
		return "index";
	}
	
	@RequestMapping("novo")
	public ModelAndView chamarNovo() {
		ModelAndView modelo = new ModelAndView("novo");
		Cliente cliente = new Cliente();
		modelo.addObject("cliente", cliente);
		return modelo;
	}
	
	@RequestMapping("/editar/{id}")
	public ModelAndView chamarEditar(@PathVariable(name = "id") long id) {
		ModelAndView modelo = new ModelAndView("editar");
		Cliente cliente = getCliente(id);
		modelo.addObject("cliente", cliente);
		return modelo;
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String chamarSalvar(@ModelAttribute("cliente") Cliente cliente) {
		salvar(cliente);
		return "redirect:/";
	}
	
	@RequestMapping("/excluir/{id}")
	public String chamarExcluir(@PathVariable(name = "id") long id) {
		excluir(id);
		return "redirect:/";
	}
	
	
	

}
