package bo.app;

import com.braze.models.IPutIntoJson;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public enum vf implements IPutIntoJson {
    SUBSCRIBED,
    UNSUBSCRIBED;

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "subscribed";
        }
        if (iOrdinal == 1) {
            return "unsubscribed";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }
}
