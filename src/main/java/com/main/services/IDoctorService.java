package com.main.services;
import java.util.List;
import com.main.entity.Doctor;

public interface IDoctorService 
{
     public String deleteDoctorsByIdsInBatch(List<Integer> ids);
     public List<Doctor> findAllDoctorByIds(List<Integer> ids);
}
