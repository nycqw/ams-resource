package com.eden.mid.service.tenantProduct;

import com.eden.mid.domain.param.tenantProduct.*;
import com.eden.mid.domain.result.tenantProduct.*;
import java.util.List;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.stream.Collectors;
import com.eden.mid.entity.TenantProductEntity;
import com.eden.mid.intf.tenantProduct.TenantProductService;

@Service(protocol = "dubbo")
public class TenantProductServiceImpl implements TenantProductService {

	@Override
	public Long add(AddTenantProductParam param) {
		TenantProductEntity entity = new TenantProductEntity();
		BeanUtils.copyProperties(param, entity);
		entity.insert();
		return entity.getId();
	}

	@Override
	public boolean delete(Long id) {
		TenantProductEntity entity = new TenantProductEntity();
		entity.setId(id);
		return entity.deleteById();
	}

	@Override
	public boolean modify(ModifyTenantProductParam param) {
		TenantProductEntity entity = new TenantProductEntity();
		BeanUtils.copyProperties(param, entity);
		entity.setUpdatedTime(Timestamp.valueOf(LocalDateTime.now()));
		return entity.updateById();
	}

	@Override
	public TenantProductResult queryById(Long id) {
		TenantProductEntity entity = new TenantProductEntity();
		entity.setId(id);
		TenantProductResult result = new TenantProductResult();
		BeanUtils.copyProperties(entity.selectById(), result);
		return result;
	}

	@Override
	public List<TenantProductResult> queryList(QueryTenantProductParam param) {
		QueryWrapper<TenantProductEntity> queryWrapper = new QueryWrapper<>();
		TenantProductEntity entity = new TenantProductEntity();
		List<TenantProductEntity> list = entity.selectList(queryWrapper);
		return list.stream().map(el -> {
			TenantProductResult result = new TenantProductResult();
			BeanUtils.copyProperties(el, result);
			return result;
		}).collect(Collectors.toList());
	}

}
