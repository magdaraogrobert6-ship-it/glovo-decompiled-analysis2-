package o;

/* JADX INFO: loaded from: classes3.dex */
public final class addRearDisplayPresentationStatusListener {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final endRearDisplaySession read;
    public final long write;

    public addRearDisplayPresentationStatusListener(long j, endRearDisplaySession endreardisplaysession) {
        endreardisplaysession.getClass();
        this.write = j;
        this.read = endreardisplaysession;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read.hashCode() % (Long.hashCode(this.write) >>> 110);
        }
        return this.read.hashCode() + (Long.hashCode(this.write) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 115;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof addRearDisplayPresentationStatusListener)) {
            return false;
        }
        addRearDisplayPresentationStatusListener addreardisplaypresentationstatuslistener = (addRearDisplayPresentationStatusListener) obj;
        if (this.write == addreardisplaypresentationstatuslistener.write) {
            return this.read == addreardisplaypresentationstatuslistener.read;
        }
        int i3 = RemoteActionCompatParcelizer + 29;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "LocationRequest(intervalMillis=" + this.write + ", priority=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
