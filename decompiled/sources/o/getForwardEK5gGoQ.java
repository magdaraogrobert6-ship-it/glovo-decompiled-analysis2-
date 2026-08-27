package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getForwardEK5gGoQ {
    public final List IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final List read;
    public final List serializer;

    public final List IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List read() {
        return this.IconCompatParcelizer;
    }

    public final List serializer() {
        return this.serializer;
    }

    public final List write() {
        return this.read;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.RemoteActionCompatParcelizer);
        String strValueOf2 = String.valueOf(this.serializer);
        return d$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Positive predicates: ", strValueOf, "  Negative predicates: ", strValueOf2, "  Add tags: "), String.valueOf(this.IconCompatParcelizer), "  Remove tags: ", String.valueOf(this.read));
    }

    public /* synthetic */ getForwardEK5gGoQ(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.RemoteActionCompatParcelizer = Collections.unmodifiableList(arrayList);
        this.serializer = Collections.unmodifiableList(arrayList2);
        this.IconCompatParcelizer = Collections.unmodifiableList(arrayList3);
        this.read = Collections.unmodifiableList(arrayList4);
    }
}
