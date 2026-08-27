package o;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$3;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;

/* JADX INFO: loaded from: classes.dex */
public abstract class getTopLeft {
    public static final void serializer(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1533506138);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        int i3 = 1;
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            getpostalcode.serializer(-885604480);
            androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt.ProvideDefaultPlatformTextContextMenuProviders(!textFieldSelectionManager.RemoteActionCompatParcelizer() ? androidx.compose.ui.Modifier.Companion : accessgetNormalcp.write(FrameRateCategory.write(androidx.compose.ui.Modifier.Companion, new NafathModalUiModelImpl$1.AnonymousClass2(textFieldSelectionManager, (ShortNewsContentCardView) null, 2)), textFieldSelectionManager.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, new MapboxNavigation$parsing$2(textFieldSelectionManager, null, i3), new TextFieldSelectionManager$contextMenuAreaModifier$3(textFieldSelectionManager, null, 0), new removePost(textFieldSelectionManager, 2)), dragAndDropTargetModifierNode, getpostalcode, i2 & 112);
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getTopRight(textFieldSelectionManager, dragAndDropTargetModifierNode, i, 1);
        }
    }
}
