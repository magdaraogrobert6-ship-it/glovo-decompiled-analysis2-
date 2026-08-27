package com.sentiance.sdk.services;

import o.BannersDataStoreProviderCompanion;
import o.HtmlUtils;
import o.getHtmlSpannedTextIfEnabled;
import o.r8lambdaGV766sOYYCl0YYkk8QccVU5zR38;

/* JADX INFO: loaded from: classes3.dex */
public enum ServiceType {
    BACKGROUND("background"),
    FOREGROUND("foreground");

    private String mDescription;

    @Override // java.lang.Enum
    public String toString() {
        return this.mDescription;
    }

    public Class<? extends r8lambdaGV766sOYYCl0YYkk8QccVU5zR38> getServiceClass() {
        return BannersDataStoreProviderCompanion.serializer[ordinal()] != 1 ? getHtmlSpannedTextIfEnabled.class : HtmlUtils.class;
    }

    ServiceType(String str) {
        this.mDescription = str;
    }
}
