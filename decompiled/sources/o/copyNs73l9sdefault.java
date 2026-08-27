package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.data.models.AutoAcceptV2Response$Companion;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.copyHL5avdY;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class copyNs73l9sdefault extends AndroidView_androidKtAndroidView31 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final AutoAcceptV2Response$Companion Companion = new Object() { // from class: com.roadrunner.delivery.accept.data.models.AutoAcceptV2Response$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 113;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return copyHL5avdY.RemoteActionCompatParcelizer;
            }
            int i3 = 5 / 0;
            return copyHL5avdY.RemoteActionCompatParcelizer;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final AndroidPopup_androidKtPopup41 innerData;
    public final List messages;
    public final setFitInsetsSides metadata;
    public final List trackingEvents;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.accept.data.models.AutoAcceptV2Response$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new accessgetAboveBaselinecp(15)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new accessgetAboveBaselinecp(16)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new accessgetAboveBaselinecp(17))};
        int i = RemoteActionCompatParcelizer + 1;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ copyNs73l9sdefault(int i, AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41, List list, setFitInsetsSides setfitinsetssides, List list2) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.innerData = null;
        } else {
            this.innerData = androidPopup_androidKtPopup41;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            this.messages = null;
        } else {
            this.messages = list;
        }
        if ((i & 4) == 0) {
            this.metadata = null;
        } else {
            this.metadata = setfitinsetssides;
            int i3 = write + 97;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        }
        if ((i & 8) != 0) {
            this.trackingEvents = list2;
            int i5 = serializer + 45;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        int i7 = write + 123;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        this.trackingEvents = instance_delegatelambda0.write;
        int i9 = serializer + 81;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final unpackAbsFloat2 IconCompatParcelizer() {
        traceValue tracevalue;
        int i = 2 % 2;
        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41 = this.innerData;
        Object obj = null;
        if (!(androidPopup_androidKtPopup41 instanceof traceValue)) {
            tracevalue = null;
        } else {
            int i2 = serializer;
            int i3 = i2 + 49;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            tracevalue = (traceValue) androidPopup_androidKtPopup41;
            int i5 = i2 + 3;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        if (tracevalue == null) {
            return null;
        }
        int i7 = serializer + 13;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            List list = tracevalue.components;
            throw null;
        }
        List list2 = tracevalue.components;
        if (list2 == null) {
            return null;
        }
        for (Object obj2 : list2) {
            if (obj2 instanceof unpackAbsFloat2) {
                obj = obj2;
                break;
            }
        }
        return (unpackAbsFloat2) obj;
    }

    public final unpackAbsFloat1 RemoteActionCompatParcelizer() {
        List list;
        int i = 2 % 2;
        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41 = this.innerData;
        Object obj = null;
        traceValue tracevalue = androidPopup_androidKtPopup41 instanceof traceValue ? (traceValue) androidPopup_androidKtPopup41 : null;
        if (tracevalue == null || (list = tracevalue.components) == null) {
            return null;
        }
        int i2 = write + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = serializer + 31;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        for (Object obj2 : list) {
            if (obj2 instanceof unpackAbsFloat1) {
                obj = obj2;
                break;
            }
        }
        return (unpackAbsFloat1) obj;
    }

    public final InlineClassHelper_jvmKt serializer() {
        traceValue tracevalue;
        InlineClassHelper_jvmKt inlineClassHelper_jvmKt;
        List list;
        Object next;
        int i = 2 % 2;
        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41 = this.innerData;
        if (androidPopup_androidKtPopup41 instanceof traceValue) {
            int i2 = write + 93;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                tracevalue = (traceValue) androidPopup_androidKtPopup41;
                int i3 = 47 / 0;
            } else {
                tracevalue = (traceValue) androidPopup_androidKtPopup41;
            }
        } else {
            int i4 = write + 49;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            tracevalue = null;
        }
        if (tracevalue == null || (list = tracevalue.components) == null) {
            inlineClassHelper_jvmKt = null;
        } else {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof InlineClassHelper_jvmKt));
            inlineClassHelper_jvmKt = (InlineClassHelper_jvmKt) next;
        }
        int i6 = serializer + 41;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return inlineClassHelper_jvmKt;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020 A[PHI: r1
  0x0020: PHI (r1v5 o.AndroidPopup_androidKtPopup41) = (r1v4 o.AndroidPopup_androidKtPopup41), (r1v14 o.AndroidPopup_androidKtPopup41) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public final unpackFloat1 write() {
        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41;
        traceValue tracevalue;
        List list;
        int i = 2 % 2;
        int i2 = serializer + 97;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            androidPopup_androidKtPopup41 = this.innerData;
            int i4 = 58 / 0;
            if (androidPopup_androidKtPopup41 instanceof traceValue) {
                tracevalue = (traceValue) androidPopup_androidKtPopup41;
                int i5 = i3 + 25;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                tracevalue = null;
            }
        } else {
            androidPopup_androidKtPopup41 = this.innerData;
            if (androidPopup_androidKtPopup41 instanceof traceValue) {
                tracevalue = (traceValue) androidPopup_androidKtPopup41;
                int i7 = i3 + 25;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                tracevalue = null;
            }
        }
        if (tracevalue == null || (list = tracevalue.components) == null) {
            return null;
        }
        int i9 = write + 55;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            list.iterator();
            throw null;
        }
        for (Object obj2 : list) {
            if (obj2 instanceof unpackFloat1) {
                obj = obj2;
                break;
            }
        }
        return (unpackFloat1) obj;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = write + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41 = this.innerData;
        if (androidPopup_androidKtPopup41 == null) {
            int i5 = i3 + 95;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = androidPopup_androidKtPopup41.hashCode();
        }
        List list = this.messages;
        if (list == null) {
            int i7 = write + 49;
            int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i8;
            iHashCode2 = i7 % 2 != 0 ? 1 : 0;
            int i9 = i8 + 3;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            iHashCode2 = list.hashCode();
        }
        setFitInsetsSides setfitinsetssides = this.metadata;
        return this.trackingEvents.hashCode() + (((((iHashCode * 31) + iHashCode2) * 31) + (setfitinsetssides != null ? setfitinsetssides.hashCode() : 0)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AutoAcceptV2Response(innerData=" + this.innerData + ", messages=" + this.messages + ", metadata=" + this.metadata + ", trackingEvents=" + this.trackingEvents + ")";
        int i2 = write + 23;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof copyNs73l9sdefault)) {
            return false;
        }
        copyNs73l9sdefault copyns73l9sdefault = (copyNs73l9sdefault) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.innerData, copyns73l9sdefault.innerData}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messages, copyns73l9sdefault.messages}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, copyns73l9sdefault.metadata}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, copyns73l9sdefault.trackingEvents}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i2 = serializer + 23;
                    int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    write = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 61;
                    serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
                int i6 = write + 93;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = serializer + 41;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i8 % 2 == 0;
        }
        int i9 = write + 59;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
