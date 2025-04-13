package com.ganggood.autowork.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "order_contract")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 50)
    private String contractNumber;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false, unique = true)
    private SalesOrder order;

    @Column(nullable = false, length = 100)
    private String templateName;


    @Column(nullable = false, length = 100)
    private String paymentTerms;


    private LocalDate signedDate;

    @Column(nullable = false, length = 255)
    private String pdfStoragePath;

}

