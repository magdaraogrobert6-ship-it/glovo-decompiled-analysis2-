package o;

import android.view.Surface;
import androidx.camera.core.ImageCapture$Metadata;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class valueOf implements VideoEncoderCrashQuirk {
    public static final valueOf read;
    public final Object IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public valueOf(File file, ImageCapture$Metadata imageCapture$Metadata) {
        this.serializer = 3;
        this.RemoteActionCompatParcelizer = file;
        this.IconCompatParcelizer = imageCapture$Metadata == null ? new ImageCapture$Metadata(0) : imageCapture$Metadata;
    }

    static {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        read = new valueOf(new FocusOwnerImplmoveFocusfocusSearchSuccess1(fValueOf2, fValueOf2), 1, new FocusOwnerImplmoveFocusfocusSearchSuccess1(fValueOf, fValueOf));
    }

    @Override // o.VideoEncoderCrashQuirk
    public void a_(Object obj) {
        int i = this.serializer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            ((FocusOwnerImplmodifier1) obj2).accept(new getContentInsetLeft(0, (Surface) this.IconCompatParcelizer));
        } else {
            coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, ((onDrawWithContent) obj2).RemoteActionCompatParcelizer(null));
        }
    }

    @Override // o.VideoEncoderCrashQuirk
    public void write(Throwable th) {
        int i = this.serializer;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            if (th instanceof androidx.camera.core.SurfaceRequest.RequestCancelledException) {
                coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, ((onDrawBehind) obj).cancel(false));
                return;
            } else {
                coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, ((onDrawWithContent) obj2).RemoteActionCompatParcelizer(null));
                return;
            }
        }
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof androidx.camera.core.SurfaceRequest.RequestCancelledException);
        ((FocusOwnerImplmodifier1) obj2).accept(new getContentInsetLeft(1, (Surface) obj));
    }

    public String toString() {
        if (this.serializer != 3) {
            return super.toString();
        }
        return "OutputFileOptions{mFile=" + ((File) this.RemoteActionCompatParcelizer) + ", mContentResolver=null, mSaveCollection=null, mContentValues=null, mOutputStream=null, mMetadata=" + ((ImageCapture$Metadata) this.IconCompatParcelizer) + "}";
    }

    public /* synthetic */ valueOf(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
    }
}
