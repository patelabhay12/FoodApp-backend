package com.abhay.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @ManyToOne
   private Food food;

   private int quantity;

   private Long totalPrice;

   private List<String> ingredients;
}
