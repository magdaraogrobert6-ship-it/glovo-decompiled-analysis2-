package o;

import android.text.Editable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class VerticalAlignmentLine extends accessgetTookFromPrecomposeMapcp {
    public final /* synthetic */ VerticalRuler IconCompatParcelizer;

    public VerticalAlignmentLine(VerticalRuler verticalRuler) {
        this.IconCompatParcelizer = verticalRuler;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        VerticalRuler verticalRuler = this.IconCompatParcelizer;
        RootMeasurePolicy rootMeasurePolicy = verticalRuler.read;
        if (zIsEmpty) {
            rootMeasurePolicy.setText(VerticalRuler.write(verticalRuler, "00"));
            return;
        }
        String strWrite = VerticalRuler.write(verticalRuler, editable);
        if (TextUtils.isEmpty(strWrite)) {
            strWrite = VerticalRuler.write(verticalRuler, "00");
        }
        rootMeasurePolicy.setText(strWrite);
    }
}
