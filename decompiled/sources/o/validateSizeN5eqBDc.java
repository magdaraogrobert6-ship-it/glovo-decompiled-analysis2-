package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class validateSizeN5eqBDc {
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final String read() {
        return this.serializer;
    }

    public final String write() {
        return this.write;
    }

    public final int hashCode() {
        return this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.write), 31, this.RemoteActionCompatParcelizer);
    }

    public validateSizeN5eqBDc(String str, String str2, String str3, String str4) {
        this.serializer = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.read = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof validateSizeN5eqBDc)) {
            return false;
        }
        validateSizeN5eqBDc validatesizen5eqbdc = (validateSizeN5eqBDc) obj;
        return this.serializer.equals(validatesizen5eqbdc.serializer) && this.write.equals(validatesizen5eqbdc.write) && this.RemoteActionCompatParcelizer.equals(validatesizen5eqbdc.RemoteActionCompatParcelizer) && this.read.equals(validatesizen5eqbdc.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventMetadata(globalEntityID=");
        sb.append(this.serializer);
        sb.append(", orderID=");
        sb.append(this.write);
        sb.append(", channelID=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", userID=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.read, ')');
    }
}
