package o;

import com.sentiance.protobuf.NullValue;
import com.sentiance.protobuf.Syntax;

/* JADX INFO: loaded from: classes4.dex */
public final class BannersUpdatedEventCompanion implements FeatureFlagsUpdatedEventCompanion {
    public static final BannersUpdatedEventCompanion RemoteActionCompatParcelizer = new BannersUpdatedEventCompanion(1);
    public static final BannersUpdatedEventCompanion write = new BannersUpdatedEventCompanion(0);
    public final /* synthetic */ int serializer;

    public /* synthetic */ BannersUpdatedEventCompanion(int i) {
        this.serializer = i;
    }

    @Override // o.FeatureFlagsUpdatedEventCompanion
    public final boolean write(int i) {
        if (this.serializer != 0) {
            return NullValue.forNumber(i) != null;
        }
        return Syntax.forNumber(i) != null;
    }
}
