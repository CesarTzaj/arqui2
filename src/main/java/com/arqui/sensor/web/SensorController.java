
package com.arqui.sensor.web;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class SensorController {
    
    @Autowired
    private SensorCrud crud;
    @GetMapping("h")
    public ResponseEntity<?> prueba() {
        Map<String, String> time = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String hour = formatter.format(LocalDateTime.now());
        time.put("hour", hour);
        

        return ResponseEntity.ok(time);    
    }
    @GetMapping("all")
    public List<Sensor> getAll(){
        return (List<Sensor>) crud.findByOrderByIdsensorDesc();
    }
    
    @PostMapping("save")
    public Sensor save(@RequestBody Sensor sensor){
        return crud.save(sensor);
    }
}
