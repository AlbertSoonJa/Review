package test_review.DAO;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class ReviewDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @Column
    private Long userId;

    @Column
    private Long productId;

    @Column
    private int rating;

    @Column(columnDefinition = "TEXT")
    private String comment;

    @Column
    private LocalDate reviewDate;

    @Column(nullable = true)
    private String uploadPicture;

}