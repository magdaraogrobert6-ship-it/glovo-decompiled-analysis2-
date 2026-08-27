package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class absResponse {
    public final float[] RemoteActionCompatParcelizer;
    public final int[] write;

    public final absResponse RemoteActionCompatParcelizer(float[] fArr) {
        int iSerializer;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.RemoteActionCompatParcelizer;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.write;
            if (iBinarySearch >= 0) {
                iSerializer = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iSerializer = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iSerializer = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iSerializer = Illuminant.serializer((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = iSerializer;
        }
        return new absResponse(fArr, iArr);
    }

    public final void RemoteActionCompatParcelizer(absResponse absresponse) {
        int i = 0;
        while (true) {
            int[] iArr = absresponse.write;
            if (i >= iArr.length) {
                return;
            }
            this.RemoteActionCompatParcelizer[i] = absresponse.RemoteActionCompatParcelizer[i];
            this.write[i] = iArr[i];
            i++;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.write) + (Arrays.hashCode(this.RemoteActionCompatParcelizer) * 31);
    }

    public absResponse(float[] fArr, int[] iArr) {
        this.RemoteActionCompatParcelizer = fArr;
        this.write = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || absResponse.class != obj.getClass()) {
            return false;
        }
        absResponse absresponse = (absResponse) obj;
        return Arrays.equals(this.RemoteActionCompatParcelizer, absresponse.RemoteActionCompatParcelizer) && Arrays.equals(this.write, absresponse.write);
    }
}
