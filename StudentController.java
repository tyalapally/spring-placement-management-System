package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
	@Autowired
    private StudentRepository userRepo;
     
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    @GetMapping("/sLogin")
    public String viewHomePage1() {
        return "sLogin";
    }
    
    @GetMapping("/home")
    public String viewHomePage9() {
        return "index";
    }
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("Student", new Student());
         
        return "register";
    }
    @PostMapping("/process_register")
    public String processRegister(Student student) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(student.getPassword());
        student.setPassword(encodedPassword);
         
        userRepo.save(student);
         
        return "sLogin";
    }
	 @GetMapping("/sdashboard")
	    public String viewHomePage2() {
	        return "sdashboard";
	    }
	 
	 @Autowired
	    private JobService service;
	 @GetMapping("/sjobs")
	    public String viewJobs(Model model) {
		 List<Job> listJob = service.listAll();
		    model.addAttribute("listJob", listJob);

	        return "sjobs";
	    }
	 @GetMapping("/sucess")
	    public String viewHomePage3() {
	        return "sucess";
	    }
	


}
