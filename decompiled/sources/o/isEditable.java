package o;

import android.app.Activity;
import com.roadrunner.auth.domain.logout.LogoutLifecycleCallbacksImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class isEditable extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public Activity IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public final /* synthetic */ LogoutLifecycleCallbacksImpl read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isEditable(LogoutLifecycleCallbacksImpl logoutLifecycleCallbacksImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = logoutLifecycleCallbacksImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 105;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            return LogoutLifecycleCallbacksImpl.access$proceedWithLogout(this.read, null, null, this);
        }
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        LogoutLifecycleCallbacksImpl.access$proceedWithLogout(this.read, null, null, this);
        throw null;
    }
}
