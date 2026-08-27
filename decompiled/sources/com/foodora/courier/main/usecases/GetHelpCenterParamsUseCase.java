package com.foodora.courier.main.usecases;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.Fields;
import bo.app.hg$$ExternalSyntheticLambda5;
import com.data.util.AndroidScheduleProvider;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.roadrunner.domain.usecase.ObservableUseCase;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.operators.flowable.FlowableMap;
import io.reactivex.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.internal.operators.observable.ObservableElementAtSingle;
import io.reactivex.internal.operators.single.SingleToFlowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.rxkotlin.Flowables;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import o.createFromParcel;
import o.getMinWidth;
import o.getPivotOffsetF1C5BW0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class GetHelpCenterParamsUseCase extends ObservableUseCase {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final getPivotOffsetF1C5BW0 RemoteActionCompatParcelizer;
    public final getMinWidth write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHelpCenterParamsUseCase(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, getMinWidth getminwidth) {
        super(((AndroidScheduleProvider) getpivotoffsetf1c5bw0).IconCompatParcelizer());
        getpivotoffsetf1c5bw0.getClass();
        getminwidth.getClass();
        this.RemoteActionCompatParcelizer = getpivotoffsetf1c5bw0;
        this.write = getminwidth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.roadrunner.domain.usecase.ObservableUseCase
    public final Flowable write(Object obj) {
        Flowable singleToFlowable;
        Scheduler scheduler;
        Flowable singleToFlowable2;
        int i = 2 % 2;
        ((createFromParcel) obj).getClass();
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Updating freshchat unread count from GetHelpCenterParamsUseCase", new Object[0]);
        getMinWidth getminwidth = this.write;
        getminwidth.MediaDescriptionCompat();
        ObservableElementAtSingle observableElementAtSingle = new ObservableElementAtSingle(getminwidth.IconCompatParcelizer());
        if (!(observableElementAtSingle instanceof FuseToFlowable)) {
            singleToFlowable = new SingleToFlowable(observableElementAtSingle);
        } else {
            int i2 = MediaDescriptionCompat + 105;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                singleToFlowable = ((FuseToFlowable) observableElementAtSingle).read();
                int i3 = 61 / 0;
            } else {
                singleToFlowable = ((FuseToFlowable) observableElementAtSingle).read();
            }
        }
        ((AndroidScheduleProvider) this.RemoteActionCompatParcelizer).getClass();
        Scheduler scheduler2 = Schedulers.RemoteActionCompatParcelizer;
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = RxJavaPlugins.write;
        if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 == null) {
            int i4 = MediaDescriptionCompat + 113;
            int i5 = i4 % Fields.SpotShadowColor;
            read = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 69;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            scheduler = scheduler2;
        } else {
            try {
                scheduler = (Scheduler) onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.apply(scheduler2);
            } catch (Throwable th) {
                throw ExceptionHelper.write(th);
            }
        }
        scheduler.getClass();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ObjectHelper.write(timeUnit, "timeUnit is null");
        FlowableOnErrorReturn flowableOnErrorReturn = new FlowableOnErrorReturn(new FlowableTimeoutTimed(singleToFlowable, scheduler), Functions.read(0));
        ObservableElementAtSingle observableElementAtSingle2 = new ObservableElementAtSingle(getminwidth.read());
        if (observableElementAtSingle2 instanceof FuseToFlowable) {
            int i9 = read + 25;
            MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                ((FuseToFlowable) observableElementAtSingle2).read();
                throw null;
            }
            singleToFlowable2 = ((FuseToFlowable) observableElementAtSingle2).read();
        } else {
            singleToFlowable2 = new SingleToFlowable(observableElementAtSingle2);
        }
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda1 = RxJavaPlugins.write;
        if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda1 != null) {
            try {
                scheduler2 = (Scheduler) onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda1.apply(scheduler2);
            } catch (Throwable th2) {
                throw ExceptionHelper.write(th2);
            }
        }
        scheduler2.getClass();
        ObjectHelper.write(timeUnit, "timeUnit is null");
        return new FlowableMap(Flowables.RemoteActionCompatParcelizer(flowableOnErrorReturn, new FlowableOnErrorReturn(new FlowableTimeoutTimed(singleToFlowable2, scheduler2), Functions.read(0L))), new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(4, new hg$$ExternalSyntheticLambda5(7)));
    }
}
