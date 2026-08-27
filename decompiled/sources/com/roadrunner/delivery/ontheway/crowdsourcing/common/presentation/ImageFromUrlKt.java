package com.roadrunner.delivery.ontheway.crowdsourcing.common.presentation;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Loading;
import coil3.compose.AsyncImagePainter$State$Success;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.PathEffect;
import o.PopulateViewStructure_androidKtpopulate7;
import o.RectList;
import o.ShaderKt;
import o.buildMapping;
import o.computeDirection;
import o.dashPathEffectdefault;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setTransformQ8lPUPs;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImageFromUrlKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e A[PHI: r0
  0x005e: PHI (r0v13 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v15 o.getPostalCode) binds: [B:8:0x0044, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x016c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0046 A[PHI: r0
  0x0046: PHI (r0v6 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v15 o.getPostalCode) binds: [B:8:0x0044, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void serializer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = read + 87;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            str.getClass();
            str2.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(20237229);
            if ((i & 78) == 0) {
                if (getpostalcode.read(str)) {
                    i4 = RemoteActionCompatParcelizer + 107;
                    read = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            str.getClass();
            str2.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(20237229);
            if ((i & 6) == 0) {
                if (getpostalcode.read(str)) {
                    i4 = RemoteActionCompatParcelizer + 107;
                    read = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i10 = RemoteActionCompatParcelizer + 51;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 9 / 0;
                if (getpostalcode.read(str2)) {
                    i7 = 32;
                } else {
                    i7 = 16;
                }
            } else if (getpostalcode.read(str2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i & 384) == 0) {
            int i12 = RemoteActionCompatParcelizer + 113;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i14 = RemoteActionCompatParcelizer + 87;
                read = i14 % Fields.SpotShadowColor;
                i6 = i14 % 2 == 0 ? 26276 : 256;
            } else {
                i6 = Fields.SpotShadowColor;
            }
            i3 |= i6;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 2048 : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.read(modifier)) {
                int i15 = RemoteActionCompatParcelizer + 57;
                read = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i5 = Fields.Clip;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((i3 & 9363) != 9362) {
            int i17 = read + 15;
            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
            settransformq8lpups.IconCompatParcelizer = str;
            settransformq8lpups.MediaSessionCompatResultReceiverWrapper = str2;
            settransformq8lpups.write = str2;
            ShaderKt shaderKtIconCompatParcelizer = settransformq8lpups.IconCompatParcelizer();
            ContentScale.Companion companion = ContentScale.Companion;
            AsyncImagePainter asyncImagePainterRemoteActionCompatParcelizer = computeDirection.RemoteActionCompatParcelizer(shaderKtIconCompatParcelizer, null, companion.getCrop(), getpostalcode, 3072, 22);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(asyncImagePainterRemoteActionCompatParcelizer.ResultReceiver, getpostalcode, 0);
            dashPathEffectdefault dashpatheffectdefault = (dashPathEffectdefault) populateViewStructure_androidKtpopulate7Write.getValue();
            boolean z2 = getpostalcode.read(populateViewStructure_androidKtpopulate7Write);
            boolean z3 = (i3 & 896) == 256;
            boolean z4 = (i3 & 7168) == 2048;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (!(z3 | z2) && !z4) {
                int i18 = RemoteActionCompatParcelizer + 77;
                read = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    SignInDataStore$set$2 signInDataStore$set$2 = new SignInDataStore$set$2(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, populateViewStructure_androidKtpopulate7Write, null, 24);
                    getpostalcode.write(signInDataStore$set$2);
                    objComponentActivity = signInDataStore$set$2;
                }
            } else {
                SignInDataStore$set$2 signInDataStore$set$3 = new SignInDataStore$set$2(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, populateViewStructure_androidKtpopulate7Write, null, 24);
                getpostalcode.write(signInDataStore$set$3);
                objComponentActivity = signInDataStore$set$3;
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, dashpatheffectdefault, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            dashPathEffectdefault dashpatheffectdefault2 = (dashPathEffectdefault) populateViewStructure_androidKtpopulate7Write.getValue();
            if (dashpatheffectdefault2 instanceof AsyncImagePainter$State$Success) {
                getpostalcode.serializer(1592651536);
                ImageKt.Image(asyncImagePainterRemoteActionCompatParcelizer, null, modifier, null, companion.getCrop(), 0.0f, null, getpostalcode, ((i3 >> 6) & 896) | 24624, 104);
                getpostalcode.IconCompatParcelizer(false);
            } else if ((dashpatheffectdefault2 instanceof AsyncImagePainter$State$Loading) || (dashpatheffectdefault2 instanceof PathEffect)) {
                getpostalcode.serializer(-2026826031);
                ImageLoadingKt.ImageLoading(BackgroundKt.m20backgroundbw27NRU(Modifier.Companion.then(SizeKt.read), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowIcon(), RectangleShapeKt.getRectangleShape()), getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(dashpatheffectdefault2 instanceof AsyncImagePainter$State$Error)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -2026835559, false);
                }
                getpostalcode.serializer(-2026820282);
                Modifier.Companion companion2 = Modifier.Companion;
                ImageLoadingKt.ImageError(BackgroundKt.m20backgroundbw27NRU(companion2.then(SizeKt.read), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowIcon(), RectangleShapeKt.getRectangleShape()), SizeKt.m83size3ABfNKs(companion2, Dimensions.setLogo), getpostalcode, 0, 0);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i20 = read + 53;
            RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new RectList(i, str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, 1);
        }
        int i22 = read + 41;
        RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
        int i23 = i22 % 2;
    }
}
