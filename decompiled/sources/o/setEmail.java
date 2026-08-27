package o;

import com.sentiance.core.model.events.E$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setEmail implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE read = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(21);
    public final String IconCompatParcelizer;
    public final List MediaDescriptionCompat;
    public final Boolean MediaMetadataCompat;
    public final List MediaSessionCompatQueueItem;
    public final Long RemoteActionCompatParcelizer;
    public final Long serializer;
    public final Short write;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode4 = this.write.hashCode();
        int iHashCode5 = this.MediaMetadataCompat.hashCode();
        List list = this.MediaDescriptionCompat;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        List list2 = this.MediaSessionCompatQueueItem;
        return (((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ (list2 != null ? list2.hashCode() : 0)) * (-2128831035);
    }

    public setEmail(E$b e$b) {
        this.IconCompatParcelizer = (String) e$b.read;
        this.serializer = (Long) e$b.MediaMetadataCompat;
        this.RemoteActionCompatParcelizer = (Long) e$b.RemoteActionCompatParcelizer;
        this.write = (Short) e$b.IconCompatParcelizer;
        this.MediaMetadataCompat = (Boolean) e$b.MediaDescriptionCompat;
        List list = (List) e$b.MediaBrowserCompatMediaItem;
        this.MediaDescriptionCompat = list == null ? null : Collections.unmodifiableList(list);
        ArrayList arrayList = (ArrayList) e$b.write;
        this.MediaSessionCompatQueueItem = arrayList != null ? Collections.unmodifiableList(arrayList) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppForegroundSession{session_id=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", start_time=");
        sb.append(this.serializer);
        sb.append(", stop_time=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", chunk_sequence_number=");
        sb.append(this.write);
        sb.append(", is_last_chunk=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", sensor_data=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", waypoints=");
        return MediaSessionCompatQueueItem.read(sb, this.MediaSessionCompatQueueItem, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r5 = r5.MediaSessionCompatQueueItem;
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
            boolean r2 = r5 instanceof o.setEmail
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setEmail r5 = (o.setEmail) r5
            java.lang.String r2 = r5.IconCompatParcelizer
            java.lang.String r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L68
        L1b:
            java.lang.Long r2 = r5.serializer
            java.lang.Long r3 = r4.serializer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L68
        L27:
            java.lang.Long r2 = r5.RemoteActionCompatParcelizer
            java.lang.Long r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L68
        L33:
            java.lang.Short r2 = r5.write
            java.lang.Short r3 = r4.write
            if (r3 == r2) goto L3f
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L68
        L3f:
            java.lang.Boolean r2 = r5.MediaMetadataCompat
            java.lang.Boolean r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L4b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L68
        L4b:
            java.util.List r2 = r5.MediaDescriptionCompat
            java.util.List r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L59
            if (r3 == 0) goto L68
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L68
        L59:
            java.util.List r5 = r5.MediaSessionCompatQueueItem
            java.util.List r2 = r4.MediaSessionCompatQueueItem
            if (r2 == r5) goto L69
            if (r2 == 0) goto L68
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L68
            goto L69
        L68:
            return r1
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setEmail.equals(java.lang.Object):boolean");
    }
}
