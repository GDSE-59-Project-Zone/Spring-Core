package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,String> {
    Customer findCustomerByName(String name);// Query Methods
    Customer findByNameAndAddress(String name,String address);

    // if this query methods only have one record as a return type then you can use single entity reference
    // Customer findByName(String name);
    Customer readByName(String name);
    Customer getByName(String name);
    Customer queryByName(String name);
    Customer searchByName(String name);
    Customer streamByName(String name);

    //if the results have more than one record then you have to put a collection type as the return type
    List<Customer> findByName(String name);




    //Query Methods initial keywords
    //Single entity or List type entity

    //You can start your query methods using following keyword
    //By using them you can expect a return type of single record or data collection

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
