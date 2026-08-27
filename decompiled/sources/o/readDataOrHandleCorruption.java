package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class readDataOrHandleCorruption {
    public final BrazeExternalSyntheticLambda28 IconCompatParcelizer;
    public final getTopFadingEdgeStrength RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final StateFlow serializer;
    public final ContextScope write;

    public readDataOrHandleCorruption(getTopFadingEdgeStrength gettopfadingedgestrength, BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, ContextScope contextScope) {
        this.RemoteActionCompatParcelizer = gettopfadingedgestrength;
        this.IconCompatParcelizer = brazeExternalSyntheticLambda28;
        this.write = contextScope;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(setSmoothScrollingEnabled.IconCompatParcelizer);
        this.read = mutableStateFlow;
        this.serializer = mutableStateFlow;
    }
}
