package o;

import com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt;
import com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt;
import com.roadrunner.delivery.accept.individualEarnings.presentation.composable.SingleEarningsContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class computeMaxIntrinsicWidth implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ lookupAndInterpolate serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ computeMaxIntrinsicWidth(lookupAndInterpolate lookupandinterpolate, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.write = i2;
        this.serializer = lookupandinterpolate;
        this.read = modifier;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.IconCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.read;
        lookupAndInterpolate lookupandinterpolate = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            EarningsContentKt.PromoBonus(lookupandinterpolate, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            int i6 = MediaDescriptionCompat + 11;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return createfromparcel;
        }
        if (i4 == 1) {
            EarningsComposableKt.PromoBonus(lookupandinterpolate, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            return createfromparcel;
        }
        SingleEarningsContentKt.PromoBonus(lookupandinterpolate, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
        int i8 = RemoteActionCompatParcelizer + 43;
        MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return createfromparcel;
    }
}
