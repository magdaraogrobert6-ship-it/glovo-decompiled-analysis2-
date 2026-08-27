package o;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class logUnregisterActivitylambda0 extends FunctionReferenceImpl implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public static final logUnregisterActivitylambda0 serializer = new logUnregisterActivitylambda0(2, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage = (resolveUnregisterDisplayedMessage) obj2;
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatToken;
        BufferedChannel bufferedChannel = resolveunregisterdisplayedmessage.write;
        bufferedChannel.getClass();
        return new resolveUnregisterDisplayedMessage(jLongValue, resolveunregisterdisplayedmessage, bufferedChannel, 0);
    }

    public logUnregisterActivitylambda0(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
