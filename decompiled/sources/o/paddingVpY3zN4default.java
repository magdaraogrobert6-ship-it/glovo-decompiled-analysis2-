package o;

/* JADX INFO: loaded from: classes.dex */
public final class paddingVpY3zN4default implements paddingqDBjuR0default {
    public final Object serializer;
    public final Object write;

    public final int hashCode() {
        Object obj = this.serializer;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.write;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // o.paddingqDBjuR0default
    public final Object read() {
        return this.write;
    }

    @Override // o.paddingqDBjuR0default
    public final Object serializer() {
        return this.serializer;
    }

    public paddingVpY3zN4default(Object obj, Object obj2) {
        this.serializer = obj;
        this.write = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof paddingqDBjuR0default)) {
            return false;
        }
        paddingqDBjuR0default paddingqdbjur0default = (paddingqDBjuR0default) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, paddingqdbjur0default.serializer()}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, paddingqdbjur0default.read()}, getCieXyz.write())).booleanValue();
    }
}
