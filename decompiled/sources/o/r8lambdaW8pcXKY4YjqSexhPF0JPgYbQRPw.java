package o;

import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw {
    public static final resolveUnregisterDisplayedMessage MediaSessionCompatToken = new resolveUnregisterDisplayedMessage(-1, null, null, 0);
    public static final int ResultReceiver = SystemPropsKt.IconCompatParcelizer(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int MediaMetadataCompat = SystemPropsKt.IconCompatParcelizer(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final Symbol read = new Symbol("BUFFERED");
    public static final Symbol MediaBrowserCompatMediaItem = new Symbol("SHOULD_BUFFER");
    public static final Symbol r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new Symbol("S_RESUMING_BY_RCV");
    public static final Symbol PlaybackStateCompat = new Symbol("RESUMING_BY_EB");
    public static final Symbol ParcelableVolumeInfo = new Symbol("POISONED");
    public static final Symbol write = new Symbol("DONE_RCV");
    public static final Symbol MediaDescriptionCompat = new Symbol("INTERRUPTED_SEND");
    public static final Symbol RatingCompat = new Symbol("INTERRUPTED_RCV");
    public static final Symbol serializer = new Symbol("CHANNEL_CLOSED");
    public static final Symbol r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new Symbol("SUSPEND");
    public static final Symbol r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new Symbol("SUSPEND_NO_WAITER");
    public static final Symbol MediaSessionCompatQueueItem = new Symbol("FAILED");
    public static final Symbol MediaSessionCompatResultReceiverWrapper = new Symbol("NO_RECEIVE_RESULT");
    public static final Symbol RemoteActionCompatParcelizer = new Symbol("CLOSE_HANDLER_CLOSED");
    public static final Symbol IconCompatParcelizer = new Symbol("CLOSE_HANDLER_INVOKED");
    public static final Symbol PlaybackStateCompatCustomAction = new Symbol("NO_CLOSE_CAUSE");

    public static final boolean read(createTouchAwareListener createtouchawarelistener, Object obj, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        Symbol symbolWrite = createtouchawarelistener.write(obj, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
        if (symbolWrite == null) {
            return false;
        }
        createtouchawarelistener.serializer(symbolWrite);
        return true;
    }
}
