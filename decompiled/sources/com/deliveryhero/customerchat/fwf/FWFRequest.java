package com.deliveryhero.customerchat.fwf;

import androidx.compose.ui.text.android.LayoutCompat;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;
import o.getCieXyz;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class FWFRequest {
    public final Custom custom;
    public final List featureList;
    public final String userId;

    public FWFRequest(@getDensityDpi(serializer = "custom") Custom custom, @getDensityDpi(serializer = "featureList") List<String> list, @getDensityDpi(serializer = "userId") String str) {
        list.getClass();
        str.getClass();
        this.custom = custom;
        this.featureList = list;
        this.userId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FWFRequest)) {
            return false;
        }
        FWFRequest fWFRequest = (FWFRequest) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.custom, fWFRequest.custom}, getCieXyz.write())).booleanValue() && this.featureList.equals(fWFRequest.featureList) && this.userId.equals(fWFRequest.userId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FWFRequest(custom=");
        sb.append(this.custom);
        sb.append(", featureList=");
        sb.append(this.featureList);
        sb.append(", userId=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.userId, ')');
    }

    public final int hashCode() {
        Custom custom = this.custom;
        return this.userId.hashCode() + c8$$ExternalSyntheticOutline0.m(this.featureList, (custom == null ? 0 : custom.hashCode()) * 31, 31);
    }
}
