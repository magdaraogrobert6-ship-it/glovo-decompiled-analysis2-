package bo.app;

import o.createInAppMessageEventSubscriber;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d4$$ExternalSyntheticLambda3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ createInAppMessageEventSubscriber f$0;

    public /* synthetic */ d4$$ExternalSyntheticLambda3(createInAppMessageEventSubscriber createinappmessageeventsubscriber, int i) {
        this.$r8$classId = i;
        this.f$0 = createinappmessageeventsubscriber;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.f$0;
        if (i == 0) {
            return d4.a(createinappmessageeventsubscriber);
        }
        if (i == 1) {
            return e2.a(createinappmessageeventsubscriber);
        }
        if (i == 2) {
            return v6.a(createinappmessageeventsubscriber);
        }
        if (i != 3) {
            return i != 4 ? w6.b(createinappmessageeventsubscriber) : w6.a(createinappmessageeventsubscriber);
        }
        return v6.b(createinappmessageeventsubscriber);
    }
}
