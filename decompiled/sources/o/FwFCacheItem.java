package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFCacheItem extends setAll {
    public final byte[] IconCompatParcelizer;
    public final byte[] MediaMetadataCompat;
    public final byte[] RemoteActionCompatParcelizer;
    public final byte[] serializer;
    public final byte[] write;

    public FwFCacheItem(accessgetHelpcenterRegionConfig accessgethelpcenterregionconfig, byte[] bArr) {
        super(accessgethelpcenterregionconfig, true);
        int i = accessgethelpcenterregionconfig.RemoteActionCompatParcelizer;
        if (i != 2 && i != 3 && i != 4) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i, "K: ", " is not supported for Crystals Kyber"));
            throw null;
        }
        int i2 = i * 384;
        new getFinancial(androidx.compose.ui.graphics.Fields.SpotShadowColor);
        new getFinancial(androidx.compose.ui.graphics.Fields.RotationX);
        new Event(androidx.compose.ui.graphics.Fields.RotationX);
        new Event(androidx.compose.ui.graphics.Fields.RotationY);
        this.IconCompatParcelizer = accessbootstrapIfNeeded.serializer(bArr, 0, i2);
        this.MediaMetadataCompat = accessbootstrapIfNeeded.serializer(bArr, i2, ((i2 + 32) + i2) - 32);
        int i3 = i2 + i2;
        int i4 = i3 + 32;
        this.serializer = accessbootstrapIfNeeded.serializer(bArr, i3, i4);
        int i5 = i3 + 64;
        this.write = accessbootstrapIfNeeded.serializer(bArr, i4, i5);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.serializer(bArr, i5, i3 + 96);
    }
}
