package Commerce.Service;

import Commerce.Entity.User;
import Commerce.Repository.UserRepository;
import Commerce.Request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String AddUser(UserRequest userRequest) {
        User u = new User();
        u.setId(userRequest.getId());
        u.setUserName(userRequest.getUserName());
        u.setContactNumber(userRequest.getContactNumber());
        u.setEmail(userRequest.getEmail());
        u.setPinCode(userRequest.getPinCode());
        u.setLandMark(userRequest.getLandMark());
        u.setAddress(userRequest.getAddress());
        u.setCreatedAt(userRequest.getCreatedAt());
        u.setCreatedBy(userRequest.getCreatedBy());
        u.setUpdatedAt(userRequest.getUpdatedAt());
        u.setUpdatedBy(userRequest.getUpdatedBy());

        userRepository.save(u);
        return "user added successfully";
    }
}
