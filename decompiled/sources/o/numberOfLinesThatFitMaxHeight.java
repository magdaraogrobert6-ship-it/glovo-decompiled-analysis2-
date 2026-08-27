package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostIsReady$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class numberOfLinesThatFitMaxHeight extends getPlaceholderRects {
    public static final HostMessage$HostIsReady$Companion Companion = new HostMessage$HostIsReady$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final String id;
    public final String messageType;
    public final toLayoutAlignaXe7zB0 payload;

    static {
        int i = write + 69;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 74 / 0;
        }
    }

    @Override // o.getPlaceholderRects
    public final String serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.messageType;
        }
        int i3 = 43 / 0;
        return this.messageType;
    }

    public /* synthetic */ numberOfLinesThatFitMaxHeight(int i, String str, toLayoutAlignaXe7zB0 tolayoutalignaxe7zb0, String str2) {
        Object obj = null;
        if (3 == (i & 3)) {
            this.id = str;
            this.payload = tolayoutalignaxe7zb0;
            if ((i & 4) == 0) {
                this.messageType = "HOST_IS_READY";
                int i2 = RemoteActionCompatParcelizer + 29;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.messageType = str2;
            int i3 = RemoteActionCompatParcelizer + 17;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 79 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, shouldAttachIndentationFixSpan.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int iHashCode = this.id.hashCode();
            return this.messageType.hashCode() / ((this.payload.hashCode() >> (iHashCode << 34)) / 11);
        }
        int iHashCode2 = this.id.hashCode();
        return this.messageType.hashCode() + ((this.payload.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public numberOfLinesThatFitMaxHeight(String str, toLayoutAlignaXe7zB0 tolayoutalignaxe7zb0) {
        this.id = str;
        this.payload = tolayoutalignaxe7zb0;
        this.messageType = "HOST_IS_READY";
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("HostIsReady(id=");
        sb.append(this.id);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", messageType=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.messageType, ")");
        int i2 = RemoteActionCompatParcelizer + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 97;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 115;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof numberOfLinesThatFitMaxHeight) {
            numberOfLinesThatFitMaxHeight numberoflinesthatfitmaxheight = (numberOfLinesThatFitMaxHeight) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, numberoflinesthatfitmaxheight.id}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, numberoflinesthatfitmaxheight.payload}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageType, numberoflinesthatfitmaxheight.messageType}, getCieXyz.write())).booleanValue();
            }
            int i7 = RemoteActionCompatParcelizer + 27;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = i3 + 87;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
