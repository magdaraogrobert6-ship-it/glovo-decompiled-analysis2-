package o;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getSelfKindSetuiannotations implements DelegatingNode, Serializable {
    public final Object serializer;

    @Override // o.DelegatingNode
    public final Object B_() {
        return this.serializer;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.serializer});
    }

    public getSelfKindSetuiannotations(Object obj) {
        this.serializer = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof getSelfKindSetuiannotations) {
            return TuplesKt.RemoteActionCompatParcelizer(this.serializer, ((getSelfKindSetuiannotations) obj).serializer);
        }
        return false;
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.serializer + ")";
    }
}
