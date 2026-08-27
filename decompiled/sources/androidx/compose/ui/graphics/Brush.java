package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Brush {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long intrinsicSize;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m681horizontalGradient8A3gB4(onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr, float f, float f2, int i) {
            return m683linearGradientmHitzGk((onViewAttachedToWindowlambda0[]) Arrays.copyOf(onviewattachedtowindowlambda0Arr, onviewattachedtowindowlambda0Arr.length), Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), i);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m689verticalGradient8A3gB4(onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr, float f, float f2, int i) {
            return m683linearGradientmHitzGk((onViewAttachedToWindowlambda0[]) Arrays.copyOf(onviewattachedtowindowlambda0Arr, onviewattachedtowindowlambda0Arr.length), Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)), Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L)), i);
        }

        /* JADX INFO: renamed from: composite-7EN7VTw, reason: not valid java name */
        public final Brush m679composite7EN7VTw(Brush brush, Brush brush2, int i) {
            return new CompositeShaderBrush(BrushKt.toShaderBrush(brush), BrushKt.toShaderBrush(brush2), i, null);
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m683linearGradientmHitzGk(onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr, long j, long j2, int i) {
            ArrayList arrayList = new ArrayList(onviewattachedtowindowlambda0Arr.length);
            for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : onviewattachedtowindowlambda0Arr) {
                arrayList.add(Color.m712boximpl(((Color) onviewattachedtowindowlambda0.write).m732unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(onviewattachedtowindowlambda0Arr.length);
            for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 : onviewattachedtowindowlambda0Arr) {
                arrayList2.add(Float.valueOf(((Number) onviewattachedtowindowlambda1.serializer).floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, j, j2, i, null);
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m685radialGradientP_VxKs(onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr, long j, float f, int i) {
            ArrayList arrayList = new ArrayList(onviewattachedtowindowlambda0Arr.length);
            for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : onviewattachedtowindowlambda0Arr) {
                arrayList.add(Color.m712boximpl(((Color) onviewattachedtowindowlambda0.write).m732unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(onviewattachedtowindowlambda0Arr.length);
            for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 : onviewattachedtowindowlambda0Arr) {
                arrayList2.add(Float.valueOf(((Number) onviewattachedtowindowlambda1.serializer).floatValue()));
            }
            return new RadialGradient(arrayList, arrayList2, j, f, i, null);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m687sweepGradientUv8p0NA(onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr, long j) {
            ArrayList arrayList = new ArrayList(onviewattachedtowindowlambda0Arr.length);
            for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : onviewattachedtowindowlambda0Arr) {
                arrayList.add(Color.m712boximpl(((Color) onviewattachedtowindowlambda0.write).m732unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(onviewattachedtowindowlambda0Arr.length);
            for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 : onviewattachedtowindowlambda0Arr) {
                arrayList2.add(Float.valueOf(((Number) onviewattachedtowindowlambda1.serializer).floatValue()));
            }
            return new SweepGradient(j, arrayList, arrayList2, null);
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m672linearGradientmHitzGk$default(Companion companion, onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m493getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Offset.Companion.m491getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m1120getClamp3opZhB0();
            }
            return companion.m683linearGradientmHitzGk(onviewattachedtowindowlambda0Arr, j3, j4, i);
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m674radialGradientP_VxKs$default(Companion companion, onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m492getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m1120getClamp3opZhB0();
            }
            return companion.m685radialGradientP_VxKs(onviewattachedtowindowlambda0Arr, j2, f2, i);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m676sweepGradientUv8p0NA$default(Companion companion, onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m492getUnspecifiedF1C5BW0();
            }
            return companion.m687sweepGradientUv8p0NA(onviewattachedtowindowlambda0Arr, j);
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m669horizontalGradient8A3gB4$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m1120getClamp3opZhB0();
            }
            return companion.m680horizontalGradient8A3gB4((List<Color>) list, f, f2, i);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m675sweepGradientUv8p0NA$default(Companion companion, List list, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m492getUnspecifiedF1C5BW0();
            }
            return companion.m686sweepGradientUv8p0NA((List<Color>) list, j);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m677verticalGradient8A3gB4$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m1120getClamp3opZhB0();
            }
            return companion.m688verticalGradient8A3gB4((List<Color>) list, f, f2, i);
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m670horizontalGradient8A3gB4$default(Companion companion, onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m1120getClamp3opZhB0();
            }
            return companion.m681horizontalGradient8A3gB4(onviewattachedtowindowlambda0Arr, f, f2, i);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m678verticalGradient8A3gB4$default(Companion companion, onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m1120getClamp3opZhB0();
            }
            return companion.m689verticalGradient8A3gB4(onviewattachedtowindowlambda0Arr, f, f2, i);
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m673radialGradientP_VxKs$default(Companion companion, List list, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m492getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m1120getClamp3opZhB0();
            }
            return companion.m684radialGradientP_VxKs((List<Color>) list, j2, f2, i);
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m671linearGradientmHitzGk$default(Companion companion, List list, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m493getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Offset.Companion.m491getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m1120getClamp3opZhB0();
            }
            return companion.m682linearGradientmHitzGk((List<Color>) list, j3, j4, i);
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m680horizontalGradient8A3gB4(List<Color> list, float f, float f2, int i) {
            return m682linearGradientmHitzGk(list, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), i);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m688verticalGradient8A3gB4(List<Color> list, float f, float f2, int i) {
            return m682linearGradientmHitzGk(list, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)), Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L)), i);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m686sweepGradientUv8p0NA(List<Color> list, long j) {
            return new SweepGradient(j, list, null, null);
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m682linearGradientmHitzGk(List<Color> list, long j, long j2, int i) {
            return new LinearGradient(list, null, j, j2, i, null);
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m684radialGradientP_VxKs(List<Color> list, long j, float f, int i) {
            return new RadialGradient(list, null, j, f, i, null);
        }
    }

    /* JADX INFO: renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo667applyToPq9zytI(long j, Paint paint, float f);

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo668getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    private Brush() {
        this.intrinsicSize = Size.Companion.m554getUnspecifiedNHjbRc();
    }

    public /* synthetic */ Brush(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
