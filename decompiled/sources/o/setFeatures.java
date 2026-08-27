package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class setFeatures extends setAll implements metricProvider {
    public volatile long IconCompatParcelizer;
    public final byte[] MediaMetadataCompat;
    public final byte[] MediaSessionCompatQueueItem;
    public final byte[] RatingCompat;
    public volatile getCustomerProfilefwf_client_release RemoteActionCompatParcelizer;
    public final setHoldoutKeysfwf_client_release serializer;
    public final byte[] write;

    @Override // o.metricProvider
    public final byte[] MediaMetadataCompat() {
        byte[] bArrSerializer;
        synchronized (this) {
            bArrSerializer = serializer();
        }
        return bArrSerializer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public setFeatures(setHoldouts setholdouts) {
        setHoldoutKeysfwf_client_release setholdoutkeysfwf_client_release = setholdouts.RemoteActionCompatParcelizer;
        MemoryCacheclearEvaluations1 memoryCacheclearEvaluations1 = setholdoutkeysfwf_client_release.IconCompatParcelizer;
        super(memoryCacheclearEvaluations1.write, true);
        this.serializer = setholdoutkeysfwf_client_release;
        int i = memoryCacheclearEvaluations1.MediaDescriptionCompat;
        this.IconCompatParcelizer = setholdouts.IconCompatParcelizer;
        byte[] bArr = setholdouts.MediaDescriptionCompat;
        if (bArr == null) {
            this.MediaMetadataCompat = new byte[i];
        } else {
            if (bArr.length != i) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("size of secretKeySeed needs to be equal size of digest");
                throw null;
            }
            this.MediaMetadataCompat = bArr;
        }
        byte[] bArr2 = setholdouts.MediaBrowserCompatMediaItem;
        if (bArr2 == null) {
            this.RatingCompat = new byte[i];
        } else {
            if (bArr2.length != i) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("size of secretKeyPRF needs to be equal size of digest");
                throw null;
            }
            this.RatingCompat = bArr2;
        }
        byte[] bArr3 = setholdouts.write;
        if (bArr3 == null) {
            this.write = new byte[i];
        } else {
            if (bArr3.length != i) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("size of publicSeed needs to be equal size of digest");
                throw null;
            }
            this.write = bArr3;
        }
        byte[] bArr4 = setholdouts.RatingCompat;
        if (bArr4 == null) {
            this.MediaSessionCompatQueueItem = new byte[i];
        } else {
            if (bArr4.length != i) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("size of root needs to be equal size of digest");
                throw null;
            }
            this.MediaSessionCompatQueueItem = bArr4;
        }
        getCustomerProfilefwf_client_release getcustomerprofilefwf_client_release = setholdouts.read;
        if (getcustomerprofilefwf_client_release == null) {
            getcustomerprofilefwf_client_release = (!hsvJlNiLsgdefault.RemoteActionCompatParcelizer(setholdoutkeysfwf_client_release.read, setholdouts.IconCompatParcelizer) || bArr3 == null || bArr == null) ? new getCustomerProfilefwf_client_release(setholdouts.serializer + 1) : new getCustomerProfilefwf_client_release(setholdoutkeysfwf_client_release, setholdouts.IconCompatParcelizer, bArr3, bArr);
        }
        this.RemoteActionCompatParcelizer = getcustomerprofilefwf_client_release;
        long j = setholdouts.serializer;
        if (j < 0 || j == this.RemoteActionCompatParcelizer.read) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("maxIndex set but not reflected in state");
        throw null;
    }

    public final byte[] serializer() {
        byte[] bArr;
        synchronized (this) {
            setHoldoutKeysfwf_client_release setholdoutkeysfwf_client_release = this.serializer;
            int i = setholdoutkeysfwf_client_release.IconCompatParcelizer.MediaDescriptionCompat;
            int i2 = (setholdoutkeysfwf_client_release.read + 7) / 8;
            int i3 = i2 + i;
            int i4 = i3 + i;
            int i5 = i4 + i;
            byte[] bArr2 = new byte[i + i5];
            hsvJlNiLsgdefault.serializer(0, bArr2, hsvJlNiLsgdefault.write(i2, this.IconCompatParcelizer));
            hsvJlNiLsgdefault.serializer(i2, bArr2, this.MediaMetadataCompat);
            hsvJlNiLsgdefault.serializer(i3, bArr2, this.RatingCompat);
            hsvJlNiLsgdefault.serializer(i4, bArr2, this.write);
            hsvJlNiLsgdefault.serializer(i5, bArr2, this.MediaSessionCompatQueueItem);
            try {
                getCustomerProfilefwf_client_release getcustomerprofilefwf_client_release = this.RemoteActionCompatParcelizer;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(getcustomerprofilefwf_client_release);
                objectOutputStream.flush();
                bArr = accessbootstrapIfNeeded.read(bArr2, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
            }
        }
        return bArr;
    }
}
