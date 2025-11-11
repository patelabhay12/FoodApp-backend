package com.abhay.models;

import com.abhay.dto.RestaurantDTO;
import com.abhay.enums.USER_ROLE;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String email;

    private String password;

    private USER_ROLE role;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();

    @ElementCollection
    private List<RestaurantDTO> favorites = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses = new ArrayList<>();

    private String status;
}
