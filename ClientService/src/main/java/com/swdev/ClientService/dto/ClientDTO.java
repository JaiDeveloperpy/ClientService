package com.swdev.ClientService.dto;
import com.swdev.ClientService.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    @Size(min = 3, max = 80, message = "Precisa ter entre 3 e 80 caracteres")
    @NotBlank(message = "Campo requerido")
    private String name;
    private String cpf;
    @Positive(message = "Precisa ser maior ou igual a 0")
    private Double income;
    private LocalDate birthDate;
    @Positive(message = "Precisa ser maior ou igual a 0")
    private Integer children;


    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {

        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }
    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}

