package com.sds.animalapp.model.volunteer;

import java.util.List;
import java.util.Map;

import com.sds.animalapp.domain.VolunteerNotice;

public interface VolunteerService {
	public int selectCount(); //게시물 수 
	public int selectSearchCount(String keyword); //게시물 수 
	public List selectAll(Map map);//모든 게시물 가져오기
	public List selectSearch(Map map);//모든 게시물 가져오기
	public VolunteerNotice select(VolunteerNotice volunteerNotice);
	public void insert(VolunteerNotice volunteerNotice);
	public void update(VolunteerNotice volunteerNotice);
	public void delete(VolunteerNotice volunteerNotice);	
}
