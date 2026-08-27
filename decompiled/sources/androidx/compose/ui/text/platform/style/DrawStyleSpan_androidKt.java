package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;

/* JADX INFO: loaded from: classes4.dex */
public final class DrawStyleSpan_androidKt {
    /* JADX INFO: renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    public static final Paint.Cap m3369toAndroidCapBeK7IIE(int i) {
        StrokeCap.Companion companion = StrokeCap.Companion;
        if (StrokeCap.m1095equalsimpl0(i, companion.m1099getButtKaPHkGw())) {
            return Paint.Cap.BUTT;
        }
        if (StrokeCap.m1095equalsimpl0(i, companion.m1100getRoundKaPHkGw())) {
            return Paint.Cap.ROUND;
        }
        return StrokeCap.m1095equalsimpl0(i, companion.m1101getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    /* JADX INFO: renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    public static final Paint.Join m3370toAndroidJoinWw9F2mQ(int i) {
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        if (StrokeJoin.m1105equalsimpl0(i, companion.m1110getMiterLxFBmk8())) {
            return Paint.Join.MITER;
        }
        if (StrokeJoin.m1105equalsimpl0(i, companion.m1111getRoundLxFBmk8())) {
            return Paint.Join.ROUND;
        }
        return StrokeJoin.m1105equalsimpl0(i, companion.m1109getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
