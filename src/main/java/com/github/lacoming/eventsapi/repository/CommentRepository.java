package com.github.lacoming.eventsapi.repository;

import com.github.lacoming.eventsapi.entity.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    Page<Comment> findAllByEventId(Long eventId, Pageable pageable);

    boolean existsByIdAndEventIdAndUserId(Long id, Long event, Long userId);

}
