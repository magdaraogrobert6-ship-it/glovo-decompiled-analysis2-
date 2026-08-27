package o;

import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.message.BannerMessageKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class containsimpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    public static final void IconCompatParcelizer(measurewNUYSr0 measurewnuysr0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        boolean z2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 23;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(472611653);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(measurewnuysr0);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(measurewnuysr0);
            }
            if (zIconCompatParcelizer) {
                int i7 = RemoteActionCompatParcelizer + 5;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        boolean z3 = true;
        if ((i2 & 19) != 18) {
            int i9 = RemoteActionCompatParcelizer + 11;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            int i11 = serializer + 55;
            int i12 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i12;
            int i13 = i11 % 2;
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                if ((i2 & 8) != 0) {
                    int i14 = i12 + 115;
                    serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        if (getpostalcode2.IconCompatParcelizer(measurewnuysr0)) {
                            z2 = true;
                        }
                    } else {
                        getpostalcode2.IconCompatParcelizer(measurewnuysr0);
                        throw null;
                    }
                }
                z2 = false;
            }
            if ((i2 & 112) != 32) {
                int i15 = serializer + 103;
                RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                z3 = false;
            }
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if ((z2 | z3) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new BridgeManager$trackEvent$2(measurewnuysr0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (ShortNewsContentCardView) null, 15);
                getpostalcode2.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, measurewnuysr0, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            if (measurewnuysr0 == null) {
                getpostalcode2.serializer(671297779);
                getpostalcode2.IconCompatParcelizer(false);
                getpostalcode = getpostalcode2;
            } else {
                getpostalcode2.serializer(671297780);
                getpostalcode = getpostalcode2;
                BannerMessageKt.m5059BannerMessageError1xFH4wI(androidx.compose.foundation.layout.PaddingKt.RemoteActionCompatParcelizer(androidx.compose.ui.Modifier.Companion, Dimensions.getAnimatedVisibility, Dimensions.setPrimaryBackground), null, measurewnuysr0.RemoteActionCompatParcelizer, measurewnuysr0.read, null, null, null, 0L, null, 0L, null, 0L, 0L, getpostalcode, 0, 0, 32742);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(i, 13, measurewnuysr0, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }
}
