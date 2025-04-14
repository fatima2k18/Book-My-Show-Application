package com.bms.dbapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "shows")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    //Every show is going to displayedin a hall
    @ManyToOne
    Hall hall;
    @ManyToOne
    Movie movie;
    Long startTime;
    Long endTime;


}
