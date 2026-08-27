package o;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class createRenderEffect implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    public final /* synthetic */ onViewAttachedToWindow IconCompatParcelizer;
    public final /* synthetic */ cubicTo RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState read;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 serializer;
    public final /* synthetic */ AlphaKt write;

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objPrevious;
        int iWrite;
        int iWrite2;
        int iWrite3;
        sendDragEventEu1f8Dk senddrageventeu1f8dk = (sendDragEventEu1f8Dk) obj;
        cubicTo cubicto = (cubicTo) obj2;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj3;
        ((Number) obj4).intValue();
        Object[] objArr = {((onShowTranslationui) this.read.MediaBrowserCompatMediaItem).getValue(), this.RemoteActionCompatParcelizer};
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
        if (!((Boolean) this.serializer.getValue()).booleanValue() && !zBooleanValue) {
            List list = (List) this.IconCompatParcelizer.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                iWrite = getCieXyz.write();
                iWrite2 = getCieXyz.write();
                iWrite3 = getCieXyz.write();
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{cubicto, (cubicTo) objPrevious}, iWrite3)).booleanValue());
            cubicto = (cubicTo) objPrevious;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (cubicto == null) {
            getpostalcode.serializer(105930796);
        } else {
            getpostalcode.serializer(-1520603531);
            getTangenttuRUvjQ.serializer(cubicto, this.write, coil3.ExtrasKt.write(-1263531443, new AndroidPath_androidKtWhenMappings(cubicto, 0, senddrageventeu1f8dk), getpostalcode), getpostalcode, 384);
        }
        getpostalcode.IconCompatParcelizer(false);
        return createFromParcel.INSTANCE;
    }

    public createRenderEffect(androidx.compose.animation.core.SeekableTransitionState seekableTransitionState, cubicTo cubicto, BlockDropShadowNode blockDropShadowNode, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, onViewAttachedToWindow onviewattachedtowindow) {
        this.read = seekableTransitionState;
        this.RemoteActionCompatParcelizer = cubicto;
        this.write = blockDropShadowNode;
        this.serializer = populateViewStructure_androidKtpopulate7;
        this.IconCompatParcelizer = onviewattachedtowindow;
    }
}
