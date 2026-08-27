package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.SimpleLayoutKtSimpleLayout11;
import o.applyMeasureResultfoundation;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollableNode$onKeyEvent$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int IconCompatParcelizer;
    public final /* synthetic */ ScrollableNode RemoteActionCompatParcelizer;
    public /* synthetic */ long read;
    public final /* synthetic */ int write;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ long RemoteActionCompatParcelizer;
        public /* synthetic */ Object serializer;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.RemoteActionCompatParcelizer, shortNewsContentCardView);
            anonymousClass1.serializer = obj;
            return anonymousClass1;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((SimpleLayoutKtSimpleLayout11) obj, (ShortNewsContentCardView) obj2);
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            anonymousClass1.invokeSuspend(createfromparcel);
            return createfromparcel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SimpleLayoutKtSimpleLayout11 simpleLayoutKtSimpleLayout11 = (SimpleLayoutKtSimpleLayout11) this.serializer;
            int iM1938getUserInputWNlRxjI = NestedScrollSource.Companion.m1938getUserInputWNlRxjI();
            ScrollingLogic scrollingLogic = simpleLayoutKtSimpleLayout11.write;
            scrollingLogic.serializer(scrollingLogic.RatingCompat, this.RemoteActionCompatParcelizer, iM1938getUserInputWNlRxjI);
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrollableNode$onKeyEvent$1(ScrollableNode scrollableNode, long j, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.RemoteActionCompatParcelizer = scrollableNode;
        this.read = j;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            return ((ScrollableNode$onKeyEvent$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        if (i == 1) {
            return ((ScrollableNode$onKeyEvent$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        if (i == 2) {
            return ((ScrollableNode$onKeyEvent$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        return ((ScrollableNode$onKeyEvent$1) create(Offset.m466boximpl(((Offset) obj).m487unboximpl()), (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ScrollableNode scrollableNode = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.IconCompatParcelizer;
            if (i2 != 0) {
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ScrollingLogic scrollingLogic = scrollableNode.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            applyMeasureResultfoundation applymeasureresultfoundation = applyMeasureResultfoundation.UserInput;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.read, null);
            this.IconCompatParcelizer = 1;
            return scrollingLogic.scroll(applymeasureresultfoundation, anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        if (i == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.IconCompatParcelizer;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ScrollingLogic scrollingLogic2 = scrollableNode.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            long j = this.read;
            this.IconCompatParcelizer = 1;
            return scrollingLogic2.m57onScrollStoppedBMRW4eQ(j, false, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        if (i == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.IconCompatParcelizer;
            if (i4 != 0) {
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ScrollingLogic scrollingLogic3 = scrollableNode.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            long j2 = this.read;
            this.IconCompatParcelizer = 1;
            return scrollingLogic3.m57onScrollStoppedBMRW4eQ(j2, true, this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.IconCompatParcelizer;
        if (i5 != 0) {
            if (i5 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        long j3 = this.read;
        ScrollingLogic scrollingLogic4 = scrollableNode.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        this.IconCompatParcelizer = 1;
        Object objM53access$semanticsScrollByd4ec7I = ScrollableKt.m53access$semanticsScrollByd4ec7I(scrollingLogic4, j3, this);
        return objM53access$semanticsScrollByd4ec7I == coroutineSingletons4 ? coroutineSingletons4 : objM53access$semanticsScrollByd4ec7I;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.write;
        if (i == 0) {
            return new ScrollableNode$onKeyEvent$1(this.RemoteActionCompatParcelizer, this.read, shortNewsContentCardView, 0);
        }
        if (i == 1) {
            return new ScrollableNode$onKeyEvent$1(this.RemoteActionCompatParcelizer, this.read, shortNewsContentCardView, 1);
        }
        if (i == 2) {
            return new ScrollableNode$onKeyEvent$1(this.RemoteActionCompatParcelizer, this.read, shortNewsContentCardView, 2);
        }
        ScrollableNode$onKeyEvent$1 scrollableNode$onKeyEvent$1 = new ScrollableNode$onKeyEvent$1(this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        scrollableNode$onKeyEvent$1.read = ((Offset) obj).m487unboximpl();
        return scrollableNode$onKeyEvent$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onKeyEvent$1(ScrollableNode scrollableNode, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = 3;
        this.RemoteActionCompatParcelizer = scrollableNode;
    }
}
