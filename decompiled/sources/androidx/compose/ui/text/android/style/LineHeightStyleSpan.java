package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 8;
    private int ascent;
    private int descent;
    private final int endIndex;
    private int firstAscent;
    private int firstAscentDiff;
    private int lastDescent;
    private int lastDescentDiff;
    private final float lineHeight;
    private final int mode;
    private final int startIndex;
    private final float topRatio;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    /* JADX INFO: renamed from: getMode-lzQqcRY, reason: not valid java name */
    public final int m3133getModelzQqcRY() {
        return this.mode;
    }

    public final boolean getTrimFirstLineTop() {
        return this.trimFirstLineTop;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }

    public final LineHeightStyleSpan copy$ui_text(int i, int i2, boolean z) {
        return new LineHeightStyleSpan(this.lineHeight, i, i2, z, this.trimLastLineBottom, this.topRatio, this.mode, null);
    }

    private LineHeightStyleSpan(float f, int i, int i2, boolean z, boolean z2, float f2, int i3) {
        this.lineHeight = f;
        this.startIndex = i;
        this.endIndex = i2;
        this.trimFirstLineTop = z;
        this.trimLastLineBottom = z2;
        this.topRatio = f2;
        this.mode = i3;
        this.firstAscent = Integer.MIN_VALUE;
        this.ascent = Integer.MIN_VALUE;
        this.descent = Integer.MIN_VALUE;
        this.lastDescent = Integer.MIN_VALUE;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int iLineHeight = LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        int iCeil = (int) Math.ceil(this.lineHeight);
        int i = iCeil - iLineHeight;
        int i2 = this.mode;
        LineHeightStyle.Mode.Companion companion = LineHeightStyle.Mode.Companion;
        if (LineHeightStyle.Mode.m3484equalsimpl0(i2, companion.m3489getMinimumlzQqcRY()) && i <= 0) {
            int i3 = fontMetricsInt.ascent;
            this.ascent = i3;
            int i4 = fontMetricsInt.descent;
            this.descent = i4;
            this.firstAscent = i3;
            this.lastDescent = i4;
            this.firstAscentDiff = 0;
            this.lastDescentDiff = 0;
            return;
        }
        float fAbs = this.topRatio;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        }
        if (i <= 0) {
            dCeil = Math.ceil(i * fAbs);
        } else {
            dCeil = Math.ceil((1.0f - fAbs) * i);
        }
        int i5 = fontMetricsInt.descent + ((int) dCeil);
        this.descent = i5;
        this.ascent = i5 - iCeil;
        if (LineHeightStyle.Mode.m3484equalsimpl0(this.mode, companion.m3488getFixedlzQqcRY()) || i >= 0) {
            int i6 = this.trimFirstLineTop ? fontMetricsInt.ascent : this.ascent;
            this.firstAscent = i6;
            int i7 = this.trimLastLineBottom ? fontMetricsInt.descent : this.descent;
            this.lastDescent = i7;
            this.firstAscentDiff = fontMetricsInt.ascent - i6;
            this.lastDescentDiff = i7 - fontMetricsInt.descent;
            return;
        }
        if (LineHeightStyle.Mode.m3484equalsimpl0(this.mode, companion.m3490getTightlzQqcRY())) {
            boolean z = this.trimFirstLineTop;
            int i8 = fontMetricsInt.ascent;
            this.firstAscent = z ? Math.max(i8, this.ascent) : Math.min(i8, this.ascent);
            boolean z2 = this.trimLastLineBottom;
            int i9 = fontMetricsInt.descent;
            this.lastDescent = z2 ? Math.min(i9, this.descent) : Math.max(i9, this.descent);
            this.firstAscentDiff = 0;
            this.lastDescentDiff = 0;
        }
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text$default(LineHeightStyleSpan lineHeightStyleSpan, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = lineHeightStyleSpan.trimFirstLineTop;
        }
        return lineHeightStyleSpan.copy$ui_text(i, i2, z);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z = i == this.startIndex;
        boolean z2 = i2 == this.endIndex;
        if (z && z2 && this.trimFirstLineTop && this.trimLastLineBottom && !LineHeightStyle.Mode.m3484equalsimpl0(this.mode, LineHeightStyle.Mode.Companion.m3490getTightlzQqcRY())) {
            return;
        }
        if (this.firstAscent == Integer.MIN_VALUE) {
            calculateTargetMetrics(fontMetricsInt);
        }
        fontMetricsInt.ascent = z ? this.firstAscent : this.ascent;
        fontMetricsInt.descent = z2 ? this.lastDescent : this.descent;
    }

    public /* synthetic */ LineHeightStyleSpan(float f, int i, int i2, boolean z, boolean z2, float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i, i2, z, z2, f2, i3);
    }
}
