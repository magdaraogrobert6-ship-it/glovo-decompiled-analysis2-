package o;

/* JADX INFO: loaded from: classes3.dex */
public final class logPushNotificationOpenedlambda30 extends logPushNotificationActionClickedlambda11 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public logPushNotificationOpenedlambda30(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("TertiaryButtonViewEntity(key=", this.read, ", text=", this.RemoteActionCompatParcelizer, ")");
        int i4 = write + 9;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer.hashCode() >>> (this.read.hashCode() >>> 9);
        }
        return (this.read.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 93;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof logPushNotificationOpenedlambda30)) {
            int i5 = i2 + 71;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        logPushNotificationOpenedlambda30 logpushnotificationopenedlambda30 = (logPushNotificationOpenedlambda30) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, logpushnotificationopenedlambda30.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, logpushnotificationopenedlambda30.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i7 = IconCompatParcelizer + 99;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
