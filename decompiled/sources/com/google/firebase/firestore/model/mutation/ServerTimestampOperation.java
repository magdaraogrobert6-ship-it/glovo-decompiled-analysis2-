package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.Value;
import o.NodeKindKt;
import o.accesscontainsDescendant;
import o.encodedString;
import o.getAction;
import o.shouldHitTestChildren;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerTimestampOperation implements NodeKindKt {
    public static final ServerTimestampOperation IconCompatParcelizer = new ServerTimestampOperation();

    @Override // o.NodeKindKt
    public final Value RemoteActionCompatParcelizer(Value value, Value value2) {
        return value2;
    }

    @Override // o.NodeKindKt
    public final Value write(Value value, Timestamp timestamp) {
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        accesscontainsdescendantNewBuilder.read("server_timestamp");
        Value value2 = (Value) accesscontainsdescendantNewBuilder.serializer();
        accesscontainsDescendant accesscontainsdescendantNewBuilder2 = Value.newBuilder();
        encodedString encodedstringNewBuilder = com.google.protobuf.Timestamp.newBuilder();
        long j = timestamp.IconCompatParcelizer;
        encodedstringNewBuilder.RemoteActionCompatParcelizer();
        ((com.google.protobuf.Timestamp) encodedstringNewBuilder.RemoteActionCompatParcelizer).setSeconds(j);
        int i = timestamp.RemoteActionCompatParcelizer;
        encodedstringNewBuilder.RemoteActionCompatParcelizer();
        ((com.google.protobuf.Timestamp) encodedstringNewBuilder.RemoteActionCompatParcelizer).setNanos(i);
        accesscontainsdescendantNewBuilder2.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder2.RemoteActionCompatParcelizer).setTimestampValue((com.google.protobuf.Timestamp) encodedstringNewBuilder.serializer());
        Value value3 = (Value) accesscontainsdescendantNewBuilder2.serializer();
        getAction getactionNewBuilder = MapValue.newBuilder();
        getactionNewBuilder.serializer("__type__", value2);
        getactionNewBuilder.serializer("__local_write_time__", value3);
        if (shouldHitTestChildren.read(value)) {
            value = shouldHitTestChildren.RemoteActionCompatParcelizer(value);
        }
        if (value != null) {
            getactionNewBuilder.serializer("__previous_value__", value);
        }
        accesscontainsDescendant accesscontainsdescendantNewBuilder3 = Value.newBuilder();
        accesscontainsdescendantNewBuilder3.RemoteActionCompatParcelizer(getactionNewBuilder);
        return (Value) accesscontainsdescendantNewBuilder3.serializer();
    }
}
