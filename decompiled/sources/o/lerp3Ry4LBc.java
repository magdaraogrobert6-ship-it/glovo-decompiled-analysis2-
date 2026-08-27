package o;

/* JADX INFO: loaded from: classes.dex */
public final class lerp3Ry4LBc {
    public final int IconCompatParcelizer;
    public final String read;
    public final PlatformFocusOwner serializer;
    public final Object[] write;

    public lerp3Ry4LBc(isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance, String str, Object[] objArr) {
        this.serializer = isbettercandidate_i7lrpngminoraxisdistance;
        this.read = str;
        this.write = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.IconCompatParcelizer = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.IconCompatParcelizer = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2++;
            }
        }
    }
}
