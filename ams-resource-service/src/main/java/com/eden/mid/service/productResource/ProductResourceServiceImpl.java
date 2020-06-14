package com.eden.mid.service.productResource;

import com.eden.mid.domain.param.productResource.*;
import com.eden.mid.domain.result.productResource.*;
import java.util.List;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.stream.Collectors;
import com.eden.mid.entity.ProductResourceEntity;
import com.eden.mid.intf.productResource.ProductResourceService;

@Service(protocol = "dubbo")
public class ProductResourceServiceImpl implements ProductResourceService {

	@Override
	public Long add(AddProductResourceParam param) {
		ProductResourceEntity entity = new ProductResourceEntity();
		BeanUtils.copyProperties(param, entity);
		entity.insert();
		return entity.getId();
	}

	@Override
	public boolean delete(Long id) {
		ProductResourceEntity entity = new ProductResourceEntity();
		entity.setId(id);
		return entity.deleteById();
	}

	@Override
	public boolean modify(ModifyProductResourceParam param) {
		ProductResourceEntity entity = new ProductResourceEntity();
		BeanUtils.copyProperties(param, entity);
		entity.setUpdatedTime(Timestamp.valueOf(LocalDateTime.now()));
		return entity.updateById();
	}

	@Override
	public ProductResourceResult queryById(Long id) {
		ProductResourceEntity entity = new ProductResourceEntity();
		entity.setId(id);
		ProductResourceResult result = new ProductResourceResult();
		BeanUtils.copyProperties(entity.selectById(), result);
		return result;
	}

	@Override
	public List<ProductResourceResult> queryList(QueryProductResourceParam param) {
		QueryWrapper<ProductResourceEntity> queryWrapper = new QueryWrapper<>();
		ProductResourceEntity entity = new ProductResourceEntity();
		List<ProductResourceEntity> list = entity.selectList(queryWrapper);
		return list.stream().map(el -> {
			ProductResourceResult result = new ProductResourceResult();
			BeanUtils.copyProperties(el, result);
			return result;
		}).collect(Collectors.toList());
	}

}
