package com.degvaapps.tut01.web;

import java.util.ArrayList;
import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.degvaapps.tut01.domain.Product;
import com.degvaapps.tut01.repository.InMemoryProductDao;
import com.degvaapps.tut01.service.SimpleProductManager;

public class InventoryControllerTests {

	@Test
	public void testHandleRequestView() throws Exception {
		InventoryController controller = new InventoryController();
        SimpleProductManager spm = new SimpleProductManager();
        spm.setProductDao(new InMemoryProductDao(new ArrayList<Product>()));
        controller.setProductManager(spm);
        //controller.setProductManager(new SimpleProductManager());
		ModelAndView modelAndView = controller.handleRequest(null, null);
		assertEquals("hello", modelAndView.getViewName());
		assertNotNull(modelAndView.getModel());
		
		@SuppressWarnings("unchecked")
		Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("model");
		String nowValue = (String) modelMap.get("now");
		
		assertNotNull(nowValue);
	}

}
