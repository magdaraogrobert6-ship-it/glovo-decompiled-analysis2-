package com.roadrunner.delivery.pickupdropoff.tasks.data;

import android.util.LruCache;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.MutexImpl;
import o.NoopClock;
import o.PreviewActivityExternalSyntheticLambda4;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.TransitionClock;
import o.Utils_androidKt;
import o.accessgetInstancedelegatecp;
import o.buildCompositionParentHierarchy;
import o.createFromParcel;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.getEmptyBox;
import o.getMaxWidth;
import o.getOptimizationLevel;
import o.getSceneString;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onMove;
import o.onViewAdded;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda8L8lXCy99H67Fo1WTKvaQj9opM;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setCustomInAppMessageAnimationFactorylambda0;
import o.showBackground;
import o.uiMode;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class TasksRepository {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final NoopClock MediaDescriptionCompat;
    public final TransitionClock MediaSessionCompatQueueItem;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutexImpl read;
    public final GetConfirmationStateImpl serializer;
    public final LruCache write;

    public TasksRepository(GetConfirmationStateImpl getConfirmationStateImpl, TransitionClock transitionClock, NoopClock noopClock) {
        getConfirmationStateImpl.getClass();
        transitionClock.getClass();
        noopClock.getClass();
        this.serializer = getConfirmationStateImpl;
        this.MediaSessionCompatQueueItem = transitionClock;
        this.MediaDescriptionCompat = noopClock;
        this.write = new LruCache(5);
        this.read = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
        this.RemoteActionCompatParcelizer = StateFlowKt.read(simpleItemTouchHelperCallback);
        this.IconCompatParcelizer = StateFlowKt.read(simpleItemTouchHelperCallback);
    }

    public static String read(long j, String str) {
        int i = 2 % 2;
        String str2 = j + "-" + str;
        int i2 = MediaBrowserCompatMediaItem + 33;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
        }
        return str2;
    }

    public final Object saveState(long j, String str, String str2, PreviewActivityExternalSyntheticLambda4 previewActivityExternalSyntheticLambda4, ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        int i2 = RatingCompat + 29;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write.put(str2, previewActivityExternalSyntheticLambda4);
        NoopClock noopClock = this.MediaDescriptionCompat;
        noopClock.getClass();
        String strRemoteActionCompatParcelizer = resetTransientState.read.RemoteActionCompatParcelizer(PreviewActivityExternalSyntheticLambda4.Companion.serializer(), previewActivityExternalSyntheticLambda4);
        Object objAdd = noopClock.IconCompatParcelizer.add(NoopClock.RemoteActionCompatParcelizer(j, str), strRemoteActionCompatParcelizer, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (objAdd != coroutineSingletons) {
            objAdd = createfromparcel;
        }
        if (objAdd != coroutineSingletons) {
            return createfromparcel;
        }
        int i4 = RatingCompat;
        int i5 = i4 + 67;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 27;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return objAdd;
    }

    /* JADX WARN: Code duplicated, block: B:18:? A[SYNTHETIC] */
    public final void RemoteActionCompatParcelizer(String str, PreviewActivityExternalSyntheticLambda4 previewActivityExternalSyntheticLambda4, r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq) {
        MutableStateFlow mutableStateFlow;
        Object obj;
        MutableStateFlow mutableStateFlow2;
        Object obj2;
        int i = 2 % 2;
        do {
            mutableStateFlow = this.RemoteActionCompatParcelizer;
            obj = mutableStateFlow.read();
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, onMove.serializer((Map) obj, new onViewAttachedToWindowlambda0(str, previewActivityExternalSyntheticLambda4.RemoteActionCompatParcelizer()))));
        int i2 = RatingCompat + 111;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
            if (r8lambdaiidsddyirtymdul5lt6pmt2zysq != null) {
                do {
                    mutableStateFlow2 = this.IconCompatParcelizer;
                    obj2 = mutableStateFlow2.read();
                } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj2, onMove.serializer((Map) obj2, new onViewAttachedToWindowlambda0(str, r8lambdaiidsddyirtymdul5lt6pmt2zysq))));
            }
        } else if (r8lambdaiidsddyirtymdul5lt6pmt2zysq != null) {
            do {
                mutableStateFlow2 = this.IconCompatParcelizer;
                obj2 = mutableStateFlow2.read();
            } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj2, onMove.serializer((Map) obj2, new onViewAttachedToWindowlambda0(str, r8lambdaiidsddyirtymdul5lt6pmt2zysq))));
        }
        int i4 = MediaBrowserCompatMediaItem + 59;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: getCachedTasks-0E7RQCE$implementation, reason: not valid java name */
    public final Object m4932getCachedTasks0E7RQCE$implementation(long j, String str, ContinuationImpl continuationImpl) throws Throwable {
        TasksRepository$getCachedTasks$1 tasksRepository$getCachedTasks$1;
        Object objM4935getStateResultBWLJW6A;
        int i = 2 % 2;
        if (continuationImpl instanceof TasksRepository$getCachedTasks$1) {
            int i2 = RatingCompat + 3;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            tasksRepository$getCachedTasks$1 = (TasksRepository$getCachedTasks$1) continuationImpl;
            int i4 = tasksRepository$getCachedTasks$1.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tasksRepository$getCachedTasks$1.serializer = i4 - Integer.MIN_VALUE;
            } else {
                tasksRepository$getCachedTasks$1 = new TasksRepository$getCachedTasks$1(this, continuationImpl);
            }
        } else {
            tasksRepository$getCachedTasks$1 = new TasksRepository$getCachedTasks$1(this, continuationImpl);
        }
        TasksRepository$getCachedTasks$1 tasksRepository$getCachedTasks$2 = tasksRepository$getCachedTasks$1;
        int i5 = RatingCompat + 103;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        Object obj = tasksRepository$getCachedTasks$2.IconCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = tasksRepository$getCachedTasks$2.serializer;
        Object obj3 = null;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            tasksRepository$getCachedTasks$2.serializer = 1;
            objM4935getStateResultBWLJW6A = m4935getStateResultBWLJW6A(j, str, false, tasksRepository$getCachedTasks$2);
            if (objM4935getStateResultBWLJW6A == obj2) {
                int i8 = MediaBrowserCompatMediaItem + 41;
                RatingCompat = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return obj2;
                }
                obj3.hashCode();
                throw null;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4935getStateResultBWLJW6A = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM4935getStateResultBWLJW6A instanceof isItemDismissable)) {
            objM4935getStateResultBWLJW6A = ((PreviewActivityExternalSyntheticLambda4) objM4935getStateResultBWLJW6A).RemoteActionCompatParcelizer();
            int i9 = MediaBrowserCompatMediaItem + 87;
            RatingCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = 3 / 4;
            }
        }
        return objM4935getStateResultBWLJW6A;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX INFO: renamed from: getDeliveryAnalytics-0E7RQCE$implementation, reason: not valid java name */
    public final Object m4933getDeliveryAnalytics0E7RQCE$implementation(long j, String str, ContinuationImpl continuationImpl) throws Throwable {
        TasksRepository$getDeliveryAnalytics$1 tasksRepository$getDeliveryAnalytics$1;
        Object objM4935getStateResultBWLJW6A;
        int i = 2 % 2;
        int i2 = RatingCompat + 121;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = continuationImpl instanceof TasksRepository$getDeliveryAnalytics$1;
            obj.hashCode();
            throw null;
        }
        if (continuationImpl instanceof TasksRepository$getDeliveryAnalytics$1) {
            tasksRepository$getDeliveryAnalytics$1 = (TasksRepository$getDeliveryAnalytics$1) continuationImpl;
            int i3 = tasksRepository$getDeliveryAnalytics$1.IconCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = RatingCompat + 69;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                tasksRepository$getDeliveryAnalytics$1.IconCompatParcelizer = i4 % 2 != 0 ? i3 * Integer.MIN_VALUE : i3 - Integer.MIN_VALUE;
            } else {
                tasksRepository$getDeliveryAnalytics$1 = new TasksRepository$getDeliveryAnalytics$1(this, continuationImpl);
            }
        } else {
            tasksRepository$getDeliveryAnalytics$1 = new TasksRepository$getDeliveryAnalytics$1(this, continuationImpl);
        }
        TasksRepository$getDeliveryAnalytics$1 tasksRepository$getDeliveryAnalytics$2 = tasksRepository$getDeliveryAnalytics$1;
        int i5 = RatingCompat + 77;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        Object obj2 = tasksRepository$getDeliveryAnalytics$2.read;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = tasksRepository$getDeliveryAnalytics$2.IconCompatParcelizer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            tasksRepository$getDeliveryAnalytics$2.IconCompatParcelizer = 1;
            objM4935getStateResultBWLJW6A = m4935getStateResultBWLJW6A(j, str, false, tasksRepository$getDeliveryAnalytics$2);
            if (objM4935getStateResultBWLJW6A == obj3) {
                int i8 = RatingCompat + 35;
                MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 22 / 0;
                }
                return obj3;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = RatingCompat + 25;
            MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                Object obj4 = ((onItemDismiss) obj2).IconCompatParcelizer;
                obj.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            objM4935getStateResultBWLJW6A = ((onItemDismiss) obj2).IconCompatParcelizer;
        }
        return objM4935getStateResultBWLJW6A instanceof isItemDismissable ? objM4935getStateResultBWLJW6A : ((PreviewActivityExternalSyntheticLambda4) objM4935getStateResultBWLJW6A).write();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: getDeliveryTrackingEvents-0E7RQCE$implementation, reason: not valid java name */
    public final Object m4934getDeliveryTrackingEvents0E7RQCE$implementation(long j, String str, ContinuationImpl continuationImpl) throws Throwable {
        TasksRepository$getDeliveryTrackingEvents$1 tasksRepository$getDeliveryTrackingEvents$1;
        Object objM4935getStateResultBWLJW6A;
        int i = 2 % 2;
        if (continuationImpl instanceof TasksRepository$getDeliveryTrackingEvents$1) {
            tasksRepository$getDeliveryTrackingEvents$1 = (TasksRepository$getDeliveryTrackingEvents$1) continuationImpl;
            int i2 = tasksRepository$getDeliveryTrackingEvents$1.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tasksRepository$getDeliveryTrackingEvents$1.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                tasksRepository$getDeliveryTrackingEvents$1 = new TasksRepository$getDeliveryTrackingEvents$1(this, continuationImpl);
            }
        } else {
            tasksRepository$getDeliveryTrackingEvents$1 = new TasksRepository$getDeliveryTrackingEvents$1(this, continuationImpl);
        }
        TasksRepository$getDeliveryTrackingEvents$1 tasksRepository$getDeliveryTrackingEvents$2 = tasksRepository$getDeliveryTrackingEvents$1;
        int i3 = MediaBrowserCompatMediaItem + 1;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 3 % 5;
        }
        Object obj = tasksRepository$getDeliveryTrackingEvents$2.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = tasksRepository$getDeliveryTrackingEvents$2.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            tasksRepository$getDeliveryTrackingEvents$2.RemoteActionCompatParcelizer = 1;
            objM4935getStateResultBWLJW6A = m4935getStateResultBWLJW6A(j, str, false, tasksRepository$getDeliveryTrackingEvents$2);
            if (objM4935getStateResultBWLJW6A == obj2) {
                return obj2;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = RatingCompat + 79;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM4935getStateResultBWLJW6A = ((onItemDismiss) obj).IconCompatParcelizer;
                int i7 = 92 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM4935getStateResultBWLJW6A = ((onItemDismiss) obj).IconCompatParcelizer;
            }
            int i8 = MediaBrowserCompatMediaItem + 13;
            RatingCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        return !(objM4935getStateResultBWLJW6A instanceof isItemDismissable) ? ((PreviewActivityExternalSyntheticLambda4) objM4935getStateResultBWLJW6A).serializer() : objM4935getStateResultBWLJW6A;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: getTasks-0E7RQCE$implementation, reason: not valid java name */
    public final Object m4936getTasks0E7RQCE$implementation(long j, String str, ContinuationImpl continuationImpl) throws Throwable {
        TasksRepository$getTasks$1 tasksRepository$getTasks$1;
        int i;
        TasksRepository$getTasks$1 tasksRepository$getTasks$2;
        Object obj;
        Object obj2;
        int i2;
        Object objM4935getStateResultBWLJW6A;
        int i3 = 2 % 2;
        int i4 = MediaBrowserCompatMediaItem + 95;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            if (continuationImpl instanceof TasksRepository$getTasks$1) {
                tasksRepository$getTasks$1 = (TasksRepository$getTasks$1) continuationImpl;
                i = tasksRepository$getTasks$1.serializer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    tasksRepository$getTasks$1.serializer = i - Integer.MIN_VALUE;
                }
            }
            tasksRepository$getTasks$2 = tasksRepository$getTasks$1;
            obj = tasksRepository$getTasks$2.RemoteActionCompatParcelizer;
            obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = tasksRepository$getTasks$2.serializer;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                tasksRepository$getTasks$2.serializer = 1;
                objM4935getStateResultBWLJW6A = m4935getStateResultBWLJW6A(j, str, true, tasksRepository$getTasks$2);
                if (objM4935getStateResultBWLJW6A == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM4935getStateResultBWLJW6A = ((onItemDismiss) obj).IconCompatParcelizer;
            }
            if (objM4935getStateResultBWLJW6A instanceof isItemDismissable) {
                return objM4935getStateResultBWLJW6A;
            }
            int i5 = MediaBrowserCompatMediaItem + 87;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return ((PreviewActivityExternalSyntheticLambda4) objM4935getStateResultBWLJW6A).RemoteActionCompatParcelizer();
        }
        int i7 = 14 / 0;
        if (continuationImpl instanceof TasksRepository$getTasks$1) {
            tasksRepository$getTasks$1 = (TasksRepository$getTasks$1) continuationImpl;
            i = tasksRepository$getTasks$1.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                tasksRepository$getTasks$1.serializer = i - Integer.MIN_VALUE;
            }
        }
        tasksRepository$getTasks$2 = tasksRepository$getTasks$1;
        obj = tasksRepository$getTasks$2.RemoteActionCompatParcelizer;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = tasksRepository$getTasks$2.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            tasksRepository$getTasks$2.serializer = 1;
            objM4935getStateResultBWLJW6A = m4935getStateResultBWLJW6A(j, str, true, tasksRepository$getTasks$2);
            if (objM4935getStateResultBWLJW6A == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4935getStateResultBWLJW6A = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (objM4935getStateResultBWLJW6A instanceof isItemDismissable) {
            return objM4935getStateResultBWLJW6A;
        }
        int i8 = MediaBrowserCompatMediaItem + 87;
        RatingCompat = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return ((PreviewActivityExternalSyntheticLambda4) objM4935getStateResultBWLJW6A).RemoteActionCompatParcelizer();
        tasksRepository$getTasks$1 = new TasksRepository$getTasks$1(this, continuationImpl);
        tasksRepository$getTasks$2 = tasksRepository$getTasks$1;
        obj = tasksRepository$getTasks$2.RemoteActionCompatParcelizer;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = tasksRepository$getTasks$2.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            tasksRepository$getTasks$2.serializer = 1;
            objM4935getStateResultBWLJW6A = m4935getStateResultBWLJW6A(j, str, true, tasksRepository$getTasks$2);
            if (objM4935getStateResultBWLJW6A == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4935getStateResultBWLJW6A = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (objM4935getStateResultBWLJW6A instanceof isItemDismissable) {
            return objM4935getStateResultBWLJW6A;
        }
        int i10 = MediaBrowserCompatMediaItem + 87;
        RatingCompat = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return ((PreviewActivityExternalSyntheticLambda4) objM4935getStateResultBWLJW6A).RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:? A[LOOP:1: B:8:0x0027->B:33:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public static r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ RemoteActionCompatParcelizer(List list) {
        Iterator it;
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = RatingCompat;
        int i4 = i3 + 19;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        List<showBackground> list2 = list;
        if (list2 instanceof Collection) {
            int i6 = i3 + 53;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (list2.isEmpty()) {
                z = true;
                break;
            }
            it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    z = true;
                    break;
                }
                i = MediaBrowserCompatMediaItem + 99;
                RatingCompat = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    ((uiMode) it.next()).write();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!((uiMode) it.next()).write()) {
                    int i8 = MediaBrowserCompatMediaItem + 77;
                    RatingCompat = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    z = false;
                    break;
                }
            }
        } else {
            it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    z = true;
                    break;
                }
                i = MediaBrowserCompatMediaItem + 99;
                RatingCompat = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    ((uiMode) it.next()).write();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!((uiMode) it.next()).write()) {
                    int i10 = MediaBrowserCompatMediaItem + 77;
                    RatingCompat = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    z = false;
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        for (showBackground showbackgroundRemoteActionCompatParcelizer : list2) {
            if (showbackgroundRemoteActionCompatParcelizer instanceof buildCompositionParentHierarchy) {
                showbackgroundRemoteActionCompatParcelizer = buildCompositionParentHierarchy.RemoteActionCompatParcelizer((buildCompositionParentHierarchy) showbackgroundRemoteActionCompatParcelizer, z);
                int i12 = RatingCompat + 27;
                MediaBrowserCompatMediaItem = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            }
            arrayList.add(showbackgroundRemoteActionCompatParcelizer);
        }
        return removeNodeAtDepth.read(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
    
        if (saveState(r3, r5, r11, r12, r8) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateTaskCache$implementation(long r11, java.lang.String r13, java.util.ArrayList r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r15 instanceof o.createTransitionInfodefault
            if (r1 == 0) goto L16
            r1 = r15
            o.createTransitionInfodefault r1 = (o.createTransitionInfodefault) r1
            int r2 = r1.MediaSessionCompatQueueItem
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 + r3
            r1.MediaSessionCompatQueueItem = r2
            goto L1b
        L16:
            o.createTransitionInfodefault r1 = new o.createTransitionInfodefault
            r1.<init>(r10, r15)
        L1b:
            r8 = r1
            int r15 = com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository.MediaBrowserCompatMediaItem
            int r15 = r15 + 59
            int r1 = r15 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository.RatingCompat = r1
            int r15 = r15 % r0
            java.lang.Object r15 = r8.MediaDescriptionCompat
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r8.MediaSessionCompatQueueItem
            r3 = 1
            r9 = 0
            if (r2 == 0) goto L58
            if (r2 == r3) goto L4a
            if (r2 != r0) goto L44
            int r11 = com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository.MediaBrowserCompatMediaItem
            int r11 = r11 + 63
            int r12 = r11 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository.RatingCompat = r12
            int r11 = r11 % r0
            java.lang.String r11 = r8.RemoteActionCompatParcelizer
            o.PreviewActivityExternalSyntheticLambda4 r12 = r8.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r15)
            goto La1
        L44:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r11)
            return r9
        L4a:
            long r11 = r8.IconCompatParcelizer
            java.util.ArrayList r14 = r8.serializer
            java.lang.String r13 = r8.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r15)
            o.onItemDismiss r15 = (o.onItemDismiss) r15
            java.lang.Object r15 = r15.IconCompatParcelizer
            goto L78
        L58:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r15)
            r8.write = r13
            r8.serializer = r14
            r8.IconCompatParcelizer = r11
            r8.MediaSessionCompatQueueItem = r3
            r6 = 0
            r2 = r10
            r3 = r11
            r5 = r13
            r7 = r8
            java.lang.Object r15 = r2.m4935getStateResultBWLJW6A(r3, r5, r6, r7)
            if (r15 != r1) goto L78
            int r11 = com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository.MediaBrowserCompatMediaItem
            int r11 = r11 + 115
            int r12 = r11 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository.RatingCompat = r12
            int r11 = r11 % r0
            goto La0
        L78:
            r3 = r11
            r5 = r13
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r15)
            o.PreviewActivityExternalSyntheticLambda4 r15 = (o.PreviewActivityExternalSyntheticLambda4) r15
            o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r11 = RemoteActionCompatParcelizer(r14)
            o.PreviewActivityExternalSyntheticLambda4 r12 = o.PreviewActivityExternalSyntheticLambda4.IconCompatParcelizer(r15, r11)
            java.lang.String r11 = read(r3, r5)
            r8.write = r9
            r8.serializer = r9
            r8.read = r12
            r8.RemoteActionCompatParcelizer = r11
            r8.IconCompatParcelizer = r3
            r8.MediaSessionCompatQueueItem = r0
            r2 = r10
            r6 = r11
            r7 = r12
            java.lang.Object r13 = r2.saveState(r3, r5, r6, r7, r8)
            if (r13 != r1) goto La1
        La0:
            return r1
        La1:
            r10.RemoteActionCompatParcelizer(r11, r12, r9)
            o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r11 = r12.RemoteActionCompatParcelizer()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository.updateTaskCache$implementation(long, java.lang.String, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public final Object getCachedState(long j, String str, ContinuationImpl continuationImpl) {
        Utils_androidKt utils_androidKt;
        String str2;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 83;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof Utils_androidKt) {
            utils_androidKt = (Utils_androidKt) continuationImpl;
            int i4 = utils_androidKt.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                utils_androidKt.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                utils_androidKt = new Utils_androidKt(this, continuationImpl);
            }
        } else {
            utils_androidKt = new Utils_androidKt(this, continuationImpl);
        }
        Object obj = utils_androidKt.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = utils_androidKt.IconCompatParcelizer;
        LruCache lruCache = this.write;
        int i6 = 1;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String str3 = read(j, str);
            PreviewActivityExternalSyntheticLambda4 previewActivityExternalSyntheticLambda4 = (PreviewActivityExternalSyntheticLambda4) lruCache.get(str3);
            if (previewActivityExternalSyntheticLambda4 != null) {
                int i7 = MediaBrowserCompatMediaItem + 103;
                int i8 = i7 % Fields.SpotShadowColor;
                RatingCompat = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 117;
                MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return previewActivityExternalSyntheticLambda4;
            }
            NoopClock noopClock = this.MediaDescriptionCompat;
            noopClock.getClass();
            str.getClass();
            FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new DeliveryTasksStateRepositoryImpl$getState$$inlined$map$1(new HeatmapDataStore$getBoolean$$inlined$map$1(noopClock.IconCompatParcelizer.IconCompatParcelizer.serializer(), NoopClock.RemoteActionCompatParcelizer(j, str), 2), i6), new MergedTaskStateRepositoryImpl$getMergedState$2(j, str, noopClock, (ShortNewsContentCardView) null));
            utils_androidKt.serializer = str3;
            utils_androidKt.IconCompatParcelizer = 1;
            Object objFirstOrNull = FlowKt.firstOrNull(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, utils_androidKt);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str3;
            obj = objFirstOrNull;
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = utils_androidKt.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        PreviewActivityExternalSyntheticLambda4 previewActivityExternalSyntheticLambda5 = (PreviewActivityExternalSyntheticLambda4) obj;
        if (previewActivityExternalSyntheticLambda5 == null) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("TasksRepository: getCachedState: DataStore miss for ", str2), new Object[0]);
            return null;
        }
        lruCache.put(str2, previewActivityExternalSyntheticLambda5);
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("TasksRepository: getCachedState: DataStore hit for ", str2, ", warming LRU"), new Object[0]);
        return previewActivityExternalSyntheticLambda5;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0211  */
    /* JADX WARN: Code duplicated, block: B:103:0x0216  */
    /* JADX WARN: Code duplicated, block: B:106:0x0224 A[Catch: all -> 0x0256, CancellationException -> 0x0258, TryCatch #16 {CancellationException -> 0x0258, all -> 0x0256, blocks: (B:101:0x0212, B:104:0x0220, B:106:0x0224, B:107:0x0237, B:108:0x0238, B:109:0x023d, B:110:0x023e, B:111:0x0255), top: B:158:0x0212 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0238 A[Catch: all -> 0x0256, CancellationException -> 0x0258, TryCatch #16 {CancellationException -> 0x0258, all -> 0x0256, blocks: (B:101:0x0212, B:104:0x0220, B:106:0x0224, B:107:0x0237, B:108:0x0238, B:109:0x023d, B:110:0x023e, B:111:0x0255), top: B:158:0x0212 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x023e A[Catch: all -> 0x0256, CancellationException -> 0x0258, TryCatch #16 {CancellationException -> 0x0258, all -> 0x0256, blocks: (B:101:0x0212, B:104:0x0220, B:106:0x0224, B:107:0x0237, B:108:0x0238, B:109:0x023d, B:110:0x023e, B:111:0x0255), top: B:158:0x0212 }] */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0125  */
    /* JADX WARN: Code duplicated, block: B:63:0x0131 A[Catch: all -> 0x0120, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:55:0x0119, B:63:0x0131, B:67:0x013b), top: B:138:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x013b A[Catch: all -> 0x0120, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:55:0x0119, B:63:0x0131, B:67:0x013b), top: B:138:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0141 A[Catch: all -> 0x0286, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0286, blocks: (B:51:0x0112, B:69:0x0141), top: B:143:0x0112 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0174  */
    /* JADX WARN: Code duplicated, block: B:76:0x0187 A[Catch: all -> 0x0089, CancellationException -> 0x025c, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x025c, blocks: (B:74:0x0181, B:76:0x0187), top: B:141:0x0181 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    /* JADX WARN: Instruction removed from duplicated block: B:106:0x0224, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v16, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v5, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: getStateResult-BWLJW6A, reason: not valid java name */
    public final Object m4935getStateResultBWLJW6A(long j, String str, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        TasksRepository$getStateResult$1 tasksRepository$getStateResult$1;
        ?? r12;
        ?? r6;
        ?? r3;
        Object isitemdismissable;
        Object obj;
        ?? r4;
        String str2;
        String str3;
        long j2;
        int i;
        ?? r7;
        boolean z2;
        String str4;
        int i2;
        int i3;
        long j3;
        boolean z3;
        String str5;
        PreviewActivityExternalSyntheticLambda4 previewActivityExternalSyntheticLambda4;
        getEmptyBox getemptybox;
        int i4;
        long j4;
        String str6;
        String str7;
        int i5;
        int i6;
        int i7;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        int i8;
        getOptimizationLevel getoptimizationlevel;
        getEmptyBox getemptybox2;
        PreviewActivityExternalSyntheticLambda4 previewActivityExternalSyntheticLambda5;
        PreviewActivityExternalSyntheticLambda4 previewActivityExternalSyntheticLambda6;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer;
        Object objFirst;
        int i9;
        int i10 = 2 % 2;
        int i11 = MediaBrowserCompatMediaItem + 85;
        RatingCompat = i11 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i11 % 2 == 0) {
            boolean z4 = continuationImpl instanceof TasksRepository$getStateResult$1;
            obj2.hashCode();
            throw null;
        }
        if (continuationImpl instanceof TasksRepository$getStateResult$1) {
            tasksRepository$getStateResult$1 = (TasksRepository$getStateResult$1) continuationImpl;
            int i12 = tasksRepository$getStateResult$1.ParcelableVolumeInfo;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                tasksRepository$getStateResult$1.ParcelableVolumeInfo = i12 - Integer.MIN_VALUE;
            } else {
                tasksRepository$getStateResult$1 = new TasksRepository$getStateResult$1(this, continuationImpl);
            }
        } else {
            tasksRepository$getStateResult$1 = new TasksRepository$getStateResult$1(this, continuationImpl);
        }
        TasksRepository$getStateResult$1 tasksRepository$getStateResult$2 = tasksRepository$getStateResult$1;
        Object obj3 = tasksRepository$getStateResult$2.MediaSessionCompatToken;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = tasksRepository$getStateResult$2.ParcelableVolumeInfo;
        ?? r5 = 1;
        r5 = 1;
        try {
            try {
                if (i13 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj3);
                    String str8 = read(j, str);
                    str2 = str;
                    tasksRepository$getStateResult$2.MediaMetadataCompat = str2;
                    tasksRepository$getStateResult$2.MediaBrowserCompatMediaItem = str8;
                    MutexImpl mutexImpl = this.read;
                    tasksRepository$getStateResult$2.MediaSessionCompatQueueItem = mutexImpl;
                    tasksRepository$getStateResult$2.write = j;
                    tasksRepository$getStateResult$2.PlaybackStateCompat = z;
                    tasksRepository$getStateResult$2.read = 0;
                    tasksRepository$getStateResult$2.ParcelableVolumeInfo = 1;
                    if (mutexImpl.lock(tasksRepository$getStateResult$2) != coroutineSingletons) {
                        str3 = str8;
                        j2 = j;
                        i = 0;
                        r7 = mutexImpl;
                        z2 = z;
                    }
                    return coroutineSingletons;
                }
                if (i13 != 1) {
                    int i14 = RatingCompat + 125;
                    int i15 = i14 % Fields.SpotShadowColor;
                    MediaBrowserCompatMediaItem = i15;
                    if (i14 % 2 == 0 ? i13 != 2 : i13 != 2) {
                        if (i13 != 3) {
                            int i16 = i15 + 31;
                            RatingCompat = i16 % Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            if (i13 != 4) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            getemptybox = tasksRepository$getStateResult$2.PlaybackStateCompatCustomAction;
                            PreviewActivityExternalSyntheticLambda4 previewActivityExternalSyntheticLambda7 = tasksRepository$getStateResult$2.MediaDescriptionCompat;
                            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0 = tasksRepository$getStateResult$2.MediaSessionCompatQueueItem;
                            str5 = tasksRepository$getStateResult$2.MediaBrowserCompatMediaItem;
                            ExtrasKt.RemoteActionCompatParcelizer(obj3);
                            previewActivityExternalSyntheticLambda4 = previewActivityExternalSyntheticLambda7;
                            r5 = setcustominappmessageanimationfactorylambda0;
                            RemoteActionCompatParcelizer(str5, previewActivityExternalSyntheticLambda4, removeNodeAtDepth.read(getemptybox.write()));
                            i4 = RatingCompat + 105;
                            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                            isitemdismissable = previewActivityExternalSyntheticLambda4;
                            r3 = r5;
                            if (i4 % 2 != 0) {
                                int i18 = 5 / 3;
                                isitemdismissable = previewActivityExternalSyntheticLambda4;
                                r3 = r5;
                            }
                            obj = isitemdismissable;
                            r4 = r3;
                            r4.write(null);
                            int i19 = MediaBrowserCompatMediaItem + 69;
                            RatingCompat = i19 % Fields.SpotShadowColor;
                            int i20 = i19 % 2;
                            return obj;
                        }
                        i8 = tasksRepository$getStateResult$2.serializer;
                        i7 = tasksRepository$getStateResult$2.RemoteActionCompatParcelizer;
                        i6 = tasksRepository$getStateResult$2.IconCompatParcelizer;
                        i5 = tasksRepository$getStateResult$2.read;
                        z3 = tasksRepository$getStateResult$2.PlaybackStateCompat;
                        j4 = tasksRepository$getStateResult$2.write;
                        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = tasksRepository$getStateResult$2.RatingCompat;
                        r12 = tasksRepository$getStateResult$2.MediaSessionCompatQueueItem;
                        str6 = tasksRepository$getStateResult$2.MediaBrowserCompatMediaItem;
                        str7 = tasksRepository$getStateResult$2.MediaMetadataCompat;
                        try {
                            try {
                                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                                r12 = r12;
                                getoptimizationlevel = (getOptimizationLevel) obj3;
                                if (getoptimizationlevel instanceof getSceneString) {
                                    if (getoptimizationlevel instanceof getMaxWidth) {
                                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(((getMaxWidth) getoptimizationlevel).RatingCompat(), "TasksRepository: Failed getStateResult", new Object[0]);
                                        throw ((getMaxWidth) getoptimizationlevel).RatingCompat();
                                    }
                                    int i21 = RatingCompat + 31;
                                    MediaBrowserCompatMediaItem = i21 % Fields.SpotShadowColor;
                                    int i22 = i21 % 2;
                                    if (!(getoptimizationlevel instanceof onViewAdded)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw new IllegalStateException("unexpected state: " + getoptimizationlevel);
                                }
                                getemptybox2 = (getEmptyBox) ((getSceneString) getoptimizationlevel).MediaBrowserCompatMediaItem();
                                previewActivityExternalSyntheticLambda5 = new PreviewActivityExternalSyntheticLambda4(RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, getemptybox2.write())), getemptybox2.RemoteActionCompatParcelizer(), getemptybox2.IconCompatParcelizer());
                                tasksRepository$getStateResult$2.MediaMetadataCompat = null;
                                tasksRepository$getStateResult$2.MediaBrowserCompatMediaItem = str6;
                                tasksRepository$getStateResult$2.MediaSessionCompatQueueItem = r12;
                                tasksRepository$getStateResult$2.RatingCompat = null;
                                tasksRepository$getStateResult$2.MediaDescriptionCompat = previewActivityExternalSyntheticLambda5;
                                tasksRepository$getStateResult$2.PlaybackStateCompatCustomAction = getemptybox2;
                                tasksRepository$getStateResult$2.write = j4;
                                tasksRepository$getStateResult$2.PlaybackStateCompat = z3;
                                tasksRepository$getStateResult$2.read = i5;
                                tasksRepository$getStateResult$2.IconCompatParcelizer = i6;
                                tasksRepository$getStateResult$2.RemoteActionCompatParcelizer = i7;
                                tasksRepository$getStateResult$2.serializer = i8;
                                tasksRepository$getStateResult$2.ParcelableVolumeInfo = 4;
                                if (saveState(j4, str7, str6, previewActivityExternalSyntheticLambda5, tasksRepository$getStateResult$2) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                getemptybox = getemptybox2;
                                str5 = str6;
                                r5 = r12;
                                previewActivityExternalSyntheticLambda4 = previewActivityExternalSyntheticLambda5;
                                RemoteActionCompatParcelizer(str5, previewActivityExternalSyntheticLambda4, removeNodeAtDepth.read(getemptybox.write()));
                                i4 = RatingCompat + 105;
                                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                                isitemdismissable = previewActivityExternalSyntheticLambda4;
                                r3 = r5;
                                if (i4 % 2 != 0) {
                                    int i110 = 5 / 3;
                                    isitemdismissable = previewActivityExternalSyntheticLambda4;
                                    r3 = r5;
                                }
                                obj = isitemdismissable;
                                r4 = r3;
                                r4.write(null);
                                int i111 = MediaBrowserCompatMediaItem + 69;
                                RatingCompat = i111 % Fields.SpotShadowColor;
                                int i23 = i111 % 2;
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                r5 = r12;
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "runSuspendCatching: Failed to execute suspend task", new Object[0]);
                                isitemdismissable = new isItemDismissable(th);
                                r3 = r5;
                                obj = isitemdismissable;
                                r4 = r3;
                                r4.write(null);
                                int i112 = MediaBrowserCompatMediaItem + 69;
                                RatingCompat = i112 % Fields.SpotShadowColor;
                                int i24 = i112 % 2;
                                return obj;
                            }
                        } catch (CancellationException e) {
                            e = e;
                            r5 = r12;
                            r12 = r5;
                            throw e;
                        }
                        throw e;
                    }
                    i2 = tasksRepository$getStateResult$2.IconCompatParcelizer;
                    i3 = tasksRepository$getStateResult$2.read;
                    boolean z5 = tasksRepository$getStateResult$2.PlaybackStateCompat;
                    j3 = tasksRepository$getStateResult$2.write;
                    r7 = tasksRepository$getStateResult$2.MediaSessionCompatQueueItem;
                    str3 = tasksRepository$getStateResult$2.MediaBrowserCompatMediaItem;
                    str4 = tasksRepository$getStateResult$2.MediaMetadataCompat;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(obj3);
                        z3 = z5;
                        r5 = r7;
                        try {
                            previewActivityExternalSyntheticLambda6 = (PreviewActivityExternalSyntheticLambda4) obj3;
                            try {
                                if (!z3 || previewActivityExternalSyntheticLambda6 == null) {
                                    if (previewActivityExternalSyntheticLambda6 != null) {
                                        i9 = RatingCompat + 59;
                                        MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                                        if (i9 % 2 != 0) {
                                            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = previewActivityExternalSyntheticLambda6.RemoteActionCompatParcelizer();
                                            int i25 = 33 / 0;
                                            if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer == null) {
                                                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = SmallPersistentVector.RemoteActionCompatParcelizer;
                                            }
                                        } else {
                                            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = previewActivityExternalSyntheticLambda6.RemoteActionCompatParcelizer();
                                            if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer == null) {
                                                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = SmallPersistentVector.RemoteActionCompatParcelizer;
                                            }
                                        }
                                    } else {
                                        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = SmallPersistentVector.RemoteActionCompatParcelizer;
                                    }
                                    Flow flowSerializer = this.serializer.serializer(new r8lambda8L8lXCy99H67Fo1WTKvaQj9opM(j3));
                                    SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(12);
                                    tasksRepository$getStateResult$2.MediaMetadataCompat = str4;
                                    tasksRepository$getStateResult$2.MediaBrowserCompatMediaItem = str3;
                                    tasksRepository$getStateResult$2.MediaSessionCompatQueueItem = r5;
                                    tasksRepository$getStateResult$2.RatingCompat = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer;
                                    tasksRepository$getStateResult$2.write = j3;
                                    tasksRepository$getStateResult$2.PlaybackStateCompat = z3;
                                    tasksRepository$getStateResult$2.read = i3;
                                    tasksRepository$getStateResult$2.IconCompatParcelizer = i2;
                                    tasksRepository$getStateResult$2.RemoteActionCompatParcelizer = 0;
                                    tasksRepository$getStateResult$2.serializer = 0;
                                    tasksRepository$getStateResult$2.ParcelableVolumeInfo = 3;
                                    objFirst = FlowKt.first(flowSerializer, signInDataStore$clear$2, tasksRepository$getStateResult$2);
                                    if (objFirst != coroutineSingletons) {
                                        j4 = j3;
                                        i6 = i2;
                                        i5 = i3;
                                        i8 = 0;
                                        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer;
                                        obj3 = objFirst;
                                        r12 = r5;
                                        i7 = 0;
                                        String str9 = str4;
                                        str6 = str3;
                                        str7 = str9;
                                        try {
                                            getoptimizationlevel = (getOptimizationLevel) obj3;
                                            if (getoptimizationlevel instanceof getSceneString) {
                                                getemptybox2 = (getEmptyBox) ((getSceneString) getoptimizationlevel).MediaBrowserCompatMediaItem();
                                                try {
                                                    previewActivityExternalSyntheticLambda5 = new PreviewActivityExternalSyntheticLambda4(RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, getemptybox2.write())), getemptybox2.RemoteActionCompatParcelizer(), getemptybox2.IconCompatParcelizer());
                                                    tasksRepository$getStateResult$2.MediaMetadataCompat = null;
                                                    tasksRepository$getStateResult$2.MediaBrowserCompatMediaItem = str6;
                                                    tasksRepository$getStateResult$2.MediaSessionCompatQueueItem = r12;
                                                    tasksRepository$getStateResult$2.RatingCompat = null;
                                                    tasksRepository$getStateResult$2.MediaDescriptionCompat = previewActivityExternalSyntheticLambda5;
                                                    tasksRepository$getStateResult$2.PlaybackStateCompatCustomAction = getemptybox2;
                                                    tasksRepository$getStateResult$2.write = j4;
                                                    tasksRepository$getStateResult$2.PlaybackStateCompat = z3;
                                                    tasksRepository$getStateResult$2.read = i5;
                                                    tasksRepository$getStateResult$2.IconCompatParcelizer = i6;
                                                    tasksRepository$getStateResult$2.RemoteActionCompatParcelizer = i7;
                                                    tasksRepository$getStateResult$2.serializer = i8;
                                                    tasksRepository$getStateResult$2.ParcelableVolumeInfo = 4;
                                                    if (saveState(j4, str7, str6, previewActivityExternalSyntheticLambda5, tasksRepository$getStateResult$2) == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    getemptybox = getemptybox2;
                                                    str5 = str6;
                                                    r5 = r12;
                                                    previewActivityExternalSyntheticLambda4 = previewActivityExternalSyntheticLambda5;
                                                    try {
                                                        try {
                                                            RemoteActionCompatParcelizer(str5, previewActivityExternalSyntheticLambda4, removeNodeAtDepth.read(getemptybox.write()));
                                                            i4 = RatingCompat + 105;
                                                            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                                                            isitemdismissable = previewActivityExternalSyntheticLambda4;
                                                            r3 = r5;
                                                            if (i4 % 2 != 0) {
                                                                int i113 = 5 / 3;
                                                                isitemdismissable = previewActivityExternalSyntheticLambda4;
                                                                r3 = r5;
                                                            }
                                                        } catch (CancellationException e2) {
                                                            e = e2;
                                                            r12 = r5;
                                                            throw e;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            try {
                                                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "runSuspendCatching: Failed to execute suspend task", new Object[0]);
                                                                isitemdismissable = new isItemDismissable(th);
                                                                r3 = r5;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                r6 = r5;
                                                                r6.write(null);
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (CancellationException e3) {
                                                        e = e3;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                    }
                                                    obj = isitemdismissable;
                                                    r4 = r3;
                                                } catch (CancellationException e4) {
                                                    e = e4;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    r5 = r12;
                                                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "runSuspendCatching: Failed to execute suspend task", new Object[0]);
                                                    isitemdismissable = new isItemDismissable(th);
                                                    r3 = r5;
                                                    obj = isitemdismissable;
                                                    r4 = r3;
                                                    r4.write(null);
                                                    int i114 = MediaBrowserCompatMediaItem + 69;
                                                    RatingCompat = i114 % Fields.SpotShadowColor;
                                                    int i26 = i114 % 2;
                                                    return obj;
                                                }
                                            } else {
                                                try {
                                                    if (getoptimizationlevel instanceof getMaxWidth) {
                                                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(((getMaxWidth) getoptimizationlevel).RatingCompat(), "TasksRepository: Failed getStateResult", new Object[0]);
                                                        throw ((getMaxWidth) getoptimizationlevel).RatingCompat();
                                                    }
                                                    int i27 = RatingCompat + 31;
                                                    MediaBrowserCompatMediaItem = i27 % Fields.SpotShadowColor;
                                                    int i28 = i27 % 2;
                                                    if (!(getoptimizationlevel instanceof onViewAdded)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    throw new IllegalStateException("unexpected state: " + getoptimizationlevel);
                                                } catch (CancellationException e5) {
                                                    e = e5;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    r5 = r12;
                                                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "runSuspendCatching: Failed to execute suspend task", new Object[0]);
                                                    isitemdismissable = new isItemDismissable(th);
                                                    r3 = r5;
                                                    obj = isitemdismissable;
                                                    r4 = r3;
                                                    r4.write(null);
                                                    int i115 = MediaBrowserCompatMediaItem + 69;
                                                    RatingCompat = i115 % Fields.SpotShadowColor;
                                                    int i29 = i115 % 2;
                                                    return obj;
                                                }
                                            }
                                        } catch (CancellationException e6) {
                                            e = e6;
                                        }
                                        try {
                                            throw e;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            r6 = r12;
                                            r6.write(null);
                                            throw th;
                                        }
                                    }
                                    return coroutineSingletons;
                                }
                                RemoteActionCompatParcelizer(str3, previewActivityExternalSyntheticLambda6, null);
                                obj = previewActivityExternalSyntheticLambda6;
                                r4 = r5;
                                r4.write(null);
                                int i116 = MediaBrowserCompatMediaItem + 69;
                                RatingCompat = i116 % Fields.SpotShadowColor;
                                int i210 = i116 % 2;
                                return obj;
                            } catch (Throwable th8) {
                                th = th8;
                                r7 = r5;
                                r6 = r7;
                                r6.write(null);
                                throw th;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            r6 = r5;
                            r6.write(null);
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        r6 = r7;
                        r6.write(null);
                        throw th;
                    }
                }
                int i30 = tasksRepository$getStateResult$2.read;
                z2 = tasksRepository$getStateResult$2.PlaybackStateCompat;
                j2 = tasksRepository$getStateResult$2.write;
                setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = tasksRepository$getStateResult$2.MediaSessionCompatQueueItem;
                String str10 = tasksRepository$getStateResult$2.MediaBrowserCompatMediaItem;
                String str11 = tasksRepository$getStateResult$2.MediaMetadataCompat;
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                i = i30;
                str2 = str11;
                str3 = str10;
                r7 = setcustominappmessageanimationfactorylambda1;
                tasksRepository$getStateResult$2.MediaMetadataCompat = str2;
                tasksRepository$getStateResult$2.MediaBrowserCompatMediaItem = str3;
                tasksRepository$getStateResult$2.MediaSessionCompatQueueItem = r7;
                tasksRepository$getStateResult$2.write = j2;
                tasksRepository$getStateResult$2.PlaybackStateCompat = z2;
                tasksRepository$getStateResult$2.read = i;
                tasksRepository$getStateResult$2.IconCompatParcelizer = 0;
                tasksRepository$getStateResult$2.ParcelableVolumeInfo = 2;
                Object cachedState = getCachedState(j2, str2, tasksRepository$getStateResult$2);
                if (cachedState != coroutineSingletons) {
                    str4 = str2;
                    i2 = 0;
                    boolean z6 = z2;
                    i3 = i;
                    obj3 = cachedState;
                    j3 = j2;
                    r5 = r7;
                    z3 = z6;
                    previewActivityExternalSyntheticLambda6 = (PreviewActivityExternalSyntheticLambda4) obj3;
                    if (z3) {
                    }
                    if (previewActivityExternalSyntheticLambda6 != null) {
                        i9 = RatingCompat + 59;
                        MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 != 0) {
                            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = previewActivityExternalSyntheticLambda6.RemoteActionCompatParcelizer();
                            int i211 = 33 / 0;
                            if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer == null) {
                                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = SmallPersistentVector.RemoteActionCompatParcelizer;
                            }
                        } else {
                            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = previewActivityExternalSyntheticLambda6.RemoteActionCompatParcelizer();
                            if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer == null) {
                                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = SmallPersistentVector.RemoteActionCompatParcelizer;
                            }
                        }
                    } else {
                        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = SmallPersistentVector.RemoteActionCompatParcelizer;
                    }
                    Flow flowSerializer2 = this.serializer.serializer(new r8lambda8L8lXCy99H67Fo1WTKvaQj9opM(j3));
                    SignInDataStore$clear$2 signInDataStore$clear$3 = new SignInDataStore$clear$2(12);
                    tasksRepository$getStateResult$2.MediaMetadataCompat = str4;
                    tasksRepository$getStateResult$2.MediaBrowserCompatMediaItem = str3;
                    tasksRepository$getStateResult$2.MediaSessionCompatQueueItem = r5;
                    tasksRepository$getStateResult$2.RatingCompat = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer;
                    tasksRepository$getStateResult$2.write = j3;
                    tasksRepository$getStateResult$2.PlaybackStateCompat = z3;
                    tasksRepository$getStateResult$2.read = i3;
                    tasksRepository$getStateResult$2.IconCompatParcelizer = i2;
                    tasksRepository$getStateResult$2.RemoteActionCompatParcelizer = 0;
                    tasksRepository$getStateResult$2.serializer = 0;
                    tasksRepository$getStateResult$2.ParcelableVolumeInfo = 3;
                    objFirst = FlowKt.first(flowSerializer2, signInDataStore$clear$3, tasksRepository$getStateResult$2);
                    if (objFirst != coroutineSingletons) {
                        j4 = j3;
                        i6 = i2;
                        i5 = i3;
                        i8 = 0;
                        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer;
                        obj3 = objFirst;
                        r12 = r5;
                        i7 = 0;
                        String str12 = str4;
                        str6 = str3;
                        str7 = str12;
                        getoptimizationlevel = (getOptimizationLevel) obj3;
                        if (getoptimizationlevel instanceof getSceneString) {
                            if (getoptimizationlevel instanceof getMaxWidth) {
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(((getMaxWidth) getoptimizationlevel).RatingCompat(), "TasksRepository: Failed getStateResult", new Object[0]);
                                throw ((getMaxWidth) getoptimizationlevel).RatingCompat();
                            }
                            int i212 = RatingCompat + 31;
                            MediaBrowserCompatMediaItem = i212 % Fields.SpotShadowColor;
                            int i213 = i212 % 2;
                            if (!(getoptimizationlevel instanceof onViewAdded)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalStateException("unexpected state: " + getoptimizationlevel);
                        }
                        getemptybox2 = (getEmptyBox) ((getSceneString) getoptimizationlevel).MediaBrowserCompatMediaItem();
                        previewActivityExternalSyntheticLambda5 = new PreviewActivityExternalSyntheticLambda4(RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, getemptybox2.write())), getemptybox2.RemoteActionCompatParcelizer(), getemptybox2.IconCompatParcelizer());
                        tasksRepository$getStateResult$2.MediaMetadataCompat = null;
                        tasksRepository$getStateResult$2.MediaBrowserCompatMediaItem = str6;
                        tasksRepository$getStateResult$2.MediaSessionCompatQueueItem = r12;
                        tasksRepository$getStateResult$2.RatingCompat = null;
                        tasksRepository$getStateResult$2.MediaDescriptionCompat = previewActivityExternalSyntheticLambda5;
                        tasksRepository$getStateResult$2.PlaybackStateCompatCustomAction = getemptybox2;
                        tasksRepository$getStateResult$2.write = j4;
                        tasksRepository$getStateResult$2.PlaybackStateCompat = z3;
                        tasksRepository$getStateResult$2.read = i5;
                        tasksRepository$getStateResult$2.IconCompatParcelizer = i6;
                        tasksRepository$getStateResult$2.RemoteActionCompatParcelizer = i7;
                        tasksRepository$getStateResult$2.serializer = i8;
                        tasksRepository$getStateResult$2.ParcelableVolumeInfo = 4;
                        if (saveState(j4, str7, str6, previewActivityExternalSyntheticLambda5, tasksRepository$getStateResult$2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        getemptybox = getemptybox2;
                        str5 = str6;
                        r5 = r12;
                        previewActivityExternalSyntheticLambda4 = previewActivityExternalSyntheticLambda5;
                        RemoteActionCompatParcelizer(str5, previewActivityExternalSyntheticLambda4, removeNodeAtDepth.read(getemptybox.write()));
                        i4 = RatingCompat + 105;
                        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                        isitemdismissable = previewActivityExternalSyntheticLambda4;
                        r3 = r5;
                        if (i4 % 2 != 0) {
                            int i117 = 5 / 3;
                            isitemdismissable = previewActivityExternalSyntheticLambda4;
                            r3 = r5;
                        }
                        obj = isitemdismissable;
                        r4 = r3;
                        r4.write(null);
                        int i118 = MediaBrowserCompatMediaItem + 69;
                        RatingCompat = i118 % Fields.SpotShadowColor;
                        int i214 = i118 % 2;
                        return obj;
                        throw e;
                    }
                }
                return coroutineSingletons;
            } catch (Throwable th11) {
                th = th11;
                r6 = r7;
                r6.write(null);
                throw th;
            }
        } catch (CancellationException e7) {
            e = e7;
        } catch (Throwable th12) {
            th = th12;
        }
    }
}
