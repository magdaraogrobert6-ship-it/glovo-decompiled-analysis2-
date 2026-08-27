package com.roadrunner.push;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import io.reactivex.internal.operators.observable.ObservableFilter;
import io.reactivex.internal.operators.observable.ObservableMap;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import o.GraphicsLayer;

/* JADX INFO: loaded from: classes3.dex */
public final class DialogMessageRequestProxy {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final BehaviorSubject write = BehaviorSubject.IconCompatParcelizer(new GraphicsLayer());

    public final ObservableMap write() {
        int i = 2 % 2;
        PerseusInitializerImpl$$ExternalSyntheticLambda0 perseusInitializerImpl$$ExternalSyntheticLambda0 = new PerseusInitializerImpl$$ExternalSyntheticLambda0(29, new MapApiError$$ExternalSyntheticLambda1(21));
        BehaviorSubject behaviorSubject = this.write;
        behaviorSubject.getClass();
        ObservableMap observableMap = new ObservableMap(new ObservableFilter(behaviorSubject, perseusInitializerImpl$$ExternalSyntheticLambda0), new SentryTracer$$ExternalSyntheticLambda1(1, new MapApiError$$ExternalSyntheticLambda1(22)));
        int i2 = read + 79;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return observableMap;
    }
}
