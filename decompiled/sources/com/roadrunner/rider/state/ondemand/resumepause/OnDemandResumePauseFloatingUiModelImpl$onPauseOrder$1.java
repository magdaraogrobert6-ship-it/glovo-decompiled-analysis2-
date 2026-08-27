package com.roadrunner.rider.state.ondemand.resumepause;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.state.breakrequest.domain.SendBreakRequestUseCaseImpl;
import com.roadrunner.rider.state.onpause.domain.EndBreakUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.checkAttributionI;
import o.checkAttributionResponseI;
import o.checkDeeplinkInAttributionResponseI;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getOsName;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setOnSessionTrackingFailedListener;

/* JADX INFO: loaded from: classes3.dex */
public final class OnDemandResumePauseFloatingUiModelImpl$onPauseOrder$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ getOsName read;
    public int serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OnDemandResumePauseFloatingUiModelImpl$onPauseOrder$1(getOsName getosname, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.read = getosname;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        if (this.write == 0) {
            OnDemandResumePauseFloatingUiModelImpl$onPauseOrder$1 onDemandResumePauseFloatingUiModelImpl$onPauseOrder$1 = new OnDemandResumePauseFloatingUiModelImpl$onPauseOrder$1(this.read, shortNewsContentCardView, 0);
            int i2 = RemoteActionCompatParcelizer + 95;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return onDemandResumePauseFloatingUiModelImpl$onPauseOrder$1;
        }
        OnDemandResumePauseFloatingUiModelImpl$onPauseOrder$1 onDemandResumePauseFloatingUiModelImpl$onPauseOrder$2 = new OnDemandResumePauseFloatingUiModelImpl$onPauseOrder$1(this.read, shortNewsContentCardView, 1);
        int i4 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return onDemandResumePauseFloatingUiModelImpl$onPauseOrder$2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((OnDemandResumePauseFloatingUiModelImpl$onPauseOrder$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((OnDemandResumePauseFloatingUiModelImpl$onPauseOrder$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = IconCompatParcelizer + 47;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM5025invokegIAlus;
        Throwable thSerializer;
        Object objM5027invokeIoAF18A;
        int i = 2 % 2;
        int i2 = this.write;
        Object obj2 = createFromParcel.INSTANCE;
        checkAttributionResponseI checkattributionresponsei = checkAttributionResponseI.IconCompatParcelizer;
        getOsName getosname = this.read;
        checkDeeplinkInAttributionResponseI checkdeeplinkinattributionresponsei = checkDeeplinkInAttributionResponseI.IconCompatParcelizer;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.serializer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getosname.serializer.serializer(checkattributionresponsei);
                EndBreakUseCaseImpl endBreakUseCaseImpl = getosname.write;
                this.serializer = 1;
                objM5027invokeIoAF18A = endBreakUseCaseImpl.m5027invokeIoAF18A(this);
                if (objM5027invokeIoAF18A == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = RemoteActionCompatParcelizer + 3;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    objM5027invokeIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
                    int i5 = 18 / 0;
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    objM5027invokeIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
                }
            }
            if (!(objM5027invokeIoAF18A instanceof isItemDismissable)) {
                int i6 = RemoteActionCompatParcelizer + 65;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                ff$$ExternalSyntheticOutline0.m("screen_name", "home_screen", getosname.MediaSessionCompatQueueItem.IconCompatParcelizer, "resume_shift_clicked");
                getosname.serializer.serializer(checkdeeplinkinattributionresponsei);
                getosname.PlaybackStateCompatCustomAction.serializer(setOnSessionTrackingFailedListener.OTHER);
            }
            Throwable thSerializer2 = onItemDismiss.serializer(objM5027invokeIoAF18A);
            if (thSerializer2 == null) {
                return obj2;
            }
            getosname.serializer.serializer(checkdeeplinkinattributionresponsei);
            getosname.serializer.serializer(new checkAttributionI(getosname.MediaDescriptionCompat.read(thSerializer2)));
            int i8 = RemoteActionCompatParcelizer + 77;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                return obj2;
            }
            int i9 = 4 / 3;
            return obj2;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.serializer;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getosname.serializer.serializer(checkattributionresponsei);
            SendBreakRequestUseCaseImpl sendBreakRequestUseCaseImpl = getosname.MediaMetadataCompat;
            this.serializer = 1;
            objM5025invokegIAlus = sendBreakRequestUseCaseImpl.m5025invokegIAlus("UNTIL_END_OF_SHIFT", this);
            if (objM5025invokegIAlus == coroutineSingletons2) {
                int i11 = IconCompatParcelizer + 47;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    int i12 = 1 / 0;
                }
                obj2 = coroutineSingletons2;
            } else {
                if (!(objM5025invokegIAlus instanceof isItemDismissable)) {
                    ff$$ExternalSyntheticOutline0.m("screen_name", "home_screen", getosname.MediaSessionCompatQueueItem.IconCompatParcelizer, "pause_shift_clicked");
                    getosname.serializer.serializer(checkdeeplinkinattributionresponsei);
                    getosname.PlaybackStateCompatCustomAction.serializer(setOnSessionTrackingFailedListener.OTHER);
                }
                thSerializer = onItemDismiss.serializer(objM5025invokegIAlus);
                if (thSerializer != null) {
                    getosname.serializer.serializer(checkdeeplinkinattributionresponsei);
                    getosname.serializer.serializer(new checkAttributionI(getosname.MediaDescriptionCompat.read(thSerializer)));
                }
            }
        } else if (i10 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM5025invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
            if (!(objM5025invokegIAlus instanceof isItemDismissable)) {
                ff$$ExternalSyntheticOutline0.m("screen_name", "home_screen", getosname.MediaSessionCompatQueueItem.IconCompatParcelizer, "pause_shift_clicked");
                getosname.serializer.serializer(checkdeeplinkinattributionresponsei);
                getosname.PlaybackStateCompatCustomAction.serializer(setOnSessionTrackingFailedListener.OTHER);
            }
            thSerializer = onItemDismiss.serializer(objM5025invokegIAlus);
            if (thSerializer != null) {
                getosname.serializer.serializer(checkdeeplinkinattributionresponsei);
                getosname.serializer.serializer(new checkAttributionI(getosname.MediaDescriptionCompat.read(thSerializer)));
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i13 = IconCompatParcelizer + 21;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            obj2 = null;
        }
        int i15 = IconCompatParcelizer + 93;
        RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
        int i16 = i15 % 2;
        return obj2;
    }
}
