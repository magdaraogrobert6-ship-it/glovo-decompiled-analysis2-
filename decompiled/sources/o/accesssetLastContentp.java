package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class accesssetLastContentp {
    public String IconCompatParcelizer;
    public long MediaMetadataCompat;
    public String RatingCompat;
    public int RemoteActionCompatParcelizer;
    public com.airbnb.lottie.PerformanceTracker read;
    public LayoutNodeSubcompositionsStateScope serializer;
    public long write;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResponseAdapter{body=");
        sb.append(this.serializer.toString());
        sb.append(", headers=");
        sb.append(this.read.toString());
        sb.append(", code=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", message='");
        sb.append(this.IconCompatParcelizer);
        sb.append("', sentRequestAtMillis=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", receivedResponseAtMillis=");
        sb.append(this.write);
        sb.append(", url='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.RatingCompat, "'}");
    }
}
