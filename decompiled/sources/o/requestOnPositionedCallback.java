package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class requestOnPositionedCallback extends MeasurePassDelegateremeasure12 {
    public List IconCompatParcelizer;

    public final requestOnPositionedCallback serializer(List list) {
        if (list != null) {
            this.IconCompatParcelizer = list;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null rolloutAssignments");
        return null;
    }

    public final requestRelayout RemoteActionCompatParcelizer() {
        List list = this.IconCompatParcelizer;
        if (list != null) {
            return new requestRelayout(list);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: rolloutAssignments");
        return null;
    }
}
