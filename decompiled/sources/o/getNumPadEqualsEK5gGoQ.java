package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPadEqualsEK5gGoQ implements getNumPadMoveHomeEK5gGoQ {
    public final getNumPadMoveHomeEK5gGoQ RemoteActionCompatParcelizer;
    public final String serializer;

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Iterator read() {
        return null;
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ MediaDescriptionCompat() {
        return new getNumPadEqualsEK5gGoQ(this.serializer, this.RemoteActionCompatParcelizer.MediaDescriptionCompat());
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
    }

    public getNumPadEqualsEK5gGoQ(String str) {
        this.RemoteActionCompatParcelizer = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
        this.serializer = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getNumPadEqualsEK5gGoQ)) {
            return false;
        }
        getNumPadEqualsEK5gGoQ getnumpadequalsek5ggoq = (getNumPadEqualsEK5gGoQ) obj;
        return this.serializer.equals(getnumpadequalsek5ggoq.serializer) && this.RemoteActionCompatParcelizer.equals(getnumpadequalsek5ggoq.RemoteActionCompatParcelizer);
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final String IconCompatParcelizer() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ read(String str, androidx.transition.TransitionValuesMaps transitionValuesMaps, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Boolean serializer() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Double write() {
        throw new IllegalStateException("Control is not a double");
    }

    public getNumPadEqualsEK5gGoQ(String str, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq) {
        this.RemoteActionCompatParcelizer = getnumpadmovehomeek5ggoq;
        this.serializer = str;
    }
}
