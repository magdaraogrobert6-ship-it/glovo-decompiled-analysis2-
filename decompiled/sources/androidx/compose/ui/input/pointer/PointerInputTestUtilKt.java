package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.IntSize;
import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getQueryParameterslambda2;
import o.onContentCardClicked;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
public final class PointerInputTestUtilKt {
    public static final PointerInputChange down(long j, long j2, float f, float f2, List<HistoricalChange> list) {
        PointerInputChange pointerInputChange = new PointerInputChange(PointerId.m2048constructorimpl(j), j2, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L)), true, 1.0f, j2, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f2)))), false, false, 0, 0L, 0.0f, 0L, 7680, (DefaultConstructorMarker) null);
        List<HistoricalChange> list2 = list;
        return (list2 == null || list2.isEmpty()) ? pointerInputChange : pointerInputChange.m2064copyOHpmEuE((731 & 1) != 0 ? pointerInputChange.id : 0L, (731 & 2) != 0 ? pointerInputChange.uptimeMillis : 0L, (731 & 4) != 0 ? pointerInputChange.position : 0L, (731 & 8) != 0 ? pointerInputChange.pressed : false, (731 & 16) != 0 ? pointerInputChange.previousUptimeMillis : 0L, (731 & 32) != 0 ? pointerInputChange.previousPosition : 0L, (731 & 64) != 0 ? pointerInputChange.previousPressed : false, (731 & Fields.SpotShadowColor) != 0 ? pointerInputChange.type : 0, list, (731 & Fields.RotationY) != 0 ? pointerInputChange.scrollDelta : 0L);
    }

    /* JADX INFO: renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m2127invokeOverPasshUlJWOE(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        m2129invokeOverPasseshUlJWOE(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, pointerEvent, (List<? extends PointerEventPass>) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{pointerEventPass}, getQueryParameterslambda2.serializer(), -516583649, iSerializer), j);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m2129invokeOverPasseshUlJWOE(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, PointerEvent pointerEvent, List<? extends PointerEventPass> list, long j) {
        if (pointerEvent.getChanges().isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invokeOverPasses called with no changes");
            return;
        }
        List<? extends PointerEventPass> list2 = list;
        if (list2.isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invokeOverPasses called with no passes");
            return;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(pointerEvent, list.get(i), IntSize.m3836boximpl(j));
        }
    }

    public static final PointerInputChange moveBy(PointerInputChange pointerInputChange, long j, float f, float f2) {
        long jM2068getIdJ3iCeTQ = pointerInputChange.m2068getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        long jM2071getPositionF1C5BW0 = pointerInputChange.m2071getPositionF1C5BW0();
        long uptimeMillis2 = pointerInputChange.getUptimeMillis();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerInputChange.m2071getPositionF1C5BW0() >> 32));
        return new PointerInputChange(jM2068getIdJ3iCeTQ, uptimeMillis2 + j, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (pointerInputChange.m2071getPositionF1C5BW0() & 4294967295L)) + f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat + f)) << 32)), true, 1.0f, uptimeMillis, jM2071getPositionF1C5BW0, pressed, false, 0, 0L, 0.0f, 0L, 7680, (DefaultConstructorMarker) null);
    }

    public static final PointerInputChange moveTo(PointerInputChange pointerInputChange, long j, float f, float f2) {
        long jM2068getIdJ3iCeTQ = pointerInputChange.m2068getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(jM2068getIdJ3iCeTQ, j, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L)), true, 1.0f, uptimeMillis, pointerInputChange.m2071getPositionF1C5BW0(), pressed, false, 0, 0L, 0.0f, 0L, 7680, (DefaultConstructorMarker) null);
    }

    public static final PointerInputChange up(PointerInputChange pointerInputChange, long j) {
        long jM2068getIdJ3iCeTQ = pointerInputChange.m2068getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(jM2068getIdJ3iCeTQ, j, pointerInputChange.m2071getPositionF1C5BW0(), false, 1.0f, uptimeMillis, pointerInputChange.m2071getPositionF1C5BW0(), pressed, false, 0, 0L, 0.0f, 0L, 7680, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m2125invokeOverAllPassesH0pRuoY(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, PointerEvent pointerEvent, long j) {
        m2129invokeOverPasseshUlJWOE(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, pointerEvent, (List<? extends PointerEventPass>) SQLite.read(PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final), j);
    }

    /* JADX INFO: renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m2126invokeOverAllPassesH0pRuoY$default(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, PointerEvent pointerEvent, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = IntSize.m3839constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);
        }
        m2125invokeOverAllPassesH0pRuoY(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, pointerEvent, j);
    }

    /* JADX INFO: renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m2128invokeOverPasshUlJWOE$default(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = IntSize.m3839constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);
        }
        m2127invokeOverPasshUlJWOE(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, pointerEvent, pointerEventPass, j);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m2132invokeOverPasseshUlJWOE$default(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = IntSize.m3839constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);
        }
        m2130invokeOverPasseshUlJWOE(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, pointerEvent, pointerEventPassArr, j);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange pointerInputChange, long j, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return moveBy(pointerInputChange, j, f, f2);
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange pointerInputChange, long j, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return moveTo(pointerInputChange, j, f, f2);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m2131invokeOverPasseshUlJWOE$default(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, PointerEvent pointerEvent, List list, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = IntSize.m3839constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);
        }
        m2129invokeOverPasseshUlJWOE(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, pointerEvent, (List<? extends PointerEventPass>) list, j);
    }

    public static /* synthetic */ PointerInputChange down$default(long j, long j2, float f, float f2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j3 = j2;
        float f3 = (i & 4) != 0 ? 0.0f : f;
        float f4 = (i & 8) != 0 ? 0.0f : f2;
        if ((i & 16) != 0) {
            list = null;
        }
        return down(j, j3, f3, f4, list);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m2130invokeOverPasseshUlJWOE(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j) {
        m2129invokeOverPasseshUlJWOE(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, pointerEvent, (List<? extends PointerEventPass>) onContentCardClicked.RatingCompat(pointerEventPassArr), j);
    }
}
