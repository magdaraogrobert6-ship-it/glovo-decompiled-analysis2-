package o;

import com.roadrunner.delivery.ontheway.navigation.presentation.compose.NavigationButtonKt;
import com.roadrunner.rrds.compose.component.feedback.communicator.MessageBarKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class generateUrlStringForGET implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RatingCompat = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;

    public /* synthetic */ generateUrlStringForGET(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z) {
        this.IconCompatParcelizer = 2;
        this.RemoteActionCompatParcelizer = z;
        this.read = i;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public /* synthetic */ generateUrlStringForGET(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        int i3 = this.read;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        boolean z2 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            MessageBarKt.serializer(z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            return createfromparcel;
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            NavigationButtonKt.read(z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            return createfromparcel;
        }
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            int i4 = write + 23;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = write + 91;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!getpostalcode.write(iIntValue & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else if (!z2) {
            getpostalcode.serializer(2007921744);
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.serializer(2007692065);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            companion.getClass();
            HeaderKt.read(this.read, this.serializer, companion, false, null, getpostalcode, 384, 24);
            getpostalcode.IconCompatParcelizer(false);
        }
        return createfromparcel;
    }
}
