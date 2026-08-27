package o;

import com.roadrunner.bubble.presentation.BubbleFloatingItemUiModelImpl$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class forEachIntersectingRectWithValueAt extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ BubbleFloatingItemUiModelImpl$1.AnonymousClass1 IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public forEachIntersectingRectWithValueAt(BubbleFloatingItemUiModelImpl$1.AnonymousClass1 anonymousClass1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = serializer + 75;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            objEmit = this.IconCompatParcelizer.emit((getMnc) null, (ShortNewsContentCardView) this);
            int i3 = 70 / 0;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            objEmit = this.IconCompatParcelizer.emit((getMnc) null, (ShortNewsContentCardView) this);
        }
        int i4 = write + 123;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
