package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class setProfileAttributesfwf_client_release extends setAll implements metricProvider {
    public final setHoldoutKeysfwf_client_release IconCompatParcelizer;
    public final byte[] RemoteActionCompatParcelizer;
    public final int serializer;
    public final byte[] write;

    @Override // o.metricProvider
    public final byte[] MediaMetadataCompat() {
        return RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public setProfileAttributesfwf_client_release(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) {
        setHoldoutKeysfwf_client_release setholdoutkeysfwf_client_release = (setHoldoutKeysfwf_client_release) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
        MemoryCacheclearEvaluations1 memoryCacheclearEvaluations1 = setholdoutkeysfwf_client_release.IconCompatParcelizer;
        super(memoryCacheclearEvaluations1.write, false);
        this.IconCompatParcelizer = setholdoutkeysfwf_client_release;
        int i = memoryCacheclearEvaluations1.MediaDescriptionCompat;
        byte[] bArr = (byte[]) iscontentcardsunreadvisualindicatorenabled.read;
        if (bArr != null) {
            if (bArr.length == i + i) {
                this.serializer = 0;
                this.write = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArr, 0, i);
                this.RemoteActionCompatParcelizer = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArr, i, i);
                return;
            }
            int i2 = i + 4;
            if (bArr.length != i2 + i) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("public key has wrong size");
                throw null;
            }
            this.serializer = createCache.serializer(0, bArr);
            this.write = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArr, 4, i);
            this.RemoteActionCompatParcelizer = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArr, i2, i);
            return;
        }
        getEvaluationfwf_client_release getevaluationfwf_client_release = setholdoutkeysfwf_client_release.write;
        if (getevaluationfwf_client_release != null) {
            this.serializer = getevaluationfwf_client_release.serializer;
        } else {
            this.serializer = 0;
        }
        byte[] bArr2 = (byte[]) iscontentcardsunreadvisualindicatorenabled.write;
        if (bArr2 == null) {
            this.write = new byte[i];
        } else {
            if (bArr2.length != i) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("length of root must be equal to length of digest");
                throw null;
            }
            this.write = bArr2;
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

    public final byte[] RemoteActionCompatParcelizer() {
        byte[] bArr;
        int i = this.IconCompatParcelizer.IconCompatParcelizer.MediaDescriptionCompat;
        int i2 = this.serializer;
        int i3 = 0;
        if (i2 != 0) {
            bArr = new byte[i + 4 + i];
            createCache.read(bArr, i2, 0);
            i3 = 4;
        } else {
            bArr = new byte[i + i];
        }
        hsvJlNiLsgdefault.serializer(i3, bArr, this.write);
        hsvJlNiLsgdefault.serializer(i3 + i, bArr, this.RemoteActionCompatParcelizer);
        return bArr;
    }
}
