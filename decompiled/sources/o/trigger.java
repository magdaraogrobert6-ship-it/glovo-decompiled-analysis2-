package o;

import com.roadrunner.rrds.compose.component.navigations.HeaderKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class trigger implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;

    public /* synthetic */ trigger(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.IconCompatParcelizer = i;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        int i;
        androidx.compose.ui.Modifier modifier;
        boolean z;
        getPushAlert getpushalert;
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        boolean z2 = false;
        switch (i6) {
            case 0:
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if ((iIntValue & 3) != 2) {
                    int i7 = serializer + 33;
                    RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    z2 = true;
                }
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (!getpostalcode.write(iIntValue & 1, z2)) {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, null, false, null, getpostalcode, 0, 28);
                }
                break;
            case 1:
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                if (!getpostalcode2.write(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    HeaderKt.m5063HeaderbbrV0mI(androidx.compose.foundation.layout.AspectRatioKt.read(androidx.compose.ui.Modifier.Companion), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.customer_chats_title, getpostalcode2, 0), null, 0L, 0.0f, coil3.ExtrasKt.write(-890944481, new trigger(i4, this.read), getpostalcode2), null, null, null, getpostalcode2, 196608, 476);
                }
                break;
            case 2:
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if ((iIntValue3 & 3) != 2) {
                    int i9 = RemoteActionCompatParcelizer + 91;
                    serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    z2 = true;
                }
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                if (!getpostalcode3.write(iIntValue3 & 1, z2)) {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                    companion.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, companion, false, null, getpostalcode3, 384, 24);
                }
                break;
            case 3:
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
                if (!getpostalcode4.write(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, null, false, null, getpostalcode4, 0, 28);
                }
                break;
            case 4:
                getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull5;
                if (!getpostalcode5.write(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, null, false, null, getpostalcode5, 0, 28);
                }
                break;
            case 5:
                getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull6;
                if (!getpostalcode6.write(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    int i11 = serializer + 61;
                    RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.read;
                        i = com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left;
                        modifier = null;
                        z = false;
                        getpushalert = null;
                        i2 = 0;
                        i3 = 101;
                    } else {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.read;
                        i = com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left;
                        modifier = null;
                        z = false;
                        getpushalert = null;
                        i2 = 0;
                        i3 = 28;
                    }
                    HeaderKt.read(i, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z, getpushalert, getpostalcode6, i2, i3);
                }
                break;
            case 6:
                getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull7;
                if (!getpostalcode7.write(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, null, false, null, getpostalcode7, 0, 28);
                }
                break;
            case 7:
                getBirthDateFull getbirthdatefull8 = (getBirthDateFull) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if ((iIntValue8 & 3) != 2) {
                    int i12 = RemoteActionCompatParcelizer + 63;
                    serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    z2 = true;
                }
                getPostalCode getpostalcode8 = (getPostalCode) getbirthdatefull8;
                if (!getpostalcode8.write(iIntValue8 & 1, z2)) {
                    getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    int i14 = RemoteActionCompatParcelizer + 65;
                    serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, null, false, null, getpostalcode8, 0, 28);
                }
                break;
            case 8:
                getBirthDateFull getbirthdatefull9 = (getBirthDateFull) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if ((iIntValue9 & 3) != 2) {
                    int i16 = RemoteActionCompatParcelizer + 15;
                    serializer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    z2 = true;
                }
                getPostalCode getpostalcode9 = (getPostalCode) getbirthdatefull9;
                if (!getpostalcode9.write(iIntValue9 & 1, z2)) {
                    getpostalcode9.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, null, false, null, getpostalcode9, 0, 28);
                }
                break;
            case 9:
                getBirthDateFull getbirthdatefull10 = (getBirthDateFull) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode10 = (getPostalCode) getbirthdatefull10;
                if (!getpostalcode10.write(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    getpostalcode10.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.Companion;
                    companion2.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_cancel_thin, this.read, companion2, false, null, getpostalcode10, 384, 24);
                }
                break;
            case 10:
                getBirthDateFull getbirthdatefull11 = (getBirthDateFull) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode11 = (getPostalCode) getbirthdatefull11;
                if (!getpostalcode11.write(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    getpostalcode11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, null, false, null, getpostalcode11, 0, 28);
                }
                break;
            case 11:
                getBirthDateFull getbirthdatefull12 = (getBirthDateFull) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode12 = (getPostalCode) getbirthdatefull12;
                if (!getpostalcode12.write(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    getpostalcode12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    int i18 = serializer + 91;
                    RemoteActionCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.Companion;
                    companion3.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, companion3, false, null, getpostalcode12, 384, 24);
                }
                break;
            case 12:
                getBirthDateFull getbirthdatefull13 = (getBirthDateFull) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode13 = (getPostalCode) getbirthdatefull13;
                if (!getpostalcode13.write(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    getpostalcode13.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, null, false, null, getpostalcode13, 0, 28);
                }
                break;
            case 13:
                getBirthDateFull getbirthdatefull14 = (getBirthDateFull) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode14 = (getPostalCode) getbirthdatefull14;
                if (!getpostalcode14.write(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    getpostalcode14.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.Companion;
                    companion4.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, companion4, false, null, getpostalcode14, 384, 24);
                }
                break;
            case 14:
                getBirthDateFull getbirthdatefull15 = (getBirthDateFull) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode15 = (getPostalCode) getbirthdatefull15;
                if (!getpostalcode15.write(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    getpostalcode15.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, null, false, null, getpostalcode15, 0, 28);
                }
                break;
            case 15:
                getBirthDateFull getbirthdatefull16 = (getBirthDateFull) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode16 = (getPostalCode) getbirthdatefull16;
                if (!getpostalcode16.write(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    getpostalcode16.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, null, false, null, getpostalcode16, 0, 28);
                }
                break;
            case 16:
                getBirthDateFull getbirthdatefull17 = (getBirthDateFull) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode17 = (getPostalCode) getbirthdatefull17;
                if (!getpostalcode17.write(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    getpostalcode17.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, null, false, null, getpostalcode17, 0, 28);
                }
                break;
            case 17:
                getBirthDateFull getbirthdatefull18 = (getBirthDateFull) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if ((iIntValue18 & 3) != 2) {
                    int i20 = RemoteActionCompatParcelizer + 97;
                    serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i20 % 2 != 0) {
                        z2 = true;
                    }
                }
                getPostalCode getpostalcode18 = (getPostalCode) getbirthdatefull18;
                if (!getpostalcode18.write(iIntValue18 & 1, z2)) {
                    getpostalcode18.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, null, false, null, getpostalcode18, 0, 28);
                }
                break;
            case 18:
                getBirthDateFull getbirthdatefull19 = (getBirthDateFull) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if ((iIntValue19 & 3) != 2) {
                    int i21 = serializer + 99;
                    RemoteActionCompatParcelizer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i21 % 2 == 0) {
                        z2 = true;
                    }
                }
                getPostalCode getpostalcode19 = (getPostalCode) getbirthdatefull19;
                if (getpostalcode19.write(iIntValue19 & 1, z2)) {
                    int i22 = serializer + 119;
                    RemoteActionCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    androidx.compose.ui.Modifier.Companion companion5 = androidx.compose.ui.Modifier.Companion;
                    companion5.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, companion5, false, null, getpostalcode19, 384, 24);
                } else {
                    getpostalcode19.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                break;
            case 19:
                getBirthDateFull getbirthdatefull20 = (getBirthDateFull) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode20 = (getPostalCode) getbirthdatefull20;
                if (getpostalcode20.write(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    androidx.compose.ui.Modifier.Companion companion6 = androidx.compose.ui.Modifier.Companion;
                    companion6.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, companion6, false, null, getpostalcode20, 384, 24);
                } else {
                    getpostalcode20.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                break;
            case 20:
                getBirthDateFull getbirthdatefull21 = (getBirthDateFull) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode21 = (getPostalCode) getbirthdatefull21;
                if (!getpostalcode21.write(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    getpostalcode21.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    androidx.compose.ui.Modifier.Companion companion7 = androidx.compose.ui.Modifier.Companion;
                    companion7.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, companion7, false, null, getpostalcode21, 384, 24);
                }
                break;
            case 21:
                getBirthDateFull getbirthdatefull22 = (getBirthDateFull) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode22 = (getPostalCode) getbirthdatefull22;
                if (!getpostalcode22.write(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    getpostalcode22.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, this.read, null, false, null, getpostalcode22, 0, 28);
                }
                break;
            default:
                getBirthDateFull getbirthdatefull23 = (getBirthDateFull) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode23 = (getPostalCode) getbirthdatefull23;
                if (!getpostalcode23.write(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    getpostalcode23.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    androidx.compose.ui.Modifier.Companion companion8 = androidx.compose.ui.Modifier.Companion;
                    companion8.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_cancel_thin, this.read, companion8, false, null, getpostalcode23, 384, 24);
                }
                break;
        }
        return createfromparcel;
    }
}
