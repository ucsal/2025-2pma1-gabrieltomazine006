package cms.user;

public class AdminUser extends User {

	public AdminUser(int id, String nome, String email, String password) {
		super(id, nome, email, password);
		// TODO Auto-generated constructor stub
	}

	public void deleteContent(int contentId) {
		/* exclusivo do admin */ }
}
