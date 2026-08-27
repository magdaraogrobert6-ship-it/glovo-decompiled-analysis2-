package com.roadrunner.rider.state.cashblock.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.freelancing.presentation.WorkNowRowKt$WorkNowRow$1$1;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.rider.state.cashblock.api.presentation.CashBlockUiModel;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.settings.SettingsFragment;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.ShortNewsContentCardView;
import o.buildMapping;
import o.createFromParcel;
import o.getBaseUrl;
import o.getBirthDateFull;
import o.getConnectionOptions;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getInstallSessionBackoffStrategy;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.p7;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.registerInAppMessageManagerlambda0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CashBlockKt {
    private static int read = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[PHI: r2
  0x0061: PHI (r2v18 o.getConnectionOptions) = (r2v13 o.getConnectionOptions), (r2v24 o.getConnectionOptions) binds: [B:26:0x0075, B:22:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0077 A[PHI: r2
  0x0077: PHI (r2v14 o.getConnectionOptions) = (r2v13 o.getConnectionOptions), (r2v24 o.getConnectionOptions) binds: [B:26:0x0075, B:22:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    public static final void CashBlock(CashBlockUiModel cashBlockUiModel, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getConnectionOptions getconnectionoptions;
        int i3;
        boolean z;
        Object objComponentActivity;
        boolean z2;
        Object objComponentActivity2;
        int i4;
        int i5 = 2 % 2;
        cashBlockUiModel.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-522621131);
        if ((i & 6) == 0) {
            if (getpostalcode.read(cashBlockUiModel)) {
                int i6 = write + 27;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    i4 = 2;
                } else {
                    i4 = 4;
                }
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            int i7 = read + 13;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                getconnectionoptions = (getConnectionOptions) ExtrasKt.write(((CashBlockUiModelImpl) cashBlockUiModel).MediaDescriptionCompat, getpostalcode, 1).getValue();
                if (!(getconnectionoptions instanceof getBaseUrl)) {
                    if (getconnectionoptions instanceof getInstallSessionBackoffStrategy) {
                        getpostalcode.serializer(272278361);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, 272268788, false);
                    }
                } else {
                    int i8 = read + 59;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    getpostalcode.serializer(272271816);
                    getBaseUrl getbaseurl = (getBaseUrl) getconnectionoptions;
                    i3 = i2 & 14;
                    if (i3 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objComponentActivity = getpostalcode.ComponentActivity();
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (!z || objComponentActivity == androidContentCaptureManager) {
                        CashBlockKt$CashBlock$1$1 cashBlockKt$CashBlock$1$1 = new CashBlockKt$CashBlock$1$1(0, cashBlockUiModel, CashBlockUiModel.class, "onComponentDisplayed", "onComponentDisplayed()V", 0, 0);
                        getpostalcode.write(cashBlockKt$CashBlock$1$1);
                        objComponentActivity = cashBlockKt$CashBlock$1$1;
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                    if (i3 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (!z2 || objComponentActivity2 == androidContentCaptureManager) {
                        SettingsFragment.AnonymousClass1 anonymousClass1 = new SettingsFragment.AnonymousClass1(1, cashBlockUiModel, CashBlockUiModel.class, "onButtonClicked", "onButtonClicked(Ljava/lang/String;)V", 0, 19);
                        getpostalcode.write(anonymousClass1);
                        objComponentActivity2 = anonymousClass1;
                    }
                    CashBlockColumn(getbaseurl, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), null, getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                getconnectionoptions = (getConnectionOptions) ExtrasKt.write(((CashBlockUiModelImpl) cashBlockUiModel).MediaDescriptionCompat, getpostalcode, 0).getValue();
                if (!(getconnectionoptions instanceof getBaseUrl)) {
                    if (getconnectionoptions instanceof getInstallSessionBackoffStrategy) {
                        getpostalcode.serializer(272278361);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, 272268788, false);
                    }
                } else {
                    int i10 = read + 59;
                    write = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    getpostalcode.serializer(272271816);
                    getBaseUrl getbaseurl2 = (getBaseUrl) getconnectionoptions;
                    i3 = i2 & 14;
                    if (i3 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objComponentActivity = getpostalcode.ComponentActivity();
                    AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                    if (!z) {
                        CashBlockKt$CashBlock$1$1 cashBlockKt$CashBlock$1$2 = new CashBlockKt$CashBlock$1$1(0, cashBlockUiModel, CashBlockUiModel.class, "onComponentDisplayed", "onComponentDisplayed()V", 0, 0);
                        getpostalcode.write(cashBlockKt$CashBlock$1$2);
                        objComponentActivity = cashBlockKt$CashBlock$1$2;
                    } else {
                        CashBlockKt$CashBlock$1$1 cashBlockKt$CashBlock$1$3 = new CashBlockKt$CashBlock$1$1(0, cashBlockUiModel, CashBlockUiModel.class, "onComponentDisplayed", "onComponentDisplayed()V", 0, 0);
                        getpostalcode.write(cashBlockKt$CashBlock$1$3);
                        objComponentActivity = cashBlockKt$CashBlock$1$3;
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                    if (i3 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (!z2) {
                        SettingsFragment.AnonymousClass1 anonymousClass2 = new SettingsFragment.AnonymousClass1(1, cashBlockUiModel, CashBlockUiModel.class, "onButtonClicked", "onButtonClicked(Ljava/lang/String;)V", 0, 19);
                        getpostalcode.write(anonymousClass2);
                        objComponentActivity2 = anonymousClass2;
                    } else {
                        SettingsFragment.AnonymousClass1 anonymousClass3 = new SettingsFragment.AnonymousClass1(1, cashBlockUiModel, CashBlockUiModel.class, "onButtonClicked", "onButtonClicked(Ljava/lang/String;)V", 0, 19);
                        getpostalcode.write(anonymousClass3);
                        objComponentActivity2 = anonymousClass3;
                    }
                    CashBlockColumn(getbaseurl2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), null, getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(cashBlockUiModel, i, 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0093 A[PHI: r6
  0x0093: PHI (r6v17 androidx.compose.ui.Modifier$Companion) = (r6v16 androidx.compose.ui.Modifier$Companion), (r6v35 androidx.compose.ui.Modifier$Companion) binds: [B:43:0x0091, B:40:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0096 A[PHI: r6
  0x0096: PHI (r6v33 androidx.compose.ui.Modifier$Companion) = (r6v16 androidx.compose.ui.Modifier$Companion), (r6v35 androidx.compose.ui.Modifier$Companion) binds: [B:43:0x0091, B:40:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0230  */
    /* JADX WARN: Code duplicated, block: B:76:0x0246  */
    public static final void CashBlockColumn(getBaseUrl getbaseurl, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        boolean z;
        boolean z2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1893179894);
        if ((i & 6) == 0) {
            if (!(!((i & 8) == 0 ? getpostalcode.read(getbaseurl) : getpostalcode.IconCompatParcelizer(getbaseurl)))) {
                int i5 = write + 73;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                int i7 = write + 125;
                read = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 4 / 5;
                }
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i9 = i2 | 3072;
        if (getpostalcode.write(i9 & 1, (i9 & 1171) != 1170)) {
            int i10 = read + 59;
            write = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                companion = Modifier.Companion;
                if ((i9 & 88) == 2) {
                    companion2 = companion;
                    z = true;
                } else {
                    companion2 = companion;
                    z = false;
                }
            } else {
                companion = Modifier.Companion;
                if ((i9 & 112) == 32) {
                    companion2 = companion;
                    z = true;
                } else {
                    companion2 = companion;
                    z = false;
                }
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (z || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, shortNewsContentCardView, 9);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, createFromParcel.INSTANCE, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            Modifier modifierWrite = SizeKt.write(companion2, 1.0f);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierWrite, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
            float f = Dimensions.setTabContainer;
            Modifier modifierM20backgroundbw27NRU2 = BackgroundKt.m20backgroundbw27NRU(PaddingKt.m74paddingqDBjuR0$default(PaddingKt.m73paddingVpY3zN4$default(modifierM20backgroundbw27NRU, f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setShowingForActionMode(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding));
            float f2 = Dimensions.setTransitioning;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifierM20backgroundbw27NRU2, f2, 0.0f, 2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode.ComponentActivity) {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                int i11 = read + 35;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                getpostalcode.serializer(constructor);
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            boolean z3 = false;
            Modifier.Companion companion4 = companion2;
            TextKt.m131TextNvy7gAk(getbaseurl.write, PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, f2, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getWindowSystemUiVisibility(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131064);
            TextKt.m131TextNvy7gAk(getbaseurl.RemoteActionCompatParcelizer, PaddingKt.m74paddingqDBjuR0$default(companion4, 0.0f, Dimensions.setPrimaryBackground, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, 0, 0, 131064);
            String str = getbaseurl.IconCompatParcelizer;
            Modifier modifierM73paddingVpY3zN4$default2 = PaddingKt.m73paddingVpY3zN4$default(companion4, 0.0f, Dimensions.setSplitBackground, 1);
            modifierM73paddingVpY3zN4$default2.getClass();
            if ((i9 & 896) == 256) {
                int i13 = read + 31;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i9 & 14) == 4) {
                z3 = true;
            } else if ((i9 & 8) != 0) {
                int i15 = write + 77;
                read = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    int i16 = 31 / 0;
                    if (getpostalcode.IconCompatParcelizer(getbaseurl)) {
                        z3 = true;
                    }
                } else if (getpostalcode.IconCompatParcelizer(getbaseurl)) {
                    z3 = true;
                }
            }
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (!z2 && !z3) {
                int i17 = read + 117;
                write = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new OtpNavigationKt$$ExternalSyntheticLambda4(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 24, getbaseurl);
                    getpostalcode.write(objComponentActivity2);
                }
            } else {
                objComponentActivity2 = new OtpNavigationKt$$ExternalSyntheticLambda4(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 24, getbaseurl);
                getpostalcode.write(objComponentActivity2);
            }
            TertiaryKt.IconCompatParcelizer(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, modifierM73paddingVpY3zN4$default2, false, R.drawable.ic_bold_small_arrow_right, null, null, null, getpostalcode, 0, 232);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion4;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) getbaseurl, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, i, 17);
        }
    }
}
