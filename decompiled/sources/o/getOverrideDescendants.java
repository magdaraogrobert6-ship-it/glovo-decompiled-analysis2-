package o;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getOverrideDescendants {
    public transient onExit serializer;
    public transient getAfterhoxUOeE write;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getOverrideDescendants) {
            return serializer().equals(((getOverrideDescendants) obj).serializer());
        }
        return false;
    }

    public final int hashCode() {
        return ((getAfterhoxUOeE) serializer()).write.hashCode();
    }

    public final String toString() {
        return ((getAfterhoxUOeE) serializer()).write.toString();
    }

    public final Set read() {
        onExit onexit = this.serializer;
        if (onexit != null) {
            return onexit;
        }
        getPointerIconService getpointericonservice = (getPointerIconService) this;
        onExit onexit2 = new onExit(getpointericonservice, getpointericonservice.IconCompatParcelizer);
        this.serializer = onexit2;
        return onexit2;
    }

    public final Map serializer() {
        getAfterhoxUOeE getafterhoxuoee = this.write;
        if (getafterhoxuoee != null) {
            return getafterhoxuoee;
        }
        getPointerIconService getpointericonservice = (getPointerIconService) this;
        getAfterhoxUOeE getafterhoxuoee2 = new getAfterhoxUOeE(getpointericonservice, getpointericonservice.IconCompatParcelizer, 1);
        this.write = getafterhoxuoee2;
        return getafterhoxuoee2;
    }
}
