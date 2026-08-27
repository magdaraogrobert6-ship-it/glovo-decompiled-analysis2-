package o;

import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class dispatchFragmentsOnCreateView implements FlowCollector {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ markFragmentsCreated RemoteActionCompatParcelizer;

    public /* synthetic */ dispatchFragmentsOnCreateView(markFragmentsCreated markfragmentscreated, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = markfragmentscreated;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        markFragmentsCreated markfragmentscreated = this.RemoteActionCompatParcelizer;
        if (i2 != 0) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            markfragmentscreated.RemoteActionCompatParcelizer.IconCompatParcelizer(bool);
            int i3 = write + 51;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return createfromparcel;
        }
        onFragmentStarted onfragmentstarted = ((onFragmentResumed) obj).read;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = markfragmentscreated.write;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        markfragmentscreated.write = BuildersKt.RemoteActionCompatParcelizer(markfragmentscreated.IconCompatParcelizer, null, null, new HeatmapMapLayerUiModelImpl$1(onfragmentstarted, markfragmentscreated, shortNewsContentCardView2, 23), 3);
        int i5 = write + 111;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }
}
