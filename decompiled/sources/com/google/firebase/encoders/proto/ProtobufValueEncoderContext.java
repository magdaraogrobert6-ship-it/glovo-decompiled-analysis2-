package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import o.accessgetAggregateChildKindSet;
import o.createAndInsertNodeAsChild;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtobufValueEncoderContext implements createAndInsertNodeAsChild {
    public accessgetAggregateChildKindSet RemoteActionCompatParcelizer;
    public final ProtobufDataEncoderContext write;
    public boolean serializer = false;
    public boolean read = false;

    public ProtobufValueEncoderContext(ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.write = protobufDataEncoderContext;
    }

    @Override // o.createAndInsertNodeAsChild
    public final createAndInsertNodeAsChild RemoteActionCompatParcelizer(String str) {
        if (this.serializer) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.serializer = true;
        this.write.IconCompatParcelizer(this.RemoteActionCompatParcelizer, str, this.read);
        return this;
    }

    @Override // o.createAndInsertNodeAsChild
    public final createAndInsertNodeAsChild RemoteActionCompatParcelizer(boolean z) {
        if (!this.serializer) {
            this.serializer = true;
            this.write.write(this.RemoteActionCompatParcelizer, z ? 1 : 0, this.read);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
