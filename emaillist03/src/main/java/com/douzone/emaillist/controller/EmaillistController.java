package com.douzone.emaillist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.emaillist.repository.EmaillistRepository;
import com.douzone.emaillist.vo.EmaillistVo;

@Controller
public class EmaillistController {
	
	@Autowired
	private EmaillistRepository emaillistRespository;

	@RequestMapping("")
	public String index(Model model) {
		List<EmaillistVo> list = emaillistRespository.findAll();
		model.addAttribute("list", list);
		return "index";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add() {
		return "add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(EmaillistVo vo) {
		emaillistRespository.insert(vo);
		return "redirect:/";
	}
}