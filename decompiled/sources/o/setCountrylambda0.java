package o;

import com.sentiance.core.model.events.i$c;

/* JADX INFO: loaded from: classes3.dex */
public final class setCountrylambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE write = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(10);
    public final addToSubscriptionGrouplambda2 IconCompatParcelizer;
    public final removeFromSubscriptionGrouplambda2 MediaBrowserCompatMediaItem;
    public final setLineIdlambda3 MediaDescriptionCompat;
    public final setCustomAttributelambda11 MediaMetadataCompat;
    public final setCustomAttributedefault MediaSessionCompatQueueItem;
    public final setAttributionDatalambda0 RatingCompat;
    public final setDefaultNotificationAccentColor RemoteActionCompatParcelizer;
    public final incrementCustomUserAttributelambda0 read;
    public final setDefaultNotificationChannelDescription serializer;

    public final int hashCode() {
        setDefaultNotificationAccentColor setdefaultnotificationaccentcolor = this.RemoteActionCompatParcelizer;
        int iHashCode = setdefaultnotificationaccentcolor == null ? 0 : setdefaultnotificationaccentcolor.hashCode();
        setDefaultNotificationChannelDescription setdefaultnotificationchanneldescription = this.serializer;
        int iHashCode2 = setdefaultnotificationchanneldescription == null ? 0 : setdefaultnotificationchanneldescription.hashCode();
        addToSubscriptionGrouplambda2 addtosubscriptiongrouplambda2 = this.IconCompatParcelizer;
        int iHashCode3 = addtosubscriptiongrouplambda2 == null ? 0 : addtosubscriptiongrouplambda2.hashCode();
        incrementCustomUserAttributelambda0 incrementcustomuserattributelambda0 = this.read;
        int iHashCode4 = incrementcustomuserattributelambda0 == null ? 0 : incrementcustomuserattributelambda0.hashCode();
        setAttributionDatalambda0 setattributiondatalambda0 = this.RatingCompat;
        int iHashCode5 = setattributiondatalambda0 == null ? 0 : setattributiondatalambda0.hashCode();
        setLineIdlambda3 setlineidlambda3 = this.MediaDescriptionCompat;
        int iHashCode6 = setlineidlambda3 == null ? 0 : setlineidlambda3.hashCode();
        removeFromSubscriptionGrouplambda2 removefromsubscriptiongrouplambda2 = this.MediaBrowserCompatMediaItem;
        int iHashCode7 = removefromsubscriptiongrouplambda2 == null ? 0 : removefromsubscriptiongrouplambda2.hashCode();
        setCustomAttributelambda11 setcustomattributelambda11 = this.MediaMetadataCompat;
        int iHashCode8 = setcustomattributelambda11 == null ? 0 : setcustomattributelambda11.hashCode();
        setCustomAttributedefault setcustomattributedefault = this.MediaSessionCompatQueueItem;
        return (((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ (setcustomattributedefault != null ? setcustomattributedefault.hashCode() : 0)) * (-2128831035);
    }

    public setCountrylambda0(i$c i_c) {
        this.RemoteActionCompatParcelizer = (setDefaultNotificationAccentColor) i_c.write;
        this.serializer = (setDefaultNotificationChannelDescription) i_c.MediaMetadataCompat;
        this.IconCompatParcelizer = (addToSubscriptionGrouplambda2) i_c.IconCompatParcelizer;
        this.read = (incrementCustomUserAttributelambda0) i_c.serializer;
        this.RatingCompat = (setAttributionDatalambda0) i_c.RemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = (setLineIdlambda3) i_c.read;
        this.MediaBrowserCompatMediaItem = (removeFromSubscriptionGrouplambda2) i_c.RatingCompat;
        this.MediaMetadataCompat = (setCustomAttributelambda11) i_c.MediaDescriptionCompat;
        this.MediaSessionCompatQueueItem = (setCustomAttributedefault) i_c.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        return "DataUnit{person_property=" + this.RemoteActionCompatParcelizer + ", created=" + this.serializer + ", registered_hub=" + this.IconCompatParcelizer + ", registered_person=" + this.read + ", registered_sensor=" + this.RatingCompat + ", sensor_property=" + this.MediaDescriptionCompat + ", deleted=" + this.MediaBrowserCompatMediaItem + ", installed=" + this.MediaMetadataCompat + ", activated=" + this.MediaSessionCompatQueueItem + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
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
            boolean r2 = r5 instanceof o.setCountrylambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCountrylambda0 r5 = (o.setCountrylambda0) r5
            o.setDefaultNotificationAccentColor r2 = r5.RemoteActionCompatParcelizer
            o.setDefaultNotificationAccentColor r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L8e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L8e
        L1d:
            o.setDefaultNotificationChannelDescription r2 = r5.serializer
            o.setDefaultNotificationChannelDescription r3 = r4.serializer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L8e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L8e
        L2b:
            o.addToSubscriptionGrouplambda2 r2 = r5.IconCompatParcelizer
            o.addToSubscriptionGrouplambda2 r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L8e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L8e
        L39:
            o.incrementCustomUserAttributelambda0 r2 = r5.read
            o.incrementCustomUserAttributelambda0 r3 = r4.read
            if (r3 == r2) goto L47
            if (r3 == 0) goto L8e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L8e
        L47:
            o.setAttributionDatalambda0 r2 = r5.RatingCompat
            o.setAttributionDatalambda0 r3 = r4.RatingCompat
            if (r3 == r2) goto L55
            if (r3 == 0) goto L8e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L8e
        L55:
            o.setLineIdlambda3 r2 = r5.MediaDescriptionCompat
            o.setLineIdlambda3 r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L63
            if (r3 == 0) goto L8e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L8e
        L63:
            o.removeFromSubscriptionGrouplambda2 r2 = r5.MediaBrowserCompatMediaItem
            o.removeFromSubscriptionGrouplambda2 r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L71
            if (r3 == 0) goto L8e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L8e
        L71:
            o.setCustomAttributelambda11 r2 = r5.MediaMetadataCompat
            o.setCustomAttributelambda11 r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L7f
            if (r3 == 0) goto L8e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L8e
        L7f:
            o.setCustomAttributedefault r5 = r5.MediaSessionCompatQueueItem
            o.setCustomAttributedefault r2 = r4.MediaSessionCompatQueueItem
            if (r2 == r5) goto L8f
            if (r2 == 0) goto L8e
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L8e
            goto L8f
        L8e:
            return r1
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCountrylambda0.equals(java.lang.Object):boolean");
    }
}
