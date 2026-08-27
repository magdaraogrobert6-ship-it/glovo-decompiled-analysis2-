package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setApplicationContext extends setWebView {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final getAutofillManager MediaMetadataCompat;
    public final execSessionSuccessCallbackCommand RemoteActionCompatParcelizer;
    public final String write;

    /* JADX WARN: Illegal instructions before constructor call */
    public setApplicationContext(String str, getAutofillManager getautofillmanager, execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand, int i) {
        if ((i & 2) != 0) {
            int i2 = RatingCompat + 123;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getautofillmanager = getAutofillManager.Short;
        }
        if ((i & 4) != 0) {
            int i4 = MediaSessionCompatQueueItem + 53;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            execsessionsuccesscallbackcommand = null;
        }
        str.getClass();
        getautofillmanager.getClass();
        super(str, getautofillmanager, execsessionsuccesscallbackcommand);
        this.write = str;
        this.MediaMetadataCompat = getautofillmanager;
        this.RemoteActionCompatParcelizer = execsessionsuccesscallbackcommand;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 19;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.MediaMetadataCompat.hashCode();
        execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand = this.RemoteActionCompatParcelizer;
        if (execsessionsuccesscallbackcommand == null) {
            int i4 = RatingCompat + 53;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = execsessionsuccesscallbackcommand.hashCode();
        }
        return ((iHashCode3 + (iHashCode2 * 31)) * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaSessionCompatQueueItem + 67;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof setApplicationContext)) {
            int i4 = RatingCompat + 103;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        setApplicationContext setapplicationcontext = (setApplicationContext) obj;
        Object[] objArr = {this.write, setapplicationcontext.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i5 = RatingCompat + 75;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (this.MediaMetadataCompat != setapplicationcontext.MediaMetadataCompat) {
            return false;
        }
        Object[] objArr2 = {this.RemoteActionCompatParcelizer, setapplicationcontext.RemoteActionCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = MediaSessionCompatQueueItem + 87;
        RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Error(messageText=" + this.write + ", snackbarDuration=" + this.MediaMetadataCompat + ", buttonViewEntity=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = MediaSessionCompatQueueItem + 109;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 56 / 0;
        }
        return str;
    }
}
