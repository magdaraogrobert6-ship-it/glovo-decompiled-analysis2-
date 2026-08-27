package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewStretchWhenVideoCaptureIsBoundQuirk extends isNavigationInActiveGuidance {
    public getNavigationIcon IconCompatParcelizer;
    public Integer RemoteActionCompatParcelizer;
    public List read;
    public PreviewExternalSyntheticLambda0 serializer;
    public Integer write;

    public final Preview3AThreadCrashQuirk serializer() {
        String strConcat = this.serializer == null ? " surface" : "";
        if (this.read == null) {
            strConcat = strConcat.concat(" sharedSurfaces");
        }
        if (this.write == null) {
            strConcat = strConcat.concat(" mirrorMode");
        }
        if (this.RemoteActionCompatParcelizer == null) {
            strConcat = strConcat.concat(" surfaceGroupId");
        }
        if (this.IconCompatParcelizer == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (strConcat.isEmpty()) {
            return new Preview3AThreadCrashQuirk(this.serializer, this.read, this.write.intValue(), this.RemoteActionCompatParcelizer.intValue(), this.IconCompatParcelizer);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
        return null;
    }
}
