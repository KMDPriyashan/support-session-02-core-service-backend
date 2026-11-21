package org.example.Services;

import org.example.Model.CustomerDTO;
import java.util.List;

public interface CustomerService {

    boolean createCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> getAllCustomer();
    boolean deleteById(Integer id);
    CustomerDTO searchById(Integer id);

}
