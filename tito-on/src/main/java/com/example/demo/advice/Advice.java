package com.example.demo.advice;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Advice {
    @Id
    @SequenceGenerator(name="seq_advice", sequenceName = "seq_advice", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_advice")
    @Column(name = "advNum")
    private int advnum;

    @Column(nullable = false)
    private int emotion;

}
