package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0 implements r8lambdaB7lTIYT0cAH9MiUxCtgCibXo3iw {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final Boolean RemoteActionCompatParcelizer;
    public final String serializer;
    public final r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU write;

    public r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0(r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU r8lambdafbhg_qe5ghikjzf0cq6g2ruyiu, Boolean bool, String str) {
        r8lambdafbhg_qe5ghikjzf0cq6g2ruyiu.getClass();
        this.write = r8lambdafbhg_qe5ghikjzf0cq6g2ruyiu;
        this.RemoteActionCompatParcelizer = bool;
        this.serializer = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.write.hashCode();
        Boolean bool = this.RemoteActionCompatParcelizer;
        int iHashCode3 = 0;
        if (bool == null) {
            int i4 = read + 73;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = bool.hashCode();
        }
        String str = this.serializer;
        if (str != null) {
            iHashCode3 = str.hashCode();
            int i5 = IconCompatParcelizer + 15;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("FlowTerminated(reason=");
        sb.append(this.write);
        sb.append(", isConsumerError=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", errorCode=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.serializer, ")");
        int i2 = IconCompatParcelizer + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 74 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 87;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0)) {
            return false;
        }
        r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0 r8lambdadgzfnzek_ynxssj7dowrjatonk0 = (r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0) obj;
        if (this.write == r8lambdadgzfnzek_ynxssj7dowrjatonk0.write) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdadgzfnzek_ynxssj7dowrjatonk0.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdadgzfnzek_ynxssj7dowrjatonk0.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i4 = read + 1;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = read + 53;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
