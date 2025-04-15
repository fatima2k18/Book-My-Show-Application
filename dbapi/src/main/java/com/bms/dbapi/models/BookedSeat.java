package com.bms.dbapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="bookedSeat")
public class BookedSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;



}
