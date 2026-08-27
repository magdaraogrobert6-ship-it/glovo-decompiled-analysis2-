package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class getCacheDriverFactoryfwf_client_release extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ getCustomerProfileConfig RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk read;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getCacheDriverFactoryfwf_client_release(getCustomerProfileConfig getcustomerprofileconfig, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, int i) {
        super(0);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = getcustomerprofileconfig;
        this.read = r8lambdaucgighn8fiyv_vccodeafjfpedk;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.serializer;
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk = this.read;
        getCustomerProfileConfig getcustomerprofileconfig = this.RemoteActionCompatParcelizer;
        return i != 0 ? super/*o.getTrackingServicefwf_client_release*/.write(r8lambdaucgighn8fiyv_vccodeafjfpedk) : super/*o.getTrackingServicefwf_client_release*/.RemoteActionCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedk);
    }
}
