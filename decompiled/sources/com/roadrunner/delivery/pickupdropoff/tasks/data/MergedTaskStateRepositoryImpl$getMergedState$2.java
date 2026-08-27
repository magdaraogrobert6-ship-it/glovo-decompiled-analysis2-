package com.roadrunner.delivery.pickupdropoff.tasks.data;

import androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.NoopClock;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getBitmapFromCache;
import o.getContentViewGroupParentLayout;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class MergedTaskStateRepositoryImpl$getMergedState$2 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public /* synthetic */ long read;
    public final /* synthetic */ int serializer = 0;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MergedTaskStateRepositoryImpl$getMergedState$2(long j, String str, NoopClock noopClock, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.read = j;
        this.write = str;
        this.MediaMetadataCompat = noopClock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MergedTaskStateRepositoryImpl$getMergedState$2(getContentViewGroupParentLayout getcontentviewgroupparentlayout, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, MutableInteractionSourceImpl mutableInteractionSourceImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        this.write = populateViewStructure_androidKtpopulate7;
        this.MediaMetadataCompat = mutableInteractionSourceImpl;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 103;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.MediaMetadataCompat;
        Object obj5 = this.write;
        if (i4 != 0) {
            long jM487unboximpl = ((Offset) obj2).m487unboximpl();
            MergedTaskStateRepositoryImpl$getMergedState$2 mergedTaskStateRepositoryImpl$getMergedState$2 = new MergedTaskStateRepositoryImpl$getMergedState$2((getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer, (PopulateViewStructure_androidKtpopulate7) obj5, (MutableInteractionSourceImpl) obj4, (ShortNewsContentCardView) obj3);
            mergedTaskStateRepositoryImpl$getMergedState$2.IconCompatParcelizer = (PressGestureScopeImpl) obj;
            mergedTaskStateRepositoryImpl$getMergedState$2.read = jM487unboximpl;
            return mergedTaskStateRepositoryImpl$getMergedState$2.invokeSuspend(createfromparcel);
        }
        MergedTaskStateRepositoryImpl$getMergedState$2 mergedTaskStateRepositoryImpl$getMergedState$3 = new MergedTaskStateRepositoryImpl$getMergedState$2(this.read, (String) obj5, (NoopClock) obj4, (ShortNewsContentCardView) obj3);
        mergedTaskStateRepositoryImpl$getMergedState$3.IconCompatParcelizer = (FlowCollector) obj;
        mergedTaskStateRepositoryImpl$getMergedState$3.RemoteActionCompatParcelizer = (Throwable) obj2;
        Object objInvokeSuspend = mergedTaskStateRepositoryImpl$getMergedState$3.invokeSuspend(createfromparcel);
        int i5 = RatingCompat + 65;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00fd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Object objTryAwaitRelease;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 123;
        RatingCompat = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i4 = this.serializer;
        Object obj3 = createFromParcel.INSTANCE;
        Object obj4 = this.MediaMetadataCompat;
        Object obj5 = this.write;
        if (i4 != 0) {
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.MediaSessionCompatQueueItem;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                PressGestureScopeImpl pressGestureScopeImpl = (PressGestureScopeImpl) this.IconCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new AbstractClickableNode$handlePressInteractionRelease$1$1((PopulateViewStructure_androidKtpopulate7) obj5, this.read, (MutableInteractionSourceImpl) obj4, (ShortNewsContentCardView) null, 1), 3);
                this.MediaSessionCompatQueueItem = 1;
                objTryAwaitRelease = pressGestureScopeImpl.tryAwaitRelease(this);
                if (objTryAwaitRelease == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objTryAwaitRelease = obj;
            }
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RoomDatabase.AnonymousClass1.C00051((PopulateViewStructure_androidKtpopulate7) obj5, ((Boolean) objTryAwaitRelease).booleanValue(), (MutableInteractionSourceImpl) obj4, (ShortNewsContentCardView) null, 1), 3);
            int i6 = MediaBrowserCompatMediaItem + 71;
            RatingCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 5 % 3;
            }
            return obj3;
        }
        String str = (String) obj5;
        long j = this.read;
        FlowCollector flowCollector = (FlowCollector) this.IconCompatParcelizer;
        Throwable th = (Throwable) this.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.MediaSessionCompatQueueItem;
        if (i8 != 0) {
            if (i8 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else if (i8 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i9 = MediaBrowserCompatMediaItem + 107;
                RatingCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj3 = null;
            }
            i = MediaBrowserCompatMediaItem + 1;
            RatingCompat = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                return obj3;
            }
            obj2.hashCode();
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        StringBuilder sb = getBitmapFromCache.read("merged_task_state: Could not decode merged state for ", "-", j, str);
        sb.append(", deleting entry.");
        forest.RemoteActionCompatParcelizer(th, sb.toString(), new Object[0]);
        this.IconCompatParcelizer = flowCollector;
        this.RemoteActionCompatParcelizer = null;
        this.MediaSessionCompatQueueItem = 1;
        Object objDelete = ((NoopClock) obj4).IconCompatParcelizer.delete(NoopClock.RemoteActionCompatParcelizer(j, str), this);
        if (objDelete != coroutineSingletons2) {
            objDelete = obj3;
        }
        if (objDelete == coroutineSingletons2) {
            obj3 = coroutineSingletons2;
        }
        i = MediaBrowserCompatMediaItem + 1;
        RatingCompat = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return obj3;
        }
        obj2.hashCode();
        throw null;
        this.IconCompatParcelizer = null;
        this.RemoteActionCompatParcelizer = null;
        this.MediaSessionCompatQueueItem = 2;
        if (flowCollector.emit(null, this) == coroutineSingletons2) {
            obj3 = coroutineSingletons2;
        }
        i = MediaBrowserCompatMediaItem + 1;
        RatingCompat = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return obj3;
        }
        obj2.hashCode();
        throw null;
    }
}
