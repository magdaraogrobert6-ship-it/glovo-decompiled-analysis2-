package o;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getRighthoxUOeE {
    public transient getAbovehoxUOeE IconCompatParcelizer;
    public transient getAfterhoxUOeE write;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getRighthoxUOeE) {
            return serializer().equals(((getRighthoxUOeE) obj).serializer());
        }
        return false;
    }

    public final int hashCode() {
        return ((getAfterhoxUOeE) serializer()).write.hashCode();
    }

    public final String toString() {
        return ((getAfterhoxUOeE) serializer()).write.toString();
    }

    public final Set IconCompatParcelizer() {
        getAbovehoxUOeE getabovehoxuoee = this.IconCompatParcelizer;
        if (getabovehoxuoee != null) {
            return getabovehoxuoee;
        }
        getLambda641200809ui getlambda641200809ui = (getLambda641200809ui) this;
        getAbovehoxUOeE getabovehoxuoee2 = new getAbovehoxUOeE(getlambda641200809ui, getlambda641200809ui.serializer);
        this.IconCompatParcelizer = getabovehoxuoee2;
        return getabovehoxuoee2;
    }

    public final Map serializer() {
        getAfterhoxUOeE getafterhoxuoee = this.write;
        if (getafterhoxuoee != null) {
            return getafterhoxuoee;
        }
        getLambda641200809ui getlambda641200809ui = (getLambda641200809ui) this;
        getAfterhoxUOeE getafterhoxuoee2 = new getAfterhoxUOeE(getlambda641200809ui, getlambda641200809ui.serializer, 0);
        this.write = getafterhoxuoee2;
        return getafterhoxuoee2;
    }
}
