package o;

/* JADX INFO: loaded from: classes3.dex */
public final class q5 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk read;
    public final r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk serializer;

    public q5(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk2) {
        this.read = r8lambdaucgighn8fiyv_vccodeafjfpedk;
        this.serializer = r8lambdaucgighn8fiyv_vccodeafjfpedk2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.serializer.hashCode() / (this.read.hashCode() * 39);
        } else {
            iHashCode = this.serializer.hashCode() + (this.read.hashCode() * 31);
        }
        int i3 = IconCompatParcelizer + 47;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SerializationPolymorphicDefaultPair(base=" + this.read + ", default=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof q5)) {
                return false;
            }
            q5 q5Var = (q5) obj;
            if (!this.read.equals(q5Var.read)) {
                int i3 = RemoteActionCompatParcelizer + 97;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            if (!this.serializer.equals(q5Var.serializer)) {
                return false;
            }
        }
        return true;
    }
}
