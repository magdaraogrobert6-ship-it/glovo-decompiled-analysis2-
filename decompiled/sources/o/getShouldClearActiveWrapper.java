package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class getShouldClearActiveWrapper extends BufferedChannel {
    public final IInAppMessageViewWrapper ComponentActivity;

    @Override // kotlinx.coroutines.channels.BufferedChannel, o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4
    public final Object b_(Object obj) {
        return RemoteActionCompatParcelizer(obj, false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4
    public final Object serializer(Object obj, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        if (RemoteActionCompatParcelizer(obj, true) instanceof saveInAppMessageForCarryoverOnUnregister) {
            throw RatingCompat();
        }
        return createFromParcel.INSTANCE;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final boolean MediaSessionCompatResultReceiverWrapper() {
        return this.ComponentActivity == IInAppMessageViewWrapper.DROP_OLDEST;
    }

    public final Object RemoteActionCompatParcelizer(Object obj, boolean z) {
        if (this.ComponentActivity != IInAppMessageViewWrapper.DROP_LATEST) {
            return IconCompatParcelizer(obj);
        }
        Object objB_ = super.b_(obj);
        return (!(objB_ instanceof resolveUnregisterDisplayedMessagelambda0) || (objB_ instanceof saveInAppMessageForCarryoverOnUnregister)) ? objB_ : createFromParcel.INSTANCE;
    }

    public getShouldClearActiveWrapper(int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        super(i);
        this.ComponentActivity = iInAppMessageViewWrapper;
        if (iInAppMessageViewWrapper == IInAppMessageViewWrapper.SUSPEND) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("This implementation does not support suspension for senders, use ", displayInAppMessagelambda1.serializer(BufferedChannel.class).IconCompatParcelizer(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }
}
