package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getDetachedFromParentLookaheadPlacementui {
    public final String IconCompatParcelizer;
    public final setInteropViewFactoryHolderui RemoteActionCompatParcelizer;
    public final Object[] serializer;
    public final int write;

    public getDetachedFromParentLookaheadPlacementui(setInteropViewFactoryHolderui setinteropviewfactoryholderui, String str, Object[] objArr) {
        this.RemoteActionCompatParcelizer = setinteropviewfactoryholderui;
        this.IconCompatParcelizer = str;
        this.serializer = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.write = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.write = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2++;
            }
        }
    }
}
