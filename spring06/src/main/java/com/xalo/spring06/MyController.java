package com.xalo.spring06;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
 @GetMapping("/first")
 public ModelAndView first(){
	 ModelAndView mv = new ModelAndView();
	 mv.addObject("title","<h1>我是后台传过来的title<h1>");
     mv.addObject("color","blue");
	 mv.addObject("height", "400px");
	 mv.addObject("sex","天");
	/* mv.addObject("name","名字测试");*/
	/* List<Student> student = new ArrayList<student>();
	 student.ad*/
	 List<student> student = new ArrayList<student>();
	 student.add( new student("张三", 1));
	 student.add(new student("李四", 2));
	 mv.addObject("student",student);
	 
	 Map<String, Object> map = new HashMap<String,Object>();
	 map.put("title", "静夜思");
	 map.put("first", "静夜思");
	 map.put("stuents", "静夜思");
	 mv.addObject("map",map);
	 
	 
	 
	/* mv.addObject("stu",new);*/
	 mv.setViewName("first");
	 return mv;
 }
}
