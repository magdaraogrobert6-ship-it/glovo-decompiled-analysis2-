package o;

import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import com.roadrunner.startworking.oneclick.navigation.StartWorkingNavigationUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class logPushStoryPageClickedlambda10 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public final /* synthetic */ StartWorkingNavigationUiModelImpl RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public StartWorkingNavAction write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public logPushStoryPageClickedlambda10(StartWorkingNavigationUiModelImpl startWorkingNavigationUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = startWorkingNavigationUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 123;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return StartWorkingNavigationUiModelImpl.access$fetchAndNavigate(this.RemoteActionCompatParcelizer, null, this);
        }
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 89 / 0;
        return StartWorkingNavigationUiModelImpl.access$fetchAndNavigate(this.RemoteActionCompatParcelizer, null, this);
    }
}
