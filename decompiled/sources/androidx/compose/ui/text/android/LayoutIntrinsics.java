package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.PriorityQueue;
import o.ensureSubscribedToInAppMessageEventslambda7;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutIntrinsics {
    public static final int $stable = 8;
    private BoringLayout.Metrics _boringMetrics;
    private CharSequence _charSequenceForIntrinsicWidth;
    private float _maxIntrinsicWidth = Float.NaN;
    private float _minIntrinsicWidth = Float.NaN;
    private boolean boringMetricsIsInit;
    private final CharSequence charSequence;
    private final int textDirectionHeuristic;
    private final TextPaint textPaint;

    private final float computeMinIntrinsicWidth() {
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.textPaint.getTextLocale());
        CharSequence charSequence = this.charSequence;
        int i = 0;
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence, 0, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, LayoutIntrinsics_androidKt.IntRangeComparator);
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new ensureSubscribedToInAppMessageEventslambda7(i, next, 1));
            } else {
                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) priorityQueue.peek();
                if (ensuresubscribedtoinappmessageeventslambda7 != null && ensuresubscribedtoinappmessageeventslambda7.read - ensuresubscribedtoinappmessageeventslambda7.write < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new ensureSubscribedToInAppMessageEventslambda7(i, next, 1));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return 0.0f;
        }
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8 = (ensureSubscribedToInAppMessageEventslambda7) it.next();
        float desiredWidth = getDesiredWidth(ensuresubscribedtoinappmessageeventslambda8.write, ensuresubscribedtoinappmessageeventslambda8.read);
        while (it.hasNext()) {
            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda9 = (ensureSubscribedToInAppMessageEventslambda7) it.next();
            desiredWidth = Math.max(desiredWidth, getDesiredWidth(ensuresubscribedtoinappmessageeventslambda9.write, ensuresubscribedtoinappmessageeventslambda9.read));
        }
        return desiredWidth;
    }

    public final float getMaxIntrinsicWidth() {
        if (!Float.isNaN(this._maxIntrinsicWidth)) {
            return this._maxIntrinsicWidth;
        }
        float fComputeMaxIntrinsicWidth = computeMaxIntrinsicWidth();
        this._maxIntrinsicWidth = fComputeMaxIntrinsicWidth;
        return fComputeMaxIntrinsicWidth;
    }

    public final float getMinIntrinsicWidth() {
        if (!Float.isNaN(this._minIntrinsicWidth)) {
            return this._minIntrinsicWidth;
        }
        float fComputeMinIntrinsicWidth = computeMinIntrinsicWidth();
        this._minIntrinsicWidth = fComputeMinIntrinsicWidth;
        return fComputeMinIntrinsicWidth;
    }

    public LayoutIntrinsics(CharSequence charSequence, TextPaint textPaint, int i) {
        this.charSequence = charSequence;
        this.textPaint = textPaint;
        this.textDirectionHeuristic = i;
    }

    private final CharSequence getCharSequenceForIntrinsicWidth() {
        CharSequence charSequence = this._charSequenceForIntrinsicWidth;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        boolean z = LayoutIntrinsics_androidKt.stripNonMetricAffectingCharSpans;
        CharSequence charSequence2 = this.charSequence;
        if (!z) {
            return charSequence2;
        }
        CharSequence charSequenceStripNonMetricAffectingCharacterStyleSpans = LayoutIntrinsics_androidKt.stripNonMetricAffectingCharacterStyleSpans(charSequence2);
        this._charSequenceForIntrinsicWidth = charSequenceStripNonMetricAffectingCharacterStyleSpans;
        return charSequenceStripNonMetricAffectingCharacterStyleSpans;
    }

    private final float getDesiredWidth(int i, int i2) {
        return Layout.getDesiredWidth(getCharSequenceForIntrinsicWidth(), i, i2, this.textPaint);
    }

    public final BoringLayout.Metrics getBoringMetrics() {
        if (!this.boringMetricsIsInit) {
            this._boringMetrics = BoringLayoutFactory.INSTANCE.measure(this.charSequence, this.textPaint, TextLayout_androidKt.getTextDirectionHeuristic(this.textDirectionHeuristic));
            this.boringMetricsIsInit = true;
        }
        return this._boringMetrics;
    }

    private final float computeMaxIntrinsicWidth() {
        BoringLayout.Metrics boringMetrics = getBoringMetrics();
        float fCeil = boringMetrics != null ? boringMetrics.width : -1;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(getDesiredWidth$default(this, 0, 0, 3, null));
        }
        return LayoutIntrinsics_androidKt.shouldIncreaseMaxIntrinsic(fCeil, this.charSequence, this.textPaint) ? fCeil + 0.5f : fCeil;
    }

    public static /* synthetic */ float getDesiredWidth$default(LayoutIntrinsics layoutIntrinsics, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = layoutIntrinsics.getCharSequenceForIntrinsicWidth().length();
        }
        return layoutIntrinsics.getDesiredWidth(i, i2);
    }
}
