package com.deliveryhero.selfServiceChat.data.config;

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
public final class HelpcenterEntityConfigEndpointResponse_GlobalEntityConfigJsonAdapter extends JsonAdapter {
    public final getLocalBitmap RemoteActionCompatParcelizer;
    public final JsonAdapter read;
    public final JsonAdapter write;

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig globalEntityConfig = (HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig) obj;
        jsonWriter.getClass();
        if (globalEntityConfig == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("global_entity_id");
        String str = globalEntityConfig.serializer;
        JsonAdapter jsonAdapter = this.write;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.IconCompatParcelizer("self_service_region");
        jsonAdapter.toJson(jsonWriter, globalEntityConfig.IconCompatParcelizer);
        jsonWriter.IconCompatParcelizer("register_device_token_for_p2p_chat");
        this.read.toJson(jsonWriter, Boolean.valueOf(globalEntityConfig.RemoteActionCompatParcelizer));
        jsonWriter.serializer();
    }

    public HelpcenterEntityConfigEndpointResponse_GlobalEntityConfigJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.RemoteActionCompatParcelizer = getLocalBitmap.RemoteActionCompatParcelizer("global_entity_id", "self_service_region", "register_device_token_for_p2p_chat");
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        this.write = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, itemTouchHelperAdapter, "globalEntityId");
        this.read = getruntime_memory_image_loader_usage_quotientannotations.read(Boolean.TYPE, itemTouchHelperAdapter, "registerDeviceTokenForP2PChat");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
            int iSerializer = getdisplayheightandwidthpixels.serializer(this.RemoteActionCompatParcelizer);
            if (iSerializer != -1) {
                JsonAdapter jsonAdapter = this.write;
                if (iSerializer == 0) {
                    str = (String) jsonAdapter.fromJson(getdisplayheightandwidthpixels);
                    if (str == null) {
                        throw getRemoteBitmaplambda4.IconCompatParcelizer("globalEntityId", "global_entity_id", getdisplayheightandwidthpixels);
                    }
                } else if (iSerializer == 1) {
                    str2 = (String) jsonAdapter.fromJson(getdisplayheightandwidthpixels);
                    if (str2 == null) {
                        throw getRemoteBitmaplambda4.IconCompatParcelizer("selfServiceRegion", "self_service_region", getdisplayheightandwidthpixels);
                    }
                } else if (iSerializer == 2 && (bool = (Boolean) this.read.fromJson(getdisplayheightandwidthpixels)) == null) {
                    throw getRemoteBitmaplambda4.IconCompatParcelizer("registerDeviceTokenForP2PChat", "register_device_token_for_p2p_chat", getdisplayheightandwidthpixels);
                }
            } else {
                getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            }
        }
        getdisplayheightandwidthpixels.IconCompatParcelizer();
        if (str == null) {
            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("globalEntityId", "global_entity_id", getdisplayheightandwidthpixels);
        }
        if (str2 == null) {
            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("selfServiceRegion", "self_service_region", getdisplayheightandwidthpixels);
        }
        if (bool != null) {
            return new HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig(str, str2, bool.booleanValue());
        }
        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("registerDeviceTokenForP2PChat", "register_device_token_for_p2p_chat", getdisplayheightandwidthpixels);
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(79, "GeneratedJsonAdapter(HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig)");
    }
}
