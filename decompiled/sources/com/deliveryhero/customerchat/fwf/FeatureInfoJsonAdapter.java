package com.deliveryhero.customerchat.fwf;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import o.IconCompatParcelizer;
import o.ItemTouchHelperAdapter;
import o.getDisplayHeightAndWidthPixels;
import o.getLocalBitmap;
import o.getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations;
import o.getRemoteBitmaplambda4;

/* JADX INFO: loaded from: classes4.dex */
public final class FeatureInfoJsonAdapter extends JsonAdapter {
    public final JsonAdapter serializer;
    public final getLocalBitmap write;

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        FeatureInfo featureInfo = (FeatureInfo) obj;
        jsonWriter.getClass();
        if (featureInfo == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("variation");
        this.serializer.toJson(jsonWriter, Boolean.valueOf(featureInfo.variation));
        jsonWriter.serializer();
    }

    public FeatureInfoJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.write = getLocalBitmap.RemoteActionCompatParcelizer("variation");
        this.serializer = getruntime_memory_image_loader_usage_quotientannotations.read(Boolean.TYPE, ItemTouchHelperAdapter.serializer, "variation");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        Boolean bool = null;
        while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
            int iSerializer = getdisplayheightandwidthpixels.serializer(this.write);
            if (iSerializer == -1) {
                getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            } else if (iSerializer == 0 && (bool = (Boolean) this.serializer.fromJson(getdisplayheightandwidthpixels)) == null) {
                throw getRemoteBitmaplambda4.IconCompatParcelizer("variation", "variation", getdisplayheightandwidthpixels);
            }
        }
        getdisplayheightandwidthpixels.IconCompatParcelizer();
        if (bool != null) {
            return new FeatureInfo(bool.booleanValue());
        }
        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("variation", "variation", getdisplayheightandwidthpixels);
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(33, "GeneratedJsonAdapter(FeatureInfo)");
    }
}
