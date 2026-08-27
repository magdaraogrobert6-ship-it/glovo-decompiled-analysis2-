package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* JADX INFO: loaded from: classes4.dex */
public class JosBaseReq implements IMessageEntity {

    @Packed
    private String channelId;

    @Packed
    private String cpId;

    @Packed
    private String hmsSdkVersionName;

    private static <T> T get(T t) {
        return t;
    }

    public void setChannelId(String str) {
        this.channelId = str;
    }

    public void setCpID(String str) {
        this.cpId = str;
    }

    public void setHmsSdkVersionName(String str) {
        this.hmsSdkVersionName = str;
    }

    public String getChannelId() {
        return (String) get(this.channelId);
    }

    public String getCpID() {
        return (String) get(this.cpId);
    }

    public String getHmsSdkVersionName() {
        return (String) get(this.hmsSdkVersionName);
    }
}
