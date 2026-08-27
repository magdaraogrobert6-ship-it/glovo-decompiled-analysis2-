package androidx.compose.ui.platform;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;

/* JADX INFO: loaded from: classes.dex */
public interface AccessibilityManager {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    long calculateRecommendedTimeoutMillis(long j, boolean z, boolean z2, boolean z3);

    static /* synthetic */ long calculateRecommendedTimeoutMillis$default(AccessibilityManager accessibilityManager, long j, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            return accessibilityManager.calculateRecommendedTimeoutMillis(j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
        return 0L;
    }
}
