package com.roadrunner.rider.state.onpause.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.rider.state.onpause.api.presentation.OnPauseUiModel;
import com.roadrunner.settings.SettingsFragment;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.deepCopy;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPackageInfo;
import o.getPackageName;
import o.getPostalCode;
import o.getScreenDensity;
import o.hasRootCause;
import o.isValidParameter;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdarMv397hzZJazOE3eMmLe0m6ePY0;
import o.registerInAppMessageManagerlambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OnPauseScreenKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    public static final void OnPauseScreen(OnPauseUiModel onPauseUiModel, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 13;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        onPauseUiModel.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1884926284);
        if ((i & 6) == 0) {
            int i7 = RemoteActionCompatParcelizer + 109;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 22 / 0;
                if (!getpostalcode.read(onPauseUiModel)) {
                    i3 = 2;
                } else {
                    int i9 = write + 77;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i3 = 4;
                }
            } else if (getpostalcode.read(onPauseUiModel)) {
                int i11 = write + 77;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i13 = i2 | 48;
        if ((i13 & 19) != 18) {
            int i14 = RemoteActionCompatParcelizer + 79;
            write = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i13 & 1, z)) {
            int i16 = write + 11;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            modifier2 = Modifier.Companion;
            getPackageName getpackagename = (getPackageName) ExtrasKt.write(((OnPauseUiModelImpl) onPauseUiModel).MediaSessionCompatResultReceiverWrapper, getpostalcode, 0).getValue();
            if (getpackagename instanceof getPackageInfo) {
                getpostalcode.serializer(1062046648);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(getpackagename instanceof getScreenDensity)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1062045401, false);
                }
                int i18 = write + 105;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                getpostalcode.serializer(-1436256163);
                getScreenDensity getscreendensity = (getScreenDensity) getpackagename;
                boolean z2 = (i13 & 14) == 4;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (z2 || objComponentActivity == getCreditCardExpirationMonth.write) {
                    SettingsFragment.AnonymousClass1 anonymousClass1 = new SettingsFragment.AnonymousClass1(1, onPauseUiModel, OnPauseUiModel.class, "onActionClicked", "onActionClicked(Lcom/roadrunner/rider/state/provider/api/domain/model/StatusAction;)V", 0, 23);
                    getpostalcode.write(anonymousClass1);
                    objComponentActivity = anonymousClass1;
                }
                OnPauseContent(getscreendensity, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), modifier2, getpostalcode, (i13 << 3) & 896);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, 2, onPauseUiModel, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074 A[PHI: r2
  0x0074: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0037, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0039 A[PHI: r2
  0x0039: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0037, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void OnPauseContent(getScreenDensity getscreendensity, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = write + 85;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        Object obj = null;
        if (i8 % 2 != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(695315429);
            if ((i & 7) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getscreendensity);
                } else {
                    i5 = RemoteActionCompatParcelizer + 75;
                    write = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        zIconCompatParcelizer = getpostalcode.read(getscreendensity);
                    } else {
                        getpostalcode.read(getscreendensity);
                        obj.hashCode();
                        throw null;
                    }
                }
                if (zIconCompatParcelizer) {
                    i4 = RemoteActionCompatParcelizer + 29;
                    write = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 5;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                int i9 = RemoteActionCompatParcelizer + 31;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                i3 = i;
            }
        } else {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(695315429);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getscreendensity);
                } else {
                    i5 = RemoteActionCompatParcelizer + 75;
                    write = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        zIconCompatParcelizer = getpostalcode.read(getscreendensity);
                    } else {
                        getpostalcode.read(getscreendensity);
                        obj.hashCode();
                        throw null;
                    }
                }
                if (zIconCompatParcelizer) {
                    i4 = RemoteActionCompatParcelizer + 29;
                    write = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 5;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                int i11 = RemoteActionCompatParcelizer + 31;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i13 = RemoteActionCompatParcelizer + 109;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i6 = Fields.RotationX;
            } else {
                i6 = Fields.SpotShadowColor;
            }
            i3 |= i6;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            float f = Dimensions.getAnimatedVisibility;
            float f2 = Dimensions.setTabContainer;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierWrite, f, f2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 48);
            int i15 = i3;
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i16 = RemoteActionCompatParcelizer + 75;
            write = i16 % Fields.SpotShadowColor;
            if (i16 % 2 == 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i17 = 76 / 0;
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            } else {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode.ComponentActivity)) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            TextKt.m131TextNvy7gAk(getscreendensity.write, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
            deepCopy deepcopy = getscreendensity.RemoteActionCompatParcelizer;
            if (deepcopy != null) {
                getpostalcode.serializer(-949643251);
                Modifier modifierWrite2 = SizeKt.write(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, f2, 0.0f, 0.0f, 13), 1.0f);
                String str = deepcopy.RemoteActionCompatParcelizer;
                hasRootCause hasrootcause = hasRootCause.START;
                boolean z = (i15 & 112) == 32;
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(deepcopy);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((zIconCompatParcelizer2 | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new OtpNavigationKt$$ExternalSyntheticLambda4(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 29, deepcopy);
                    getpostalcode.write(objComponentActivity);
                }
                isValidParameter.RemoteActionCompatParcelizer(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierWrite2, false, false, Integer.valueOf(R.drawable.ic_bold_large_essentials_play_circle_filled), hasrootcause, null, null, getpostalcode, 1572864, 920);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-949239321);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 11, getscreendensity, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier);
        }
    }
}
