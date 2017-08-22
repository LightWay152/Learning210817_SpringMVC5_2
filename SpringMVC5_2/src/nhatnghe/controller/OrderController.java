package nhatnghe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("order")
public class OrderController {
	@RequestMapping("checkout")
	public String checkout(){
		return "order/checkout.php";
	}
	
	@RequestMapping("list")
	public String list(){
		return "order/list.php";
	}
	
	@RequestMapping("detail")
	public String detail(){
		return "order/detail.php";
	}
}
