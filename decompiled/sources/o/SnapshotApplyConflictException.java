package o;

import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SnapshotApplyConflictException extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ androidx.compose.ui.layout.LayoutCoordinates IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.relocation.BringIntoViewResponderNode RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotApplyConflictException(androidx.compose.foundation.relocation.BringIntoViewResponderNode bringIntoViewResponderNode, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        super(0, TextStreamsKt.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.RemoteActionCompatParcelizer = bringIntoViewResponderNode;
        this.IconCompatParcelizer = layoutCoordinates;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        return androidx.compose.foundation.relocation.BringIntoViewResponderNode.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.serializer);
    }
}
