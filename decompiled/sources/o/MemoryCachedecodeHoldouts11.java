package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachedecodeHoldouts11 extends setEvaluationsfwf_client_release implements metricProvider {
    public final byte[] IconCompatParcelizer;
    public final byte[] RemoteActionCompatParcelizer;
    public final MemoryCacheclearEvaluations1 serializer;
    public final int write;

    /* JADX WARN: Illegal instructions before constructor call */
    public MemoryCachedecodeHoldouts11(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) {
        MemoryCacheclearEvaluations1 memoryCacheclearEvaluations1 = (MemoryCacheclearEvaluations1) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
        super((Object) memoryCacheclearEvaluations1.write, false);
        this.serializer = memoryCacheclearEvaluations1;
        int i = memoryCacheclearEvaluations1.MediaDescriptionCompat;
        byte[] bArr = (byte[]) iscontentcardsunreadvisualindicatorenabled.read;
        if (bArr != null) {
            if (bArr.length == i + i) {
                this.write = 0;
                this.IconCompatParcelizer = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArr, 0, i);
                this.RemoteActionCompatParcelizer = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArr, i, i);
                return;
            }
            int i2 = i + 4;
            if (bArr.length != i2 + i) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("public key has wrong size");
                throw null;
            }
            this.write = createCache.serializer(0, bArr);
            this.IconCompatParcelizer = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArr, 4, i);
            this.RemoteActionCompatParcelizer = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArr, i2, i);
            return;
        }
        getFeatures getfeatures = memoryCacheclearEvaluations1.IconCompatParcelizer;
        if (getfeatures != null) {
            this.write = getfeatures.read;
        } else {
            this.write = 0;
        }
        byte[] bArr2 = (byte[]) iscontentcardsunreadvisualindicatorenabled.write;
        if (bArr2 == null) {
            this.IconCompatParcelizer = new byte[i];
        } else {
            if (bArr2.length != i) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("length of root must be equal to length of digest");
                throw null;
            }
            this.IconCompatParcelizer = bArr2;
        }
        byte[] bArr3 = (byte[]) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        if (bArr3 == null) {
            this.RemoteActionCompatParcelizer = new byte[i];
        } else if (bArr3.length == i) {
            this.RemoteActionCompatParcelizer = bArr3;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("length of publicSeed must be equal to length of digest");
            throw null;
        }
    }

    @Override // o.metricProvider
    public final byte[] MediaMetadataCompat() {
        byte[] bArr;
        int i = this.serializer.MediaDescriptionCompat;
        int i2 = this.write;
        int i3 = 0;
        if (i2 != 0) {
            bArr = new byte[i + 4 + i];
            createCache.read(bArr, i2, 0);
            i3 = 4;
        } else {
            bArr = new byte[i + i];
        }
        hsvJlNiLsgdefault.serializer(i3, bArr, this.IconCompatParcelizer);
        hsvJlNiLsgdefault.serializer(i3 + i, bArr, this.RemoteActionCompatParcelizer);
        return bArr;
    }
}
