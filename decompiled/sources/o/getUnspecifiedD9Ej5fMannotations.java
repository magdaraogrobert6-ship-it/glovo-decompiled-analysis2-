package o;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1;
import com.roadrunner.login.presentation.signin.SignInViewModel$onSignInClicked$1;
import com.roadrunner.rrds.compose.component.message.SnackbarKt$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getUnspecifiedD9Ej5fMannotations {
    private static int IconCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:85:0x0154  */
    /* JADX WARN: Code duplicated, block: B:99:0x019d  */
    public static final void IconCompatParcelizer(final int i, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final boolean z, final androidx.compose.ui.Modifier modifier, final boolean z2, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getBirthDateFull getbirthdatefull, final int i2) {
        int i3;
        getPostalCode getpostalcode;
        androidx.compose.animation.core.Animatable animatable;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = read + 113;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1408856944);
        if ((i2 & 6) == 0) {
            if (getpostalcode2.read(i)) {
                int i10 = read + 87;
                IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            int i12 = read + 65;
            IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i14 = read + 125;
                IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i5 = i14 % 2 == 0 ? 2 : 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode2.write(z)) {
                int i15 = IconCompatParcelizer + 31;
                read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i4 = i15 % 2 != 0 ? 12457 : androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i4 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        if ((i2 & 3072) == 0) {
            int i16 = IconCompatParcelizer + 103;
            read = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i16 % 2 == 0) {
                i3 |= getpostalcode2.read(modifier) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
            } else {
                getpostalcode2.read(modifier);
                throw null;
            }
        }
        if ((i2 & 24576) == 0) {
            i3 |= getpostalcode2.write(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? androidx.compose.ui.graphics.Fields.RenderEffect : 65536;
        }
        int i17 = i3;
        if (getpostalcode2.write(i17 & 1, (74899 & i17) != 74898)) {
            int i18 = IconCompatParcelizer + 23;
            read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i18 % 2 == 0) {
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = mainAxisk4lQ0M.write(0.0f);
                    getpostalcode2.write(objComponentActivity);
                }
                androidx.compose.animation.core.Animatable animatable2 = (androidx.compose.animation.core.Animatable) objComponentActivity;
                Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    int i19 = read + 117;
                    IconCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    objComponentActivity2 = mainAxisk4lQ0M.write(0.0f);
                    getpostalcode2.write(objComponentActivity2);
                }
                androidx.compose.animation.core.Animatable animatable3 = (androidx.compose.animation.core.Animatable) objComponentActivity2;
                Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = androidx.compose.runtime.CompositionKt.read(i);
                    getpostalcode2.write(objComponentActivity3);
                }
                getPlatformAndroidManager getplatformandroidmanager = (getPlatformAndroidManager) objComponentActivity3;
                int i21 = i17 & 57344;
                boolean z3 = i21 == 16384;
                boolean z4 = (i17 & 14) == 4;
                Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                if (!(z3 | z4)) {
                    int i22 = read + 91;
                    IconCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    if (objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new TextFieldSelectionManager$copy$1(z2, i, getplatformandroidmanager, (ShortNewsContentCardView) null);
                        getpostalcode2.write(objComponentActivity4);
                    }
                } else {
                    objComponentActivity4 = new TextFieldSelectionManager$copy$1(z2, i, getplatformandroidmanager, (ShortNewsContentCardView) null);
                    getpostalcode2.write(objComponentActivity4);
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, Boolean.valueOf(z2), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4);
                boolean z5 = !(i21 != 16384);
                boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(animatable2);
                boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(animatable3);
                boolean z6 = (458752 & i17) == 131072;
                Object objComponentActivity5 = getpostalcode2.ComponentActivity();
                if (z5 | zIconCompatParcelizer | zIconCompatParcelizer2 | z6) {
                    animatable = animatable2;
                    objComponentActivity5 = new SignInViewModel$onSignInClicked$1(z2, animatable, animatable3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null);
                    getpostalcode2.write(objComponentActivity5);
                } else {
                    int i24 = IconCompatParcelizer + 73;
                    read = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i25 = i24 % 2;
                    if (objComponentActivity5 == androidContentCaptureManager) {
                        animatable = animatable2;
                        objComponentActivity5 = new SignInViewModel$onSignInClicked$1(z2, animatable, animatable3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null);
                        getpostalcode2.write(objComponentActivity5);
                    } else {
                        animatable = animatable2;
                    }
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, Boolean.valueOf(z2), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity5);
                getTopLeftannotations gettopleftannotations = androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer;
                long dropDownBackgroundResource = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setDropDownBackgroundResource();
                float fFloatValue = ((Number) animatable.write()).floatValue();
                getpostalcode = getpostalcode2;
                androidx.compose.ui.Modifier modifierM890graphicsLayer_6ThJ44$default = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m890graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fFloatValue, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524031, null);
                modifierM890graphicsLayer_6ThJ44$default.getClass();
                androidx.compose.material3.SurfaceKt.m127Surfaceo_FOJdg(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierM890graphicsLayer_6ThJ44$default, z, gettopleftannotations, dropDownBackgroundResource, 0L, 0.0f, 0.0f, null, null, coil3.ExtrasKt.write(572477733, new SnackbarKt$$ExternalSyntheticLambda2(animatable3, 7, getplatformandroidmanager), getpostalcode), getpostalcode, ((i17 >> 3) & 14) | (i17 & 896), 992);
            } else {
                getpostalcode2.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.DpSizeYgX7TsA
                private static int MediaBrowserCompatMediaItem = 0;
                private static int MediaDescriptionCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i26 = 2 % 2;
                    int i27 = MediaBrowserCompatMediaItem + 3;
                    MediaDescriptionCompat = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i28 = i27 % 2;
                    ((Integer) obj3).getClass();
                    getUnspecifiedD9Ej5fMannotations.IconCompatParcelizer(i, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z, modifier, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i29 = MediaBrowserCompatMediaItem + 85;
                    MediaDescriptionCompat = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i29 % 2 != 0) {
                        return createfromparcel;
                    }
                    throw null;
                }
            };
        }
    }
}
