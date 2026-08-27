package o;

import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ Object write;

    public /* synthetic */ r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI(Object obj, boolean z, int i) {
        this.IconCompatParcelizer = i;
        this.write = obj;
        this.read = z;
    }

    public /* synthetic */ r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI(boolean z, isInvalidIndex isinvalidindex, int i) {
        this.IconCompatParcelizer = i;
        this.read = z;
        this.write = isinvalidindex;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        boolean z2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.write;
        if (i4 == 0) {
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
            int iIntValue = ((Integer) obj2).intValue();
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (!(!getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2))) {
                int i5 = RemoteActionCompatParcelizer + 111;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                shouldRetryAfterFailure.read(this.read, r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.foundation.layout.SizeKt.m86width3ABfNKs(androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(androidx.compose.ui.Modifier.Companion, Dimensions.setVisibility), Dimensions.setCustomView), false, getpostalcode, 0, 8);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            int i7 = RemoteActionCompatParcelizer + 41;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 28 / 0;
            }
            return createfromparcel;
        }
        if (i4 == 1) {
            String str = (String) obj3;
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                AnimateXAsStateClock.IconCompatParcelizer(str, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(androidx.compose.ui.Modifier.Companion, 0.0f, 0.0f, 0.0f, Dimensions.setTabContainer, 7), this.read, getpostalcode2, 0, 0);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i4 != 2) {
            ef efVar = (ef) obj;
            Boolean bool = (Boolean) obj2;
            bool.getClass();
            efVar.getClass();
            ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj3).invoke(efVar, bool, Boolean.valueOf(z2));
            return createfromparcel;
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
        getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
        int iIntValue3 = ((Integer) obj2).intValue();
        if ((iIntValue3 & 3) != 2) {
            int i9 = serializer + 41;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
        if (getpostalcode3.write(1 & iIntValue3, z)) {
            int i11 = RemoteActionCompatParcelizer + 13;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (z2) {
                getpostalcode3.serializer(141070473);
                HeaderKt.m5063HeaderbbrV0mI(null, null, null, 0L, 0.0f, null, coil3.ExtrasKt.write(2031606265, new DefaultLazyKey(18, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode3), null, null, getpostalcode3, 1572864, 447);
                getpostalcode3.IconCompatParcelizer(false);
            } else {
                getpostalcode3.serializer(141503884);
                getpostalcode3.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i13 = serializer + 83;
            RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
        return createfromparcel;
    }
}
