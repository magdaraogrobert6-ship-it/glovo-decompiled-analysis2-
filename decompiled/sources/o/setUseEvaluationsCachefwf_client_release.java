package o;

import org.tukaani.xz.CorruptedInputException;

/* JADX INFO: loaded from: classes4.dex */
public final class setUseEvaluationsCachefwf_client_release {
    public final byte[] RemoteActionCompatParcelizer;
    public final int read;
    public int RatingCompat = 0;
    public int MediaDescriptionCompat = 0;
    public int write = 0;
    public int IconCompatParcelizer = 0;
    public int MediaMetadataCompat = 0;
    public int serializer = 0;

    public final void IconCompatParcelizer(int i, int i2) throws CorruptedInputException {
        int i3;
        if (i < 0 || i >= this.write) {
            throw new CorruptedInputException();
        }
        int iMin = Math.min(this.IconCompatParcelizer - this.MediaDescriptionCompat, i2);
        this.MediaMetadataCompat = i2 - iMin;
        this.serializer = i;
        int i4 = (this.MediaDescriptionCompat - i) - 1;
        byte[] bArr = this.RemoteActionCompatParcelizer;
        if (i4 < 0) {
            int i5 = this.read;
            int i6 = i4 + i5;
            int iMin2 = Math.min(i5 - i6, iMin);
            System.arraycopy(bArr, i6, bArr, this.MediaDescriptionCompat, iMin2);
            this.MediaDescriptionCompat += iMin2;
            iMin -= iMin2;
            if (iMin == 0) {
                return;
            } else {
                i4 = 0;
            }
        }
        do {
            int iMin3 = Math.min(iMin, this.MediaDescriptionCompat - i4);
            System.arraycopy(bArr, i4, bArr, this.MediaDescriptionCompat, iMin3);
            i3 = this.MediaDescriptionCompat + iMin3;
            this.MediaDescriptionCompat = i3;
            iMin -= iMin3;
        } while (iMin > 0);
        if (this.write < i3) {
            this.write = i3;
        }
    }

    public setUseEvaluationsCachefwf_client_release(int i, getFeaturesExpirationTimefwf_client_release getfeaturesexpirationtimefwf_client_release) {
        this.read = i;
        this.RemoteActionCompatParcelizer = getfeaturesexpirationtimefwf_client_release.IconCompatParcelizer(i);
    }
}
