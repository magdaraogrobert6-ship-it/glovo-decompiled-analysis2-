package com.deliveryhero.chatsdk.domain.model.messages;

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
import o.resizeToBitmapDimensions;

/* JADX INFO: loaded from: classes4.dex */
public final class UnreadCountDetailsJsonAdapter extends JsonAdapter {
    private final JsonAdapter intAdapter;
    private final JsonAdapter listOfChatAdapter;
    private final getLocalBitmap options;

    public UnreadCountDetailsJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.options = getLocalBitmap.RemoteActionCompatParcelizer("chats", "total_unread_message_count");
        resizeToBitmapDimensions resizetobitmapdimensionsIconCompatParcelizer = Room.IconCompatParcelizer(List.class, UnreadCountDetails.Chat.class);
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        this.listOfChatAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(resizetobitmapdimensionsIconCompatParcelizer, itemTouchHelperAdapter, "chats");
        this.intAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(Integer.TYPE, itemTouchHelperAdapter, "totalUnreadMessageCount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UnreadCountDetails fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        List list = null;
        Integer num = null;
        while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
            int iSerializer = getdisplayheightandwidthpixels.serializer(this.options);
            if (iSerializer == -1) {
                getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            } else if (iSerializer == 0) {
                list = (List) this.listOfChatAdapter.fromJson(getdisplayheightandwidthpixels);
                if (list == null) {
                    throw getRemoteBitmaplambda4.IconCompatParcelizer("chats", "chats", getdisplayheightandwidthpixels);
                }
            } else if (iSerializer == 1 && (num = (Integer) this.intAdapter.fromJson(getdisplayheightandwidthpixels)) == null) {
                throw getRemoteBitmaplambda4.IconCompatParcelizer("totalUnreadMessageCount", "total_unread_message_count", getdisplayheightandwidthpixels);
            }
        }
        getdisplayheightandwidthpixels.IconCompatParcelizer();
        if (list == null) {
            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("chats", "chats", getdisplayheightandwidthpixels);
        }
        if (num != null) {
            return new UnreadCountDetails(list, num.intValue());
        }
        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("totalUnreadMessageCount", "total_unread_message_count", getdisplayheightandwidthpixels);
    }

    public String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(40, "GeneratedJsonAdapter(UnreadCountDetails)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, UnreadCountDetails unreadCountDetails) {
        jsonWriter.getClass();
        if (unreadCountDetails == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("chats");
        this.listOfChatAdapter.toJson(jsonWriter, unreadCountDetails.getChats());
        jsonWriter.IconCompatParcelizer("total_unread_message_count");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(unreadCountDetails.getTotalUnreadMessageCount()));
        jsonWriter.serializer();
    }
}
