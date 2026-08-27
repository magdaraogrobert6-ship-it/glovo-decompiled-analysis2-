package o;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetPictureSymbolscp extends accessgetNumPadPageUpcp {
    public final /* synthetic */ TaskApiCall$Builder RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetPictureSymbolscp(TaskApiCall$Builder taskApiCall$Builder, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.RemoteActionCompatParcelizer = taskApiCall$Builder;
    }

    @Override // o.accessgetNumPadPageUpcp
    public final void serializer(accessgetScp accessgetscp, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.serializer(accessgetscp, parentDataModifierDefaultImpls);
    }
}
