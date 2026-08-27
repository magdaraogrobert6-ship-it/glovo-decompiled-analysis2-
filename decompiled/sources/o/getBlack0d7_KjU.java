package o;

/* JADX INFO: loaded from: classes.dex */
public final class getBlack0d7_KjU {
    public final boolean IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final int write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        return (((((iHashCode * 31) + this.RemoteActionCompatParcelizer) * 31) + (this.IconCompatParcelizer ? 1231 : 1237)) * 31) + this.MediaDescriptionCompat;
    }

    public getBlack0d7_KjU(String str, String str2, boolean z, int i, String str3, int i2) {
        str.getClass();
        str2.getClass();
        this.serializer = str;
        this.MediaBrowserCompatMediaItem = str2;
        this.IconCompatParcelizer = z;
        this.MediaDescriptionCompat = i;
        this.read = str3;
        this.write = i2;
        String upperCase = str2.toUpperCase(java.util.Locale.ROOT);
        upperCase.getClass();
        this.RemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) upperCase, (CharSequence) "INT", false) ? 3 : (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) upperCase, (CharSequence) "CHAR", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) upperCase, (CharSequence) "CLOB", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) upperCase, (CharSequence) "TEXT", false)) ? 2 : hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) upperCase, (CharSequence) "BLOB", false) ? 5 : (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) upperCase, (CharSequence) "REAL", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) upperCase, (CharSequence) "FLOA", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) upperCase, (CharSequence) "DOUB", false)) ? 4 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.serializer);
        sb.append("',\n            |   type = '");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append("',\n            |   affinity = '");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("',\n            |   notNull = '");
        sb.append(this.IconCompatParcelizer);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.MediaDescriptionCompat);
        sb.append("',\n            |   defaultValue = '");
        String str = this.read;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return isCurrentlyDisplayingInAppMessage.serializer(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat(sb.toString()));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof getBlack0d7_KjU) {
                boolean z = this.MediaDescriptionCompat > 0;
                getBlack0d7_KjU getblack0d7_kju = (getBlack0d7_KjU) obj;
                int i = getblack0d7_kju.write;
                if (z == (getblack0d7_kju.MediaDescriptionCompat > 0)) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getblack0d7_kju.serializer}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == getblack0d7_kju.IconCompatParcelizer) {
                        String str = getblack0d7_kju.read;
                        int i2 = this.write;
                        String str2 = this.read;
                        if ((i2 != 1 || i != 2 || str2 == null || hsvJlNiLsgdefault.serializer(str2, str)) && ((i2 != 2 || i != 1 || str == null || hsvJlNiLsgdefault.serializer(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : hsvJlNiLsgdefault.serializer(str2, str))) && this.RemoteActionCompatParcelizer == getblack0d7_kju.RemoteActionCompatParcelizer))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
