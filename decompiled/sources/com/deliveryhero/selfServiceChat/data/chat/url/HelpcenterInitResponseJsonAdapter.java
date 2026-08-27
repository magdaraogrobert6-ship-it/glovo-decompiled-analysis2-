package com.deliveryhero.selfServiceChat.data.chat.url;

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
public final class HelpcenterInitResponseJsonAdapter extends JsonAdapter {
    public final JsonAdapter RemoteActionCompatParcelizer;
    public final getLocalBitmap read;

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        HelpcenterInitResponse helpcenterInitResponse = (HelpcenterInitResponse) obj;
        jsonWriter.getClass();
        if (helpcenterInitResponse == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("url");
        this.RemoteActionCompatParcelizer.toJson(jsonWriter, helpcenterInitResponse.url);
        jsonWriter.serializer();
    }

    public HelpcenterInitResponseJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.read = getLocalBitmap.RemoteActionCompatParcelizer("url");
        this.RemoteActionCompatParcelizer = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, ItemTouchHelperAdapter.serializer, "url");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        String str = null;
        while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
            int iSerializer = getdisplayheightandwidthpixels.serializer(this.read);
            if (iSerializer == -1) {
                getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            } else if (iSerializer == 0 && (str = (String) this.RemoteActionCompatParcelizer.fromJson(getdisplayheightandwidthpixels)) == null) {
                throw getRemoteBitmaplambda4.IconCompatParcelizer("url", "url", getdisplayheightandwidthpixels);
            }
        }
        getdisplayheightandwidthpixels.IconCompatParcelizer();
        if (str != null) {
            return new HelpcenterInitResponse(str);
        }
        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("url", "url", getdisplayheightandwidthpixels);
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(44, "GeneratedJsonAdapter(HelpcenterInitResponse)");
    }
}
