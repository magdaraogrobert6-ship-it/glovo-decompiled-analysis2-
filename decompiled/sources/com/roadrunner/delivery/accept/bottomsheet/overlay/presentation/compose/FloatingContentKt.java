package com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import kotlinx.coroutines.flow.StateFlow;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TextMeasurerHelperKt;
import o.drawTextLVfH_YUdefault;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getFragment;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.getVerbatim;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FloatingContentKt {
    private static int read = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:55:0x00bd  */
    public static final void FloatingContent(getPlatformAndroidManager getplatformandroidmanager, SignInDataStore signInDataStore, drawTextLVfH_YUdefault drawtextlvfh_yudefault, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        int i2 = 2 % 2;
        getplatformandroidmanager.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1649157360);
        int i3 = (i & 6) == 0 ? (getpostalcode.read(getplatformandroidmanager) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(signInDataStore) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.read(drawtextlvfh_yudefault) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= !(getpostalcode.read(modifier) ^ true) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 1171) != 1170)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = CompositionKt.read(0);
                getpostalcode.write(objComponentActivity);
            }
            getPlatformAndroidManager getplatformandroidmanager2 = (getPlatformAndroidManager) objComponentActivity;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write((StateFlow) signInDataStore.read, getpostalcode, 0);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new TextMeasurerHelperKt(getplatformandroidmanager2, 2);
                getpostalcode.write(objComponentActivity2);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2);
            boolean z2 = (i3 & 14) == 4;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z2) {
                objComponentActivity3 = new SessionDao_Impl$$ExternalSyntheticLambda1(getplatformandroidmanager, 14, getplatformandroidmanager2);
                getpostalcode.write(objComponentActivity3);
            } else {
                int i4 = write + 51;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 77 / 0;
                    if (objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new SessionDao_Impl$$ExternalSyntheticLambda1(getplatformandroidmanager, 14, getplatformandroidmanager2);
                        getpostalcode.write(objComponentActivity3);
                    }
                } else if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new SessionDao_Impl$$ExternalSyntheticLambda1(getplatformandroidmanager, 14, getplatformandroidmanager2);
                    getpostalcode.write(objComponentActivity3);
                }
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierOnGloballyPositioned, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3);
            float f = Dimensions.setTabContainer;
            Modifier modifierWrite = PaddingKt.write(modifierGraphicsLayer, f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(f), Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            Object obj = null;
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i6 = read + 71;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z3 = getpostalcode.ComponentActivity;
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
            getpostalcode.serializer(-1698032089);
            for (getFragment getfragment : (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate7Write.getValue()) {
                int i7 = read + 115;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                getfragment.getClass();
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = getfragment instanceof getVerbatim ? new DragAndDropTargetModifierNode(new GapComposerKt$$ExternalSyntheticLambda0(drawtextlvfh_yudefault, 14, (getVerbatim) getfragment), true, 183347712) : null;
                if (dragAndDropTargetModifierNode == null) {
                    int i9 = read + 111;
                    write = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        getpostalcode.serializer(1143691421);
                        obj.hashCode();
                        throw null;
                    }
                    getpostalcode.serializer(1143691421);
                    z = false;
                } else {
                    getpostalcode.serializer(452535268);
                    z = false;
                    dragAndDropTargetModifierNode.invoke(getpostalcode, 0);
                }
                getpostalcode.IconCompatParcelizer(z);
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) getplatformandroidmanager, (Object) signInDataStore, (Object) drawtextlvfh_yudefault, modifier, i, 7);
        }
        int i10 = write + 95;
        read = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
    }
}
