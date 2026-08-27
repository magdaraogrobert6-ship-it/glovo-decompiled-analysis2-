package kotlinx.coroutines;

import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.SentryUUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ThreadContextKt;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getInAppMessageView;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public final <R, T> void invoke(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, R r, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
        Object objInvoke;
        int i = getInAppMessageView.write[ordinal()];
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 1) {
            try {
                DispatchedContinuationKt.serializer(createfromparcel, LoadBalancer$Helper.intercepted(LoadBalancer$Helper.createCoroutineUnintercepted(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r, shortNewsContentCardView)));
                return;
            } catch (Throwable th) {
                SentryUUID.IconCompatParcelizer(th, shortNewsContentCardView);
                throw null;
            }
        }
        if (i == 2) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            shortNewsContentCardView.getClass();
            LoadBalancer$Helper.intercepted(LoadBalancer$Helper.createCoroutineUnintercepted(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r, shortNewsContentCardView)).resumeWith(createfromparcel);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        shortNewsContentCardView.getClass();
        try {
            TextAnnouncementContentCardView context = shortNewsContentCardView.getContext();
            Object objSerializer = ThreadContextKt.serializer(context, null);
            try {
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 instanceof BaseContinuationImpl) {
                    pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -722072991, 722072991, BehaviorSubject.BehaviorDisposable.write());
                    objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(r, shortNewsContentCardView);
                } else {
                    objInvoke = LoadBalancer$Helper.wrapWithContinuationImpl(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r, shortNewsContentCardView);
                }
                ThreadContextKt.write(context, objSerializer);
                if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    shortNewsContentCardView.resumeWith(objInvoke);
                }
            } catch (Throwable th2) {
                ThreadContextKt.write(context, objSerializer);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).write;
            }
            shortNewsContentCardView.resumeWith(ExtrasKt.IconCompatParcelizer(th));
        }
    }
}
