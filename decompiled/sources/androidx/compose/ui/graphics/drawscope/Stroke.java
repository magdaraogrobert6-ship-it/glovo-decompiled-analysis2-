package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import bo.app.af$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class Stroke extends DrawStyle {
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth = 0.0f;
    private final int cap;
    private final int join;
    private final float miter;
    private final PathEffect pathEffect;
    private final float width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DefaultCap = StrokeCap.Companion.m1099getButtKaPHkGw();
    private static final int DefaultJoin = StrokeJoin.Companion.m1110getMiterLxFBmk8();

    /* JADX INFO: renamed from: getCap-KaPHkGw, reason: not valid java name */
    public final int m1373getCapKaPHkGw() {
        return this.cap;
    }

    /* JADX INFO: renamed from: getJoin-LxFBmk8, reason: not valid java name */
    public final int m1374getJoinLxFBmk8() {
        return this.join;
    }

    public final float getMiter() {
        return this.miter;
    }

    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline1.m(this.miter, Float.hashCode(this.width) * 31, 31);
        int iM1096hashCodeimpl = StrokeCap.m1096hashCodeimpl(this.cap);
        int iM1106hashCodeimpl = StrokeJoin.m1106hashCodeimpl(this.join);
        PathEffect pathEffect = this.pathEffect;
        return ((iM1106hashCodeimpl + ((iM1096hashCodeimpl + iM) * 31)) * 31) + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDefaultCap-KaPHkGw, reason: not valid java name */
        public final int m1375getDefaultCapKaPHkGw() {
            return Stroke.DefaultCap;
        }

        /* JADX INFO: renamed from: getDefaultJoin-LxFBmk8, reason: not valid java name */
        public final int m1376getDefaultJoinLxFBmk8() {
            return Stroke.DefaultJoin;
        }

        private Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        if (this.width != stroke.width || this.miter != stroke.miter || !StrokeCap.m1095equalsimpl0(this.cap, stroke.cap) || !StrokeJoin.m1105equalsimpl0(this.join, stroke.join)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pathEffect, stroke.pathEffect}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) StrokeCap.m1097toStringimpl(this.cap)) + ", join=" + ((Object) StrokeJoin.m1107toStringimpl(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }

    public /* synthetic */ Stroke(float f, float f2, int i, int i2, PathEffect pathEffect, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0.0f : f, (i3 & 2) != 0 ? 4.0f : f2, (i3 & 4) != 0 ? DefaultCap : i, (i3 & 8) != 0 ? DefaultJoin : i2, (i3 & 16) != 0 ? null : pathEffect, null);
    }

    private Stroke(float f, float f2, int i, int i2, PathEffect pathEffect) {
        super(null);
        this.width = f;
        this.miter = f2;
        this.cap = i;
        this.join = i2;
        this.pathEffect = pathEffect;
    }

    public /* synthetic */ Stroke(float f, float f2, int i, int i2, PathEffect pathEffect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, i, i2, pathEffect);
    }
}
