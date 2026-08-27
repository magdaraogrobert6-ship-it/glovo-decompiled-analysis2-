package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$CustomerCall$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.accessgetCursivecp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class accessgetMonospacecp {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final CustomerUnavailable$CustomerCall$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$CustomerCall$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 111;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessgetCursivecp accessgetcursivecp = accessgetCursivecp.serializer;
            int i4 = RemoteActionCompatParcelizer + 17;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return accessgetcursivecp;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String callee;
    public final String id;
    public final boolean masked;
    public final String phoneNumber;
    public final List requiredSteps;
    public final String title;
    public final List trackingEvents;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~i5;
        int i10 = (~(i7 | i9)) | i8;
        int i11 = ~(i9 | i8 | i7);
        int i12 = i6 + i3 + i + ((-112346298) * i2) + (505796074 * i4);
        int i13 = i12 * i12;
        int i14 = ((1543607772 * i6) - 1525940224) + (1734765094 * i3) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i) + (859308032 * i2) + (310902784 * i4) + (417529856 * i13);
        int i15 = (i6 * (-1233303660)) + 1670658458 + (i3 * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i * (-1233302909)) + (i2 * 1075253458) + (i4 * 745806526) + (i13 * 1512636416);
        if (i14 + (i15 * i15 * (-1737162752)) != 1) {
            return serializer(objArr);
        }
        accessgetMonospacecp accessgetmonospacecp = (accessgetMonospacecp) objArr[0];
        int i16 = 2 % 2;
        int i17 = serializer;
        int i18 = i17 + 81;
        IconCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i19 = i18 % 2;
        List list = accessgetmonospacecp.trackingEvents;
        int i20 = i17 + 63;
        IconCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i21 = i20 % 2;
        return list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$CustomerCall$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new DelegatingFontLoaderForDeprecatedUsage(11)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new DelegatingFontLoaderForDeprecatedUsage(12))};
        int i = write + 43;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 29;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = serializer + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.title;
        }
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 65;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.phoneNumber;
        int i5 = i2 + 31;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.masked;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.callee;
        }
        int i3 = 76 / 0;
        return this.callee;
    }

    public final List write() {
        int i = 2 % 2;
        int i2 = serializer + 67;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        List list = this.requiredSteps;
        int i5 = i3 + 51;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public /* synthetic */ accessgetMonospacecp(int i, String str, boolean z, String str2, String str3, List list, String str4, List list2) {
        if (23 != (i & 23)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 23, accessgetCursivecp.serializer.getDescriptor());
            throw null;
        }
        this.title = str;
        this.masked = z;
        this.phoneNumber = str2;
        if ((i & 8) == 0) {
            this.callee = null;
            int i2 = 2 % 2;
        } else {
            this.callee = str3;
        }
        this.trackingEvents = list;
        if ((i & 32) == 0) {
            int i3 = IconCompatParcelizer + 93;
            int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i4;
            int i5 = i3 % 2;
            this.id = null;
            int i6 = i4 + 33;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
        } else {
            this.id = str4;
        }
        if ((i & 64) != 0) {
            this.requiredSteps = list2;
            return;
        }
        int i8 = serializer + 101;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            this.requiredSteps = null;
        } else {
            this.requiredSteps = null;
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("CustomerCall(title=", this.title, ", masked=", ", phoneNumber=", this.masked);
        c8$$ExternalSyntheticOutline0.m(sbM, this.phoneNumber, ", callee=", this.callee, ", trackingEvents=");
        sbM.append(this.trackingEvents);
        sbM.append(", id=");
        sbM.append(this.id);
        sbM.append(", requiredSteps=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.requiredSteps, ")");
        int i4 = serializer + 123;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        int iHashCode;
        int iHashCode2;
        accessgetMonospacecp accessgetmonospacecp = (accessgetMonospacecp) objArr[0];
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(accessgetmonospacecp.title.hashCode() * 31, 31, accessgetmonospacecp.masked), 31, accessgetmonospacecp.phoneNumber);
        String str = accessgetmonospacecp.callee;
        if (str == null) {
            int i2 = serializer + 107;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iM2 = c8$$ExternalSyntheticOutline0.m(accessgetmonospacecp.trackingEvents, (iM + iHashCode) * 31, 31);
        String str2 = accessgetmonospacecp.id;
        if (str2 == null) {
            int i4 = IconCompatParcelizer + 93;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i6 = serializer + 35;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 4 % 4;
            }
        }
        List list = accessgetmonospacecp.requiredSteps;
        return Integer.valueOf(((iM2 + iHashCode2) * 31) + (list != null ? list.hashCode() : 0));
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 113;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 51 / 0;
            }
            return true;
        }
        if (!(obj instanceof accessgetMonospacecp)) {
            return false;
        }
        accessgetMonospacecp accessgetmonospacecp = (accessgetMonospacecp) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, accessgetmonospacecp.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.masked == accessgetmonospacecp.masked) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, accessgetmonospacecp.phoneNumber}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.callee, accessgetmonospacecp.callee}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, accessgetmonospacecp.trackingEvents}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, accessgetmonospacecp.id}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requiredSteps, accessgetmonospacecp.requiredSteps}, getCieXyz.write())).booleanValue();
        }
        int i4 = serializer + 89;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final int hashCode() {
        return ((Integer) RemoteActionCompatParcelizer(new Object[]{this}, ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), -1401088617, ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), 1401088617)).intValue();
    }

    public final List RatingCompat() {
        return (List) RemoteActionCompatParcelizer(new Object[]{this}, ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), 769799875, ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), -769799874);
    }
}
