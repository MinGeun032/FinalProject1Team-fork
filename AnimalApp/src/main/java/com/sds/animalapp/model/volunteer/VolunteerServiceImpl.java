package com.sds.animalapp.model.volunteer;

import java.util.List;
import java.util.Map;

import com.sds.animalapp.domain.Volunteer;

public class VolunteerServiceImpl implements VolunteerService {
	
	VolunteerDAO volunteerDAO;

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List selectAll(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Volunteer select(Volunteer volunteer) {
		// TODO Auto-generated method stub
		return null;
	}

	//글 등록
	public void insert(Volunteer volunteer) {
		volunteerDAO.insert(volunteer);
	}

	@Override
	public void update(Volunteer volunteer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Volunteer volunteer) {
		// TODO Auto-generated method stub
		
	}

}
