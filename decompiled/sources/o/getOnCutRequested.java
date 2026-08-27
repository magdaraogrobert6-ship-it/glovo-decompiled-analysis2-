package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getOnCutRequested implements Serializable {
    public List IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public final int read;
    public long write;

    public getOnCutRequested(String str, int i, long j, ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = str;
        this.read = i;
        this.write = j;
        this.IconCompatParcelizer = arrayList;
    }
}
