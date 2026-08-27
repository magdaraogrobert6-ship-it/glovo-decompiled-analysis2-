package o;

import android.view.View;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessmaterializeImpl {
    public static final androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider write(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        View view = (View) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
        boolean z = getpostalcode.read(view);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (z || objComponentActivity == androidContentCaptureManager) {
            objComponentActivity = new androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider(view, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            getpostalcode.write(objComponentActivity);
        }
        androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = (androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider) objComponentActivity;
        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(androidTextContextMenuToolbarProvider);
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if (zIconCompatParcelizer || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = new ComposeUiFlags(androidTextContextMenuToolbarProvider, 3);
            getpostalcode.write(objComponentActivity2);
        }
        getPhoneNumberNational.serializer(androidTextContextMenuToolbarProvider, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode);
        return androidTextContextMenuToolbarProvider;
    }

    public static final void RemoteActionCompatParcelizer(androidx.compose.ui.Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(771959668);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer((Object) null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = androidx.compose.runtime.CompositionKt.serializer((Object) null, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
                getpostalcode.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7, 3);
                getpostalcode.write(objComponentActivity2);
            }
            AndroidContentCaptureManagerCompanion.read(unboximpl.RemoteActionCompatParcelizer.write(write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, getpostalcode, 0)), coil3.ExtrasKt.write(-291176396, new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(modifier, populateViewStructure_androidKtpopulate7, dragAndDropTargetModifierNode, 2), getpostalcode), getpostalcode, 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKindSetui(modifier, dragAndDropTargetModifierNode, i, 2);
        }
    }

    public static final void write(androidx.compose.ui.Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2064964257);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            RemoteActionCompatParcelizer(modifier, dragAndDropTargetModifierNode, getpostalcode, (i2 & 14) | 48 | ((i2 << 3) & 896));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKindSetui(modifier, dragAndDropTargetModifierNode, i, 1);
        }
    }
}
