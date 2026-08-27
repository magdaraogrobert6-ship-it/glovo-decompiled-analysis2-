package com.roadrunner.map.container.context;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.perseus.data.local.db.entity.HitEventFactory;
import com.roadrunner.login.logging.RouterLogger;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.YieldKt;
import o.ApproachLayoutModifierNode;
import o.O;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class GetMapScope$invoke$4 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMapScope$invoke$4(RouterLogger routerLogger, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.read = 0;
        this.RemoteActionCompatParcelizer = routerLogger;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetMapScope$invoke$4(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.read = i2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Throwable th = (Throwable) obj2;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj3;
        if (i3 == 0) {
            new GetMapScope$invoke$4((RouterLogger) this.RemoteActionCompatParcelizer, shortNewsContentCardView).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        int i4 = 1;
        int i5 = 3;
        if (i3 == 1) {
            GetMapScope$invoke$4 getMapScope$invoke$4 = new GetMapScope$invoke$4(i5, i4, shortNewsContentCardView);
            getMapScope$invoke$4.RemoteActionCompatParcelizer = th;
            getMapScope$invoke$4.invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i3 == 2) {
            GetMapScope$invoke$4 getMapScope$invoke$5 = new GetMapScope$invoke$4(i5, i, shortNewsContentCardView);
            getMapScope$invoke$5.RemoteActionCompatParcelizer = th;
            getMapScope$invoke$5.invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i3 == 3) {
            GetMapScope$invoke$4 getMapScope$invoke$6 = new GetMapScope$invoke$4(i5, i5, shortNewsContentCardView);
            getMapScope$invoke$6.RemoteActionCompatParcelizer = th;
            getMapScope$invoke$6.invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        int i6 = 4;
        if (i3 == 4) {
            GetMapScope$invoke$4 getMapScope$invoke$7 = new GetMapScope$invoke$4(i5, i6, shortNewsContentCardView);
            getMapScope$invoke$7.RemoteActionCompatParcelizer = th;
            getMapScope$invoke$7.invokeSuspend(createfromparcel);
            int i7 = serializer + 107;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return createfromparcel;
        }
        GetMapScope$invoke$4 getMapScope$invoke$8 = new GetMapScope$invoke$4(i5, 5, shortNewsContentCardView);
        getMapScope$invoke$8.RemoteActionCompatParcelizer = th;
        getMapScope$invoke$8.invokeSuspend(createfromparcel);
        int i9 = serializer + 17;
        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            int i10 = 75 / 0;
        }
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            O o2 = (O) ((RouterLogger) this.RemoteActionCompatParcelizer).serializer;
            if (o2 != null) {
                int i3 = serializer + 125;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    YieldKt.write(o2.read, (CancellationException) null);
                    throw null;
                }
                YieldKt.write(o2.read, (CancellationException) null);
            }
            return createfromparcel;
        }
        if (i2 == 1) {
            Throwable th = (Throwable) this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ApproachLayoutModifierNode.IconCompatParcelizer(HitEventFactory.write, "Failed to evaluate predicate", th);
            int i4 = IconCompatParcelizer + 51;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel;
        }
        if (i2 == 2) {
            Throwable th2 = (Throwable) this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.write(new Throwable("Error observing all deliveries", th2));
            return createfromparcel;
        }
        if (i2 == 3) {
            Throwable th3 = (Throwable) this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th3, "Raw state collection failed", new Object[0]);
            return createfromparcel;
        }
        if (i2 != 4) {
            Throwable th4 = (Throwable) this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th4, "SmartPolling: failure observer error", new Object[0]);
            return createfromparcel;
        }
        Throwable th5 = (Throwable) this.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Timber.RemoteActionCompatParcelizer.serializer(th5, "need expanded bubble error", new Object[0]);
        int i6 = IconCompatParcelizer + 37;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 35 / 0;
        }
        return createfromparcel;
    }
}
