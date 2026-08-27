package o;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.SessionEvents;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidComposeViewRootModifierNodemeasure1 implements accessgetFocusedVirtualViewIdp {
    public final AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 read;
    public final /* synthetic */ int write;

    public /* synthetic */ AndroidComposeViewRootModifierNodemeasure1(AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1, int i) {
        this.write = i;
        this.read = androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.write;
        AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 = this.read;
        if (i == 0) {
            return new AndroidComposeViewRootModifierNodeonKeyEventfocusWasMovedOrCancelled1((AbstractComposeViewExternalSyntheticLambda0) androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1.serializer);
        }
        if (i != 1) {
            return new accessgetPendingVerticalScrollEventsp((Context) androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1.serializer);
        }
        FirebaseApp firebaseApp = (FirebaseApp) androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1.serializer;
        firebaseApp.getClass();
        SessionEvents sessionEvents = SessionEvents.IconCompatParcelizer;
        return SessionEvents.write(firebaseApp);
    }
}
