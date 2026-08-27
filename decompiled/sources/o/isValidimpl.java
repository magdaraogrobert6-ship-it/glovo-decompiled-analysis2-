package o;

import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class isValidimpl extends ReplacementSpan {
    public final unaryMinusF1C5BW0 read;
    public final android.graphics.Paint.FontMetricsInt IconCompatParcelizer = new android.graphics.Paint.FontMetricsInt();
    public short serializer = -1;
    public float RemoteActionCompatParcelizer = 1.0f;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint paint, CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        android.graphics.Paint.FontMetricsInt fontMetricsInt2 = this.IconCompatParcelizer;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent);
        unaryMinusF1C5BW0 unaryminusf1c5bw0 = this.read;
        OffsetCompanion offsetCompanion = unaryminusf1c5bw0.read();
        int iRemoteActionCompatParcelizer = offsetCompanion.RemoteActionCompatParcelizer(14);
        this.RemoteActionCompatParcelizer = (fAbs * 1.0f) / (iRemoteActionCompatParcelizer != 0 ? offsetCompanion.write.getShort(iRemoteActionCompatParcelizer + offsetCompanion.read) : (short) 0);
        OffsetCompanion offsetCompanion2 = unaryminusf1c5bw0.read();
        int iRemoteActionCompatParcelizer2 = offsetCompanion2.RemoteActionCompatParcelizer(14);
        if (iRemoteActionCompatParcelizer2 != 0) {
            offsetCompanion2.write.getShort(iRemoteActionCompatParcelizer2 + offsetCompanion2.read);
        }
        OffsetCompanion offsetCompanion3 = unaryminusf1c5bw0.read();
        int iRemoteActionCompatParcelizer3 = offsetCompanion3.RemoteActionCompatParcelizer(12);
        short s = (short) ((iRemoteActionCompatParcelizer3 != 0 ? offsetCompanion3.write.getShort(iRemoteActionCompatParcelizer3 + offsetCompanion3.read) : (short) 0) * this.RemoteActionCompatParcelizer);
        this.serializer = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }

    public isValidimpl(unaryMinusF1C5BW0 unaryminusf1c5bw0) {
        coil3.util.UtilsKt.IconCompatParcelizer(unaryminusf1c5bw0, "rasterizer cannot be null");
        this.read = unaryminusf1c5bw0;
    }
}
