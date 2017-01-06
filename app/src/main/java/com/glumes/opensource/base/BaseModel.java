package com.glumes.opensource.base;

import com.glumes.opensource.mvp.IModel;
import com.glumes.opensource.net.NetworkApi;
import com.glumes.opensource.net.entity.BaseResult;

import java.util.List;

import rx.Observable;

/**
 * Created by zhaoying on 2016/11/25.
 */

public class BaseModel implements IModel<Observable<List<BaseResult>>> {

    @Override
    public Observable<List<BaseResult>> getData(int type, int page, int num) {
        return NetworkApi.getInstance().getData(type,page,num);
    }
}