package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import o.ShortNewsContentCardView;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public interface AwaitPointerEventScope extends Density {
    static /* synthetic */ <T> Object withTimeout$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
        return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(awaitPointerEventScope, shortNewsContentCardView);
    }

    static /* synthetic */ <T> Object withTimeoutOrNull$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
        return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(awaitPointerEventScope, shortNewsContentCardView);
    }

    Object awaitPointerEvent(PointerEventPass pointerEventPass, ShortNewsContentCardView<? super PointerEvent> shortNewsContentCardView);

    PointerEvent getCurrentEvent();

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo1954getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    default <T> Object withTimeout(long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
        return withTimeout$suspendImpl(this, j, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView);
    }

    default <T> Object withTimeoutOrNull(long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
        return withTimeoutOrNull$suspendImpl(this, j, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView);
    }

    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    default long mo1953getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m555getZeroNHjbRc();
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m1955getExtendedTouchPaddingNHjbRc(AwaitPointerEventScope awaitPointerEventScope) {
            return AwaitPointerEventScope.super.mo1953getExtendedTouchPaddingNHjbRc();
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m1956roundToPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo41roundToPxR2X_6o(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m1957roundToPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo42roundToPx0680j_4(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m1958toDpGaN1DYA(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo43toDpGaN1DYA(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m1959toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo44toDpu2uoSUM(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m1961toDpSizekrfVVM(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo46toDpSizekrfVVM(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m1962toPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo47toPxR2X_6o(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m1963toPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo48toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(AwaitPointerEventScope awaitPointerEventScope, DpRect dpRect) {
            return AwaitPointerEventScope.super.toRect(dpRect);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m1964toSizeXkaWNTQ(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo49toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m1965toSp0xMU5do(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo50toSp0xMU5do(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m1966toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo51toSpkPz2Gy4(f);
        }

        @Deprecated
        public static <T> Object withTimeout(AwaitPointerEventScope awaitPointerEventScope, long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
            return AwaitPointerEventScope.super.withTimeout(j, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView);
        }

        @Deprecated
        public static <T> Object withTimeoutOrNull(AwaitPointerEventScope awaitPointerEventScope, long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
            return AwaitPointerEventScope.super.withTimeoutOrNull(j, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m1960toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, int i) {
            return AwaitPointerEventScope.super.mo45toDpu2uoSUM(i);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m1967toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, int i) {
            return AwaitPointerEventScope.super.mo52toSpkPz2Gy4(i);
        }
    }

    static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                pointerEventPass = PointerEventPass.Main;
            }
            return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, shortNewsContentCardView);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        return null;
    }
}
