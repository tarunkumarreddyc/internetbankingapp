package com.cg.iba.entities;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Admin extends Userr{
//		private long adminId;
		private String adminName;
		private String adminContact;
		private String adminEmailId;
		
		
//		public long getAdminId() {
//			return adminId;
//		}
//
//		public void setAdminId(long adminId) {
//			this.adminId = adminId;
//		}

		public String getAdminName() {
			return adminName;
		}

		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}

		public String getAdminContact() {
			return adminContact;
		}

		public void setAdminContact(String adminContact) {
			this.adminContact = adminContact;
		}

		public String getAdminEmailId() {
			return adminEmailId;
		}

		public void setAdminEmailId(String adminEmailId) {
			this.adminEmailId = adminEmailId;
		}

		@Override
		public String toString() {
			return "Admin [adminName=" + adminName + ", adminContact=" + adminContact + ", adminEmailId=" + adminEmailId
					+ ", getUserId()=" + getUserId() + ", getPassword()=" + getPassword() + ", getRole()=" + getRole()
					+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ "]";
		}


}
