package o;

import com.sentiance.protobuf.Field;

/* JADX INFO: loaded from: classes5.dex */
public final class launchDelayeddefault implements FeatureFlagsUpdatedEventCompanion {
    public static final launchDelayeddefault write = new launchDelayeddefault();

    @Override // o.FeatureFlagsUpdatedEventCompanion
    public final boolean write(int i) {
        return Field.Kind.forNumber(i) != null;
    }
}
