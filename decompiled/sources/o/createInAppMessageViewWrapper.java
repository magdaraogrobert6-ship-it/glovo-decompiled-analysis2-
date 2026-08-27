package o;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class createInAppMessageViewWrapper extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public static final createInAppMessageViewWrapper serializer = new createInAppMessageViewWrapper(3, BufferedChannel.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = BufferedChannel.PlaybackStateCompatCustomAction;
        ((BufferedChannel) obj).RemoteActionCompatParcelizer((setBackButtonDismissesInAppMessageViewlambda0) obj2);
        return createFromParcel.INSTANCE;
    }

    public createInAppMessageViewWrapper(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
