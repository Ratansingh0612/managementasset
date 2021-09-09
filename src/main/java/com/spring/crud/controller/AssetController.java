package com.spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.entity.Asset;

import com.spring.crud.service.AssetService;


@RestController
@RequestMapping("/asset")
public class AssetController {
	
	

	
	@Autowired private AssetService assetservice;
	
	
	
	
	@GetMapping("/startasset")
	public String start() {
		return "everything is okk for asset";
		
	}
	
	
	@GetMapping("/allasset")
	List<Asset> getAllAsset() {
		
		return assetservice.getAllAssetData();
		
	}
	
	
	
	
	@PostMapping("/addAsset")
 	Asset addAsset(@RequestBody Asset st) {
		return assetservice.createAsset(st);
		
	}
	
	
	
	
	@GetMapping("/getByAssetId/{id}")
	Asset getById(@PathVariable("id") int assetId) {
		Asset assetidd=new Asset();
		assetidd=assetservice.getAssetById(assetId);
		return assetidd;
		
	}
	



}
