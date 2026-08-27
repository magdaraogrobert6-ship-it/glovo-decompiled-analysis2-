package androidx.compose.ui.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ruler {
    public static final int $stable = 0;
    private final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 calculate;

    public abstract float calculateCoordinate$ui(float f, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2);

    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getCalculate$ui() {
        return this.calculate;
    }

    private Ruler(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.calculate = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    public /* synthetic */ Ruler(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, DefaultConstructorMarker defaultConstructorMarker) {
        this(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }
}
