package com.example.demo.faq;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@DynamicInsert
public class FAQ {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_FAQ")
    @SequenceGenerator(name = "seq_FAQ", sequenceName = "seq_FAQ", allocationSize = 1)
    @Column(name = "qNum")
    private int qnum;

    @Lob
    @Column(nullable = false)
    private String question;

    @Lob
    @Column(nullable = false)
    private String answer;
}
