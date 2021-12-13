package com;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	@Autowired
    private AdminRepository userRepo;
	 @GetMapping("/alogin")
	    public String viewHomePage() {
	        return "alogin";
	    }
	 @GetMapping("/adminpage")
	    public String viewHomePage7() {
	        return "adminpage";
	    }
	 @GetMapping("/about")
	    public String viewHomePage8() {
	        return "about";
	    }
	 @GetMapping("/home1")
	    public String viewHomePage9() {
	        return "index";
	    }
	 @Autowired
	    private JobService service;
	 @GetMapping("/index1")
	    public String viewHomePage2(Model model) {
		 List<Job> listJob = service.listAll();
		    model.addAttribute("listJob", listJob);

	        return "index1";
	    }
	 @RequestMapping("/new")
	    public String showNewProductPage(Model model) {
	        Job job = new Job();
	        model.addAttribute("job", job);
	        return "new_product";
	    }
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
		public String saveProduct(@ModelAttribute("job") Job job) {
		    service.save(job);
		     
		    return "redirect:/index1";
		}
	 

	 @RequestMapping("/edit/{id}")
	    public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("edit_product");
	        Job job = service.get(id);
	        mav.addObject("job", job);
	         
	        return mav;
	    }
		@RequestMapping("/delete/{id}")
		public String deleteProduct(@PathVariable(name = "id") int id) {
		    service.delete(id);
		    return "redirect:/index1";       
		}
		 @GetMapping("/ajobs")
		    public String viewHomePage2() {
		        return "ajobs";
		    }

		@Autowired(required=true)
	    private StudentService service1;
	 @GetMapping("/Asprofile")
	    public String viewStudent(Model model) {
		 List<Student> listStudent = service1.listAll();
		    model.addAttribute("listStudent", listStudent);

	        return "Asprofile";
	    }
	 
		
		 
  
}
