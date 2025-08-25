package in.ta.main.services;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import in.ta.main.models.User;

@Service
public class InMemoryUserService implements UserService{

	
    private final CopyOnWriteArrayList<User> store = new CopyOnWriteArrayList<>();
    private final AtomicLong idSeq = new AtomicLong(1);
    
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return store;
	}

	@Override
	public User add(String firstName, String lastName) {
		// TODO Auto-generated method stub
		 Long id = idSeq.getAndIncrement();
	     User user = new User(id, firstName, lastName);
	     store.add(user);
	     return user;
	}

}
