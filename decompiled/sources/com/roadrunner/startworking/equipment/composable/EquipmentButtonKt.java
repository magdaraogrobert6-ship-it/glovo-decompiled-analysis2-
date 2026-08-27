package com.roadrunner.startworking.equipment.composable;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import o.AndroidContentCaptureManager;
import o.extractAuthorizationHeader;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.hasRootCause;
import o.isValidParameter;
import o.lambda315;
import o.lambda34;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EquipmentButtonKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0176  */
    public static final void IconCompatParcelizer(final lambda315 lambda315Var, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        final int i7 = 2;
        int i8 = 2 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1873233891);
        final int i9 = 4;
        if ((i & 6) == 0) {
            if (getpostalcode.read(lambda315Var)) {
                i6 = 4;
            } else {
                int i10 = RemoteActionCompatParcelizer + 61;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i12 = RemoteActionCompatParcelizer + 23;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                i5 = i12 % 2 != 0 ? 100 : 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i13 = IconCompatParcelizer + 67;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        final int i15 = 1;
        final int i16 = 0;
        if (getpostalcode.write(i2 & 1, !((i2 & 147) == 146))) {
            int i17 = lambda34.RemoteActionCompatParcelizer[lambda315Var.RemoteActionCompatParcelizer.ordinal()];
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (i17 == 1) {
                getpostalcode.serializer(-1000558710);
                Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
                String str = lambda315Var.read;
                boolean z3 = lambda315Var.serializer;
                if ((i2 & 112) == 32) {
                    int i18 = RemoteActionCompatParcelizer + 99;
                    IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                i15 = (i2 & 14) != 4 ? 0 : 1;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((i3 | i15) != 0 || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.lambda33
                        private static int RemoteActionCompatParcelizer = 0;
                        private static int read = 1;

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i20 = 2 % 2;
                            int i21 = i16;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            lambda315 lambda315Var2 = lambda315Var;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            if (i21 == 0) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                int i22 = read + 49;
                                RemoteActionCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i22 % 2 == 0) {
                                    return createfromparcel;
                                }
                                throw null;
                            }
                            if (i21 == 1) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                int i23 = RemoteActionCompatParcelizer + 71;
                                read = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i24 = i23 % 2;
                                return createfromparcel;
                            }
                            if (i21 != 2) {
                                if (i21 != 3) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                    return createfromparcel;
                                }
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                return createfromparcel;
                            }
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                            int i25 = RemoteActionCompatParcelizer + 11;
                            read = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i26 = i25 % 2;
                            return createfromparcel;
                        }
                    };
                    getpostalcode.write(objComponentActivity);
                }
                PrimaryKt.write(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierWrite, z3, false, null, null, null, null, null, getpostalcode, 0, 0, 2032);
                getpostalcode.IconCompatParcelizer(false);
            } else if (i17 != 2) {
                final int i20 = 3;
                if (i17 == 3) {
                    getpostalcode.serializer(-1000068600);
                    Modifier modifierWrite2 = SizeKt.write(modifier, 1.0f);
                    String str2 = lambda315Var.read;
                    boolean z4 = lambda315Var.serializer;
                    int i21 = (i2 & 112) == 32 ? 1 : 0;
                    i15 = (i2 & 14) != 4 ? 0 : 1;
                    Object objComponentActivity2 = getpostalcode.ComponentActivity();
                    if ((i21 | i15) != 0) {
                        objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.lambda33
                            private static int RemoteActionCompatParcelizer = 0;
                            private static int read = 1;

                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public final Object invoke() {
                                int i22 = 2 % 2;
                                int i23 = i7;
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                lambda315 lambda315Var2 = lambda315Var;
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                                if (i23 == 0) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                    int i24 = read + 49;
                                    RemoteActionCompatParcelizer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i24 % 2 == 0) {
                                        return createfromparcel;
                                    }
                                    throw null;
                                }
                                if (i23 == 1) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                    int i25 = RemoteActionCompatParcelizer + 71;
                                    read = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i26 = i25 % 2;
                                    return createfromparcel;
                                }
                                if (i23 != 2) {
                                    if (i23 != 3) {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                        return createfromparcel;
                                    }
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                    return createfromparcel;
                                }
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                int i27 = RemoteActionCompatParcelizer + 11;
                                read = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i28 = i27 % 2;
                                return createfromparcel;
                            }
                        };
                        getpostalcode.write(objComponentActivity2);
                    } else {
                        int i22 = IconCompatParcelizer + 31;
                        RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
                        int i23 = i22 % 2;
                        if (objComponentActivity2 == androidContentCaptureManager) {
                            objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.lambda33
                                private static int RemoteActionCompatParcelizer = 0;
                                private static int read = 1;

                                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                                public final Object invoke() {
                                    int i24 = 2 % 2;
                                    int i25 = i7;
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    lambda315 lambda315Var2 = lambda315Var;
                                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                                    if (i25 == 0) {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                        int i26 = read + 49;
                                        RemoteActionCompatParcelizer = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i26 % 2 == 0) {
                                            return createfromparcel;
                                        }
                                        throw null;
                                    }
                                    if (i25 == 1) {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                        int i27 = RemoteActionCompatParcelizer + 71;
                                        read = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i28 = i27 % 2;
                                        return createfromparcel;
                                    }
                                    if (i25 != 2) {
                                        if (i25 != 3) {
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                            return createfromparcel;
                                        }
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                        return createfromparcel;
                                    }
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                    int i29 = RemoteActionCompatParcelizer + 11;
                                    read = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i210 = i29 % 2;
                                    return createfromparcel;
                                }
                            };
                            getpostalcode.write(objComponentActivity2);
                        }
                    }
                    isValidParameter.RemoteActionCompatParcelizer(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, modifierWrite2, z4, false, null, null, null, null, getpostalcode, 0, 1008);
                    getpostalcode.IconCompatParcelizer(false);
                } else if (i17 == 4) {
                    getpostalcode.serializer(-999820538);
                    Modifier modifierWrite3 = SizeKt.write(modifier, 1.0f);
                    String str3 = lambda315Var.read;
                    boolean z5 = lambda315Var.serializer;
                    int i24 = (i2 & 112) == 32 ? 1 : 0;
                    if ((i2 & 14) == 4) {
                        int i25 = RemoteActionCompatParcelizer + 107;
                        IconCompatParcelizer = i25 % Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                    } else {
                        i15 = 0;
                    }
                    Object objComponentActivity3 = getpostalcode.ComponentActivity();
                    if ((i24 | i15) != 0 || objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.lambda33
                            private static int RemoteActionCompatParcelizer = 0;
                            private static int read = 1;

                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public final Object invoke() {
                                int i27 = 2 % 2;
                                int i28 = i20;
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                lambda315 lambda315Var2 = lambda315Var;
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                                if (i28 == 0) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                    int i29 = read + 49;
                                    RemoteActionCompatParcelizer = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i29 % 2 == 0) {
                                        return createfromparcel;
                                    }
                                    throw null;
                                }
                                if (i28 == 1) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                    int i210 = RemoteActionCompatParcelizer + 71;
                                    read = i210 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i211 = i210 % 2;
                                    return createfromparcel;
                                }
                                if (i28 != 2) {
                                    if (i28 != 3) {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                        return createfromparcel;
                                    }
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                    return createfromparcel;
                                }
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                int i212 = RemoteActionCompatParcelizer + 11;
                                read = i212 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i213 = i212 % 2;
                                return createfromparcel;
                            }
                        };
                        getpostalcode.write(objComponentActivity3);
                    }
                    isValidParameter.RemoteActionCompatParcelizer(str3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, modifierWrite3, z5, (Integer) null, (hasRootCause) null, (extractAuthorizationHeader) null, (MutableInteractionSourceImpl) null, getpostalcode, 0, 496);
                    getpostalcode.IconCompatParcelizer(false);
                } else if (i17 == 5) {
                    getpostalcode.serializer(-999577684);
                    Modifier modifierWrite4 = SizeKt.write(modifier, 1.0f);
                    String str4 = lambda315Var.read;
                    boolean z6 = lambda315Var.serializer;
                    int i27 = (i2 & 112) == 32 ? 1 : 0;
                    i15 = (i2 & 14) != 4 ? 0 : 1;
                    Object objComponentActivity4 = getpostalcode.ComponentActivity();
                    if ((i27 | i15) != 0) {
                        objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.lambda33
                            private static int RemoteActionCompatParcelizer = 0;
                            private static int read = 1;

                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public final Object invoke() {
                                int i28 = 2 % 2;
                                int i29 = i9;
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                lambda315 lambda315Var2 = lambda315Var;
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                                if (i29 == 0) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                    int i210 = read + 49;
                                    RemoteActionCompatParcelizer = i210 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i210 % 2 == 0) {
                                        return createfromparcel;
                                    }
                                    throw null;
                                }
                                if (i29 == 1) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                    int i211 = RemoteActionCompatParcelizer + 71;
                                    read = i211 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i212 = i211 % 2;
                                    return createfromparcel;
                                }
                                if (i29 != 2) {
                                    if (i29 != 3) {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                        return createfromparcel;
                                    }
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                    return createfromparcel;
                                }
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                int i213 = RemoteActionCompatParcelizer + 11;
                                read = i213 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i214 = i213 % 2;
                                return createfromparcel;
                            }
                        };
                        getpostalcode.write(objComponentActivity4);
                    } else {
                        int i28 = IconCompatParcelizer + 99;
                        RemoteActionCompatParcelizer = i28 % Fields.SpotShadowColor;
                        if (i28 % 2 == 0) {
                            int i29 = 80 / 0;
                            if (objComponentActivity4 == androidContentCaptureManager) {
                                objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.lambda33
                                    private static int RemoteActionCompatParcelizer = 0;
                                    private static int read = 1;

                                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                                    public final Object invoke() {
                                        int i210 = 2 % 2;
                                        int i211 = i9;
                                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                        lambda315 lambda315Var2 = lambda315Var;
                                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                                        if (i211 == 0) {
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                            int i212 = read + 49;
                                            RemoteActionCompatParcelizer = i212 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i212 % 2 == 0) {
                                                return createfromparcel;
                                            }
                                            throw null;
                                        }
                                        if (i211 == 1) {
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                            int i213 = RemoteActionCompatParcelizer + 71;
                                            read = i213 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i214 = i213 % 2;
                                            return createfromparcel;
                                        }
                                        if (i211 != 2) {
                                            if (i211 != 3) {
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                                return createfromparcel;
                                            }
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                            return createfromparcel;
                                        }
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                        int i215 = RemoteActionCompatParcelizer + 11;
                                        read = i215 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i216 = i215 % 2;
                                        return createfromparcel;
                                    }
                                };
                                getpostalcode.write(objComponentActivity4);
                            }
                        } else if (objComponentActivity4 == androidContentCaptureManager) {
                            objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.lambda33
                                private static int RemoteActionCompatParcelizer = 0;
                                private static int read = 1;

                                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                                public final Object invoke() {
                                    int i210 = 2 % 2;
                                    int i211 = i9;
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    lambda315 lambda315Var2 = lambda315Var;
                                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                                    if (i211 == 0) {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                        int i212 = read + 49;
                                        RemoteActionCompatParcelizer = i212 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i212 % 2 == 0) {
                                            return createfromparcel;
                                        }
                                        throw null;
                                    }
                                    if (i211 == 1) {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                        int i213 = RemoteActionCompatParcelizer + 71;
                                        read = i213 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i214 = i213 % 2;
                                        return createfromparcel;
                                    }
                                    if (i211 != 2) {
                                        if (i211 != 3) {
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                            return createfromparcel;
                                        }
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                        return createfromparcel;
                                    }
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                    int i215 = RemoteActionCompatParcelizer + 11;
                                    read = i215 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i216 = i215 % 2;
                                    return createfromparcel;
                                }
                            };
                            getpostalcode.write(objComponentActivity4);
                        }
                    }
                    TertiaryKt.IconCompatParcelizer(str4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, modifierWrite4, z6, 0, null, null, null, getpostalcode, 0, 240);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -586465787, false);
                }
            } else {
                getpostalcode.serializer(-1000314616);
                Modifier modifierWrite5 = SizeKt.write(modifier, 1.0f);
                String str5 = lambda315Var.read;
                boolean z7 = lambda315Var.serializer;
                if ((i2 & 112) == 32) {
                    int i30 = IconCompatParcelizer + 95;
                    RemoteActionCompatParcelizer = i30 % Fields.SpotShadowColor;
                    int i31 = i30 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if ((i2 & 14) == 4) {
                    int i32 = RemoteActionCompatParcelizer + 15;
                    IconCompatParcelizer = i32 % Fields.SpotShadowColor;
                    int i33 = i32 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objComponentActivity5 = getpostalcode.ComponentActivity();
                if ((z2 | z) || objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.lambda33
                        private static int RemoteActionCompatParcelizer = 0;
                        private static int read = 1;

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i210 = 2 % 2;
                            int i211 = i15;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            lambda315 lambda315Var2 = lambda315Var;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            if (i211 == 0) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                int i212 = read + 49;
                                RemoteActionCompatParcelizer = i212 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i212 % 2 == 0) {
                                    return createfromparcel;
                                }
                                throw null;
                            }
                            if (i211 == 1) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                int i213 = RemoteActionCompatParcelizer + 71;
                                read = i213 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i214 = i213 % 2;
                                return createfromparcel;
                            }
                            if (i211 != 2) {
                                if (i211 != 3) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                    return createfromparcel;
                                }
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                                return createfromparcel;
                            }
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lambda315Var2.write);
                            int i215 = RemoteActionCompatParcelizer + 11;
                            read = i215 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i216 = i215 % 2;
                            return createfromparcel;
                        }
                    };
                    getpostalcode.write(objComponentActivity5);
                }
                PrimaryKt.serializer(str5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, modifierWrite5, z7, null, null, getpostalcode, 0, 48);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 27, lambda315Var, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier);
        }
    }
}
