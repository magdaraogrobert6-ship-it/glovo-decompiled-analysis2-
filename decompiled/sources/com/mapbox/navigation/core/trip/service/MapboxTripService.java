package com.mapbox.navigation.core.trip.service;

import android.content.Context;
import android.content.Intent;
import androidx.room.Room;
import androidx.sqlite.SQLite;
import com.mapbox.navigation.base.trip.notification.TripNotification;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.utils.internal.ThreadController;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.BufferedChannel;
import o.IInAppMessageViewWrapper;
import o.createFromParcel;
import o.onBackInvokedlambda0;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxTripService {
    public static TripNotification currentTripNotification;
    public static final CopyOnWriteArraySet notificationDataObservers = new CopyOnWriteArraySet();
    public final BufferedChannel notificationChannel;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU notificationJob;
    public final AtomicBoolean serviceStarted;
    public final AnonymousClass1 terminateLambda;
    public final TripNotification tripNotification;

    /* JADX INFO: renamed from: com.mapbox.navigation.core.trip.service.MapboxTripService$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        public final /* synthetic */ Context $applicationContext;
        public final /* synthetic */ Intent $intent;
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, Context context, Intent intent) {
            super(0);
            this.$r8$classId = i;
            this.$applicationContext = context;
            this.$intent = intent;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Object invoke() {
            int i = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Intent intent = this.$intent;
            Context context = this.$applicationContext;
            if (i != 0) {
                context.stopService(intent);
                return createfromparcel;
            }
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                context.startForegroundService(intent);
            }
            return createfromparcel;
        }
    }

    public MapboxTripService(Context context, TripNotification tripNotification, ThreadController threadController) {
        context.getClass();
        threadController.getClass();
        Intent intent = new Intent(context, (Class<?>) NavigationNotificationService.class);
        new AnonymousClass1(0, context, intent);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, context, intent);
        this.tripNotification = tripNotification;
        this.terminateLambda = anonymousClass1;
        this.serviceStarted = new AtomicBoolean(false);
        this.notificationChannel = SQLite.IconCompatParcelizer(-1, 6, (IInAppMessageViewWrapper) null);
        onBackInvokedlambda0 onbackinvokedlambda0 = new onBackInvokedlambda0(threadController.ioRootJob);
        new JobControl(onbackinvokedlambda0, YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0, ThreadController.IODispatcher)));
    }
}
