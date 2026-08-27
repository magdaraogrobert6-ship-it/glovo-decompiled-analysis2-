package o;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class finalizeAnimatingCloseOnUnregister extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public static final finalizeAnimatingCloseOnUnregister read = new finalizeAnimatingCloseOnUnregister(3, BufferedChannel.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BufferedChannel bufferedChannel = (BufferedChannel) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = BufferedChannel.PlaybackStateCompatCustomAction;
        bufferedChannel.getClass();
        if (obj3 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer) {
            obj3 = new saveInAppMessageForCarryoverOnUnregister(bufferedChannel.write());
        }
        return new logUnregisterActivity(obj3);
    }

    public finalizeAnimatingCloseOnUnregister(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
