package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachebootstrapInitialData1 extends setEvaluationsfwf_client_release implements metricProvider {
    public final byte[] IconCompatParcelizer;
    public final byte[] MediaMetadataCompat;
    public final byte[] RatingCompat;
    public final byte[] RemoteActionCompatParcelizer;
    public final MemoryCacheclearEvaluations1 serializer;
    public volatile getAccountConfigfwf_client_release write;

    @Override // o.metricProvider
    public final byte[] MediaMetadataCompat() {
        byte[] bArr;
        synchronized (this) {
            bArr = read();
        }
        return bArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MemoryCachebootstrapInitialData1(MemoryCachedecodeHoldouts1 memoryCachedecodeHoldouts1) {
        MemoryCacheclearEvaluations1 memoryCacheclearEvaluations1 = memoryCachedecodeHoldouts1.serializer;
        super((Object) memoryCacheclearEvaluations1.write, true);
        this.serializer = memoryCacheclearEvaluations1;
        int i = memoryCacheclearEvaluations1.MediaDescriptionCompat;
        byte[] bArr = memoryCachedecodeHoldouts1.MediaBrowserCompatMediaItem;
        if (bArr == null) {
            this.MediaMetadataCompat = new byte[i];
        } else {
            if (bArr.length != i) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("size of secretKeySeed needs to be equal size of digest");
                throw null;
            }
            this.MediaMetadataCompat = bArr;
        }
        byte[] bArr2 = memoryCachedecodeHoldouts1.RatingCompat;
        if (bArr2 == null) {
            this.RatingCompat = new byte[i];
        } else {
            if (bArr2.length != i) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("size of secretKeyPRF needs to be equal size of digest");
                throw null;
            }
            this.RatingCompat = bArr2;
        }
        byte[] bArr3 = memoryCachedecodeHoldouts1.read;
        if (bArr3 == null) {
            this.RemoteActionCompatParcelizer = new byte[i];
        } else {
            if (bArr3.length != i) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("size of publicSeed needs to be equal size of digest");
                throw null;
            }
            this.RemoteActionCompatParcelizer = bArr3;
        }
        byte[] bArr4 = memoryCachedecodeHoldouts1.MediaMetadataCompat;
        if (bArr4 == null) {
            this.IconCompatParcelizer = new byte[i];
        } else {
            if (bArr4.length != i) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("size of root needs to be equal size of digest");
                throw null;
            }
            this.IconCompatParcelizer = bArr4;
        }
        getAccountConfigfwf_client_release getaccountconfigfwf_client_release = memoryCachedecodeHoldouts1.IconCompatParcelizer;
        if (getaccountconfigfwf_client_release != null) {
            this.write = getaccountconfigfwf_client_release;
        } else {
            int i2 = memoryCachedecodeHoldouts1.RemoteActionCompatParcelizer;
            int i3 = 1 << memoryCacheclearEvaluations1.RemoteActionCompatParcelizer;
            if (i2 >= i3 - 2 || bArr3 == null || bArr == null) {
                getAccountConfigfwf_client_release getaccountconfigfwf_client_release2 = new getAccountConfigfwf_client_release(new isContentCardsUnreadVisualIndicatorEnabled(memoryCacheclearEvaluations1.RatingCompat), memoryCacheclearEvaluations1.RemoteActionCompatParcelizer, memoryCacheclearEvaluations1.serializer, i2);
                getaccountconfigfwf_client_release2.write = i3 - 1;
                getaccountconfigfwf_client_release2.serializer = i2;
                getaccountconfigfwf_client_release2.RatingCompat = true;
                this.write = getaccountconfigfwf_client_release2;
            } else {
                setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release = new setCustomerProfileUpdateTimefwf_client_release(new setCustomerProfilefwf_client_release(1));
                isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(memoryCacheclearEvaluations1.RatingCompat);
                int i4 = memoryCacheclearEvaluations1.RemoteActionCompatParcelizer;
                getAccountConfigfwf_client_release getaccountconfigfwf_client_release3 = new getAccountConfigfwf_client_release(iscontentcardsunreadvisualindicatorenabled, i4, memoryCacheclearEvaluations1.serializer, (1 << i4) - 1);
                getaccountconfigfwf_client_release3.IconCompatParcelizer(bArr3, bArr, setcustomerprofileupdatetimefwf_client_release);
                while (getaccountconfigfwf_client_release3.serializer < i2) {
                    getaccountconfigfwf_client_release3.read(bArr3, bArr, setcustomerprofileupdatetimefwf_client_release);
                    getaccountconfigfwf_client_release3.RatingCompat = false;
                }
                this.write = getaccountconfigfwf_client_release3;
            }
        }
        int i5 = memoryCachedecodeHoldouts1.write;
        if (i5 < 0 || i5 == this.write.write) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("maxIndex set but not reflected in state");
        throw null;
    }

    public final byte[] read() {
        byte[] bArr;
        synchronized (this) {
            int i = this.serializer.MediaDescriptionCompat;
            int i2 = i + 4;
            int i3 = i2 + i;
            int i4 = i3 + i;
            byte[] bArr2 = new byte[i + i4];
            createCache.read(bArr2, this.write.serializer, 0);
            hsvJlNiLsgdefault.serializer(4, bArr2, this.MediaMetadataCompat);
            hsvJlNiLsgdefault.serializer(i2, bArr2, this.RatingCompat);
            hsvJlNiLsgdefault.serializer(i3, bArr2, this.RemoteActionCompatParcelizer);
            hsvJlNiLsgdefault.serializer(i4, bArr2, this.IconCompatParcelizer);
            try {
                getAccountConfigfwf_client_release getaccountconfigfwf_client_release = this.write;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(getaccountconfigfwf_client_release);
                objectOutputStream.flush();
                bArr = accessbootstrapIfNeeded.read(bArr2, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                throw new RuntimeException("error serializing bds state: " + e.getMessage());
            }
        }
        return bArr;
    }
}
