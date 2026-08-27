package o;

import com.roadrunner.delivery.accept.laststop.domain.GetLastStopScreenUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getTopPaddingui_textannotations extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ GetLastStopScreenUseCaseImpl serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTopPaddingui_textannotations(GetLastStopScreenUseCaseImpl getLastStopScreenUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getLastStopScreenUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object lastStopScreenUrl = this.serializer.getLastStopScreenUrl(this);
        int i4 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return lastStopScreenUrl;
    }
}
