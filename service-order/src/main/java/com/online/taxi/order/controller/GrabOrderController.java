package com.online.taxi.order.controller;

import com.online.taxi.order.service.GrabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yueyi2019
 */
@RestController
@RequestMapping("/grab")
public class GrabOrderController {

    @Autowired
    private GrabService grabService;

    @GetMapping("/do/{orderId}/{driverId}")
    public String grab(@PathVariable("orderId") int orderId,@PathVariable("driverId") int driverId){
        grabService.grabOrder(orderId,driverId);
        return "";
    }
}
