package o;

import com.roadrunner.order.history.presentation.HistoryDialogFragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class getBottom {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    public static HistoryDialogFragment read() {
        int i = 2 % 2;
        HistoryDialogFragment historyDialogFragment = new HistoryDialogFragment();
        int i2 = RemoteActionCompatParcelizer + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return historyDialogFragment;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036 A[PHI: r1 r4 r5
  0x0036: PHI (r1v7 boolean) = (r1v9 boolean), (r1v10 boolean) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0036: PHI (r4v6 boolean) = (r4v0 boolean), (r4v7 boolean) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0036: PHI (r5v10 boolean) = (r5v1 boolean), (r5v11 boolean) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r1 r4 r5
  0x0034: PHI (r1v5 boolean) = (r1v13 boolean), (r1v14 boolean) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r4v1 boolean) = (r4v0 boolean), (r4v7 boolean) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r5v2 boolean) = (r5v1 boolean), (r5v11 boolean) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final int RemoteActionCompatParcelizer(android.view.KeyEvent keyEvent) {
        boolean zM1904isAltPressedZmokQxo;
        boolean zM1906isMetaPressedZmokQxo;
        boolean zM1907isShiftPressedZmokQxo;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean zM1904isAltPressedZmokQxo2;
        int i2 = 2 % 2;
        int i3 = serializer + 125;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = 0;
        if (i3 % 2 == 0) {
            zM1904isAltPressedZmokQxo2 = androidx.compose.ui.input.key.KeyEvent_androidKt.m1904isAltPressedZmokQxo(keyEvent);
            boolean zM1905isCtrlPressedZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m1905isCtrlPressedZmokQxo(keyEvent);
            zM1906isMetaPressedZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m1906isMetaPressedZmokQxo(keyEvent);
            zM1907isShiftPressedZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m1907isShiftPressedZmokQxo(keyEvent);
            if (zM1905isCtrlPressedZmokQxo) {
                z3 = zM1904isAltPressedZmokQxo;
                z = zM1904isAltPressedZmokQxo;
                z3 = zM1904isAltPressedZmokQxo2;
                z = zM1904isAltPressedZmokQxo2;
                i = 2;
                z2 = z;
            } else {
                z3 = zM1904isAltPressedZmokQxo;
                z = zM1904isAltPressedZmokQxo;
                z3 = zM1904isAltPressedZmokQxo2;
                z = zM1904isAltPressedZmokQxo2;
                i = 0;
                z2 = z3;
            }
        } else {
            zM1904isAltPressedZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m1904isAltPressedZmokQxo(keyEvent);
            boolean zM1905isCtrlPressedZmokQxo2 = androidx.compose.ui.input.key.KeyEvent_androidKt.m1905isCtrlPressedZmokQxo(keyEvent);
            zM1906isMetaPressedZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m1906isMetaPressedZmokQxo(keyEvent);
            zM1907isShiftPressedZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m1907isShiftPressedZmokQxo(keyEvent);
            if (zM1905isCtrlPressedZmokQxo2) {
                z3 = zM1904isAltPressedZmokQxo;
                z = zM1904isAltPressedZmokQxo;
                z3 = zM1904isAltPressedZmokQxo2;
                z = zM1904isAltPressedZmokQxo2;
                i = 2;
                z2 = z;
            } else {
                z3 = zM1904isAltPressedZmokQxo;
                z = zM1904isAltPressedZmokQxo;
                z3 = zM1904isAltPressedZmokQxo2;
                z = zM1904isAltPressedZmokQxo2;
                i = 0;
                z2 = z3;
            }
        }
        int i5 = zM1906isMetaPressedZmokQxo ? 4 : 0;
        if (zM1907isShiftPressedZmokQxo) {
            int i6 = RemoteActionCompatParcelizer + 1;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i4 = 8;
        }
        return z2 | i | i5 | i4;
    }
}
