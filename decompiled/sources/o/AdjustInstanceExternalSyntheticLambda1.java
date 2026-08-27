package o;

import com.roadrunner.home.nest.divider.ObserveDivider;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustInstanceExternalSyntheticLambda1 implements decryptAndGetPasswordBWLJW6A {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final StateFlow IconCompatParcelizer;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final ObserveDivider read;
    public final StateFlow serializer;
    public final MutableStateFlow write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.serializer;
        int i5 = i3 + 115;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        throw null;
    }

    public AdjustInstanceExternalSyntheticLambda1(ObserveDivider observeDivider, ContextScope contextScope) {
        this.read = observeDivider;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(checkActivityHandler.read);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow2;
        this.serializer = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NafathModalUiModelImpl$1(this, null, 17), 3);
    }
}
