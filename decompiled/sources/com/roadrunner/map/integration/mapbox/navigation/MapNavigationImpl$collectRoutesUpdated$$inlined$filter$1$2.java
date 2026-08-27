package com.roadrunner.map.integration.mapbox.navigation;

import androidx.camera.core.impl.UseCaseAdditionSimulator;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.ka;
import o.kc;

/* JADX INFO: loaded from: classes3.dex */
public final class MapNavigationImpl$collectRoutesUpdated$$inlined$filter$1$2 implements FlowCollector {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ MapboxNavigation read;
    public final /* synthetic */ FlowCollector serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ MapNavigationImpl$collectRoutesUpdated$$inlined$filter$1$2(FlowCollector flowCollector, MapboxNavigation mapboxNavigation, int i) {
        this.write = i;
        this.serializer = flowCollector;
        this.read = mapboxNavigation;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        kc kcVar;
        ka kaVar;
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        MapboxNavigation mapboxNavigation = this.read;
        FlowCollector flowCollector = this.serializer;
        Object obj2 = null;
        if (i2 != 0) {
            if (shortNewsContentCardView instanceof ka) {
                kaVar = (ka) shortNewsContentCardView;
                int i3 = kaVar.RemoteActionCompatParcelizer;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    int i4 = RemoteActionCompatParcelizer + 17;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    kaVar.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
                } else {
                    kaVar = new ka(this, shortNewsContentCardView);
                }
            } else {
                kaVar = new ka(this, shortNewsContentCardView);
            }
            Object obj3 = kaVar.serializer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = kaVar.RemoteActionCompatParcelizer;
            if (i6 != 0) {
                int i7 = RemoteActionCompatParcelizer + 57;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0 ? i6 != 1 : i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            if (!UseCaseAdditionSimulator.isNavigationActive(mapboxNavigation)) {
                return createfromparcel;
            }
            int i8 = IconCompatParcelizer + 27;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                kaVar.RemoteActionCompatParcelizer = 0;
                if (flowCollector.emit(obj, kaVar) != coroutineSingletons) {
                    return createfromparcel;
                }
            } else {
                kaVar.RemoteActionCompatParcelizer = 1;
                if (flowCollector.emit(obj, kaVar) != coroutineSingletons) {
                    return createfromparcel;
                }
            }
            return coroutineSingletons;
        }
        if (shortNewsContentCardView instanceof kc) {
            kcVar = (kc) shortNewsContentCardView;
            int i9 = kcVar.read;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                int i10 = RemoteActionCompatParcelizer + 57;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    kcVar.read = i9 >>> Integer.MIN_VALUE;
                } else {
                    kcVar.read = i9 - Integer.MIN_VALUE;
                }
            } else {
                kcVar = new kc(this, shortNewsContentCardView);
            }
        } else {
            kcVar = new kc(this, shortNewsContentCardView);
        }
        Object obj4 = kcVar.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = kcVar.read;
        if (i11 != 0) {
            if (i11 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i12 = RemoteActionCompatParcelizer + 59;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                int i13 = 5 % 2;
            }
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj4);
        if (!UseCaseAdditionSimulator.isNavigationActive(mapboxNavigation)) {
            return createfromparcel;
        }
        kcVar.read = 1;
        if (flowCollector.emit(obj, kcVar) != coroutineSingletons2) {
            return createfromparcel;
        }
        int i14 = IconCompatParcelizer + 119;
        RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
        if (i14 % 2 != 0) {
            return coroutineSingletons2;
        }
        obj2.hashCode();
        throw null;
    }
}
