
package com.arqui.sensor.web;

import com.arqui.sensor.web.Sensor;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface SensorCrud extends CrudRepository<Sensor, Integer>{
    List<Sensor> findByOrderByIdsensorDesc();
    
}
