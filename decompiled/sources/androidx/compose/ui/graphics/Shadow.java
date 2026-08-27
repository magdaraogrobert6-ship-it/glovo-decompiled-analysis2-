package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.MediaSessionCompatQueueItem;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes.dex */
public final class Shadow {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Shadow None = new Shadow(0, 0, 0.0f, 7, null);
    private final float blurRadius;
    private final long color;
    private final long offset;

    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m1066getColor0d7_KjU$annotations() {
    }

    /* JADX INFO: renamed from: getOffset-F1C5BW0$annotations, reason: not valid java name */
    public static /* synthetic */ void m1067getOffsetF1C5BW0$annotations() {
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m1069getColor0d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m1070getOffsetF1C5BW0() {
        return this.offset;
    }

    public int hashCode() {
        int iM729hashCodeimpl = Color.m729hashCodeimpl(this.color);
        return Float.hashCode(this.blurRadius) + ((Offset.m479hashCodeimpl(this.offset) + (iM729hashCodeimpl * 31)) * 31);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        public final Shadow getNone() {
            return Shadow.None;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: copy-qcb84PM$default, reason: not valid java name */
    public static /* synthetic */ Shadow m1065copyqcb84PM$default(Shadow shadow, long j, long j2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = shadow.color;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = shadow.offset;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = shadow.blurRadius;
        }
        return shadow.m1068copyqcb84PM(j3, j4, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Color.m723equalsimpl0(this.color, shadow.color) && Offset.m474equalsimpl0(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.color, ", offset=", sb);
        sb.append((Object) Offset.m485toStringimpl(this.offset));
        sb.append(", blurRadius=");
        return MediaSessionCompatQueueItem.serializer(sb, this.blurRadius, ')');
    }

    /* JADX INFO: renamed from: copy-qcb84PM, reason: not valid java name */
    public final Shadow m1068copyqcb84PM(long j, long j2, float f) {
        return new Shadow(j, j2, f, null);
    }

    public /* synthetic */ Shadow(long j, long j2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ColorKt.Color(4278190080L) : j, (i & 2) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j2, (i & 4) != 0 ? 0.0f : f, null);
    }

    private Shadow(long j, long j2, float f) {
        this.color = j;
        this.offset = j2;
        this.blurRadius = f;
    }

    public /* synthetic */ Shadow(long j, long j2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f);
    }
}
