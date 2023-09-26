package dio.rest.service;

import dio.rest.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);

}
