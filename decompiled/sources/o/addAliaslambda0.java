package o;

import com.sentiance.core.model.thrift.CustomEventSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class addAliaslambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final addToSubscriptionGrouplambda0 read = new addToSubscriptionGrouplambda0();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final Long MediaDescriptionCompat;
    public final setHomeCitylambda1 MediaMetadataCompat;
    public final CustomEventSource MediaSessionCompatQueueItem;
    public final Map MediaSessionCompatToken;
    public final Byte RatingCompat;
    public final Long RemoteActionCompatParcelizer;
    public final String serializer;
    public final Long write;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.write.hashCode();
        int iHashCode4 = this.serializer.hashCode();
        int iHashCode5 = this.MediaSessionCompatQueueItem.hashCode();
        Long l = this.MediaDescriptionCompat;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        String str = this.MediaBrowserCompatMediaItem;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        Byte b = this.RatingCompat;
        int iHashCode8 = b == null ? 0 : b.hashCode();
        setHomeCitylambda1 sethomecitylambda1 = this.MediaMetadataCompat;
        int iHashCode9 = sethomecitylambda1 == null ? 0 : sethomecitylambda1.hashCode();
        Map map = this.MediaSessionCompatToken;
        return (((((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ iHashCode9) * (-2128831035)) ^ (map != null ? map.hashCode() : 0)) * (-2128831035);
    }

    public addAliaslambda0(r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q) {
        this.IconCompatParcelizer = (String) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaBrowserCompatMediaItem;
        this.RemoteActionCompatParcelizer = (Long) r8lambdabirsljoagmyxhikohl5z5hht12q.serializer;
        this.write = (Long) r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer;
        this.serializer = (String) r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer;
        this.MediaSessionCompatQueueItem = (CustomEventSource) r8lambdabirsljoagmyxhikohl5z5hht12q.write;
        this.MediaDescriptionCompat = (Long) r8lambdabirsljoagmyxhikohl5z5hht12q.read;
        this.MediaBrowserCompatMediaItem = (String) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat;
        this.RatingCompat = (Byte) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaDescriptionCompat;
        this.MediaMetadataCompat = (setHomeCitylambda1) r8lambdabirsljoagmyxhikohl5z5hht12q.RatingCompat;
        HashMap map = (HashMap) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaSessionCompatQueueItem;
        this.MediaSessionCompatToken = map == null ? null : Collections.unmodifiableMap(map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomEvent{id=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", created_at=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", event_start_time=");
        sb.append(this.write);
        sb.append(", type=");
        sb.append(this.serializer);
        sb.append(", source=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", event_end_time=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", event_id=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", confidence=");
        sb.append(this.RatingCompat);
        sb.append(", location=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", values=");
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sb, this.MediaSessionCompatToken, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0067, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0075, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        r5 = r5.MediaSessionCompatToken;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof o.addAliaslambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.addAliaslambda0 r5 = (o.addAliaslambda0) r5
            java.lang.String r2 = r5.IconCompatParcelizer
            java.lang.String r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L1b:
            java.lang.Long r2 = r5.RemoteActionCompatParcelizer
            java.lang.Long r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L27:
            java.lang.Long r2 = r5.write
            java.lang.Long r3 = r4.write
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L33:
            java.lang.String r2 = r5.serializer
            java.lang.String r3 = r4.serializer
            if (r3 == r2) goto L3f
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L3f:
            com.sentiance.core.model.thrift.CustomEventSource r2 = r5.MediaSessionCompatQueueItem
            com.sentiance.core.model.thrift.CustomEventSource r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L4b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L4b:
            java.lang.Long r2 = r5.MediaDescriptionCompat
            java.lang.Long r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L59
            if (r3 == 0) goto L92
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L59:
            java.lang.String r2 = r5.MediaBrowserCompatMediaItem
            java.lang.String r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L67
            if (r3 == 0) goto L92
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L67:
            java.lang.Byte r2 = r5.RatingCompat
            java.lang.Byte r3 = r4.RatingCompat
            if (r3 == r2) goto L75
            if (r3 == 0) goto L92
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L75:
            o.setHomeCitylambda1 r2 = r5.MediaMetadataCompat
            o.setHomeCitylambda1 r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L83
            if (r3 == 0) goto L92
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L83:
            java.util.Map r5 = r5.MediaSessionCompatToken
            java.util.Map r2 = r4.MediaSessionCompatToken
            if (r2 == r5) goto L93
            if (r2 == 0) goto L92
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L92
            goto L93
        L92:
            return r1
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addAliaslambda0.equals(java.lang.Object):boolean");
    }
}
