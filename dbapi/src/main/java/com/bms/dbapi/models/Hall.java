package com.bms.dbapi.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import java.util.UUID;

@Entity
@Table(name="Halls")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Hall {
     UUID id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String name;
    int capacity;
    @ManyToOne
    Theatre theatre;
}
