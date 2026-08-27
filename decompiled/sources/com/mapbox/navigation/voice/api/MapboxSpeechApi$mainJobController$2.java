package com.mapbox.navigation.voice.api;

import androidx.room.Room;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.utils.internal.ThreadController;
import io.sentry.util.UrlUtils;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.onBackInvokedlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxSpeechApi$mainJobController$2 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final MapboxSpeechApi$mainJobController$2 INSTANCE;
    public static final MapboxSpeechApi$mainJobController$2 INSTANCE$1;
    public static final MapboxSpeechApi$mainJobController$2 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxSpeechApi$mainJobController$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    static {
        int i = 0;
        INSTANCE = new MapboxSpeechApi$mainJobController$2(i, i);
        INSTANCE$1 = new MapboxSpeechApi$mainJobController$2(i, 1);
        INSTANCE$2 = new MapboxSpeechApi$mainJobController$2(i, 2);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        if (i == 0) {
            onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            return new JobControl(onbackinvokedlambda0Serializer, YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read)));
        }
        if (i != 1) {
            onBackInvokedlambda0 onbackinvokedlambda0Serializer2 = UrlUtils.serializer();
            return new JobControl(onbackinvokedlambda0Serializer2, YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer2, ThreadController.IODispatcher)));
        }
        onBackInvokedlambda0 onbackinvokedlambda0Serializer3 = UrlUtils.serializer();
        return new JobControl(onbackinvokedlambda0Serializer3, YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer3, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer)));
    }
}
