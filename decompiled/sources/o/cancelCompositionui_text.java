package o;

import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import java.time.Clock;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class cancelCompositionui_text {
    public final toStringForLog IconCompatParcelizer;
    public final Clock MediaDescriptionCompat;
    public final TextUnitType RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final setSelectionEnd serializer;
    public final StateFlow write;

    public cancelCompositionui_text(TextUnitType textUnitType, setSelectionEnd setselectionend, toStringForLog tostringforlog, Clock clock, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.RemoteActionCompatParcelizer = textUnitType;
        this.serializer = setselectionend;
        this.IconCompatParcelizer = tostringforlog;
        this.MediaDescriptionCompat = clock;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(SimpleItemTouchHelperCallback.serializer);
        this.read = mutableStateFlow;
        this.write = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 2), 3);
    }
}
