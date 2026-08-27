package com.roadrunner.rider.safety.report.presentation;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.safety.report.data.SafetySideMenuItemTagRepository;
import com.roadrunner.rider.safety.report.data.WelcomeMessageRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import o.AdjustConfig;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getProcessName;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderSafetyReportViewModel$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ getProcessName read;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RiderSafetyReportViewModel$1(getProcessName getprocessname, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.read = getprocessname;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 81;
        write = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.serializer;
        getProcessName getprocessname = this.read;
        if (i4 == 0) {
            return new RiderSafetyReportViewModel$1(getprocessname, shortNewsContentCardView, 0);
        }
        int i5 = 1;
        if (i4 != 1) {
            return new RiderSafetyReportViewModel$1(getprocessname, shortNewsContentCardView, i);
        }
        RiderSafetyReportViewModel$1 riderSafetyReportViewModel$1 = new RiderSafetyReportViewModel$1(getprocessname, shortNewsContentCardView, i5);
        int i6 = RemoteActionCompatParcelizer + 81;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return riderSafetyReportViewModel$1;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((RiderSafetyReportViewModel$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 != 1) {
            return ((RiderSafetyReportViewModel$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((RiderSafetyReportViewModel$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = RemoteActionCompatParcelizer + 1;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        getProcessName getprocessname = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = null;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.IconCompatParcelizer;
            if (i5 != 0) {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i6 = write + 17;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetAppStateImpl getAppStateImpl = getprocessname.read;
            this.IconCompatParcelizer = 1;
            Object objIncrementSafetyScreenDisplayCount = ((SafetySideMenuItemTagRepository) getAppStateImpl.serializer).incrementSafetyScreenDisplayCount(this);
            if (objIncrementSafetyScreenDisplayCount != coroutineSingletons) {
                objIncrementSafetyScreenDisplayCount = createfromparcel;
            }
            if (objIncrementSafetyScreenDisplayCount != coroutineSingletons) {
                return createfromparcel;
            }
            int i8 = RemoteActionCompatParcelizer + 89;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                return coroutineSingletons;
            }
            obj2.hashCode();
            throw null;
        }
        if (i4 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = this.IconCompatParcelizer;
            if (i9 != 0) {
                if (i9 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AdjustConfig adjustConfig = getprocessname.write;
            this.IconCompatParcelizer = 1;
            Object objIncrementDisplayCount = adjustConfig.write.incrementDisplayCount(this);
            if (objIncrementDisplayCount != coroutineSingletons2) {
                objIncrementDisplayCount = createfromparcel;
            }
            if (objIncrementDisplayCount != coroutineSingletons2) {
                return createfromparcel;
            }
            int i10 = RemoteActionCompatParcelizer + 37;
            write = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                return coroutineSingletons2;
            }
            obj2.hashCode();
            throw null;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.IconCompatParcelizer;
        if (i11 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AdjustConfig adjustConfig2 = getprocessname.serializer;
            this.IconCompatParcelizer = 1;
            WelcomeMessageRepository welcomeMessageRepository = adjustConfig2.write;
            Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(welcomeMessageRepository.RemoteActionCompatParcelizer.read, new RxConvertKt$asFlow$1(3, welcomeMessageRepository.write, (ShortNewsContentCardView) null), this);
            if (objSerializer == coroutineSingletons3) {
                int i12 = write + 5;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } else {
                objSerializer = createfromparcel;
            }
            if (objSerializer != coroutineSingletons3) {
                objSerializer = createfromparcel;
            }
            if (objSerializer != coroutineSingletons3) {
                objSerializer = createfromparcel;
            }
            if (objSerializer != coroutineSingletons3) {
                objSerializer = createfromparcel;
            }
            if (objSerializer == coroutineSingletons3) {
                int i14 = RemoteActionCompatParcelizer + 115;
                write = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                return coroutineSingletons3;
            }
        } else {
            if (i11 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        getprocessname.getClass();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(getprocessname), null, null, new TextFieldSelectionManager$copy$1(false, getprocessname, null), 3);
        return createfromparcel;
    }
}
