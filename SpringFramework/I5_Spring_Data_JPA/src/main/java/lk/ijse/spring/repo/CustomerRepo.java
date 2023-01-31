package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,String> {
    //Query Methods initial keywords
    //Single entity or List type entity

    //You can start your query methods using following keyword
    //By using them you can expect a return type of single record or data collection

    //findBy (findCustomerBy) (return entity or collection)
    //readBy (readCustomerBy) (return entity or collection)
    //getBy (getCustomerBy) (return entity or collection)
    //queryBy (queryCustomerBy) (return entity or collection)
    //searchBy (searchCustomerBy) (return entity or collection)
    //streamBy (streamCustomerBy) (return entity or collection)

    //countBy (countCustomerBy) (return long)
    //existBy (existCustomerBy) (return boolean)

    //deleteBy (deleteCustomerBy)
    //removeBy (removeCustomerBy)


    Customer findCustomerByName(String name);// Query Methods
    Customer findByNameAndAddress(String name,String address);

    // if this query methods only have one record as a return type then
    // you can use single entity reference
    // Customer findByName(String name);

    //if the results have more than one record then you have to put a
    // collection type as the return type
    List<Customer> findByName(String name);

    Customer readByName(String name);
    Customer getByName(String name);
    Customer queryByName(String name);
    Customer searchByName(String name);
    Customer streamByName(String name);


    //countBy query methods return long type data
    Long countByName(String name);

    //if a query Method start with existBy then you should return a boolean
    Boolean existsByAddress(String address);



    void deleteByName(String name);

    void removeByName(String name);


    //How to write a query using jpa repository.?

    //query (Native SQL, JPQL , HQL)


    //Native SQL
    @Query(value = "select * from Customer",nativeQuery = true)
    List<Customer> testOneNativeQuery();

    @Query(value = "select * from Customer where name='Thamalsha'",nativeQuery = true)
    Customer testOneNativeQueryWithName();




}
