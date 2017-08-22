package nhatnghe.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import eshop.entity.Category;

@Controller
@RequestMapping("ajax")
public class AjaxController {
	@RequestMapping("index")
	public String index(){
		return "ajax/index";
	}
	
	/*Return result of request function into response*/
//	@ResponseBody
//	@RequestMapping("hello")
//	public String hello(){
//		return "Hello Everybody, My name is server!";
//	}
	
	/*Return view of request into response*/
	@RequestMapping("hello")
	public String hello(){
		return "ajax/index";
	}
	
	@ResponseBody
	@RequestMapping("json1")
	public String json1() {
		String text = "{\"id\":\"Dao\",\"Age\":22}";
		return text;
	}
	
	@ResponseBody
	@RequestMapping("json2")
	public String json2(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "NghiemN");
		map.put("age", 45);
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			String text = mapper.writeValueAsString(map);
			return text;
		} catch (Exception e) {
			return "Error!";
		}
	}
	
	@ResponseBody
	@RequestMapping("json3")
	public String json3(){
		Category cate = new Category();
		cate.setId(1000);
		cate.setName("Mobile");
		cate.setNameVN("Điện thoại di động");
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			String text = mapper.writeValueAsString(cate);
			return text;
		} catch (Exception e) {
			return "Error!";
		}
	}
	
	@ResponseBody
	@RequestMapping("json4")
	public String json4(){
		String[] arr = {"Tuấn","Phương","Cường"};
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			String text = mapper.writeValueAsString(arr);
			return text;
		} catch (Exception e) {
			return "Error!";
		}
	}
	
	@ResponseBody
	@RequestMapping("json5")
	public String json5(){
		List<String> list = new ArrayList<String>();
		list.add("Tuan");
		list.add("Phuong");
		list.add("Cuong");
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			String text = mapper.writeValueAsString(list);
			return text;
		} catch (Exception e) {
			return "Error!";
		}
	}
	
	@ResponseBody
	@RequestMapping("json6")
	public String json6(){
		Category cate1 = new Category();
		cate1.setId(1000);
		cate1.setName("Mobile");
		cate1.setNameVN("Dien thoai di dong");
		
		Category cate2 = new Category();
		cate2.setId(2000);
		cate2.setName("Laptop");
		cate2.setNameVN("May tinh xach tay");
		
		List<Category> list = new ArrayList<Category>();
		list.add(cate1);
		list.add(cate2);
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			String text = mapper.writeValueAsString(list);
			return text;
		} catch (Exception e) {
			return "Error!";
		}
	}
}
