package o;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.JobKt;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk implements DefaultInAppMessageViewWrapperWhenMappings {
    public static final /* synthetic */ long RemoteActionCompatParcelizer;
    public static final /* synthetic */ long read;
    public static final /* synthetic */ AtomicReferenceFieldUpdater write;
    public final DefaultInAppMessageViewWrappercreateDismissCallbacks1 RatingCompat;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater IconCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater serializer = AtomicReferenceFieldUpdater.newUpdater(r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk.class, Object.class, "_rootCause$volatile");

    @Override // o.DefaultInAppMessageViewWrapperWhenMappings
    public final boolean F_() {
        return serializer() == null;
    }

    public final boolean IconCompatParcelizer() {
        return serializer() != null;
    }

    @Override // o.DefaultInAppMessageViewWrapperWhenMappings
    public final DefaultInAppMessageViewWrappercreateDismissCallbacks1 read() {
        return this.RatingCompat;
    }

    public final void IconCompatParcelizer(Object obj) {
        write.getClass();
        markOnScreenCardsAsRead.serializer.putObjectVolatile(this, RemoteActionCompatParcelizer, obj);
    }

    public final void RemoteActionCompatParcelizer(Throwable th) {
        serializer.getClass();
        markOnScreenCardsAsRead.serializer.putObjectVolatile(this, read, th);
    }

    public final Throwable serializer() {
        serializer.getClass();
        return (Throwable) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, read);
    }

    public final Object write() {
        write.getClass();
        return markOnScreenCardsAsRead.serializer.getObjectVolatile(this, RemoteActionCompatParcelizer);
    }

    public r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk(DefaultInAppMessageViewWrappercreateDismissCallbacks1 defaultInAppMessageViewWrappercreateDismissCallbacks1, Throwable th) {
        this.RatingCompat = defaultInAppMessageViewWrappercreateDismissCallbacks1;
        this._rootCause$volatile = th;
    }

    static {
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        read = unsafe.objectFieldOffset(r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk.class.getDeclaredField("_rootCause$volatile"));
        write = AtomicReferenceFieldUpdater.newUpdater(r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk.class, Object.class, "_exceptionsHolder$volatile");
        RemoteActionCompatParcelizer = unsafe.objectFieldOffset(r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(IconCompatParcelizer());
        sb.append(", completing=");
        sb.append(IconCompatParcelizer.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(serializer());
        sb.append(", exceptions=");
        sb.append(write());
        sb.append(", list=");
        sb.append(this.RatingCompat);
        sb.append(']');
        return sb.toString();
    }

    public final void read(Throwable th) {
        Throwable thSerializer = serializer();
        if (thSerializer == null) {
            RemoteActionCompatParcelizer(th);
            return;
        }
        if (th == thSerializer) {
            return;
        }
        Object objWrite = write();
        if (objWrite == null) {
            IconCompatParcelizer(th);
            return;
        }
        if (!(objWrite instanceof Throwable)) {
            if (objWrite instanceof ArrayList) {
                ((ArrayList) objWrite).add(th);
                return;
            } else {
                DrawableTransformation.read(objWrite, "State is ");
                return;
            }
        }
        if (th == objWrite) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objWrite);
        arrayList.add(th);
        IconCompatParcelizer(arrayList);
    }

    public final ArrayList write(Throwable th) {
        ArrayList arrayList;
        Object objWrite = write();
        if (objWrite == null) {
            arrayList = new ArrayList(4);
        } else if (objWrite instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objWrite);
            arrayList = arrayList2;
        } else {
            if (!(objWrite instanceof ArrayList)) {
                DrawableTransformation.read(objWrite, "State is ");
                return null;
            }
            arrayList = (ArrayList) objWrite;
        }
        Throwable thSerializer = serializer();
        if (thSerializer != null) {
            arrayList.add(0, thSerializer);
        }
        if (th != null && !th.equals(thSerializer)) {
            arrayList.add(th);
        }
        IconCompatParcelizer(JobKt.MediaSessionCompatQueueItem);
        return arrayList;
    }
}
