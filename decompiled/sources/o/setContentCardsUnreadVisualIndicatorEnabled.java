package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setContentCardsUnreadVisualIndicatorEnabled implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final io.sentry.hints.MediaSessionCompatQueueItem write = new io.sentry.hints.MediaSessionCompatQueueItem(0, 12);
    public final r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4 IconCompatParcelizer;
    public final setCustomUserAttributelambda5 MediaDescriptionCompat;
    public final setCustomWebViewActivityClass MediaMetadataCompat;
    public final setApiKeyandroid_sdk_base_release RemoteActionCompatParcelizer;
    public final removeFromSubscriptionGrouplambda0 read;
    public final getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations serializer;

    public final int hashCode() {
        r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4 r8lambdasscpazklpwhzf7qziwqx9zu4wp4 = this.IconCompatParcelizer;
        int iHashCode = r8lambdasscpazklpwhzf7qziwqx9zu4wp4 == null ? 0 : r8lambdasscpazklpwhzf7qziwqx9zu4wp4.hashCode();
        setApiKeyandroid_sdk_base_release setapikeyandroid_sdk_base_release = this.RemoteActionCompatParcelizer;
        int iHashCode2 = setapikeyandroid_sdk_base_release == null ? 0 : setapikeyandroid_sdk_base_release.hashCode();
        removeFromSubscriptionGrouplambda0 removefromsubscriptiongrouplambda0 = this.read;
        int iHashCode3 = removefromsubscriptiongrouplambda0 == null ? 0 : removefromsubscriptiongrouplambda0.hashCode();
        getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations getbraze_push_delivery_flush_min_keyannotations = this.serializer;
        int iHashCode4 = getbraze_push_delivery_flush_min_keyannotations == null ? 0 : getbraze_push_delivery_flush_min_keyannotations.hashCode();
        setCustomWebViewActivityClass setcustomwebviewactivityclass = this.MediaMetadataCompat;
        int iHashCode5 = setcustomwebviewactivityclass == null ? 0 : setcustomwebviewactivityclass.hashCode();
        setCustomUserAttributelambda5 setcustomuserattributelambda5 = this.MediaDescriptionCompat;
        return (((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ (setcustomuserattributelambda5 != null ? setcustomuserattributelambda5.hashCode() : 0)) * (-2128831035);
    }

    public setContentCardsUnreadVisualIndicatorEnabled(r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls) {
        this.IconCompatParcelizer = (r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4) r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer;
        this.RemoteActionCompatParcelizer = (setApiKeyandroid_sdk_base_release) r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer;
        this.read = (removeFromSubscriptionGrouplambda0) r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem;
        this.serializer = (getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations) r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer;
        this.MediaMetadataCompat = (setCustomWebViewActivityClass) r8lambdayc78smgbbb6fudfjq0u5z3_ls.write;
        this.MediaDescriptionCompat = (setCustomUserAttributelambda5) r8lambdayc78smgbbb6fudfjq0u5z3_ls.read;
    }

    public final String toString() {
        return "TripEventProperty{trip_start=" + this.IconCompatParcelizer + ", trip_end=" + this.RemoteActionCompatParcelizer + ", waypoint=" + this.read + ", motion_activity_event=" + this.serializer + ", crash_event=" + this.MediaMetadataCompat + ", trip_discard=" + this.MediaDescriptionCompat + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r5 = r5.MediaDescriptionCompat;
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
            boolean r2 = r5 instanceof o.setContentCardsUnreadVisualIndicatorEnabled
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setContentCardsUnreadVisualIndicatorEnabled r5 = (o.setContentCardsUnreadVisualIndicatorEnabled) r5
            o.r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4 r2 = r5.IconCompatParcelizer
            o.r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4 r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L1d:
            o.setApiKeyandroid_sdk_base_release r2 = r5.RemoteActionCompatParcelizer
            o.setApiKeyandroid_sdk_base_release r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L2b:
            o.removeFromSubscriptionGrouplambda0 r2 = r5.read
            o.removeFromSubscriptionGrouplambda0 r3 = r4.read
            if (r3 == r2) goto L39
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L39:
            o.getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations r2 = r5.serializer
            o.getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations r3 = r4.serializer
            if (r3 == r2) goto L47
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L47:
            o.setCustomWebViewActivityClass r2 = r5.MediaMetadataCompat
            o.setCustomWebViewActivityClass r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L55
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L55:
            o.setCustomUserAttributelambda5 r5 = r5.MediaDescriptionCompat
            o.setCustomUserAttributelambda5 r2 = r4.MediaDescriptionCompat
            if (r2 == r5) goto L65
            if (r2 == 0) goto L64
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L64
            goto L65
        L64:
            return r1
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentCardsUnreadVisualIndicatorEnabled.equals(java.lang.Object):boolean");
    }
}
