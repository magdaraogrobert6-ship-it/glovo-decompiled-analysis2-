package o;

import java.util.List;
import kotlin.coroutines.SafeContinuation;

/* JADX INFO: loaded from: classes3.dex */
public final class onDowngrade implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ SafeContinuation write;

    public onDowngrade(SafeContinuation safeContinuation) {
        this.write = safeContinuation;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        List list = (List) obj;
        list.getClass();
        this.write.resumeWith(new onItemDismiss(new setAnimationProgress(list)));
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = read + 93;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }
}
