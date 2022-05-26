package br.com.lucasladeira.hrpayroll.entities;

import lombok.Data;

@Data
public class Worker {

    private Long id;

    private String name;

    private Double dailyIncome;
}
