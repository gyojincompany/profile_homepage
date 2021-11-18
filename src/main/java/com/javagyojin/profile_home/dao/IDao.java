package com.javagyojin.profile_home.dao;

import java.util.ArrayList;

import com.javagyojin.profile_home.dto.ContentDto;

public interface IDao {
	
	public ArrayList<ContentDto> listDao();
	public void writeDao(String qId, String qName, String qContent, String qEmail);
	public ContentDto qviewDao(String qNum);
	public void deleteDao(String qNum);
	public void modifyDao(String qName, String qContent, String qEmail, String qNum);
	

}
