package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class addArcRad {
    public final boolean IconCompatParcelizer;
    public final Object read;
    public final boolean serializer;
    public final asAndroidPathEffect write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        boolean z = this.IconCompatParcelizer;
        boolean z2 = this.serializer;
        Object obj = this.read;
        return (((((iHashCode * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(displayInAppMessagelambda1.serializer(addArcRad.class).IconCompatParcelizer());
        sb.append(" Type: " + this.write);
        sb.append(" Nullable: " + this.IconCompatParcelizer);
        if (this.serializer) {
            sb.append(" DefaultValue: " + this.read);
        }
        return sb.toString();
    }

    public addArcRad(asAndroidPathEffect asandroidpatheffect, boolean z, Object obj, boolean z2) {
        if (!asandroidpatheffect.ResultReceiver && z) {
            DrawableTransformation.serializer((Object) asandroidpatheffect.serializer().concat(" does not allow nullable values"));
            throw null;
        }
        if (!z && z2 && obj == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Argument with type ", asandroidpatheffect.serializer(), " has null value but is not nullable.");
            throw null;
        }
        this.write = asandroidpatheffect;
        this.IconCompatParcelizer = z;
        this.read = obj;
        this.serializer = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || addArcRad.class != obj.getClass()) {
            return false;
        }
        addArcRad addarcrad = (addArcRad) obj;
        if (this.IconCompatParcelizer != addarcrad.IconCompatParcelizer || this.serializer != addarcrad.serializer || !this.write.equals(addarcrad.write)) {
            return false;
        }
        Object obj2 = addarcrad.read;
        Object obj3 = this.read;
        if (obj3 != null) {
            return obj3.equals(obj2);
        }
        return obj2 == null;
    }
}
