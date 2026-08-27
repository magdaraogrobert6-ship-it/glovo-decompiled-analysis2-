package o;

import com.sentiance.protobuf.Field;

/* JADX INFO: loaded from: classes5.dex */
public final class launchDelayed implements FeatureFlagsUpdatedEventCompanion {
    public static final launchDelayed write = new launchDelayed();

    @Override // o.FeatureFlagsUpdatedEventCompanion
    public final boolean write(int i) {
        return Field.Cardinality.forNumber(i) != null;
    }
}
