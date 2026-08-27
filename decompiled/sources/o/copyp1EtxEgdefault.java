package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.data.models.AutoAcceptResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.copyv2rsoowdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class copyp1EtxEgdefault extends AndroidView_androidKtAndroidView31 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final AutoAcceptResponse$Companion Companion = new Object() { // from class: com.roadrunner.delivery.accept.data.models.AutoAcceptResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 31;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return copyv2rsoowdefault.read;
            }
            copyv2rsoowdefault copyv2rsoowdefaultVar = copyv2rsoowdefault.read;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final AndroidPopup_androidKtPopup41 innerData;
    public final List messages;
    public final setFitInsetsSides metadata;
    public final List trackingEvents;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.accept.data.models.AutoAcceptResponse$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new accessgetAboveBaselinecp(12)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new accessgetAboveBaselinecp(13)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new accessgetAboveBaselinecp(14))};
        int i = write + 67;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ copyp1EtxEgdefault(int i, AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41, List list, setFitInsetsSides setfitinsetssides, List list2) {
        if ((i & 1) == 0) {
            this.innerData = null;
        } else {
            this.innerData = androidPopup_androidKtPopup41;
            int i2 = serializer + 111;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) == 0) {
            int i4 = IconCompatParcelizer + 105;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.messages = null;
        } else {
            this.messages = list;
        }
        if ((i & 4) == 0) {
            this.metadata = null;
            int i6 = 2 % 2;
        } else {
            this.metadata = setfitinsetssides;
        }
        if ((i & 8) != 0) {
            this.trackingEvents = list2;
            return;
        }
        int i7 = IconCompatParcelizer + 53;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        this.trackingEvents = instance_delegatelambda0.write;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[PHI: r1 r3
  0x001c: PHI (r1v12 o.AndroidPopup_androidKtPopup41) = (r1v4 o.AndroidPopup_androidKtPopup41), (r1v14 o.AndroidPopup_androidKtPopup41) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode3 = 0;
        if (i2 % 2 != 0) {
            androidPopup_androidKtPopup41 = this.innerData;
            iHashCode = 1;
            if (androidPopup_androidKtPopup41 == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = androidPopup_androidKtPopup41.hashCode();
            }
        } else {
            androidPopup_androidKtPopup41 = this.innerData;
            iHashCode = 0;
            if (androidPopup_androidKtPopup41 == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = androidPopup_androidKtPopup41.hashCode();
            }
        }
        List list = this.messages;
        if (list == null) {
            int i3 = serializer + 11;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            iHashCode3 = list.hashCode();
        }
        setFitInsetsSides setfitinsetssides = this.metadata;
        if (setfitinsetssides != null) {
            iHashCode = setfitinsetssides.hashCode();
            int i5 = serializer + 9;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        return this.trackingEvents.hashCode() + (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AutoAcceptResponse(innerData=" + this.innerData + ", messages=" + this.messages + ", metadata=" + this.metadata + ", trackingEvents=" + this.trackingEvents + ")";
        int i2 = serializer + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 21;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof copyp1EtxEgdefault) {
            copyp1EtxEgdefault copyp1etxegdefault = (copyp1EtxEgdefault) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.innerData, copyp1etxegdefault.innerData}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messages, copyp1etxegdefault.messages}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, copyp1etxegdefault.metadata}, getCieXyz.write())).booleanValue()) {
                    int i5 = serializer + 97;
                    IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, copyp1etxegdefault.trackingEvents}, getCieXyz.write())).booleanValue();
            }
            int i7 = IconCompatParcelizer + 123;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = i2 + 115;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
