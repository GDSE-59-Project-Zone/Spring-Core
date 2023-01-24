package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class CustomerServiceImpl {
    @Autowired
    CustomerRepo repo;

    @Autowired
    ModelMapper mapper;

    public void addCustomer(CustomerDTO dto){
        Customer entity = mapper.map(dto, Customer.class);
        repo.save(entity);
    }

    public void deleteCustomer(String id){
        repo.deleteById(id);
    }

    public void updateCustomer(CustomerDTO dto){
        Customer entity = mapper.map(dto, Customer.class);
        repo.save(entity);
    }

    public ArrayList<CustomerDTO> getAllCustomers(){
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<CustomerDTO>>() {
        }.getType());
    }
}
