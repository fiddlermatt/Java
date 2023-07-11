package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")

public class MainController {
	@Autowired
	
	private TrackingRepository trackingRepository;
	
	@PostMapping(path="/add")
	public @ResponseBody String addNewUser(@RequestParam Long TrackNum,
			@RequestParam Long DelvNum, 
			@RequestParam String SCAC,
			@RequestParam String EDI) {
		
		Tracking n = new Tracking();
		n.setID();
		n.setTracknum(TrackNum);
		n.setDelvNum(DelvNum);
		n.setSCAC(SCAC);
		n.setEDI(EDI);
		trackingRepository.save(n);
		return "Saved";}
		
	    @GetMapping(path="/all")
		public @ResponseBody Iterable<Tracking> getAllTracking() {
		    // This returns a JSON or XML with the users
		    return trackingRepository.findAll();
		  }
		
	    @PostMapping(path="/test")
		public @ResponseBody String printMsg() {
		    // This returns a JSON or XML with the users
		    return "HelloWorld";
		  }
		
	
	
}