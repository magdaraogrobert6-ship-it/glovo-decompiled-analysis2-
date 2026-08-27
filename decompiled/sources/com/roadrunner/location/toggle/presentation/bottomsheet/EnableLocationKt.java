package com.roadrunner.location.toggle.presentation.bottomsheet;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.location.toggle.api.bottomsheet.EnableLocationUiModel;
import com.roadrunner.login.presentation.LoginActivity$onCreate$1$1$1$1$5$1;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.SchedulersExternalSyntheticLambda1;
import o.UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1;
import o.WorkerWrapper;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.internalPathIteratorPeek;
import o.p2;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EnableLocationKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    public static final void EnableLocation(EnableLocationUiModel enableLocationUiModel, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        enableLocationUiModel.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1762453078);
        if ((i & 6) == 0) {
            if (getpostalcode.read(enableLocationUiModel)) {
                int i5 = IconCompatParcelizer + 61;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
            int i7 = IconCompatParcelizer + 101;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if (getpostalcode.write(i9 & 1, (i9 & 19) != 18)) {
            modifier2 = Modifier.Companion;
            SchedulersExternalSyntheticLambda1 schedulersExternalSyntheticLambda1 = (SchedulersExternalSyntheticLambda1) ExtrasKt.write(((EnableLocationUiModelImpl) enableLocationUiModel).MediaMetadataCompat, getpostalcode, 0).getValue();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{schedulersExternalSyntheticLambda1, WorkerWrapper.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                int i10 = IconCompatParcelizer + 111;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    getpostalcode.serializer(-735347353);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    getpostalcode.serializer(-735347353);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                if (!(schedulersExternalSyntheticLambda1 instanceof UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1500296822, false);
                }
                getpostalcode.serializer(1500301962);
                UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1 unfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1 = (UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1) schedulersExternalSyntheticLambda1;
                boolean z = (i9 & 14) == 4;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (!z) {
                    int i11 = RemoteActionCompatParcelizer + 19;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        LoginActivity$onCreate$1$1$1$1$5$1 loginActivity$onCreate$1$1$1$1$5$1 = new LoginActivity$onCreate$1$1$1$1$5$1(0, enableLocationUiModel, EnableLocationUiModel.class, "onEnableClick", "onEnableClick()V", 0, 21);
                        getpostalcode.write(loginActivity$onCreate$1$1$1$1$5$1);
                        objComponentActivity = loginActivity$onCreate$1$1$1$1$5$1;
                    }
                } else {
                    LoginActivity$onCreate$1$1$1$1$5$1 loginActivity$onCreate$1$1$1$1$5$2 = new LoginActivity$onCreate$1$1$1$1$5$1(0, enableLocationUiModel, EnableLocationUiModel.class, "onEnableClick", "onEnableClick()V", 0, 21);
                    getpostalcode.write(loginActivity$onCreate$1$1$1$1$5$2);
                    objComponentActivity = loginActivity$onCreate$1$1$1$1$5$2;
                }
                EnableLocationContent(unfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), modifier2, getpostalcode, (i9 << 3) & 896);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 15, enableLocationUiModel, modifier2);
        }
    }

    public static final void EnableLocationContent(UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1 unfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1853645150);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i5 = RemoteActionCompatParcelizer + 125;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                zIconCompatParcelizer = getpostalcode.read(unfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(unfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = RemoteActionCompatParcelizer + 113;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i3 = 32;
            } else {
                int i9 = RemoteActionCompatParcelizer + 41;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierWrite, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            float f = Dimensions.getAnimatedVisibility;
            float f2 = Dimensions.setTabContainer;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierM20backgroundbw27NRU, f, f2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
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
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            TextKt.m131TextNvy7gAk(unfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1.serializer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
            Modifier.Companion companion2 = Modifier.Companion;
            Object[] objArr = {getpostalcode, SizeKt.m83size3ABfNKs(companion2, Dimensions.setPrimaryBackground)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
            Modifier modifierWrite2 = SizeKt.write(PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, f2, 0.0f, 0.0f, 13), 1.0f);
            modifierWrite2.getClass();
            PrimaryKt.write(unfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1.write, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierWrite2, false, false, null, null, null, null, null, getpostalcode, i2 & 112, 0, 2040);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 24, unfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
        }
        int i11 = IconCompatParcelizer + 21;
        RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
    }
}
