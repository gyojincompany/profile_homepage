package com.javagyojin.profile_home.dto;

public class ContentDto {
		
	//board dto
	private int qNum;
	private String qId;
	private String qName;
	private String qContent;
	private String qEmail;
	private String qDate;
	
	//member dto
	private String mId;
	private String mPw;
	private String mName;
	private String mEmail;
	private String mDate;
	
	public ContentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public ContentDto(int qNum, String qId, String qName, String qContent, String qEmail, String qDate, String mId,
			String mPw, String mName, String mEmail, String mDate) {
		super();
		this.qNum = qNum;
		this.qId = qId;
		this.qName = qName;
		this.qContent = qContent;
		this.qEmail = qEmail;
		this.qDate = qDate;
		this.mId = mId;
		this.mPw = mPw;
		this.mName = mName;
		this.mEmail = mEmail;
		this.mDate = mDate;
	}

	

	public String getmId() {
		return mId;
	}



	public void setmId(String mId) {
		this.mId = mId;
	}



	public String getmPw() {
		return mPw;
	}



	public void setmPw(String mPw) {
		this.mPw = mPw;
	}



	public String getmName() {
		return mName;
	}



	public void setmName(String mName) {
		this.mName = mName;
	}



	public String getmEmail() {
		return mEmail;
	}



	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}



	public String getmDate() {
		return mDate;
	}



	public void setmDate(String mDate) {
		this.mDate = mDate;
	}



	public int getqNum() {
		return qNum;
	}

	public void setqNum(int qNum) {
		this.qNum = qNum;
	}

	public String getqId() {
		return qId;
	}

	public void setqId(String qId) {
		this.qId = qId;
	}

	public String getqName() {
		return qName;
	}

	public void setqName(String qName) {
		this.qName = qName;
	}

	public String getqContent() {
		return qContent;
	}

	public void setqContent(String qContent) {
		this.qContent = qContent;
	}

	public String getqEmail() {
		return qEmail;
	}

	public void setqEmail(String qEmail) {
		this.qEmail = qEmail;
	}

	public String getqDate() {
		return qDate;
	}

	public void setqDate(String qDate) {
		this.qDate = qDate;
	}
	
	
	
}
