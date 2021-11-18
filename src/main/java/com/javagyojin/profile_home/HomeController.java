package com.javagyojin.profile_home;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javagyojin.profile_home.dao.IDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/")
	public String index() {		
		
		return "index";
	}
	
	@RequestMapping(value = "/login")
	public String login() {		
		
		return "login";
	}
	
	@RequestMapping(value = "/loginOk")
	public String loginOk() {		
		
		return "loginOk";
	}
	
	@RequestMapping(value = "/join")
	public String join() {		
		
		return "join";
	}
	
	@RequestMapping(value = "/question")
	public String question() {		
		
		return "question";
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {		
		
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("list", dao.listDao());
		
		return "list";
	}
	
	@RequestMapping(value = "/qview")
	public String qview(HttpServletRequest request, Model model) {		
		
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("qview", dao.qviewDao(request.getParameter("qNum")));
		
		return "qview";
	}
	
	@RequestMapping(value = "/write")
	public String write(HttpServletRequest request, Model model) {		
		
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.writeDao(request.getParameter("qId"), request.getParameter("qName"), request.getParameter("qContent"), request.getParameter("qEmail"));
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/delete")
	public String delete(HttpServletRequest request, Model model) {		
		
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.deleteDao(request.getParameter("qNum"));
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/modify")
	public String modify(HttpServletRequest request, Model model) {		
		
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.modifyDao(request.getParameter("qName"), request.getParameter("qContent"), request.getParameter("qEmail"), request.getParameter("qNum"));		
		
		return "redirect:list";
	}
	
}
