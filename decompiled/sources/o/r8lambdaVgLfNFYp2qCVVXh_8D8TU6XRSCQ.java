package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final accessgetStrictcp RemoteActionCompatParcelizer;
    public final String read;
    public final List serializer;
    public final String write;

    public r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ(String str, String str2, accessgetStrictcp accessgetstrictcp, List list) {
        accessgetstrictcp.getClass();
        list.getClass();
        this.write = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = accessgetstrictcp;
        this.serializer = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.read);
        int iHashCode = this.serializer.hashCode() + ((this.RemoteActionCompatParcelizer.hashCode() + iM) * 31);
        int i4 = MediaSessionCompatQueueItem + 39;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("NavigationTypePreference(title=", this.write, ", description=", this.read, ", navigationAppOption=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", navigationSubOptions=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 61;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 67;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ)) {
            return false;
        }
        r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq = (r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ) obj;
        if (!this.write.equals(r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq.write) || !this.read.equals(r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq.read) || this.RemoteActionCompatParcelizer != r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq.RemoteActionCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq.serializer}, getCieXyz.write())).booleanValue();
    }
}
