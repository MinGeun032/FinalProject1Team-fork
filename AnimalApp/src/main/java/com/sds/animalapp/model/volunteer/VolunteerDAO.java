package com.sds.animalapp.model.volunteer;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.sds.animalapp.domain.VolunteerNotice;

@Mapper
public interface VolunteerDAO {
	public int selectCount(); //게시물 수 
	public int selectSearchCount(String keyword); //검색결과 수
	public List selectAll(Map map);//모든 게시물 가져오기
	public List selectSearch(Map map);//검색결과 가져오기
	public VolunteerNotice select(VolunteerNotice volunteer);
	public void insert(VolunteerNotice volunteer);
	public void update(VolunteerNotice volunteer);
	public void delete(VolunteerNotice volunteer);	
}
