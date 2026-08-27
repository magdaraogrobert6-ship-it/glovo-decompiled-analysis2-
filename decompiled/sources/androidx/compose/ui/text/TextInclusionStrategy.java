package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import o.seekAnimationsanimation_core;

/* JADX INFO: loaded from: classes.dex */
public interface TextInclusionStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    boolean isIncluded(Rect rect, Rect rect2);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final TextInclusionStrategy AnyOverlap = new seekAnimationsanimation_core(17);
        private static final TextInclusionStrategy ContainsAll = new seekAnimationsanimation_core(18);
        private static final TextInclusionStrategy ContainsCenter = new seekAnimationsanimation_core(19);

        private Companion() {
        }

        public final TextInclusionStrategy getAnyOverlap() {
            return AnyOverlap;
        }

        public final TextInclusionStrategy getContainsAll() {
            return ContainsAll;
        }

        public final TextInclusionStrategy getContainsCenter() {
            return ContainsCenter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ContainsCenter$lambda$0(Rect rect, Rect rect2) {
            return rect2.m503containsk4lQ0M(rect.m507getCenterF1C5BW0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ContainsAll$lambda$0(Rect rect, Rect rect2) {
            return !rect2.isEmpty() && rect.getLeft() >= rect2.getLeft() && rect.getRight() <= rect2.getRight() && rect.getTop() >= rect2.getTop() && rect.getBottom() <= rect2.getBottom();
        }
    }
}
