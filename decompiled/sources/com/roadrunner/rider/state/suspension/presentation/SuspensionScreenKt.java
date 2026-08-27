package com.roadrunner.rider.state.suspension.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.freelancing.presentation.WorkNowRowKt$WorkNowRow$1$1;
import com.roadrunner.rider.state.suspension.api.SuspensionUiModel;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.settings.SettingsFragment;
import com.roadrunner.settings.ui.screens.SettingsScreenKt$SettingsScreen$2$1;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.ShortNewsContentCardView;
import o.buildMapping;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLicenseVerificationTracked;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getPushToken;
import o.p7;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdarMv397hzZJazOE3eMmLe0m6ePY0;
import o.registerInAppMessageManagerlambda0;
import o.removeDeeplink;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SuspensionScreenKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    public static final void SuspensionScreen(SuspensionUiModel suspensionUiModel, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = write + 83;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        suspensionUiModel.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-171724316);
        if ((i & 6) == 0) {
            if (!getpostalcode.read(suspensionUiModel)) {
                i3 = 2;
            } else {
                int i7 = IconCompatParcelizer + 75;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if ((i9 & 19) != 18) {
            int i10 = write + 71;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            modifier2 = Modifier.Companion;
            getPushToken getpushtoken = (getPushToken) ExtrasKt.write(((SuspensionUiModelImpl) suspensionUiModel).RatingCompat, getpostalcode, 0).getValue();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpushtoken, getLicenseVerificationTracked.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                getpostalcode.serializer(-1818303768);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(getpushtoken instanceof removeDeeplink)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1818304788, false);
                }
                int i12 = write + 39;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                getpostalcode.serializer(-1818302624);
                removeDeeplink removedeeplink = (removeDeeplink) getpushtoken;
                int i14 = i9 & 14;
                boolean z2 = i14 == 4;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z2) {
                    SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$1 = new SettingsScreenKt$SettingsScreen$2$1(0, suspensionUiModel, SuspensionUiModel.class, "onComponentDisplayed", "onComponentDisplayed()V", 0, 11);
                    getpostalcode.write(settingsScreenKt$SettingsScreen$2$1);
                    objComponentActivity = settingsScreenKt$SettingsScreen$2$1;
                } else {
                    int i15 = IconCompatParcelizer + 105;
                    write = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        int i16 = 19 / 0;
                        if (objComponentActivity == androidContentCaptureManager) {
                            SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$2 = new SettingsScreenKt$SettingsScreen$2$1(0, suspensionUiModel, SuspensionUiModel.class, "onComponentDisplayed", "onComponentDisplayed()V", 0, 11);
                            getpostalcode.write(settingsScreenKt$SettingsScreen$2$2);
                            objComponentActivity = settingsScreenKt$SettingsScreen$2$2;
                        }
                    } else if (objComponentActivity == androidContentCaptureManager) {
                        SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$3 = new SettingsScreenKt$SettingsScreen$2$1(0, suspensionUiModel, SuspensionUiModel.class, "onComponentDisplayed", "onComponentDisplayed()V", 0, 11);
                        getpostalcode.write(settingsScreenKt$SettingsScreen$2$3);
                        objComponentActivity = settingsScreenKt$SettingsScreen$2$3;
                    }
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                boolean z3 = i14 == 4;
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                    SettingsFragment.AnonymousClass1 anonymousClass1 = new SettingsFragment.AnonymousClass1(1, suspensionUiModel, SuspensionUiModel.class, "onButtonClicked", "onButtonClicked(Lcom/roadrunner/rider/state/suspension/api/SuspensionActionType;)V", 0, 28);
                    getpostalcode.write(anonymousClass1);
                    objComponentActivity2 = anonymousClass1;
                }
                SuspensionScreenContent(removedeeplink, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), modifier2, getpostalcode, (i9 << 6) & 7168);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i17 = write + 47;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, 7, suspensionUiModel, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:86:0x0266 A[PHI: r6 r9
  0x0266: PHI (r6v33 androidx.compose.ui.Modifier) = (r6v32 androidx.compose.ui.Modifier), (r6v49 androidx.compose.ui.Modifier) binds: [B:85:0x0264, B:82:0x0242] A[DONT_GENERATE, DONT_INLINE]
  0x0266: PHI (r9v8 int) = (r9v7 int), (r9v13 int) binds: [B:85:0x0264, B:82:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x0269 A[PHI: r6 r9
  0x0269: PHI (r6v47 androidx.compose.ui.Modifier) = (r6v32 androidx.compose.ui.Modifier), (r6v49 androidx.compose.ui.Modifier) binds: [B:85:0x0264, B:82:0x0242] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r9v11 int) = (r9v7 int), (r9v13 int) binds: [B:85:0x0264, B:82:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void SuspensionScreenContent(removeDeeplink removedeeplink, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        boolean z2;
        getPostalCode getpostalcode2;
        int i3;
        Modifier modifierM74paddingqDBjuR0$default;
        Modifier modifier2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        boolean zIconCompatParcelizer;
        int i5 = 2 % 2;
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        getpostalcode3.MediaSessionCompatQueueItem(-1921695797);
        ShortNewsContentCardView shortNewsContentCardView = null;
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode3.IconCompatParcelizer(removedeeplink);
            } else {
                int i6 = write + 89;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    zIconCompatParcelizer = getpostalcode3.read(removedeeplink);
                } else {
                    getpostalcode3.read(removedeeplink);
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (!getpostalcode3.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i4 = Fields.SpotShadowColor;
            } else {
                int i7 = IconCompatParcelizer + 61;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = Fields.RotationX;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode3.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i9 = i2;
        if ((i9 & 1171) != 1170) {
            int i10 = write + 7;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode3.write(i9 & 1, z)) {
            int i11 = IconCompatParcelizer + 57;
            write = i11 % Fields.SpotShadowColor;
            boolean z6 = i11 % 2 != 0 ? (i9 & 112) == 32 : (i9 & 41) == 27;
            Object objComponentActivity = getpostalcode3.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z6 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, shortNewsContentCardView, 11);
                getpostalcode3.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode3, createFromParcel.INSTANCE, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(SizeKt.write(modifier, 1.0f), Dimensions.setLogo, Dimensions.setActionBarVisibilityCallback);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.write, Alignment.Companion.getStart(), getpostalcode3, 54);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode3.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i12 = write + 77;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    getpostalcode3.serializer(constructor);
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode3, modalBottomSheetYbuCTN8Serializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                String str = removedeeplink.serializer;
                String str2 = removedeeplink.read;
                TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).getWindowSystemUiVisibility(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode3, 0, 0, 131066);
                AnnotatedString annotatedString = removedeeplink.write;
                if (annotatedString != null) {
                    getpostalcode3.serializer(2145500866);
                    z2 = false;
                    TextKt.m132TextZ58ophY(annotatedString, PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setSplitBackground, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, performLayout.IconCompatParcelizer(), getpostalcode3, 0, 0, 262136);
                    getpostalcode2 = getpostalcode3;
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    int i13 = write + 125;
                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 != 0) {
                        getpostalcode2 = getpostalcode3;
                        getpostalcode2.serializer(2145500865);
                        z5 = false;
                    } else {
                        getpostalcode2 = getpostalcode3;
                        z5 = false;
                        getpostalcode2.serializer(2145500865);
                    }
                    getpostalcode2.IconCompatParcelizer(z5);
                    z2 = z5;
                }
                if (str2 != null && removedeeplink.RemoteActionCompatParcelizer != null) {
                    int i14 = IconCompatParcelizer + 101;
                    write = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        getpostalcode2.serializer(2145845741);
                        modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(Modifier.Companion, 1.0f), 2.0f, Dimensions.setTabContainer, 2.0f, 2.0f, 56);
                        i3 = i9;
                        if ((i3 & 30057) == 15195) {
                            modifier2 = modifierM74paddingqDBjuR0$default;
                            z3 = true;
                        } else {
                            z3 = z2;
                            modifier2 = modifierM74paddingqDBjuR0$default;
                        }
                    } else {
                        i3 = i9;
                        getpostalcode2.serializer(2145845741);
                        modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(Modifier.Companion, 1.0f), 0.0f, Dimensions.setTabContainer, 0.0f, 0.0f, 13);
                        if ((i3 & 896) == 256) {
                            modifier2 = modifierM74paddingqDBjuR0$default;
                            z3 = true;
                        } else {
                            z3 = z2;
                            modifier2 = modifierM74paddingqDBjuR0$default;
                        }
                    }
                    if ((i3 & 14) == 4) {
                        z4 = true;
                    } else {
                        if ((i3 & 8) != 0) {
                            int i15 = write + 15;
                            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                            if (i15 % 2 == 0) {
                                if (getpostalcode2.IconCompatParcelizer(removedeeplink)) {
                                    z4 = true;
                                }
                            } else {
                                getpostalcode2.IconCompatParcelizer(removedeeplink);
                                throw null;
                            }
                        }
                        z4 = z2;
                    }
                    Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                    if ((z4 | z3) || objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 7, removedeeplink);
                        getpostalcode2.write(objComponentActivity2);
                    }
                    getpostalcode = getpostalcode2;
                    PrimaryKt.write(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, modifier2, false, false, null, null, null, null, null, getpostalcode, 0, 0, 2040);
                    getpostalcode.IconCompatParcelizer(z2);
                } else {
                    getpostalcode = getpostalcode2;
                    getpostalcode.serializer(2146120897);
                    getpostalcode.IconCompatParcelizer(z2);
                }
                getpostalcode.IconCompatParcelizer(true);
            } else {
                Object obj = null;
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z7 = getpostalcode3.ComponentActivity;
                obj.hashCode();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode3;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) removedeeplink, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, i, 20);
        }
    }
}
