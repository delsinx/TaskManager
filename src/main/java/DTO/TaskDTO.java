package DTO;

import Model.UserModel;

import java.time.LocalDateTime;

public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private String status;
    private String dueDate;
    private UserModel userId;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

}
