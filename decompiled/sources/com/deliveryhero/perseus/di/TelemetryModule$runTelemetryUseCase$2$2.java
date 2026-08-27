package com.deliveryhero.perseus.di;

import androidx.datastore.core.SimpleActor$offer$2;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Calendar;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getPathMeasure;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.updateRenderPath;

/* JADX INFO: loaded from: classes2.dex */
public final class TelemetryModule$runTelemetryUseCase$2$2 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public int IconCompatParcelizer;
    public /* synthetic */ int serializer;
    public /* synthetic */ Calendar write;

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        TelemetryModule$runTelemetryUseCase$2$2 telemetryModule$runTelemetryUseCase$2$2 = new TelemetryModule$runTelemetryUseCase$2$2(3, (ShortNewsContentCardView) obj3);
        telemetryModule$runTelemetryUseCase$2$2.write = (Calendar) obj;
        telemetryModule$runTelemetryUseCase$2$2.serializer = iIntValue;
        return telemetryModule$runTelemetryUseCase$2$2.invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Calendar calendar = this.write;
        int i = this.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.IconCompatParcelizer;
        if (i2 != 0) {
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        HitsModule hitsModule = HitsModule.RemoteActionCompatParcelizer;
        DataModule dataModule = DataModule.read;
        Extras$Key extras$Key = new Extras$Key(18, new Extras$Key(getPathMeasure.IconCompatParcelizer));
        this.write = null;
        this.serializer = i;
        this.IconCompatParcelizer = 1;
        Object objWithContext = BuildersKt.withContext(updateRenderPath.MediaMetadataCompat, new SimpleActor$offer$2(calendar, i, extras$Key, (ShortNewsContentCardView) null), this);
        return objWithContext == coroutineSingletons ? coroutineSingletons : objWithContext;
    }

    public TelemetryModule$runTelemetryUseCase$2$2(int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
    }
}
