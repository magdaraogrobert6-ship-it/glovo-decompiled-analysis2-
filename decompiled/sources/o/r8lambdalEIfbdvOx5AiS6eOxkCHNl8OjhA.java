package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Byte write;

    public final int hashCode() {
        return (this.write.hashCode() ^ 16777619) * (-2128831035);
    }

    public r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA(r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm) {
        this.write = r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer;
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(new StringBuilder("LocationModeChangeEvent{location_mode="), this.write, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA)) {
            return false;
        }
        Object obj2 = ((r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA) obj).write;
        Byte b = this.write;
        return b == obj2 || b.equals(obj2);
    }
}
