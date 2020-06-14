package com.eden.mid.intf.product;

import com.eden.mid.domain.param.product.*;
import com.eden.mid.domain.result.product.*;
import java.util.List;

public interface ProductService {

	Long add(AddProductParam param);

	boolean delete(Long id);

	boolean modify(ModifyProductParam param);

	ProductResult queryById(Long id);

	List<ProductResult> queryList(QueryProductParam param);

}
