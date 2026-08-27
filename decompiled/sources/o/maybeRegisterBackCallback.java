package o;

import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3Response$Companion;
import com.roadrunner.delivery.state.TrackingEvent$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class maybeRegisterBackCallback extends AndroidView_androidKtAndroidView31 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final StateV3Response$Companion Companion = new StateV3Response$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final AndroidPopup_androidKtPopup41 data;
    public final List externalComponents;
    public final List hosts;
    public final List messages;
    public final setFitInsetsSides metadata;
    public final List trackingEvents;

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new StateV3$$ExternalSyntheticLambda0(28)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new StateV3$$ExternalSyntheticLambda0(29)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new TrackingEvent$$ExternalSyntheticLambda0(1)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new TrackingEvent$$ExternalSyntheticLambda0(2)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new TrackingEvent$$ExternalSyntheticLambda0(3)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new TrackingEvent$$ExternalSyntheticLambda0(4))};
        int i = IconCompatParcelizer + 49;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    public /* synthetic */ maybeRegisterBackCallback(int i, AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41, List list, setFitInsetsSides setfitinsetssides, List list2, List list3, List list4) {
        int i2;
        if ((i & 1) == 0) {
            this.data = null;
            int i3 = read + 101;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
            }
            if ((i & 2) == 0) {
                this.externalComponents = null;
                i2 = RemoteActionCompatParcelizer + 75;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            } else {
                this.externalComponents = list;
            }
            if ((i & 4) == 0) {
                this.metadata = null;
            } else {
                this.metadata = setfitinsetssides;
                int i5 = 2 % 2;
            }
            if ((i & 8) == 0) {
                this.trackingEvents = null;
            } else {
                this.trackingEvents = list2;
            }
            if ((i & 16) == 0) {
                int i6 = RemoteActionCompatParcelizer + 111;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                this.messages = instance_delegatelambda0.write;
            } else {
                this.messages = list3;
            }
            if ((i & 32) == 0) {
                this.hosts = null;
            } else {
                this.hosts = list4;
            }
        }
        this.data = androidPopup_androidKtPopup41;
        int i8 = 2 % 2;
        if ((i & 2) == 0) {
            this.externalComponents = null;
            i2 = RemoteActionCompatParcelizer + 75;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i9 = 2 % 2;
            }
        } else {
            this.externalComponents = list;
        }
        if ((i & 4) == 0) {
            this.metadata = null;
        } else {
            this.metadata = setfitinsetssides;
            int i10 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.trackingEvents = null;
        } else {
            this.trackingEvents = list2;
        }
        if ((i & 16) == 0) {
            int i11 = RemoteActionCompatParcelizer + 111;
            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            this.messages = instance_delegatelambda0.write;
        } else {
            this.messages = list3;
        }
        if ((i & 32) == 0) {
            this.hosts = null;
        } else {
            this.hosts = list4;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StateV3Response(data=" + this.data + ", externalComponents=" + this.externalComponents + ", metadata=" + this.metadata + ", trackingEvents=" + this.trackingEvents + ", messages=" + this.messages + ", hosts=" + this.hosts + ")";
        int i2 = read + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41 = this.data;
        if (androidPopup_androidKtPopup41 == null) {
            int i2 = RemoteActionCompatParcelizer + 57;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = androidPopup_androidKtPopup41.hashCode();
        }
        List list = this.externalComponents;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        setFitInsetsSides setfitinsetssides = this.metadata;
        int iHashCode4 = setfitinsetssides == null ? 0 : setfitinsetssides.hashCode();
        List list2 = this.trackingEvents;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        List list3 = this.messages;
        if (list3 == null) {
            int i4 = RemoteActionCompatParcelizer + 47;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = list3.hashCode();
        }
        List list4 = this.hosts;
        return (((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + (list4 != null ? list4.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 35;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maybeRegisterBackCallback)) {
            int i4 = i2 + 121;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        maybeRegisterBackCallback mayberegisterbackcallback = (maybeRegisterBackCallback) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, mayberegisterbackcallback.data}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.externalComponents, mayberegisterbackcallback.externalComponents}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, mayberegisterbackcallback.metadata}, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer + 91;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, mayberegisterbackcallback.trackingEvents}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messages, mayberegisterbackcallback.messages}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hosts, mayberegisterbackcallback.hosts}, getCieXyz.write())).booleanValue();
    }
}
