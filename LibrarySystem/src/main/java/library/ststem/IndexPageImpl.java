package library.ststem;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "indexPage")
@RequestScoped
public class IndexPageImpl {

    /** ユーザID */
    private String userId = null;

    /** パスワード */
    private String password = null;

    public String login() {


        System.out.println(userId);
        System.out.println(password);

        return "resultPage.xhtml";
    }

	/**
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId セットする userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}