package o;

/* JADX INFO: loaded from: classes3.dex */
public final class UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1 extends SchedulersExternalSyntheticLambda1 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final String serializer;
    public final String write;

    public UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1(String str, String str2) {
        this.serializer = str;
        this.write = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Displayable(description=", this.serializer, ", buttonText=", this.write, ")");
        int i4 = IconCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + (this.serializer.hashCode() * 31);
        int i4 = IconCompatParcelizer + 33;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1) {
            UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1 unfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1 = (UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1) obj;
            if (this.serializer.equals(unfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1.serializer)) {
                return this.write.equals(unfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1.write);
            }
            i = IconCompatParcelizer + 15;
        } else {
            i = IconCompatParcelizer + 121;
        }
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i % 2;
        return false;
    }
}
