package androidx.camera.core;

import coil3.util.UtilsKt;
import java.util.concurrent.CancellationException;
import o.DrawModifierNodeKt;
import o.VideoEncoderCrashQuirk;
import o.VideoQualityQuirk;
import o.onDrawWithContent;

/* JADX INFO: loaded from: classes.dex */
public final class UseCaseGroup implements VideoEncoderCrashQuirk {
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final Object serializer;

    public /* synthetic */ UseCaseGroup(Object obj, Object obj2, Object obj3) {
        this.serializer = obj;
        this.read = obj2;
        this.RemoteActionCompatParcelizer = obj3;
    }

    @Override // o.VideoEncoderCrashQuirk
    public void a_(Object obj) {
        VideoQualityQuirk.write((DrawModifierNodeKt) this.serializer, (onDrawWithContent) this.read);
    }

    @Override // o.VideoEncoderCrashQuirk
    public void write(Throwable th) {
        boolean z = th instanceof CancellationException;
        onDrawWithContent ondrawwithcontent = (onDrawWithContent) this.read;
        if (z) {
            UtilsKt.RemoteActionCompatParcelizer((String) null, ondrawwithcontent.serializer(new SurfaceRequest.RequestCancelledException(((String) this.RemoteActionCompatParcelizer).concat(" cancelled."), th)));
        } else {
            ondrawwithcontent.RemoteActionCompatParcelizer(null);
        }
    }
}
