package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PlatformSelectionBehaviorsImpl;
import o.SelectionHandleIcon;
import o.ShortNewsContentCardView;
import o.SimpleLayoutKtSimpleLayout11;
import o.constructorimpl;
import o.createBrazeUserChangeEventSubscriberlambda0;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final /* synthetic */ ScrollingLogic MediaMetadataCompat;
    public createBrazeUserChangeEventSubscriberlambda0 RatingCompat;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public long read;
    public final /* synthetic */ createBrazeUserChangeEventSubscriberlambda0 serializer;
    public ScrollingLogic write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda0, long j, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaMetadataCompat = scrollingLogic;
        this.serializer = createbrazeuserchangeeventsubscriberlambda0;
        this.RemoteActionCompatParcelizer = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.MediaMetadataCompat, this.serializer, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        scrollingLogic$doFlingAnimation$2.IconCompatParcelizer = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$doFlingAnimation$2) create((SimpleLayoutKtSimpleLayout11) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda0;
        ScrollingLogic scrollingLogic;
        long j;
        ScrollingLogic scrollingLogic2;
        int i;
        float f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.MediaBrowserCompatMediaItem;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            final SimpleLayoutKtSimpleLayout11 simpleLayoutKtSimpleLayout11 = (SimpleLayoutKtSimpleLayout11) this.IconCompatParcelizer;
            final ScrollingLogic scrollingLogic3 = this.MediaMetadataCompat;
            PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = new PlatformSelectionBehaviorsImpl() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1
                @Override // o.PlatformSelectionBehaviorsImpl
                public final float read(float f2) {
                    float fAbs = Math.abs(f2);
                    ScrollingLogic scrollingLogic4 = scrollingLogic3;
                    if (fAbs != 0.0f && !((Boolean) scrollingLogic4.write.invoke()).booleanValue()) {
                        throw new FlingCancellationException("The fling animation was cancelled");
                    }
                    long jWrite = scrollingLogic4.write(scrollingLogic4.m59toOffsettuRUvjQ(f2));
                    return scrollingLogic4.RemoteActionCompatParcelizer(scrollingLogic4.m58toFloatk4lQ0M(simpleLayoutKtSimpleLayout11.write(NestedScrollSource.Companion.m1937getSideEffectWNlRxjI(), jWrite)));
                }
            };
            constructorimpl constructorimplVar = scrollingLogic3.serializer;
            createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda1 = this.serializer;
            long j2 = createbrazeuserchangeeventsubscriberlambda1.serializer;
            SelectionHandleIcon selectionHandleIcon = scrollingLogic3.MediaBrowserCompatMediaItem;
            SelectionHandleIcon selectionHandleIcon2 = SelectionHandleIcon.Horizontal;
            long j3 = this.RemoteActionCompatParcelizer;
            float fRemoteActionCompatParcelizer = scrollingLogic3.RemoteActionCompatParcelizer(selectionHandleIcon == selectionHandleIcon2 ? Velocity.m3911getXimpl(j3) : Velocity.m3912getYimpl(j3));
            this.IconCompatParcelizer = scrollingLogic3;
            this.write = scrollingLogic3;
            this.RatingCompat = createbrazeuserchangeeventsubscriberlambda1;
            this.read = j2;
            this.MediaBrowserCompatMediaItem = 1;
            obj = constructorimplVar.performFling(platformSelectionBehaviorsImpl, fRemoteActionCompatParcelizer, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            createbrazeuserchangeeventsubscriberlambda0 = createbrazeuserchangeeventsubscriberlambda1;
            scrollingLogic = scrollingLogic3;
            j = j2;
            scrollingLogic2 = scrollingLogic;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j4 = this.read;
            createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda2 = this.RatingCompat;
            ScrollingLogic scrollingLogic4 = this.write;
            scrollingLogic2 = (ScrollingLogic) this.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            createbrazeuserchangeeventsubscriberlambda0 = createbrazeuserchangeeventsubscriberlambda2;
            scrollingLogic = scrollingLogic4;
            j = j4;
        }
        float fRemoteActionCompatParcelizer2 = scrollingLogic2.RemoteActionCompatParcelizer(((Number) obj).floatValue());
        float f2 = 0.0f;
        if (scrollingLogic.MediaBrowserCompatMediaItem == SelectionHandleIcon.Horizontal) {
            f = fRemoteActionCompatParcelizer2;
            i = 2;
        } else {
            i = 1;
            f = 0.0f;
            f2 = fRemoteActionCompatParcelizer2;
        }
        createbrazeuserchangeeventsubscriberlambda0.serializer = Velocity.m3907copyOhffZ5M$default(j, f, f2, i, null);
        return createFromParcel.INSTANCE;
    }
}
