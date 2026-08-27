package o;

import com.roadrunner.login.presentation.forgotpassword.ForgotPasswordPersistedTimerManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ae extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ ForgotPasswordPersistedTimerManager IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public endStream write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(ForgotPasswordPersistedTimerManager forgotPasswordPersistedTimerManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = forgotPasswordPersistedTimerManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objResumeIfPersisted = this.IconCompatParcelizer.resumeIfPersisted(null, this);
        int i4 = RemoteActionCompatParcelizer + 73;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objResumeIfPersisted;
    }
}
