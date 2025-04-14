package com.bms.dbapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name ="Theatres")
public class Theatre {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
   String name;
   String address;
   String state;
   int pincode;
   @ManyToOne
   AppUser owner;




}
