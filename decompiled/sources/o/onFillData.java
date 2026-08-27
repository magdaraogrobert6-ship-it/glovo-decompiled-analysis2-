package o;

import com.roadrunner.auth.domain.state.GetUserAuthStateImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class onFillData extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ GetUserAuthStateImpl RemoteActionCompatParcelizer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onFillData(GetUserAuthStateImpl getUserAuthStateImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = getUserAuthStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 81;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.RemoteActionCompatParcelizer.invoke(this);
        }
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 78 / 0;
        return this.RemoteActionCompatParcelizer.invoke(this);
    }
}
