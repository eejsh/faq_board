package controller;

import javax.inject.Inject;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.ServiceInter;

@Controller
public class ListController {

	
	@Inject
	ServiceInter service;
	
	@RequestMapping("/list")
	public String list(Model m, HttpServletRequest req) throws Exception{
		
		m.addAttribute("list", service.listvo());
			
		
		return "list";
		
	}
	

}
