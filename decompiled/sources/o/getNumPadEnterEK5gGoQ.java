package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPadEnterEK5gGoQ implements getNumPadMoveHomeEK5gGoQ {
    public final boolean write;

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Iterator read() {
        return null;
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Double write() {
        return Double.valueOf(true != this.write ? 0.0d : 1.0d);
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final String IconCompatParcelizer() {
        return Boolean.toString(this.write);
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ MediaDescriptionCompat() {
        return new getNumPadEnterEK5gGoQ(Boolean.valueOf(this.write));
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ read(String str, androidx.transition.TransitionValuesMaps transitionValuesMaps, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.write;
        if (zEquals) {
            return new getNumPadSubtractEK5gGoQ(Boolean.toString(z));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(Boolean.toString(z), ".", str, " is not a function."));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getNumPadEnterEK5gGoQ) && this.write == ((getNumPadEnterEK5gGoQ) obj).write;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.write).hashCode();
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Boolean serializer() {
        return Boolean.valueOf(this.write);
    }

    public final String toString() {
        return String.valueOf(this.write);
    }

    public getNumPadEnterEK5gGoQ(Boolean bool) {
        this.write = bool == null ? false : bool.booleanValue();
    }
}
