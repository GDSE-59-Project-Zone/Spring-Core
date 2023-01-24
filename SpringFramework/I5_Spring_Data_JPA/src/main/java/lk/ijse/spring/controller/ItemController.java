package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {


    //model attribute
    //request params

    //response that we want to send
    // code
    // message
    // data
    @PostMapping
    public ResponseUtil saveItem(@ModelAttribute ItemDTO dto) {
        System.out.println(dto.toString());
        return new ResponseUtil("200", "Successfully Added", null);
    }

    @GetMapping
    public ResponseUtil getAllItems() {
        ArrayList<ItemDTO> allItems = new ArrayList<>();
        allItems.add(new ItemDTO("I001", "Lux", 200, 100.00));
        allItems.add(new ItemDTO("I002", "Signal", 100, 200.00));
        allItems.add(new ItemDTO("I003", "Cloguard", 400, 300.00));
        allItems.add(new ItemDTO("I004", "Sunlight", 560, 400.00));
        allItems.add(new ItemDTO("I005", "Lux Small", 110, 500.00));
        return new ResponseUtil("200", "Successfully Loaded", allItems);
    }


    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO dto) {
        System.out.println(dto.toString());
        return new ResponseUtil("200", "Successfully Updated", null);
    }


    @DeleteMapping(params = "code")
    public ResponseUtil deleteItem(String code) {
        System.out.println(code);
        return new ResponseUtil("200", "Successfully Deleted", null);
    }



}
