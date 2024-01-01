package edu.sharif.simple;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "simples")
public class SimpleEntity {

    public SimpleEntity(String message) {
        this.message = message;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "message")
    private String message;
}
