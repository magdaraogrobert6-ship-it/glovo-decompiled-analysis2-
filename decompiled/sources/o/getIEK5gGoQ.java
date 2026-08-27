package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class getIEK5gGoQ extends getFunctionEK5gGoQ {
    public final String RemoteActionCompatParcelizer;
    public final ArrayList serializer;

    @Override // o.getFunctionEK5gGoQ
    /* JADX INFO: renamed from: toString, reason: merged with bridge method [inline-methods] */
    public final String read() {
        return d$$ExternalSyntheticOutline0.m(new StringBuilder("*"), this.RemoteActionCompatParcelizer, ": ", this.serializer.toString());
    }

    public getIEK5gGoQ(String str, ArrayList arrayList) {
        accessgetSystemNavigationDowncp.serializer(str, "Instruction name must be a string.");
        this.RemoteActionCompatParcelizer = str;
        this.serializer = arrayList;
    }
}
