package com.todoApp.msproject.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "projects")
@Data
@NoArgsConstructor
public class Project implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String descripton;
    private LocalDateTime cratedAt;
    private LocalDateTime updatedAt;
    
    
    public Project(String name, String descripton, LocalDateTime cratedAt, LocalDateTime updatedAt) {
        this.name = name;
        this.descripton = descripton;
        this.cratedAt = cratedAt;
        this.updatedAt = updatedAt;
    }

    

}
