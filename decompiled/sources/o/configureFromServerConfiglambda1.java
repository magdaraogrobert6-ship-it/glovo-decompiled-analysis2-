package o;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class configureFromServerConfiglambda1 {
    private Boolean RemoteActionCompatParcelizer = null;
    private final Context serializer;

    public configureFromServerConfiglambda1(Context context) {
        this.serializer = context;
    }

    public final boolean read() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = Boolean.valueOf((this.serializer.getApplicationInfo().flags & 2) != 0);
        }
        return this.RemoteActionCompatParcelizer.booleanValue();
    }
}
