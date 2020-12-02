package com.example.original.app.controller;

import com.example.original.app.resource.OsakaMetro;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/original")
public class RestApiController {

    @RequestMapping(value = "/getOsakaMetroLine", method = RequestMethod.GET)
    @ResponseBody
    public OsakaMetro getOsakaMetroLine(){
        OsakaMetro line = new OsakaMetro("Midosuji", "red", "Esaka", "Nakamozu");
        return line;
    }
}
