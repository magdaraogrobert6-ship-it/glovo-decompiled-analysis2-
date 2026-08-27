package com.deliveryhero.selfServiceChat.data.chat;

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
public final class GetChatIDEndpointResponseJsonAdapter extends JsonAdapter {
    public final JsonAdapter RemoteActionCompatParcelizer;
    public final JsonAdapter serializer;
    public final getLocalBitmap write;

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        GetChatIDEndpointResponse getChatIDEndpointResponse = (GetChatIDEndpointResponse) obj;
        jsonWriter.getClass();
        if (getChatIDEndpointResponse == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("chat_id");
        this.serializer.toJson(jsonWriter, getChatIDEndpointResponse.chatId);
        jsonWriter.IconCompatParcelizer("translation_supported");
        this.RemoteActionCompatParcelizer.toJson(jsonWriter, Boolean.valueOf(getChatIDEndpointResponse.translationSupported));
        jsonWriter.serializer();
    }

    public GetChatIDEndpointResponseJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.write = getLocalBitmap.RemoteActionCompatParcelizer("chat_id", "translation_supported");
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        this.serializer = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, itemTouchHelperAdapter, "chatId");
        this.RemoteActionCompatParcelizer = getruntime_memory_image_loader_usage_quotientannotations.read(Boolean.TYPE, itemTouchHelperAdapter, "translationSupported");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        String str = null;
        Boolean bool = null;
        while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
            int iSerializer = getdisplayheightandwidthpixels.serializer(this.write);
            if (iSerializer == -1) {
                getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            } else if (iSerializer == 0) {
                str = (String) this.serializer.fromJson(getdisplayheightandwidthpixels);
                if (str == null) {
                    throw getRemoteBitmaplambda4.IconCompatParcelizer("chatId", "chat_id", getdisplayheightandwidthpixels);
                }
            } else if (iSerializer == 1 && (bool = (Boolean) this.RemoteActionCompatParcelizer.fromJson(getdisplayheightandwidthpixels)) == null) {
                throw getRemoteBitmaplambda4.IconCompatParcelizer("translationSupported", "translation_supported", getdisplayheightandwidthpixels);
            }
        }
        getdisplayheightandwidthpixels.IconCompatParcelizer();
        if (str == null) {
            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("chatId", "chat_id", getdisplayheightandwidthpixels);
        }
        if (bool != null) {
            return new GetChatIDEndpointResponse(str, bool.booleanValue());
        }
        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("translationSupported", "translation_supported", getdisplayheightandwidthpixels);
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(47, "GeneratedJsonAdapter(GetChatIDEndpointResponse)");
    }
}
