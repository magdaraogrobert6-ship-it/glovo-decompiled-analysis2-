package o;

import com.google.firebase.sessions.SharedSessionRepositoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidComposeViewsnapshotObserver1command1 extends ContinuationImpl {
    public AndroidComposeViewroot11 IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public String read;
    public int serializer;
    public final /* synthetic */ SharedSessionRepositoryImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewsnapshotObserver1command1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = sharedSessionRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return SharedSessionRepositoryImpl.access$notifySubscribers(this.write, null, null, this);
    }
}
