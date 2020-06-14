package com.eden.mid.intf.resource;

import com.eden.mid.domain.param.resource.*;
import com.eden.mid.domain.result.resource.*;
import java.util.List;

public interface ResourceService {

	Long add(AddResourceParam param);

	boolean delete(Long id);

	boolean modify(ModifyResourceParam param);

	ResourceResult queryById(Long id);

	List<ResourceResult> queryList(QueryResourceParam param);

}
