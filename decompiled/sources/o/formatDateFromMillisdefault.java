package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class formatDateFromMillisdefault extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ onViewDetachedFromWindowlambda1 IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ formatDateFromMillisdefault(onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1, int i) {
        super(0);
        this.serializer = i;
        this.IconCompatParcelizer = onviewdetachedfromwindowlambda1;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.serializer;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = this.IconCompatParcelizer;
        if (i == 0) {
            return ((asFrameworkPaint) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper()).getViewModelStore();
        }
        asFrameworkPaint asframeworkpaint = (asFrameworkPaint) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
        AndroidColorFilter_androidKt androidColorFilter_androidKt = asframeworkpaint instanceof AndroidColorFilter_androidKt ? (AndroidColorFilter_androidKt) asframeworkpaint : null;
        return androidColorFilter_androidKt != null ? androidColorFilter_androidKt.getDefaultViewModelCreationExtras() : setPathEffect.IconCompatParcelizer;
    }
}
