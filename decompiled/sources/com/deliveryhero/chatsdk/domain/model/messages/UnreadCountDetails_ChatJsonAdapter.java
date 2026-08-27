package com.deliveryhero.chatsdk.domain.model.messages;

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
public final class UnreadCountDetails_ChatJsonAdapter extends JsonAdapter {
    private final JsonAdapter intAdapter;
    private final getLocalBitmap options;
    private final JsonAdapter stringAdapter;

    public UnreadCountDetails_ChatJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.options = getLocalBitmap.RemoteActionCompatParcelizer("chat_id", "chat_status", "chat_type", "order_id", "unread_message_count");
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        this.stringAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, itemTouchHelperAdapter, "chatId");
        this.intAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(Integer.TYPE, itemTouchHelperAdapter, "unreadMessageCount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UnreadCountDetails.Chat fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            Integer num2 = num;
            String str5 = str4;
            if (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
                int iSerializer = getdisplayheightandwidthpixels.serializer(this.options);
                String str6 = str3;
                if (iSerializer != -1) {
                    if (iSerializer != 0) {
                        if (iSerializer != 1) {
                            if (iSerializer != 2) {
                                if (iSerializer == 3) {
                                    str4 = (String) this.stringAdapter.fromJson(getdisplayheightandwidthpixels);
                                    if (str4 == null) {
                                        throw getRemoteBitmaplambda4.IconCompatParcelizer("orderId", "order_id", getdisplayheightandwidthpixels);
                                    }
                                } else if (iSerializer == 4) {
                                    num = (Integer) this.intAdapter.fromJson(getdisplayheightandwidthpixels);
                                    if (num == null) {
                                        throw getRemoteBitmaplambda4.IconCompatParcelizer("unreadMessageCount", "unread_message_count", getdisplayheightandwidthpixels);
                                    }
                                }
                                str3 = str6;
                            } else {
                                str3 = (String) this.stringAdapter.fromJson(getdisplayheightandwidthpixels);
                                if (str3 == null) {
                                    throw getRemoteBitmaplambda4.IconCompatParcelizer("chatType", "chat_type", getdisplayheightandwidthpixels);
                                }
                                str4 = str5;
                            }
                            num = num2;
                        } else {
                            str2 = (String) this.stringAdapter.fromJson(getdisplayheightandwidthpixels);
                            if (str2 == null) {
                                throw getRemoteBitmaplambda4.IconCompatParcelizer("chatStatus", "chat_status", getdisplayheightandwidthpixels);
                            }
                        }
                        str4 = str5;
                        str3 = str6;
                    } else {
                        String str7 = (String) this.stringAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (str7 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("chatId", "chat_id", getdisplayheightandwidthpixels);
                        }
                        str = str7;
                    }
                    num = num2;
                    str4 = str5;
                    str3 = str6;
                } else {
                    getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                    getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
                str4 = str5;
                str3 = str6;
                num = num2;
            } else {
                String str8 = str3;
                getdisplayheightandwidthpixels.IconCompatParcelizer();
                if (str == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("chatId", "chat_id", getdisplayheightandwidthpixels);
                }
                if (str2 == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("chatStatus", "chat_status", getdisplayheightandwidthpixels);
                }
                if (str8 == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("chatType", "chat_type", getdisplayheightandwidthpixels);
                }
                if (str5 == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("orderId", "order_id", getdisplayheightandwidthpixels);
                }
                if (num2 != null) {
                    return new UnreadCountDetails.Chat(str, str2, str8, str5, num2.intValue());
                }
                throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("unreadMessageCount", "unread_message_count", getdisplayheightandwidthpixels);
            }
        }
    }

    public String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(45, "GeneratedJsonAdapter(UnreadCountDetails.Chat)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, UnreadCountDetails.Chat chat) {
        jsonWriter.getClass();
        if (chat == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("chat_id");
        this.stringAdapter.toJson(jsonWriter, chat.getChatId());
        jsonWriter.IconCompatParcelizer("chat_status");
        this.stringAdapter.toJson(jsonWriter, chat.getChatStatus());
        jsonWriter.IconCompatParcelizer("chat_type");
        this.stringAdapter.toJson(jsonWriter, chat.getChatType());
        jsonWriter.IconCompatParcelizer("order_id");
        this.stringAdapter.toJson(jsonWriter, chat.getOrderId());
        jsonWriter.IconCompatParcelizer("unread_message_count");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(chat.getUnreadMessageCount()));
        jsonWriter.serializer();
    }
}
