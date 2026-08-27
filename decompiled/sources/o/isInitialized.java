package o;

/* JADX INFO: loaded from: classes3.dex */
public final class isInitialized extends setWebView {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final getAutofillManager write;

    /* JADX WARN: Illegal instructions before constructor call */
    public isInitialized(String str) {
        getAutofillManager getautofillmanager = getAutofillManager.Short;
        getautofillmanager.getClass();
        super(str, getautofillmanager, null);
        this.RemoteActionCompatParcelizer = str;
        this.write = getautofillmanager;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 31;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = (this.write.hashCode() >> (this.RemoteActionCompatParcelizer.hashCode() >>> 60)) / 57;
        } else {
            iHashCode = (this.write.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31)) * 31;
        }
        int i3 = MediaSessionCompatQueueItem + 7;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 77;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof isInitialized)) {
                return false;
            }
            isInitialized isinitialized = (isInitialized) obj;
            Object[] objArr = {this.RemoteActionCompatParcelizer, isinitialized.RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || this.write != isinitialized.write) {
                return false;
            }
        }
        int i3 = RatingCompat + 31;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Success(messageText=" + this.RemoteActionCompatParcelizer + ", snackbarDuration=" + this.write + ", buttonViewEntity=null)";
        int i2 = RatingCompat + 13;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
