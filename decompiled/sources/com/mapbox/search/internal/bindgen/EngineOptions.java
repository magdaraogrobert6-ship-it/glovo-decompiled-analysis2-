package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.SdkInformation;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public class EngineOptions implements Serializable {
    private final ApiType apiType;
    private final String baseUrl;
    private final String eventsUrl;
    private final Integer onlineRequestTimeout;
    private final SdkInformation sdkInformation;

    public ApiType getApiType() {
        return this.apiType;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    @Deprecated
    public String getEventsUrl() {
        return this.eventsUrl;
    }

    public Integer getOnlineRequestTimeout() {
        return this.onlineRequestTimeout;
    }

    public SdkInformation getSdkInformation() {
        return this.sdkInformation;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.baseUrl, this.apiType, this.sdkInformation, this.eventsUrl, this.onlineRequestTimeout);
    }

    public EngineOptions(String str, ApiType apiType, SdkInformation sdkInformation, String str2, Integer num) {
        this.baseUrl = str;
        this.apiType = apiType;
        this.sdkInformation = sdkInformation;
        this.eventsUrl = str2;
        this.onlineRequestTimeout = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[baseUrl: ");
        IconCompatParcelizer.read(sb, this.baseUrl, ", apiType: ");
        sb.append(RecordUtils.fieldToString(this.apiType));
        sb.append(", sdkInformation: ");
        sb.append(RecordUtils.fieldToString(this.sdkInformation));
        sb.append(", eventsUrl: ");
        IconCompatParcelizer.read(sb, this.eventsUrl, ", onlineRequestTimeout: ");
        sb.append(RecordUtils.fieldToString(this.onlineRequestTimeout));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EngineOptions engineOptions = (EngineOptions) obj;
        return Objects.equals(this.baseUrl, engineOptions.baseUrl) && Objects.equals(this.apiType, engineOptions.apiType) && Objects.equals(this.sdkInformation, engineOptions.sdkInformation) && Objects.equals(this.eventsUrl, engineOptions.eventsUrl) && Objects.equals(this.onlineRequestTimeout, engineOptions.onlineRequestTimeout);
    }
}
