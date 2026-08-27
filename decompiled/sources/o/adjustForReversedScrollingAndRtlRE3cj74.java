package o;

import com.google.firebase.sessions.settings.SettingsCacheImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class adjustForReversedScrollingAndRtlRE3cj74 extends ContinuationImpl {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ SettingsCacheImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adjustForReversedScrollingAndRtlRE3cj74(SettingsCacheImpl settingsCacheImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = settingsCacheImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        return this.write.updateConfigs(null, this);
    }
}
