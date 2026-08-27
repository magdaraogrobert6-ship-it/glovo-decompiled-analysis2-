package o;

/* JADX INFO: loaded from: classes2.dex */
public final class canBeSaved {
    public final Object[] IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final getElevation serializer;
    public final String write;

    public canBeSaved(getElevation getelevation, String str, Object[] objArr) {
        this.serializer = getelevation;
        this.write = str;
        this.IconCompatParcelizer = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.RemoteActionCompatParcelizer = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.RemoteActionCompatParcelizer = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2++;
            }
        }
    }

    public final component250nO6VwU IconCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        if ((i & 1) != 0) {
            return component250nO6VwU.PROTO2;
        }
        return (i & 4) == 4 ? component250nO6VwU.EDITIONS : component250nO6VwU.PROTO3;
    }
}
