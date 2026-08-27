package o;

import com.roadrunner.home.floatingbutton.LoadingFloatingButtonKt$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class getDefaultNSsRyOo {
    public static final void write(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.ProvidableCompositionLocal providableCompositionLocal, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-714464401);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(providableCompositionLocal) ? 32 : 16;
        }
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode2 = composed.IconCompatParcelizer;
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode2) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = androidx.compose.runtime.CompositionKt.serializer((Object) null, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
                getpostalcode.write(objComponentActivity);
            }
            androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider basicTextContextMenuProviderSerializer = serializer(dragAndDropTargetModifierNode2, getpostalcode, (i2 >> 6) & 14);
            AndroidContentCaptureManagerCompanion.read(providableCompositionLocal.write(basicTextContextMenuProviderSerializer), coil3.ExtrasKt.write(274270255, new LoadingFloatingButtonKt$$ExternalSyntheticLambda0(modifier, (PopulateViewStructure_androidKtpopulate7) objComponentActivity, dragAndDropTargetModifierNode, basicTextContextMenuProviderSerializer, 1), getpostalcode), getpostalcode, 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(modifier, providableCompositionLocal, dragAndDropTargetModifierNode, i, 6);
        }
    }

    public static final androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider serializer(DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((getPostalCode) getbirthdatefull).read(dragAndDropTargetModifierNode)) || (i & 6) == 4;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (z || objComponentActivity == androidContentCaptureManager) {
            objComponentActivity = new androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider(dragAndDropTargetModifierNode);
            getpostalcode.write(objComponentActivity);
        }
        androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider basicTextContextMenuProvider = (androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider) objComponentActivity;
        boolean z2 = getpostalcode.read(basicTextContextMenuProvider);
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if (z2 || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = new InlineChildren(19, basicTextContextMenuProvider);
            getpostalcode.write(objComponentActivity2);
        }
        getPhoneNumberNational.serializer(basicTextContextMenuProvider, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode);
        return basicTextContextMenuProvider;
    }
}
