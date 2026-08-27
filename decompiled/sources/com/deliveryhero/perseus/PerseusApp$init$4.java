package com.deliveryhero.perseus;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkerWrapper;
import coil3.ExtrasKt;
import com.deliveryhero.perseus.hits.InProcessTelemetryScheduler$schedule$1$1;
import com.mapbox.common.MapboxOptions;
import com.mapbox.common.MapboxSDKCommonInitializer;
import com.roadrunner.login.presentation.router.GetAuthStateViewModel;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.accessgetIntersectcp;
import o.addGlobalCallbackParameterI;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getStrokeLineJoinLxFBmk8;
import o.getStrokeLineWidth;
import o.h9;
import o.igExternalSyntheticLambda2;
import o.igExternalSyntheticLambda7;
import o.pauseWebviewIfNecessarylambda10;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setToSaturationimpl;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusApp$init$4 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PerseusApp$init$4(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = getStrokeLineWidth.write;
            getStrokeLineWidth.write = (accessgetIntersectcp) this.IconCompatParcelizer;
            getStrokeLineJoinLxFBmk8 getstrokelinejoinlxfbmk8 = (getStrokeLineJoinLxFBmk8) getStrokeLineWidth.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
            synchronized (getstrokelinejoinlxfbmk8.IconCompatParcelizer) {
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = getstrokelinejoinlxfbmk8.RemoteActionCompatParcelizer;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                getstrokelinejoinlxfbmk8.RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getstrokelinejoinlxfbmk8.read, null, null, new InProcessTelemetryScheduler$schedule$1$1(getstrokelinejoinlxfbmk8, null), 3);
            }
            pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer = true;
            return createFromParcel.INSTANCE;
        }
        if (i == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            addGlobalCallbackParameterI addglobalcallbackparameteri = (addGlobalCallbackParameterI) ((GetAuthStateViewModel) this.IconCompatParcelizer).IconCompatParcelizer;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = addglobalcallbackparameteri.write;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new SaveShiftInfo$invoke$2(addglobalcallbackparameteri, shortNewsContentCardView, 9), 2);
            return createFromParcel.INSTANCE;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        WorkerWrapper.Builder builder = (WorkerWrapper.Builder) this.IconCompatParcelizer;
        setToSaturationimpl settosaturationimplIconCompatParcelizer = setToSaturationimpl.IconCompatParcelizer((Application) builder.write);
        settosaturationimplIconCompatParcelizer.read(MapboxSDKCommonInitializer.class);
        WorkerWrapper.Builder.IconCompatParcelizer();
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Initializing mapbox SDK v11 on IO thread", new Object[0]);
        MapboxOptions.setAccessToken(((h9) builder.MediaSessionCompatQueueItem).RemoteActionCompatParcelizer());
        ((igExternalSyntheticLambda2) builder.MediaBrowserCompatMediaItem).IconCompatParcelizer(igExternalSyntheticLambda7.MAPBOX_INITIALIZED);
        return createFromParcel.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 27;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        Object obj = this.IconCompatParcelizer;
        if (i5 == 0) {
            return new PerseusApp$init$4((accessgetIntersectcp) obj, shortNewsContentCardView, 0);
        }
        int i6 = 1;
        if (i5 == 1) {
            return new PerseusApp$init$4((GetAuthStateViewModel) obj, shortNewsContentCardView, i6);
        }
        PerseusApp$init$4 perseusApp$init$4 = new PerseusApp$init$4((WorkerWrapper.Builder) obj, shortNewsContentCardView, i);
        int i7 = serializer + 91;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return perseusApp$init$4;
        }
        throw null;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i4 == 0) {
            ((PerseusApp$init$4) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = serializer + 27;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 75 / 0;
            }
            return createfromparcel;
        }
        if (i4 != 1) {
            ((PerseusApp$init$4) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((PerseusApp$init$4) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i7 = RemoteActionCompatParcelizer + 121;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return createfromparcel;
    }
}
