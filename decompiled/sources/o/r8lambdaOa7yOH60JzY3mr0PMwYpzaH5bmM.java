package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM {
    public Integer IconCompatParcelizer;
    public Long MediaBrowserCompatMediaItem;
    public Long RemoteActionCompatParcelizer;
    public Long read;
    public Long serializer;
    public r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA write;

    public final r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU IconCompatParcelizer() {
        if (this.serializer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'ingestion_time' is missing");
            return null;
        }
        if (this.read == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'event_time' is missing");
            return null;
        }
        if (this.write != null) {
            return new r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'event_property' is missing");
        return null;
    }
}
