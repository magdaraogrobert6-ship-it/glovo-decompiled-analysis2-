package com.roadrunner.customerchat.usecase;

import android.os.Looper;
import android.os.MessageQueue;
import androidx.compose.ui.graphics.Fields;
import androidx.room.Room;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.FlowCollector;
import o.FragmentManagerSaveBackStackState;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class MainThreadOnIdleObserver$invoke$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MainThreadOnIdleObserver$invoke$1(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.serializer = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 23;
        read = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this.serializer != 0) {
            MainThreadOnIdleObserver$invoke$1 mainThreadOnIdleObserver$invoke$1 = new MainThreadOnIdleObserver$invoke$1(i, 1, shortNewsContentCardView);
            mainThreadOnIdleObserver$invoke$1.RemoteActionCompatParcelizer = obj;
            return mainThreadOnIdleObserver$invoke$1;
        }
        MainThreadOnIdleObserver$invoke$1 mainThreadOnIdleObserver$invoke$2 = new MainThreadOnIdleObserver$invoke$1(i, 0, shortNewsContentCardView);
        mainThreadOnIdleObserver$invoke$2.RemoteActionCompatParcelizer = obj;
        int i4 = read + 99;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return mainThreadOnIdleObserver$invoke$2;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 != 0) {
            Object objInvokeSuspend = ((MainThreadOnIdleObserver$invoke$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            int i3 = read + 87;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objInvokeSuspend;
        }
        Object objInvokeSuspend2 = ((MainThreadOnIdleObserver$invoke$1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        int i5 = read + 91;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objInvokeSuspend2;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MessageQueue queue;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        read = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (i3 != 0) {
            FlowCollector flowCollector = (FlowCollector) this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.write;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                FragmentManagerSaveBackStackState fragmentManagerSaveBackStackState = FragmentManagerSaveBackStackState.DEFAULT;
                this.RemoteActionCompatParcelizer = null;
                this.write = 1;
                if (flowCollector.emit(fragmentManagerSaveBackStackState, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createfromparcel2;
        }
        final InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.write;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MessageQueue.IdleHandler idleHandler = new MessageQueue.IdleHandler() { // from class: o.getTextMotion
                private static int RemoteActionCompatParcelizer = 0;
                private static int read = 1;

                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    int i6 = 2 % 2;
                    int i7 = RemoteActionCompatParcelizer + 75;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    ((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1).b_(Boolean.TRUE);
                    int i9 = RemoteActionCompatParcelizer + 121;
                    read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return false;
                }
            };
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null && (queue = mainLooper.getQueue()) != null) {
                queue.addIdleHandler(idleHandler);
            }
            ImageLoader$Builder$$ExternalSyntheticLambda1 imageLoader$Builder$$ExternalSyntheticLambda1 = new ImageLoader$Builder$$ExternalSyntheticLambda1(14, idleHandler);
            this.RemoteActionCompatParcelizer = null;
            this.write = 1;
            if (Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, imageLoader$Builder$$ExternalSyntheticLambda1, this) == coroutineSingletons2) {
                int i6 = IconCompatParcelizer + 65;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                obj2 = coroutineSingletons2;
            } else {
                obj2 = createfromparcel2;
            }
        } else if (i5 == 1) {
            int i8 = IconCompatParcelizer + 7;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i9 = 34 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            obj2 = createfromparcel2;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        }
        int i10 = read + 1;
        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return obj2;
    }
}
