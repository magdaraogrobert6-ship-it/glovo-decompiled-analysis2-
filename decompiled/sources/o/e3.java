package o;

import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class e3 implements FlowCollector {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ dh write;

    public /* synthetic */ e3(dh dhVar, int i) {
        this.IconCompatParcelizer = i;
        this.write = dhVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
        int i = 2 % 2;
        int i2 = serializer + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        dh dhVar = this.write;
        if (i4 != 0) {
            dhVar.serializer = ((Boolean) obj).booleanValue();
            dh.serializer(dhVar);
            return createfromparcel;
        }
        ((Boolean) obj).getClass();
        Iterable<fe> iterable = (Iterable) dhVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read();
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = dhVar.write;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
            dhVar.write = null;
        } else {
            int i5 = RemoteActionCompatParcelizer + 113;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 4 / 5;
            }
            for (fe feVar : iterable) {
                int i7 = RemoteActionCompatParcelizer + 119;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if ((feVar instanceof gExternalSyntheticLambda0) && ((gExternalSyntheticLambda0) feVar).RemoteActionCompatParcelizer) {
                    if (!((Boolean) dhVar.ComponentActivity.read.read()).booleanValue()) {
                        if (dhVar.write == null) {
                            dhVar.write = BuildersKt.RemoteActionCompatParcelizer(dhVar.RatingCompat, null, null, new PushEventPublisherImpl$emit$1(dhVar, shortNewsContentCardView2, 21), 3);
                        }
                    }
                }
            }
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = dhVar.write;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
            dhVar.write = null;
        }
        return createfromparcel;
    }
}
