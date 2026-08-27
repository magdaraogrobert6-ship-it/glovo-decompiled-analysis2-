package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.opportunities.data.Zone$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.wf;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class w8ExternalSyntheticLambda6 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String bonusMultiplier;
    public final List bonusTypes;
    public final Boolean calendarEnabled;
    public final vf centerGeoJson;
    public final vf geoJson;
    public final int id;
    public final String name;
    public static final Zone$Companion Companion = new Object() { // from class: com.roadrunner.opportunities.data.Zone$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 17;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            wf wfVar = wf.IconCompatParcelizer;
            int i4 = write + 57;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return wfVar;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new waExternalSyntheticLambda3(0)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.opportunities.data.Zone$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 111;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ w8ExternalSyntheticLambda6(int i, int i2, String str, vf vfVar, vf vfVar2, String str2, List list, Boolean bool) {
        if (3 != (i & 3)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, wf.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        if ((i & 4) == 0) {
            this.geoJson = null;
            int i3 = 2 % 2;
        } else {
            this.geoJson = vfVar;
        }
        if ((i & 8) == 0) {
            this.centerGeoJson = null;
        } else {
            this.centerGeoJson = vfVar2;
        }
        if ((i & 16) == 0) {
            this.bonusMultiplier = null;
            int i4 = read + 125;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } else {
            this.bonusMultiplier = str2;
        }
        if ((i & 32) == 0) {
            int i6 = IconCompatParcelizer + 7;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                this.bonusTypes = null;
                int i7 = 24 / 0;
            } else {
                this.bonusTypes = null;
            }
            int i8 = 2 % 2;
        } else {
            this.bonusTypes = list;
        }
        if ((i & 64) != 0) {
            this.calendarEnabled = bool;
            return;
        }
        this.calendarEnabled = null;
        int i9 = IconCompatParcelizer + 77;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Zone(id=", this.id, ", name=", this.name, ", geoJson=");
        sbM.append(this.geoJson);
        sbM.append(", centerGeoJson=");
        sbM.append(this.centerGeoJson);
        sbM.append(", bonusMultiplier=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, this.bonusMultiplier, ", bonusTypes=", this.bonusTypes, ", calendarEnabled=");
        String strM = c8$$ExternalSyntheticOutline0.m(sbM, ")", this.calendarEnabled);
        int i4 = read + 101;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.id) * 31, 31, this.name);
        vf vfVar = this.geoJson;
        int iHashCode = 0;
        int iHashCode2 = vfVar == null ? 0 : vfVar.hashCode();
        vf vfVar2 = this.centerGeoJson;
        int iHashCode3 = vfVar2 == null ? 0 : vfVar2.hashCode();
        String str = this.bonusMultiplier;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        List list = this.bonusTypes;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        Boolean bool = this.calendarEnabled;
        if (bool != null) {
            iHashCode = bool.hashCode();
            int i4 = read + 109;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 3 / 2;
            }
        }
        return ((((((((iM + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 125;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8ExternalSyntheticLambda6)) {
            int i5 = i2 + 45;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 99;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        w8ExternalSyntheticLambda6 w8externalsyntheticlambda6 = (w8ExternalSyntheticLambda6) obj;
        if (this.id != w8externalsyntheticlambda6.id) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, w8externalsyntheticlambda6.name}, getCieXyz.write())).booleanValue()) {
            int i10 = read + 107;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 64 / 0;
            }
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.geoJson, w8externalsyntheticlambda6.geoJson}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.centerGeoJson, w8externalsyntheticlambda6.centerGeoJson}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bonusMultiplier, w8externalsyntheticlambda6.bonusMultiplier}, getCieXyz.write())).booleanValue()) {
                int i12 = read + 9;
                IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i12 % 2 == 0;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bonusTypes, w8externalsyntheticlambda6.bonusTypes}, getCieXyz.write())).booleanValue()) {
                int i13 = read + 31;
                IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.calendarEnabled, w8externalsyntheticlambda6.calendarEnabled}, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
