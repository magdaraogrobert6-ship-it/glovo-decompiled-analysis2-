package o;

/* JADX INFO: loaded from: classes2.dex */
public final class NestedScrollDispatcherdispatchPostFling1 {
    public final String IconCompatParcelizer;
    public final int read;
    public final getOnPreKeyEvent serializer;
    public final Object[] write;

    public final int serializer() {
        int i = this.read;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    public NestedScrollDispatcherdispatchPostFling1(getOnPreKeyEvent getonprekeyevent, String str, Object[] objArr) {
        this.serializer = getonprekeyevent;
        this.IconCompatParcelizer = str;
        this.write = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.read = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.read = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3++;
            }
        }
    }
}
