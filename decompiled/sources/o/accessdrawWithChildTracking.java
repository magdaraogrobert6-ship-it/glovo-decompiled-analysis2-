package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessdrawWithChildTracking extends getAutoke2Ky5w {
    public final access900 serializer;

    @Override // o.getAutoke2Ky5w
    public final Object RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public final int hashCode() {
        return ((Integer) access900.read(36816942, new Object[]{this.serializer}, PackageHandler7.read(), PackageHandler7.read(), PackageHandler7.read(), -36816942, PackageHandler7.read())).intValue();
    }

    public accessdrawWithChildTracking(access900 access900Var) {
        this.serializer = access900Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof accessdrawWithChildTracking) && this.serializer.equals(((accessdrawWithChildTracking) obj).serializer);
    }

    public final String toString() {
        return "Some(value=" + this.serializer + ")";
    }
}
