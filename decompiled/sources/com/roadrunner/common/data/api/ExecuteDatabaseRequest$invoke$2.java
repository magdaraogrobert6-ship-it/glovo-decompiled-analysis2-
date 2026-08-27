package com.roadrunner.common.data.api;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.common.data.CoroutineApiErrorHandlerKt;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getMaxWidth;
import o.getSceneString;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecuteDatabaseRequest$invoke$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExecuteDatabaseRequest$invoke$2(int i, ShortNewsContentCardView shortNewsContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.read;
        switch (i3) {
            case 0:
                return new ExecuteDatabaseRequest$invoke$2(0, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            case 1:
                return new ExecuteDatabaseRequest$invoke$2(1, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            case 2:
                ExecuteDatabaseRequest$invoke$2 executeDatabaseRequest$invoke$2 = new ExecuteDatabaseRequest$invoke$2(i, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                int i4 = write + 67;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return executeDatabaseRequest$invoke$2;
                }
                throw null;
            case 3:
                return new ExecuteDatabaseRequest$invoke$2(3, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            case 4:
                ExecuteDatabaseRequest$invoke$2 executeDatabaseRequest$invoke$3 = new ExecuteDatabaseRequest$invoke$2(4, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                int i5 = RemoteActionCompatParcelizer + 91;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return executeDatabaseRequest$invoke$3;
            case 5:
                return new ExecuteDatabaseRequest$invoke$2(5, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            case 6:
                ExecuteDatabaseRequest$invoke$2 executeDatabaseRequest$invoke$4 = new ExecuteDatabaseRequest$invoke$2(6, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                int i7 = write + 47;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return executeDatabaseRequest$invoke$4;
                }
                throw null;
            case 7:
                return new ExecuteDatabaseRequest$invoke$2(7, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            default:
                return new ExecuteDatabaseRequest$invoke$2(8, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        switch (i2) {
            case 0:
                return ((ExecuteDatabaseRequest$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 1:
                return ((ExecuteDatabaseRequest$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 2:
                Object objInvokeSuspend = ((ExecuteDatabaseRequest$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i3 = RemoteActionCompatParcelizer + 5;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return objInvokeSuspend;
            case 3:
                return ((ExecuteDatabaseRequest$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 4:
                return ((ExecuteDatabaseRequest$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 5:
                return ((ExecuteDatabaseRequest$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 6:
                return ((ExecuteDatabaseRequest$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 7:
                Object objInvokeSuspend2 = ((ExecuteDatabaseRequest$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i5 = RemoteActionCompatParcelizer + 45;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 20 / 0;
                }
                return objInvokeSuspend2;
            default:
                Object objInvokeSuspend3 = ((ExecuteDatabaseRequest$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i7 = RemoteActionCompatParcelizer + 51;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return objInvokeSuspend3;
                }
                throw null;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.read;
        switch (i2) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.serializer;
                try {
                    if (i3 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        this.serializer = 1;
                        obj = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i3 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    }
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    obj = new isItemDismissable(e2);
                }
                return new onItemDismiss(obj);
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.serializer;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.serializer = 1;
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this) != coroutineSingletons2) {
                    return createfromparcel;
                }
                int i5 = RemoteActionCompatParcelizer + 103;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 78 / 0;
                }
                return coroutineSingletons2;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.serializer;
                if (i7 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.serializer = 1;
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this) != coroutineSingletons3) {
                        return createfromparcel;
                    }
                    int i8 = RemoteActionCompatParcelizer + 7;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return coroutineSingletons3;
                }
                int i10 = RemoteActionCompatParcelizer + 95;
                write = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0 ? i7 != 1 : i7 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.serializer;
                if (i11 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.serializer = 1;
                    Object objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
                    return objInvoke == coroutineSingletons4 ? coroutineSingletons4 : objInvoke;
                }
                int i12 = write + 39;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (i11 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.serializer;
                try {
                    if (i14 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        this.serializer = 1;
                        obj = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
                        if (obj == coroutineSingletons5) {
                            int i15 = RemoteActionCompatParcelizer + 91;
                            write = i15 % Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i14 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    }
                    break;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    obj = new isItemDismissable(e4);
                }
                return new onItemDismiss(obj);
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.serializer;
                if (i17 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.serializer = 1;
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this) != coroutineSingletons6) {
                        return createfromparcel;
                    }
                    int i18 = write + 65;
                    RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                    if (i18 % 2 != 0) {
                        return coroutineSingletons6;
                    }
                    throw null;
                }
                if (i17 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i19 = write + 123;
                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 != 0) {
                    return createfromparcel;
                }
                int i20 = 5 % 5;
                return createfromparcel;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.serializer;
                if (i21 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.serializer = 1;
                    return r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this) == coroutineSingletons7 ? coroutineSingletons7 : createfromparcel;
                }
                if (i21 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.serializer;
                try {
                    if (i22 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        this.serializer = 1;
                        obj = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
                        if (obj == coroutineSingletons8) {
                            int i23 = RemoteActionCompatParcelizer + 53;
                            write = i23 % Fields.SpotShadowColor;
                            int i24 = i23 % 2;
                            return coroutineSingletons8;
                        }
                    } else {
                        if (i22 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i25 = write + 71;
                        RemoteActionCompatParcelizer = i25 % Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    }
                    return new getSceneString(obj);
                } catch (Throwable th) {
                    return new getMaxWidth(CoroutineApiErrorHandlerKt.read(th));
                }
            default:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.serializer;
                if (i27 != 0) {
                    if (i27 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.serializer = 1;
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this) != coroutineSingletons9) {
                    return createfromparcel;
                }
                int i28 = write + 51;
                RemoteActionCompatParcelizer = i28 % Fields.SpotShadowColor;
                int i29 = i28 % 2;
                return coroutineSingletons9;
        }
    }
}
