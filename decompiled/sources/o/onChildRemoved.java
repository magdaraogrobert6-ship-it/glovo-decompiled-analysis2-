package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class onChildRemoved {
    public final int RemoteActionCompatParcelizer;
    public final removeNodesInRange read;
    public final String serializer;
    public final String write;

    public onChildRemoved(removeNodesInRange removenodesinrange, int i, String str, String str2) {
        this.read = removenodesinrange;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = str;
        this.write = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(status=");
        sb.append(this.read);
        sb.append(", keyId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", keyType='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.serializer, "', keyPrefix='", this.write, "')");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof onChildRemoved)) {
            return false;
        }
        onChildRemoved onchildremoved = (onChildRemoved) obj;
        return this.read == onchildremoved.read && this.RemoteActionCompatParcelizer == onchildremoved.RemoteActionCompatParcelizer && this.serializer.equals(onchildremoved.serializer) && this.write.equals(onchildremoved.write);
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        return Objects.hash(this.read, Integer.valueOf(i), this.serializer, this.write);
    }
}
