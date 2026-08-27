package o;

import com.mapbox.common.HttpHeaders;
import com.roadrunner.order.history.data.database.HistoryDatabase_Impl;
import com.roadrunner.vendor.review.data.database.VendorReviewDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class xgExternalSyntheticLambda9 extends getAndroidCanvasannotations {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ androidx.room.RoomDatabase read;
    public final /* synthetic */ int serializer = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgExternalSyntheticLambda9(HistoryDatabase_Impl historyDatabase_Impl) {
        super(2, "2299abd418dc3fc3ae1bcf890c567925", "fbacbc88e6022e40277b2ca448e3e9e5");
        this.read = historyDatabase_Impl;
    }

    @Override // o.getAndroidCanvasannotations
    public final void RemoteActionCompatParcelizer(tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 119;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        tintxetnrds.getClass();
        int i4 = MediaBrowserCompatMediaItem + 43;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getAndroidCanvasannotations
    public final void write(tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 79;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            tintxetnrds.getClass();
            return;
        }
        tintxetnrds.getClass();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgExternalSyntheticLambda9(VendorReviewDatabase_Impl vendorReviewDatabase_Impl) {
        super(1, "f631f4816ece3f555759ad79b615495b", "79441c5e02de0b1aeafa503842130798");
        this.read = vendorReviewDatabase_Impl;
    }

    @Override // o.getAndroidCanvasannotations
    public final void MediaBrowserCompatMediaItem(tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 93;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        tintxetnrds.getClass();
        if (i4 != 0) {
            createCache.RemoteActionCompatParcelizer(tintxetnrds);
            return;
        }
        createCache.RemoteActionCompatParcelizer(tintxetnrds);
        int i5 = MediaBrowserCompatMediaItem + 97;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        androidx.sqlite.SQLite.serializer(r4, "DROP TABLE IF EXISTS `history`");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        androidx.sqlite.SQLite.serializer(r4, "DROP TABLE IF EXISTS `vendor_review_state`");
        r4 = o.xgExternalSyntheticLambda9.MediaSessionCompatQueueItem + 99;
        o.xgExternalSyntheticLambda9.MediaBrowserCompatMediaItem = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // o.getAndroidCanvasannotations
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void read(o.tintxETnrds r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.xgExternalSyntheticLambda9.MediaBrowserCompatMediaItem
            int r1 = r1 + 21
            int r2 = r1 % 128
            o.xgExternalSyntheticLambda9.MediaSessionCompatQueueItem = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1a
            int r1 = r3.serializer
            r4.getClass()
            r2 = 19
            int r2 = r2 / 0
            if (r1 == 0) goto L34
            goto L21
        L1a:
            int r1 = r3.serializer
            r4.getClass()
            if (r1 == 0) goto L34
        L21:
            java.lang.String r1 = "DROP TABLE IF EXISTS `vendor_review_state`"
            androidx.sqlite.SQLite.serializer(r4, r1)
            int r4 = o.xgExternalSyntheticLambda9.MediaSessionCompatQueueItem
            int r4 = r4 + 99
            int r1 = r4 % 128
            o.xgExternalSyntheticLambda9.MediaBrowserCompatMediaItem = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L32
            return
        L32:
            r4 = 0
            throw r4
        L34:
            java.lang.String r0 = "DROP TABLE IF EXISTS `history`"
            androidx.sqlite.SQLite.serializer(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.xgExternalSyntheticLambda9.read(o.tintxETnrds):void");
    }

    @Override // o.getAndroidCanvasannotations
    public final void IconCompatParcelizer(tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 19;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        androidx.room.RoomDatabase roomDatabase = this.read;
        tintxetnrds.getClass();
        if (i4 == 0) {
            HistoryDatabase_Impl.RemoteActionCompatParcelizer((HistoryDatabase_Impl) roomDatabase, tintxetnrds);
            return;
        }
        VendorReviewDatabase_Impl.RemoteActionCompatParcelizer((VendorReviewDatabase_Impl) roomDatabase, tintxetnrds);
        int i5 = MediaBrowserCompatMediaItem + 29;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getAndroidCanvasannotations
    public final void serializer(tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 11;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            tintxetnrds.getClass();
            throw null;
        }
        int i3 = this.serializer;
        tintxetnrds.getClass();
        if (i3 == 0) {
            androidx.sqlite.SQLite.serializer(tintxetnrds, "CREATE TABLE IF NOT EXISTS `history` (`date` TEXT NOT NULL, `deliveries` TEXT NOT NULL, PRIMARY KEY(`date`))");
            androidx.sqlite.SQLite.serializer(tintxetnrds, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            androidx.sqlite.SQLite.serializer(tintxetnrds, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2299abd418dc3fc3ae1bcf890c567925')");
            return;
        }
        androidx.sqlite.SQLite.serializer(tintxetnrds, "CREATE TABLE IF NOT EXISTS `vendor_review_state` (`delivery_id` INTEGER NOT NULL, `state` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`delivery_id`))");
        androidx.sqlite.SQLite.serializer(tintxetnrds, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        androidx.sqlite.SQLite.serializer(tintxetnrds, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f631f4816ece3f555759ad79b615495b')");
        int i4 = MediaBrowserCompatMediaItem + 109;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
    }

    @Override // o.getAndroidCanvasannotations
    public final setDropDownVerticalOffset RatingCompat(tintxETnrds tintxetnrds) {
        setDropDownVerticalOffset setdropdownverticaloffset;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = MediaSessionCompatQueueItem + 107;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = this.serializer;
        tintxetnrds.getClass();
        if (i6 != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("delivery_id", new getBlack0d7_KjU("delivery_id", "INTEGER", true, 1, null, 1));
            linkedHashMap.put("state", new getBlack0d7_KjU("state", "TEXT", true, 0, null, 1));
            linkedHashMap.put("updated_at", new getBlack0d7_KjU("updated_at", "INTEGER", true, 0, null, 1));
            getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations = new getUnspecified0d7_KjUannotations("vendor_review_state", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
            getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite = getBlue0d7_KjU.write(tintxetnrds, "vendor_review_state");
            return !getunspecified0d7_kjuannotations.equals(getunspecified0d7_kjuannotationsWrite) ? new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("vendor_review_state(com.roadrunner.vendor.review.data.database.entity.VendorReviewState).\n Expected:\n", getunspecified0d7_kjuannotations, "\n Found:\n", getunspecified0d7_kjuannotationsWrite), false) : new setDropDownVerticalOffset((Object) null, true);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(HttpHeaders.DATE, new getBlack0d7_KjU(HttpHeaders.DATE, "TEXT", true, 1, null, 1));
        linkedHashMap2.put("deliveries", new getBlack0d7_KjU("deliveries", "TEXT", true, 0, null, 1));
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations2 = new getUnspecified0d7_KjUannotations("history", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite2 = getBlue0d7_KjU.write(tintxetnrds, "history");
        if (getunspecified0d7_kjuannotations2.equals(getunspecified0d7_kjuannotationsWrite2)) {
            setdropdownverticaloffset = new setDropDownVerticalOffset((Object) null, true);
            i = MediaBrowserCompatMediaItem + 31;
            i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            setdropdownverticaloffset = new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("history(com.roadrunner.order.history.data.database.entity.History).\n Expected:\n", getunspecified0d7_kjuannotations2, "\n Found:\n", getunspecified0d7_kjuannotationsWrite2), false);
            i = MediaBrowserCompatMediaItem + 103;
            i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        MediaSessionCompatQueueItem = i2;
        int i7 = i % 2;
        return setdropdownverticaloffset;
    }
}
