package com.bms.dbapi.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.jmx.export.annotation.ManagedNotification;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="bills")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID billId;
    @ManyToOne
    AppUser user;
    @ManyToOne
    Show show;//Many bills are of one show
    int totalTickets;
    String seats;//1-2-3-4-5-6
    int totalAmount;
    LocalDateTime startTime;
    LocalDateTime endTime;

}
