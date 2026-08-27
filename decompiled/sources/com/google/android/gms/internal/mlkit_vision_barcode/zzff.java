package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;
import o.accessdetachAndRemoveNode;
import o.accessupdateNode;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzff implements accessdetachAndRemoveNode {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        if (this.RemoteActionCompatParcelizer != 0) {
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
        Map.Entry entry = (Map.Entry) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(zzfg.IconCompatParcelizer, entry.getKey());
        accessupdatenode.write(zzfg.write, entry.getValue());
    }
}
