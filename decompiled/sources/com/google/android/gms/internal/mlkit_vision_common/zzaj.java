package com.google.android.gms.internal.mlkit_vision_common;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;
import o.accessdetachAndRemoveNode;
import o.accessupdateNode;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzaj implements accessdetachAndRemoveNode {
    public final /* synthetic */ int serializer;
    public static final /* synthetic */ zzaj read = new zzaj(0);
    public static final /* synthetic */ zzaj RemoteActionCompatParcelizer = new zzaj(1);

    public /* synthetic */ zzaj(int i) {
        this.serializer = i;
    }

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        if (this.serializer != 0) {
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
        Map.Entry entry = (Map.Entry) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(zzak.read, entry.getKey());
        accessupdatenode.write(zzak.RemoteActionCompatParcelizer, entry.getValue());
    }
}
