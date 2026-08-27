package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class HorizontalRuler extends Ruler {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    private HorizontalRuler(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        super(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HorizontalRuler derived(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return new HorizontalRuler(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null);
        }

        private Companion() {
        }

        public final HorizontalRuler maxOf(final HorizontalRuler... horizontalRulerArr) {
            return new HorizontalRuler(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$maxOf$1
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((Placeable.PlacementScope) obj, ((Number) obj2).floatValue());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final Float invoke(Placeable.PlacementScope placementScope, float f) {
                    return Float.valueOf(RulerKt.mergeRulerValues(placementScope, true, horizontalRulerArr, f));
                }
            }, null);
        }

        public final HorizontalRuler minOf(final HorizontalRuler... horizontalRulerArr) {
            return new HorizontalRuler(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$minOf$1
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke((Placeable.PlacementScope) obj, ((Number) obj2).floatValue());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final Float invoke(Placeable.PlacementScope placementScope, float f) {
                    return Float.valueOf(RulerKt.mergeRulerValues(placementScope, false, horizontalRulerArr, f));
                }
            }, null);
        }
    }

    public /* synthetic */ HorizontalRuler(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, DefaultConstructorMarker defaultConstructorMarker) {
        this(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public HorizontalRuler() {
        this(null);
    }

    @Override // androidx.compose.ui.layout.Ruler
    public float calculateCoordinate$ui(float f, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        return Float.intBitsToFloat((int) (layoutCoordinates2.mo2218localPositionOfR5De75A(layoutCoordinates, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(((int) (layoutCoordinates.mo2217getSizeYbymL2g() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L))) & 4294967295L));
    }
}
