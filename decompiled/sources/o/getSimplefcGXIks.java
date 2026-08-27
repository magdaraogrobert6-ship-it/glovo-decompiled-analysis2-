package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getSimplefcGXIks {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public final accessgetGocp IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public final boolean serializer;

    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 93;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 11;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = write + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.read;
        int i4 = i3 + 103;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final accessgetGocp serializer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.IconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer;
        }
        throw null;
    }

    public getSimplefcGXIks(accessgetGocp accessgetgocp, String str, boolean z, boolean z2) {
        str.getClass();
        this.IconCompatParcelizer = accessgetgocp;
        this.read = str;
        this.serializer = z;
        this.RemoteActionCompatParcelizer = z2;
    }

    public static getSimplefcGXIks write(getSimplefcGXIks getsimplefcgxiks, accessgetGocp accessgetgocp) {
        int i = 2 % 2;
        String str = getsimplefcgxiks.read;
        boolean z = getsimplefcgxiks.serializer;
        boolean z2 = getsimplefcgxiks.RemoteActionCompatParcelizer;
        getsimplefcgxiks.getClass();
        accessgetgocp.getClass();
        str.getClass();
        getSimplefcGXIks getsimplefcgxiks2 = new getSimplefcGXIks(accessgetgocp, str, z, z2);
        int i2 = MediaDescriptionCompat + 27;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return getsimplefcgxiks2;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer) + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.read), 31, this.serializer);
        int i4 = MediaDescriptionCompat + 67;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("RouteOptions(destination=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", vehicleType=");
        sb.append(this.read);
        sb.append(", avoidHighways=");
        String strSerializer = MediaSessionCompatQueueItem.serializer(sb, this.serializer, ", avoidTolls=", this.RemoteActionCompatParcelizer, ")");
        int i2 = MediaDescriptionCompat + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strSerializer;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 9;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof getSimplefcGXIks)) {
                return false;
            }
            getSimplefcGXIks getsimplefcgxiks = (getSimplefcGXIks) obj;
            if (!this.IconCompatParcelizer.equals(getsimplefcgxiks.IconCompatParcelizer)) {
                return false;
            }
            Object[] objArr = {this.read, getsimplefcgxiks.read};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || this.serializer != getsimplefcgxiks.serializer || this.RemoteActionCompatParcelizer != getsimplefcgxiks.RemoteActionCompatParcelizer) {
                return false;
            }
        }
        int i4 = write + 33;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
