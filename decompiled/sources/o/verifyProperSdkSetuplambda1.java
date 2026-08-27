package o;

/* JADX INFO: loaded from: classes3.dex */
public final class verifyProperSdkSetuplambda1 extends subscribeToSessionUpdateslambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final subscribeToNoMatchingTriggerForEventlambda0 read;

    public verifyProperSdkSetuplambda1(subscribeToNoMatchingTriggerForEventlambda0 subscribetonomatchingtriggerforeventlambda0) {
        subscribetonomatchingtriggerforeventlambda0.getClass();
        this.read = subscribetonomatchingtriggerforeventlambda0;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = serializer + 105;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 49;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 99;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 72 / 0;
            }
            return true;
        }
        if (!(obj instanceof verifyProperSdkSetuplambda1)) {
            int i7 = i2 + 73;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (this.read == ((verifyProperSdkSetuplambda1) obj).read) {
            return true;
        }
        int i9 = i4 + 111;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Selected(score=" + this.read + ")";
        int i2 = serializer + 85;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
