package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setEditable extends setEmailNotificationSubscriptionTypelambda1 {
    private static int RatingCompat = 1;
    private static int serializer;
    public final getTextSelectionRange RemoteActionCompatParcelizer;
    public final String read;

    @Override // o.setEmailNotificationSubscriptionTypelambda1
    public final String write() {
        int i = 2 % 2;
        int i2 = RatingCompat + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read;
        }
        int i3 = 17 / 0;
        return this.read;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setEditable(getTextSelectionRange gettextselectionrange, String str) {
        super(setSelection.LOGGED_IN, str);
        gettextselectionrange.getClass();
        str.getClass();
        this.RemoteActionCompatParcelizer = gettextselectionrange;
        this.read = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 25;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.read.hashCode() % (this.RemoteActionCompatParcelizer.hashCode() / 48);
        } else {
            iHashCode = this.read.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        }
        int i3 = RatingCompat + 99;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Login(userData=" + this.RemoteActionCompatParcelizer + ", invocationSite=" + this.read + ")";
        int i2 = RatingCompat + 23;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setEditable)) {
            int i4 = i3 + 37;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        setEditable seteditable = (setEditable) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, seteditable.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, seteditable.read}, getCieXyz.write())).booleanValue();
        }
        int i5 = serializer + 111;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
