package kotlinx.coroutines.selects;

import androidx.sqlite.SQLite;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import io.grpc.internal.CallTracer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createClickListener;
import o.createFromParcel;
import o.createTouchAwareListener;
import o.getBitmapFromCache;
import o.getCieXyz;
import o.getMApplicationContextannotations;
import o.getQueryParameterslambda2;
import o.markOnScreenCardsAsRead;
import o.onContentCardDismissed;
import o.onTouchEnded;
import o.r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.setBackButtonDismissesInAppMessageViewlambda0;
import o.setClickOutsideModalViewDismissInAppMessageViewlambda0;
import o.setCustomInAppMessageViewWrapperFactorylambda0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class SelectImplementation implements createClickListener, setBackButtonDismissesInAppMessageViewlambda0, r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w {
    public Object IconCompatParcelizer;
    public final TextAnnouncementContentCardView RemoteActionCompatParcelizer;
    public static final /* synthetic */ AtomicReferenceFieldUpdater write = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");
    public static final /* synthetic */ long read = markOnScreenCardsAsRead.serializer.objectFieldOffset(SelectImplementation.class.getDeclaredField("state$volatile"));
    private volatile /* synthetic */ Object state$volatile = setCustomInAppMessageViewWrapperFactorylambda0.serializer;
    public ArrayList serializer = new ArrayList(2);
    public int MediaSessionCompatQueueItem = -1;
    public Object MediaMetadataCompat = setCustomInAppMessageViewWrapperFactorylambda0.write;

    public final int IconCompatParcelizer(Object obj, Object obj2) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            write.getClass();
            Unsafe unsafe4 = markOnScreenCardsAsRead.serializer;
            long j = read;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (objectVolatile instanceof createTouchAwareListener) {
                getMApplicationContextannotations getmapplicationcontextannotationsWrite = write(obj);
                if (getmapplicationcontextannotationsWrite != null) {
                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = getmapplicationcontextannotationsWrite.serializer;
                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry != null ? (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(this, getmapplicationcontextannotationsWrite.MediaBrowserCompatMediaItem, obj2) : null;
                    do {
                        unsafe = markOnScreenCardsAsRead.serializer;
                        if (unsafe.compareAndSwapObject(this, read, objectVolatile, getmapplicationcontextannotationsWrite)) {
                            createTouchAwareListener createtouchawarelistener = (createTouchAwareListener) objectVolatile;
                            this.MediaMetadataCompat = obj2;
                            Symbol symbolWrite = createtouchawarelistener.write(createFromParcel.INSTANCE, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2);
                            if (symbolWrite == null) {
                                this.MediaMetadataCompat = setCustomInAppMessageViewWrapperFactorylambda0.write;
                                return 2;
                            }
                            createtouchawarelistener.serializer(symbolWrite);
                            return 0;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                } else {
                    continue;
                }
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objectVolatile, setCustomInAppMessageViewWrapperFactorylambda0.IconCompatParcelizer}, getCieXyz.write())).booleanValue() || (objectVolatile instanceof getMApplicationContextannotations)) {
                    return 3;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objectVolatile, setCustomInAppMessageViewWrapperFactorylambda0.read}, getCieXyz.write())).booleanValue()) {
                    return 2;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objectVolatile, setCustomInAppMessageViewWrapperFactorylambda0.serializer}, getCieXyz.write())).booleanValue()) {
                    int iSerializer = getQueryParameterslambda2.serializer();
                    List list = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{obj}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
                    do {
                        unsafe2 = markOnScreenCardsAsRead.serializer;
                        if (unsafe2.compareAndSwapObject(this, read, objectVolatile, list)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        DrawableTransformation.read(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    ArrayList arrayListRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) objectVolatile, obj);
                    do {
                        unsafe3 = markOnScreenCardsAsRead.serializer;
                        if (unsafe3.compareAndSwapObject(this, read, objectVolatile, arrayListRemoteActionCompatParcelizer)) {
                            return 1;
                        }
                    } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
                }
            }
        }
    }

    @Override // o.createClickListener
    public final void RemoteActionCompatParcelizer(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objectVolatile;
        do {
            atomicReferenceFieldUpdater = write;
            atomicReferenceFieldUpdater.getClass();
            objectVolatile = markOnScreenCardsAsRead.serializer.getObjectVolatile(this, read);
            if (objectVolatile == setCustomInAppMessageViewWrapperFactorylambda0.IconCompatParcelizer) {
                return;
            }
        } while (!getBitmapFromCache.write(atomicReferenceFieldUpdater, this, objectVolatile));
        ArrayList arrayList = this.serializer;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((getMApplicationContextannotations) it.next()).RemoteActionCompatParcelizer();
        }
        this.MediaMetadataCompat = setCustomInAppMessageViewWrapperFactorylambda0.write;
        this.serializer = null;
    }

    @Override // o.r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w
    public final void RemoteActionCompatParcelizer(Segment segment, int i) {
        this.IconCompatParcelizer = segment;
        this.MediaSessionCompatQueueItem = i;
    }

    public final boolean RemoteActionCompatParcelizer() {
        write.getClass();
        return markOnScreenCardsAsRead.serializer.getObjectVolatile(this, read) instanceof getMApplicationContextannotations;
    }

    public final Object read(ContinuationImpl continuationImpl) {
        write.getClass();
        Object objectVolatile = markOnScreenCardsAsRead.serializer.getObjectVolatile(this, read);
        objectVolatile.getClass();
        getMApplicationContextannotations getmapplicationcontextannotations = (getMApplicationContextannotations) objectVolatile;
        Object obj = this.MediaMetadataCompat;
        IconCompatParcelizer(getmapplicationcontextannotations);
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = getmapplicationcontextannotations.RatingCompat;
        Object obj2 = getmapplicationcontextannotations.read;
        Object obj3 = getmapplicationcontextannotations.MediaBrowserCompatMediaItem;
        Object objInvoke = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(obj2, obj3, obj);
        ShortNewsContentCardView shortNewsContentCardView = getmapplicationcontextannotations.write;
        return obj3 == setCustomInAppMessageViewWrapperFactorylambda0.RemoteActionCompatParcelizer ? ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) shortNewsContentCardView).invoke(continuationImpl) : ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) shortNewsContentCardView).invoke(objInvoke, continuationImpl);
    }

    public final void read(getMApplicationContextannotations getmapplicationcontextannotations, boolean z) {
        Object obj = getmapplicationcontextannotations.read;
        write.getClass();
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        long j = read;
        if (unsafe.getObjectVolatile(this, j) instanceof getMApplicationContextannotations) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.serializer;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((getMApplicationContextannotations) it.next()).read == obj) {
                        DrawableTransformation.read((Object) m1$$ExternalSyntheticOutline0.m(obj, "Cannot use select clauses on the same object: "));
                        return;
                    }
                }
            }
        }
        getmapplicationcontextannotations.MediaDescriptionCompat.invoke(obj, this, getmapplicationcontextannotations.MediaBrowserCompatMediaItem);
        if (this.MediaMetadataCompat != setCustomInAppMessageViewWrapperFactorylambda0.write) {
            markOnScreenCardsAsRead.serializer.putObjectVolatile(this, j, getmapplicationcontextannotations);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.serializer;
            arrayList2.getClass();
            arrayList2.add(getmapplicationcontextannotations);
        }
        getmapplicationcontextannotations.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
        getmapplicationcontextannotations.IconCompatParcelizer = this.MediaSessionCompatQueueItem;
        this.IconCompatParcelizer = null;
        this.MediaSessionCompatQueueItem = -1;
    }

    public final Object waitUntilSelected(setClickOutsideModalViewDismissInAppMessageViewlambda0 setclickoutsidemodalviewdismissinappmessageviewlambda0) {
        createFromParcel createfromparcel;
        Unsafe unsafe;
        Unsafe unsafe2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(setclickoutsidemodalviewdismissinappmessageviewlambda0));
        cancellableContinuationImpl.read();
        loop0: while (true) {
            write.getClass();
            Unsafe unsafe3 = markOnScreenCardsAsRead.serializer;
            long j = read;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            createfromparcel = createFromParcel.INSTANCE;
            Symbol symbol = setCustomInAppMessageViewWrapperFactorylambda0.serializer;
            if (objectVolatile == symbol) {
                do {
                    unsafe = markOnScreenCardsAsRead.serializer;
                    if (unsafe.compareAndSwapObject(this, read, objectVolatile, cancellableContinuationImpl)) {
                        cancellableContinuationImpl.IconCompatParcelizer((onTouchEnded) this);
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
            } else {
                if (!(objectVolatile instanceof List)) {
                    if (!(objectVolatile instanceof getMApplicationContextannotations)) {
                        DrawableTransformation.read(objectVolatile, "unexpected state: ");
                        return null;
                    }
                    getMApplicationContextannotations getmapplicationcontextannotations = (getMApplicationContextannotations) objectVolatile;
                    Object obj = this.MediaMetadataCompat;
                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = getmapplicationcontextannotations.serializer;
                    cancellableContinuationImpl.serializer(createfromparcel, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry != null ? (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(this, getmapplicationcontextannotations.MediaBrowserCompatMediaItem, obj) : null);
                    break;
                }
                do {
                    unsafe2 = markOnScreenCardsAsRead.serializer;
                    if (unsafe2.compareAndSwapObject(this, read, objectVolatile, symbol)) {
                        Iterator it = ((Iterable) objectVolatile).iterator();
                        while (it.hasNext()) {
                            getMApplicationContextannotations getmapplicationcontextannotationsWrite = write(it.next());
                            getmapplicationcontextannotationsWrite.getClass();
                            getmapplicationcontextannotationsWrite.RemoteActionCompatParcelizer = null;
                            getmapplicationcontextannotationsWrite.IconCompatParcelizer = -1;
                            read(getmapplicationcontextannotationsWrite, true);
                        }
                        break;
                    }
                } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : createfromparcel;
    }

    public SelectImplementation(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        this.RemoteActionCompatParcelizer = textAnnouncementContentCardView;
    }

    public final void IconCompatParcelizer(getMApplicationContextannotations getmapplicationcontextannotations) {
        ArrayList<getMApplicationContextannotations> arrayList = this.serializer;
        if (arrayList == null) {
            return;
        }
        for (getMApplicationContextannotations getmapplicationcontextannotations2 : arrayList) {
            if (getmapplicationcontextannotations2 != getmapplicationcontextannotations) {
                getmapplicationcontextannotations2.RemoteActionCompatParcelizer();
            }
        }
        write.getClass();
        markOnScreenCardsAsRead.serializer.putObjectVolatile(this, read, setCustomInAppMessageViewWrapperFactorylambda0.IconCompatParcelizer);
        this.MediaMetadataCompat = setCustomInAppMessageViewWrapperFactorylambda0.write;
        this.serializer = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object doSelectSuspend(ContinuationImpl continuationImpl) {
        setClickOutsideModalViewDismissInAppMessageViewlambda0 setclickoutsidemodalviewdismissinappmessageviewlambda0;
        SelectImplementation selectImplementation;
        if (continuationImpl instanceof setClickOutsideModalViewDismissInAppMessageViewlambda0) {
            setclickoutsidemodalviewdismissinappmessageviewlambda0 = (setClickOutsideModalViewDismissInAppMessageViewlambda0) continuationImpl;
            int i = setclickoutsidemodalviewdismissinappmessageviewlambda0.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                setclickoutsidemodalviewdismissinappmessageviewlambda0.serializer = i - Integer.MIN_VALUE;
            } else {
                setclickoutsidemodalviewdismissinappmessageviewlambda0 = new setClickOutsideModalViewDismissInAppMessageViewlambda0(this, continuationImpl);
            }
        } else {
            setclickoutsidemodalviewdismissinappmessageviewlambda0 = new setClickOutsideModalViewDismissInAppMessageViewlambda0(this, continuationImpl);
        }
        Object obj = setclickoutsidemodalviewdismissinappmessageviewlambda0.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = setclickoutsidemodalviewdismissinappmessageviewlambda0.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setclickoutsidemodalviewdismissinappmessageviewlambda0.IconCompatParcelizer = this;
            setclickoutsidemodalviewdismissinappmessageviewlambda0.serializer = 1;
            if (waitUntilSelected(setclickoutsidemodalviewdismissinappmessageviewlambda0) != coroutineSingletons) {
                selectImplementation = this;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        selectImplementation = setclickoutsidemodalviewdismissinappmessageviewlambda0.IconCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        setclickoutsidemodalviewdismissinappmessageviewlambda0.IconCompatParcelizer = null;
        setclickoutsidemodalviewdismissinappmessageviewlambda0.serializer = 2;
        Object obj2 = selectImplementation.read(setclickoutsidemodalviewdismissinappmessageviewlambda0);
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }

    public final getMApplicationContextannotations write(Object obj) {
        ArrayList arrayList = this.serializer;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((getMApplicationContextannotations) obj3).read == obj) {
                obj2 = obj3;
                break;
            }
        }
        getMApplicationContextannotations getmapplicationcontextannotations = (getMApplicationContextannotations) obj2;
        if (getmapplicationcontextannotations != null) {
            return getmapplicationcontextannotations;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void read(CallTracer callTracer, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        read(new getMApplicationContextannotations(this, (BufferedChannel) callTracer.RemoteActionCompatParcelizer, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) callTracer.write, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) callTracer.serializer, null, (SuspendLambda) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) callTracer.IconCompatParcelizer), false);
    }
}
