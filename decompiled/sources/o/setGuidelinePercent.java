package o;

import java.util.List;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setGuidelinePercent implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ CancellableContinuationImpl read;

    public /* synthetic */ setGuidelinePercent(CancellableContinuationImpl cancellableContinuationImpl, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = cancellableContinuationImpl;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = write + 65;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        CancellableContinuationImpl cancellableContinuationImpl = this.read;
        if (i3 == 0) {
            List list = (List) obj;
            list.getClass();
            cancellableContinuationImpl.resumeWith(new onItemDismiss(Boolean.valueOf(!list.isEmpty())));
            int i4 = IconCompatParcelizer + 85;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel2;
        }
        if (i3 != 1) {
            Throwable th = (Throwable) obj;
            th.getClass();
            cancellableContinuationImpl.resumeWith(new isItemDismissable(th));
            return createfromparcel2;
        }
        String str = (String) obj;
        str.getClass();
        cancellableContinuationImpl.resumeWith(str);
        return createfromparcel2;
    }
}
