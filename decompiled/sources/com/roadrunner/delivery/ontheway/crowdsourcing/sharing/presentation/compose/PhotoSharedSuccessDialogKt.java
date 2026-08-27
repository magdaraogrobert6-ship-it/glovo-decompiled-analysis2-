package com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.ColorModel;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.StrokeJoinCompanion;
import o.accessgetXyzcp;
import o.buildMapping;
import o.disposeui_tooling;
import o.getBirthDateFull;
import o.getCmykxdoWZVw;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLayers;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.getVonKries;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw;
import o.r8lambdatZCIhOZ7wAy4U965kw0Q8vORJT8;
import o.setCursorui_text;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PhotoSharedSuccessDialogKt {
    public static final float IconCompatParcelizer;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final getTopLeftannotations read;
    private static int serializer = 1;
    private static int write;

    static {
        float f = Dimensions.read;
        read = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.getAnimatedVisibility);
        IconCompatParcelizer = Dp.m3673constructorimpl(160.0f);
        int i = serializer + 67;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final void read(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(343023053);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i5 = MediaBrowserCompatMediaItem + 53;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2) {
            int i7 = write + 59;
            MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 2 % 4;
            }
            z = false;
        } else {
            int i9 = MediaBrowserCompatMediaItem + 25;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            accessgetXyzcp accessgetxyzcpIconCompatParcelizer = RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(R.raw.confetti), getpostalcode2);
            getVonKries getvonkriesWrite = r8lambdatZCIhOZ7wAy4U965kw0Q8vORJT8.write((StrokeJoinCompanion) accessgetxyzcpIconCompatParcelizer.getValue(), 1, getpostalcode2, 958);
            StrokeJoinCompanion strokeJoinCompanion = (StrokeJoinCompanion) accessgetxyzcpIconCompatParcelizer.getValue();
            boolean z2 = getpostalcode2.read(getvonkriesWrite);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (z2 || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new setCursorui_text(getvonkriesWrite, 1);
                getpostalcode2.write(objComponentActivity);
            }
            getpostalcode = getpostalcode2;
            ColorModel.RemoteActionCompatParcelizer(strokeJoinCompanion, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifier, false, false, false, false, null, false, null, null, false, false, null, null, false, getpostalcode, (i2 << 6) & 896, 0, 131064);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 12);
            int i11 = write + 33;
            MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x011d  */
    public static final void SuccessLottie(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-509821758);
        if ((i & 6) == 0) {
            int i5 = write + 53;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i7 = MediaBrowserCompatMediaItem + 39;
                write = i7 % Fields.SpotShadowColor;
                i3 = i7 % 2 != 0 ? 63 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        boolean z = false;
        if (getpostalcode2.write(i2 & 1, (i2 & 19) != 18)) {
            accessgetXyzcp accessgetxyzcpIconCompatParcelizer = RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(R.raw.success), getpostalcode2);
            getVonKries getvonkriesWrite = r8lambdatZCIhOZ7wAy4U965kw0Q8vORJT8.write((StrokeJoinCompanion) accessgetxyzcpIconCompatParcelizer.getValue(), 1, getpostalcode2, 958);
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(modifier, IconCompatParcelizer);
            StrokeJoinCompanion strokeJoinCompanion = (StrokeJoinCompanion) accessgetxyzcpIconCompatParcelizer.getValue();
            boolean z2 = getpostalcode2.read(getvonkriesWrite);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (!z2) {
                int i8 = write + 123;
                MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 44 / 0;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new setCursorui_text(getvonkriesWrite, 2);
                        getpostalcode2.write(objComponentActivity);
                    }
                } else if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new setCursorui_text(getvonkriesWrite, 2);
                    getpostalcode2.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new setCursorui_text(getvonkriesWrite, 2);
                getpostalcode2.write(objComponentActivity);
            }
            ColorModel.RemoteActionCompatParcelizer(strokeJoinCompanion, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierM83size3ABfNKs, false, false, false, false, null, false, null, null, false, false, null, null, false, getpostalcode2, 0, 0, 131064);
            Boolean bool = (Boolean) getvonkriesWrite.read.getValue();
            bool.getClass();
            boolean z3 = getpostalcode2.read(accessgetxyzcpIconCompatParcelizer);
            boolean z4 = getpostalcode2.read(getvonkriesWrite);
            if ((i2 & 14) == 4) {
                int i10 = write + 63;
                MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                z = true;
            }
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (!(z3 | z4) && !z) {
                int i12 = write + 27;
                MediaBrowserCompatMediaItem = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    int i14 = MediaBrowserCompatMediaItem + 71;
                    write = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    getpostalcode = getpostalcode2;
                    SignInDataStore$set$2 signInDataStore$set$2 = new SignInDataStore$set$2(getvonkriesWrite, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, accessgetxyzcpIconCompatParcelizer, null, 26);
                    getpostalcode.write(signInDataStore$set$2);
                    objComponentActivity2 = signInDataStore$set$2;
                } else {
                    getpostalcode = getpostalcode2;
                }
            } else {
                int i16 = MediaBrowserCompatMediaItem + 71;
                write = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                getpostalcode = getpostalcode2;
                SignInDataStore$set$2 signInDataStore$set$3 = new SignInDataStore$set$2(getvonkriesWrite, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, accessgetxyzcpIconCompatParcelizer, null, 26);
                getpostalcode.write(signInDataStore$set$3);
                objComponentActivity2 = signInDataStore$set$3;
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, bool, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 9);
        }
    }

    public static final void PhotoSharedSuccessDialog(String str, String str2, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        str.getClass();
        str2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1457479048);
        if ((i & 6) == 0) {
            int i5 = write + 83;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str2)) {
                int i7 = MediaBrowserCompatMediaItem + 81;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            int i9 = write + 57;
            MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= getpostalcode.write(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i11 = MediaBrowserCompatMediaItem + 81;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i12 = i2 | 24576;
        if ((i12 & 9363) != 9362) {
            int i13 = write + 41;
            MediaBrowserCompatMediaItem = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z2 = true;
        } else {
            int i15 = write + 19;
            MediaBrowserCompatMediaItem = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z2 = false;
        }
        if (getpostalcode.write(i12 & 1, z2)) {
            int i17 = MediaBrowserCompatMediaItem + 19;
            write = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            Modifier.Companion companion = Modifier.Companion;
            FillElement fillElement = SizeKt.read;
            Modifier modifierThen = companion.then(fillElement);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            companion.getClass();
            Alignment center = companion2.getCenter();
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
            SurfaceKt.m126SurfaceT9BRK9s(SizeKt.write(PaddingKt.m73paddingVpY3zN4$default(boxScopeInstance.align(companion, center), Dimensions.setMenu, 0.0f, 2), 1.0f), read, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), 0L, 0.0f, Dimensions.getTabContainer, null, ExtrasKt.write(-1227312871, new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, str, str2, 8), getpostalcode), getpostalcode, 12582960, 88);
            if (z) {
                getpostalcode.serializer(390511927);
                modifier2 = companion;
                read(boxScopeInstance.align(modifier2, companion2.getTopCenter()).then(fillElement), getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                modifier2 = companion;
                getpostalcode.serializer(390678180);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i19 = MediaBrowserCompatMediaItem + 91;
            write = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new disposeui_tooling(str, str2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 1);
        }
    }
}
