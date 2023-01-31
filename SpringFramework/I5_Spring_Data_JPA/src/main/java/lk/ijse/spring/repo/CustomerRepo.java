package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,String> {
    Customer findCustomerByName(String name);// Query Methods
    Customer findByNameAndAddress(String name,String address);


    Customer findByName(String name);
    Customer readByName(String name);
    Customer getByName(String name);
    Customer queryByName(String name);
    Customer searchByName(String name);
    Customer streamByName(String name);




    //Query Methods initial keywords
    //Single entity or List type entity

    //findBy (findCustomerBy)
    //readBy (readCustomerBy)
    //getBy (getCustomerBy)
    //queryBy (queryCustomerBy)
    //searchBy (searchCustomerBy)
    //streamBy (streamCustomerBy)


    //countBy (countCustomerBy)
    //existBy (existCustomerBy)

    //deleteBy (deleteCustomerBy)
    //removeBy (removeCustomerBy)


}
