package com.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.main.services.IDoctorService;

@SpringBootApplication
public class SbDataJpaProj03Application
{

	public static void main(String[] args) 
	{
		   ApplicationContext ctx = SpringApplication.run(SbDataJpaProj03Application.class, args);
		   IDoctorService service = ctx.getBean("docService", IDoctorService.class);
		   //invoke the business logic
		   
		   //delete doctor record by passing ids
			/*System.out.println(service.deleteDoctorsByIdsInBatch(List.of(10041,10042,10043)));*/
		   
		     //fetch all doctor record based on ids
			/*service.findAllDoctorByIds(List.of(20002,20003,20004)).forEach(System.out::println);*/
		   
		   
		   ((ConfigurableApplicationContext) ctx).close();
	}

}
