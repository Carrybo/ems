package com.nts.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Component
@Table(name = "e_emp")
public class Emp {
    @Id
    private String id;
    private String name;
    private Double salary;
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date bir;
}
