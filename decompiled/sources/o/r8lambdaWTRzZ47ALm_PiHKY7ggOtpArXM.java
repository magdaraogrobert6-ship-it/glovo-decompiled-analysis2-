package o;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM {
    private final ArrayList IconCompatParcelizer = new ArrayList();
    final FwFClientcache2 RemoteActionCompatParcelizer;
    public final int[] serializer;

    public final int hashCode() {
        return Arrays.hashCode(this.serializer) + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    public final void write(int i) {
        int[] iArr = this.serializer;
        if (iArr.length > 0) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (this.IconCompatParcelizer.contains(Integer.valueOf(i2))) {
                    iArr[i2] = i;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM) {
            r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM r8lambdawtrzz47alm_pihky7ggotparxm = (r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM) obj;
            int[] iArr = r8lambdawtrzz47alm_pihky7ggotparxm.serializer;
            if (this.RemoteActionCompatParcelizer == r8lambdawtrzz47alm_pihky7ggotparxm.RemoteActionCompatParcelizer) {
                int[] iArr2 = this.serializer;
                if (iArr2.length == iArr.length) {
                    for (int i = 0; i < iArr2.length; i++) {
                        if (this.IconCompatParcelizer.contains(Integer.valueOf(i)) || r8lambdawtrzz47alm_pihky7ggotparxm.IconCompatParcelizer.contains(Integer.valueOf(i)) || iArr2[i] == iArr[i]) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        return "Tensor{type=" + this.RemoteActionCompatParcelizer + ", shape=" + Arrays.toString(this.serializer) + '}';
    }

    public r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(FwFClientcache2 fwFClientcache2, Integer... numArr) {
        this.RemoteActionCompatParcelizer = fwFClientcache2;
        this.serializer = new int[numArr.length];
        int i = 0;
        for (int i2 = 0; i2 < numArr.length; i2++) {
            this.serializer[i2] = numArr[i2].intValue();
        }
        while (true) {
            int[] iArr = this.serializer;
            if (i >= iArr.length) {
                return;
            }
            if (iArr[i] == -1) {
                this.IconCompatParcelizer.add(Integer.valueOf(i));
            }
            i++;
        }
    }

    public r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(FwFClientcache2 fwFClientcache2, int[] iArr) {
        this.RemoteActionCompatParcelizer = fwFClientcache2;
        this.serializer = iArr;
        int i = 0;
        while (true) {
            int[] iArr2 = this.serializer;
            if (i >= iArr2.length) {
                return;
            }
            if (iArr2[i] == -1) {
                this.IconCompatParcelizer.add(Integer.valueOf(i));
            }
            i++;
        }
    }
}
