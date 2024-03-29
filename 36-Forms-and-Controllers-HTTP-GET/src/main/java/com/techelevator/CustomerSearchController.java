package com.techelevator;

import com.techelevator.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;
    
    @RequestMapping("/customerList")
    public String showCustomerSearchForm() {
    	return "customerList";
    }
    
    @RequestMapping("/customerList/results")
    public String searchCustomer(@RequestParam String search, @RequestParam String sort,
    		ModelMap modelHolder) {
    	modelHolder.addAttribute("customers", customerDao.searchAndSortCustomers(search, sort));
    	return "customerList";
    }
    

}