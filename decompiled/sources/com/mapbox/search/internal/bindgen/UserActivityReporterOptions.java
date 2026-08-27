package com.mapbox.search.internal.bindgen;

import bo.app.af$$ExternalSyntheticOutline1;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.SdkInformation;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes3.dex */
public class UserActivityReporterOptions implements Serializable {
    private final String eventsUrl;
    private final SdkInformation sdkInformation;
    private final long sendEventsDebounce;
    private final long sendEventsInterval;

    @Deprecated
    public String getEventsUrl() {
        return this.eventsUrl;
    }

    public SdkInformation getSdkInformation() {
        return this.sdkInformation;
    }

    public long getSendEventsDebounce() {
        return this.sendEventsDebounce;
    }

    public long getSendEventsInterval() {
        return this.sendEventsInterval;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.sdkInformation, this.eventsUrl, Long.valueOf(this.sendEventsDebounce), Long.valueOf(this.sendEventsInterval));
    }

    public UserActivityReporterOptions(SdkInformation sdkInformation, String str) {
        this.sdkInformation = sdkInformation;
        this.eventsUrl = str;
        this.sendEventsDebounce = 5L;
        this.sendEventsInterval = ConstantsKt.DEFAULT_PROFILE_TTL;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[sdkInformation: ");
        sb.append(RecordUtils.fieldToString(this.sdkInformation));
        sb.append(", eventsUrl: ");
        IconCompatParcelizer.read(sb, this.eventsUrl, ", sendEventsDebounce: ");
        af$$ExternalSyntheticOutline1.m(this.sendEventsDebounce, ", sendEventsInterval: ", sb);
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.sendEventsInterval, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserActivityReporterOptions userActivityReporterOptions = (UserActivityReporterOptions) obj;
        return Objects.equals(this.sdkInformation, userActivityReporterOptions.sdkInformation) && Objects.equals(this.eventsUrl, userActivityReporterOptions.eventsUrl) && this.sendEventsDebounce == userActivityReporterOptions.sendEventsDebounce && this.sendEventsInterval == userActivityReporterOptions.sendEventsInterval;
    }

    public UserActivityReporterOptions(SdkInformation sdkInformation, String str, long j, long j2) {
        this.sdkInformation = sdkInformation;
        this.eventsUrl = str;
        this.sendEventsDebounce = j;
        this.sendEventsInterval = j2;
    }
}
