package org.example.sb_restapi.Contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

    @GetMapping("/product")
    public String getProductInfo(@RequestParam("id") Integer id) {
        String msg = "";

        if(id==101)
            msg="Apple";
        else if (id == 102) {
            msg="Samsung";
        }
        else {
            msg="No Product";
        }
        return msg;
    }

    @GetMapping("/product/{id}")
    public String getProductInFo(@PathVariable("id") Integer id) {
        String msg = "";

        if(id==101)
            msg="Apple";
        else if (id == 102) {
            msg="Samsung";
        }
        else {
            msg="No Product";
        }
        return msg;
    }

}
