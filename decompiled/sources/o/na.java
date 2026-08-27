package o;

import com.roadrunner.map.integration.mapbox.maneuver.ManeuverApi;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class na implements getTrimEVpEnUU {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final StateFlow IconCompatParcelizer;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final ManeuverApi serializer;
    public final MutableStateFlow write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.read;
        int i5 = i3 + 9;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        throw null;
    }

    public na(ContextScope contextScope, ManeuverApi maneuverApi) {
        this.serializer = maneuverApi;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow;
        this.read = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(getBottomPIaL0Z0.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.IconCompatParcelizer = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NafathModalUiModelImpl$1(this, null, 1), 3);
    }
}
