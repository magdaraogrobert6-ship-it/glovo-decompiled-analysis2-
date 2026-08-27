package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PointerInteropFilterpointerInputFilter1stopDispatching1 {
    private static int IconCompatParcelizer = 1;
    private static int write;

    public abstract String write();

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r1
  0x002b: PHI (r1v5 float) = (r1v4 float), (r1v6 float) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public static final boolean IconCompatParcelizer(androidx.compose.ui.geometry.Rect rect, float f, float f2) {
        float left;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 123;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            left = rect.getLeft();
            int i4 = 86 / 0;
            if (f <= rect.getRight()) {
                i = write + 81;
                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    throw null;
                }
                if (left <= f) {
                    float top = rect.getTop();
                    if (f2 <= rect.getBottom() && top <= f2) {
                        int i5 = IconCompatParcelizer;
                        int i6 = i5 + 73;
                        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        int i8 = i5 + 73;
                        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        return true;
                    }
                }
            }
        } else {
            left = rect.getLeft();
            if (f <= rect.getRight()) {
                i = write + 81;
                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    throw null;
                }
                if (left <= f) {
                    float top2 = rect.getTop();
                    if (f2 <= rect.getBottom()) {
                        int i10 = IconCompatParcelizer;
                        int i11 = i10 + 73;
                        write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        int i13 = i10 + 73;
                        write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
