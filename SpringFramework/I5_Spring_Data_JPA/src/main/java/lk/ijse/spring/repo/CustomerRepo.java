package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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

    //Params
    //Positional Params
    //Named Params


    //Positions Params
    //set the parameters using the method parameter position
    //name is in the first place ?1
    //address is in the second place ?2
    @Query(value = "select * from Customer where name=?1 and address=?2",nativeQuery = true)
    Customer testOneNativeQueryWithNameP1(String name,String address);


    //Named Params
    //set the parameters using the method parameter names
    //@Param is required to map param name and named param in the query
    @Query(value = "select * from Customer where name=:n and address=:a",nativeQuery = true)
    Customer testOneNativeQueryWithNameP2(@Param("n") String name, @Param("a") String address);


    //JPQL
    @Query(value = "select u from Customer u where u.name=:name")
    Customer jpqlTestQuery(@Param("name")String name);

    //HQL
    @Query(value = "from Customer c where c.name=:name")
    Customer hqlTestQuery(@Param("name")String name);




}
