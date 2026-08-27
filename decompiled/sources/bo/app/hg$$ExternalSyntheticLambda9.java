package bo.app;

import com.braze.support.ReflectionUtils;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg$$ExternalSyntheticLambda9 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ createInAppMessageEventSubscriber f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ hg$$ExternalSyntheticLambda9(String str, createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        this.f$1 = str;
        this.f$0 = createinappmessageeventsubscriber;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.f$0;
        String str = this.f$1;
        return i != 0 ? ReflectionUtils.getDeclaredMethodQuietly$lambda$0(str, createinappmessageeventsubscriber) : hg.a(createinappmessageeventsubscriber, str);
    }

    public /* synthetic */ hg$$ExternalSyntheticLambda9(createInAppMessageEventSubscriber createinappmessageeventsubscriber, String str) {
        this.f$0 = createinappmessageeventsubscriber;
        this.f$1 = str;
    }
}
