package o;

import com.roadrunner.login.presentation.router.GetAuthStateViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class c5 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ GetAuthStateViewModel RemoteActionCompatParcelizer;
    public getIsDialog read;
    public int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(GetAuthStateViewModel getAuthStateViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = getAuthStateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 65;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objAccess$proceedWithAuth = GetAuthStateViewModel.access$proceedWithAuth(this.RemoteActionCompatParcelizer, this);
        int i4 = MediaBrowserCompatMediaItem + 67;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAccess$proceedWithAuth;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
