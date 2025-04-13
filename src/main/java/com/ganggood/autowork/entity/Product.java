package com.ganggood.autowork.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 50)
    private String code;  // 产品编码，如"SS-304"

    @Column(nullable = false, length = 100)
    private String name;  // 产品名称，如"304不锈钢板"

    @Column(columnDefinition = "TEXT")
    private String specification;  // 产品规格

    @Column(nullable = false, length = 20)
    private String unit = "件";  // 计量单位

    @Column(precision = 10, scale = 2)
    private BigDecimal unitWeightKg;  // 单件重量(kg)

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal unitPrice;  // 单价
}