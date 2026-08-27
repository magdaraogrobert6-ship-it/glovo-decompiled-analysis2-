package com.deliveryhero.chatsdk.domain.model.messages;

import androidx.compose.ui.text.android.LayoutCompat;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;
import o.getCieXyz;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class UnreadCountDetails {
    private final List<Chat> chats;
    private final int totalUnreadMessageCount;

    @getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
    public static final class Chat {
        private final String chatId;
        private final String chatStatus;
        private final String chatType;
        private final String orderId;
        private final int unreadMessageCount;

        public final String component1() {
            return this.chatId;
        }

        public final String component2() {
            return this.chatStatus;
        }

        public final String component3() {
            return this.chatType;
        }

        public final String component4() {
            return this.orderId;
        }

        public final int component5() {
            return this.unreadMessageCount;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final String getChatStatus() {
            return this.chatStatus;
        }

        public final String getChatType() {
            return this.chatType;
        }

        public final String getOrderId() {
            return this.orderId;
        }

        public final int getUnreadMessageCount() {
            return this.unreadMessageCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.unreadMessageCount) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.chatId.hashCode() * 31, 31, this.chatStatus), 31, this.chatType), 31, this.orderId);
        }

        public Chat(@getDensityDpi(serializer = "chat_id") String str, @getDensityDpi(serializer = "chat_status") String str2, @getDensityDpi(serializer = "chat_type") String str3, @getDensityDpi(serializer = "order_id") String str4, @getDensityDpi(serializer = "unread_message_count") int i) {
            d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
            this.chatId = str;
            this.chatStatus = str2;
            this.chatType = str3;
            this.orderId = str4;
            this.unreadMessageCount = i;
        }

        public final Chat copy(@getDensityDpi(serializer = "chat_id") String str, @getDensityDpi(serializer = "chat_status") String str2, @getDensityDpi(serializer = "chat_type") String str3, @getDensityDpi(serializer = "order_id") String str4, @getDensityDpi(serializer = "unread_message_count") int i) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            return new Chat(str, str2, str3, str4, i);
        }

        public static /* synthetic */ Chat copy$default(Chat chat, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = chat.chatId;
            }
            if ((i2 & 2) != 0) {
                str2 = chat.chatStatus;
            }
            String str5 = str2;
            if ((i2 & 4) != 0) {
                str3 = chat.chatType;
            }
            String str6 = str3;
            if ((i2 & 8) != 0) {
                str4 = chat.orderId;
            }
            String str7 = str4;
            if ((i2 & 16) != 0) {
                i = chat.unreadMessageCount;
            }
            return chat.copy(str, str5, str6, str7, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Chat)) {
                return false;
            }
            Chat chat = (Chat) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatId, chat.chatId}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatStatus, chat.chatStatus}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatType, chat.chatType}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderId, chat.orderId}, getCieXyz.write())).booleanValue() && this.unreadMessageCount == chat.unreadMessageCount;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Chat(chatId=");
            sb.append(this.chatId);
            sb.append(", chatStatus=");
            sb.append(this.chatStatus);
            sb.append(", chatType=");
            sb.append(this.chatType);
            sb.append(", orderId=");
            sb.append(this.orderId);
            sb.append(", unreadMessageCount=");
            return af$$ExternalSyntheticOutline0.m(sb, this.unreadMessageCount, ')');
        }
    }

    public final List<Chat> component1() {
        return this.chats;
    }

    public final int component2() {
        return this.totalUnreadMessageCount;
    }

    public final List<Chat> getChats() {
        return this.chats;
    }

    public final int getTotalUnreadMessageCount() {
        return this.totalUnreadMessageCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalUnreadMessageCount) + (this.chats.hashCode() * 31);
    }

    public UnreadCountDetails(@getDensityDpi(serializer = "chats") List<Chat> list, @getDensityDpi(serializer = "total_unread_message_count") int i) {
        list.getClass();
        this.chats = list;
        this.totalUnreadMessageCount = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnreadCountDetails copy$default(UnreadCountDetails unreadCountDetails, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = unreadCountDetails.chats;
        }
        if ((i2 & 2) != 0) {
            i = unreadCountDetails.totalUnreadMessageCount;
        }
        return unreadCountDetails.copy(list, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnreadCountDetails)) {
            return false;
        }
        UnreadCountDetails unreadCountDetails = (UnreadCountDetails) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chats, unreadCountDetails.chats}, getCieXyz.write())).booleanValue() && this.totalUnreadMessageCount == unreadCountDetails.totalUnreadMessageCount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UnreadCountDetails(chats=");
        sb.append(this.chats);
        sb.append(", totalUnreadMessageCount=");
        return af$$ExternalSyntheticOutline0.m(sb, this.totalUnreadMessageCount, ')');
    }

    public final UnreadCountDetails copy(@getDensityDpi(serializer = "chats") List<Chat> list, @getDensityDpi(serializer = "total_unread_message_count") int i) {
        list.getClass();
        return new UnreadCountDetails(list, i);
    }
}
