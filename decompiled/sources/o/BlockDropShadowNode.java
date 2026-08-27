package o;

import androidx.cardview.widget.CardView$1;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import bo.app.af$$ExternalSyntheticOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BlockDropShadowNode implements AlphaKt {
    public static final CardView$1 serializer = new CardView$1(new ScrollState$$ExternalSyntheticLambda3(15), 5, new UiMediaScopeViewingDistance(19));
    public final Map IconCompatParcelizer;
    public final onRemeasuredozmzZPI RemoteActionCompatParcelizer;
    public final InlineChildren read;
    public alpha write;

    @Override // o.AlphaKt
    public final void IconCompatParcelizer(Object obj) {
        if (this.RemoteActionCompatParcelizer.IconCompatParcelizer(obj) == null) {
            this.IconCompatParcelizer.remove(obj);
        }
    }

    public BlockDropShadowNode(Map map) {
        this.IconCompatParcelizer = map;
        long[] jArr = detectDragGestures.write;
        this.RemoteActionCompatParcelizer = new onRemeasuredozmzZPI();
        this.read = new InlineChildren(27, this);
    }

    @Override // o.AlphaKt
    public final void read(Object obj, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(533563200);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(this) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            getpostalcode.RemoteActionCompatParcelizer(obj);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                InlineChildren inlineChildren = this.read;
                if (!((Boolean) inlineChildren.invoke(obj)).booleanValue()) {
                    DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                    return;
                }
                Map map = (Map) this.IconCompatParcelizer.get(obj);
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = getBlock.read;
                objComponentActivity = new obtainPainter(new getShape(map, inlineChildren));
                getpostalcode.write(objComponentActivity);
            }
            obtainPainter obtainpainter = (obtainPainter) objComponentActivity;
            AndroidContentCaptureManagerCompanion.IconCompatParcelizer(new hideTranslatedText[]{getBlock.read.write(obtainpainter), getUnspecified0d7_KjU.IconCompatParcelizer.write(obtainpainter)}, dragAndDropTargetModifierNode, getpostalcode, (i2 & 112) | 8);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(this);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(obj);
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(obtainpainter);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(this, obj, obtainpainter, 17);
                getpostalcode.write(objComponentActivity2);
            }
            getPhoneNumberNational.serializer(createFromParcel.INSTANCE, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode);
            if (getpostalcode.addObserverForBackInvokerlambda0 && getpostalcode.createFullyDrawnExecutor.PlaybackStateCompat == getpostalcode.getOnBackPressedInput) {
                getpostalcode.getOnBackPressedInput = -1;
                getpostalcode.addObserverForBackInvokerlambda0 = false;
            }
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 8, this, obj, dragAndDropTargetModifierNode);
        }
    }
}
