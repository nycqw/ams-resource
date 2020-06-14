package com.eden.mid.intf.productResource;

import com.eden.mid.domain.param.productResource.*;
import com.eden.mid.domain.result.productResource.*;
import java.util.List;

public interface ProductResourceService {

	Long add(AddProductResourceParam param);

	boolean delete(Long id);

	boolean modify(ModifyProductResourceParam param);

	ProductResourceResult queryById(Long id);

	List<ProductResourceResult> queryList(QueryProductResourceParam param);

}
