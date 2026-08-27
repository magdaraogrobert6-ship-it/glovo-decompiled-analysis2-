package o;

import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public final class getDrawOLwlOKwannotations extends getBringIntoViewOLwlOKw {
    public final Value serializer;

    @Override // o.getBringIntoViewOLwlOKw
    public final Value IconCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.getBringIntoViewOLwlOKw
    public final boolean RemoteActionCompatParcelizer() {
        return false;
    }

    @Override // o.getBringIntoViewOLwlOKw
    public final boolean read() {
        return true;
    }

    @Override // o.getBringIntoViewOLwlOKw
    public final boolean write() {
        return false;
    }

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public getDrawOLwlOKwannotations(Value value) {
        value.getClass();
        this.serializer = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDrawOLwlOKwannotations)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((getDrawOLwlOKwannotations) obj).serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "EvaluateResultValue(value=" + this.serializer + ')';
    }
}
