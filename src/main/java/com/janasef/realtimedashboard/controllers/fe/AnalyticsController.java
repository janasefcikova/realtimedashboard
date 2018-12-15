package com.janasef.realtimedashboard.controllers.fe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AnalyticsController {
	@GetMapping("/analytics")
	public String analytics(Model model) {
		return "analytics";
	}
	
	@GetMapping("/topTrends")
	public String topTrends(Model model) {
		return "topTrends";
	}
}
