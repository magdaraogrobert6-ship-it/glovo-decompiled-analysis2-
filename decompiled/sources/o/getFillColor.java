package o;

import com.roadrunner.liveness.recording.presentation.RecordingViewModel;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class getFillColor implements isAntiAlias {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ getFillColor(getStyleTiuSbCo getstyletiusbco, Object obj, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    @Override // o.isAntiAlias
    public final void write() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj = this.write;
        if (i2 != 0) {
            if (i2 != 1) {
                ((getTypeUIouoOA) obj).disable();
                return;
            } else {
                ((CursorAnchorInfoApi33Helper) obj).disable();
                return;
            }
        }
        RecordingViewModel recordingViewModel = (RecordingViewModel) obj;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = recordingViewModel.RemoteActionCompatParcelizer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i3 = serializer + 47;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            int i5 = serializer + 105;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        recordingViewModel.RemoteActionCompatParcelizer = null;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = recordingViewModel.ResultReceiver;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
            int i7 = serializer + 17;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
        }
        recordingViewModel.ResultReceiver = null;
    }
}
