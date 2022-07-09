package com.fundamentos.sprintboot.fundamentos;

import com.fundamentos.sprintboot.fundamentos.component.ComponentDependecy;
import com.fundamentos.sprintboot.fundamentos.component.ComponentImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependecy componentDependecy;
	@Autowired
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependecy componentDependecy){
		this.componentDependecy = componentDependecy;
	}

	public static void main(String[] args) {

		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependecy.saludar();
	}
}
