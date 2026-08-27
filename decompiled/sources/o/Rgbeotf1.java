package o;

/* JADX INFO: loaded from: classes.dex */
public final class Rgbeotf1 implements isPQishui_graphics {
    public final isHLGishui_graphics IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public Class serializer;

    @Override // o.isPQishui_graphics
    public final void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(this);
    }

    public final void serializer(Class cls, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = cls;
    }

    public Rgbeotf1(isHLGishui_graphics ishlgishui_graphics) {
        this.IconCompatParcelizer = ishlgishui_graphics;
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        Class cls = this.serializer;
        return (i * 31) + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.RemoteActionCompatParcelizer + "array=" + this.serializer + '}';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Rgbeotf1)) {
            return false;
        }
        Rgbeotf1 rgbeotf1 = (Rgbeotf1) obj;
        return this.RemoteActionCompatParcelizer == rgbeotf1.RemoteActionCompatParcelizer && this.serializer == rgbeotf1.serializer;
    }
}
