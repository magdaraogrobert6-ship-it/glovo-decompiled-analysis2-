package o;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: loaded from: classes4.dex */
public final class resolveUnregisterDisplayedMessage extends Segment {
    public final /* synthetic */ AtomicReferenceArray serializer;
    public final BufferedChannel write;

    @Override // kotlinx.coroutines.internal.Segment
    public final int serializer() {
        return r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
    }

    public final void read(int i, Object obj) {
        this.serializer.set(i * 2, obj);
    }

    public final void read(int i, boolean z) {
        if (z) {
            BufferedChannel bufferedChannel = this.write;
            bufferedChannel.getClass();
            bufferedChannel.read((this.RatingCompat * ((long) r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver)) + ((long) i));
        }
        MediaSessionCompatResultReceiverWrapper();
    }

    public resolveUnregisterDisplayedMessage(long j, resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage, BufferedChannel bufferedChannel, int i) {
        super(j, resolveunregisterdisplayedmessage, i);
        this.write = bufferedChannel;
        this.serializer = new AtomicReferenceArray(r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver * 2);
    }

    public final void RemoteActionCompatParcelizer(int i, Object obj) {
        this.serializer.set((i * 2) + 1, obj);
    }

    public final Object serializer(int i) {
        return this.serializer.get((i * 2) + 1);
    }

    public final boolean serializer(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.serializer;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final void RemoteActionCompatParcelizer(int i, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        BufferedChannel bufferedChannel;
        int i2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.serializer.get(i * 2);
        while (true) {
            Object objSerializer = serializer(i);
            boolean z2 = objSerializer instanceof r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w;
            bufferedChannel = this.write;
            if (z2 || (objSerializer instanceof r8lambdaWt1pWTP24_MzoygVHq2evhx_yAQ)) {
                if (serializer(objSerializer, i, z ? r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaDescriptionCompat : r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.RatingCompat)) {
                    read(i, (Object) null);
                    read(i, !z);
                    if (z) {
                        bufferedChannel.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objSerializer == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaDescriptionCompat || objSerializer == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.RatingCompat) {
                    break;
                }
                if (objSerializer != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.PlaybackStateCompat && objSerializer != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                    if (objSerializer == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.write || objSerializer == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read || objSerializer == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer) {
                        return;
                    }
                    DrawableTransformation.read(objSerializer, "unexpected state: ");
                    return;
                }
            }
        }
        read(i, (Object) null);
        if (z) {
            bufferedChannel.getClass();
        }
    }
}
