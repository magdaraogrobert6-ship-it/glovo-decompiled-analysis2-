package com.roadrunner.delivery.pickupdropoff.tasks.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class TasksRepository$observeLocalTasks$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final /* synthetic */ long IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ TasksRepository read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TasksRepository$observeLocalTasks$1(TasksRepository tasksRepository, long j, String str, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.read = tasksRepository;
        this.IconCompatParcelizer = j;
        this.serializer = str;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 21;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        FlowCollector flowCollector = (FlowCollector) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((TasksRepository$observeLocalTasks$1) create(flowCollector, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((TasksRepository$observeLocalTasks$1) create(flowCollector, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = MediaDescriptionCompat + 19;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 91;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.write != 0) {
            return new TasksRepository$observeLocalTasks$1(this.read, this.IconCompatParcelizer, this.serializer, shortNewsContentCardView, 1);
        }
        TasksRepository$observeLocalTasks$1 tasksRepository$observeLocalTasks$1 = new TasksRepository$observeLocalTasks$1(this.read, this.IconCompatParcelizer, this.serializer, shortNewsContentCardView, 0);
        int i3 = MediaBrowserCompatMediaItem + 51;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return tasksRepository$observeLocalTasks$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM4935getStateResultBWLJW6A;
        Object objM4935getStateResultBWLJW6A2;
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 != 0) {
                int i4 = MediaBrowserCompatMediaItem + 65;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM4935getStateResultBWLJW6A2 = ((onItemDismiss) obj).IconCompatParcelizer;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                objM4935getStateResultBWLJW6A2 = this.read.m4935getStateResultBWLJW6A(this.IconCompatParcelizer, this.serializer, true, this);
                if (objM4935getStateResultBWLJW6A2 == coroutineSingletons) {
                    int i5 = MediaBrowserCompatMediaItem + 3;
                    MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return coroutineSingletons;
                }
            }
            Throwable thSerializer = onItemDismiss.serializer(objM4935getStateResultBWLJW6A2);
            if (thSerializer == null) {
                return createfromparcel;
            }
            throw thSerializer;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.RemoteActionCompatParcelizer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer = 1;
            objM4935getStateResultBWLJW6A = this.read.m4935getStateResultBWLJW6A(this.IconCompatParcelizer, this.serializer, false, this);
            if (objM4935getStateResultBWLJW6A == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i8 = MediaDescriptionCompat + 103;
                MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return null;
            }
            int i10 = MediaDescriptionCompat + 45;
            MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
                obj2.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4935getStateResultBWLJW6A = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        Throwable thSerializer2 = onItemDismiss.serializer(objM4935getStateResultBWLJW6A);
        if (thSerializer2 == null) {
            return createfromparcel;
        }
        throw thSerializer2;
    }
}
