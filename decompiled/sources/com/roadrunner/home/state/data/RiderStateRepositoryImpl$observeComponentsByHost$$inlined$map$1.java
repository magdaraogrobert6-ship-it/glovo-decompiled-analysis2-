package com.roadrunner.home.state.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.clearOldPositions;
import o.createFromParcel;
import o.dispatchNestedFling;
import o.onContentCardDismissed;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import okio.Options;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderStateRepositoryImpl$observeComponentsByHost$$inlined$map$1 implements Flow {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk read;
    public final /* synthetic */ Flow serializer;

    /* JADX INFO: renamed from: com.roadrunner.home.state.data.RiderStateRepositoryImpl$observeComponentsByHost$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;
        public final /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
        public final /* synthetic */ int read;
        public final /* synthetic */ r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk write;

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, int i) {
            this.read = i;
            this.RemoteActionCompatParcelizer = flowCollector;
            this.write = r8lambdaucgighn8fiyv_vccodeafjfpedk;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0094  */
        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            clearOldPositions clearoldpositions;
            dispatchNestedFling dispatchnestedfling;
            int i = 2 % 2;
            int i2 = this.read;
            Object obj2 = createFromParcel.INSTANCE;
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk = this.write;
            FlowCollector flowCollector = this.RemoteActionCompatParcelizer;
            if (i2 == 0) {
                if (shortNewsContentCardView instanceof clearOldPositions) {
                    clearoldpositions = (clearOldPositions) shortNewsContentCardView;
                    int i3 = clearoldpositions.read;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        clearoldpositions.read = i3 - Integer.MIN_VALUE;
                    } else {
                        clearoldpositions = new clearOldPositions(this, shortNewsContentCardView);
                    }
                } else {
                    clearoldpositions = new clearOldPositions(this, shortNewsContentCardView);
                }
                Object obj3 = clearoldpositions.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = clearoldpositions.read;
                if (i4 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj3);
                    ArrayList arrayListSerializer = onContentCardDismissed.serializer((List) obj, Options.Companion.read(r8lambdaucgighn8fiyv_vccodeafjfpedk));
                    clearoldpositions.read = 1;
                    return flowCollector.emit(arrayListSerializer, clearoldpositions) == coroutineSingletons ? coroutineSingletons : obj2;
                }
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj3);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i5 = serializer + 43;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 5 % 5;
                }
                return null;
            }
            if (shortNewsContentCardView instanceof dispatchNestedFling) {
                dispatchnestedfling = (dispatchNestedFling) shortNewsContentCardView;
                int i7 = dispatchnestedfling.RemoteActionCompatParcelizer;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    dispatchnestedfling.RemoteActionCompatParcelizer = i7 - Integer.MIN_VALUE;
                } else {
                    dispatchnestedfling = new dispatchNestedFling(this, shortNewsContentCardView);
                    int i8 = serializer + 29;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                }
            } else {
                dispatchnestedfling = new dispatchNestedFling(this, shortNewsContentCardView);
                int i10 = serializer + 29;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            Object obj4 = dispatchnestedfling.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i12 = dispatchnestedfling.RemoteActionCompatParcelizer;
            if (i12 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                Object objMediaMetadataCompat = onContentCardDismissed.MediaMetadataCompat((List) onContentCardDismissed.serializer((List) obj, Options.Companion.read(r8lambdaucgighn8fiyv_vccodeafjfpedk)));
                dispatchnestedfling.RemoteActionCompatParcelizer = 1;
                if (flowCollector.emit(objMediaMetadataCompat, dispatchnestedfling) == coroutineSingletons2) {
                    int i13 = serializer + 87;
                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 != 0) {
                        int i14 = 61 / 0;
                    }
                    obj2 = coroutineSingletons2;
                }
            } else if (i12 == 1) {
                int i15 = serializer + 53;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            int i17 = serializer + 23;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            return obj2;
        }
    }

    public /* synthetic */ RiderStateRepositoryImpl$observeComponentsByHost$$inlined$map$1(Flow flow, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = flow;
        this.read = r8lambdaucgighn8fiyv_vccodeafjfpedk;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk = this.read;
        Flow flow = this.serializer;
        if (i2 == 0) {
            Object objCollect = flow.collect(new AnonymousClass2(flowCollector, r8lambdaucgighn8fiyv_vccodeafjfpedk, 0), shortNewsContentCardView);
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return createfromparcel;
            }
            int i3 = RemoteActionCompatParcelizer + 57;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objCollect;
        }
        Object objCollect2 = flow.collect(new AnonymousClass2(flowCollector, r8lambdaucgighn8fiyv_vccodeafjfpedk, 1), shortNewsContentCardView);
        if (objCollect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return createfromparcel;
        }
        int i5 = RemoteActionCompatParcelizer + 7;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objCollect2;
        }
        throw null;
    }
}
