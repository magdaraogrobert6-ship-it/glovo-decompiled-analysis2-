package com.roadrunner.home.nest.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.flow.FlowCollector;
import o.AudioAttributesImplApi21;
import o.AudioAttributesImplApi21Parcelizer;
import o.DelegatingFrameMetricsListener;
import o.ShortNewsContentCardView;
import o.SwitchPreferenceCompat;
import o.createFromParcel;
import o.createTransitionInfo;
import o.expandFieldArray;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaSRIQUQLLuonYfVr0cj1O8hjGYyk;

/* JADX INFO: renamed from: com.roadrunner.home.nest.data.NestComponentRepositoryImpl$get-b5cc6-E$$inlined$map$1$2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class NestComponentRepositoryImpl$getb5cc6E$$inlined$map$1$2 implements FlowCollector {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ FlowCollector serializer;

    public /* synthetic */ NestComponentRepositoryImpl$getb5cc6E$$inlined$map$1$2(FlowCollector flowCollector, String str, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = flowCollector;
        this.read = str;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        SwitchPreferenceCompat switchPreferenceCompat;
        r8lambdaSRIQUQLLuonYfVr0cj1O8hjGYyk r8lambdasriquqlluonyfvr0cj1o8hjgyyk;
        createTransitionInfo createtransitioninfo;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = SmallPersistentVector.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        String str = this.read;
        FlowCollector flowCollector = this.serializer;
        Object obj2 = null;
        if (i2 == 0) {
            if (shortNewsContentCardView instanceof SwitchPreferenceCompat) {
                switchPreferenceCompat = (SwitchPreferenceCompat) shortNewsContentCardView;
                int i3 = switchPreferenceCompat.serializer;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    switchPreferenceCompat.serializer = i3 - Integer.MIN_VALUE;
                } else {
                    switchPreferenceCompat = new SwitchPreferenceCompat(this, shortNewsContentCardView);
                }
            } else {
                switchPreferenceCompat = new SwitchPreferenceCompat(this, shortNewsContentCardView);
            }
            Object obj3 = switchPreferenceCompat.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = switchPreferenceCompat.serializer;
            if (i4 != 0) {
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj3);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            Map map = ((expandFieldArray) obj).serializer;
            DelegatingFrameMetricsListener delegatingFrameMetricsListener = map != null ? (DelegatingFrameMetricsListener) map.get(str) : null;
            Object audioAttributesImplApi21Parcelizer = delegatingFrameMetricsListener == null ? AudioAttributesImplApi21.read : new AudioAttributesImplApi21Parcelizer(delegatingFrameMetricsListener);
            switchPreferenceCompat.serializer = 1;
            if (flowCollector.emit(audioAttributesImplApi21Parcelizer, switchPreferenceCompat) != coroutineSingletons) {
                return createfromparcel;
            }
            int i5 = RemoteActionCompatParcelizer + 27;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return coroutineSingletons;
            }
            obj2.hashCode();
            throw null;
        }
        if (i2 != 1) {
            if (shortNewsContentCardView instanceof createTransitionInfo) {
                int i6 = write + 103;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = ((createTransitionInfo) shortNewsContentCardView).RemoteActionCompatParcelizer;
                    obj2.hashCode();
                    throw null;
                }
                createtransitioninfo = (createTransitionInfo) shortNewsContentCardView;
                int i8 = createtransitioninfo.RemoteActionCompatParcelizer;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    createtransitioninfo.RemoteActionCompatParcelizer = i8 - Integer.MIN_VALUE;
                } else {
                    createtransitioninfo = new createTransitionInfo(this, shortNewsContentCardView);
                }
            } else {
                createtransitioninfo = new createTransitionInfo(this, shortNewsContentCardView);
            }
            Object obj4 = createtransitioninfo.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = createtransitioninfo.RemoteActionCompatParcelizer;
            if (i9 != 0) {
                if (i9 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj4);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj4);
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) ((Map) obj).get(str);
            if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 != null) {
                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2;
            }
            createtransitioninfo.RemoteActionCompatParcelizer = 1;
            if (flowCollector.emit(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, createtransitioninfo) != coroutineSingletons2) {
                return createfromparcel;
            }
            int i10 = write + 93;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                return coroutineSingletons2;
            }
            obj2.hashCode();
            throw null;
        }
        if (shortNewsContentCardView instanceof r8lambdaSRIQUQLLuonYfVr0cj1O8hjGYyk) {
            int i11 = RemoteActionCompatParcelizer + 113;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                int i12 = ((r8lambdaSRIQUQLLuonYfVr0cj1O8hjGYyk) shortNewsContentCardView).read;
                obj2.hashCode();
                throw null;
            }
            r8lambdasriquqlluonyfvr0cj1o8hjgyyk = (r8lambdaSRIQUQLLuonYfVr0cj1O8hjGYyk) shortNewsContentCardView;
            int i13 = r8lambdasriquqlluonyfvr0cj1o8hjgyyk.read;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                int i14 = write + 53;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                r8lambdasriquqlluonyfvr0cj1o8hjgyyk.read = i13 - Integer.MIN_VALUE;
            } else {
                r8lambdasriquqlluonyfvr0cj1o8hjgyyk = new r8lambdaSRIQUQLLuonYfVr0cj1O8hjGYyk(this, shortNewsContentCardView);
            }
        } else {
            r8lambdasriquqlluonyfvr0cj1o8hjgyyk = new r8lambdaSRIQUQLLuonYfVr0cj1O8hjGYyk(this, shortNewsContentCardView);
        }
        Object obj5 = r8lambdasriquqlluonyfvr0cj1o8hjgyyk.serializer;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i16 = r8lambdasriquqlluonyfvr0cj1o8hjgyyk.read;
        if (i16 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj5);
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3 = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) ((Map) obj).get(str);
            if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3 != null) {
                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3;
            }
            r8lambdasriquqlluonyfvr0cj1o8hjgyyk.read = 1;
            return flowCollector.emit(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdasriquqlluonyfvr0cj1o8hjgyyk) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
        }
        if (i16 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj5);
            return createfromparcel;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        int i17 = RemoteActionCompatParcelizer + 83;
        write = i17 % Fields.SpotShadowColor;
        if (i17 % 2 == 0) {
            int i18 = 5 / 2;
        }
        return null;
    }
}
