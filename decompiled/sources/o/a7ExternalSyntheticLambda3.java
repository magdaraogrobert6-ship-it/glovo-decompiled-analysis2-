package o;

import com.roadrunner.freelancing.presentation.bonus.WorkNowWithBonusKt;
import com.roadrunner.freelancing.presentation.infraboost.WorkNowWithInfraBoostKt;
import com.roadrunner.login.presentation.error.ErrorDialogScreenKt;
import com.roadrunner.rrds.compose.component.forms.PasswordFieldKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a7ExternalSyntheticLambda3 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ String serializer;

    public /* synthetic */ a7ExternalSyntheticLambda3(String str, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = str;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.IconCompatParcelizer;
        String str = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        Integer num = (Integer) obj2;
        switch (i2) {
            case 0:
                num.getClass();
                ErrorDialogScreenKt.IconCompatParcelizer(str, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 1:
                num.getClass();
                mergeZ1GrekI.IconCompatParcelizer(str, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 2:
                num.intValue();
                WorkNowWithBonusKt.NextAvailabilityText(str, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 3:
                num.intValue();
                WorkNowWithInfraBoostKt.NextAvailabilityText(str, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 4:
                num.getClass();
                PasswordFieldKt.ErrorText(str, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i4 = read + 69;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                break;
            case 5:
                num.intValue();
                PasswordFieldKt.RemoteActionCompatParcelizer(str, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 6:
                num.getClass();
                HeaderKt.write(str, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i6 = read + 115;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 51 / 0;
                }
                break;
            default:
                num.getClass();
                HeaderKt.IconCompatParcelizer(str, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
        }
        return createfromparcel;
    }
}
