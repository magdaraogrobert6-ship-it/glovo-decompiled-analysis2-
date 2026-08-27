package androidx.compose.ui.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public abstract class AlignmentLine {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int Unspecified = Integer.MIN_VALUE;
    private final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 merger;

    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getMerger$ui() {
        return this.merger;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private AlignmentLine(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.merger = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    public /* synthetic */ AlignmentLine(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, DefaultConstructorMarker defaultConstructorMarker) {
        this(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }
}
