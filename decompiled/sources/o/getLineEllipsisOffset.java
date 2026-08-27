package o;

import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getLineEllipsisOffset extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public Object IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ LastStopSelectionCoordinator serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLineEllipsisOffset(LastStopSelectionCoordinator lastStopSelectionCoordinator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = lastStopSelectionCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 75;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return this.serializer.initialize(this);
        }
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        this.serializer.initialize(this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
