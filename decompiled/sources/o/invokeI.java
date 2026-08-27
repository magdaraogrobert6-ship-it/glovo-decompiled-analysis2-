package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.data.model.SubzoneResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getStringInstallVersion;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class invokeI {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final SubzoneResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.SubzoneResponse$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 117;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getStringInstallVersion getstringinstallversion = getStringInstallVersion.IconCompatParcelizer;
            int i4 = serializer + 47;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getstringinstallversion;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final debug centerGeoJson;
    public final List h3Indexes;
    public final int id;
    public final String name;
    public final IPackageHandler payment;
    public final List zoneIds;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.SubzoneResponse$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new getSessionParameters(13)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new getSessionParameters(14)), null};
        int i = serializer + 31;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 46 / 0;
        }
    }

    public /* synthetic */ invokeI(int i, int i2, String str, List list, debug debugVar, List list2, IPackageHandler iPackageHandler) {
        Object obj = null;
        if (31 == (i & 31)) {
            this.id = i2;
            this.name = str;
            this.zoneIds = list;
            this.centerGeoJson = debugVar;
            this.h3Indexes = list2;
            if ((i & 32) == 0) {
                this.payment = null;
                int i3 = IconCompatParcelizer + 113;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.payment = iPackageHandler;
            int i4 = IconCompatParcelizer + 23;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 38 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, getStringInstallVersion.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.h3Indexes, (this.centerGeoJson.hashCode() + c8$$ExternalSyntheticOutline0.m(this.zoneIds, af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.id) * 31, 31, this.name), 31)) * 31, 31);
        IPackageHandler iPackageHandler = this.payment;
        if (iPackageHandler == null) {
            int i5 = IconCompatParcelizer + 123;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i = i5 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode = iPackageHandler.hashCode();
            int i6 = RemoteActionCompatParcelizer + 87;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = iHashCode;
        }
        return iM + i;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("SubzoneResponse(id=", this.id, ", name=", this.name, ", zoneIds=");
        sbM.append(this.zoneIds);
        sbM.append(", centerGeoJson=");
        sbM.append(this.centerGeoJson);
        sbM.append(", h3Indexes=");
        sbM.append(this.h3Indexes);
        sbM.append(", payment=");
        sbM.append(this.payment);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 33;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof invokeI)) {
            return false;
        }
        invokeI invokei = (invokeI) obj;
        if (this.id != invokei.id) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, invokei.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.zoneIds, invokei.zoneIds}, getCieXyz.write())).booleanValue()) {
            int i2 = RemoteActionCompatParcelizer + 31;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.centerGeoJson, invokei.centerGeoJson}, getCieXyz.write())).booleanValue()) {
            int i4 = IconCompatParcelizer + 25;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.h3Indexes, invokei.h3Indexes}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payment, invokei.payment}, getCieXyz.write())).booleanValue();
        }
        int i6 = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
