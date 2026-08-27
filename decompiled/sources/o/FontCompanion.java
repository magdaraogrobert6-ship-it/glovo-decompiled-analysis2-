package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.maps.plugin.locationcomponent.ModelLayerRenderer;
import com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$CancelOrder$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.Fontvxs03AYdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FontCompanion {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final String afterTimerDescription;
    public final getDismissOnBackPress button;
    public final String description;
    public final String duringTimerDescription;
    public final String id;
    public final List requiredSteps;
    public final String title;
    public static final CustomerUnavailable$CancelOrder$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$CancelOrder$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 49;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Fontvxs03AYdefault fontvxs03AYdefault = Fontvxs03AYdefault.RemoteActionCompatParcelizer;
            int i4 = read + 69;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return fontvxs03AYdefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new DelegatingFontLoaderForDeprecatedUsage(7))};

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = (~(i7 | i8 | (~i2))) | (~(i6 | i5 | i2));
        int i10 = (~(i8 | i2)) | (~(i8 | i6));
        int i11 = (~(i2 | i5)) | i6;
        int i12 = i6 + i5 + i3 + (1661237432 * i) + (961048624 * i4);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i6) - 281083904) + ((-1329838950) * i5) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i3) + ((-1559232512) * i) + (1553989632 * i4) + (2020540416 * i13);
        int i15 = (i6 * (-2040814728)) + 92927091 + (i5 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i3 * (-2040814133)) + (i * (-1614655000)) + (i4 * 500164112) + (i13 * 184877056);
        return i14 + ((i15 * i15) * 1800994816) != 1 ? write(objArr) : serializer(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$CancelOrder$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 51;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 86 / 0;
        }
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        FontCompanion fontCompanion = (FontCompanion) objArr[0];
        int i = 2 % 2;
        int i2 = write + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return fontCompanion.title;
        }
        int i3 = 76 / 0;
        return fontCompanion.title;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        FontCompanion fontCompanion = (FontCompanion) objArr[0];
        int i = 2 % 2;
        int i2 = write + 115;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return fontCompanion.duringTimerDescription;
        }
        String str = fontCompanion.duringTimerDescription;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 111;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.description;
        int i4 = i2 + 81;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final List MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 67;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        List list = this.requiredSteps;
        int i5 = i3 + 125;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.afterTimerDescription;
        int i4 = i3 + 59;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 83;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 7;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final getDismissOnBackPress write() {
        int i = 2 % 2;
        int i2 = write + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        getDismissOnBackPress getdismissonbackpress = this.button;
        int i5 = i3 + 89;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return getdismissonbackpress;
    }

    public /* synthetic */ FontCompanion(int i, String str, String str2, String str3, String str4, getDismissOnBackPress getdismissonbackpress, String str5, List list) {
        if (15 == (i & 15)) {
            this.title = str;
            this.description = str2;
            this.duringTimerDescription = str3;
            this.afterTimerDescription = str4;
            if ((i & 16) == 0) {
                this.button = null;
            } else {
                this.button = getdismissonbackpress;
            }
            int i2 = 2 % 2;
            if ((i & 32) == 0) {
                int i3 = write + 97;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    this.id = null;
                } else {
                    this.id = null;
                    throw null;
                }
            } else {
                this.id = str5;
            }
            if ((i & 64) == 0) {
                this.requiredSteps = null;
                int i4 = write + 49;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return;
            }
            this.requiredSteps = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, Fontvxs03AYdefault.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CancelOrder(title=", this.title, ", description=", this.description, ", duringTimerDescription=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.duringTimerDescription, ", afterTimerDescription=", this.afterTimerDescription, ", button=");
        sbM.append(this.button);
        sbM.append(", id=");
        sbM.append(this.id);
        sbM.append(", requiredSteps=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.requiredSteps, ")");
        int i4 = IconCompatParcelizer + 35;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = write + 99;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.duringTimerDescription), 31, this.afterTimerDescription);
        getDismissOnBackPress getdismissonbackpress = this.button;
        int iHashCode3 = 0;
        if (getdismissonbackpress == null) {
            int i4 = IconCompatParcelizer + 21;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = getdismissonbackpress.hashCode();
        }
        String str = this.id;
        if (str == null) {
            int i6 = IconCompatParcelizer + 99;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        List list = this.requiredSteps;
        if (list != null) {
            iHashCode3 = list.hashCode();
            int i8 = write + 35;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        return ((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 65;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof FontCompanion)) {
            return false;
        }
        FontCompanion fontCompanion = (FontCompanion) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, fontCompanion.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, fontCompanion.description}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.duringTimerDescription, fontCompanion.duringTimerDescription}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.afterTimerDescription, fontCompanion.afterTimerDescription}, getCieXyz.write())).booleanValue()) {
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.button, fontCompanion.button}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, fontCompanion.id}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requiredSteps, fontCompanion.requiredSteps}, getCieXyz.write())).booleanValue() ^ true);
            }
            int i4 = IconCompatParcelizer + 59;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 75;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 16 / 0;
        }
        return false;
    }

    public final String MediaDescriptionCompat() {
        int iRemoteActionCompatParcelizer = ModelLayerRenderer.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = ModelLayerRenderer.RemoteActionCompatParcelizer();
        return (String) IconCompatParcelizer(ModelLayerRenderer.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, ModelLayerRenderer.RemoteActionCompatParcelizer(), 4047310, new Object[]{this}, -4047309);
    }

    public final String read() {
        int iRemoteActionCompatParcelizer = ModelLayerRenderer.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = ModelLayerRenderer.RemoteActionCompatParcelizer();
        return (String) IconCompatParcelizer(ModelLayerRenderer.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, ModelLayerRenderer.RemoteActionCompatParcelizer(), -1887183568, new Object[]{this}, 1887183568);
    }
}
