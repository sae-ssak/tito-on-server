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
    private long chatNum;

    @ManyToOne
    @JoinColumn(name = "userNum", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @Column(name = "userNum")
    private Member usernum;

    @Lob
    @Column(nullable = false)
    private String chat;
}
