package org.example.Controller;

import lombok.RequiredArgsConstructor;
import org.example.Model.CustomerDTO;
import org.example.Services.CustomerService;
import org.example.Services.impl.CustomerServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("customer")
public class CustomerController {

    final CustomerService service;

    @PostMapping("/create/customer")
    public boolean createCustomer(@RequestBody CustomerDTO customerDTO){
        return service.createCustomer(customerDTO);
    }

    @GetMapping("/all/customer")
    public List<CustomerDTO> getAllCustomer(){
        return service.getAllCustomer();
    }

    @DeleteMapping("/delete-by-id/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return service.deleteById(id);
    }

    @GetMapping("/search-by-id/{id}")
    public CustomerDTO searchById(@PathVariable Integer id){
        return service.searchById(id);
    }
}
