package com.google.android.gms.internal.mlkit_vision_face;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;
import o.accessdetachAndRemoveNode;
import o.accessupdateNode;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzcv implements accessdetachAndRemoveNode {
    public static final /* synthetic */ zzcv RemoteActionCompatParcelizer = new zzcv(0);
    public static final /* synthetic */ zzcv write = new zzcv(1);
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ zzcv(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        if (this.IconCompatParcelizer != 0) {
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
        Map.Entry entry = (Map.Entry) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(zzcw.write, entry.getKey());
        accessupdatenode.write(zzcw.IconCompatParcelizer, entry.getValue());
    }
}
