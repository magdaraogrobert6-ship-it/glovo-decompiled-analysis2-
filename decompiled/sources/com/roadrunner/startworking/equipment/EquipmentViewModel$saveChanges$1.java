package com.roadrunner.startworking.equipment;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import com.roadrunner.startworking.equipment.navigation.EquipmentBottomSheetParams;
import io.grpc.internal.CallTracer;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.decode;
import o.getContentViewGroupParentLayout;
import o.getQueryContext;
import o.inCompatibilityMode;
import o.isSdkDisabledOrDelayed;
import o.lambda10;
import o.lambda30;
import o.lambda316;
import o.lambda317;
import o.lambda318;
import o.lambda39;
import o.logBannerClicklambda0;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class EquipmentViewModel$saveChanges$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ lambda318 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EquipmentViewModel$saveChanges$1(lambda318 lambda318Var, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.serializer = lambda318Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 123;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.read;
        lambda318 lambda318Var = this.serializer;
        if (i4 == 0) {
            return new EquipmentViewModel$saveChanges$1(lambda318Var, shortNewsContentCardView, 0);
        }
        int i5 = 1;
        if (i4 == 1) {
            return new EquipmentViewModel$saveChanges$1(lambda318Var, shortNewsContentCardView, i5);
        }
        EquipmentViewModel$saveChanges$1 equipmentViewModel$saveChanges$1 = new EquipmentViewModel$saveChanges$1(lambda318Var, shortNewsContentCardView, i);
        int i6 = IconCompatParcelizer + 109;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return equipmentViewModel$saveChanges$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return i3 != 1 ? ((EquipmentViewModel$saveChanges$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2) : ((EquipmentViewModel$saveChanges$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((EquipmentViewModel$saveChanges$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = RemoteActionCompatParcelizer + 123;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM5138invokeIoAF18A;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        lambda318 lambda318Var = this.serializer;
        if (i3 != 0) {
            if (i3 != 1) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.write;
                if (i4 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SettingsViewModel$special$$inlined$map$1 settingsViewModel$special$$inlined$map$1Write = lambda318Var.IconCompatParcelizer.write();
                    RxConvertKt$asObservable$1$job$1.AnonymousClass1 anonymousClass1 = new RxConvertKt$asObservable$1$job$1.AnonymousClass1(26, lambda318Var);
                    this.write = 1;
                    if (settingsViewModel$special$$inlined$map$1Write.collect(anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i4 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        int i5 = IconCompatParcelizer + 109;
                        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createfromparcel2;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.write;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                CallTracer callTracer = lambda318Var.write;
                this.write = 1;
                objM5138invokeIoAF18A = callTracer.m5138invokeIoAF18A(this);
                if (objM5138invokeIoAF18A == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            } else {
                if (i7 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM5138invokeIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
            }
            if (onItemDismiss.serializer(objM5138invokeIoAF18A) != null && ((lambda317) lambda318Var.MediaSessionCompatQueueItem.read()).write.isEmpty()) {
                lambda318Var.MediaMetadataCompat.serializer(new lambda10());
            }
            return createfromparcel2;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.write;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((decode) lambda318Var.RatingCompat.IconCompatParcelizer).logEvent("start_working_gear_saved", null);
            this.write = 1;
            List list = ((lambda317) lambda318Var.MediaSessionCompatQueueItem.read()).write;
            lambda316 lambda316VarSerializer = lambda318.serializer("vehicle", list);
            if (lambda316VarSerializer == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Vehicle must be selected to save");
                return null;
            }
            lambda316 lambda316VarSerializer2 = lambda318.serializer("bag", list);
            if (lambda316VarSerializer2 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Bag must be selected to save");
                return null;
            }
            lambda39 lambda39Var = lambda318Var.RemoteActionCompatParcelizer;
            logBannerClicklambda0 logbannerclicklambda0 = new logBannerClicklambda0(lambda316VarSerializer.read, lambda316VarSerializer.write, lambda316VarSerializer2.read, lambda316VarSerializer2.write);
            ((inCompatibilityMode) lambda39Var.IconCompatParcelizer).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new RxConvertKt$asFlow$1(lambda39Var, logbannerclicklambda0, shortNewsContentCardView, 16), this);
            if (objWithContext != coroutineSingletons3) {
                objWithContext = createfromparcel2;
            }
            if (objWithContext == coroutineSingletons3) {
                int i9 = RemoteActionCompatParcelizer + 123;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                objWithContext = createfromparcel2;
            }
            if (objWithContext == coroutineSingletons3) {
                int i11 = IconCompatParcelizer + 17;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return coroutineSingletons3;
            }
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i13 = RemoteActionCompatParcelizer + 81;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return null;
            }
            int i15 = RemoteActionCompatParcelizer + 57;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        boolean z = ((EquipmentBottomSheetParams) lambda318Var.read.MediaSessionCompatResultReceiverWrapper()).serializer;
        getQueryContext getquerycontext = lambda318Var.MediaMetadataCompat;
        if (z) {
            getquerycontext.serializer(new isSdkDisabledOrDelayed(((EquipmentBottomSheetParams) lambda318Var.read.MediaSessionCompatResultReceiverWrapper()).read));
        } else {
            getquerycontext.serializer(lambda30.write);
        }
        return createfromparcel2;
    }
}
