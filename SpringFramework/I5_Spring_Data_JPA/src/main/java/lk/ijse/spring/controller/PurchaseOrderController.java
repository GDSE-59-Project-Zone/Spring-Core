package lk.ijse.spring.controller;

import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.entity.Orders;
import lk.ijse.spring.service.PurchaseOrderService;
import lk.ijse.spring.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchase")
@CrossOrigin
public class PurchaseOrderController {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private PurchaseOrderService service;

    @PostMapping
    public ResponseUtil purchaseOrder(@RequestBody OrdersDTO dto) {
        System.out.println(dto.toString());
        Orders map = mapper.map(dto, Orders.class);
        System.out.println(map.toString());
        service.purchaseOrder(dto);
        return new ResponseUtil("200", "Successfully Purchased.!", null);
    }
}
