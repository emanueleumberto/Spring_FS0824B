package com.epicode.demoSpring;

import com.epicode.demoSpring.configurationClass.ConfigurationBean;
import com.epicode.demoSpring.configurationClass.UserConfiguration;
import com.epicode.demoSpring.configurationComponent.UserComponent;
import com.epicode.demoSpring.configurationXML.UserXML;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoSpringApplication.class, args);

		System.out.println("Run...");

		//UserXML u = new UserXML("Mario", "Rossi");

		// Metodo 1
		// Configurazione tramite file XML
		//configWith_XML();

		// Metodo 2
		// Configurazione tramite classe
		configWith_Configuration();

		// Metodo 3
		// Configurazione tramite Component
		// configWith_Component();

	}

	public static void configWith_XML() {
		// Creo un Container dove gestire il ciclo di vita di Bean tramite Spring
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

		// Recupero il Bean tramite il file di configurazione XML
		UserXML u = (UserXML) appContext.getBean("userXML");
		System.out.println(u);

		// Chiudo in Container
		appContext.close();
	}

	public static void configWith_Configuration() {
		// Creo un Container dove gestire il ciclo di vita di Bean tramite Spring
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationBean.class);

		// Recupero il Bean senza paramentri tramite la classe ConfigurationBean
		// Singleton
		UserConfiguration u1 = (UserConfiguration) appContext.getBean("user");
		System.out.println(u1);

		// Singleton
		UserConfiguration u1c = (UserConfiguration) appContext.getBean("user");
		System.out.println(u1c);

		// Recupero il Bean CON paramentri tramite la classe ConfigurationBean
		// Prototipe
		UserConfiguration u2 = (UserConfiguration) appContext.getBean("userParam", "Giuseppe", "Verdi");
		System.out.println(u2);

		// Prototipe
		UserConfiguration u3 = (UserConfiguration) appContext.getBean("userParam", "Francesca", "Neri");
		System.out.println(u3);

		// Chiudo in Container
		appContext.close();

	}

	public static void configWith_Component() {
		// Creo un Container dove gestire il ciclo di vita di Bean tramite Spring
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();

		appContext.scan("com.epicode.demoSpring.configurationComponent");
		appContext.refresh();

		// Recupero il Bean CON paramentri tramite la classe ConfigurationBean
		UserComponent u1 = (UserComponent) appContext.getBean("UserComponent");
		u1.setName("Mario");
		u1.setLastname("Rossi");
		System.out.println(u1);

		UserComponent u2 = (UserComponent) appContext.getBean("UserComponent", "Giuseppe", "Verdi");
		System.out.println(u2);

		// Chiudo in Container
		appContext.close();

	}

}
