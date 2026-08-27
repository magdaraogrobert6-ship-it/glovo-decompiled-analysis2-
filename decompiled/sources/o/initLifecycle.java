package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class initLifecycle extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ onViewDetachedFromWindowlambda1 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ initLifecycle(onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1, int i) {
        super(0);
        this.serializer = i;
        this.write = onviewdetachedfromwindowlambda1;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        AndroidColorFilter_androidKt androidColorFilter_androidKt;
        setStrokeCapBeK7IIE defaultViewModelCreationExtras;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = this.write;
        if (i4 == 0) {
            return ((asFrameworkPaint) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper()).getViewModelStore();
        }
        if (i4 != 1) {
            if (i4 != 2) {
                asFrameworkPaint asframeworkpaint = (asFrameworkPaint) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
                androidColorFilter_androidKt = asframeworkpaint instanceof AndroidColorFilter_androidKt ? (AndroidColorFilter_androidKt) asframeworkpaint : null;
                return androidColorFilter_androidKt != null ? androidColorFilter_androidKt.getDefaultViewModelCreationExtras() : setPathEffect.IconCompatParcelizer;
            }
            getFilterQualityfv9h1I viewModelStore = ((asFrameworkPaint) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper()).getViewModelStore();
            int i5 = read + 25;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return viewModelStore;
        }
        asFrameworkPaint asframeworkpaint2 = (asFrameworkPaint) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
        androidColorFilter_androidKt = !((asframeworkpaint2 instanceof AndroidColorFilter_androidKt) ^ true) ? (AndroidColorFilter_androidKt) asframeworkpaint2 : null;
        if (androidColorFilter_androidKt == null) {
            return setPathEffect.IconCompatParcelizer;
        }
        int i7 = RemoteActionCompatParcelizer + 39;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            defaultViewModelCreationExtras = androidColorFilter_androidKt.getDefaultViewModelCreationExtras();
            int i8 = 55 / 0;
        } else {
            defaultViewModelCreationExtras = androidColorFilter_androidKt.getDefaultViewModelCreationExtras();
        }
        int i9 = read + 61;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return defaultViewModelCreationExtras;
    }
}
