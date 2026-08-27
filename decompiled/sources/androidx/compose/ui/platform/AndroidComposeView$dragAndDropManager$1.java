package androidx.compose.ui.platform;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m2677invoke12SF9DM((DragAndDropTransferData) obj, ((Size) obj2).m551unboximpl(), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3);
    }

    /* JADX INFO: renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m2677invoke12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return Boolean.valueOf(((AndroidComposeView) this.MediaMetadataCompat).m2672startDrag12SF9DM(dragAndDropTransferData, j, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    public AndroidComposeView$dragAndDropManager$1(Object obj) {
        super(3, 0, AndroidComposeView.class, obj, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z");
    }
}
