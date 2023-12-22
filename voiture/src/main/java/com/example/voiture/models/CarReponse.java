package com.example.voiture.models;

import com.example.voiture.entities.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarReponse {
    private Long id;
    private String brand;
    private String model;
    private String matricule;
    private Client client;
}
