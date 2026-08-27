package o;

import com.google.android.gms.internal.mlkit_vision_barcode.zzff;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class createPointerInputEventDataInuC1xA implements getDiffer {
    public static final zzff write = new zzff(1);
    public Serializable IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public Object read;

    @Override // o.getDiffer
    public /* synthetic */ getDiffer serializer(Class cls, accessdetachAndRemoveNode accessdetachandremovenode) {
        ((HashMap) this.RemoteActionCompatParcelizer).put(cls, accessdetachandremovenode);
        ((HashMap) this.IconCompatParcelizer).remove(cls);
        return this;
    }
}
