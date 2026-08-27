package androidx.compose.ui.draw;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;

/* JADX INFO: loaded from: classes4.dex */
public interface ShadowScope extends Density {
    float getAlpha();

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    int mo230getBlendMode0nO6VwU();

    Brush getBrush();

    /* JADX INFO: renamed from: getColor-0d7_KjU */
    long mo231getColor0d7_KjU();

    /* JADX INFO: renamed from: getOffset-F1C5BW0 */
    long mo232getOffsetF1C5BW0();

    float getRadius();

    float getSpread();

    void setAlpha(float f);

    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    void mo233setBlendModes9anfk8(int i);

    void setBrush(Brush brush);

    /* JADX INFO: renamed from: setColor-8_81llA */
    void mo234setColor8_81llA(long j);

    /* JADX INFO: renamed from: setOffset-k-4lQ0M */
    void mo235setOffsetk4lQ0M(long j);

    void setRadius(float f);

    void setSpread(float f);

    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m332roundToPxR2X_6o(ShadowScope shadowScope, long j) {
            return ShadowScope.super.mo41roundToPxR2X_6o(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m333roundToPx0680j_4(ShadowScope shadowScope, float f) {
            return ShadowScope.super.mo42roundToPx0680j_4(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m334toDpGaN1DYA(ShadowScope shadowScope, long j) {
            return ShadowScope.super.mo43toDpGaN1DYA(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m335toDpu2uoSUM(ShadowScope shadowScope, float f) {
            return ShadowScope.super.mo44toDpu2uoSUM(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m337toDpSizekrfVVM(ShadowScope shadowScope, long j) {
            return ShadowScope.super.mo46toDpSizekrfVVM(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m338toPxR2X_6o(ShadowScope shadowScope, long j) {
            return ShadowScope.super.mo47toPxR2X_6o(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m339toPx0680j_4(ShadowScope shadowScope, float f) {
            return ShadowScope.super.mo48toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(ShadowScope shadowScope, DpRect dpRect) {
            return ShadowScope.super.toRect(dpRect);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m340toSizeXkaWNTQ(ShadowScope shadowScope, long j) {
            return ShadowScope.super.mo49toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m341toSp0xMU5do(ShadowScope shadowScope, float f) {
            return ShadowScope.super.mo50toSp0xMU5do(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m342toSpkPz2Gy4(ShadowScope shadowScope, float f) {
            return ShadowScope.super.mo51toSpkPz2Gy4(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m336toDpu2uoSUM(ShadowScope shadowScope, int i) {
            return ShadowScope.super.mo45toDpu2uoSUM(i);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m343toSpkPz2Gy4(ShadowScope shadowScope, int i) {
            return ShadowScope.super.mo52toSpkPz2Gy4(i);
        }
    }
}
