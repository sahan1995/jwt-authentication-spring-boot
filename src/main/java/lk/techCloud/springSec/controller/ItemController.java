package lk.techCloud.springSec.controller;

import lk.techCloud.springSec.dto.Items;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/items")
public class ItemController {


    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public Items getItem(){
        return new Items(1,"Milk",150.00);
    }
}
