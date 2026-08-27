package kotlinx.coroutines.flow.internal;

import com.roadrunner.bubble.presentation.GetBubbleUiState;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class CombineKt$zipImpl$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ GetBubbleUiState.AnonymousClass2 IconCompatParcelizer;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$2 RemoteActionCompatParcelizer;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$2 read;

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCoroutineScope = YieldKt.coroutineScope(new CombineKt$zipImpl$1$1(this.read, this.RemoteActionCompatParcelizer, flowCollector, this.IconCompatParcelizer, null), shortNewsContentCardView);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : createFromParcel.INSTANCE;
    }

    public CombineKt$zipImpl$$inlined$unsafeFlow$1(StateProviderImpl$special$$inlined$map$2 stateProviderImpl$special$$inlined$map$2, StateProviderImpl$special$$inlined$map$2 stateProviderImpl$special$$inlined$map$3, GetBubbleUiState.AnonymousClass2 anonymousClass2) {
        this.read = stateProviderImpl$special$$inlined$map$2;
        this.RemoteActionCompatParcelizer = stateProviderImpl$special$$inlined$map$3;
        this.IconCompatParcelizer = anonymousClass2;
    }
}
