package io.sentry.android.replay.util;

import androidx.compose.ui.text.TextLayoutResult;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer implements RatingCompat {
    public final TextLayoutResult IconCompatParcelizer;
    public final boolean write;

    @Override // io.sentry.android.replay.util.RatingCompat
    public final Integer write() {
        return null;
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public final int RatingCompat() {
        return this.IconCompatParcelizer.getLineCount();
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public final int RemoteActionCompatParcelizer(int i) {
        return this.IconCompatParcelizer.isLineEllipsized(i) ? 1 : 0;
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public final int read(int i) {
        return MathKt.write(this.IconCompatParcelizer.getLineBottom(i));
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public final int serializer(int i) {
        return this.IconCompatParcelizer.getLineStart(i);
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public final int write(int i) {
        return MathKt.write(this.IconCompatParcelizer.getLineTop(i));
    }

    public RemoteActionCompatParcelizer(TextLayoutResult textLayoutResult, boolean z) {
        this.IconCompatParcelizer = textLayoutResult;
        this.write = z;
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public final int IconCompatParcelizer(int i) {
        return this.IconCompatParcelizer.getLineEnd(i, true);
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public final float write(int i, int i2) {
        TextLayoutResult textLayoutResult = this.IconCompatParcelizer;
        float horizontalPosition = textLayoutResult.getHorizontalPosition(i2, true);
        return (this.write || textLayoutResult.getLineCount() != 1) ? horizontalPosition : horizontalPosition - textLayoutResult.getLineLeft(i);
    }
}
