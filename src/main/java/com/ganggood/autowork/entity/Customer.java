package com.ganggood.autowork.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "customer")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;  // 客户公司名称

    @Column(length = 100)
    private String contactPerson;  // 联系人

    @Column(nullable = false, length = 20)
    private String phone;  // 联系电话

    @Column(columnDefinition = "TEXT")
    private String address;  // 公司地址

    @Column(length = 50)
    private String taxId;  // 税号
}