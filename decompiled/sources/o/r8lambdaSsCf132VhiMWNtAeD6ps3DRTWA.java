package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaSsCf132VhiMWNtAeD6ps3DRTWA extends r8lambda8h6ssWCgEJ40frWkOBG5qOs2t0s {
    public final String IconCompatParcelizer;
    public final decodeSampledBitmapFromStream RemoteActionCompatParcelizer;
    public final float[] read;
    public final Map write;

    public r8lambdaSsCf132VhiMWNtAeD6ps3DRTWA(decodeSampledBitmapFromStream decodesampledbitmapfromstream, float[] fArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        fArr.getClass();
        this.RemoteActionCompatParcelizer = decodesampledbitmapfromstream;
        this.read = fArr;
        this.IconCompatParcelizer = "Success.";
        this.write = linkedHashMap;
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        return this.write.hashCode() + af$$ExternalSyntheticOutline0.m((Arrays.hashCode(this.read) + (iHashCode * 31)) * 31, 31, this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaSsCf132VhiMWNtAeD6ps3DRTWA)) {
            return false;
        }
        r8lambdaSsCf132VhiMWNtAeD6ps3DRTWA r8lambdasscf132vhimwntaed6ps3drtwa = (r8lambdaSsCf132VhiMWNtAeD6ps3DRTWA) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdasscf132vhimwntaed6ps3drtwa.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdasscf132vhimwntaed6ps3drtwa.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambdasscf132vhimwntaed6ps3drtwa.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdasscf132vhimwntaed6ps3drtwa.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VisitEssentialsSuccess(output=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", state=");
        sb.append(Arrays.toString(this.read));
        sb.append(", message=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", payload=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, this.write, ')');
    }
}
