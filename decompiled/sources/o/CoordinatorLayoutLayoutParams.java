package o;

import com.foodora.courier.main.presentation.MainActivity;
import com.roadrunner.login.logging.RouterLogger;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class CoordinatorLayoutLayoutParams extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ RouterLogger RemoteActionCompatParcelizer;
    public MainActivity read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayoutLayoutParams(RouterLogger routerLogger, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = routerLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objNavigateToFeedback = this.RemoteActionCompatParcelizer.navigateToFeedback(null, this);
        int i4 = write + 35;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objNavigateToFeedback;
        }
        obj2.hashCode();
        throw null;
    }
}
