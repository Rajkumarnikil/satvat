package com.project.dvr.Service;

import java.util.List;

import com.project.dvr.Entity.Dvr1;

public interface Dvr1NewService {
	
	Dvr1 saveDvr1(Dvr1 dvr1);
	List<Dvr1> getAllDvr1();
	List<Dvr1> saveAllDvr3Details(List<Dvr1> dvr);

}
