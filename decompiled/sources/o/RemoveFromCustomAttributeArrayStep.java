package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoveFromCustomAttributeArrayStep implements RemoveFromSubscriptionGroupStep {
    public final ArrayList serializer = new ArrayList();

    @Override // o.RemoveFromSubscriptionGroupStep
    public final Object RemoteActionCompatParcelizer() {
        return this.serializer;
    }
}
