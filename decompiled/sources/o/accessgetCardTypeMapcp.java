package o;

import com.sentiance.protobuf.WireFormat$FieldType;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetCardTypeMapcp implements Comparable {
    public final boolean IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final WireFormat$FieldType read;
    public final boolean serializer;
    public final getFeatureFlags write;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.RemoteActionCompatParcelizer - ((accessgetCardTypeMapcp) obj).RemoteActionCompatParcelizer;
    }

    public accessgetCardTypeMapcp(getFeatureFlags getfeatureflags, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, boolean z2) {
        this.write = getfeatureflags;
        this.RemoteActionCompatParcelizer = i;
        this.read = wireFormat$FieldType;
        this.IconCompatParcelizer = z;
        this.serializer = z2;
    }
}
