package com.roadrunner.rider.state.searchshifts.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rider.state.searchshifts.presentation.timepicker.DualColumnTimePickerKt;
import com.roadrunner.rrds.compose.component.message.SnackbarKt$$ExternalSyntheticLambda2;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ReferrerDetails;
import o.TextFieldDefaults;
import o.Util3;
import o.accessisMainThread;
import o.b3;
import o.buildMapping;
import o.configConnectionForGET;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getEventType;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getPostalCode;
import o.getSessionParameters;
import o.handleUrlOverridelambda1;
import o.hasAllLocationsBeenRead;
import o.isValidParameter;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambda_tXAIUmnouctwjnyJ7UHKV8SfQ;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.supportingTextPaddinga9UjIt4material3default;
import o.t3;
import o.toAndroidDragEvent;
import o.ua;
import o.xb;
import o.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SearchShiftsSelectedZoneKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:60:0x00db  */
    public static final void RemoteActionCompatParcelizer(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str, String str2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1280481958);
        if ((i & 6) == 0) {
            if (getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk)) {
                int i7 = read + 107;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= !getpostalcode.read(str2) ? Fields.SpotShadowColor : Fields.RotationX;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                int i9 = read + 31;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                i4 = i9 % 2 == 0 ? 27500 : 2048;
            } else {
                int i10 = read + 67;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i4 = Fields.RotationZ;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.read(modifier)) {
                int i12 = read + 49;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            int i14 = read + 39;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            if ((i2 & 14) == 4) {
                int i16 = IconCompatParcelizer + 23;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2) {
                objComponentActivity = new ReferrerDetails(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str, str2);
                getpostalcode.write(objComponentActivity);
                int i18 = IconCompatParcelizer + 111;
                read = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
            } else {
                int i20 = read + 93;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                if (i20 % 2 == 0) {
                    throw null;
                }
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new ReferrerDetails(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str, str2);
                    getpostalcode.write(objComponentActivity);
                    int i110 = IconCompatParcelizer + 111;
                    read = i110 % Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                }
            }
            ReferrerDetails referrerDetails = (ReferrerDetails) objComponentActivity;
            boolean z3 = (i2 & 7168) == 2048;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new toAndroidDragEvent(4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                getpostalcode.write(objComponentActivity2);
            }
            DualColumnTimePickerKt.DualColumnTimePicker(referrerDetails, modifier, null, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2, getpostalcode, (i2 >> 9) & 112, 4);
            int i21 = IconCompatParcelizer + 7;
            read = i21 % Fields.SpotShadowColor;
            int i22 = i21 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str, str2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, i, 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01d1  */
    public static final void PromoRow(hasAllLocationsBeenRead hasalllocationsbeenread, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        boolean z2 = hasalllocationsbeenread.write;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1729458268);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode2.read(hasalllocationsbeenread) : getpostalcode2.IconCompatParcelizer(hasalllocationsbeenread)) {
                int i6 = read + 105;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 2 / 3;
                }
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = read + 107;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                int i10 = read + 73;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                i3 = i10 % 2 == 0 ? 65 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i11 = i2 | 24576;
        if (getpostalcode2.write(i11 & 1, (i11 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode2.ComponentActivity) {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                getpostalcode2.serializer(constructor);
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            if (z2) {
                getpostalcode2.serializer(-1632408781);
                t3 t3Var = hasalllocationsbeenread.IconCompatParcelizer;
                if (t3Var == null) {
                    getpostalcode2.serializer(934935342);
                    z = false;
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(934935343);
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(t3.write(t3Var), getpostalcode2, Integer.valueOf(i11 & 112));
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion, Dimensions.setSplitBackground)});
                    z = false;
                    getpostalcode2.IconCompatParcelizer(false);
                }
                getpostalcode2.IconCompatParcelizer(z);
            } else {
                z = false;
                getpostalcode2.serializer(935078842);
                getpostalcode2.IconCompatParcelizer(false);
            }
            int i12 = read + 125;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            TextKt.m131TextNvy7gAk(hasalllocationsbeenread.RatingCompat, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode2, 0, 0, 131066);
            if (z2) {
                int i14 = IconCompatParcelizer + 125;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                if (hasalllocationsbeenread.serializer.equals(Boolean.TRUE)) {
                    int i16 = read + 45;
                    IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    getpostalcode = getpostalcode2;
                    getpostalcode.serializer(935298725);
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, Integer.valueOf(((i11 >> 9) & 14) | ((i11 >> 3) & 112)));
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode = getpostalcode2;
                    getpostalcode.serializer(935349658);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(935349658);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i18 = IconCompatParcelizer + 25;
            read = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(hasalllocationsbeenread, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Code duplicated, block: B:12:0x004d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[PHI: r0 r1
  0x0059: PHI (r0v92 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v94 o.getPostalCode) binds: [B:8:0x0042, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r1v70 o.getAddressCountry) = (r1v2 o.getAddressCountry), (r1v71 o.getAddressCountry) binds: [B:8:0x0042, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0044 A[PHI: r0 r1
  0x0044: PHI (r0v6 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v94 o.getPostalCode) binds: [B:8:0x0042, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r1v3 o.getAddressCountry) = (r1v2 o.getAddressCountry), (r1v71 o.getAddressCountry) binds: [B:8:0x0042, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v63 */
    public static final void SearchShiftsSelectedZone(hasAllLocationsBeenRead hasalllocationsbeenread, xb xbVar, accessisMainThread accessismainthread, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, int i, getBirthDateFull getbirthdatefull, int i2) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        boolean zIconCompatParcelizer;
        int i3;
        int i4;
        getPostalCode getpostalcode2;
        boolean z;
        boolean z2;
        Modifier.Companion companion;
        int i5;
        float f;
        Modifier modifier2;
        boolean z3;
        getPostalCode getpostalcode3;
        int i6 = 2 % 2;
        int i7 = read + 71;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(924519941);
            getaddresscountry = getpostalcode.read;
            if ((i2 & 42) == 0) {
                if ((i2 & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(hasalllocationsbeenread);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(hasalllocationsbeenread);
                }
                if (zIconCompatParcelizer) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i2;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i4 = i2;
            }
        } else {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(924519941);
            getaddresscountry = getpostalcode.read;
            if ((i2 & 6) == 0) {
                if ((i2 & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(hasalllocationsbeenread);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(hasalllocationsbeenread);
                }
                if (zIconCompatParcelizer) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i2;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i4 = i2;
            }
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(xbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(accessismainthread) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        Object obj = null;
        if ((i2 & 3072) == 0) {
            int i8 = read + 37;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                throw null;
            }
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            int i9 = read + 117;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.Clip : 8192;
        }
        int i11 = 196608 | i4;
        if ((1572864 & i2) == 0) {
            i11 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i2) == 0) {
            int i12 = IconCompatParcelizer + 1;
            read = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                getpostalcode2.read(i);
                obj.hashCode();
                throw null;
            }
            i11 |= getpostalcode2.read(i) ? 8388608 : 4194304;
        }
        int i13 = i11;
        if ((4793491 & i13) != 4793490) {
            int i14 = read + 15;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode2.write(i13 & 1, z)) {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            getpostalcode3 = getpostalcode2;
            modifier2 = modifier;
        } else {
            Modifier.Companion companion2 = Modifier.Companion;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            Object obj2 = getCreditCardExpirationMonth.write;
            if (objComponentActivity == obj2) {
                objComponentActivity = y0.read;
                getpostalcode2.write(objComponentActivity);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == obj2) {
                int i16 = IconCompatParcelizer + 5;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                objComponentActivity2 = ua.IconCompatParcelizer;
                getpostalcode2.write(objComponentActivity2);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity2;
            Modifier modifierWrite = SizeKt.write(companion2, 1.0f);
            float f2 = Dimensions.setTabContainer;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierWrite, Dimensions.getAnimatedVisibility, f2);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion3 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion3.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion4.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion3.getStart(), getpostalcode2, 0);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, companion2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            String str = hasalllocationsbeenread.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
            getNewPassword getnewpassword = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write(getnewpassword)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 0, 0, 131066);
            String str2 = hasalllocationsbeenread.PlaybackStateCompatCustomAction;
            if (str2 == null) {
                int i18 = read + 83;
                IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                getpostalcode2.serializer(558331069);
                z2 = false;
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                z2 = false;
                getpostalcode2.serializer(558331070);
                TextWithIconKt.TextWithFlagIconStart(0, getpostalcode2, null, str2);
                getpostalcode2.IconCompatParcelizer(false);
            }
            int i20 = read + 35;
            IconCompatParcelizer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            getpostalcode2.IconCompatParcelizer(true);
            float f3 = Dimensions.setSplitBackground;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion2, f3)});
            boolean z4 = (i13 & 7168) == 2048 ? true : z2;
            int i22 = i13 & 14;
            boolean z5 = (i22 == 4 || ((i13 & 8) != 0 && getpostalcode2.IconCompatParcelizer(hasalllocationsbeenread))) ? true : z2;
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if ((z4 | z5) || objComponentActivity3 == obj2) {
                objComponentActivity3 = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 3, hasalllocationsbeenread);
                getpostalcode2.write(objComponentActivity3);
            }
            getPostalCode getpostalcode4 = getpostalcode2;
            PromoRow(hasalllocationsbeenread, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, null, getpostalcode2, i22 | 432);
            if (hasalllocationsbeenread.MediaSessionCompatResultReceiverWrapper) {
                int i23 = IconCompatParcelizer + 87;
                read = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                getpostalcode4.serializer(1530607971);
                companion = companion2;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode4, SizeKt.m83size3ABfNKs(companion, f3)});
                TextKt.m131TextNvy7gAk(hasalllocationsbeenread.MediaSessionCompatQueueItem, null, ((buildMapping) getpostalcode4.write(getnewpassword)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode4, 0, 0, 131066);
                i5 = 0;
                getpostalcode4.IconCompatParcelizer(false);
            } else {
                companion = companion2;
                i5 = 0;
                getpostalcode4.serializer(1530838611);
                getpostalcode4.IconCompatParcelizer(false);
            }
            if (hasalllocationsbeenread.ParcelableVolumeInfo) {
                getpostalcode4.serializer(1530944290);
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = hasalllocationsbeenread.MediaBrowserCompatMediaItem;
                if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk != null) {
                    getpostalcode4.serializer(1531043924);
                    Object[] objArr = new Object[i5];
                    Object objComponentActivity4 = getpostalcode4.ComponentActivity();
                    if (objComponentActivity4 == obj2) {
                        objComponentActivity4 = new getSessionParameters(24);
                        getpostalcode4.write(objComponentActivity4);
                    }
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) getEventType.IconCompatParcelizer(objArr, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, getpostalcode4, 48);
                    Object[] objArr2 = new Object[i5];
                    Object objComponentActivity5 = getpostalcode4.ComponentActivity();
                    if (objComponentActivity5 == obj2) {
                        objComponentActivity5 = new getSessionParameters(25);
                        getpostalcode4.write(objComponentActivity5);
                    }
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) getEventType.IconCompatParcelizer(objArr2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, getpostalcode4, 48);
                    String str3 = (String) populateViewStructure_androidKtpopulate7.getValue();
                    String str4 = (String) populateViewStructure_androidKtpopulate8.getValue();
                    boolean z6 = getpostalcode4.read(populateViewStructure_androidKtpopulate7);
                    boolean z7 = getpostalcode4.read(populateViewStructure_androidKtpopulate8);
                    Object objComponentActivity6 = getpostalcode4.ComponentActivity();
                    if ((z6 | z7) || objComponentActivity6 == obj2) {
                        objComponentActivity6 = new SnackbarKt$$ExternalSyntheticLambda2(populateViewStructure_androidKtpopulate7, 12, populateViewStructure_androidKtpopulate8);
                        getpostalcode4.write(objComponentActivity6);
                    }
                    f = 1.0f;
                    RemoteActionCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str3, str4, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity6, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion, 1.0f), 0.0f, f2, 0.0f, 0.0f, 13), getpostalcode4, 0);
                    getpostalcode4.RemoteActionCompatParcelizer(465057063, Integer.valueOf(i));
                    configConnectionForGET configconnectionforget = new configConnectionForGET(hasalllocationsbeenread.MediaDescriptionCompat, i5);
                    boolean z8 = getpostalcode4.read(populateViewStructure_androidKtpopulate7);
                    boolean z9 = getpostalcode4.read(populateViewStructure_androidKtpopulate8);
                    boolean z10 = (i13 & 3670016) == 1048576;
                    Object objComponentActivity7 = getpostalcode4.ComponentActivity();
                    if ((z10 | z8 | z9) || objComponentActivity7 == obj2) {
                        objComponentActivity7 = new b3(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, populateViewStructure_androidKtpopulate7, populateViewStructure_androidKtpopulate8, 9);
                        getpostalcode4.write(objComponentActivity7);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
                    Object objComponentActivity8 = getpostalcode4.ComponentActivity();
                    if (objComponentActivity8 == obj2) {
                        objComponentActivity8 = new b8$$ExternalSyntheticLambda4(1);
                        getpostalcode4.write(objComponentActivity8);
                    }
                    Util3.serializer(configconnectionforget, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity8, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion, 1.0f), 0.0f, f2, 0.0f, 0.0f, 13), getpostalcode4, 384);
                    z3 = 0;
                    getpostalcode4.IconCompatParcelizer(false);
                    getpostalcode4.IconCompatParcelizer(false);
                } else {
                    f = 1.0f;
                    getpostalcode4.serializer(1532765075);
                    getpostalcode4.IconCompatParcelizer((boolean) i5);
                    z3 = i5;
                }
                getpostalcode4.IconCompatParcelizer(z3);
            } else {
                f = 1.0f;
                getpostalcode4.serializer(1532774995);
                getpostalcode4.IconCompatParcelizer((boolean) i5);
            }
            if (hasalllocationsbeenread.PlaybackStateCompat) {
                getpostalcode4.serializer(1532836561);
                String str5 = hasalllocationsbeenread.RemoteActionCompatParcelizer;
                boolean z11 = (i13 & 57344) == 16384;
                int i25 = read + 57;
                IconCompatParcelizer = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                boolean z12 = i22 == 4 || ((i13 & 8) != 0 && getpostalcode4.IconCompatParcelizer(hasalllocationsbeenread));
                Object objComponentActivity9 = getpostalcode4.ComponentActivity();
                if ((z12 | z11) || objComponentActivity9 == obj2) {
                    objComponentActivity9 = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 4, hasalllocationsbeenread);
                    getpostalcode4.write(objComponentActivity9);
                }
                isValidParameter.RemoteActionCompatParcelizer(str5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity9, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion, f), 0.0f, Dimensions.setTransitioning, 0.0f, 0.0f, 13), false, false, null, null, null, null, getpostalcode4, 0, 1016);
                getpostalcode4.IconCompatParcelizer(false);
            } else {
                getpostalcode4.serializer(1533115251);
                getpostalcode4.IconCompatParcelizer(false);
            }
            getpostalcode4.IconCompatParcelizer(true);
            modifier2 = companion;
            getpostalcode3 = getpostalcode4;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambda_tXAIUmnouctwjnyJ7UHKV8SfQ(hasalllocationsbeenread, xbVar, accessismainthread, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, i, i2);
        }
    }
}
