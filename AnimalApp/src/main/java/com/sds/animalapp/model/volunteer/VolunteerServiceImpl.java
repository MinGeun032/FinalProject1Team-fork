package com.sds.animalapp.model.volunteer;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sds.animalapp.domain.VolunteerNotice;

@Service
public class VolunteerServiceImpl implements VolunteerService {
	
	@Autowired
	VolunteerDAO volunteerDAO;

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	//봉사List모두 가져오기
	public List selectAll(Map map) {
		
		return volunteerDAO.selectAll(map);
	}

	@Override
	public VolunteerNotice select(VolunteerNotice volunteerNotice) {
		// TODO Auto-generated method stub
		return null;
	}

	//글 등록
	public void insert(VolunteerNotice volunteerNotice) {
		volunteerDAO.insert(volunteerNotice);
	}

	@Override
	public void update(VolunteerNotice volunteerNotice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(VolunteerNotice volunteerNotice) {
		// TODO Auto-generated method stub
		
	}

}
