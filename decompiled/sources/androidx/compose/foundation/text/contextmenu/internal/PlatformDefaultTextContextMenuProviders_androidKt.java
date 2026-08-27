package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.PopupProperties;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.CircularProgressIndicatorTokens;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessmaterializeImpl;
import o.composed;
import o.getAccessibilityExtraKeyui;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getDefaultNSsRyOo;
import o.getHandleruiannotations;
import o.getKindSetui;
import o.getNewPassword;
import o.getPostalCode;
import o.hideTranslatedText;
import o.materialize;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.unboximpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlatformDefaultTextContextMenuProviders_androidKt {
    public static final void ProvideBothDefaultProviders(Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(790527681);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = CompositionKt.serializer((Object) null, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
                getpostalcode.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7, 4);
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
            PopupProperties popupProperties = materialize.write;
            BasicTextContextMenuProvider basicTextContextMenuProviderSerializer = getDefaultNSsRyOo.serializer(composed.RemoteActionCompatParcelizer, getpostalcode, 6);
            AndroidContentCaptureManagerCompanion.IconCompatParcelizer(new hideTranslatedText[]{unboximpl.RemoteActionCompatParcelizer.write(accessmaterializeImpl.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, 2)), unboximpl.write.write(basicTextContextMenuProviderSerializer)}, ExtrasKt.write(1070596993, new getAccessibilityExtraKeyui(modifier, populateViewStructure_androidKtpopulate7, dragAndDropTargetModifierNode, basicTextContextMenuProviderSerializer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 1), getpostalcode), getpostalcode, 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKindSetui(modifier, dragAndDropTargetModifierNode, i, 5);
        }
    }

    public static final void ProvideDefaultPlatformTextContextMenuProviders(Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(155925518);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            boolean z = getpostalcode.write((getNewPassword) unboximpl.write) != null;
            boolean z2 = getpostalcode.write((getNewPassword) unboximpl.RemoteActionCompatParcelizer) != null;
            if (z && z2) {
                getpostalcode.serializer(-1977187922);
                MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), true);
                int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
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
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i2 >> 3) & 14));
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
            } else if (z) {
                getpostalcode.serializer(-1976997706);
                accessmaterializeImpl.write(modifier, dragAndDropTargetModifierNode, getpostalcode, i2 & 126);
                getpostalcode.IconCompatParcelizer(false);
            } else if (z2) {
                getpostalcode.serializer(-1976846922);
                materialize.IconCompatParcelizer(modifier, dragAndDropTargetModifierNode, getpostalcode, i2 & 126);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1976716505);
                ProvideBothDefaultProviders(modifier, dragAndDropTargetModifierNode, getpostalcode, i2 & 126);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKindSetui(modifier, dragAndDropTargetModifierNode, i, 4);
        }
    }
}
