package user;

import exceptions.InvalidPasswordException;

public class User {
	private String nickname;
	private String password;
	private String email;
	
	
	public User(String nm, String pswd, String eml) {
		this.nickname=nm;
		this.password=pswd;
		this.email=eml;
		
	}
		
		
		public String getNickname() {
			return nickname;
		}
		
		public void setNickname(String nkm) {
			this.nickname=nkm;
		}
	
		public String getPassword() {
			return password;
		}
		
		public void setPassword (String pwv) throws InvalidPasswordException{
			if(pwv.length()>=8) {
				this.password=pwv;
				
				
			}else{
				
				throw new InvalidPasswordException("The password that you had introduced is not suitable, Try using another one.");
			}
		}
		
		
		
		
		
}
