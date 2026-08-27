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
public final class HelpCenterChatEventsSendMessageRequestJsonAdapter extends JsonAdapter {
    public final getLocalBitmap RemoteActionCompatParcelizer;
    public final JsonAdapter write;

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        HelpCenterChatEventsSendMessageRequest helpCenterChatEventsSendMessageRequest = (HelpCenterChatEventsSendMessageRequest) obj;
        jsonWriter.getClass();
        if (helpCenterChatEventsSendMessageRequest == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("events");
        this.write.toJson(jsonWriter, helpCenterChatEventsSendMessageRequest.events);
        jsonWriter.serializer();
    }

    public HelpCenterChatEventsSendMessageRequestJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.RemoteActionCompatParcelizer = getLocalBitmap.RemoteActionCompatParcelizer("events");
        this.write = getruntime_memory_image_loader_usage_quotientannotations.read(Room.IconCompatParcelizer(List.class, TextEvent.class), ItemTouchHelperAdapter.serializer, "events");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        List list = null;
        while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
            int iSerializer = getdisplayheightandwidthpixels.serializer(this.RemoteActionCompatParcelizer);
            if (iSerializer == -1) {
                getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            } else if (iSerializer == 0 && (list = (List) this.write.fromJson(getdisplayheightandwidthpixels)) == null) {
                throw getRemoteBitmaplambda4.IconCompatParcelizer("events", "events", getdisplayheightandwidthpixels);
            }
        }
        getdisplayheightandwidthpixels.IconCompatParcelizer();
        if (list != null) {
            return new HelpCenterChatEventsSendMessageRequest(list);
        }
        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("events", "events", getdisplayheightandwidthpixels);
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(60, "GeneratedJsonAdapter(HelpCenterChatEventsSendMessageRequest)");
    }
}
