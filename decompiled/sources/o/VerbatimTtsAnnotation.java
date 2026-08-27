package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface VerbatimTtsAnnotation {
    default List IconCompatParcelizer() {
        int i = 2 % 2;
        if (this instanceof TtsAnnotation) {
            return ((TtsAnnotation) this).RemoteActionCompatParcelizer.acceptDetails;
        }
        if (this instanceof r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww) {
            return ((r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww) this).IconCompatParcelizer.acceptDetails;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    default FocusTargetInteropElement write() {
        int i = 2 % 2;
        if (this instanceof TtsAnnotation) {
            return ((TtsAnnotation) this).RemoteActionCompatParcelizer.declineDetails;
        }
        if (!(!(this instanceof r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww))) {
            return ((r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww) this).IconCompatParcelizer.declineDetails;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }
}
