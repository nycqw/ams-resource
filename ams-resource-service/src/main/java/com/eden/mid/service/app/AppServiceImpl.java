package com.eden.mid.service.app;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.eden.core.util.ExceptionThrower;
import com.eden.mid.constants.ResourceResultEnum;
import com.eden.mid.domain.param.app.AddAppParam;
import com.eden.mid.domain.param.app.ModifyAppParam;
import com.eden.mid.domain.param.app.QueryAppParam;
import com.eden.mid.domain.result.app.AppResult;
import com.eden.mid.entity.AppEntity;
import com.eden.mid.intf.app.AppService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@CacheConfig(cacheNames = "appCache")
@Slf4j
@Service(protocol = "dubbo")
public class AppServiceImpl implements AppService {

	@Override
	public Long add(AddAppParam param) {
		AppEntity entity = new AppEntity();
		QueryWrapper<AppEntity> wrapper = new QueryWrapper<>();
		wrapper.eq("code", param.getCode());
		if (entity.selectCount(wrapper) > 0) {
			ExceptionThrower.export(ResourceResultEnum.APP_EXIST);
		}

		BeanUtils.copyProperties(param, entity);
		entity.insert();
		return entity.getId();
	}

	@Override
	public boolean delete(Long id) {
		AppEntity entity = new AppEntity();
		entity.setId(id);
		return entity.deleteById();
	}

	@Override
	public boolean modify(ModifyAppParam param) {
		AppEntity entity = new AppEntity();
		BeanUtils.copyProperties(param, entity);
		entity.setUpdatedTime(Timestamp.valueOf(LocalDateTime.now()));
		return entity.updateById();
	}

	@Override
	public AppResult queryById(Long id) {
		AppEntity entity = new AppEntity();
		entity.setId(id);
		AppResult result = new AppResult();
		BeanUtils.copyProperties(entity.selectById(), result);
		return result;
	}

	@Override
	@Cacheable
	public List<AppResult> queryList(QueryAppParam param) {
		QueryWrapper<AppEntity> queryWrapper = new QueryWrapper<>();
		AppEntity entity = new AppEntity();
		List<AppEntity> list = entity.selectList(queryWrapper);
		return list.stream().map(el -> {
			AppResult result = new AppResult();
			BeanUtils.copyProperties(el, result);
			return result;
		}).collect(Collectors.toList());
	}

}
