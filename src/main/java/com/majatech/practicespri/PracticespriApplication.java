package com.majatech.practicespri;

import com.majatech.practicespri.domain.Tasks;
import com.majatech.practicespri.service.TaskService;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PracticespriApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticespriApplication.class, args);
	}
    
    @Bean
    CommandLineRunner runner(TaskService taskService) {
        return args -> {
            
            taskService.save(new Tasks(1L, "Create Spring Boot Application", Boolean.FALSE, LocalDate.now()));
            taskService.save(new Tasks(2L, "Create Spring Project Package", Boolean.FALSE, LocalDate.now().plus(1, ChronoUnit.DAYS)));
            taskService.save(new Tasks(3L, "Create The Task Domain Task", Boolean.FALSE, LocalDate.now().plus(3, ChronoUnit.DAYS)));
        
            taskService.save(new Tasks(4L, "Create Service and Repository Class", Boolean.FALSE, LocalDate.now().plus(5, ChronoUnit.DAYS)));
        taskService.save(new Tasks(2L, "Create the command line to load Data", Boolean.FALSE, LocalDate.now().plus(8, ChronoUnit.DAYS)));
        
            taskService.save(new Tasks(6L, "Create the required configuration properties", Boolean.FALSE, LocalDate.now().plus(10, ChronoUnit.DAYS)));
        taskService.save(new Tasks(7L, "Run the Springboot Application", Boolean.FALSE, LocalDate.now().plus(12, ChronoUnit.DAYS)));
        taskService.save(new Tasks(8L, "Check H2 console for initial Data ", Boolean.FALSE, LocalDate.now().plus(13, ChronoUnit.DAYS)));
        
        };
    }
}
