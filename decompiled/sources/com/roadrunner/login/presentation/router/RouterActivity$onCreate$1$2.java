package com.roadrunner.login.presentation.router;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.c8ExternalSyntheticLambda3;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.supportsColorMatrixQuery;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes4.dex */
public final class RouterActivity$onCreate$1$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ RouterActivity write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RouterActivity$onCreate$1$2(RouterActivity routerActivity, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.write = routerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        RouterActivity routerActivity = this.write;
        if (i3 == 0) {
            RouterActivity$onCreate$1$2 routerActivity$onCreate$1$2 = new RouterActivity$onCreate$1$2(routerActivity, shortNewsContentCardView, 0);
            int i4 = serializer + 51;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return routerActivity$onCreate$1$2;
        }
        int i6 = 1;
        if (i3 != 1) {
            if (i3 == 2) {
                return new RouterActivity$onCreate$1$2(routerActivity, shortNewsContentCardView, i);
            }
            int i7 = 3;
            if (i3 != 3) {
                return i3 != 4 ? new RouterActivity$onCreate$1$2(routerActivity, shortNewsContentCardView, 5) : new RouterActivity$onCreate$1$2(routerActivity, shortNewsContentCardView, 4);
            }
            return new RouterActivity$onCreate$1$2(routerActivity, shortNewsContentCardView, i7);
        }
        RouterActivity$onCreate$1$2 routerActivity$onCreate$1$3 = new RouterActivity$onCreate$1$2(routerActivity, shortNewsContentCardView, i6);
        int i8 = serializer + 45;
        read = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return routerActivity$onCreate$1$3;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 7;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((RouterActivity$onCreate$1$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 == 1) {
            return ((RouterActivity$onCreate$1$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 == 2) {
            return ((RouterActivity$onCreate$1$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 == 3) {
            return ((RouterActivity$onCreate$1$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 != 4) {
            return ((RouterActivity$onCreate$1$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((RouterActivity$onCreate$1$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = read + 23;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        RouterActivity routerActivity = this.write;
        int i3 = 3;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i4 = 1;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.RemoteActionCompatParcelizer;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                supportsColorMatrixQuery lifecycle = routerActivity.getLifecycle();
                toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.STARTED;
                RouterActivity$onCreate$1$2 routerActivity$onCreate$1$2 = new RouterActivity$onCreate$1$2(routerActivity, shortNewsContentCardView, i3);
                this.RemoteActionCompatParcelizer = 1;
                if (UrlUtils.repeatOnLifecycle(lifecycle, tocolorlong8_81lla, routerActivity$onCreate$1$2, this) == coroutineSingletons) {
                    obj2 = coroutineSingletons;
                }
            } else if (i5 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            int i6 = read + 117;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                return obj2;
            }
            throw null;
        }
        if (i2 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.RemoteActionCompatParcelizer;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                StateFlow stateFlow = RouterActivity.write(routerActivity).ParcelableVolumeInfo;
                c8ExternalSyntheticLambda3 c8externalsyntheticlambda3 = new c8ExternalSyntheticLambda3(routerActivity, i4);
                this.RemoteActionCompatParcelizer = 1;
                if (stateFlow.collect(c8externalsyntheticlambda3, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            } else {
                if (i7 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            DrawableTransformation.read();
            return null;
        }
        if (i2 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.RemoteActionCompatParcelizer;
            if (i8 != 0) {
                if (i8 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i9 = read + 49;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            supportsColorMatrixQuery lifecycle2 = routerActivity.getLifecycle();
            toColorLong8_81llA tocolorlong8_81lla2 = toColorLong8_81llA.STARTED;
            RouterActivity$onCreate$1$2 routerActivity$onCreate$1$3 = new RouterActivity$onCreate$1$2(routerActivity, shortNewsContentCardView, i4);
            this.RemoteActionCompatParcelizer = 1;
            if (UrlUtils.repeatOnLifecycle(lifecycle2, tocolorlong8_81lla2, routerActivity$onCreate$1$3, this) != coroutineSingletons3) {
                return obj2;
            }
            int i11 = serializer + 11;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return coroutineSingletons3;
        }
        int i13 = 0;
        if (i2 == 3) {
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i14 = this.RemoteActionCompatParcelizer;
            if (i14 != 0) {
                int i15 = serializer + 47;
                read = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                if (i14 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i17 = serializer + 41;
                    read = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                StateFlow stateFlow2 = RouterActivity.write(routerActivity).r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                c8ExternalSyntheticLambda3 c8externalsyntheticlambda4 = new c8ExternalSyntheticLambda3(routerActivity, i13);
                this.RemoteActionCompatParcelizer = 1;
                if (stateFlow2.collect(c8externalsyntheticlambda4, this) == coroutineSingletons4) {
                    int i19 = serializer + 59;
                    read = i19 % Fields.SpotShadowColor;
                    if (i19 % 2 == 0) {
                        return coroutineSingletons4;
                    }
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
            }
            DrawableTransformation.read();
            return null;
        }
        if (i2 == 4) {
            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i20 = this.RemoteActionCompatParcelizer;
            if (i20 != 0) {
                if (i20 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Flow flow = RouterActivity.serializer(routerActivity).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            RouterActivity$onCreate$1$3$1 routerActivity$onCreate$1$3$1 = new RouterActivity$onCreate$1$3$1(routerActivity, i13);
            this.RemoteActionCompatParcelizer = 1;
            return flow.collect(routerActivity$onCreate$1$3$1, this) == coroutineSingletons5 ? coroutineSingletons5 : obj2;
        }
        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i21 = this.RemoteActionCompatParcelizer;
        if (i21 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Flow flow2 = RouterActivity.write(routerActivity).r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            RouterActivity$onCreate$1$3$1 routerActivity$onCreate$1$3$2 = new RouterActivity$onCreate$1$3$1(routerActivity, i4);
            this.RemoteActionCompatParcelizer = 1;
            if (flow2.collect(routerActivity$onCreate$1$3$2, this) == coroutineSingletons6) {
                obj2 = coroutineSingletons6;
            }
        } else if (i21 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            obj2 = null;
        }
        int i22 = read + 31;
        serializer = i22 % Fields.SpotShadowColor;
        int i23 = i22 % 2;
        return obj2;
    }
}
