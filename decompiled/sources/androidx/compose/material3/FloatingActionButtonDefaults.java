package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import o.AutofillType;
import o.getBluntfpxItnM;

/* JADX INFO: loaded from: classes.dex */
public abstract class FloatingActionButtonDefaults {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;

    static {
        Dp.m3673constructorimpl(36.0f);
    }

    public static getBluntfpxItnM read(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = AutofillType.write;
        }
        if ((i & 2) != 0) {
            f2 = AutofillType.RemoteActionCompatParcelizer;
        }
        if ((i & 4) != 0) {
            f3 = AutofillType.serializer;
        }
        if ((i & 8) != 0) {
            f4 = AutofillType.read;
        }
        return new getBluntfpxItnM(f, f2, f3, f4);
    }
}
