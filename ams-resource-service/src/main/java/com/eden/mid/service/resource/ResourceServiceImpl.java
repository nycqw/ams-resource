package com.eden.mid.service.resource;

import com.eden.mid.domain.param.resource.*;
import com.eden.mid.domain.result.resource.*;
import java.util.List;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.stream.Collectors;
import com.eden.mid.entity.ResourceEntity;
import com.eden.mid.intf.resource.ResourceService;

@Service(protocol = "dubbo")
public class ResourceServiceImpl implements ResourceService {

	@Override
	public Long add(AddResourceParam param) {
		ResourceEntity entity = new ResourceEntity();
		BeanUtils.copyProperties(param, entity);
		entity.insert();
		return entity.getId();
	}

	@Override
	public boolean delete(Long id) {
		ResourceEntity entity = new ResourceEntity();
		entity.setId(id);
		return entity.deleteById();
	}

	@Override
	public boolean modify(ModifyResourceParam param) {
		ResourceEntity entity = new ResourceEntity();
		BeanUtils.copyProperties(param, entity);
		entity.setUpdatedTime(Timestamp.valueOf(LocalDateTime.now()));
		return entity.updateById();
	}

	@Override
	public ResourceResult queryById(Long id) {
		ResourceEntity entity = new ResourceEntity();
		entity.setId(id);
		ResourceResult result = new ResourceResult();
		BeanUtils.copyProperties(entity.selectById(), result);
		return result;
	}

	@Override
	public List<ResourceResult> queryList(QueryResourceParam param) {
		QueryWrapper<ResourceEntity> queryWrapper = new QueryWrapper<>();
		ResourceEntity entity = new ResourceEntity();
		List<ResourceEntity> list = entity.selectList(queryWrapper);
		return list.stream().map(el -> {
			ResourceResult result = new ResourceResult();
			BeanUtils.copyProperties(el, result);
			return result;
		}).collect(Collectors.toList());
	}

}
