package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaAFUiOR7snbtOJZ7O4wMtyfGDHMU {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    @SerializedName("events")
    private final List<commitCurrentBulletSpan> events;

    public r8lambdaAFUiOR7snbtOJZ7O4wMtyfGDHMU(List list) {
        this.events = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 25;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.events.hashCode();
        int i4 = serializer + 23;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return MediaSessionCompatQueueItem.read("HelpCenterChatEventsSendMessageRequest(events=", ")", this.events);
        }
        MediaSessionCompatQueueItem.read("HelpCenterChatEventsSendMessageRequest(events=", ")", this.events);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 109;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (obj instanceof r8lambdaAFUiOR7snbtOJZ7O4wMtyfGDHMU) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.events, ((r8lambdaAFUiOR7snbtOJZ7O4wMtyfGDHMU) obj).events}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i3 = IconCompatParcelizer + 89;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 87 / 0;
            }
            return false;
        }
        int i5 = IconCompatParcelizer;
        int i6 = i5 + 65;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        int i8 = i5 + 73;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
