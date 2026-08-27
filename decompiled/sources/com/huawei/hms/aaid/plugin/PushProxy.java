package com.huawei.hms.aaid.plugin;

import android.content.Context;
import com.huawei.hms.common.ApiException;
import o.setShouldUseDispatchDrawui;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface PushProxy {
    void deleteAllToken(Context context) throws ApiException;

    void deleteToken(Context context, String str, String str2) throws ApiException;

    JSONObject getPlatform();

    String getProxyType();

    void getToken(Context context, String str, String str2) throws ApiException;

    setShouldUseDispatchDrawui subscribe(Context context, String str, String str2);

    setShouldUseDispatchDrawui turnOff(Context context, String str);

    setShouldUseDispatchDrawui turnOn(Context context, String str);

    setShouldUseDispatchDrawui unsubscribe(Context context, String str, String str2);
}
