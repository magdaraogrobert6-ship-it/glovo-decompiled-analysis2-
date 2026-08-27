package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.scheduling.TasksKt;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class getDefaultInAppMessageViewFactorylambda0 {
    public final AtomicReferenceArray MediaDescriptionCompat = new AtomicReferenceArray(androidx.compose.ui.graphics.Fields.SpotShadowColor);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater IconCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(getDefaultInAppMessageViewFactorylambda0.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long read = markOnScreenCardsAsRead.serializer.objectFieldOffset(getDefaultInAppMessageViewFactorylambda0.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater serializer = AtomicIntegerFieldUpdater.newUpdater(getDefaultInAppMessageViewFactorylambda0.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater RemoteActionCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(getDefaultInAppMessageViewFactorylambda0.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater write = AtomicIntegerFieldUpdater.newUpdater(getDefaultInAppMessageViewFactorylambda0.class, "blockingTasksInBuffer$volatile");

    public final _set_shouldNextUnregisterBeSkipped_lambda0 IconCompatParcelizer() {
        IconCompatParcelizer.getClass();
        _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0 = (_set_shouldNextUnregisterBeSkipped_lambda0) markOnScreenCardsAsRead.serializer.getAndSetObject(this, read, (Object) null);
        return _set_shouldnextunregisterbeskipped_lambda0 == null ? serializer() : _set_shouldnextunregisterbeskipped_lambda0;
    }

    public final int RemoteActionCompatParcelizer() {
        IconCompatParcelizer.getClass();
        Object objectVolatile = markOnScreenCardsAsRead.serializer.getObjectVolatile(this, read);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = RemoteActionCompatParcelizer;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = serializer;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final _set_shouldNextUnregisterBeSkipped_lambda0 RemoteActionCompatParcelizer(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.MediaDescriptionCompat;
        _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0 = (_set_shouldNextUnregisterBeSkipped_lambda0) atomicReferenceArray.get(i2);
        if (_set_shouldnextunregisterbeskipped_lambda0 != null && _set_shouldnextunregisterbeskipped_lambda0.PlaybackStateCompat == z) {
            while (!atomicReferenceArray.compareAndSet(i2, _set_shouldnextunregisterbeskipped_lambda0, null)) {
                if (atomicReferenceArray.get(i2) != _set_shouldnextunregisterbeskipped_lambda0) {
                }
            }
            if (z) {
                write.decrementAndGet(this);
            }
            return _set_shouldnextunregisterbeskipped_lambda0;
        }
        return null;
    }

    public final _set_shouldNextUnregisterBeSkipped_lambda0 RemoteActionCompatParcelizer(_set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = serializer;
        if (atomicIntegerFieldUpdater.get(this) - RemoteActionCompatParcelizer.get(this) == 127) {
            return _set_shouldnextunregisterbeskipped_lambda0;
        }
        if (_set_shouldnextunregisterbeskipped_lambda0.PlaybackStateCompat) {
            write.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.MediaDescriptionCompat;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, _set_shouldnextunregisterbeskipped_lambda0);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final long read(createInAppMessageEventSubscriber createinappmessageeventsubscriber, int i) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0;
        do {
            atomicReferenceFieldUpdater = IconCompatParcelizer;
            atomicReferenceFieldUpdater.getClass();
            _set_shouldnextunregisterbeskipped_lambda0 = (_set_shouldNextUnregisterBeSkipped_lambda0) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, read);
            if (_set_shouldnextunregisterbeskipped_lambda0 == null) {
                return -2L;
            }
            if (((_set_shouldnextunregisterbeskipped_lambda0.PlaybackStateCompat ? 1 : 2) & i) == 0) {
                return -2L;
            }
            TasksKt.MediaSessionCompatQueueItem.getClass();
            long jNanoTime = System.nanoTime() - _set_shouldnextunregisterbeskipped_lambda0.MediaDescriptionCompat;
            long j = TasksKt.RemoteActionCompatParcelizer;
            if (jNanoTime < j) {
                return j - jNanoTime;
            }
        } while (!MediaSessionCompatQueueItem.IconCompatParcelizer(atomicReferenceFieldUpdater, this, _set_shouldnextunregisterbeskipped_lambda0));
        createinappmessageeventsubscriber.IconCompatParcelizer = _set_shouldnextunregisterbeskipped_lambda0;
        return -1L;
    }

    public final _set_shouldNextUnregisterBeSkipped_lambda0 read() {
        Unsafe unsafe;
        while (true) {
            IconCompatParcelizer.getClass();
            Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
            long j = read;
            _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0 = (_set_shouldNextUnregisterBeSkipped_lambda0) unsafe2.getObjectVolatile(this, j);
            if (_set_shouldnextunregisterbeskipped_lambda0 == null || !_set_shouldnextunregisterbeskipped_lambda0.PlaybackStateCompat) {
                break;
            }
            do {
                unsafe = markOnScreenCardsAsRead.serializer;
                if (unsafe.compareAndSwapObject(this, read, _set_shouldnextunregisterbeskipped_lambda0, (Object) null)) {
                    return _set_shouldnextunregisterbeskipped_lambda0;
                }
            } while (unsafe.getObjectVolatile(this, j) == _set_shouldnextunregisterbeskipped_lambda0);
        }
        int i = RemoteActionCompatParcelizer.get(this);
        int i2 = serializer.get(this);
        while (i != i2 && write.get(this) != 0) {
            i2--;
            _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2, true);
            if (_set_shouldnextunregisterbeskipped_lambda0RemoteActionCompatParcelizer != null) {
                return _set_shouldnextunregisterbeskipped_lambda0RemoteActionCompatParcelizer;
            }
        }
        return null;
    }

    public final void read(getMActivityannotations getmactivityannotations) {
        IconCompatParcelizer.getClass();
        _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0 = (_set_shouldNextUnregisterBeSkipped_lambda0) markOnScreenCardsAsRead.serializer.getAndSetObject(this, read, (Object) null);
        if (_set_shouldnextunregisterbeskipped_lambda0 != null) {
            getmactivityannotations.write(_set_shouldnextunregisterbeskipped_lambda0);
        }
        while (true) {
            _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0Serializer = serializer();
            if (_set_shouldnextunregisterbeskipped_lambda0Serializer == null) {
                return;
            } else {
                getmactivityannotations.write(_set_shouldnextunregisterbeskipped_lambda0Serializer);
            }
        }
    }

    public final _set_shouldNextUnregisterBeSkipped_lambda0 serializer() {
        _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = RemoteActionCompatParcelizer;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - serializer.get(this) == 0) {
                return null;
            }
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (_set_shouldnextunregisterbeskipped_lambda0 = (_set_shouldNextUnregisterBeSkipped_lambda0) this.MediaDescriptionCompat.getAndSet(i & 127, null)) != null) {
                if (_set_shouldnextunregisterbeskipped_lambda0.PlaybackStateCompat) {
                    write.decrementAndGet(this);
                }
                return _set_shouldnextunregisterbeskipped_lambda0;
            }
        }
    }

    public final _set_shouldNextUnregisterBeSkipped_lambda0 serializer(_set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0, boolean z) {
        if (z) {
            return RemoteActionCompatParcelizer(_set_shouldnextunregisterbeskipped_lambda0);
        }
        IconCompatParcelizer.getClass();
        _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda1 = (_set_shouldNextUnregisterBeSkipped_lambda0) markOnScreenCardsAsRead.serializer.getAndSetObject(this, read, _set_shouldnextunregisterbeskipped_lambda0);
        if (_set_shouldnextunregisterbeskipped_lambda1 == null) {
            return null;
        }
        return RemoteActionCompatParcelizer(_set_shouldnextunregisterbeskipped_lambda1);
    }
}
