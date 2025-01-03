package com.maxiflexy.model;

import com.maxiflexy.domain.HomeCategorySection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class HomeCategory {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String name;
    private String image;
    private String categoryId;
    private HomeCategorySection section;
}