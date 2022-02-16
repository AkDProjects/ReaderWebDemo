package com.example.readerwebdemo.controllers;


import com.example.readerwebdemo.model.Xmlrdr;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class Homecontroller {
@Autowired
Xmlrdr xmlService;
@GetMapping("/")
    public String home(){
        return "index";

    }


    @PostMapping ("/processFile")
    public String fileSubmit(Model model, @RequestParam("file") MultipartFile fileMulti) throws IOException {
    File file = new File("copy"+fileMulti.getOriginalFilename());
    file.createNewFile();
        FileUtils.openOutputStream(file);
        Files.write(fileMulti.getBytes(), file);
String xml = xmlService.xmlparse(file);

        model.addAttribute("fileResult", xml);
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(xml);
            String jsonPrettyPrintString = xmlJSONObj.toString(4);
            model.addAttribute("viewResult", jsonPrettyPrintString);
            System.out.println(jsonPrettyPrintString);
        } catch (JSONException je) {
            System.out.println(je);
        }
        return "Results";
    }

    @ResponseBody
    @GetMapping("/about")
    public String about(){
        return "about hi";

    }
}


