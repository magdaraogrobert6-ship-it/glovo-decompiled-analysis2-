package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class logFeatureFlagImpression {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final String RemoteActionCompatParcelizer;
    public final Set read;
    public final String serializer;
    public final int write;

    public logFeatureFlagImpression(int i, String str, String str2, Set set) {
        str.getClass();
        str2.getClass();
        this.write = i;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
        this.read = set;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.write) * 31, 31, this.RemoteActionCompatParcelizer), 31, this.serializer);
        int i4 = MediaSessionCompatQueueItem + 89;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 25;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("ReviewScore(value=", this.write, ", label=", this.RemoteActionCompatParcelizer, ", question=");
        sbM.append(this.serializer);
        sbM.append(", tags=");
        sbM.append(this.read);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 5;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        if (i2 % 2 == 0) {
            int i4 = 44 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof logFeatureFlagImpression) {
            logFeatureFlagImpression logfeatureflagimpression = (logFeatureFlagImpression) obj;
            if (this.write != logfeatureflagimpression.write) {
                int i5 = i3 + 79;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 3;
                }
            } else {
                Object[] objArr = {this.RemoteActionCompatParcelizer, logfeatureflagimpression.RemoteActionCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    Object[] objArr2 = {this.serializer, logfeatureflagimpression.serializer};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() && this.read.equals(logfeatureflagimpression.read)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
