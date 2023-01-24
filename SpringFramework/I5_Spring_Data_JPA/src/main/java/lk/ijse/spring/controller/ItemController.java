package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {


    @Autowired
    ItemRepo repo;
    //model attribute
    //request params

    //response that we want to send
    // code
    // message
    // data
    @PostMapping
    public ResponseUtil saveItem(@ModelAttribute ItemDTO dto) {
        System.out.println(dto.toString());
        Item item = new Item(dto.getCode(),dto.getDescription(),dto.getQtyOnHand(),dto.getUnitPrice());
        repo.save(item);
        return new ResponseUtil("200", "Successfully Added", null);
    }

    @GetMapping
    public ResponseUtil getAllItems() {
        List<Item> all = repo.findAll();
        return new ResponseUtil("200", "Successfully Loaded", all);
    }


    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO dto) {
        System.out.println(dto.toString());
        Item item = new Item(dto.getCode(),dto.getDescription(),dto.getQtyOnHand(),dto.getUnitPrice());
        repo.save(item);
        return new ResponseUtil("200", "Successfully Updated", null);
    }


    @DeleteMapping(params = "code")
    public ResponseUtil deleteItem(String code) {
       repo.deleteById(code);
        return new ResponseUtil("200", "Successfully Deleted", null);
    }



}
