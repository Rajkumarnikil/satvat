package com.project.dvr.Service;

import java.time.LocalDate;
import java.util.List;

import com.project.dvr.Entity.Dvr3;
import com.project.dvr.Entity.Dvr3Details;



public interface Dvr3Service {
	
	Dvr3Details saveDvr3(Dvr3Details Dvr3Details);
	Dvr3Details getDvr3DetailsById(long id,Dvr3Details Dvr3Details);
	Dvr3Details updateDvr3DetailsById(long id,Dvr3Details Dvr3Details);
	void deleteDvr3DetailsById(long id,Dvr3Details Dvr3Details);
	List<Dvr3Details> getAllDvr3DetailsByDate(LocalDate startDate,LocalDate endDate);
	Dvr3 saveDvr3new(Dvr3 dvr3);
	List<Dvr3> getAllDvr3();
	List<Dvr3> saveAllDvr3(List<Dvr3> dvr3);
	List<Dvr3Details> getAllDvr3DetailsBySelectDate(LocalDate selectDate);
	List<Dvr3Details> saveAllDvr3Details(List<Dvr3Details> dvr3Details);

}
