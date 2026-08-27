package com.deliveryhero.fwf_client.model;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.SimpleItemTouchHelperCallback;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class DecodeResult {
    private final String error;
    private final Map<String, Boolean> features;

    public final Map<String, Boolean> component1() {
        return this.features;
    }

    public final String component2() {
        return this.error;
    }

    public final String getError() {
        return this.error;
    }

    public final Map<String, Boolean> getFeatures() {
        return this.features;
    }

    public int hashCode() {
        int iHashCode = this.features.hashCode();
        String str = this.error;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DecodeResult(features=" + this.features + ", error=" + this.error + ")";
    }

    public /* synthetic */ DecodeResult(Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SimpleItemTouchHelperCallback.serializer : map, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DecodeResult copy$default(DecodeResult decodeResult, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = decodeResult.features;
        }
        if ((i & 2) != 0) {
            str = decodeResult.error;
        }
        return decodeResult.copy(map, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecodeResult)) {
            return false;
        }
        DecodeResult decodeResult = (DecodeResult) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.features, decodeResult.features}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.error, decodeResult.error}, getCieXyz.write())).booleanValue();
    }

    public final DecodeResult copy(Map<String, Boolean> map, String str) {
        map.getClass();
        return new DecodeResult(map, str);
    }

    public DecodeResult(Map<String, Boolean> map, String str) {
        map.getClass();
        this.features = map;
        this.error = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DecodeResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
