package o;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.huawei.hms.android.SystemUtils;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class copyUg5Nnss implements getInverseTransform {
    public final /* synthetic */ int IconCompatParcelizer;
    public final CanvasDrawScopeKtasDrawTransform1 read;

    public /* synthetic */ copyUg5Nnss(CanvasDrawScopeKtasDrawTransform1 canvasDrawScopeKtasDrawTransform1, int i) {
        this.IconCompatParcelizer = i;
        this.read = canvasDrawScopeKtasDrawTransform1;
    }

    @Override // o.getInverseTransform
    public final generateOetf IconCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        if (this.IconCompatParcelizer != 0) {
            CanvasDrawScopeKtasDrawTransform1 canvasDrawScopeKtasDrawTransform1 = this.read;
            return canvasDrawScopeKtasDrawTransform1.RemoteActionCompatParcelizer(new accessgetTvTeletextcp((ParcelFileDescriptor) obj, canvasDrawScopeKtasDrawTransform1.ParcelableVolumeInfo, canvasDrawScopeKtasDrawTransform1.MediaSessionCompatQueueItem), i, i2, geteotffuncui_graphics, CanvasDrawScopeKtasDrawTransform1.serializer);
        }
        CanvasDrawScopeKtasDrawTransform1 canvasDrawScopeKtasDrawTransform2 = this.read;
        return canvasDrawScopeKtasDrawTransform2.RemoteActionCompatParcelizer(new androidx.navigation.NavArgsLazy((ByteBuffer) obj, canvasDrawScopeKtasDrawTransform2.ParcelableVolumeInfo, canvasDrawScopeKtasDrawTransform2.MediaSessionCompatQueueItem, 29), i, i2, geteotffuncui_graphics, CanvasDrawScopeKtasDrawTransform1.serializer);
    }

    @Override // o.getInverseTransform
    public final boolean RemoteActionCompatParcelizer(Object obj, getEotfFuncui_graphics geteotffuncui_graphics) {
        if (this.IconCompatParcelizer == 0) {
            return true;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        String str = Build.MANUFACTURER;
        return (!(SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str) || SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && toLinear.write();
    }
}
