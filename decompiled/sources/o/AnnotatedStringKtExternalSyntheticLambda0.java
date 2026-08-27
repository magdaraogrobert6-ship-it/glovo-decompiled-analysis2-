package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AnnotatedStringKtExternalSyntheticLambda0 {
    private static int serializer = 0;
    private static int write = 1;

    @SerializedName("chats")
    private final List<read> chats;

    @SerializedName("total_unread_message_count")
    private final int totalUnreadMessageCount;

    public static final class read {
        private static int serializer = 1;
        private static int write;

        @SerializedName("chat_id")
        private final String chatId;

        @SerializedName("chat_status")
        private final String chatStatus;

        @SerializedName("chat_type")
        private final String chatType;

        @SerializedName("order_id")
        private final String orderId;

        @SerializedName("unread_message_count")
        private final int unreadMessageCount;

        public final String IconCompatParcelizer() {
            int i = 2 % 2;
            int i2 = serializer;
            int i3 = i2 + 113;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            String str = this.chatStatus;
            int i5 = i2 + 111;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String RemoteActionCompatParcelizer() {
            String str;
            int i = 2 % 2;
            int i2 = serializer;
            int i3 = i2 + 59;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                str = this.chatId;
                int i4 = 58 / 0;
            } else {
                str = this.chatId;
            }
            int i5 = i2 + 17;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return str;
        }

        public final String read() {
            int i = 2 % 2;
            int i2 = write + 59;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.orderId;
            int i4 = i3 + 119;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return str;
        }

        public final int serializer() {
            int i = 2 % 2;
            int i2 = write + 71;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return this.unreadMessageCount;
            }
            int i3 = 44 / 0;
            return this.unreadMessageCount;
        }

        public final String write() {
            int i = 2 % 2;
            int i2 = serializer + 37;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return this.chatType;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = serializer + 7;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            String str = this.chatId;
            String str2 = this.chatStatus;
            String str3 = this.chatType;
            String str4 = this.orderId;
            int i4 = this.unreadMessageCount;
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Chat(chatId=", str, ", chatStatus=", str2, ", chatType=");
            c8$$ExternalSyntheticOutline0.m(sbM, str3, ", orderId=", str4, ", unreadMessageCount=");
            String strM = af$$ExternalSyntheticOutline0.m(i4, ")", sbM);
            int i5 = write + 121;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return strM;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = write + 85;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.unreadMessageCount) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.chatId.hashCode() * 31, 31, this.chatStatus), 31, this.chatType), 31, this.orderId);
            int i4 = serializer + 29;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (obj instanceof read) {
                    read readVar = (read) obj;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatId, readVar.chatId}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatStatus, readVar.chatStatus}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatType, readVar.chatType}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderId, readVar.orderId}, getCieXyz.write())).booleanValue() && this.unreadMessageCount == readVar.unreadMessageCount;
                    }
                    int i2 = write + 117;
                    serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = write + 17;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = write + 39;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 != 0;
        }
    }

    public final List read() {
        int i = 2 % 2;
        int i2 = serializer + 27;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.chats;
        }
        int i3 = 20 / 0;
        return this.chats;
    }

    public final int write() {
        int i = 2 % 2;
        int i2 = serializer + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.totalUnreadMessageCount;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 115;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.totalUnreadMessageCount) + (this.chats.hashCode() * 31);
        int i4 = write + 109;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 115;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof AnnotatedStringKtExternalSyntheticLambda0) {
            AnnotatedStringKtExternalSyntheticLambda0 annotatedStringKtExternalSyntheticLambda0 = (AnnotatedStringKtExternalSyntheticLambda0) obj;
            Object[] objArr = {this.chats, annotatedStringKtExternalSyntheticLambda0.chats};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.totalUnreadMessageCount == annotatedStringKtExternalSyntheticLambda0.totalUnreadMessageCount) {
                return true;
            }
            int i3 = serializer + 81;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = write + 115;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "UnreadCountDetailsResponse(chats=" + this.chats + ", totalUnreadMessageCount=" + this.totalUnreadMessageCount + ")";
        int i2 = write + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
