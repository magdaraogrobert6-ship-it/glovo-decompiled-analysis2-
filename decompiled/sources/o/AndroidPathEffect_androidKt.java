package o;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPathEffect_androidKt {
    public boolean MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public boolean RatingCompat;
    public String RemoteActionCompatParcelizer;
    public boolean write;
    public int serializer = -1;
    public int read = -1;
    public int IconCompatParcelizer = -1;

    public final transform58bKbWc IconCompatParcelizer() {
        String str = this.RemoteActionCompatParcelizer;
        boolean z = this.MediaDescriptionCompat;
        if (str == null) {
            return new transform58bKbWc(z, this.MediaBrowserCompatMediaItem, this.serializer, this.write, this.RatingCompat, this.read, this.IconCompatParcelizer, -1, -1);
        }
        boolean z2 = this.MediaBrowserCompatMediaItem;
        boolean z3 = this.write;
        boolean z4 = this.RatingCompat;
        int i = this.read;
        int i2 = this.IconCompatParcelizer;
        int i3 = opN5in7k0.write;
        transform58bKbWc transform58bkbwc = new transform58bKbWc(z, z2, "android-app://androidx.navigation/".concat(str).hashCode(), z3, z4, i, i2, -1, -1);
        transform58bkbwc.MediaMetadataCompat = str;
        return transform58bkbwc;
    }
}
