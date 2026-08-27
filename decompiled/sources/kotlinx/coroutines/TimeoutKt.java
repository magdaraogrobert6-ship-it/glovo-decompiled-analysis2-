package kotlinx.coroutines;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.math.MathKt;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;
import kotlinx.coroutines.internal.Symbol;
import o.DefaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createInAppMessageEventSubscriber;
import o.getOnBackInvokedCallback;
import o.markOnScreenCardsAsReadlambda1;
import o.r8lambda9SPaaa95c4VoMes3ivZmM9YlsUw;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setClickableInAppMessageView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TimeoutKt {
    public static final Symbol read = new Symbol("REMOVED_TASK");
    public static final Symbol serializer = new Symbol("CLOSED_EMPTY");

    public static final Object serializer(DefaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1 defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        JobKt.RemoteActionCompatParcelizer(defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1, new setClickableInAppMessageView(DelayKt.serializer(defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1.IconCompatParcelizer.getContext()).write(defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1.write, defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1, defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1.RemoteActionCompatParcelizer)));
        return MathKt.startUndspatched(defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1, false, defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static final void read(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).write;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) textAnnouncementContentCardView.get(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(textAnnouncementContentCardView, th);
            } else {
                CoroutineExceptionHandlerImpl_commonKt.write(textAnnouncementContentCardView, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                markOnScreenCardsAsReadlambda1.read(runtimeException, th);
                th = runtimeException;
            }
            CoroutineExceptionHandlerImpl_commonKt.write(textAnnouncementContentCardView, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object withTimeoutOrNull(long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) {
        r8lambda9SPaaa95c4VoMes3ivZmM9YlsUw r8lambda9spaaa95c4vomes3ivzmm9ylsuw;
        TimeoutCancellationException e;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        if (shortNewsContentCardView instanceof r8lambda9SPaaa95c4VoMes3ivZmM9YlsUw) {
            r8lambda9spaaa95c4vomes3ivzmm9ylsuw = (r8lambda9SPaaa95c4VoMes3ivZmM9YlsUw) shortNewsContentCardView;
            int i = r8lambda9spaaa95c4vomes3ivzmm9ylsuw.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                r8lambda9spaaa95c4vomes3ivzmm9ylsuw.serializer = i - Integer.MIN_VALUE;
            } else {
                r8lambda9spaaa95c4vomes3ivzmm9ylsuw = new r8lambda9SPaaa95c4VoMes3ivZmM9YlsUw(shortNewsContentCardView);
            }
        } else {
            r8lambda9spaaa95c4vomes3ivzmm9ylsuw = new r8lambda9SPaaa95c4VoMes3ivZmM9YlsUw(shortNewsContentCardView);
        }
        Object obj = r8lambda9spaaa95c4vomes3ivzmm9ylsuw.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = r8lambda9spaaa95c4vomes3ivzmm9ylsuw.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (j > 0) {
                createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = new createInAppMessageEventSubscriber();
                try {
                    r8lambda9spaaa95c4vomes3ivzmm9ylsuw.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                    r8lambda9spaaa95c4vomes3ivzmm9ylsuw.RemoteActionCompatParcelizer = createinappmessageeventsubscriber2;
                    r8lambda9spaaa95c4vomes3ivzmm9ylsuw.serializer = 1;
                    DefaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1 defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1 = new DefaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1(j, r8lambda9spaaa95c4vomes3ivzmm9ylsuw);
                    createinappmessageeventsubscriber2.IconCompatParcelizer = defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1;
                    Object objSerializer = serializer(defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                    return objSerializer == coroutineSingletons ? coroutineSingletons : objSerializer;
                } catch (TimeoutCancellationException e2) {
                    e = e2;
                    createinappmessageeventsubscriber = createinappmessageeventsubscriber2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        createinappmessageeventsubscriber = r8lambda9spaaa95c4vomes3ivzmm9ylsuw.RemoteActionCompatParcelizer;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = r8lambda9spaaa95c4vomes3ivzmm9ylsuw.write;
        try {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj;
        } catch (TimeoutCancellationException e3) {
            e = e3;
        }
        if (e.RemoteActionCompatParcelizer != createinappmessageeventsubscriber.IconCompatParcelizer) {
            throw e;
        }
        return null;
    }

    public static final Object withTimeout(long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        if (j > 0) {
            Object objSerializer = serializer(new DefaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1(j, continuationImpl), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objSerializer;
        }
        throw new TimeoutCancellationException("Timed out immediately", null);
    }
}
