package interviewquestion_70;

import java.util.Optional;

public class OptionalExample {

	public Optional<String> findUserNameById(int userId) {

		if (userId == 0) {
			return Optional.ofNullable(null);
		} else {
			return Optional.ofNullable("Aman");
		}
	}

	public static void main(String[] args) {
		OptionalExample userDatabase = new OptionalExample();
		
		Optional<String> userName = userDatabase.findUserNameById(0);

		userName.ifPresentOrElse(user -> System.out.println(user),
				() -> System.out.println("User Not Found")); 
	}
}
 // User Not Found
