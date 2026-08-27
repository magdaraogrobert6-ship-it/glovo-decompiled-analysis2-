package o;

/* JADX INFO: loaded from: classes4.dex */
public final class setGenderlambda1 {
    public final String read;
    public final String serializer;
    public final int write;

    public static int write(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public final int RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String read() {
        return this.read;
    }

    public final String toString() {
        return this.serializer;
    }

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public setGenderlambda1(accessgetTvDataServicecp accessgettvdataservicecp) {
        String str = accessgettvdataservicecp.RemoteActionCompatParcelizer;
        this.read = accessgettvdataservicecp.read;
        int i = accessgettvdataservicecp.IconCompatParcelizer;
        this.write = i == -1 ? str.equals("http") ? 80 : str.equals(com.adjust.sdk.Constants.SCHEME) ? 443 : -1 : i;
        this.serializer = accessgettvdataservicecp.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof setGenderlambda1) && ((setGenderlambda1) obj).serializer.equals(this.serializer);
    }
}
