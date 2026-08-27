package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.data.model.ZoneResponse$Companion;
import kotlinx.serialization.Serializable;
import o.getResponseCode;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class InstallReferrer1 {
    public static final ZoneResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.ZoneResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 115;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                getResponseCode getresponsecode = getResponseCode.RemoteActionCompatParcelizer;
                throw null;
            }
            getResponseCode getresponsecode2 = getResponseCode.RemoteActionCompatParcelizer;
            int i3 = IconCompatParcelizer + 97;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return getresponsecode2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final Integer cityId;
    public final String geoId;
    public final debug geoJson;
    public final long id;
    public final String name;
    public final getBooleanGooglePlayInstantParam startingPoint;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.ZoneResponse$Companion] */
    static {
        int i = IconCompatParcelizer + 23;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final debug IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 53;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        debug debugVar = this.geoJson;
        int i5 = i2 + 29;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return debugVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBooleanGooglePlayInstantParam RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        getBooleanGooglePlayInstantParam getbooleangoogleplayinstantparam = this.startingPoint;
        int i5 = i3 + 95;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getbooleangoogleplayinstantparam;
    }

    public final long read() {
        int i = 2 % 2;
        int i2 = read + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.id;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ InstallReferrer1(int i, long j, String str, Integer num, String str2, getBooleanGooglePlayInstantParam getbooleangoogleplayinstantparam, debug debugVar) {
        if (19 != (i & 19)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 19, getResponseCode.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.id = j;
        this.name = str;
        if ((i & 4) == 0) {
            this.cityId = 0;
            int i2 = read + 49;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            this.cityId = num;
        }
        int i4 = 2 % 2;
        if ((i & 8) == 0) {
            int i5 = RemoteActionCompatParcelizer + 19;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                this.geoId = null;
                int i6 = 19 / 0;
            } else {
                this.geoId = null;
            }
            int i7 = 2 % 2;
        } else {
            this.geoId = str2;
        }
        this.startingPoint = getbooleangoogleplayinstantparam;
        if ((i & 32) == 0) {
            this.geoJson = null;
            return;
        }
        this.geoJson = debugVar;
        int i8 = RemoteActionCompatParcelizer + 63;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 125;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.name);
        Integer num = this.cityId;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.geoId;
        if (str == null) {
            int i4 = RemoteActionCompatParcelizer + 51;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 5 % 2;
            }
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i6 = read + 39;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int iHashCode3 = this.startingPoint.hashCode();
        debug debugVar = this.geoJson;
        int iHashCode4 = ((iHashCode3 + ((((iM + iHashCode2) * 31) + iHashCode) * 31)) * 31) + (debugVar != null ? debugVar.hashCode() : 0);
        int i8 = read + 109;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return iHashCode4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("ZoneResponse(id=", ", name=", this.id, this.name);
        sb.append(", cityId=");
        sb.append(this.cityId);
        sb.append(", geoId=");
        sb.append(this.geoId);
        sb.append(", startingPoint=");
        sb.append(this.startingPoint);
        sb.append(", geoJson=");
        sb.append(this.geoJson);
        sb.append(")");
        String string = sb.toString();
        int i4 = read + 61;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 125;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof InstallReferrer1)) {
            int i4 = read + 21;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        InstallReferrer1 installReferrer1 = (InstallReferrer1) obj;
        if (this.id != installReferrer1.id) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, installReferrer1.name}, getCieXyz.write())).booleanValue()) {
            int i6 = read + 3;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cityId, installReferrer1.cityId}, getCieXyz.write())).booleanValue()) {
            int i8 = RemoteActionCompatParcelizer + 101;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i8 % 2 != 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.geoId, installReferrer1.geoId}, getCieXyz.write())).booleanValue()) {
            int i9 = RemoteActionCompatParcelizer + 69;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startingPoint, installReferrer1.startingPoint}, getCieXyz.write())).booleanValue()) {
            int i10 = RemoteActionCompatParcelizer + 123;
            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i10 % 2 != 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.geoJson, installReferrer1.geoJson}, getCieXyz.write())).booleanValue()) {
            int i11 = read + 121;
            RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i11 % 2 == 0;
        }
        int i12 = RemoteActionCompatParcelizer + 69;
        read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return true;
    }
}
