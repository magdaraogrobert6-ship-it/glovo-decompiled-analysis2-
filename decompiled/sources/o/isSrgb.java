package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class isSrgb {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final ArrayList read;
    public final char serializer;
    public final double write;

    public final int hashCode() {
        return read(this.serializer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
    }

    public isSrgb(ArrayList arrayList, char c, double d, String str, String str2) {
        this.read = arrayList;
        this.serializer = c;
        this.write = d;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public static int read(char c, String str, String str2) {
        return str2.hashCode() + af$$ExternalSyntheticOutline0.m(c * 31, 31, str);
    }
}
