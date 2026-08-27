package o;

/* JADX INFO: loaded from: classes3.dex */
public final class logPushNotificationOpenedlambda1 extends logPushNotificationActionClickedlambda11 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final String serializer;
    public final String write;

    public logPushNotificationOpenedlambda1(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.write = str;
        this.serializer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PrimaryButtonViewEntity(key=", this.write, ", text=", this.serializer, ")");
            int i3 = IconCompatParcelizer + 103;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 72 / 0;
            }
            return strWrite;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PrimaryButtonViewEntity(key=", this.write, ", text=", this.serializer, ")");
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.serializer.hashCode() >> (this.write.hashCode() % 81);
        } else {
            iHashCode = (this.write.hashCode() * 31) + this.serializer.hashCode();
        }
        int i3 = read + 47;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 29;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof logPushNotificationOpenedlambda1)) {
            int i4 = i2 + 1;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        logPushNotificationOpenedlambda1 logpushnotificationopenedlambda1 = (logPushNotificationOpenedlambda1) obj;
        Object[] objArr = {this.write, logpushnotificationopenedlambda1.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.serializer, logpushnotificationopenedlambda1.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i6 = read + 47;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
