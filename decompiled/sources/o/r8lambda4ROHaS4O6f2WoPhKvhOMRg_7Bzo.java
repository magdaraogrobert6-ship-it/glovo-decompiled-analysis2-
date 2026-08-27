package o;

import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.BadgeKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo {
    private static int IconCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    public static final void RemoteActionCompatParcelizer(final int i, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final androidx.compose.ui.Modifier modifier, boolean z, r8lambdatP2n_F9e4k2NvYif5gW5fjCaNlM r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm, getBirthDateFull getbirthdatefull, final int i2, final int i3) {
        int i4;
        final boolean z2;
        r8lambdatP2n_F9e4k2NvYif5gW5fjCaNlM r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm2;
        int i5;
        int i6;
        int i7;
        r8lambdatP2n_F9e4k2NvYif5gW5fjCaNlM r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm3 = r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm;
        int i8 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1081340398);
        final boolean z3 = true;
        if ((i2 & 6) == 0) {
            int i9 = write + 3;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (!(!getpostalcode.read(i))) {
                int i11 = write + 59;
                IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i7 = 4;
            } else {
                i7 = 2;
            }
            i4 = i7 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i13 = write + 75;
            IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            int i15 = write + 19;
            IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                getpostalcode.read(modifier);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (getpostalcode.read(modifier)) {
                int i16 = write + 27;
                IconCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i6 = androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i6 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i4 |= i6;
        }
        int i18 = i4 | 3072;
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                int i19 = IconCompatParcelizer + 19;
                write = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i19 % 2 != 0) {
                    int i20 = 25 / 0;
                    if (getpostalcode.read(r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm3)) {
                        i5 = androidx.compose.ui.graphics.Fields.Clip;
                    } else {
                        i5 = 8192;
                    }
                } else if (getpostalcode.read(r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm3)) {
                    i5 = androidx.compose.ui.graphics.Fields.Clip;
                } else {
                    i5 = 8192;
                }
            } else {
                i5 = 8192;
            }
            i18 |= i5;
        }
        if (getpostalcode.write(i18 & 1, (i18 & 9363) != 9362)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i2 & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                if ((i3 & 16) != 0) {
                    i18 &= -57345;
                }
                z3 = z;
            } else if ((i3 & 16) != 0) {
                r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm3 = new r8lambdatP2n_F9e4k2NvYif5gW5fjCaNlM(false, 0);
                i18 &= -57345;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            final SwitchDefaults switchDefaultsM72PaddingValuesa9UjIt4$default = androidx.compose.foundation.layout.PaddingKt.m72PaddingValuesa9UjIt4$default(11, 0.0f, r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm3.serializer ? Dimensions.getNestedScrollAxes : Dimensions.generateLayoutParams, 0.0f);
            BadgeKt.BadgedBox(((i18 >> 3) & 112) | 390, getpostalcode, coil3.ExtrasKt.write(1624775322, new getDoesBackButtonDismissInAppMessageView(3, r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm3), getpostalcode), coil3.ExtrasKt.write(-2099920168, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.lambdainit1
                private static int MediaSessionCompatQueueItem = 1;
                private static int RemoteActionCompatParcelizer;

                @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    boolean z4;
                    int i21 = 2 % 2;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((IconButtonKt) obj2).getClass();
                    if ((iIntValue & 17) != 16) {
                        int i22 = RemoteActionCompatParcelizer + 7;
                        MediaSessionCompatQueueItem = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i23 = i22 % 2;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(iIntValue & 1, z4)) {
                        androidx.compose.ui.Modifier modifierIconCompatParcelizer = androidx.compose.foundation.layout.PaddingKt.IconCompatParcelizer(androidx.compose.ui.Modifier.Companion, switchDefaultsM72PaddingValuesa9UjIt4$default);
                        float f = Dimensions.setCustomView;
                        equalEnum.IconCompatParcelizer(i, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierIconCompatParcelizer, z3, null, f, f, getpostalcode2, 0, 16);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i24 = MediaSessionCompatQueueItem + 23;
                    RemoteActionCompatParcelizer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i24 % 2 != 0) {
                        int i25 = 1 / 0;
                    }
                    return createfromparcel;
                }
            }, getpostalcode), modifier);
            r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm2 = r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm3;
            z2 = z3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            z2 = z;
            r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm2 = r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm3;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final r8lambdatP2n_F9e4k2NvYif5gW5fjCaNlM r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm4 = r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm2;
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.lambdainit0
                private static int MediaBrowserCompatMediaItem = 0;
                private static int MediaSessionCompatQueueItem = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i21 = 2 % 2;
                    int i22 = MediaBrowserCompatMediaItem + 45;
                    MediaSessionCompatQueueItem = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    ((Integer) obj3).getClass();
                    r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo.RemoteActionCompatParcelizer(i, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z2, r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm4, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1), i3);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i24 = MediaBrowserCompatMediaItem + 73;
                    MediaSessionCompatQueueItem = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i25 = i24 % 2;
                    return createfromparcel;
                }
            };
        }
    }
}
