package Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "tasks")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TasksModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "id")
    private Long id;

    @Column(nullable = false)
    @NotBlank
    @NotEmpty
    @NotNull
    private String title;

    @Column(nullable = false)
    @NotBlank
    @NotEmpty
    @NotNull
    private String description;

    @Column(nullable = false)
    @NotBlank
    @NotEmpty
    @NotNull
    private String status;

    @Column(nullable = false)
    private Date dueDate;

    @Column(nullable = false)
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "user_id")
    private UserModel user;

    private LocalDateTime createAt = LocalDateTime.now();
    private LocalDateTime updateAt;

}
