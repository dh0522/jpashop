package jpabook.jpashop.domain;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.ArrayList;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")
    // mappedBy=> 나는 member에 의해서 변경되는 값이야 라는 것을 의미함 연관관계 주인 = member
    private List<Order> orders = new ArrayList<>();


}
