package androidx.compose.ui.node;

import java.util.Arrays;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
final class Snake {
    private final int[] data;

    /* JADX INFO: renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m2620addDiagonalToStackimpl(int[] iArr, IntStack intStack) {
        int iMin;
        int i = iArr[0];
        int i2 = iArr[1];
        if (m2628getHasAdditionOrRemovalimpl(iArr)) {
            iMin = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i += ((iArr[4] != 0 ? 1 : 0) | (m2633isAdditionimpl(iArr) ? 1 : 0)) ^ 1;
            i2 += ((!m2633isAdditionimpl(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        } else {
            iMin = iArr[2] - iArr[0];
        }
        intStack.pushDiagonal(i, i2, iMin);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m2622constructorimpl(int[] iArr) {
        return iArr;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2624equalsimpl0(int[] iArr, int[] iArr2) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{iArr, iArr2}, iWrite3)).booleanValue();
    }

    /* JADX INFO: renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m2625getDiagonalSizeimpl(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* JADX INFO: renamed from: getEndX-impl, reason: not valid java name */
    public static final int m2626getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* JADX INFO: renamed from: getEndY-impl, reason: not valid java name */
    public static final int m2627getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* JADX INFO: renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m2628getHasAdditionOrRemovalimpl(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    /* JADX INFO: renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m2629getReverseimpl(int[] iArr) {
        return iArr[4] != 0;
    }

    /* JADX INFO: renamed from: getStartX-impl, reason: not valid java name */
    public static final int m2630getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* JADX INFO: renamed from: getStartY-impl, reason: not valid java name */
    public static final int m2631getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2632hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m2633isAdditionimpl(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    public final int[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m2635unboximpl() {
        return this.data;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Snake m2621boximpl(int[] iArr) {
        return new Snake(iArr);
    }

    public boolean equals(Object obj) {
        return m2623equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m2632hashCodeimpl(this.data);
    }

    public String toString() {
        return m2634toStringimpl(this.data);
    }

    private /* synthetic */ Snake(int[] iArr) {
        this.data = iArr;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2634toStringimpl(int[] iArr) {
        StringBuilder sb = new StringBuilder("Snake(");
        sb.append(iArr[0]);
        sb.append(',');
        sb.append(iArr[1]);
        sb.append(',');
        sb.append(iArr[2]);
        sb.append(',');
        sb.append(iArr[3]);
        sb.append(',');
        return IconCompatParcelizer.IconCompatParcelizer(sb, iArr[4] != 0, ')');
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2623equalsimpl(int[] iArr, Object obj) {
        if (!(obj instanceof Snake)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{iArr, ((Snake) obj).m2635unboximpl()}, getCieXyz.write())).booleanValue();
    }
}
