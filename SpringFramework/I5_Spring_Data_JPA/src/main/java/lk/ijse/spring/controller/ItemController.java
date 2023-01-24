package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemServiceImpl;
import lk.ijse.spring.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @Autowired
    ItemServiceImpl itemService;


    @PostMapping
    public ResponseUtil saveItem(@ModelAttribute ItemDTO dto) {
        itemService.addItem(dto);
        return new ResponseUtil("200", "Successfully Added", null);
    }

    @GetMapping
    public ResponseUtil getAllItems() {
        ArrayList<ItemDTO> allItems = itemService.getAllItems();
        return new ResponseUtil("200", "Successfully Loaded", allItems);
    }


    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO dto) {
        itemService.updateItem(dto);
        return new ResponseUtil("200", "Successfully Updated", null);
    }


    @DeleteMapping(params = "code")
    public ResponseUtil deleteItem(String code) {
        itemService.deleteItem(code);
        return new ResponseUtil("200", "Successfully Deleted", null);
    }



}
