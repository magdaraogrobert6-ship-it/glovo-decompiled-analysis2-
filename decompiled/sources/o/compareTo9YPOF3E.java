package o;

import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class compareTo9YPOF3E {
    public static long IconCompatParcelizer(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j);
        int iNumberOfLeadingZeros2 = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + iNumberOfLeadingZeros;
        if (iNumberOfLeadingZeros2 > 65) {
            return j * j2;
        }
        LazyKt__LazyJVMKt.write(j, j2, "checkedMultiply", iNumberOfLeadingZeros2 >= 64);
        LazyKt__LazyJVMKt.write(j, j2, "checkedMultiply", (j >= 0) | (j2 != Long.MIN_VALUE));
        long j3 = j * j2;
        LazyKt__LazyJVMKt.write(j, j2, "checkedMultiply", j == 0 || j3 / j == j2);
        return j3;
    }

    public static long read(long j, long j2) {
        long j3 = j + j2;
        LazyKt__LazyJVMKt.write(j, j2, "checkedAdd", ((j ^ j2) < 0) | ((j ^ j3) >= 0));
        return j3;
    }
}
