package com.google.firebase.encoders.json;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.ProtobufDataEncoderContext;
import java.util.Map;
import o.accessdetachAndRemoveNode;
import o.accessupdateNode;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class JsonDataEncoderBuilder$$ExternalSyntheticLambda0 implements accessdetachAndRemoveNode {
    public final /* synthetic */ int write;

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        int i = this.write;
        if (i == 0) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
        if (i != 1) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
        Map.Entry entry = (Map.Entry) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(ProtobufDataEncoderContext.RemoteActionCompatParcelizer, entry.getKey());
        accessupdatenode.write(ProtobufDataEncoderContext.IconCompatParcelizer, entry.getValue());
    }
}
