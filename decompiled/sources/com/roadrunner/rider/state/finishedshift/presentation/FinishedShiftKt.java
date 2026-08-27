package com.roadrunner.rider.state.finishedshift.presentation;

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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rider.state.finishedshift.api.presentation.FinishedShiftUiModel;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.p2;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdayLzRZVFM4MK2pbhBUcln0OaOVsk;
import o.setCurrentSemanticsNodesui;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FinishedShiftKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e A[PHI: r8
  0x004e: PHI (r8v5 o.getPostalCode) = (r8v1 o.getPostalCode), (r8v6 o.getPostalCode) binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002a A[PHI: r8
  0x002a: PHI (r8v2 o.getPostalCode) = (r8v1 o.getPostalCode), (r8v6 o.getPostalCode) binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void serializer(FinishedShiftUiModel finishedShiftUiModel, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 67;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            finishedShiftUiModel.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(674710184);
            if ((i & 33) == 0) {
                i2 = IconCompatParcelizer + 55;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    getpostalcode.read(finishedShiftUiModel);
                    throw null;
                }
                if (getpostalcode.read(finishedShiftUiModel)) {
                    int i7 = IconCompatParcelizer + 5;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            finishedShiftUiModel.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(674710184);
            if ((i & 6) == 0) {
                i2 = IconCompatParcelizer + 55;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    getpostalcode.read(finishedShiftUiModel);
                    throw null;
                }
                if (getpostalcode.read(finishedShiftUiModel)) {
                    int i9 = IconCompatParcelizer + 5;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        int i11 = i4 | 48;
        if ((i11 & 19) != 18) {
            int i12 = RemoteActionCompatParcelizer + 53;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i11 & 1, z)) {
            modifier = Modifier.Companion;
            FinishedShiftUiModelImpl finishedShiftUiModelImpl = (FinishedShiftUiModelImpl) finishedShiftUiModel;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(finishedShiftUiModelImpl.RemoteActionCompatParcelizer, getpostalcode, 0);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = ExtrasKt.write(finishedShiftUiModelImpl.MediaSessionCompatQueueItem, getpostalcode, 0);
            if (((Boolean) populateViewStructure_androidKtpopulate7Write.getValue()).booleanValue()) {
                getpostalcode.serializer(-155600867);
                FinishedShiftColumn((r8lambdayLzRZVFM4MK2pbhBUcln0OaOVsk) populateViewStructure_androidKtpopulate7Write2.getValue(), SizeKt.write(modifier, 1.0f), getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-155480742);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 27, finishedShiftUiModel, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    public static final void FinishedShiftColumn(r8lambdayLzRZVFM4MK2pbhBUcln0OaOVsk r8lambdaylzrzvfm4mk2pbhbucln0oaovsk, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-160202870);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(r8lambdaylzrzvfm4mk2pbhbucln0oaovsk);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(r8lambdaylzrzvfm4mk2pbhbucln0oaovsk);
            }
            if (zIconCompatParcelizer) {
                int i6 = RemoteActionCompatParcelizer + 121;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    i4 = 2;
                } else {
                    i4 = 4;
                }
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            int i7 = IconCompatParcelizer + 79;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = IconCompatParcelizer + 33;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (getpostalcode2.read(modifier)) {
                int i11 = IconCompatParcelizer + 47;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                i3 = i11 % 2 != 0 ? 92 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i12 = IconCompatParcelizer + 59;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierWrite = PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), Dimensions.getAnimatedVisibility);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                getNonZeroRgk1Os.write(Integer.valueOf(R.drawable.ic_waiting), "", SizeKt.m86width3ABfNKs(SizeKt.m75height3ABfNKs(Modifier.Companion, Dimensions.onTrimMemory), Dimensions.onRetainNonConfigurationInstance), Okio.RemoteActionCompatParcelizer(R.drawable.ic_waiting, getpostalcode2, 0), null, null, null, null, null, null, getpostalcode2, (Painter.$stable << 9) | 48, 0, 32752);
                TextKt.m131TextNvy7gAk(r8lambdaylzrzvfm4mk2pbhbucln0oaovsk.write, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 0, 131066);
                getpostalcode = getpostalcode2;
                TextKt.m131TextNvy7gAk(r8lambdaylzrzvfm4mk2pbhbucln0oaovsk.serializer, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getActionBarHideOffset(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaBrowserCompatMediaItem(), getpostalcode, 0, 0, 131066);
                getpostalcode.IconCompatParcelizer(true);
                int i14 = RemoteActionCompatParcelizer + 27;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 28, r8lambdaylzrzvfm4mk2pbhbucln0oaovsk, modifier);
        }
    }
}
