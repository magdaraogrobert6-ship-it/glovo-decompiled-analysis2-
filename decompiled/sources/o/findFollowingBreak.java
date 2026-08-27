package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class findFollowingBreak {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final ArrayList IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final ArrayList serializer;
    public final ArrayList write;

    public findFollowingBreak(String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        str.getClass();
        str2.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = arrayList;
        this.IconCompatParcelizer = arrayList2;
        this.serializer = arrayList3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 21;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.IconCompatParcelizer, r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.write, af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31), 31);
        int i4 = MediaDescriptionCompat + 17;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 19;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ChatAssetManifest(version=", this.read, ", assetsCdnPrefix=", this.RemoteActionCompatParcelizer, ", routes=");
        sbM.append(this.write);
        sbM.append(", routesWithSsg=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", assets=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 125;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 123;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findFollowingBreak)) {
            return false;
        }
        findFollowingBreak findfollowingbreak = (findFollowingBreak) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, findfollowingbreak.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, findfollowingbreak.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() || !this.write.equals(findfollowingbreak.write)) {
            return false;
        }
        if (this.IconCompatParcelizer.equals(findfollowingbreak.IconCompatParcelizer)) {
            return this.serializer.equals(findfollowingbreak.serializer);
        }
        int i3 = MediaDescriptionCompat + 29;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
