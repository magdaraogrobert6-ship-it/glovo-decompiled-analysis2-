package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostIsReady$Payload$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.toLayoutLineBreakStylehpcqdu8;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class toLayoutAlignaXe7zB0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final boolean isFullScreen;
    public final List supportedMessageTypes;
    public static final HostMessage$HostIsReady$Payload$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostIsReady$Payload$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 15;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return toLayoutLineBreakStylehpcqdu8.write;
            }
            toLayoutLineBreakStylehpcqdu8 tolayoutlinebreakstylehpcqdu8 = toLayoutLineBreakStylehpcqdu8.write;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ActionPropertyKey(21)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostIsReady$Payload$Companion] */
    static {
        int i = IconCompatParcelizer + 37;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ toLayoutAlignaXe7zB0(List list, boolean z, int i) {
        if (3 == (i & 3)) {
            this.supportedMessageTypes = list;
            this.isFullScreen = z;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, toLayoutLineBreakStylehpcqdu8.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = Boolean.hashCode(this.isFullScreen) % (this.supportedMessageTypes.hashCode() << 94);
        } else {
            iHashCode = Boolean.hashCode(this.isFullScreen) + (this.supportedMessageTypes.hashCode() * 31);
        }
        int i3 = write + 113;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public toLayoutAlignaXe7zB0(List list) {
        list.getClass();
        this.supportedMessageTypes = list;
        this.isFullScreen = true;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 41;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toLayoutAlignaXe7zB0)) {
            return false;
        }
        toLayoutAlignaXe7zB0 tolayoutalignaxe7zb0 = (toLayoutAlignaXe7zB0) obj;
        Object[] objArr = {this.supportedMessageTypes, tolayoutalignaxe7zb0.supportedMessageTypes};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.isFullScreen == tolayoutalignaxe7zb0.isFullScreen) {
            return true;
        }
        int i3 = serializer + 87;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Payload(supportedMessageTypes=" + this.supportedMessageTypes + ", isFullScreen=" + this.isFullScreen + ")";
        int i2 = write + 61;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
