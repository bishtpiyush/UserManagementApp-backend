package in.ta.main.services;

import java.util.List;

import in.ta.main.models.User;

public interface UserService {
	 List<User> getAll();
	 User add(String firstName, String lastName);
}
