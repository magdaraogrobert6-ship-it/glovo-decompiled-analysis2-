package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class onlyRemeasureIfPending extends accessgetPlaceOuterCoordinatorPositionp {
    public List RemoteActionCompatParcelizer;
    public String serializer;

    public final onlyRemeasureIfPending serializer(String str) {
        this.serializer = str;
        return this;
    }

    public final onlyRemeasureIfPending serializer(List list) {
        if (list != null) {
            this.RemoteActionCompatParcelizer = list;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null files");
        return null;
    }

    public final isUsedInMeasureOrLayout RemoteActionCompatParcelizer() {
        List list = this.RemoteActionCompatParcelizer;
        if (list != null) {
            return new isUsedInMeasureOrLayout(list, this.serializer);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: files");
        return null;
    }
}
