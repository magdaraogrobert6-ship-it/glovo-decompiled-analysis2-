package o;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class accesscompareEquals {
    public static final accesscompareEquals serializer = new accesscompareEquals(new HashSet());
    public final HashSet RemoteActionCompatParcelizer;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public accesscompareEquals(HashSet hashSet) {
        this.RemoteActionCompatParcelizer = hashSet;
    }

    public final String toString() {
        return "FieldMask{mask=" + this.RemoteActionCompatParcelizer.toString() + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || accesscompareEquals.class != obj.getClass()) {
            return false;
        }
        return this.RemoteActionCompatParcelizer.equals(((accesscompareEquals) obj).RemoteActionCompatParcelizer);
    }
}
