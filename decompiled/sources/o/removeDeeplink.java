package o;

/* JADX INFO: loaded from: classes3.dex */
public final class removeDeeplink extends getPushToken {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final getRawReferrer RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final androidx.compose.ui.text.AnnotatedString write;

    public removeDeeplink(String str, androidx.compose.ui.text.AnnotatedString annotatedString, String str2, getRawReferrer getrawreferrer) {
        str.getClass();
        this.serializer = str;
        this.write = annotatedString;
        this.read = str2;
        this.RemoteActionCompatParcelizer = getrawreferrer;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[PHI: r1 r3
  0x0034: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r3v6 androidx.compose.ui.text.AnnotatedString) = (r3v0 androidx.compose.ui.text.AnnotatedString), (r3v8 androidx.compose.ui.text.AnnotatedString) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        androidx.compose.ui.text.AnnotatedString annotatedString;
        int i;
        int iHashCode2;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 61;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            iHashCode = this.serializer.hashCode();
            annotatedString = this.write;
            if (annotatedString == null) {
                i = IconCompatParcelizer + 65;
                MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i4 = 4 / 5;
                }
                iHashCode2 = 0;
            } else {
                iHashCode2 = annotatedString.hashCode();
                int i5 = IconCompatParcelizer + 109;
                MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        } else {
            iHashCode = this.serializer.hashCode();
            annotatedString = this.write;
            if (annotatedString == null) {
                i = IconCompatParcelizer + 65;
                MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i7 = 4 / 5;
                }
                iHashCode2 = 0;
            } else {
                iHashCode2 = annotatedString.hashCode();
                int i8 = IconCompatParcelizer + 109;
                MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
            }
        }
        String str = this.read;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        getRawReferrer getrawreferrer = this.RemoteActionCompatParcelizer;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (getrawreferrer != null ? getrawreferrer.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Suspended(title=" + this.serializer + ", description=" + ((Object) this.write) + ", buttonText=" + this.read + ", suspensionAction=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 93;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 37;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof removeDeeplink)) {
            return false;
        }
        removeDeeplink removedeeplink = (removeDeeplink) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, removedeeplink.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, removedeeplink.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, removedeeplink.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, removedeeplink.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i6 = MediaDescriptionCompat + 3;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return !(i6 % 2 == 0);
        }
        int i7 = IconCompatParcelizer + 11;
        MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
