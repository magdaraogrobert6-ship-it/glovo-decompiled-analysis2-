package bo.app;

import com.braze.support.BrazeImageUtils;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ n$$ExternalSyntheticLambda1(int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = i;
        this.f$1 = i2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        if (i == 0) {
            return n.a(this.f$0, this.f$1);
        }
        if (i == 1) {
            return BrazeImageUtils.getDestinationHeightAndWidthPixels$lambda$0(this.f$0, this.f$1);
        }
        if (i == 2) {
            return BrazeImageUtils.getRemoteBitmap$lambda$2(this.f$0, this.f$1);
        }
        if (i != 3) {
            return i != 4 ? DefaultInAppMessageViewWrapper.ViewOnLayoutChangeListenerC00842.onLayoutChange$lambda$0(this.f$0, this.f$1) : ContentCardAdapter.markOnScreenCardsAsRead$lambda$1(this.f$0, this.f$1);
        }
        return BrazeImageUtils.getLocalBitmap$lambda$4(this.f$0, this.f$1);
    }
}
