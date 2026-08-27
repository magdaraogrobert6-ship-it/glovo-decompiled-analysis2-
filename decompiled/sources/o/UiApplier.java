package o;

import android.app.Application;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class UiApplier implements forceAccessibilityForTesting {
    public final /* synthetic */ int IconCompatParcelizer;
    public final getTextInputServiceannotations RemoteActionCompatParcelizer;

    public /* synthetic */ UiApplier(getTextInputServiceannotations gettextinputserviceannotations, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = gettextinputserviceannotations;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.IconCompatParcelizer;
        getTextInputServiceannotations gettextinputserviceannotations = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return new TraversableNode((accessgetToRunOnFramep) gettextinputserviceannotations.write());
        }
        if (i == 1) {
            return new ImpressionStorageClient((r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM) gettextinputserviceannotations.write());
        }
        if (i == 2) {
            return new WeakReference((Application) gettextinputserviceannotations.write());
        }
        if (i == 3) {
            FlowablePublish flowablePublish = ((AnalyticsEventsManager) gettextinputserviceannotations.write()).serializer;
            setNativeShader.RemoteActionCompatParcelizer(flowablePublish);
            return flowablePublish;
        }
        if (i == 4) {
            return new AnalyticsEventsManager((logTree) gettextinputserviceannotations.write());
        }
        if (i == 5) {
            return new TraversableNodeCompanion((Executor) gettextinputserviceannotations.write());
        }
        wouldPushPermissionPromptDisplaylambda2 wouldpushpermissionpromptdisplaylambda2 = ((Rstyleable) coil3.util.UtilsKt.RemoteActionCompatParcelizer(1751724500, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{(String) gettextinputserviceannotations.write()}, -1751724496, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read())).read();
        setNativeShader.RemoteActionCompatParcelizer(wouldpushpermissionpromptdisplaylambda2);
        return wouldpushpermissionpromptdisplaylambda2;
    }

    public /* synthetic */ UiApplier(Object obj, getTextInputServiceannotations gettextinputserviceannotations, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = gettextinputserviceannotations;
    }
}
