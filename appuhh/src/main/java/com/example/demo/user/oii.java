package com.example.demo.user;

	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
@Entity
	public class oii {

		@Id
		private int Id;
		private String name;
		private int Age;
		private String DoB;
		private String Fathername;
		private String Mothername;
		private String phonenumber;
		private String Email;
		private int Password;
		public oii(int id, String name, int age, String doB, String fathername, String mothername, String phonenumber,
				String email, int password) {
			super();
			Id = id;
			this.name = name;
			Age = age;
			DoB = doB;
			Fathername = fathername;
			Mothername = mothername;
			this.phonenumber = phonenumber;
			Email = email;
			Password = password;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
		public String getDoB() {
			return DoB;
		}
		public void setDoB(String doB) {
			DoB = doB;
		}
		public String getFathername() {
			return Fathername;
		}
		public void setFathername(String fathername) {
			Fathername = fathername;
		}
		public String getMothername() {
			return Mothername;
		}
		public void setMothername(String mothername) {
			Mothername = mothername;
		}
		public String getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public int getPassword() {
			return Password;
		}
		public void setPassword(int password) {
			Password = password;
		}
		public oii() {
			super();
			// TODO Auto-generated constructor stub
		}

}
