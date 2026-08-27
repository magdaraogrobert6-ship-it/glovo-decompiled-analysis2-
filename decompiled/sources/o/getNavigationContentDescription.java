package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getNavigationContentDescription {
    public final List read;

    public getNavigationContentDescription(List list) {
        if (list == null || list.isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot set an empty CaptureStage list.");
            throw null;
        }
        this.read = Collections.unmodifiableList(new ArrayList(list));
    }
}
