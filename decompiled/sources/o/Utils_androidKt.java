package o;

import com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class Utils_androidKt extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public int IconCompatParcelizer;
    public final /* synthetic */ TasksRepository RemoteActionCompatParcelizer;
    public String serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Utils_androidKt(TasksRepository tasksRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = tasksRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 59;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object cachedState = this.RemoteActionCompatParcelizer.getCachedState(0L, null, this);
        int i4 = MediaBrowserCompatMediaItem + 125;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return cachedState;
    }
}
