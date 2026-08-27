package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class getDefault4UtRPd4 {
    public final int RemoteActionCompatParcelizer;
    public final ArrayList write;

    public getDefault4UtRPd4(int i, ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = i;
        this.write = arrayList;
    }

    public final String toString() {
        accessgetTvTeletextcp accessgettvteletextcp = new accessgetTvTeletextcp("FaceContour");
        accessgettvteletextcp.IconCompatParcelizer(this.RemoteActionCompatParcelizer, "type");
        accessgettvteletextcp.write(this.write.toArray(), "points");
        return accessgettvteletextcp.toString();
    }
}
