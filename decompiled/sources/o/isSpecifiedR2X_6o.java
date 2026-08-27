package o;

import com.roadrunner.delivery.pickupdropoff.tasks.taptopay.presentation.compose.TapToPayContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isSpecifiedR2X_6o implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final /* synthetic */ getMaxHeightimpl RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ isSpecifiedR2X_6o(getMaxHeightimpl getmaxheightimpl, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.RemoteActionCompatParcelizer = getmaxheightimpl;
        this.read = modifier;
        this.write = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.write;
        androidx.compose.ui.Modifier modifier = this.read;
        getMaxHeightimpl getmaxheightimpl = this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            TapToPayContentKt.RemoteActionCompatParcelizer(getmaxheightimpl, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        TapToPayContentKt.CardItemContent(getmaxheightimpl, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = IconCompatParcelizer + 55;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
