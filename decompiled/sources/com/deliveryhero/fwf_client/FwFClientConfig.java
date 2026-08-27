package com.deliveryhero.fwf_client;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.fwf_http.Region;
import com.deliveryhero.fwf_logger.FwFLogLevel;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFClientConfig {
    private final String accessToken;
    private final Set<String> featureKeys;
    private final long featuresExpirationTime;
    private final List<String> heroDomains;
    private final FwFLogLevel logLevel;
    private final boolean offlineMode;
    private final Region region;
    private final long requestTimeout;
    private final String selfHostedUrl;
    private final boolean updateFeatures;
    private boolean useEvaluationsCache;
    private final boolean useRuntimeKeys;

    public final String getAccessToken$fwf_client_release() {
        return this.accessToken;
    }

    public final Set<String> getFeatureKeys$fwf_client_release() {
        return this.featureKeys;
    }

    public final long getFeaturesExpirationTime$fwf_client_release() {
        return this.featuresExpirationTime;
    }

    public final List<String> getHeroDomains$fwf_client_release() {
        return this.heroDomains;
    }

    public final FwFLogLevel getLogLevel$fwf_client_release() {
        return this.logLevel;
    }

    public final boolean getOfflineMode$fwf_client_release() {
        return this.offlineMode;
    }

    public final Region getRegion$fwf_client_release() {
        return this.region;
    }

    public final long getRequestTimeout$fwf_client_release() {
        return this.requestTimeout;
    }

    public final String getSelfHostedUrl$fwf_client_release() {
        return this.selfHostedUrl;
    }

    public final boolean getUpdateFeatures$fwf_client_release() {
        return this.updateFeatures;
    }

    public final boolean getUseEvaluationsCache$fwf_client_release() {
        return this.useEvaluationsCache;
    }

    public final boolean getUseRuntimeKeys$fwf_client_release() {
        return this.useRuntimeKeys;
    }

    public final void setUseEvaluationsCache$fwf_client_release(boolean z) {
        this.useEvaluationsCache = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FwFClientConfig(String str, Set<String> set, Region region, String str2, Long l, Long l2, Boolean bool, FwFLogLevel fwFLogLevel, Boolean bool2, List<String> list, boolean z) {
        this(str, region == null ? ConstantKt.getDEFAULT_REGION() : region, str2, l != null ? l.longValue() : ConstantKt.DEFAULT_REQUEST_TIMEOUT, l2 != null ? l2.longValue() : 600L, bool != null ? bool.booleanValue() : true, fwFLogLevel == null ? FwFLogLevel.ERROR : fwFLogLevel, bool2 != null ? bool2.booleanValue() : false, list, z);
        str.getClass();
        set.getClass();
        list.getClass();
        addKeys$fwf_client_release(set);
    }

    public final boolean addKeys$fwf_client_release(Set<String> set) {
        set.getClass();
        Set<String> set2 = this.featureKeys;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            String str = (String) obj;
            if (str.length() > 0 && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                arrayList.add(obj);
            }
        }
        return set2.addAll(arrayList);
    }

    public /* synthetic */ FwFClientConfig(String str, Set set, Region region, String str2, Long l, Long l2, Boolean bool, FwFLogLevel fwFLogLevel, Boolean bool2, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, set, (i & 4) != 0 ? null : region, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : bool, (i & Fields.SpotShadowColor) != 0 ? null : fwFLogLevel, (i & Fields.RotationX) != 0 ? null : bool2, (i & Fields.RotationY) != 0 ? instance_delegatelambda0.write : list, (i & Fields.RotationZ) != 0 ? false : z);
    }

    private FwFClientConfig(String str, Region region, String str2, long j, long j2, boolean z, FwFLogLevel fwFLogLevel, boolean z2, List<String> list, boolean z3) {
        this.accessToken = str;
        this.region = region;
        this.selfHostedUrl = str2;
        this.requestTimeout = j;
        this.featuresExpirationTime = j2;
        this.updateFeatures = z;
        this.logLevel = fwFLogLevel;
        this.offlineMode = z2;
        this.heroDomains = list;
        this.useRuntimeKeys = z3;
        this.featureKeys = new LinkedHashSet();
    }
}
