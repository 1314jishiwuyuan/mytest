package cn.itcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title:Application.java
 * @Description:创建Application启动类
 * @author 神秘人
 * @date 2017年8月18日 下午8:44:46
 * @version v1.0
 */
@SpringBootApplication
public class Application {
		//springboot启动有标识
		/*public static void main(String[] args) {
			//运行SpringBoot应用 
			SpringApplication springApplication = new SpringApplication(Application.class);
			springApplication.run(args);
		}*/
	
		public static void main(String[] args) {
			/** 创建SpringApplication应用对象 */
			SpringApplication springApplication = new SpringApplication(Application.class);
			/** 设置横幅模式(设置关闭) */
			springApplication.setBannerMode(Mode.OFF);
			springApplication.run(args);
		}
}
