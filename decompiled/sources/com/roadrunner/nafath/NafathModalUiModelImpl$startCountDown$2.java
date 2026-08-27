package com.roadrunner.nafath;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.FontScaleConverterTableCompanion;
import o.ShortNewsContentCardView;
import o.VelocityKt;
import o.createFromParcel;
import o.decode;
import o.getCieXyz;
import o.ob;
import o.oe;
import o.og;
import o.p0;
import o.pb;
import o.pf;
import o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ;
import o.removeNodeAtDepth;
import o.unaryMinus9UxMQ8M;
import okhttp3.FormBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class NafathModalUiModelImpl$startCountDown$2 implements FlowCollector {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ long write;

    public /* synthetic */ NafathModalUiModelImpl$startCountDown$2(long j, int i, Object obj) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = j;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Object obj2;
        boolean z;
        boolean z2;
        FontScaleConverterTableCompanion fontScaleConverterTableCompanion;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        long j = this.write;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = null;
        boolean z3 = false;
        if (i4 != 0) {
            if (shortNewsContentCardView instanceof FontScaleConverterTableCompanion) {
                fontScaleConverterTableCompanion = (FontScaleConverterTableCompanion) shortNewsContentCardView;
                int i5 = fontScaleConverterTableCompanion.IconCompatParcelizer;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    int i6 = IconCompatParcelizer + 51;
                    read = i6 % Fields.SpotShadowColor;
                    fontScaleConverterTableCompanion.IconCompatParcelizer = i6 % 2 != 0 ? i5 - Integer.MIN_VALUE : i5 - Integer.MIN_VALUE;
                } else {
                    fontScaleConverterTableCompanion = new FontScaleConverterTableCompanion(this, shortNewsContentCardView);
                    int i7 = read + 87;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
            } else {
                fontScaleConverterTableCompanion = new FontScaleConverterTableCompanion(this, shortNewsContentCardView);
                int i9 = read + 87;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            }
            Object obj5 = fontScaleConverterTableCompanion.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i11 = fontScaleConverterTableCompanion.IconCompatParcelizer;
            if (i11 != 0) {
                int i12 = IconCompatParcelizer + 97;
                int i13 = i12 % Fields.SpotShadowColor;
                read = i13;
                int i14 = i12 % 2;
                if (i11 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i15 = i13 + 111;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj5);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj5);
                int i16 = 36 / 0;
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj5);
            FlowCollector flowCollector = (FlowCollector) obj3;
            VelocityKt velocityKt = (VelocityKt) obj;
            if (velocityKt instanceof unaryMinus9UxMQ8M) {
                int i17 = read + 63;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    ((unaryMinus9UxMQ8M) velocityKt).serializer.iterator();
                    throw null;
                }
                for (Object obj6 : ((unaryMinus9UxMQ8M) velocityKt).serializer) {
                    if (((r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) obj6).write == j) {
                        obj4 = obj6;
                        break;
                    }
                }
                r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ r8lambdayigkjx4opgvyddqvttr8slptylq = (r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) obj4;
                if (r8lambdayigkjx4opgvyddqvttr8slptylq != null) {
                    int i18 = IconCompatParcelizer + 5;
                    read = i18 % Fields.SpotShadowColor;
                    if (i18 % 2 == 0 ? r8lambdayigkjx4opgvyddqvttr8slptylq.IconCompatParcelizer : r8lambdayigkjx4opgvyddqvttr8slptylq.IconCompatParcelizer) {
                        z3 = true;
                    }
                }
            }
            fontScaleConverterTableCompanion.IconCompatParcelizer = 1;
            if (flowCollector.emit(Boolean.valueOf(z3), fontScaleConverterTableCompanion) != coroutineSingletons) {
                return createfromparcel;
            }
            int i19 = read + 41;
            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            return coroutineSingletons;
        }
        ob obVar = (ob) obj;
        pb pbVar = (pb) obj3;
        MutableStateFlow mutableStateFlow = pbVar.read;
        if (!(obVar instanceof og)) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obVar, oe.write}, getCieXyz.write())).booleanValue()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Countdown expired — dismissing modal", new Object[0]);
            FormBody.Builder builder = pbVar.write;
            ((decode) builder.serializer).logEvent("nafath_timer_expired", builder.IconCompatParcelizer(pbVar.RatingCompat, new NafathLogger$$ExternalSyntheticLambda0(0)));
            pbVar.MediaDescriptionCompat.serializer(p0.IconCompatParcelizer);
            do {
                obj2 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, pf.RemoteActionCompatParcelizer((pf) obj2, null, 0L, true, false, pbVar.serializer(0L), 4025)));
            return createfromparcel;
        }
        og ogVar = (og) obVar;
        long j2 = ogVar.read;
        long j3 = ogVar.RemoteActionCompatParcelizer;
        while (true) {
            Object obj7 = mutableStateFlow.read();
            pf pfVar = (pf) obj7;
            if (!pfVar.MediaSessionCompatQueueItem && j3 >= j) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Confirmation button revealed after %ds", Long.valueOf(j3));
            }
            String strSerializer = pbVar.serializer(j2);
            if (j2 < 60) {
                z = true;
            } else {
                int i21 = read + 57;
                IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                z = false;
            }
            if (j3 >= j) {
                int i23 = read + 69;
                IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            long j4 = j3;
            long j5 = j2;
            if (mutableStateFlow.RemoteActionCompatParcelizer(obj7, pf.RemoteActionCompatParcelizer(pfVar, null, j2, z, z2, strSerializer, 4017))) {
                return createfromparcel;
            }
            j2 = j5;
            j3 = j4;
        }
    }
}
