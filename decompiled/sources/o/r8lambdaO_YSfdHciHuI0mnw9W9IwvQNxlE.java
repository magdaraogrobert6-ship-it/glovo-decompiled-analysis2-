package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.domain.push.BodyPayload$Companion;
import kotlinx.serialization.Serializable;
import o.fillBoundingBoxes_8ffj60Qlambda0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class r8lambdaO_YSfdHciHuI0mnw9W9IwvQNxlE {
    public static final BodyPayload$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.domain.push.BodyPayload$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 43;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                fillBoundingBoxes_8ffj60Qlambda0 fillboundingboxes_8ffj60qlambda0 = fillBoundingBoxes_8ffj60Qlambda0.IconCompatParcelizer;
                throw null;
            }
            fillBoundingBoxes_8ffj60Qlambda0 fillboundingboxes_8ffj60qlambda1 = fillBoundingBoxes_8ffj60Qlambda0.IconCompatParcelizer;
            int i3 = IconCompatParcelizer + 101;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return fillboundingboxes_8ffj60qlambda1;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String channelType;
    public final String chatId;
    public final String chatType;
    public final String message;
    public final String orderId;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.domain.push.BodyPayload$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 21;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.chatType;
        int i5 = i2 + 43;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = serializer + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.title;
        }
        int i3 = 6 / 0;
        return this.title;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.orderId;
        int i4 = i3 + 65;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String read() {
        String str;
        int i = 2 % 2;
        int i2 = serializer + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            str = this.channelType;
            int i4 = 31 / 0;
        } else {
            str = this.channelType;
        }
        int i5 = i3 + 27;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.chatId;
        int i5 = i3 + 89;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 13;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.message;
        int i5 = i2 + 41;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ r8lambdaO_YSfdHciHuI0mnw9W9IwvQNxlE(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        if (63 == (i & 63)) {
            this.chatType = str;
            this.orderId = str2;
            this.chatId = str3;
            this.channelType = str4;
            this.message = str5;
            this.title = str6;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 63, fillBoundingBoxes_8ffj60Qlambda0.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("BodyPayload(chatType=", this.chatType, ", orderId=", this.orderId, ", chatId=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.chatId, ", channelType=", this.channelType, ", message=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.message, ", title=", this.title, ")");
        int i4 = write + 93;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.chatType.hashCode() * 31, 31, this.orderId), 31, this.chatId), 31, this.channelType), 31, this.message);
        int i4 = serializer + 49;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdaO_YSfdHciHuI0mnw9W9IwvQNxlE) {
            r8lambdaO_YSfdHciHuI0mnw9W9IwvQNxlE r8lambdao_ysfdhcihui0mnw9w9iwvqnxle = (r8lambdaO_YSfdHciHuI0mnw9W9IwvQNxlE) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatType, r8lambdao_ysfdhcihui0mnw9w9iwvqnxle.chatType}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderId, r8lambdao_ysfdhcihui0mnw9w9iwvqnxle.orderId}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatId, r8lambdao_ysfdhcihui0mnw9w9iwvqnxle.chatId}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.channelType, r8lambdao_ysfdhcihui0mnw9w9iwvqnxle.channelType}, getCieXyz.write())).booleanValue()) {
                        int i2 = serializer + 107;
                        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            return false;
                        }
                        throw null;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, r8lambdao_ysfdhcihui0mnw9w9iwvqnxle.message}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, r8lambdao_ysfdhcihui0mnw9w9iwvqnxle.title}, getCieXyz.write())).booleanValue();
                }
                int i3 = write + 85;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i3 % 2 != 0;
            }
            int i4 = write + 57;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 99;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 != 0;
    }
}
