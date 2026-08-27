package o;

import io.sentry.util.network.NetworkBody;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes4.dex */
public final class getGlobalEntityId extends SecureRandom {
    public final SecureRandom IconCompatParcelizer;
    public final NetworkBody read;
    public EventJsonAdapter serializer;
    public final setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release write;

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.serializer == null) {
                this.serializer = this.read.read(this.write);
            }
            if (this.serializer.IconCompatParcelizer(bArr) < 0) {
                EventJsonAdapter eventJsonAdapter = this.serializer;
                byte[] bArrSerializer = eventJsonAdapter.serializer.serializer();
                if (bArrSerializer.length < 32) {
                    throw new IllegalStateException("Insufficient entropy provided by entropy source");
                }
                eventJsonAdapter.serializer(eventJsonAdapter.write(eventJsonAdapter.MediaSessionCompatQueueItem, accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArrSerializer)), eventJsonAdapter.RemoteActionCompatParcelizer, eventJsonAdapter.write);
                eventJsonAdapter.RatingCompat = 1L;
                this.serializer.IconCompatParcelizer(bArr);
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void setSeed(long j) {
        synchronized (this) {
            SecureRandom secureRandom = this.IconCompatParcelizer;
            if (secureRandom != null) {
                secureRandom.setSeed(j);
            }
        }
    }

    @Override // java.security.SecureRandom
    public final String getAlgorithm() {
        Object obj = this.read.IconCompatParcelizer;
        return "CTR-DRBG-AES256";
    }

    public getGlobalEntityId(SecureRandom secureRandom, setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, NetworkBody networkBody) {
        this.IconCompatParcelizer = secureRandom;
        this.write = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
        this.read = networkBody;
    }

    @Override // java.security.SecureRandom
    public final byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = this.write;
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
        if (i * 8 <= 384) {
            System.arraycopy(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.serializer(), 0, bArr, 0, i);
            return bArr;
        }
        for (int i2 = 0; i2 < i; i2 += 48) {
            byte[] bArrSerializer = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.serializer();
            int i3 = i - i2;
            if (bArrSerializer.length <= i3) {
                System.arraycopy(bArrSerializer, 0, bArr, i2, bArrSerializer.length);
            } else {
                System.arraycopy(bArrSerializer, 0, bArr, i2, i3);
            }
        }
        return bArr;
    }

    @Override // java.security.SecureRandom
    public final void setSeed(byte[] bArr) {
        synchronized (this) {
            SecureRandom secureRandom = this.IconCompatParcelizer;
            if (secureRandom != null) {
                secureRandom.setSeed(bArr);
            }
        }
    }
}
