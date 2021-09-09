package com.spring.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.dao.AssetRepo;

import com.spring.crud.entity.Asset;

@Service
public class TeacherImpl implements AssetService {
	
	@Autowired private AssetRepo assetRepo;

	@Override
	public List<Asset> getAllAssetData() {
		
		return assetRepo.findAll();
	}

	@Override
	public Asset createAsset(Asset assetdata) {
		
		return assetRepo.save(assetdata);
	}

	@Override
	public Asset getAssetById(int assetid) {
		
		return assetRepo.findById(assetid).get();
	}


	/*
	 * @Override public TeacherData save(SubjectData subName) {
	 * 
	 * return teacherRepo.save(subName); }
	 */

}
