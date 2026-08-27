package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class setEnd implements focusTarget {
    public final String IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final ArrayList write;

    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List read() {
        return this.write;
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    public setEnd(ArrayList arrayList, int i, int i2, String str) {
        this.write = arrayList;
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = str;
    }
}
