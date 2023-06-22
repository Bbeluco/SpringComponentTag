package com.example.componenttag;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.componenttag.BeanTag.BeanExamplePOC;
import com.example.componenttag.Component.ComponentExamplePOC;
import com.example.componenttag.Controller.ControllerExamplePOC;
import com.example.componenttag.Repository.RepositoryExamplePOC;
import com.example.componenttag.Service.ServiceExamplePOC;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ComponentTagApplicationTests {
	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void givenInScopeComponents_whenSearchingApplicationContext_thenFindBeans(){
		assertNotNull(applicationContext.getBean(ComponentExamplePOC.class));
		assertNotNull(applicationContext.getBean(ControllerExamplePOC.class));
		assertNotNull(applicationContext.getBean(RepositoryExamplePOC.class));
		assertNotNull(applicationContext.getBean(ServiceExamplePOC.class));
	}

	@Test
	public void givenCreatedBeanComponent_whenSearchInApplicationContext_thenShouldFindIt() {
		assertNotNull(applicationContext.getBean(BeanExamplePOC.class));
	}
}
