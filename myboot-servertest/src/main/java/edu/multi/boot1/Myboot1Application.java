package edu.multi.boot1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import spring.mybatis.MemberDAO;
import spring.mybatis.MemberMybatisController;
import upload.UploadController;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackageClasses = UploadController.class)
@ComponentScan(basePackageClasses = MemberMybatisController.class)
@MapperScan(basePackageClasses = MemberDAO.class)
@ComponentScan(basePackages = "product")
@MapperScan(basePackageClasses = product.ProductDAO.class)
@ComponentScan(basePackages = "product2")
@MapperScan(basePackageClasses = product2.Product2DAO.class)
@ComponentScan(basePackages = "write")
@MapperScan(basePackageClasses = write.PostDAO.class)

public class Myboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Myboot1Application.class, args);
	}

}
