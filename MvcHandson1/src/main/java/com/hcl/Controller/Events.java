package com.hcl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/events")
public class Events {
	@GetMapping("/eventprocess")
	public String showEvents()
	{
		return "event";
	}

}
