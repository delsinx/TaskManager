package Mapper;


import DTO.UserDTO;
import Model.UserModel;

public class UserMapper {
    public UserModel map(UserDTO userDTO) {
        UserModel userModel = new UserModel();

        UserModel.setId(UserDTO.getId());
        UserModel.setName(UserDTO.getName());
        UserModel.setEmail(UserDTO.getEmail());
        UserModel.setPassword(UserDTO.getPassword());
        UserModel.setCreatedAt(UserDTO.getCreatedAt());

        return userModel;
    }

    public UserDTO map(UserModel userModel) {
        UserDTO userDTO = new UserDTO();
        UserModel.setId(UserDTO.getId());
        UserModel.setName(UserDTO.getName());
        UserModel.setEmail(UserDTO.getEmail());
        UserModel.setPassword(UserDTO.getPassword());
        UserModel.setCreatedAt(UserDTO.getCreatedAt());
        return userDTO;
    }

}
