package com.roadrunner.home.nest.suspendedstate;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.rrds.compose.component.message.BannerMessageKt;
import o.AndroidContentCaptureManager;
import o.PreferenceFragmentDividerDecoration;
import o.PreferenceGroupSavedState;
import o.PreferenceOnPreferenceCopyListener;
import o.enableBridgeSecurity;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.internalPathIteratorPeek;
import o.onAnimation;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setDividerHeight;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SuspendedStateContentKt {
    private static int read = 0;
    private static int serializer = 1;

    public static final void IconCompatParcelizer(PreferenceGroupSavedState preferenceGroupSavedState, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        String str;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5;
        int i6 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-757920581);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(preferenceGroupSavedState);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(preferenceGroupSavedState);
            }
            if (zIconCompatParcelizer) {
                int i7 = read + 47;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
            int i9 = read + 15;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i11 = serializer + 31;
            read = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    int i12 = serializer + 19;
                    read = i12 % Fields.SpotShadowColor;
                    i4 = i12 % 2 != 0 ? 84 : 32;
                } else {
                    i4 = 16;
                }
                i2 |= i4;
            } else {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
        }
        boolean z = true;
        if ((i & 384) == 0) {
            if (!getpostalcode2.read(modifier)) {
                i3 = Fields.SpotShadowColor;
            } else {
                int i13 = serializer + 97;
                read = i13 % Fields.SpotShadowColor;
                i3 = i13 % 2 != 0 ? 9086 : Fields.RotationX;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            int i14 = serializer + 99;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            int i16 = read + 23;
            serializer = i16 % Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                String str2 = preferenceGroupSavedState.serializer;
                String str3 = preferenceGroupSavedState.RemoteActionCompatParcelizer;
                enableBridgeSecurity enablebridgesecurity = enableBridgeSecurity.TERTIARY;
                setDividerHeight setdividerheight = preferenceGroupSavedState.write;
                if (setdividerheight == null || (str = setdividerheight.write) == null) {
                    str = "";
                }
                getpostalcode = getpostalcode2;
                BannerMessageKt.m5059BannerMessageError1xFH4wI(modifier, null, str2, str3, str, enablebridgesecurity, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 0L, null, 0L, null, 0L, 0L, getpostalcode, ((i2 >> 6) & 14) | 12582912 | ((i2 << 21) & 234881024), 0, 32294);
            } else {
                String str4 = preferenceGroupSavedState.serializer;
                String str5 = preferenceGroupSavedState.RemoteActionCompatParcelizer;
                enableBridgeSecurity enablebridgesecurity2 = enableBridgeSecurity.TERTIARY;
                setDividerHeight setdividerheight2 = preferenceGroupSavedState.write;
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 19, preferenceGroupSavedState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d3 A[PHI: r5
  0x00d3: PHI (r5v11 androidx.compose.ui.Modifier) = (r5v10 androidx.compose.ui.Modifier), (r5v13 androidx.compose.ui.Modifier) binds: [B:32:0x00d1, B:29:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00de A[PHI: r5 r7
  0x00de: PHI (r5v12 androidx.compose.ui.Modifier) = (r5v10 androidx.compose.ui.Modifier), (r5v13 androidx.compose.ui.Modifier) binds: [B:32:0x00d1, B:29:0x009a] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r7v8 o.PreferenceOnPreferenceCopyListener) = (r7v7 o.PreferenceOnPreferenceCopyListener), (r7v20 o.PreferenceOnPreferenceCopyListener) binds: [B:32:0x00d1, B:29:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0110 A[PHI: r6 r7
  0x0110: PHI (r6v5 o.PreferenceGroupSavedState) = (r6v4 o.PreferenceGroupSavedState), (r6v9 o.PreferenceGroupSavedState) binds: [B:43:0x010f, B:39:0x00fe] A[DONT_GENERATE, DONT_INLINE]
  0x0110: PHI (r7v10 boolean) = (r7v9 boolean), (r7v16 boolean) binds: [B:43:0x010f, B:39:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0112  */
    /* JADX WARN: Code duplicated, block: B:46:0x0113 A[PHI: r6 r7
  0x0113: PHI (r6v7 o.PreferenceGroupSavedState) = (r6v3 o.PreferenceGroupSavedState), (r6v9 o.PreferenceGroupSavedState) binds: [B:45:0x0112, B:39:0x00fe] A[DONT_GENERATE, DONT_INLINE]
  0x0113: PHI (r7v15 boolean) = (r7v9 boolean), (r7v16 boolean) binds: [B:45:0x0112, B:39:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x011b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0126  */
    /* JADX WARN: Code duplicated, block: B:54:0x012b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0132  */
    /* JADX WARN: Code duplicated, block: B:58:0x0156  */
    public static final void read(onAnimation onanimation, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        PreferenceOnPreferenceCopyListener preferenceOnPreferenceCopyListener;
        int i3;
        PreferenceGroupSavedState preferenceGroupSavedState;
        boolean zIconCompatParcelizer;
        PreferenceGroupSavedState preferenceGroupSavedState2;
        boolean z;
        Object objComponentActivity;
        int i4;
        int i5;
        int i6 = 2 % 2;
        onanimation.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1880373984);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(onanimation)) {
                int i7 = read + 71;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    i5 = 2;
                } else {
                    i5 = 4;
                }
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        int i8 = i2 | 384;
        if (getpostalcode.write(i8 & 1, (i8 & 147) != 146)) {
            int i9 = serializer + 57;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                modifier2 = Modifier.Companion;
                preferenceOnPreferenceCopyListener = (PreferenceOnPreferenceCopyListener) ExtrasKt.write(onanimation.MediaMetadataCompat, getpostalcode, 0).getValue();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{preferenceOnPreferenceCopyListener, PreferenceFragmentDividerDecoration.write}, getCieXyz.write())).booleanValue()) {
                    getpostalcode.serializer(-1141824764);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (preferenceOnPreferenceCopyListener instanceof PreferenceGroupSavedState) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1141827518, false);
                    }
                    i3 = serializer + 39;
                    read = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        getpostalcode.serializer(-1141823401);
                        preferenceGroupSavedState2 = (PreferenceGroupSavedState) preferenceOnPreferenceCopyListener;
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(preferenceOnPreferenceCopyListener);
                        if ((i8 & 109) == 47) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        getpostalcode.serializer(-1141823401);
                        preferenceGroupSavedState = (PreferenceGroupSavedState) preferenceOnPreferenceCopyListener;
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(preferenceOnPreferenceCopyListener);
                        if ((i8 & 112) == 32) {
                            preferenceGroupSavedState2 = preferenceGroupSavedState;
                            z = true;
                        } else {
                            preferenceGroupSavedState2 = preferenceGroupSavedState;
                            z = false;
                        }
                    }
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (!z && !zIconCompatParcelizer) {
                        i4 = read + 7;
                        serializer = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 != 0) {
                            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (objComponentActivity == getCreditCardExpirationMonth.write) {
                            objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(preferenceGroupSavedState2, 26, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                            getpostalcode.write(objComponentActivity);
                            int i10 = serializer + 57;
                            read = i10 % Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                        }
                    } else {
                        objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(preferenceGroupSavedState2, 26, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                        getpostalcode.write(objComponentActivity);
                        int i12 = serializer + 57;
                        read = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                    }
                    IconCompatParcelizer(preferenceGroupSavedState2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, PaddingKt.RemoteActionCompatParcelizer(modifier2, Dimensions.getAnimatedVisibility, Dimensions.setTabContainer), getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                modifier2 = Modifier.Companion;
                preferenceOnPreferenceCopyListener = (PreferenceOnPreferenceCopyListener) ExtrasKt.write(onanimation.MediaMetadataCompat, getpostalcode, 0).getValue();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{preferenceOnPreferenceCopyListener, PreferenceFragmentDividerDecoration.write}, getCieXyz.write())).booleanValue()) {
                    getpostalcode.serializer(-1141824764);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (preferenceOnPreferenceCopyListener instanceof PreferenceGroupSavedState) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1141827518, false);
                    }
                    i3 = serializer + 39;
                    read = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        getpostalcode.serializer(-1141823401);
                        preferenceGroupSavedState2 = (PreferenceGroupSavedState) preferenceOnPreferenceCopyListener;
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(preferenceOnPreferenceCopyListener);
                        if ((i8 & 109) == 47) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        getpostalcode.serializer(-1141823401);
                        preferenceGroupSavedState = (PreferenceGroupSavedState) preferenceOnPreferenceCopyListener;
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(preferenceOnPreferenceCopyListener);
                        if ((i8 & 112) == 32) {
                            preferenceGroupSavedState2 = preferenceGroupSavedState;
                            z = true;
                        } else {
                            preferenceGroupSavedState2 = preferenceGroupSavedState;
                            z = false;
                        }
                    }
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (!z && !zIconCompatParcelizer) {
                        i4 = read + 7;
                        serializer = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 != 0) {
                            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (objComponentActivity == getCreditCardExpirationMonth.write) {
                            objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(preferenceGroupSavedState2, 26, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                            getpostalcode.write(objComponentActivity);
                            int i14 = serializer + 57;
                            read = i14 % Fields.SpotShadowColor;
                            int i15 = i14 % 2;
                        }
                    } else {
                        objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(preferenceGroupSavedState2, 26, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                        getpostalcode.write(objComponentActivity);
                        int i16 = serializer + 57;
                        read = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                    }
                    IconCompatParcelizer(preferenceGroupSavedState2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, PaddingKt.RemoteActionCompatParcelizer(modifier2, Dimensions.getAnimatedVisibility, Dimensions.setTabContainer), getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        int i18 = serializer + 1;
        read = i18 % Fields.SpotShadowColor;
        int i19 = i18 % 2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 18, onanimation, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2);
        }
    }
}
