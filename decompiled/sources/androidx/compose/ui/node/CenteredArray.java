package androidx.compose.ui.node;

import java.util.Arrays;
import o.getCieXyz;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
final class CenteredArray {
    private final int[] data;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m2375constructorimpl(int[] iArr) {
        return iArr;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2377equalsimpl0(int[] iArr, int[] iArr2) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{iArr, iArr2}, iWrite3)).booleanValue();
    }

    /* JADX INFO: renamed from: getMid-impl, reason: not valid java name */
    private static final int m2379getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2380hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m2383unboximpl() {
        return this.data;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CenteredArray m2374boximpl(int[] iArr) {
        return new CenteredArray(iArr);
    }

    public boolean equals(Object obj) {
        return m2376equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m2380hashCodeimpl(this.data);
    }

    public String toString() {
        return m2382toStringimpl(this.data);
    }

    private /* synthetic */ CenteredArray(int[] iArr) {
        this.data = iArr;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2382toStringimpl(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final int m2378getimpl(int[] iArr, int i) {
        return iArr[i + m2379getMidimpl(iArr)];
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m2381setimpl(int[] iArr, int i, int i2) {
        iArr[i + m2379getMidimpl(iArr)] = i2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2376equalsimpl(int[] iArr, Object obj) {
        if (!(obj instanceof CenteredArray)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{iArr, ((CenteredArray) obj).m2383unboximpl()}, getCieXyz.write())).booleanValue();
    }
}
