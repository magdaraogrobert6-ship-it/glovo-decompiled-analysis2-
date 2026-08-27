package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.provider.data.model.WorkZoneResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.LicenseData;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class InstallReferrer2 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String bonusMultiplier;
    public final List bonusTypes;
    public final Boolean calendarEnabled;
    public final debug centerGeoJson;
    public final debug geoJson;
    public final String name;
    public static final WorkZoneResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.WorkZoneResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 75;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            LicenseData licenseData = LicenseData.read;
            int i4 = IconCompatParcelizer + 77;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 24 / 0;
            }
            return licenseData;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new waExternalSyntheticLambda3(28)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.WorkZoneResponse$Companion] */
    static {
        Object obj = null;
        int i = serializer + 85;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ InstallReferrer2(int i, String str, debug debugVar, debug debugVar2, String str2, List list, Boolean bool) {
        int i2;
        if (3 != (i & 3)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, LicenseData.read.getDescriptor());
            throw null;
        }
        this.name = str;
        this.geoJson = debugVar;
        if ((i & 4) == 0) {
            this.centerGeoJson = null;
        } else {
            this.centerGeoJson = debugVar2;
        }
        if ((i & 8) == 0) {
            this.bonusMultiplier = null;
        } else {
            this.bonusMultiplier = str2;
        }
        int i3 = 2 % 2;
        if ((i & 16) == 0) {
            this.bonusTypes = null;
            i2 = write + 121;
        } else {
            this.bonusTypes = list;
            i2 = write + 37;
        }
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i2 % 2;
        int i5 = 2 % 2;
        if ((i & 32) == 0) {
            this.calendarEnabled = null;
        } else {
            this.calendarEnabled = bool;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.geoJson.hashCode();
        debug debugVar = this.centerGeoJson;
        int iHashCode4 = debugVar == null ? 0 : debugVar.hashCode();
        String str = this.bonusMultiplier;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        List list = this.bonusTypes;
        if (list == null) {
            int i4 = IconCompatParcelizer + 97;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
            int i6 = write + 63;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        Boolean bool = this.calendarEnabled;
        return ((((((((iHashCode3 + (iHashCode2 * 31)) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "WorkZoneResponse(name=" + this.name + ", geoJson=" + this.geoJson + ", centerGeoJson=" + this.centerGeoJson + ", bonusMultiplier=" + this.bonusMultiplier + ", bonusTypes=" + this.bonusTypes + ", calendarEnabled=" + this.calendarEnabled + ")";
        int i2 = IconCompatParcelizer + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallReferrer2)) {
            return false;
        }
        InstallReferrer2 installReferrer2 = (InstallReferrer2) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, installReferrer2.name}, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 5;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.geoJson, installReferrer2.geoJson}, getCieXyz.write())).booleanValue()) {
            int i4 = write;
            int i5 = i4 + 7;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i4 + 83;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.centerGeoJson, installReferrer2.centerGeoJson}, getCieXyz.write())).booleanValue()) {
            int i8 = IconCompatParcelizer + 105;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bonusMultiplier, installReferrer2.bonusMultiplier}, getCieXyz.write())).booleanValue()) {
            int i10 = IconCompatParcelizer + 87;
            write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bonusTypes, installReferrer2.bonusTypes}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.calendarEnabled, installReferrer2.calendarEnabled}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i12 = IconCompatParcelizer + 51;
        write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i12 % 2 != 0;
    }
}
