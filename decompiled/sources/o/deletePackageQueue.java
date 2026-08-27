package o;

import com.roadrunner.face.verification.presentation.selfie.camera.SelfieCameraControlsKt;
import com.roadrunner.rider.state.refresh.presentation.RefreshStateContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class deletePackageQueue implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ androidx.compose.ui.Modifier write;

    public /* synthetic */ deletePackageQueue(androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z, int i, int i2) {
        this.read = i2;
        this.write = modifier;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = z;
        this.RemoteActionCompatParcelizer = i;
    }

    public /* synthetic */ deletePackageQueue(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.read = i2;
        this.serializer = z;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = modifier;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 19;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RemoteActionCompatParcelizer;
        boolean z = this.serializer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.IconCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.write;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        Integer num = (Integer) obj2;
        if (i4 == 0) {
            num.getClass();
            RefreshStateContentKt.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z);
            return createfromparcel;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                num.getClass();
                SelfieCameraControlsKt.read(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z);
                return createfromparcel;
            }
            num.getClass();
            plusNvtHpc.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z);
            return createfromparcel;
        }
        num.intValue();
        androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandleIcon(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z);
        int i6 = MediaSessionCompatQueueItem + 45;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 59 / 0;
        }
        return createfromparcel;
    }
}
