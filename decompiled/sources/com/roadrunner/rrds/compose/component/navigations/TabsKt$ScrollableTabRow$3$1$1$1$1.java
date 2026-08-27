package com.roadrunner.rrds.compose.component.navigations;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class TabsKt$ScrollableTabRow$3$1$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int serializer;
    public final /* synthetic */ PagerState write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsKt$ScrollableTabRow$3$1$1$1$1(int i, PagerState pagerState, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = pagerState;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        TabsKt$ScrollableTabRow$3$1$1$1$1 tabsKt$ScrollableTabRow$3$1$1$1$1 = new TabsKt$ScrollableTabRow$3$1$1$1$1(this.RemoteActionCompatParcelizer, this.write, shortNewsContentCardView);
        int i2 = read + 71;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return tabsKt$ScrollableTabRow$3$1$1$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((TabsKt$ScrollableTabRow$3$1$1$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = read + 31;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.serializer;
        if (i2 != 0) {
            int i3 = read;
            int i4 = i3 + 123;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Object obj2 = null;
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = i3 + 43;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                obj2.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.serializer = 1;
            if (this.write.animateScrollToPage(this.RemoteActionCompatParcelizer, DelayKt.IconCompatParcelizer(0.0f, 0.0f, 7, (Object) null), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createFromParcel.INSTANCE;
    }
}
