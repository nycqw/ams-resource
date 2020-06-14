package com.eden.mid.service.product;

import com.eden.mid.domain.param.product.*;
import com.eden.mid.domain.result.product.*;
import java.util.List;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.stream.Collectors;
import com.eden.mid.entity.ProductEntity;
import com.eden.mid.intf.product.ProductService;

@Service(protocol = "dubbo")
public class ProductServiceImpl implements ProductService {

	@Override
	public Long add(AddProductParam param) {
		ProductEntity entity = new ProductEntity();
		BeanUtils.copyProperties(param, entity);
		entity.insert();
		return entity.getId();
	}

	@Override
	public boolean delete(Long id) {
		ProductEntity entity = new ProductEntity();
		entity.setId(id);
		return entity.deleteById();
	}

	@Override
	public boolean modify(ModifyProductParam param) {
		ProductEntity entity = new ProductEntity();
		BeanUtils.copyProperties(param, entity);
		entity.setUpdatedTime(Timestamp.valueOf(LocalDateTime.now()));
		return entity.updateById();
	}

	@Override
	public ProductResult queryById(Long id) {
		ProductEntity entity = new ProductEntity();
		entity.setId(id);
		ProductResult result = new ProductResult();
		BeanUtils.copyProperties(entity.selectById(), result);
		return result;
	}

	@Override
	public List<ProductResult> queryList(QueryProductParam param) {
		QueryWrapper<ProductEntity> queryWrapper = new QueryWrapper<>();
		ProductEntity entity = new ProductEntity();
		List<ProductEntity> list = entity.selectList(queryWrapper);
		return list.stream().map(el -> {
			ProductResult result = new ProductResult();
			BeanUtils.copyProperties(el, result);
			return result;
		}).collect(Collectors.toList());
	}

}
