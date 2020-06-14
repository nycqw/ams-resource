package com.eden.mid.intf.tenant;

import com.eden.mid.domain.param.tenant.*;
import com.eden.mid.domain.result.tenant.*;
import java.util.List;

public interface TenantService {

	Long add(AddTenantParam param);

	boolean delete(Long id);

	boolean modify(ModifyTenantParam param);

	TenantResult queryById(Long id);

	List<TenantResult> queryList(QueryTenantParam param);

}
