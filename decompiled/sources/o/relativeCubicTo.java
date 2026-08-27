package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class relativeCubicTo implements Comparable {
    public final boolean IconCompatParcelizer;
    public final int RatingCompat;
    public final opN5in7k0 RemoteActionCompatParcelizer;
    public final boolean read;
    public final int serializer;
    public final Bundle write;

    public relativeCubicTo(opN5in7k0 opn5in7k0, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.RemoteActionCompatParcelizer = opn5in7k0;
        this.write = bundle;
        this.IconCompatParcelizer = z;
        this.serializer = i;
        this.read = z2;
        this.RatingCompat = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final int compareTo(relativeCubicTo relativecubicto) {
        relativecubicto.getClass();
        boolean z = relativecubicto.read;
        boolean z2 = relativecubicto.IconCompatParcelizer;
        Bundle bundle = relativecubicto.write;
        boolean z3 = this.IconCompatParcelizer;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.serializer - relativecubicto.serializer;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.write;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            bundle2.getClass();
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.read;
        if (z4 && !z) {
            return 1;
        }
        if (z4 || !z) {
            return this.RatingCompat - relativecubicto.RatingCompat;
        }
        return -1;
    }
}
