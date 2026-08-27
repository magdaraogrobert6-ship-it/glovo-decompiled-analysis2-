package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.sessions.SessionDataSerializer;
import com.google.firebase.sessions.SessionsActivityLifecycleCallbacks;
import com.google.firebase.sessions.SharedSessionRepositoryImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 implements accessgetFocusedVirtualViewIdp {
    public final /* synthetic */ int read;
    public final Object serializer;

    public /* synthetic */ AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1(int i, Object obj) {
        this.read = i;
        this.serializer = obj;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.read;
        Object obj = this.serializer;
        if (i != 0) {
            return i != 1 ? obj : new SessionsActivityLifecycleCallbacks((SharedSessionRepositoryImpl) ((accessgetCurrentlyFocusedANIp) obj).write());
        }
        return new SessionDataSerializer((AndroidComposeViewrequestFocusViewFocusFixfocusSearchResult1) ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write());
    }

    public static AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 IconCompatParcelizer(Object obj) {
        if (obj != null) {
            return new AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1(2, obj);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("instance cannot be null");
        return null;
    }
}
