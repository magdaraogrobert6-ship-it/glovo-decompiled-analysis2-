package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
public final class setCustomControlInAppMessageManagerListener {
    public static final /* synthetic */ AtomicReferenceFieldUpdater IconCompatParcelizer;
    public static final /* synthetic */ long MediaBrowserCompatMediaItem;
    public static final /* synthetic */ long MediaDescriptionCompat;
    public static final /* synthetic */ AtomicReferenceFieldUpdater MediaMetadataCompat;
    public static final /* synthetic */ AtomicIntegerFieldUpdater RatingCompat;
    public static final /* synthetic */ long RemoteActionCompatParcelizer;
    public static final /* synthetic */ long read;
    public static final /* synthetic */ AtomicReferenceFieldUpdater serializer = AtomicReferenceFieldUpdater.newUpdater(setCustomControlInAppMessageManagerListener.class, Object.class, "reader$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater write;
    private volatile /* synthetic */ Object _value$volatile = null;
    private volatile /* synthetic */ Object exceptionWhenReading$volatile;
    private volatile /* synthetic */ Object reader$volatile;
    private volatile /* synthetic */ int readers$volatile;
    private volatile /* synthetic */ Object writer$volatile;

    public final Object IconCompatParcelizer() {
        Throwable th = new Throwable("reader location");
        serializer.getClass();
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        unsafe.putObjectVolatile(this, MediaDescriptionCompat, th);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = RatingCompat;
        atomicIntegerFieldUpdater.incrementAndGet(this);
        MediaMetadataCompat.getClass();
        Throwable th2 = (Throwable) unsafe.getObjectVolatile(this, MediaBrowserCompatMediaItem);
        if (th2 != null) {
            IllegalStateException illegalStateException = new IllegalStateException("Dispatchers.Main is used concurrently with setting it", th2);
            IconCompatParcelizer.getClass();
            unsafe.putObjectVolatile(this, read, illegalStateException);
        }
        write.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, RemoteActionCompatParcelizer);
        atomicIntegerFieldUpdater.decrementAndGet(this);
        return objectVolatile;
    }

    static {
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        MediaDescriptionCompat = unsafe.objectFieldOffset(setCustomControlInAppMessageManagerListener.class.getDeclaredField("reader$volatile"));
        RatingCompat = AtomicIntegerFieldUpdater.newUpdater(setCustomControlInAppMessageManagerListener.class, "readers$volatile");
        MediaMetadataCompat = AtomicReferenceFieldUpdater.newUpdater(setCustomControlInAppMessageManagerListener.class, Object.class, "writer$volatile");
        MediaBrowserCompatMediaItem = unsafe.objectFieldOffset(setCustomControlInAppMessageManagerListener.class.getDeclaredField("writer$volatile"));
        IconCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(setCustomControlInAppMessageManagerListener.class, Object.class, "exceptionWhenReading$volatile");
        read = unsafe.objectFieldOffset(setCustomControlInAppMessageManagerListener.class.getDeclaredField("exceptionWhenReading$volatile"));
        write = AtomicReferenceFieldUpdater.newUpdater(setCustomControlInAppMessageManagerListener.class, Object.class, "_value$volatile");
        RemoteActionCompatParcelizer = unsafe.objectFieldOffset(setCustomControlInAppMessageManagerListener.class.getDeclaredField("_value$volatile"));
    }
}
