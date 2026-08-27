package com.deliveryhero.selfServiceChat.data.model;

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
public final class HelpcenterEntityConfigEndpointResponseJsonAdapter extends JsonAdapter {
    public final JsonAdapter RemoteActionCompatParcelizer;
    public final getLocalBitmap read;

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        HelpcenterEntityConfigEndpointResponse helpcenterEntityConfigEndpointResponse = (HelpcenterEntityConfigEndpointResponse) obj;
        jsonWriter.getClass();
        if (helpcenterEntityConfigEndpointResponse == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("global_entity_configs");
        this.RemoteActionCompatParcelizer.toJson(jsonWriter, helpcenterEntityConfigEndpointResponse.write);
        jsonWriter.serializer();
    }

    public HelpcenterEntityConfigEndpointResponseJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.read = getLocalBitmap.RemoteActionCompatParcelizer("global_entity_configs");
        this.RemoteActionCompatParcelizer = getruntime_memory_image_loader_usage_quotientannotations.read(Room.IconCompatParcelizer(List.class, HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig.class), ItemTouchHelperAdapter.serializer, "globalEntityConfigs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        List list = null;
        while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
            int iSerializer = getdisplayheightandwidthpixels.serializer(this.read);
            if (iSerializer == -1) {
                getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            } else if (iSerializer == 0 && (list = (List) this.RemoteActionCompatParcelizer.fromJson(getdisplayheightandwidthpixels)) == null) {
                throw getRemoteBitmaplambda4.IconCompatParcelizer("globalEntityConfigs", "global_entity_configs", getdisplayheightandwidthpixels);
            }
        }
        getdisplayheightandwidthpixels.IconCompatParcelizer();
        if (list != null) {
            return new HelpcenterEntityConfigEndpointResponse(list);
        }
        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("globalEntityConfigs", "global_entity_configs", getdisplayheightandwidthpixels);
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(60, "GeneratedJsonAdapter(HelpcenterEntityConfigEndpointResponse)");
    }
}
