package o;

import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$Ack$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isLineEllipsized extends getPlaceholderRects {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String messageType;
    public final updateOffsetsLDcG7Xg receivedMessage;
    public static final HostMessage$Ack$Companion Companion = new HostMessage$Ack$Companion();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ActionPropertyKey(18))};

    static {
        int i = read + 39;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 60 / 0;
        }
    }

    @Override // o.getPlaceholderRects
    public final String serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.messageType;
        }
        throw null;
    }

    public /* synthetic */ isLineEllipsized(int i, String str, updateOffsetsLDcG7Xg updateoffsetsldcg7xg) {
        Object obj = null;
        if (1 == (i & 1)) {
            this.messageType = str;
            if ((i & 2) == 0) {
                this.receivedMessage = null;
                int i2 = RemoteActionCompatParcelizer + 47;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 69 / 0;
                    return;
                }
                return;
            }
            this.receivedMessage = updateoffsetsldcg7xg;
            int i4 = RemoteActionCompatParcelizer + 69;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getWordBoundaryjx7JFs.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = write + 107;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iHashCode = this.messageType.hashCode();
        updateOffsetsLDcG7Xg updateoffsetsldcg7xg = this.receivedMessage;
        if (updateoffsetsldcg7xg == null) {
            i = 0;
        } else {
            int iHashCode2 = updateoffsetsldcg7xg.hashCode();
            int i5 = write + 101;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public isLineEllipsized(String str, updateOffsetsLDcG7Xg updateoffsetsldcg7xg) {
        this.messageType = str;
        this.receivedMessage = updateoffsetsldcg7xg;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Ack(messageType=" + this.messageType + ", receivedMessage=" + this.receivedMessage + ")";
        int i2 = write + 81;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof isLineEllipsized) {
            isLineEllipsized islineellipsized = (isLineEllipsized) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageType, islineellipsized.messageType}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.receivedMessage, islineellipsized.receivedMessage}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = write + 47;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i3 = write + 85;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i3 % 2 == 0;
    }
}
