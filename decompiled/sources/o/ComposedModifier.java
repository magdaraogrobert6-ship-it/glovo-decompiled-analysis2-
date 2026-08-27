package o;

import com.google.android.gms.internal.mlkit_vision_barcode.zzpw;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ComposedModifier extends ContinuationImpl {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope serializer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return zzpw.access$awaitFirstRightClickDown(null, this);
    }

    public ComposedModifier(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
