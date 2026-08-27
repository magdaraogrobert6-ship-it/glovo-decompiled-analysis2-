package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class accessroundToPx0680j_4jd {
    public int[] IconCompatParcelizer;
    public int[] MediaDescriptionCompat;
    public int[] MediaMetadataCompat;
    public float[] MediaSessionCompatQueueItem;
    public String[] RatingCompat;
    public int[] RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    public final void read(int i, String str) {
        int i2 = this.write;
        int[] iArr = this.MediaMetadataCompat;
        if (i2 >= iArr.length) {
            this.MediaMetadataCompat = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.RatingCompat;
            this.RatingCompat = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.MediaMetadataCompat;
        int i3 = this.write;
        iArr2[i3] = i;
        String[] strArr2 = this.RatingCompat;
        this.write = i3 + 1;
        strArr2[i3] = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypedBundle{mCountInt=");
        sb.append(this.read);
        sb.append(", mCountFloat=");
        sb.append(this.serializer);
        sb.append(", mCountString=");
        return af$$ExternalSyntheticOutline0.m(this.write, ", mCountBoolean=0}", sb);
    }

    public final void IconCompatParcelizer(float f, int i) {
        int i2 = this.serializer;
        int[] iArr = this.IconCompatParcelizer;
        if (i2 >= iArr.length) {
            this.IconCompatParcelizer = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.MediaSessionCompatQueueItem;
            this.MediaSessionCompatQueueItem = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.IconCompatParcelizer;
        int i3 = this.serializer;
        iArr2[i3] = i;
        float[] fArr2 = this.MediaSessionCompatQueueItem;
        this.serializer = i3 + 1;
        fArr2[i3] = f;
    }

    public final void IconCompatParcelizer(int i, int i2) {
        int i3 = this.read;
        int[] iArr = this.RemoteActionCompatParcelizer;
        if (i3 >= iArr.length) {
            this.RemoteActionCompatParcelizer = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.MediaDescriptionCompat;
            this.MediaDescriptionCompat = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.RemoteActionCompatParcelizer;
        int i4 = this.read;
        iArr3[i4] = i;
        int[] iArr4 = this.MediaDescriptionCompat;
        this.read = i4 + 1;
        iArr4[i4] = i2;
    }
}
