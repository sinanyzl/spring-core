@SpringBootApplication
public class DemoApplication { 
	public static void main(String[] args) 
	{ 
		SpringApplication.run(DemoApplication.class, args); 
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml"); 
		City cty = context.getBean("city", City.class); 
		cty.setId(01); 
		cty.setName("Sinan"); 
		State st = context.getBean("state", State.class); 
		st.setName("UP"); 
		cty.setState(st); 
		cty.showCityDetails(); 
	} 
}
