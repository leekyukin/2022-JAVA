package com.school.boardgame.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface FileRepository extends JpaRepository<FileInfo, Long> {
}
