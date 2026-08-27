package o;

/* JADX INFO: loaded from: classes.dex */
public final class component5kKHJgLs extends minRadius {
    public final boolean IconCompatParcelizer;
    public final Object read;
    public final Object serializer;

    public final Object IconCompatParcelizer() {
        return this.serializer;
    }

    public final boolean RatingCompat() {
        return this.serializer != null;
    }

    public final Object RemoteActionCompatParcelizer() {
        return this.read;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public component5kKHJgLs(getInternalCanvasannotations getinternalcanvasannotations, boolean z, boolean z2) {
        super(getinternalcanvasannotations);
        androidx.fragment.app.Fragment fragment = getinternalcanvasannotations.RemoteActionCompatParcelizer;
        clipRectN_I0leg cliprectn_i0leg = getinternalcanvasannotations.serializer;
        clipRectN_I0leg cliprectn_i0leg2 = clipRectN_I0leg.VISIBLE;
        this.read = cliprectn_i0leg == cliprectn_i0leg2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
        this.IconCompatParcelizer = getinternalcanvasannotations.serializer == cliprectn_i0leg2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
        this.serializer = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
    }

    public final toAndroidBlendModes9anfk8 write(Object obj) {
        if (obj == null) {
            return null;
        }
        AndroidBlendMode_androidKt androidBlendMode_androidKt = toRectuvyYCjk.serializer;
        if (obj instanceof android.transition.Transition) {
            return androidBlendMode_androidKt;
        }
        toAndroidBlendModes9anfk8 toandroidblendmodes9anfk8 = toRectuvyYCjk.read;
        if (toandroidblendmodes9anfk8 != null && toandroidblendmodes9anfk8.read(obj)) {
            return toandroidblendmodes9anfk8;
        }
        StringBuilder sb = new StringBuilder("Transition ");
        sb.append(obj);
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        sb.append(" for fragment ");
        sb.append(fragment);
        sb.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb.toString());
    }

    public final toAndroidBlendModes9anfk8 read() {
        Object obj = this.read;
        toAndroidBlendModes9anfk8 toandroidblendmodes9anfk8Write = write(obj);
        Object obj2 = this.serializer;
        toAndroidBlendModes9anfk8 toandroidblendmodes9anfk8Write2 = write(obj2);
        if (toandroidblendmodes9anfk8Write == null || toandroidblendmodes9anfk8Write2 == null || toandroidblendmodes9anfk8Write == toandroidblendmodes9anfk8Write2) {
            return toandroidblendmodes9anfk8Write == null ? toandroidblendmodes9anfk8Write2 : toandroidblendmodes9anfk8Write;
        }
        seekAnimationsanimation_core.serializer("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, " returned Transition ", obj, " which uses a different Transition  type than its shared element transition ", obj2);
        return null;
    }
}
