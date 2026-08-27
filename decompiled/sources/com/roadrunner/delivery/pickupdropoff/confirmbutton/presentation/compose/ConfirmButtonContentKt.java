package com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.ConfirmButtonV1UiModel;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.compose.ConfirmButtonContentKt;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import o.areParameterTypesCompatible;
import o.buildCompositionParentHierarchy;
import o.dup;
import o.extractJsonInt;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getStates;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ConfirmButtonContentKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    public static final void serializer(String str, boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1341450205);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(str)) {
                int i5 = RemoteActionCompatParcelizer + 121;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i6 = serializer + 121;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                getpostalcode2.write(z2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode2.write(z2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i7 = RemoteActionCompatParcelizer + 13;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 |= getpostalcode2.read(modifier) ? Fields.Clip : 8192;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            modifierWrite.getClass();
            int i9 = i2 << 6;
            getpostalcode = getpostalcode2;
            PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierWrite, z, z2, null, null, null, null, null, getpostalcode2, ((i2 >> 6) & 112) | (i2 & 14) | (i9 & 7168) | (i9 & 57344), 0, 2016);
            int i10 = RemoteActionCompatParcelizer + 121;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 5 / 3;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new extractJsonInt(str, z, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 1);
            int i12 = serializer + 91;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00db A[PHI: r0
  0x00db: PHI (r0v14 o.areParameterTypesCompatible) = (r0v7 o.areParameterTypesCompatible), (r0v23 o.areParameterTypesCompatible) binds: [B:52:0x00d9, B:49:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb A[PHI: r0
  0x00fb: PHI (r0v8 o.areParameterTypesCompatible) = (r0v7 o.areParameterTypesCompatible), (r0v23 o.areParameterTypesCompatible) binds: [B:52:0x00d9, B:49:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:58:0x0132  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void write(final ConfirmButtonV1UiModel confirmButtonV1UiModel, final boolean z, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        areParameterTypesCompatible areparametertypescompatible;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        confirmButtonV1UiModel.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(713374004);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(confirmButtonV1UiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.write(z)) {
                int i7 = RemoteActionCompatParcelizer + 81;
                serializer = i7 % Fields.SpotShadowColor;
                i5 = i7 % 2 == 0 ? 116 : 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = serializer + 105;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = Fields.RotationX;
            } else {
                int i10 = RemoteActionCompatParcelizer + 41;
                serializer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    int i11 = 4 % 2;
                }
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            int i12 = serializer + 93;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            if (!(!getpostalcode.read(modifier))) {
                int i14 = RemoteActionCompatParcelizer + 97;
                serializer = i14 % Fields.SpotShadowColor;
                i3 = i14 % 2 == 0 ? 3648 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            int i15 = serializer + 81;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i2 & 1, z2)) {
            int i17 = serializer + 81;
            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                areparametertypescompatible = (areParameterTypesCompatible) ExtrasKt.write(((ConfirmButtonV1UiModelImpl) confirmButtonV1UiModel).r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, getpostalcode, 1).getValue();
                if (!(areparametertypescompatible instanceof getStates)) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{areparametertypescompatible, dup.read}, getCieXyz.write())).booleanValue()) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1642342278, false);
                    }
                    getpostalcode.serializer(627360008);
                    getpostalcode.IconCompatParcelizer(false);
                    gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                    if (gethandleruiannotationsMediaDescriptionCompat != null) {
                        return;
                    }
                    final int i18 = 0;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.lambda__1163195098lambda0
                        private static int MediaDescriptionCompat = 1;
                        private static int RatingCompat;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i19 = 2 % 2;
                            int i20 = MediaDescriptionCompat + 75;
                            RatingCompat = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i21 = i20 % 2;
                            int i22 = i18;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i23 = i;
                            if (i22 == 0) {
                                ((Integer) obj2).getClass();
                                ConfirmButtonContentKt.write(confirmButtonV1UiModel, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i23 | 1));
                                return createfromparcel;
                            }
                            ((Integer) obj2).getClass();
                            ConfirmButtonContentKt.write(confirmButtonV1UiModel, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i23 | 1));
                            int i24 = RatingCompat + 101;
                            MediaDescriptionCompat = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i25 = i24 % 2;
                            return createfromparcel;
                        }
                    };
                } else {
                    getpostalcode.serializer(-1642339735);
                    buildCompositionParentHierarchy buildcompositionparenthierarchy = ((getStates) areparametertypescompatible).IconCompatParcelizer;
                    serializer(buildcompositionparenthierarchy.text, buildcompositionparenthierarchy.enabled, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getpostalcode, (i2 << 3) & 65408);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                areparametertypescompatible = (areParameterTypesCompatible) ExtrasKt.write(((ConfirmButtonV1UiModelImpl) confirmButtonV1UiModel).r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, getpostalcode, 0).getValue();
                if (areparametertypescompatible instanceof getStates) {
                    getpostalcode.serializer(-1642339735);
                    buildCompositionParentHierarchy buildcompositionparenthierarchy2 = ((getStates) areparametertypescompatible).IconCompatParcelizer;
                    serializer(buildcompositionparenthierarchy2.text, buildcompositionparenthierarchy2.enabled, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getpostalcode, (i2 << 3) & 65408);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{areparametertypescompatible, dup.read}, getCieXyz.write())).booleanValue()) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1642342278, false);
                    }
                    getpostalcode.serializer(627360008);
                    getpostalcode.IconCompatParcelizer(false);
                    gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                    if (gethandleruiannotationsMediaDescriptionCompat != null) {
                        return;
                    }
                    final int i19 = 0;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.lambda__1163195098lambda0
                        private static int MediaDescriptionCompat = 1;
                        private static int RatingCompat;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i110 = 2 % 2;
                            int i20 = MediaDescriptionCompat + 75;
                            RatingCompat = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i21 = i20 % 2;
                            int i22 = i19;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i23 = i;
                            if (i22 == 0) {
                                ((Integer) obj2).getClass();
                                ConfirmButtonContentKt.write(confirmButtonV1UiModel, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i23 | 1));
                                return createfromparcel;
                            }
                            ((Integer) obj2).getClass();
                            ConfirmButtonContentKt.write(confirmButtonV1UiModel, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i23 | 1));
                            int i24 = RatingCompat + 101;
                            MediaDescriptionCompat = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i25 = i24 % 2;
                            return createfromparcel;
                        }
                    };
                }
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i20 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.lambda__1163195098lambda0
                private static int MediaDescriptionCompat = 1;
                private static int RatingCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i110 = 2 % 2;
                    int i21 = MediaDescriptionCompat + 75;
                    RatingCompat = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    int i23 = i20;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i24 = i;
                    if (i23 == 0) {
                        ((Integer) obj2).getClass();
                        ConfirmButtonContentKt.write(confirmButtonV1UiModel, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i24 | 1));
                        return createfromparcel;
                    }
                    ((Integer) obj2).getClass();
                    ConfirmButtonContentKt.write(confirmButtonV1UiModel, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i24 | 1));
                    int i25 = RatingCompat + 101;
                    MediaDescriptionCompat = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i26 = i25 % 2;
                    return createfromparcel;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }
}
