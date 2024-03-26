package org.pbp.reviewservice.mapper;

import org.pbp.reviewservice.document.Review;
import org.pbp.reviewservice.dto.ReviewDto;

public interface ReviewMapper {

    static ReviewDto mapToDto(Review review) {
        return ReviewDto.builder()
                .id(review.getId())
                .customer(review.getCustomer())
                .comment(review.getComment())
                .rating(review.getRating())
                .createdAt(review.getCreatedAt())
                .updatedAt(review.getUpdatedAt())
                .build();
    }

    static Review mapToReview(ReviewDto reviewDto) {
        return Review.builder()
                .id(reviewDto.getId())
                .customer(reviewDto.getCustomer())
                .comment(reviewDto.getComment())
                .rating(reviewDto.getRating())
                .createdAt(reviewDto.getCreatedAt())
                .updatedAt(reviewDto.getUpdatedAt())
                .build();
    }
}
