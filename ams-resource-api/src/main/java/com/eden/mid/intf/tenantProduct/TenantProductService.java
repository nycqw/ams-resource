package com.eden.mid.intf.tenantProduct;

import com.eden.mid.domain.param.tenantProduct.*;
import com.eden.mid.domain.result.tenantProduct.*;
import java.util.List;

public interface TenantProductService {

	Long add(AddTenantProductParam param);

	boolean delete(Long id);

	boolean modify(ModifyTenantProductParam param);

	TenantProductResult queryById(Long id);

	List<TenantProductResult> queryList(QueryTenantProductParam param);

}
