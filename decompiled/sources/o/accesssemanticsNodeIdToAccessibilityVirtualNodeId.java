package o;

import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class accesssemanticsNodeIdToAccessibilityVirtualNodeId extends ContinuationImpl {
    public SessionsSettings IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ SessionsSettings read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accesssemanticsNodeIdToAccessibilityVirtualNodeId(SessionsSettings sessionsSettings, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = sessionsSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.read.updateSettings(this);
    }
}
