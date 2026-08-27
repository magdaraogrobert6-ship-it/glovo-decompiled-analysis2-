package o;

import com.google.firebase.sessions.SessionFirelogPublisherImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidComposeViewrequestFocusViewFocusFixaltFocus1 extends ContinuationImpl {
    public SessionFirelogPublisherImpl RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ SessionFirelogPublisherImpl serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewrequestFocusViewFocusFixaltFocus1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = sessionFirelogPublisherImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        return SessionFirelogPublisherImpl.access$shouldLogSession(this.serializer, this);
    }
}
