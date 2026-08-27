package com.roadrunner.lib.compose.permission;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.AndroidContentCaptureManager;
import o.accessgetAltRightcp;
import o.buildMapping;
import o.dExternalSyntheticOutline0;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getCurrentSessionimpl;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getRequiredTypeConverterClassesMaproom_runtime;
import o.getTopLeftannotations;
import o.getTransactionContextroom_runtime;
import o.getTypeConverter;
import o.getUseTempTrackingTableroom_runtime;
import o.p4;
import o.performMeasureDjhGOtQ;
import o.populateViewStructure;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setInflatedId;
import o.withSessionCancellingPreviousimpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PermissionContentKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public static final getTopLeftannotations write;

    static {
        float f = Dimensions.read;
        write = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setChecked);
        int i = serializer + 55;
        read = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 73 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0127  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void PermissionDialogCard(getTypeConverter gettypeconverter, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier3;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1416083822);
        if ((i & 6) == 0) {
            if (getpostalcode.read(gettypeconverter)) {
                int i9 = IconCompatParcelizer + 7;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            int i11 = RemoteActionCompatParcelizer + 13;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i13 = IconCompatParcelizer + 71;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            if (getpostalcode.write(z)) {
                int i15 = IconCompatParcelizer + 63;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i17 = RemoteActionCompatParcelizer + 119;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                i5 = i17 % 2 != 0 ? 9610 : Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i18 = i2 & 16;
        if (i18 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                if (getpostalcode.read(modifier2)) {
                    int i19 = RemoteActionCompatParcelizer + 65;
                    IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                    i4 = i19 % 2 != 0 ? 10665 : Fields.Clip;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i3 & 1, z2)) {
                if (i18 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                getCurrentSessionimpl.read(PaddingKt.m73paddingVpY3zN4$default(SizeKt.IconCompatParcelizer(modifier3, null, 3), Dimensions.setTabContainer, 0.0f, 2), write, withSessionCancellingPreviousimpl.serializer(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), getpostalcode, 0), null, null, ExtrasKt.write(795930976, new p4(3, gettypeconverter, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, z), getpostalcode), getpostalcode, 196656, 24);
                modifier2 = modifier3;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new getTransactionContextroom_runtime(gettypeconverter, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, i2);
            }
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i3 & 1, z2)) {
            if (i18 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            getCurrentSessionimpl.read(PaddingKt.m73paddingVpY3zN4$default(SizeKt.IconCompatParcelizer(modifier3, null, 3), Dimensions.setTabContainer, 0.0f, 2), write, withSessionCancellingPreviousimpl.serializer(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), getpostalcode, 0), null, null, ExtrasKt.write(795930976, new p4(3, gettypeconverter, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, z), getpostalcode), getpostalcode, 196656, 24);
            modifier2 = modifier3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getTransactionContextroom_runtime(gettypeconverter, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, i2);
        }
    }

    public static final void PermissionDialog(boolean z, boolean z2, getTypeConverter gettypeconverter, accessgetAltRightcp accessgetaltrightcp, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        accessgetaltrightcp.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1585496632);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 39;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                getpostalcode.write(z);
                throw null;
            }
            i2 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            int i6 = RemoteActionCompatParcelizer + 13;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = RemoteActionCompatParcelizer + 105;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                getpostalcode.write(z2);
                throw null;
            }
            i2 |= getpostalcode.write(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(gettypeconverter) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i9 = RemoteActionCompatParcelizer + 97;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= !(getpostalcode.read(accessgetaltrightcp) ^ true) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i11 = IconCompatParcelizer + 83;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true ? 65536 : Fields.RenderEffect;
        }
        int i13 = 1572864 | i2;
        if (getpostalcode.write(i13 & 1, (599187 & i13) != 599186)) {
            Modifier.Companion companion = Modifier.Companion;
            if (z && (!accessgetaltrightcp.read())) {
                getpostalcode.serializer(1775210167);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new DialogProperties(z2, z2, false);
                    getpostalcode.write(objComponentActivity);
                }
                AndroidDialog_androidKt.Dialog(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (DialogProperties) objComponentActivity, ExtrasKt.write(2126551786, new dExternalSyntheticOutline0(gettypeconverter, z2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, accessgetaltrightcp, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion), getpostalcode), getpostalcode, ((i13 >> 15) & 14) | 432, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1775935722);
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new populateViewStructure(z, z2, gettypeconverter, accessgetaltrightcp, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:93:0x013f  */
    public static final void PermissionDialogContent(int i, getBirthDateFull getbirthdatefull, accessgetAltRightcp accessgetaltrightcp, getUseTempTrackingTableroom_runtime getusetemptrackingtableroom_runtime, getTypeConverter gettypeconverter, getTypeConverter gettypeconverter2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, boolean z, boolean z2) {
        int i2;
        getTypeConverter gettypeconverter3;
        boolean z3;
        boolean z4;
        boolean z5;
        final int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        getusetemptrackingtableroom_runtime.getClass();
        accessgetaltrightcp.getClass();
        gettypeconverter.getClass();
        gettypeconverter2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1557621554);
        if ((i & 6) == 0) {
            int i10 = RemoteActionCompatParcelizer + 107;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (getpostalcode.write(z)) {
                int i12 = RemoteActionCompatParcelizer + 103;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                i8 = i12 % 2 != 0 ? 3 : 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(getusetemptrackingtableroom_runtime.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= !getpostalcode.read(accessgetaltrightcp) ? Fields.SpotShadowColor : Fields.RotationX;
        }
        if ((i & 3072) == 0) {
            int i13 = IconCompatParcelizer + 39;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                if (getpostalcode.read(gettypeconverter)) {
                    i7 = Fields.CameraDistance;
                } else {
                    i7 = Fields.RotationZ;
                }
            } else {
                int i14 = 91 / 0;
                if (getpostalcode.read(gettypeconverter)) {
                    i7 = Fields.CameraDistance;
                } else {
                    i7 = Fields.RotationZ;
                }
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            gettypeconverter3 = gettypeconverter2;
            i2 |= getpostalcode.read(gettypeconverter3) ? Fields.Clip : 8192;
        } else {
            gettypeconverter3 = gettypeconverter2;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i15 = IconCompatParcelizer + 91;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i2 |= i6;
        }
        if ((805306368 & i) == 0) {
            i2 |= getpostalcode.write(z2) ? 536870912 : 268435456;
        }
        if ((306783379 & i2) != 306783378) {
            int i16 = IconCompatParcelizer + 79;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            if (i16 % 2 == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (getpostalcode.write(i2 & 1, z3)) {
            int i17 = i2 << 3;
            int i18 = i2 >> 6;
            PermissionDialog(z2, z, accessgetaltrightcp.IconCompatParcelizer() ? gettypeconverter3 : gettypeconverter, accessgetaltrightcp, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, getpostalcode, (i17 & 7168) | ((i2 >> 27) & 14) | (i17 & 112) | ((i2 >> 3) & 57344) | (i18 & 458752));
            int i19 = 234881024 & i2;
            if (i19 == 67108864) {
                int i20 = RemoteActionCompatParcelizer + 95;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                z4 = true;
            } else {
                z4 = false;
            }
            int i22 = 3670016 & i2;
            if (i22 == 1048576) {
                int i23 = RemoteActionCompatParcelizer + 31;
                IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                if (i23 % 2 != 0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
            } else {
                z5 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((!(z4 | z5)) && objComponentActivity != androidContentCaptureManager) {
                i3 = 0;
            } else {
                i3 = 0;
                objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.getRequiredAutoMigrationSpecs
                    private static int serializer = 1;
                    private static int write;

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i24 = 2 % 2;
                        int i25 = serializer + 101;
                        write = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                        int i27 = i3;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                        if (i27 != 0) {
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k2.invoke();
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(Boolean.TRUE);
                            int i28 = write + 11;
                            serializer = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i28 % 2 == 0) {
                                int i29 = 37 / 0;
                            }
                            return createfromparcel;
                        }
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.invoke();
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(Boolean.TRUE);
                        int i30 = serializer + 3;
                        write = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i30 % 2 == 0) {
                            return createfromparcel;
                        }
                        throw null;
                    }
                };
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
            if (i19 == 67108864) {
                int i24 = RemoteActionCompatParcelizer + 117;
                IconCompatParcelizer = i24 % Fields.SpotShadowColor;
                i4 = 2;
                int i25 = i24 % 2;
                i5 = 1;
            } else {
                i4 = 2;
                i5 = i3;
            }
            int i26 = IconCompatParcelizer + 123;
            RemoteActionCompatParcelizer = i26 % Fields.SpotShadowColor;
            int i27 = i26 % i4;
            int i28 = i22 == 1048576 ? 1 : 0;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((i5 | i28) != 0 || objComponentActivity2 == androidContentCaptureManager) {
                final int i29 = 1;
                objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.getRequiredAutoMigrationSpecs
                    private static int serializer = 1;
                    private static int write;

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i210 = 2 % 2;
                        int i211 = serializer + 101;
                        write = i211 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i212 = i211 % 2;
                        int i213 = i29;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                        if (i213 != 0) {
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k3.invoke();
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(Boolean.TRUE);
                            int i214 = write + 11;
                            serializer = i214 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i214 % 2 == 0) {
                                int i215 = 37 / 0;
                            }
                            return createfromparcel;
                        }
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.invoke();
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(Boolean.TRUE);
                        int i30 = serializer + 3;
                        write = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i30 % 2 == 0) {
                            return createfromparcel;
                        }
                        throw null;
                    }
                };
                getpostalcode.write(objComponentActivity2);
            }
            setInflatedId.IconCompatParcelizer(accessgetaltrightcp, getusetemptrackingtableroom_runtime, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, getpostalcode, (i18 & 14) | (i2 & 112));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i30 = IconCompatParcelizer + 7;
            RemoteActionCompatParcelizer = i30 % Fields.SpotShadowColor;
            int i31 = i30 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getRequiredTypeConverterClassesMaproom_runtime(z, getusetemptrackingtableroom_runtime, accessgetaltrightcp, gettypeconverter, gettypeconverter2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, z2, i);
        }
    }
}
