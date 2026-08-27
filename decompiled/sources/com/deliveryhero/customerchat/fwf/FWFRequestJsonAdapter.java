package com.deliveryhero.customerchat.fwf;

import androidx.room.Room;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import java.util.List;
import o.IconCompatParcelizer;
import o.ItemTouchHelperAdapter;
import o.getDisplayHeightAndWidthPixels;
import o.getLocalBitmap;
import o.getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations;
import o.getRemoteBitmaplambda4;

/* JADX INFO: loaded from: classes4.dex */
public final class FWFRequestJsonAdapter extends JsonAdapter {
    public final JsonAdapter IconCompatParcelizer;
    public final JsonAdapter RemoteActionCompatParcelizer;
    public final JsonAdapter read;
    public final getLocalBitmap write;

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        FWFRequest fWFRequest = (FWFRequest) obj;
        jsonWriter.getClass();
        if (fWFRequest == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("custom");
        this.IconCompatParcelizer.toJson(jsonWriter, fWFRequest.custom);
        jsonWriter.IconCompatParcelizer("featureList");
        this.RemoteActionCompatParcelizer.toJson(jsonWriter, fWFRequest.featureList);
        jsonWriter.IconCompatParcelizer("userId");
        this.read.toJson(jsonWriter, fWFRequest.userId);
        jsonWriter.serializer();
    }

    public FWFRequestJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.write = getLocalBitmap.RemoteActionCompatParcelizer("custom", "featureList", "userId");
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        this.IconCompatParcelizer = getruntime_memory_image_loader_usage_quotientannotations.read(Custom.class, itemTouchHelperAdapter, "custom");
        this.RemoteActionCompatParcelizer = getruntime_memory_image_loader_usage_quotientannotations.read(Room.IconCompatParcelizer(List.class, String.class), itemTouchHelperAdapter, "featureList");
        this.read = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, itemTouchHelperAdapter, "userId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        List list = null;
        String str = null;
        Custom custom = null;
        while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
            int iSerializer = getdisplayheightandwidthpixels.serializer(this.write);
            if (iSerializer == -1) {
                getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            } else if (iSerializer == 0) {
                custom = (Custom) this.IconCompatParcelizer.fromJson(getdisplayheightandwidthpixels);
            } else if (iSerializer == 1) {
                list = (List) this.RemoteActionCompatParcelizer.fromJson(getdisplayheightandwidthpixels);
                if (list == null) {
                    throw getRemoteBitmaplambda4.IconCompatParcelizer("featureList", "featureList", getdisplayheightandwidthpixels);
                }
            } else if (iSerializer == 2 && (str = (String) this.read.fromJson(getdisplayheightandwidthpixels)) == null) {
                throw getRemoteBitmaplambda4.IconCompatParcelizer("userId", "userId", getdisplayheightandwidthpixels);
            }
        }
        getdisplayheightandwidthpixels.IconCompatParcelizer();
        if (list == null) {
            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("featureList", "featureList", getdisplayheightandwidthpixels);
        }
        if (str != null) {
            return new FWFRequest(custom, list, str);
        }
        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("userId", "userId", getdisplayheightandwidthpixels);
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(32, "GeneratedJsonAdapter(FWFRequest)");
    }
}
