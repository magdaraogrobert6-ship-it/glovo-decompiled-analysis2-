package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPadRightParenthesisEK5gGoQ implements getNumPadMoveHomeEK5gGoQ {
    public final ArrayList read;
    public final String write;

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ MediaDescriptionCompat() {
        return this;
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Iterator read() {
        return null;
    }

    public getNumPadRightParenthesisEK5gGoQ(String str, ArrayList arrayList) {
        this.write = str;
        ArrayList arrayList2 = new ArrayList();
        this.read = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final String IconCompatParcelizer() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNumPadRightParenthesisEK5gGoQ)) {
            return false;
        }
        getNumPadRightParenthesisEK5gGoQ getnumpadrightparenthesisek5ggoq = (getNumPadRightParenthesisEK5gGoQ) obj;
        String str = getnumpadrightparenthesisek5ggoq.write;
        String str2 = this.write;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.read.equals(getnumpadrightparenthesisek5ggoq.read);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.write;
        return this.read.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ read(String str, androidx.transition.TransitionValuesMaps transitionValuesMaps, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Boolean serializer() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Double write() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }
}
