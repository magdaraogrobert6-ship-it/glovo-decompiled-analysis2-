package o;

/* JADX INFO: loaded from: classes2.dex */
public final class Key {
    public final Integer RemoteActionCompatParcelizer;
    public final Integer serializer;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
    }

    public final String toString() {
        return this.serializer + "," + this.RemoteActionCompatParcelizer;
    }

    public Key(setOnEvent setonevent) {
        this.serializer = Integer.valueOf(Math.round(setonevent.IconCompatParcelizer));
        this.RemoteActionCompatParcelizer = Integer.valueOf(Math.round(setonevent.serializer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Key.class != obj.getClass()) {
            return false;
        }
        Key key = (Key) obj;
        if (this.serializer.equals(key.serializer)) {
            return this.RemoteActionCompatParcelizer.equals(key.RemoteActionCompatParcelizer);
        }
        return false;
    }
}
