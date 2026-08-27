package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setCache implements getNone_3YsG6Y, getDefault_3YsG6Y {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ getDefault_3YsG6Y IconCompatParcelizer;
    public final /* synthetic */ getNone_3YsG6Y RemoteActionCompatParcelizer;

    public setCache(getNone_3YsG6Y getnone_3ysg6y, getDefault_3YsG6Y getdefault_3ysg6y) {
        getnone_3ysg6y.getClass();
        getdefault_3ysg6y.getClass();
        this.RemoteActionCompatParcelizer = getnone_3ysg6y;
        this.IconCompatParcelizer = getdefault_3ysg6y;
    }

    @Override // o.getNone_3YsG6Y
    public final Object cacheGalleryImage(String str, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objCacheGalleryImage = this.RemoteActionCompatParcelizer.cacheGalleryImage(str, shortNewsContentCardView);
        int i4 = write + 45;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objCacheGalleryImage;
    }

    @Override // o.getDefault_3YsG6Y
    public final applyPausedPrecomposition RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = write + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            return this.IconCompatParcelizer.RemoteActionCompatParcelizer(str);
        }
        str.getClass();
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
