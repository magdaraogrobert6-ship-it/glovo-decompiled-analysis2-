package o;

import kotlin.jvm.internal.Lambda;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes2.dex */
public final class recordDrawingOperations extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ com.deliveryhero.chatui.view.root.CustomerChatActivity IconCompatParcelizer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ recordDrawingOperations(com.deliveryhero.chatui.view.root.CustomerChatActivity customerChatActivity, int i) {
        super(0);
        this.write = i;
        this.IconCompatParcelizer = customerChatActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.write;
        com.deliveryhero.chatui.view.root.CustomerChatActivity customerChatActivity = this.IconCompatParcelizer;
        if (i == 0) {
            return evaluateFeaturefwf_client_release.read(customerChatActivity).RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setTopLeftgyyYBs.class), null);
        }
        if (i == 1) {
            return evaluateFeaturefwf_client_release.read(customerChatActivity).RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null);
        }
        getFilterQualityfv9h1I viewModelStore = customerChatActivity.getViewModelStore();
        setStrokeCapBeK7IIE defaultViewModelCreationExtras = customerChatActivity.getDefaultViewModelCreationExtras();
        defaultViewModelCreationExtras.getClass();
        Scope scope = evaluateFeaturefwf_client_release.read(customerChatActivity);
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(com.deliveryhero.chatui.view.root.CustomerChatViewModel.class);
        viewModelStore.getClass();
        return GetViewModelKt.read(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, viewModelStore, defaultViewModelCreationExtras, scope);
    }
}
