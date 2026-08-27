package o;

/* JADX INFO: loaded from: classes3.dex */
public final class registerFacebookSDKJSInterface extends setWebView {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final getAutofillManager MediaMetadataCompat;
    public final execSessionSuccessCallbackCommand RemoteActionCompatParcelizer;
    public final String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public registerFacebookSDKJSInterface(String str, getAutofillManager getautofillmanager, execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand) {
        super(str, getautofillmanager, execsessionsuccesscallbackcommand);
        getautofillmanager.getClass();
        this.write = str;
        this.MediaMetadataCompat = getautofillmanager;
        this.RemoteActionCompatParcelizer = execsessionsuccesscallbackcommand;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d A[PHI: r1 r3 r4
  0x003d: PHI (r1v9 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r3v7 int) = (r3v1 int), (r3v9 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r4v4 o.execSessionSuccessCallbackCommand) = (r4v0 o.execSessionSuccessCallbackCommand), (r4v5 o.execSessionSuccessCallbackCommand) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r1 r3
  0x0033: PHI (r1v6 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r3v2 int) = (r3v1 int), (r3v9 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand;
        int i = 2 % 2;
        int i2 = RatingCompat + 85;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode3 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.write.hashCode();
            iHashCode2 = this.MediaMetadataCompat.hashCode();
            execsessionsuccesscallbackcommand = this.RemoteActionCompatParcelizer;
            int i3 = 26 / 0;
            if (execsessionsuccesscallbackcommand == null) {
                int i4 = MediaBrowserCompatMediaItem + 109;
                RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                iHashCode3 = execsessionsuccesscallbackcommand.hashCode();
            }
        } else {
            iHashCode = this.write.hashCode();
            iHashCode2 = this.MediaMetadataCompat.hashCode();
            execsessionsuccesscallbackcommand = this.RemoteActionCompatParcelizer;
            if (execsessionsuccesscallbackcommand == null) {
                int i6 = MediaBrowserCompatMediaItem + 109;
                RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                iHashCode3 = execsessionsuccesscallbackcommand.hashCode();
            }
        }
        return ((iHashCode2 + (iHashCode * 31)) * 31) + iHashCode3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 43;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 11;
            MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof registerFacebookSDKJSInterface)) {
            return false;
        }
        registerFacebookSDKJSInterface registerfacebooksdkjsinterface = (registerFacebookSDKJSInterface) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, registerfacebooksdkjsinterface.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.MediaMetadataCompat != registerfacebooksdkjsinterface.MediaMetadataCompat) {
            int i7 = RatingCompat + 61;
            MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 == 0;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, registerfacebooksdkjsinterface.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = RatingCompat + 9;
        MediaBrowserCompatMediaItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Warning(messageText=" + this.write + ", snackbarDuration=" + this.MediaMetadataCompat + ", buttonViewEntity=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = RatingCompat + 45;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
