package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.opportunities.data.Subzone$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.w9;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class waExternalSyntheticLambda0 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final Subzone$Companion Companion = new Object() { // from class: com.roadrunner.opportunities.data.Subzone$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 85;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            w9 w9Var = w9.IconCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 121;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return w9Var;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final vf centerGeoJson;
    public final List h3Indexes;
    public final int id;
    public final String name;
    public final w6ExternalSyntheticLambda0 paymentResponse;
    public final List zoneIds;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.opportunities.data.Subzone$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new wa(0)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new wa(15)), null};
        int i = serializer + 51;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 75;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.h3Indexes;
        int i5 = i2 + 13;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final List RatingCompat() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List list = this.zoneIds;
        int i4 = i3 + 101;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return list;
    }

    public final int RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.id;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final vf read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 73;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.centerGeoJson;
        }
        int i3 = 97 / 0;
        return this.centerGeoJson;
    }

    public final w6ExternalSyntheticLambda0 serializer() {
        w6ExternalSyntheticLambda0 w6externalsyntheticlambda0;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            w6externalsyntheticlambda0 = this.paymentResponse;
            int i4 = 89 / 0;
        } else {
            w6externalsyntheticlambda0 = this.paymentResponse;
        }
        int i5 = i3 + 21;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return w6externalsyntheticlambda0;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.name;
        }
        int i3 = 34 / 0;
        return this.name;
    }

    public /* synthetic */ waExternalSyntheticLambda0(int i, int i2, String str, List list, vf vfVar, List list2, w6ExternalSyntheticLambda0 w6externalsyntheticlambda0) {
        Object obj = null;
        if (31 == (i & 31)) {
            this.id = i2;
            this.name = str;
            this.zoneIds = list;
            this.centerGeoJson = vfVar;
            this.h3Indexes = list2;
            if ((i & 32) == 0) {
                this.paymentResponse = null;
                int i3 = IconCompatParcelizer + 79;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 64 / 0;
                    return;
                }
                return;
            }
            this.paymentResponse = w6externalsyntheticlambda0;
            int i5 = IconCompatParcelizer + 19;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, w9.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.zoneIds, af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.id) * 31, 31, this.name), 31);
        int iM2 = c8$$ExternalSyntheticOutline0.m(this.h3Indexes, (this.centerGeoJson.hashCode() + iM) * 31, 31);
        w6ExternalSyntheticLambda0 w6externalsyntheticlambda0 = this.paymentResponse;
        if (w6externalsyntheticlambda0 == null) {
            iHashCode = 0;
        } else {
            iHashCode = w6externalsyntheticlambda0.hashCode();
            int i4 = IconCompatParcelizer + 63;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = iM2 + iHashCode;
        int i7 = IconCompatParcelizer + 119;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return i6;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Subzone(id=", this.id, ", name=", this.name, ", zoneIds=");
        sbM.append(this.zoneIds);
        sbM.append(", centerGeoJson=");
        sbM.append(this.centerGeoJson);
        sbM.append(", h3Indexes=");
        sbM.append(this.h3Indexes);
        sbM.append(", paymentResponse=");
        sbM.append(this.paymentResponse);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 73;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof waExternalSyntheticLambda0) {
            waExternalSyntheticLambda0 waexternalsyntheticlambda0 = (waExternalSyntheticLambda0) obj;
            if (this.id != waexternalsyntheticlambda0.id) {
                int i2 = IconCompatParcelizer + 47;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, waexternalsyntheticlambda0.name}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.zoneIds, waexternalsyntheticlambda0.zoneIds}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.centerGeoJson, waexternalsyntheticlambda0.centerGeoJson}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.h3Indexes, waexternalsyntheticlambda0.h3Indexes}, getCieXyz.write())).booleanValue()) {
                int i3 = RemoteActionCompatParcelizer + 29;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentResponse, waexternalsyntheticlambda0.paymentResponse}, getCieXyz.write())).booleanValue();
        }
        int i5 = IconCompatParcelizer + 13;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i5 % 2 == 0;
    }
}
