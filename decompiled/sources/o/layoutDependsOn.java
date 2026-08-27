package o;

import com.roadrunner.face.verification.presentation.selfie.review.HumanReviewBottomSheetKt;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.compose.PasswordCreationScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class layoutDependsOn implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public /* synthetic */ layoutDependsOn(int i, int i2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.IconCompatParcelizer = i2;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.serializer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.write;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        Integer num = (Integer) obj2;
        if (i3 == 0) {
            num.intValue();
            HumanReviewBottomSheetKt.HumanReviewBottomSheetContent(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        num.getClass();
        PasswordCreationScreenKt.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
        int i5 = RemoteActionCompatParcelizer + 125;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return createfromparcel2;
        }
        throw null;
    }
}
