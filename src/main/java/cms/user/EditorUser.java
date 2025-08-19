package cms.user;

public class EditorUser  extends User {
	

	public EditorUser(int id, String nome, String email, String password) {
		super(id, nome, email, password);
		// TODO Auto-generated constructor stub
	}

	public void editContent(int contentId, String body) {
		/* exclusivo do editor */ }
}
