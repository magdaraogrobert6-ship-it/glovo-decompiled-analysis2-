package com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda2;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.pickupdropoff.tasks.api.mapper.ButtonTypeTokenMapperKt;
import com.roadrunner.delivery.pickupdropoff.tasks.api.mapper.MessageBoxTypeTokenMapperKt;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.compose.CashPaymentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$PaymentType;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.compose.QrPaymentKt;
import com.roadrunner.delivery.state.pudo.ButtonTypeToken;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidContentCaptureManagerTranslateStatus;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.C0195provider;
import o.ComposeAnimationState;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.UiMediaScopeImpl;
import o.Wallpaper;
import o.b9;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getDisplayName;
import o.getHandleruiannotations;
import o.getHeightD9Ej5fMannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getStore;
import o.getTopD9Ej5fMannotations;
import o.getYD9Ej5fM;
import o.getYD9Ej5fMannotations;
import o.handleUrlOverridelambda1;
import o.mapTreeWithStitching;
import o.p6;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.plusCBMgk4;
import o.r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QrPaymentKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void RemoteActionCompatParcelizer(C0195provider c0195provider, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2045155940);
        if ((i & 6) == 0) {
            int i4 = read + 51;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            i2 = ((i4 % 2 != 0 ? (i & 8) != 0 : (i & 107) != 0) ? getpostalcode.IconCompatParcelizer(c0195provider) : getpostalcode.read(c0195provider) ? 4 : 2) | i;
        } else {
            int i5 = IconCompatParcelizer + 119;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            int i7 = read + 55;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            mapTreeWithStitching maptreewithstitching = null;
            if (i7 % 2 == 0) {
                Wallpaper wallpaper = c0195provider.status;
                maptreewithstitching.hashCode();
                throw null;
            }
            Wallpaper wallpaper2 = c0195provider.status;
            if (wallpaper2 != null) {
                int i8 = IconCompatParcelizer + 71;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    mapTreeWithStitching maptreewithstitching2 = wallpaper2.statusMessage;
                    throw null;
                }
                maptreewithstitching = wallpaper2.statusMessage;
            }
            if (maptreewithstitching == null) {
                getpostalcode.serializer(-1165360972);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1165360971);
                Modifier.Companion companion = Modifier.Companion;
                Object[] objArr = {getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.setMenu)};
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                MessageBoxTypeTokenMapperKt.read(maptreewithstitching.type, companion, null, maptreewithstitching.title, maptreewithstitching.body, null, null, null, getpostalcode, 48, 228);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(c0195provider, i, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a A[PHI: r2
  0x004a: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002b, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r2
  0x002d: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002b, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(C0195provider c0195provider, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 35;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1375114927);
            if ((i & 101) == 0) {
                int i6 = read + 125;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(c0195provider);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(c0195provider);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1375114927);
            if ((i & 6) == 0) {
                int i8 = read + 125;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(c0195provider);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(c0195provider);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i3 & 147) != 146) {
            int i10 = IconCompatParcelizer + 77;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            int i12 = i3 & 14;
            if (i12 == 4) {
                int i13 = IconCompatParcelizer + 83;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                z2 = true;
            } else {
                if ((i3 & 8) != 0) {
                    int i15 = IconCompatParcelizer + 73;
                    read = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    if (getpostalcode.read(c0195provider)) {
                        int i17 = IconCompatParcelizer + 83;
                        read = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        z2 = true;
                    }
                }
                z2 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2) {
                objComponentActivity = c0195provider.switchToQrCodeButton;
                getpostalcode.write(objComponentActivity);
            } else {
                int i19 = read + 23;
                IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = c0195provider.switchToQrCodeButton;
                    getpostalcode.write(objComponentActivity);
                }
            }
            ComposeAnimationState composeAnimationState = (ComposeAnimationState) objComponentActivity;
            boolean z4 = i12 == 4 || ((i3 & 8) != 0 && getpostalcode.read(c0195provider));
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z4 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = c0195provider.switchToCashButton;
                getpostalcode.write(objComponentActivity2);
            }
            ComposeAnimationState composeAnimationState2 = (ComposeAnimationState) objComponentActivity2;
            if (!((Boolean) C0195provider.read(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -9058359, 9058359, new Object[]{c0195provider}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read())).booleanValue()) {
                int i21 = IconCompatParcelizer + 81;
                read = i21 % Fields.SpotShadowColor;
                Object obj = null;
                if (i21 % 2 == 0) {
                    getpostalcode.serializer(651082502);
                    if (c0195provider.serializer() == QrPaymentTaskUiItem$PaymentType.CASH && !c0195provider.MediaSessionCompatQueueItem()) {
                        getpostalcode.serializer(-1364467861);
                        if (composeAnimationState == null) {
                            int i22 = IconCompatParcelizer + 107;
                            read = i22 % Fields.SpotShadowColor;
                            if (i22 % 2 != 0) {
                                getpostalcode.serializer(651169270);
                                getpostalcode.IconCompatParcelizer(true);
                            } else {
                                getpostalcode.serializer(651169270);
                                getpostalcode.IconCompatParcelizer(false);
                            }
                            z3 = false;
                        } else {
                            getpostalcode.serializer(651169271);
                            ButtonTypeToken buttonTypeToken = composeAnimationState.type;
                            String str = composeAnimationState.actionTitle;
                            Integer num = composeAnimationState.actionIcon;
                            Modifier modifierWrite = SizeKt.write(Modifier.Companion, 1.0f);
                            modifierWrite.getClass();
                            z3 = false;
                            ButtonTypeTokenMapperKt.IconCompatParcelizer(buttonTypeToken, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierWrite, false, false, num, getpostalcode, ((i3 << 3) & 896) | 3072, 176);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        getpostalcode.IconCompatParcelizer(z3);
                    } else {
                        z3 = false;
                        getpostalcode.serializer(651575123);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    if (c0195provider.serializer() != QrPaymentTaskUiItem$PaymentType.QR_CODE) {
                        getpostalcode.serializer(652073107);
                        getpostalcode.IconCompatParcelizer(z3);
                    } else {
                        int i23 = read + 113;
                        IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                        if (i23 % 2 != 0) {
                            getpostalcode.serializer(-1364451921);
                            if (composeAnimationState2 == null) {
                                getpostalcode.serializer(651663410);
                                getpostalcode.IconCompatParcelizer(z3);
                            } else {
                                getpostalcode.serializer(651663411);
                                ButtonTypeToken buttonTypeToken2 = composeAnimationState2.type;
                                String str2 = composeAnimationState2.actionTitle;
                                Integer num2 = composeAnimationState2.actionIcon;
                                Modifier modifierWrite2 = SizeKt.write(Modifier.Companion, 1.0f);
                                modifierWrite2.getClass();
                                ButtonTypeTokenMapperKt.IconCompatParcelizer(buttonTypeToken2, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifierWrite2, false, false, num2, getpostalcode, (i3 & 896) | 3072, 176);
                                getpostalcode.IconCompatParcelizer(z3);
                            }
                            getpostalcode.IconCompatParcelizer(z3);
                        } else {
                            getpostalcode.serializer(-1364451921);
                            obj.hashCode();
                            throw null;
                        }
                    }
                    getpostalcode.IconCompatParcelizer(z3);
                } else {
                    getpostalcode.serializer(651082502);
                    c0195provider.serializer();
                    QrPaymentTaskUiItem$PaymentType qrPaymentTaskUiItem$PaymentType = QrPaymentTaskUiItem$PaymentType.CASH;
                    throw null;
                }
            } else {
                getpostalcode.serializer(652079059);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 27, c0195provider, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    public static final void IconCompatParcelizer(final getTopD9Ej5fMannotations gettopd9ej5fmannotations, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getPostalCode getpostalcode;
        final Modifier modifier2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        gettopd9ej5fmannotations.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k4.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k5.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-687412650);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(gettopd9ej5fmannotations)) {
                int i8 = IconCompatParcelizer + 27;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i10 = IconCompatParcelizer + 113;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
            int i11 = read + 113;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                int i12 = 3 % 5;
            }
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i13 = IconCompatParcelizer + 93;
            read = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            int i14 = IconCompatParcelizer + 101;
            read = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                int i15 = 58 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4)) {
                    i5 = Fields.RenderEffect;
                } else {
                    i5 = 65536;
                }
            } else if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4)) {
                i5 = Fields.RenderEffect;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            i2 |= !(getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k5) ^ true) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i16 = read + 113;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                i3 = 67108864;
            } else {
                int i17 = read + 119;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i3 = 33554432;
            }
            i2 |= i3;
        }
        int i19 = i2 | 805306368;
        if (getpostalcode2.write(i19 & 1, !((306783379 & i19) == 306783378))) {
            final Modifier.Companion companion = Modifier.Companion;
            getYD9Ej5fMannotations getyd9ej5fmannotations = (getYD9Ej5fMannotations) ExtrasKt.write(gettopd9ej5fmannotations.MediaSessionCompatResultReceiverWrapper, getpostalcode2, 0).getValue();
            if (!(!(getyd9ej5fmannotations instanceof getYD9Ej5fM))) {
                int i20 = read + 35;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                getpostalcode2.serializer(821425389);
                C0195provider c0195provider = ((getYD9Ej5fM) getyd9ej5fmannotations).IconCompatParcelizer;
                QrPaymentTaskUiItem$Companion qrPaymentTaskUiItem$Companion = C0195provider.Companion;
                QrPaymentComposable(c0195provider, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, companion, getpostalcode2, (i19 & 112) | 8 | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (29360128 & i19) | (234881024 & i19) | (i19 & 1879048192));
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(false);
                modifier2 = companion;
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getyd9ej5fmannotations, plusCBMgk4.write}, getCieXyz.write())).booleanValue()) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode2, 821422966, false);
                }
                getpostalcode2.serializer(-305088506);
                getpostalcode2.IconCompatParcelizer(false);
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                }
                final int i22 = 0;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.DpSize
                    private static int ParcelableVolumeInfo = 1;
                    private static int PlaybackStateCompatCustomAction;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj2, Object obj3) {
                        int i23 = 2 % 2;
                        int i24 = ParcelableVolumeInfo + 47;
                        PlaybackStateCompatCustomAction = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i25 = i24 % 2;
                        int i26 = i22;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i27 = i;
                        if (i26 != 0) {
                            ((Integer) obj3).getClass();
                            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i27 | 1);
                            QrPaymentKt.IconCompatParcelizer(gettopd9ej5fmannotations, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, companion, (getBirthDateFull) obj2, iRemoteActionCompatParcelizer);
                            return createfromparcel;
                        }
                        ((Integer) obj3).getClass();
                        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i27 | 1);
                        QrPaymentKt.IconCompatParcelizer(gettopd9ej5fmannotations, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, companion, (getBirthDateFull) obj2, iRemoteActionCompatParcelizer2);
                        int i28 = PlaybackStateCompatCustomAction + 117;
                        ParcelableVolumeInfo = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i28 % 2 != 0) {
                            return createfromparcel;
                        }
                        throw null;
                    }
                };
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode = getpostalcode2;
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        modifier2 = modifier;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i23 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.DpSize
                private static int ParcelableVolumeInfo = 1;
                private static int PlaybackStateCompatCustomAction;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i24 = 2 % 2;
                    int i25 = ParcelableVolumeInfo + 47;
                    PlaybackStateCompatCustomAction = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i26 = i25 % 2;
                    int i27 = i23;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i28 = i;
                    if (i27 != 0) {
                        ((Integer) obj3).getClass();
                        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i28 | 1);
                        QrPaymentKt.IconCompatParcelizer(gettopd9ej5fmannotations, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier2, (getBirthDateFull) obj2, iRemoteActionCompatParcelizer);
                        return createfromparcel;
                    }
                    ((Integer) obj3).getClass();
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i28 | 1);
                    QrPaymentKt.IconCompatParcelizer(gettopd9ej5fmannotations, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier2, (getBirthDateFull) obj2, iRemoteActionCompatParcelizer2);
                    int i29 = PlaybackStateCompatCustomAction + 117;
                    ParcelableVolumeInfo = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i29 % 2 != 0) {
                        return createfromparcel;
                    }
                    throw null;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }

    public static final void QrCodeComposable(getDisplayName getdisplayname, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        Modifier modifier2;
        boolean z3;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-843089185);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer;
            int i6 = i5 + 87;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if ((i & 8) == 0) {
                int i8 = i5 + 83;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    getpostalcode.read(getdisplayname);
                    throw null;
                }
                zIconCompatParcelizer = getpostalcode.read(getdisplayname);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getdisplayname);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i3 = Fields.SpotShadowColor;
            } else {
                int i9 = IconCompatParcelizer + 19;
                read = i9 % Fields.SpotShadowColor;
                i3 = i9 % 2 != 0 ? 5608 : Fields.RotationX;
            }
            i2 |= i3;
        }
        int i10 = i2 | 3072;
        if ((i10 & 1171) != 1170) {
            int i11 = read + 111;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i10 & 1, z2)) {
            Modifier.Companion companion = Modifier.Companion;
            boolean z4 = (i10 & 14) == 4 || ((i10 & 8) != 0 && getpostalcode.read(getdisplayname));
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z4 || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = getdisplayname.showQrCodeButton;
                getpostalcode.write(objComponentActivity);
            }
            ComposeAnimationState composeAnimationState = (ComposeAnimationState) objComponentActivity;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i13 = IconCompatParcelizer + 13;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i15 = IconCompatParcelizer + 31;
                read = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            String str = getdisplayname.title;
            TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long presenter = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
            companion.getClass();
            TextKt.m131TextNvy7gAk(str, companion, presenter, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 48, 0, 131064);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.getActionBarHideOffset)});
            TextKt.m131TextNvy7gAk(getdisplayname.description, companion, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 48, 0, 131064);
            float f = Dimensions.setMenu;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f)});
            TextKt.m131TextNvy7gAk(getdisplayname.amountToShow, companion, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48, 0, 131064);
            if (z) {
                getpostalcode.serializer(-267393639);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1809756274);
                if (composeAnimationState == null) {
                    int i17 = read + 15;
                    IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    getpostalcode.serializer(-267869645);
                    z3 = false;
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-267869644);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f)});
                    ButtonTypeToken buttonTypeToken = composeAnimationState.type;
                    String str2 = composeAnimationState.actionTitle;
                    Integer num = composeAnimationState.actionIcon;
                    Modifier modifierWrite = SizeKt.write(companion, 1.0f);
                    modifierWrite.getClass();
                    ButtonTypeTokenMapperKt.IconCompatParcelizer(buttonTypeToken, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierWrite, false, false, num, getpostalcode, (i10 & 896) | 3072, 176);
                    z3 = false;
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(z3);
            }
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p6(getdisplayname, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:126:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:129:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:132:0x0211  */
    /* JADX WARN: Code duplicated, block: B:133:0x0214  */
    /* JADX WARN: Code duplicated, block: B:137:0x021e  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x011a  */
    public static final void CashComposable(C0195provider c0195provider, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        boolean z2;
        int i3;
        boolean z3;
        Object objComponentActivity;
        boolean z4;
        Object objComponentActivity2;
        Object objComponentActivity3;
        boolean z5;
        Object objComponentActivity4;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = read + 83;
        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1915484449);
        if ((i & 6) == 0) {
            int i10 = read + 109;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            i2 = ((i10 % 2 != 0 ? (i & 8) != 0 : (i & 66) != 0) ? getpostalcode.IconCompatParcelizer(c0195provider) : getpostalcode.read(c0195provider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i11 = IconCompatParcelizer + 95;
            read = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                int i12 = 98 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i6 = 32;
                } else {
                    i6 = 16;
                }
            } else if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i13 = read + 123;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i5 = Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i15 = IconCompatParcelizer + 81;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i17 = IconCompatParcelizer + 1;
                read = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.RenderEffect : 65536;
        }
        int i19 = i2 | 1572864;
        if ((599187 & i19) != 599186) {
            int i20 = IconCompatParcelizer + 51;
            read = i20 % Fields.SpotShadowColor;
            if (i20 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i19 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            boolean z6 = (i19 & 14) == 4 || ((i19 & 8) != 0 && getpostalcode.read(c0195provider));
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z6) {
                objComponentActivity5 = c0195provider.cashPaymentTaskUiItem;
                getpostalcode.write(objComponentActivity5);
            } else {
                int i21 = read + 89;
                IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                if (objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = c0195provider.cashPaymentTaskUiItem;
                    getpostalcode.write(objComponentActivity5);
                }
            }
            CashPaymentTaskUiItem cashPaymentTaskUiItem = (CashPaymentTaskUiItem) objComponentActivity5;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            Object obj = null;
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
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            boolean z7 = (i19 & 112) == 32;
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (z7 || objComponentActivity6 == androidContentCaptureManager) {
                z2 = true;
                objComponentActivity6 = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity6);
            } else {
                z2 = true;
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6;
            boolean z8 = (i19 & 896) == 256 ? z2 : false;
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (z8) {
                i3 = 2;
            } else {
                int i23 = read + 53;
                IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                i3 = 2;
                if (i23 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity7 == androidContentCaptureManager) {
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7;
                if ((i19 & 7168) == 2048) {
                    int i24 = IconCompatParcelizer + 109;
                    read = i24 % Fields.SpotShadowColor;
                    int i25 = i24 % 2;
                    z3 = z2;
                } else {
                    z3 = false;
                }
                objComponentActivity = getpostalcode.ComponentActivity();
                if (z3 || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(3, r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                    getpostalcode.write(objComponentActivity);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
                if ((57344 & i19) == 16384) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z4 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 9);
                    getpostalcode.write(objComponentActivity2);
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2;
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new ComposeViewAdapter$$ExternalSyntheticLambda2(21);
                    getpostalcode.write(objComponentActivity3);
                }
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity3;
                if ((458752 & i19) == 131072) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                objComponentActivity4 = getpostalcode.ComponentActivity();
                if (z5 || objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 8);
                    getpostalcode.write(objComponentActivity4);
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4;
                CashPaymentTaskUiItem.Companion companion3 = CashPaymentTaskUiItem.Companion;
                CashPaymentKt.RemoteActionCompatParcelizer(cashPaymentTaskUiItem, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaunavo3sxub_pc9xroryotnrlvsm5, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, null, getpostalcode, 196616, Fields.SpotShadowColor);
                getpostalcode.IconCompatParcelizer(z2);
                modifier2 = companion;
            }
            objComponentActivity7 = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(i3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
            getpostalcode.write(objComponentActivity7);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7;
            if ((i19 & 7168) == 2048) {
                int i26 = IconCompatParcelizer + 109;
                read = i26 % Fields.SpotShadowColor;
                int i27 = i26 % 2;
                z3 = z2;
            } else {
                z3 = false;
            }
            objComponentActivity = getpostalcode.ComponentActivity();
            if (z3) {
                objComponentActivity = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(3, r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                getpostalcode.write(objComponentActivity);
            } else {
                objComponentActivity = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(3, r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
            if ((57344 & i19) == 16384) {
                z4 = z2;
            } else {
                z4 = false;
            }
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z4) {
                objComponentActivity2 = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 9);
                getpostalcode.write(objComponentActivity2);
            } else {
                objComponentActivity2 = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 9);
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2;
            objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new ComposeViewAdapter$$ExternalSyntheticLambda2(21);
                getpostalcode.write(objComponentActivity3);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity3;
            if ((458752 & i19) == 131072) {
                z5 = z2;
            } else {
                z5 = false;
            }
            objComponentActivity4 = getpostalcode.ComponentActivity();
            if (z5) {
                objComponentActivity4 = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 8);
                getpostalcode.write(objComponentActivity4);
            } else {
                objComponentActivity4 = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 8);
                getpostalcode.write(objComponentActivity4);
            }
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4;
            CashPaymentTaskUiItem.Companion companion4 = CashPaymentTaskUiItem.Companion;
            CashPaymentKt.RemoteActionCompatParcelizer(cashPaymentTaskUiItem, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm6, r8lambdaunavo3sxub_pc9xroryotnrlvsm7, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, null, getpostalcode, 196616, Fields.SpotShadowColor);
            getpostalcode.IconCompatParcelizer(z2);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(c0195provider, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier2, i, 8);
        }
    }

    public static final void QrPaymentComposable(C0195provider c0195provider, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1642680805);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(c0195provider) : getpostalcode.IconCompatParcelizer(c0195provider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = read + 19;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i10 = read + 19;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3)) {
                int i12 = IconCompatParcelizer + 95;
                read = i12 % Fields.SpotShadowColor;
                i5 = i12 % 2 != 0 ? 30631 : Fields.Clip;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            i2 |= !getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4) ? 65536 : Fields.RenderEffect;
        }
        if ((1572864 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k5)) {
                int i13 = IconCompatParcelizer + 29;
                read = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    throw null;
                }
                i4 = 1048576;
            } else {
                i4 = Fields.BlendMode;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            int i14 = read + 93;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 67108864 : 33554432;
            int i15 = read + 31;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        }
        if ((805306368 & i) == 0) {
            int i17 = IconCompatParcelizer + 41;
            read = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                getpostalcode.read(modifier);
                throw null;
            }
            i2 |= getpostalcode.read(modifier) ? 536870912 : 268435456;
        }
        int i18 = i2;
        if (getpostalcode.write(i18 & 1, (306783379 & i18) != 306783378)) {
            modifier.getClass();
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i19 = read + 3;
            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i21 = IconCompatParcelizer + 71;
                read = i21 % Fields.SpotShadowColor;
                if (i21 % 2 != 0) {
                    getpostalcode.serializer(constructor);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            int i22 = getHeightD9Ej5fMannotations.read[c0195provider.serializer().ordinal()];
            if (i22 == 1) {
                i3 = i18;
                getpostalcode.serializer(-1947891495);
                getDisplayName getdisplayname = c0195provider.qrCode;
                if (getdisplayname == null) {
                    getpostalcode.serializer(-1947891496);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1947891495);
                    QrCodeComposable(getdisplayname, ((Boolean) C0195provider.read(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -9058359, 9058359, new Object[]{c0195provider}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read())).booleanValue(), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, getpostalcode, ((i3 << 3) & 896) | 8);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (i22 != 2) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1586858150, false);
                }
                int i23 = read + 83;
                IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                getpostalcode.serializer(-1586846721);
                QrPaymentTaskUiItem$Companion qrPaymentTaskUiItem$Companion = C0195provider.Companion;
                int i25 = i18 >> 9;
                i3 = i18;
                CashComposable(c0195provider, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, null, getpostalcode, (i18 & 14) | 8 | (i25 & 112) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (i25 & 458752));
                getpostalcode.IconCompatParcelizer(false);
            }
            QrPaymentTaskUiItem$Companion qrPaymentTaskUiItem$Companion2 = C0195provider.Companion;
            int i26 = (i3 & 14) | 8;
            RemoteActionCompatParcelizer(c0195provider, getpostalcode, i26);
            IconCompatParcelizer(c0195provider, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode, i26 | ((i3 >> 6) & 112) | (i3 & 896));
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new b9(c0195provider, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier, i);
        }
    }
}
