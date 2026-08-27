package androidx.compose.ui.text.android;

import android.text.Layout;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class TextAlignmentAdapter {
    public static final int $stable = 0;
    private static final Layout.Alignment ALIGN_LEFT_FRAMEWORK;
    private static final Layout.Alignment ALIGN_RIGHT_FRAMEWORK;
    public static final TextAlignmentAdapter INSTANCE = new TextAlignmentAdapter();

    private TextAlignmentAdapter() {
    }

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{alignment3.name(), "ALIGN_LEFT"}, getCieXyz.write())).booleanValue()) {
                alignment = alignment3;
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{alignment3.name(), "ALIGN_RIGHT"}, getCieXyz.write())).booleanValue()) {
                    alignment2 = alignment3;
                }
            }
        }
        ALIGN_LEFT_FRAMEWORK = alignment;
        ALIGN_RIGHT_FRAMEWORK = alignment2;
    }

    public final Layout.Alignment get(int i) {
        if (i == 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (i == 1) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (i == 2) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (i == 3) {
            return ALIGN_LEFT_FRAMEWORK;
        }
        if (i != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return ALIGN_RIGHT_FRAMEWORK;
    }
}
