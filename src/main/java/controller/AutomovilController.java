package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.AutomovilService;

@RestController
@RequestMapping("/automovil")
public class AutomovilController {

    @Autowired
    AutomovilService automovilService;

}
