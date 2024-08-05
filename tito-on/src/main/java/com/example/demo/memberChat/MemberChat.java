package com.example.demo.memberChat;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import com.example.demo.member.Member;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@DynamicInsert
public class MemberChat {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_MemberChat")
    @SequenceGenerator(name = "seq_MemberChat", sequenceName = "seq_MemberChat", allocationSize = 1)
    @Column(name = "chatNum")
    private long chatnum;

    @ManyToOne
    @JoinColumn(name = "email", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Member email;

    @Lob
    @Column(nullable = false)
    private String chat;

    @Column(name = "saveDate", nullable = false)
    private Date savedate;
}
