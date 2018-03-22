package com.cyan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cyan.entity.Picture;
import com.cyan.entity.PictureExample;
import com.cyan.mapper.PictureMapper;
import com.cyan.service.PictureService;

@Service
public class PictureServiceImpl implements PictureService{

	@Autowired
	private PictureMapper pictureMapper;
	
	@Transactional
	@Override
	public void uploadPictures(Integer productId, List<String> paths) {
		
		paths.parallelStream().forEach( path -> {
			Picture picture = new Picture();
			picture.setPath(path);
			picture.setProductId(productId);
			pictureMapper.insert(picture);
		});
	}
	
}
