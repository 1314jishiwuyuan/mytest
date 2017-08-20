
package cn.itcast.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Title:Application.java
 * @Description:HelloController
 * @author 神秘人
 * @date 2017年8月18日 下午8:44:46
 * @version v1.0
 */
//@RestController    //这是表示整个类全部的方法返回的数据都是json格式
@Controller
public class HelloController{
	
	/**获取.properties文件内容的方式一*/
	@Autowired
	private Environment environment;
	
	/**获取.properties文件内容的方式二*/
	
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;
	
	//这里面静态资源html文件的请求时请求的路径不能与资源名一样
	//这里用@Controller 才能去往user.html文件
	@GetMapping("user1")
	public String goUser(){
		return "/user.html";
	}
	
	
	
	
	
	@GetMapping("/hello")
	public String testJson(){
		
		System.out.println(environment.getProperty("name"));
		System.out.println(environment.getProperty("url"));
		System.out.println();
		System.out.println(name);
		System.out.println(url);
		
		return "Hello World";	
	}
}