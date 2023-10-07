
package com.arqui.sensor.web;

import jakarta.persistence.*;

@Entity
@Table(name = "sensor")
public class Sensor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idsensor;
    private float valor;

    public Integer getIdsensor() {
        return idsensor;
    }

    public void setIdsensor(Integer idsensor) {
        this.idsensor = idsensor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
