package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoOne {

//    @Value() // we can inject Primitive,String and array values for properties and parameters

//    public PojoOne(){
//        //if the default constructor available it always runs the default constructor
//        System.out.println("Default Constructor");
//    }
//    @Autowired
//    public PojoOne(@Value("Galle") String address){
//        //otherwise you have to inject the values at runtime for the parameters
//        System.out.println("PojoOne:Instantiated "+address);
//    }

    @Autowired(required = false) // if this required attribute is set to false then the greadious constructor will be selected by the container while creating the object
    public PojoOne(@Value("Galle,Panadura,Kaluthara") String address[],@Value("C001") String id,@Value("Ramal") String name,@Value("1000") String salary){
        //otherwise you have to inject the values at runtime for the parameters
        System.out.println("PojoOne:Instantiated 1 "+address);
        for (String s : address) {
            System.out.println(s);
        }
    }

    @Autowired(required = false)
    public PojoOne(@Value("Galle,Panadura,Kaluthara") String address[],@Value("Kasun") String name){
        //otherwise you have to inject the values at runtime for the parameters
        System.out.println("PojoOne:Instantiated 2 "+address);
        for (String s : address) {
            System.out.println(s);
        }
    }



}
