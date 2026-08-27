package o;

import androidx.datastore.core.SingleProcessDataStore$data$1;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class e5 implements FlowCollector {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ dh write;

    public /* synthetic */ e5(dh dhVar, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = dhVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        dh dhVar = this.write;
        if (i4 == 0) {
            O o2 = (O) obj;
            dhVar.MediaSessionCompatResultReceiverWrapper = dhVar.PlaybackStateCompatCustomAction.write(o2.read, o2.write);
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = dhVar.ResultReceiver;
            ShortNewsContentCardView shortNewsContentCardView2 = null;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
            dhVar.ResultReceiver = BuildersKt.RemoteActionCompatParcelizer(o2.read, null, null, new SingleProcessDataStore$data$1.AnonymousClass1(dhVar, o2, shortNewsContentCardView2, 25), 3);
            return createfromparcel;
        }
        if (i4 == 1) {
            dh.serializer(dhVar);
            return createfromparcel;
        }
        if (i4 != 2) {
            dhVar.IconCompatParcelizer();
            return createfromparcel;
        }
        ((Number) obj).doubleValue();
        dh.serializer(dhVar);
        int i5 = IconCompatParcelizer + 79;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }
}
