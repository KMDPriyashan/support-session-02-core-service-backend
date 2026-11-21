package org.example.Services.impl;

import org.example.Entity.CustomerEntity;
import org.example.Model.CustomerDTO;
import org.example.Repository.CustomerRepository;
import org.example.Services.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceimpl implements CustomerService {
    @Autowired
    CustomerRepository repository;

    @Override
    public boolean createCustomer(CustomerDTO customerDTO) {
        ModelMapper modelMapper = new ModelMapper();
        CustomerEntity customerEntity = modelMapper.map(customerDTO, CustomerEntity.class);
        repository.save(customerEntity);
        return true;
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        List<CustomerEntity> all = repository.findAll();
        ArrayList<CustomerDTO> customerDTOArrayList = new ArrayList<>();
        all.forEach(customerEntity ->
                customerDTOArrayList.add(new ModelMapper().map(customerEntity,CustomerDTO.class)));
        return customerDTOArrayList;
    }

    @Override
    public boolean deleteById(Integer id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public CustomerDTO searchById(Integer id) {
        return new ModelMapper().map(repository.findById(id),CustomerDTO.class);
    }
}
