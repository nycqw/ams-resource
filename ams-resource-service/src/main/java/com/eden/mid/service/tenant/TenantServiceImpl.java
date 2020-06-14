package com.eden.mid.service.tenant;

import com.eden.mid.domain.param.tenant.*;
import com.eden.mid.domain.result.tenant.*;
import java.util.List;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.stream.Collectors;
import com.eden.mid.entity.TenantEntity;
import com.eden.mid.intf.tenant.TenantService;

@Service(protocol = "dubbo")
public class TenantServiceImpl implements TenantService {

	@Override
	public Long add(AddTenantParam param) {
		TenantEntity entity = new TenantEntity();
		BeanUtils.copyProperties(param, entity);
		entity.insert();
		return entity.getId();
	}

	@Override
	public boolean delete(Long id) {
		TenantEntity entity = new TenantEntity();
		entity.setId(id);
		return entity.deleteById();
	}

	@Override
	public boolean modify(ModifyTenantParam param) {
		TenantEntity entity = new TenantEntity();
		BeanUtils.copyProperties(param, entity);
		entity.setUpdatedTime(Timestamp.valueOf(LocalDateTime.now()));
		return entity.updateById();
	}

	@Override
	public TenantResult queryById(Long id) {
		TenantEntity entity = new TenantEntity();
		entity.setId(id);
		TenantResult result = new TenantResult();
		BeanUtils.copyProperties(entity.selectById(), result);
		return result;
	}

	@Override
	public List<TenantResult> queryList(QueryTenantParam param) {
		QueryWrapper<TenantEntity> queryWrapper = new QueryWrapper<>();
		TenantEntity entity = new TenantEntity();
		List<TenantEntity> list = entity.selectList(queryWrapper);
		return list.stream().map(el -> {
			TenantResult result = new TenantResult();
			BeanUtils.copyProperties(el, result);
			return result;
		}).collect(Collectors.toList());
	}

}
