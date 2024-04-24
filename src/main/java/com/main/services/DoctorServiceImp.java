package com.main.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.main.entity.Doctor;
import com.main.repository.IDoctorRepository;

@Service("docService")
public class DoctorServiceImp implements IDoctorService 
{
	@Autowired
	private IDoctorRepository repo;

	@Override
	public String deleteDoctorsByIdsInBatch(List<Integer> ids) 
	{
		List<Doctor> idList = repo.findAllById(ids);
		repo.deleteAllByIdInBatch(ids);
		
		return idList.size()+" no. of records are deleted";
	}

	@Override
	public List<Doctor> findAllDoctorByIds(List<Integer> ids) 
	{
		 
		return repo.findAllById(ids);
	}

}
