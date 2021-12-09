package ru.klokov.restguitarproject.persistence.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.klokov.restguitarproject.model.dto.AccordDTO;

@Component
public class AdminAccordRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AdminAccordRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(AccordDTO accordDTO) {
        String sql = "INSERT INTO accords (name, fingers_position) VALUES (?, ?)";
        jdbcTemplate.update(sql, accordDTO.getName(), accordDTO.getFingerPosition());
    }
}

