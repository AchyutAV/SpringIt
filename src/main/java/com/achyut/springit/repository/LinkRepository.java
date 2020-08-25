package com.achyut.springit.repository;

import com.achyut.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
}
