package gr.agroknow.client;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;




public class Server {
	
	
	   protected Server() throws Exception {
	        JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
	        sf.setResourceClasses(Service.class);
	        //one accuratly instance of a class
	    //    sf.setResourceProvider(Service.class, new SingletonResourceProvider(new Service()));
	        sf.setAddress("http://localhost:8080/");

	        sf.create();
		   
	    }

	    public static void main(String args[]) throws Exception {
	        new Server();
	        System.out.println("Server ready...");

	        Thread.sleep(5 * 6000 * 1000);
	        System.out.println("Server exiting");
	        System.exit(0);
	    }
	
	
}
