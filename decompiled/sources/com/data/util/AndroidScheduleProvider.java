package com.data.util;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import io.reactivex.Scheduler;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import o.getPivotOffsetF1C5BW0;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidScheduleProvider implements getPivotOffsetF1C5BW0 {
    public final Scheduler IconCompatParcelizer() {
        Scheduler scheduler = Schedulers.IconCompatParcelizer;
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = RxJavaPlugins.MediaMetadataCompat;
        if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 != null) {
            try {
                scheduler = (Scheduler) onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.apply(scheduler);
            } catch (Throwable th) {
                throw ExceptionHelper.write(th);
            }
        }
        scheduler.getClass();
        return scheduler;
    }
}
