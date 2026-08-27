package androidx.compose.ui.semantics;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ensureSubscribedToInAppMessageEventslambda0;
import o.ensureSubscribedToInAppMessageEventslambda5;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class ProgressBarRangeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ProgressBarRangeInfo Indeterminate = new ProgressBarRangeInfo(0.0f, new ensureSubscribedToInAppMessageEventslambda0(0.0f), 0, 4, null);
    private final float current;
    private final ensureSubscribedToInAppMessageEventslambda5 range;
    private final int steps;

    public final float getCurrent() {
        return this.current;
    }

    public final ensureSubscribedToInAppMessageEventslambda5 getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    public int hashCode() {
        int iHashCode = Float.hashCode(this.current);
        return ((this.range.hashCode() + (iHashCode * 31)) * 31) + this.steps;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProgressBarRangeInfo getIndeterminate() {
            return ProgressBarRangeInfo.Indeterminate;
        }

        private Companion() {
        }
    }

    public ProgressBarRangeInfo(float f, ensureSubscribedToInAppMessageEventslambda5 ensuresubscribedtoinappmessageeventslambda5, int i) {
        this.current = f;
        this.range = ensuresubscribedtoinappmessageeventslambda5;
        this.steps = i;
        if (Float.isNaN(f)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("current must not be NaN");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
        if (this.current != progressBarRangeInfo.current) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.range, progressBarRangeInfo.range}, getCieXyz.write())).booleanValue() && this.steps == progressBarRangeInfo.steps;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.current);
        sb.append(", range=");
        sb.append(this.range);
        sb.append(", steps=");
        return af$$ExternalSyntheticOutline0.m(sb, this.steps, ')');
    }

    public /* synthetic */ ProgressBarRangeInfo(float f, ensureSubscribedToInAppMessageEventslambda5 ensuresubscribedtoinappmessageeventslambda5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, ensuresubscribedtoinappmessageeventslambda5, (i2 & 4) != 0 ? 0 : i);
    }
}
