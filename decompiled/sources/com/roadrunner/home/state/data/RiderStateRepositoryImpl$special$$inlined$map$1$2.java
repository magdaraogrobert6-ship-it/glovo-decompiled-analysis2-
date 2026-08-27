package com.roadrunner.home.state.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.state.domain.Phase2FallbackReason;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.SerializationException;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.dispatchLayout;
import o.dispatchNestedPreFling;
import o.instance_delegatelambda0;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderStateRepositoryImpl$special$$inlined$map$1$2 implements FlowCollector {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ RiderStateRepositoryImpl write;

    public /* synthetic */ RiderStateRepositoryImpl$special$$inlined$map$1$2(FlowCollector flowCollector, RiderStateRepositoryImpl riderStateRepositoryImpl, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = flowCollector;
        this.write = riderStateRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        dispatchLayout dispatchlayout;
        dispatchNestedPreFling dispatchnestedprefling;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        RiderStateRepositoryImpl riderStateRepositoryImpl = this.write;
        FlowCollector flowCollector = this.RemoteActionCompatParcelizer;
        boolean z = false;
        if (i2 != 0) {
            if (shortNewsContentCardView instanceof dispatchNestedPreFling) {
                dispatchnestedprefling = (dispatchNestedPreFling) shortNewsContentCardView;
                int i3 = dispatchnestedprefling.write;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dispatchnestedprefling.write = i3 - Integer.MIN_VALUE;
                } else {
                    dispatchnestedprefling = new dispatchNestedPreFling(this, shortNewsContentCardView);
                }
            } else {
                dispatchnestedprefling = new dispatchNestedPreFling(this, shortNewsContentCardView);
            }
            Object obj2 = dispatchnestedprefling.serializer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = dispatchnestedprefling.write;
            if (i4 != 0) {
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) riderStateRepositoryImpl.RatingCompat;
            firebaseRemoteConfigImpl.getClass();
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.RIDER_HOME_PHASE2_ENABLED)) {
                int i5 = serializer + 35;
                int i6 = i5 % Fields.SpotShadowColor;
                IconCompatParcelizer = i6;
                if (i5 % 2 == 0) {
                    throw null;
                }
                if (!zBooleanValue) {
                    int i7 = i6 + 11;
                    serializer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        int i8 = 3 / 4;
                    }
                    z = true;
                }
            }
            dispatchnestedprefling.write = 1;
            return flowCollector.emit(Boolean.valueOf(z), dispatchnestedprefling) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        List list = instance_delegatelambda0.write;
        if (shortNewsContentCardView instanceof dispatchLayout) {
            dispatchlayout = (dispatchLayout) shortNewsContentCardView;
            int i9 = dispatchlayout.serializer;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dispatchlayout.serializer = i9 - Integer.MIN_VALUE;
            } else {
                dispatchlayout = new dispatchLayout(this, shortNewsContentCardView);
            }
        } else {
            dispatchlayout = new dispatchLayout(this, shortNewsContentCardView);
        }
        Object obj3 = dispatchlayout.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = dispatchlayout.serializer;
        if (i10 != 0) {
            if (i10 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i11 = IconCompatParcelizer + 31;
            serializer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            int i12 = 35 / 0;
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj3);
        try {
            list = (List) riderStateRepositoryImpl.write.serializer((String) obj, riderStateRepositoryImpl.IconCompatParcelizer);
        } catch (Phase2FallbackReason.FailedToParseComponent e) {
            riderStateRepositoryImpl.read(e);
        } catch (SerializationException unused) {
        }
        dispatchlayout.serializer = 1;
        if (flowCollector.emit(list, dispatchlayout) != coroutineSingletons2) {
            return createfromparcel;
        }
        int i13 = IconCompatParcelizer + 113;
        serializer = i13 % Fields.SpotShadowColor;
        if (i13 % 2 == 0) {
            return coroutineSingletons2;
        }
        throw null;
    }
}
