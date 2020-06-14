package com.eden.mid.intf.app;

import com.eden.mid.domain.param.app.*;
import com.eden.mid.domain.result.app.*;
import java.util.List;

public interface AppService {

	Long add(AddAppParam param);

	boolean delete(Long id);

	boolean modify(ModifyAppParam param);

	AppResult queryById(Long id);

	List<AppResult> queryList(QueryAppParam param);

}
