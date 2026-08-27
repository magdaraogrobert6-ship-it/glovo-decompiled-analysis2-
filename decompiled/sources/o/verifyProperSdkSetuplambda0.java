package o;

/* JADX INFO: loaded from: classes3.dex */
public final class verifyProperSdkSetuplambda0 extends subscribeToSessionUpdateslambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final subscribeToNoMatchingTriggerForEventlambda0 read;

    public verifyProperSdkSetuplambda0(subscribeToNoMatchingTriggerForEventlambda0 subscribetonomatchingtriggerforeventlambda0) {
        subscribetonomatchingtriggerforeventlambda0.getClass();
        this.read = subscribetonomatchingtriggerforeventlambda0;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (obj instanceof verifyProperSdkSetuplambda0) {
                return this.read == ((verifyProperSdkSetuplambda0) obj).read;
            }
            int i5 = i3 + 75;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i3 + 55;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Submitted(score=" + this.read + ")";
        int i2 = IconCompatParcelizer + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
