package com.ImageSender.ImageSender.repository;

import com.ImageSender.ImageSender.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity, Long> {
}
