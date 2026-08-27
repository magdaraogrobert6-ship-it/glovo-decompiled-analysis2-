package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class accessnotifySubtreeAccessibilityStateChangedIfNeeded extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ RemoteSettings RemoteActionCompatParcelizer;
    public setCustomInAppMessageAnimationFactorylambda0 read;
    public int serializer;
    public Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessnotifySubtreeAccessibilityStateChangedIfNeeded(RemoteSettings remoteSettings, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = remoteSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.updateSettings(this);
    }
}
