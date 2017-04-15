package com.znv.zhdaily.app;


/**
 * Created by znv on 2017/3/29.
 */


public interface BasePresenter<V extends BaseView> {



    void subscribe();

    void unsubscribe();

    void setView(V view);


}
