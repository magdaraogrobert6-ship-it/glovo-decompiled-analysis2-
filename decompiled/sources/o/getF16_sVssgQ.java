package o;

import com.deliveryhero.perseus.data.local.db.TrackingDatabase_Impl;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.navigation.voice.api.VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0;
import com.roadrunner.country.config.implementation.data.database.CountryConfigDatabase_Impl;
import com.roadrunner.database.Database_Impl;
import com.roadrunner.inappnotifications.data.database.InAppNotificationsDatabase_Impl;
import com.roadrunner.rider.state.provider.database.StatusDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getF16_sVssgQ extends getAndroidCanvasannotations {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ androidx.room.RoomDatabase read;
    public final /* synthetic */ int serializer = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getF16_sVssgQ(TrackingDatabase_Impl trackingDatabase_Impl) {
        super(14, "c52b427d12367615b58ba8f41cde097c", "cbceb9b27ff9144e7e9501c63710b9e1");
        this.read = trackingDatabase_Impl;
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i8 | i2));
        int i10 = ~i2;
        int i11 = i9 | (~(i10 | i3 | i));
        int i12 = i3 | i;
        int i13 = i10 | i12;
        int i14 = (~(i2 | i3)) | (~i12);
        int i15 = i3 + i + i6 + (1068639271 * i5) + ((-1919980423) * i4);
        int i16 = i15 * i15;
        int i17 = ((i3 * 1648758371) - 594280448) + (1648758371 * i) + (i11 * (-226102882)) + ((-226102882) * i13) + (226102882 * i14) + (1422655488 * i6) + ((-1693188096) * i5) + (611057664 * i4) + ((-810221568) * i16);
        int i18 = (i3 * 982247175) + 1844138806 + (i * 982247175) + (i11 * (-762)) + (i13 * (-762)) + (i14 * 762) + (i6 * 982246413) + (i5 * 1533776379) + (i4 * 1016546853) + (i16 * (-1070530560));
        return i17 + ((i18 * i18) * 1708326912) != 1 ? IconCompatParcelizer(objArr) : serializer(objArr);
    }

    @Override // o.getAndroidCanvasannotations
    public final void RemoteActionCompatParcelizer(tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 63;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            tintxetnrds.getClass();
        } else {
            tintxetnrds.getClass();
            int i3 = 98 / 0;
        }
    }

    @Override // o.getAndroidCanvasannotations
    public final void write(tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = RatingCompat + 25;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        tintxetnrds.getClass();
        int i4 = MediaSessionCompatQueueItem + 31;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getF16_sVssgQ(CountryConfigDatabase_Impl countryConfigDatabase_Impl) {
        super(1, "8b6e329579ec7f53ec8830e4f199e521", "83195111534c1a4de98f3b01e90f2caa");
        this.read = countryConfigDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getF16_sVssgQ(Database_Impl database_Impl) {
        super(63, "5ff65b3f6327b69a104784939c8d3ca1", "648e28d1ad8a5d952efcf9cc3fd9465d");
        this.read = database_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getF16_sVssgQ(InAppNotificationsDatabase_Impl inAppNotificationsDatabase_Impl) {
        super(5, "df006e685ace2e65e8c6aaa5bc699150", "5b94cd6f0dae67c52c6e5d5f1235410c");
        this.read = inAppNotificationsDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getF16_sVssgQ(StatusDatabase_Impl statusDatabase_Impl) {
        super(15, "ba6ac0de265cf02d3315dba313ea7911", "43e550aab0a86cb51c5b3c8f135bef00");
        this.read = statusDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getF16_sVssgQ(androidx.work.impl.WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.read = workDatabase_Impl;
    }

    @Override // o.getAndroidCanvasannotations
    public final void MediaBrowserCompatMediaItem(tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 119;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        tintxetnrds.getClass();
        if (i4 == 0) {
            createCache.RemoteActionCompatParcelizer(tintxetnrds);
            return;
        }
        if (i4 == 1) {
            createCache.RemoteActionCompatParcelizer(tintxetnrds);
            return;
        }
        if (i4 == 2) {
            createCache.RemoteActionCompatParcelizer(tintxetnrds);
            return;
        }
        if (i4 == 3) {
            createCache.RemoteActionCompatParcelizer(tintxetnrds);
            return;
        }
        if (i4 == 4) {
            createCache.RemoteActionCompatParcelizer(tintxetnrds);
            return;
        }
        createCache.RemoteActionCompatParcelizer(tintxetnrds);
        int i5 = MediaSessionCompatQueueItem + 15;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    @Override // o.getAndroidCanvasannotations
    public final void IconCompatParcelizer(tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = RatingCompat + 19;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            tintxetnrds.getClass();
            throw null;
        }
        int i3 = this.serializer;
        androidx.room.RoomDatabase roomDatabase = this.read;
        tintxetnrds.getClass();
        if (i3 == 0) {
            androidx.sqlite.SQLite.serializer(tintxetnrds, "PRAGMA foreign_keys = ON");
            ((androidx.work.impl.WorkDatabase_Impl) roomDatabase).internalInitInvalidationTracker(tintxetnrds);
            return;
        }
        if (i3 == 1) {
            ((TrackingDatabase_Impl) roomDatabase).internalInitInvalidationTracker(tintxetnrds);
            int i4 = RatingCompat + 65;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (i3 == 2) {
            CountryConfigDatabase_Impl.IconCompatParcelizer((CountryConfigDatabase_Impl) roomDatabase, tintxetnrds);
            return;
        }
        if (i3 == 3) {
            Database_Impl.serializer((Database_Impl) roomDatabase, tintxetnrds);
            return;
        }
        if (i3 != 4) {
            StatusDatabase_Impl.IconCompatParcelizer((StatusDatabase_Impl) roomDatabase, tintxetnrds);
            return;
        }
        InAppNotificationsDatabase_Impl.IconCompatParcelizer((InAppNotificationsDatabase_Impl) roomDatabase, tintxetnrds);
        int i5 = MediaSessionCompatQueueItem + 15;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    @Override // o.getAndroidCanvasannotations
    public final void read(tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = RatingCompat + 31;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            tintxetnrds.getClass();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        tintxetnrds.getClass();
        if (i3 == 0) {
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `Dependency`");
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `WorkSpec`");
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `WorkTag`");
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `SystemIdInfo`");
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `WorkName`");
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `WorkProgress`");
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `Preference`");
            return;
        }
        if (i3 == 1) {
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `tracking_perseus_events`");
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `HitEventValues`");
            return;
        }
        if (i3 == 2) {
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `country_config`");
            return;
        }
        if (i3 == 3) {
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `session`");
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `couriers`");
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `courier_start_zones`");
        } else if (i3 != 4) {
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `status`");
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `work_opportunity`");
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `shift_info`");
        } else {
            androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS `in_app_message`");
            int i4 = MediaSessionCompatQueueItem + 55;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r0 != 4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        androidx.sqlite.SQLite.serializer(r9, "CREATE TABLE IF NOT EXISTS `status` (`id` INTEGER NOT NULL, `status_type` TEXT NOT NULL, `status_text` TEXT NOT NULL, `description` TEXT, `action_type` TEXT, `action_text` TEXT, `action_url` TEXT, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        androidx.sqlite.SQLite.serializer(r9, "CREATE TABLE IF NOT EXISTS `work_opportunity` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `description` TEXT NOT NULL, `zone_name` TEXT, `zone_geo_json` TEXT, `center_geo_json` TEXT, `bonus_types` TEXT, `bonus_multiplier` TEXT, `calender_enabled` INTEGER, `subzones` TEXT NOT NULL, `start_time` TEXT, PRIMARY KEY(`id`))");
        androidx.sqlite.SQLite.serializer(r9, "CREATE TABLE IF NOT EXISTS `shift_info` (`id` INTEGER NOT NULL, `zone` TEXT NOT NULL, `city` TEXT NOT NULL, `cityId` INTEGER NOT NULL, `contractType` TEXT NOT NULL, `status` TEXT NOT NULL, `statusEndingTime` INTEGER, `isEndBreakAllowed` INTEGER NOT NULL, `isBreakScheduled` INTEGER NOT NULL, `isShiftExtensionAllowed` INTEGER NOT NULL, `isShiftExtensionRequestedByRider` INTEGER NOT NULL, `shifts` TEXT, `startingArea` TEXT, `timestamp` INTEGER NOT NULL, `balanceLimit` TEXT, PRIMARY KEY(`id`))");
        androidx.sqlite.SQLite.serializer(r9, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        androidx.sqlite.SQLite.serializer(r9, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ba6ac0de265cf02d3315dba313ea7911')");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        androidx.sqlite.SQLite.serializer(r9, "CREATE TABLE IF NOT EXISTS `in_app_message` (`id` INTEGER NOT NULL, `message_data` TEXT NOT NULL, `content_response_json` TEXT NOT NULL, `is_shown` INTEGER NOT NULL, `message_id` TEXT NOT NULL, `campaign_id` TEXT NOT NULL, `execution_id` TEXT NOT NULL, `template_id` TEXT NOT NULL, `notification_id` TEXT NOT NULL, PRIMARY KEY(`id`))");
        androidx.sqlite.SQLite.serializer(r9, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        androidx.sqlite.SQLite.serializer(r9, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'df006e685ace2e65e8c6aaa5bc699150')");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (r1 != 4) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r9) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getF16_sVssgQ.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    private final setDropDownVerticalOffset MediaDescriptionCompat(tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        tintxetnrds.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new getBlack0d7_KjU("id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("message_data", new getBlack0d7_KjU("message_data", "TEXT", true, 0, null, 1));
        linkedHashMap.put("content_response_json", new getBlack0d7_KjU("content_response_json", "TEXT", true, 0, null, 1));
        linkedHashMap.put("is_shown", new getBlack0d7_KjU("is_shown", "INTEGER", true, 0, null, 1));
        linkedHashMap.put(com.deliveryhero.chatsdk.util.PushNotificationParserObj.MESSAGE_ID_KEY, new getBlack0d7_KjU(com.deliveryhero.chatsdk.util.PushNotificationParserObj.MESSAGE_ID_KEY, "TEXT", true, 0, null, 1));
        linkedHashMap.put("campaign_id", new getBlack0d7_KjU("campaign_id", "TEXT", true, 0, null, 1));
        linkedHashMap.put("execution_id", new getBlack0d7_KjU("execution_id", "TEXT", true, 0, null, 1));
        linkedHashMap.put("template_id", new getBlack0d7_KjU("template_id", "TEXT", true, 0, null, 1));
        linkedHashMap.put("notification_id", new getBlack0d7_KjU("notification_id", "TEXT", true, 0, null, 1));
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations = new getUnspecified0d7_KjUannotations("in_app_message", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite = getBlue0d7_KjU.write(tintxetnrds, "in_app_message");
        Object obj = null;
        if (getunspecified0d7_kjuannotations.equals(getunspecified0d7_kjuannotationsWrite)) {
            setDropDownVerticalOffset setdropdownverticaloffset = new setDropDownVerticalOffset((Object) null, true);
            int i2 = RatingCompat + 9;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return setdropdownverticaloffset;
            }
            throw null;
        }
        setDropDownVerticalOffset setdropdownverticaloffset2 = new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("in_app_message(com.roadrunner.inappnotifications.data.database.entity.InAppMessage).\n Expected:\n", getunspecified0d7_kjuannotations, "\n Found:\n", getunspecified0d7_kjuannotationsWrite), false);
        int i3 = RatingCompat + 55;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return setdropdownverticaloffset2;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        tintxETnrds tintxetnrds = (tintxETnrds) objArr[1];
        int i = 2 % 2;
        tintxetnrds.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id_country_config", new getBlack0d7_KjU("id_country_config", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("name", new getBlack0d7_KjU("name", "TEXT", true, 0, null, 1));
        linkedHashMap.put("country_code", new getBlack0d7_KjU("country_code", "TEXT", true, 0, null, 1));
        linkedHashMap.put("country_iso_code", new getBlack0d7_KjU("country_iso_code", "TEXT", true, 0, null, 1));
        linkedHashMap.put("brand", new getBlack0d7_KjU("brand", "TEXT", true, 0, null, 1));
        linkedHashMap.put("currency", new getBlack0d7_KjU("currency", "TEXT", true, 0, null, 1));
        linkedHashMap.put("url", new getBlack0d7_KjU("url", "TEXT", true, 0, null, 1));
        linkedHashMap.put("global_entity_id", new getBlack0d7_KjU("global_entity_id", "TEXT", true, 0, null, 1));
        linkedHashMap.put("register_url", new getBlack0d7_KjU("register_url", "TEXT", false, 0, null, 1));
        linkedHashMap.put("privacy_policy_url", new getBlack0d7_KjU("privacy_policy_url", "TEXT", false, 0, null, 1));
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations = new getUnspecified0d7_KjUannotations("country_config", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite = getBlue0d7_KjU.write(tintxetnrds, "country_config");
        if (getunspecified0d7_kjuannotations.equals(getunspecified0d7_kjuannotationsWrite)) {
            return new setDropDownVerticalOffset((Object) null, true);
        }
        setDropDownVerticalOffset setdropdownverticaloffset = new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("country_config(com.roadrunner.country.config.implementation.data.database.entity.CountryConfigEntity).\n Expected:\n", getunspecified0d7_kjuannotations, "\n Found:\n", getunspecified0d7_kjuannotationsWrite), false);
        int i2 = RatingCompat + 5;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return setdropdownverticaloffset;
    }

    private final setDropDownVerticalOffset MediaMetadataCompat(tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        tintxetnrds.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id_session", new getBlack0d7_KjU("id_session", "INTEGER", true, 1, null, 1));
        linkedHashMap.put(com.deliveryhero.chatsdk.util.PushNotificationParserObj.COUNTRY_KEY, new getBlack0d7_KjU(com.deliveryhero.chatsdk.util.PushNotificationParserObj.COUNTRY_KEY, "TEXT", true, 0, null, 1));
        linkedHashMap.put("countryUrl", new getBlack0d7_KjU("countryUrl", "TEXT", true, 0, null, 1));
        linkedHashMap.put("userId", new getBlack0d7_KjU("userId", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("contract", new getBlack0d7_KjU("contract", "TEXT", true, 0, null, 1));
        linkedHashMap.put("cityId", new getBlack0d7_KjU("cityId", "INTEGER", true, 0, null, 1));
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations = new getUnspecified0d7_KjUannotations("session", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite = getBlue0d7_KjU.write(tintxetnrds, "session");
        if (!getunspecified0d7_kjuannotations.equals(getunspecified0d7_kjuannotationsWrite)) {
            return new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("session(com.roadrunner.database.entity.Session).\n Expected:\n", getunspecified0d7_kjuannotations, "\n Found:\n", getunspecified0d7_kjuannotationsWrite), false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new getBlack0d7_KjU("id", "INTEGER", true, 1, null, 1));
        linkedHashMap2.put("status", new getBlack0d7_KjU("status", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("shifts", new getBlack0d7_KjU("shifts", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("city", new getBlack0d7_KjU("city", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("zone", new getBlack0d7_KjU("zone", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("nationalId", new getBlack0d7_KjU("nationalId", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("gccSessionToken", new getBlack0d7_KjU("gccSessionToken", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("statusEndingTime", new getBlack0d7_KjU("statusEndingTime", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("isEndBreakAllowed", new getBlack0d7_KjU("isEndBreakAllowed", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("isBreakScheduled", new getBlack0d7_KjU("isBreakScheduled", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("isShiftExtensionAllowed", new getBlack0d7_KjU("isShiftExtensionAllowed", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("isShiftExtensionRequestedByRider", new getBlack0d7_KjU("isShiftExtensionRequestedByRider", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("acceptanceRate", new getBlack0d7_KjU("acceptanceRate", "REAL", false, 0, null, 1));
        linkedHashMap2.put("isPushTokenInvalid", new getBlack0d7_KjU("isPushTokenInvalid", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("startingArea", new getBlack0d7_KjU("startingArea", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("timestamp", new getBlack0d7_KjU("timestamp", "INTEGER", true, 0, null, 1));
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations2 = new getUnspecified0d7_KjUannotations("couriers", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite2 = getBlue0d7_KjU.write(tintxetnrds, "couriers");
        if (!getunspecified0d7_kjuannotations2.equals(getunspecified0d7_kjuannotationsWrite2)) {
            setDropDownVerticalOffset setdropdownverticaloffset = new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("couriers(com.roadrunner.database.entity.Courier).\n Expected:\n", getunspecified0d7_kjuannotations2, "\n Found:\n", getunspecified0d7_kjuannotationsWrite2), false);
            int i2 = RatingCompat + 7;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return setdropdownverticaloffset;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id_zone", new getBlack0d7_KjU("id_zone", "INTEGER", true, 1, null, 1));
        linkedHashMap3.put("latitude", new getBlack0d7_KjU("latitude", "REAL", true, 0, null, 1));
        linkedHashMap3.put("longitude", new getBlack0d7_KjU("longitude", "REAL", true, 0, null, 1));
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations3 = new getUnspecified0d7_KjUannotations("courier_start_zones", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite3 = getBlue0d7_KjU.write(tintxetnrds, "courier_start_zones");
        return !getunspecified0d7_kjuannotations3.equals(getunspecified0d7_kjuannotationsWrite3) ? new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("courier_start_zones(com.roadrunner.database.entity.StartingZone).\n Expected:\n", getunspecified0d7_kjuannotations3, "\n Found:\n", getunspecified0d7_kjuannotationsWrite3), false) : new setDropDownVerticalOffset((Object) null, true);
    }

    @Override // o.getAndroidCanvasannotations
    public final setDropDownVerticalOffset RatingCompat(tintxETnrds tintxetnrds) {
        setDropDownVerticalOffset setdropdownverticaloffset;
        int i = 2 % 2;
        int i2 = this.serializer;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int iIconCompatParcelizer = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    int iIconCompatParcelizer2 = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return (setDropDownVerticalOffset) RemoteActionCompatParcelizer(1473319677, iIconCompatParcelizer, new Object[]{this, tintxetnrds}, -1473319676, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), iIconCompatParcelizer2);
                }
                if (i2 == 3) {
                    return MediaMetadataCompat(tintxetnrds);
                }
                if (i2 != 4) {
                    tintxetnrds.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("id", new getBlack0d7_KjU("id", "INTEGER", true, 1, null, 1));
                    linkedHashMap.put("status_type", new getBlack0d7_KjU("status_type", "TEXT", true, 0, null, 1));
                    linkedHashMap.put("status_text", new getBlack0d7_KjU("status_text", "TEXT", true, 0, null, 1));
                    linkedHashMap.put("description", new getBlack0d7_KjU("description", "TEXT", false, 0, null, 1));
                    linkedHashMap.put("action_type", new getBlack0d7_KjU("action_type", "TEXT", false, 0, null, 1));
                    linkedHashMap.put("action_text", new getBlack0d7_KjU("action_text", "TEXT", false, 0, null, 1));
                    linkedHashMap.put("action_url", new getBlack0d7_KjU("action_url", "TEXT", false, 0, null, 1));
                    linkedHashMap.put("timestamp", new getBlack0d7_KjU("timestamp", "INTEGER", true, 0, null, 1));
                    getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations = new getUnspecified0d7_KjUannotations("status", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                    getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite = getBlue0d7_KjU.write(tintxetnrds, "status");
                    if (!getunspecified0d7_kjuannotations.equals(getunspecified0d7_kjuannotationsWrite)) {
                        return new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("status(com.roadrunner.rider.state.provider.database.entity.StatusEntity).\n Expected:\n", getunspecified0d7_kjuannotations, "\n Found:\n", getunspecified0d7_kjuannotationsWrite), false);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("id", new getBlack0d7_KjU("id", "TEXT", true, 1, null, 1));
                    linkedHashMap2.put("type", new getBlack0d7_KjU("type", "TEXT", true, 0, null, 1));
                    linkedHashMap2.put("description", new getBlack0d7_KjU("description", "TEXT", true, 0, null, 1));
                    linkedHashMap2.put("zone_name", new getBlack0d7_KjU("zone_name", "TEXT", false, 0, null, 1));
                    linkedHashMap2.put("zone_geo_json", new getBlack0d7_KjU("zone_geo_json", "TEXT", false, 0, null, 1));
                    linkedHashMap2.put("center_geo_json", new getBlack0d7_KjU("center_geo_json", "TEXT", false, 0, null, 1));
                    linkedHashMap2.put("bonus_types", new getBlack0d7_KjU("bonus_types", "TEXT", false, 0, null, 1));
                    linkedHashMap2.put("bonus_multiplier", new getBlack0d7_KjU("bonus_multiplier", "TEXT", false, 0, null, 1));
                    linkedHashMap2.put("calender_enabled", new getBlack0d7_KjU("calender_enabled", "INTEGER", false, 0, null, 1));
                    linkedHashMap2.put("subzones", new getBlack0d7_KjU("subzones", "TEXT", true, 0, null, 1));
                    linkedHashMap2.put("start_time", new getBlack0d7_KjU("start_time", "TEXT", false, 0, null, 1));
                    getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations2 = new getUnspecified0d7_KjUannotations("work_opportunity", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                    getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite2 = getBlue0d7_KjU.write(tintxetnrds, "work_opportunity");
                    if (!getunspecified0d7_kjuannotations2.equals(getunspecified0d7_kjuannotationsWrite2)) {
                        return new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("work_opportunity(com.roadrunner.rider.state.provider.database.entity.WorkOpportunityEntity).\n Expected:\n", getunspecified0d7_kjuannotations2, "\n Found:\n", getunspecified0d7_kjuannotationsWrite2), false);
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("id", new getBlack0d7_KjU("id", "INTEGER", true, 1, null, 1));
                    linkedHashMap3.put("zone", new getBlack0d7_KjU("zone", "TEXT", true, 0, null, 1));
                    linkedHashMap3.put("city", new getBlack0d7_KjU("city", "TEXT", true, 0, null, 1));
                    linkedHashMap3.put("cityId", new getBlack0d7_KjU("cityId", "INTEGER", true, 0, null, 1));
                    linkedHashMap3.put("contractType", new getBlack0d7_KjU("contractType", "TEXT", true, 0, null, 1));
                    linkedHashMap3.put("status", new getBlack0d7_KjU("status", "TEXT", true, 0, null, 1));
                    linkedHashMap3.put("statusEndingTime", new getBlack0d7_KjU("statusEndingTime", "INTEGER", false, 0, null, 1));
                    linkedHashMap3.put("isEndBreakAllowed", new getBlack0d7_KjU("isEndBreakAllowed", "INTEGER", true, 0, null, 1));
                    linkedHashMap3.put("isBreakScheduled", new getBlack0d7_KjU("isBreakScheduled", "INTEGER", true, 0, null, 1));
                    linkedHashMap3.put("isShiftExtensionAllowed", new getBlack0d7_KjU("isShiftExtensionAllowed", "INTEGER", true, 0, null, 1));
                    linkedHashMap3.put("isShiftExtensionRequestedByRider", new getBlack0d7_KjU("isShiftExtensionRequestedByRider", "INTEGER", true, 0, null, 1));
                    linkedHashMap3.put("shifts", new getBlack0d7_KjU("shifts", "TEXT", false, 0, null, 1));
                    linkedHashMap3.put("startingArea", new getBlack0d7_KjU("startingArea", "TEXT", false, 0, null, 1));
                    linkedHashMap3.put("timestamp", new getBlack0d7_KjU("timestamp", "INTEGER", true, 0, null, 1));
                    linkedHashMap3.put("balanceLimit", new getBlack0d7_KjU("balanceLimit", "TEXT", false, 0, null, 1));
                    getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations3 = new getUnspecified0d7_KjUannotations("shift_info", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                    getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite3 = getBlue0d7_KjU.write(tintxetnrds, "shift_info");
                    if (!getunspecified0d7_kjuannotations3.equals(getunspecified0d7_kjuannotationsWrite3)) {
                        return new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("shift_info(com.roadrunner.rider.state.provider.database.entity.ShiftInfoEntity).\n Expected:\n", getunspecified0d7_kjuannotations3, "\n Found:\n", getunspecified0d7_kjuannotationsWrite3), false);
                    }
                    return new setDropDownVerticalOffset((Object) null, true);
                }
                return MediaDescriptionCompat(tintxetnrds);
            }
            tintxetnrds.getClass();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.put("id", new getBlack0d7_KjU("id", "INTEGER", true, 1, null, 1));
            linkedHashMap4.put("timestamp", new getBlack0d7_KjU("timestamp", "INTEGER", true, 0, null, 1));
            linkedHashMap4.put("payloadTimeStamp", new getBlack0d7_KjU("payloadTimeStamp", "TEXT", true, 0, null, 1));
            linkedHashMap4.put(com.deliveryhero.chatsdk.util.PushNotificationParserObj.COUNTRY_KEY, new getBlack0d7_KjU(com.deliveryhero.chatsdk.util.PushNotificationParserObj.COUNTRY_KEY, "TEXT", true, 0, null, 1));
            linkedHashMap4.put("advertisingId", new getBlack0d7_KjU("advertisingId", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("appId", new getBlack0d7_KjU("appId", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("appName", new getBlack0d7_KjU("appName", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("appVersionCode", new getBlack0d7_KjU("appVersionCode", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("adjustId", new getBlack0d7_KjU("adjustId", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("userId", new getBlack0d7_KjU("userId", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("uaId", new getBlack0d7_KjU("uaId", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("clientId", new getBlack0d7_KjU("clientId", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("sessionId", new getBlack0d7_KjU("sessionId", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("sdkVersionName", new getBlack0d7_KjU("sdkVersionName", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("globalEntityId", new getBlack0d7_KjU("globalEntityId", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("consent", new getBlack0d7_KjU("consent", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("sessionOffset", new getBlack0d7_KjU("sessionOffset", "INTEGER", true, 0, null, 1));
            linkedHashMap4.put("eventVariables", new getBlack0d7_KjU("eventVariables", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("ecommerceItems", new getBlack0d7_KjU("ecommerceItems", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("ecommerceComponents", new getBlack0d7_KjU("ecommerceComponents", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("isDebug", new getBlack0d7_KjU("isDebug", "INTEGER", true, 0, null, 1));
            linkedHashMap4.put("eventAction", new getBlack0d7_KjU("eventAction", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("appBuildVersion", new getBlack0d7_KjU("appBuildVersion", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("rechargeTo", new getBlack0d7_KjU("rechargeTo", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("firebaseInstanceId", new getBlack0d7_KjU("firebaseInstanceId", "TEXT", false, 0, null, 1));
            linkedHashMap4.put(RemoteMessageConst.Notification.PRIORITY, new getBlack0d7_KjU(RemoteMessageConst.Notification.PRIORITY, "INTEGER", false, 0, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Object[] objArr = {RemoteMessageConst.Notification.PRIORITY};
            int iSerializer = getQueryParameterslambda2.serializer();
            List list = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
            int iSerializer2 = getQueryParameterslambda2.serializer();
            int iSerializer3 = getQueryParameterslambda2.serializer();
            linkedHashSet2.add(new hslToRgbComponent("index_tracking_perseus_events_priority", false, list, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer3, 516583654, new Object[]{"ASC"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer2)));
            int iSerializer4 = getQueryParameterslambda2.serializer();
            int iSerializer5 = getQueryParameterslambda2.serializer();
            List list2 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer5, 516583654, new Object[]{"eventAction"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer4);
            int iSerializer6 = getQueryParameterslambda2.serializer();
            int iSerializer7 = getQueryParameterslambda2.serializer();
            linkedHashSet2.add(new hslToRgbComponent("index_tracking_perseus_events_eventAction", false, list2, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer7, 516583654, new Object[]{"ASC"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer6)));
            linkedHashSet2.add(new hslToRgbComponent("index_tracking_perseus_events_eventAction_priority", false, androidx.sqlite.SQLite.read("eventAction", RemoteMessageConst.Notification.PRIORITY), androidx.sqlite.SQLite.read("ASC", "ASC")));
            linkedHashSet2.add(new hslToRgbComponent("index_tracking_perseus_events_priority_timestamp", false, androidx.sqlite.SQLite.read(RemoteMessageConst.Notification.PRIORITY, "timestamp"), androidx.sqlite.SQLite.read("ASC", "DESC")));
            getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations4 = new getUnspecified0d7_KjUannotations("tracking_perseus_events", linkedHashMap4, linkedHashSet, linkedHashSet2);
            getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite4 = getBlue0d7_KjU.write(tintxetnrds, "tracking_perseus_events");
            if (!getunspecified0d7_kjuannotations4.equals(getunspecified0d7_kjuannotationsWrite4)) {
                setdropdownverticaloffset = new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("tracking_perseus_events(com.deliveryhero.perseus.data.local.db.entity.HitEvent).\n Expected:\n", getunspecified0d7_kjuannotations4, "\n Found:\n", getunspecified0d7_kjuannotationsWrite4), false);
            } else {
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("timestampId", new getBlack0d7_KjU("timestampId", "INTEGER", true, 0, null, 1));
                linkedHashMap5.put("timestamp", new getBlack0d7_KjU("timestamp", "INTEGER", true, 0, null, 1));
                linkedHashMap5.put("key", new getBlack0d7_KjU("key", "TEXT", true, 0, null, 1));
                linkedHashMap5.put("value", new getBlack0d7_KjU("value", "TEXT", true, 0, null, 1));
                linkedHashMap5.put("id", new getBlack0d7_KjU("id", "INTEGER", true, 1, null, 1));
                getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations5 = new getUnspecified0d7_KjUannotations("HitEventValues", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
                getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite5 = getBlue0d7_KjU.write(tintxetnrds, "HitEventValues");
                if (!getunspecified0d7_kjuannotations5.equals(getunspecified0d7_kjuannotationsWrite5)) {
                    setdropdownverticaloffset = new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("HitEventValues(com.deliveryhero.perseus.data.local.db.entity.HitEventValues).\n Expected:\n", getunspecified0d7_kjuannotations5, "\n Found:\n", getunspecified0d7_kjuannotationsWrite5), false);
                } else {
                    setdropdownverticaloffset = new setDropDownVerticalOffset((Object) null, true);
                }
            }
            int i3 = MediaSessionCompatQueueItem + 33;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return setdropdownverticaloffset;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        tintxetnrds.getClass();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new getBlack0d7_KjU("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap6.put("prerequisite_id", new getBlack0d7_KjU("prerequisite_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        int iSerializer8 = getQueryParameterslambda2.serializer();
        int iSerializer9 = getQueryParameterslambda2.serializer();
        List list3 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer9, 516583654, new Object[]{"work_spec_id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer8);
        int iSerializer10 = getQueryParameterslambda2.serializer();
        int iSerializer11 = getQueryParameterslambda2.serializer();
        linkedHashSet3.add(new hsvToRgbComponent("WorkSpec", "CASCADE", list3, "CASCADE", (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer11, 516583654, new Object[]{"id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer10)));
        int iSerializer12 = getQueryParameterslambda2.serializer();
        int iSerializer13 = getQueryParameterslambda2.serializer();
        List list4 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer13, 516583654, new Object[]{"prerequisite_id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer12);
        int iSerializer14 = getQueryParameterslambda2.serializer();
        int iSerializer15 = getQueryParameterslambda2.serializer();
        linkedHashSet3.add(new hsvToRgbComponent("WorkSpec", "CASCADE", list4, "CASCADE", (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer15, 516583654, new Object[]{"id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer14)));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        int iSerializer16 = getQueryParameterslambda2.serializer();
        int iSerializer17 = getQueryParameterslambda2.serializer();
        List list5 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer17, 516583654, new Object[]{"work_spec_id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer16);
        int iSerializer18 = getQueryParameterslambda2.serializer();
        int iSerializer19 = getQueryParameterslambda2.serializer();
        linkedHashSet4.add(new hslToRgbComponent("index_Dependency_work_spec_id", false, list5, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer19, 516583654, new Object[]{"ASC"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer18)));
        int iSerializer20 = getQueryParameterslambda2.serializer();
        int iSerializer21 = getQueryParameterslambda2.serializer();
        List list6 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer21, 516583654, new Object[]{"prerequisite_id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer20);
        int iSerializer22 = getQueryParameterslambda2.serializer();
        int iSerializer23 = getQueryParameterslambda2.serializer();
        linkedHashSet4.add(new hslToRgbComponent("index_Dependency_prerequisite_id", false, list6, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer23, 516583654, new Object[]{"ASC"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer22)));
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations6 = new getUnspecified0d7_KjUannotations("Dependency", linkedHashMap6, linkedHashSet3, linkedHashSet4);
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite6 = getBlue0d7_KjU.write(tintxetnrds, "Dependency");
        if (!getunspecified0d7_kjuannotations6.equals(getunspecified0d7_kjuannotationsWrite6)) {
            return new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", getunspecified0d7_kjuannotations6, "\n Found:\n", getunspecified0d7_kjuannotationsWrite6), false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("id", new getBlack0d7_KjU("id", "TEXT", true, 1, null, 1));
        linkedHashMap7.put("state", new getBlack0d7_KjU("state", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("worker_class_name", new getBlack0d7_KjU("worker_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("input_merger_class_name", new getBlack0d7_KjU("input_merger_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("input", new getBlack0d7_KjU("input", "BLOB", true, 0, null, 1));
        linkedHashMap7.put("output", new getBlack0d7_KjU("output", "BLOB", true, 0, null, 1));
        linkedHashMap7.put("initial_delay", new getBlack0d7_KjU("initial_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("interval_duration", new getBlack0d7_KjU("interval_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("flex_duration", new getBlack0d7_KjU("flex_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("run_attempt_count", new getBlack0d7_KjU("run_attempt_count", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("backoff_policy", new getBlack0d7_KjU("backoff_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("backoff_delay_duration", new getBlack0d7_KjU("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("last_enqueue_time", new getBlack0d7_KjU("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        linkedHashMap7.put("minimum_retention_duration", new getBlack0d7_KjU("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("schedule_requested_at", new getBlack0d7_KjU("schedule_requested_at", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("run_in_foreground", new getBlack0d7_KjU("run_in_foreground", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("out_of_quota_policy", new getBlack0d7_KjU("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("period_count", new getBlack0d7_KjU("period_count", "INTEGER", true, 0, "0", 1));
        linkedHashMap7.put("generation", new getBlack0d7_KjU("generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap7.put("next_schedule_time_override", new getBlack0d7_KjU("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        linkedHashMap7.put("next_schedule_time_override_generation", new getBlack0d7_KjU("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap7.put("stop_reason", new getBlack0d7_KjU("stop_reason", "INTEGER", true, 0, "-256", 1));
        linkedHashMap7.put("trace_tag", new getBlack0d7_KjU("trace_tag", "TEXT", false, 0, null, 1));
        linkedHashMap7.put("backoff_on_system_interruptions", new getBlack0d7_KjU("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        linkedHashMap7.put("required_network_type", new getBlack0d7_KjU("required_network_type", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("required_network_request", new getBlack0d7_KjU("required_network_request", "BLOB", true, 0, "x''", 1));
        linkedHashMap7.put("requires_charging", new getBlack0d7_KjU("requires_charging", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("requires_device_idle", new getBlack0d7_KjU("requires_device_idle", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("requires_battery_not_low", new getBlack0d7_KjU("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("requires_storage_not_low", new getBlack0d7_KjU("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("trigger_content_update_delay", new getBlack0d7_KjU("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("trigger_max_content_delay", new getBlack0d7_KjU("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("content_uri_triggers", new getBlack0d7_KjU("content_uri_triggers", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        int iSerializer24 = getQueryParameterslambda2.serializer();
        int iSerializer25 = getQueryParameterslambda2.serializer();
        List list7 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer25, 516583654, new Object[]{"schedule_requested_at"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer24);
        int iSerializer26 = getQueryParameterslambda2.serializer();
        int iSerializer27 = getQueryParameterslambda2.serializer();
        linkedHashSet6.add(new hslToRgbComponent("index_WorkSpec_schedule_requested_at", false, list7, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer27, 516583654, new Object[]{"ASC"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer26)));
        int iSerializer28 = getQueryParameterslambda2.serializer();
        int iSerializer29 = getQueryParameterslambda2.serializer();
        List list8 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer29, 516583654, new Object[]{"last_enqueue_time"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer28);
        int iSerializer30 = getQueryParameterslambda2.serializer();
        int iSerializer31 = getQueryParameterslambda2.serializer();
        linkedHashSet6.add(new hslToRgbComponent("index_WorkSpec_last_enqueue_time", false, list8, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer31, 516583654, new Object[]{"ASC"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer30)));
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations7 = new getUnspecified0d7_KjUannotations("WorkSpec", linkedHashMap7, linkedHashSet5, linkedHashSet6);
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite7 = getBlue0d7_KjU.write(tintxetnrds, "WorkSpec");
        if (!getunspecified0d7_kjuannotations7.equals(getunspecified0d7_kjuannotationsWrite7)) {
            return new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", getunspecified0d7_kjuannotations7, "\n Found:\n", getunspecified0d7_kjuannotationsWrite7), false);
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put(RemoteMessageConst.Notification.TAG, new getBlack0d7_KjU(RemoteMessageConst.Notification.TAG, "TEXT", true, 1, null, 1));
        linkedHashMap8.put("work_spec_id", new getBlack0d7_KjU("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        int iSerializer32 = getQueryParameterslambda2.serializer();
        int iSerializer33 = getQueryParameterslambda2.serializer();
        List list9 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer33, 516583654, new Object[]{"work_spec_id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer32);
        int iSerializer34 = getQueryParameterslambda2.serializer();
        int iSerializer35 = getQueryParameterslambda2.serializer();
        linkedHashSet7.add(new hsvToRgbComponent("WorkSpec", "CASCADE", list9, "CASCADE", (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer35, 516583654, new Object[]{"id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer34)));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        int iSerializer36 = getQueryParameterslambda2.serializer();
        int iSerializer37 = getQueryParameterslambda2.serializer();
        List list10 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer37, 516583654, new Object[]{"work_spec_id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer36);
        int iSerializer38 = getQueryParameterslambda2.serializer();
        int iSerializer39 = getQueryParameterslambda2.serializer();
        linkedHashSet8.add(new hslToRgbComponent("index_WorkTag_work_spec_id", false, list10, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer39, 516583654, new Object[]{"ASC"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer38)));
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations8 = new getUnspecified0d7_KjUannotations("WorkTag", linkedHashMap8, linkedHashSet7, linkedHashSet8);
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite8 = getBlue0d7_KjU.write(tintxetnrds, "WorkTag");
        if (!getunspecified0d7_kjuannotations8.equals(getunspecified0d7_kjuannotationsWrite8)) {
            return new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", getunspecified0d7_kjuannotations8, "\n Found:\n", getunspecified0d7_kjuannotationsWrite8), false);
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("work_spec_id", new getBlack0d7_KjU("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap9.put("generation", new getBlack0d7_KjU("generation", "INTEGER", true, 2, "0", 1));
        linkedHashMap9.put("system_id", new getBlack0d7_KjU("system_id", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        int iSerializer40 = getQueryParameterslambda2.serializer();
        int iSerializer41 = getQueryParameterslambda2.serializer();
        List list11 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer41, 516583654, new Object[]{"work_spec_id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer40);
        int iSerializer42 = getQueryParameterslambda2.serializer();
        int iSerializer43 = getQueryParameterslambda2.serializer();
        linkedHashSet9.add(new hsvToRgbComponent("WorkSpec", "CASCADE", list11, "CASCADE", (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer43, 516583654, new Object[]{"id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer42)));
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations9 = new getUnspecified0d7_KjUannotations("SystemIdInfo", linkedHashMap9, linkedHashSet9, new LinkedHashSet());
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite9 = getBlue0d7_KjU.write(tintxetnrds, "SystemIdInfo");
        if (!getunspecified0d7_kjuannotations9.equals(getunspecified0d7_kjuannotationsWrite9)) {
            return new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", getunspecified0d7_kjuannotations9, "\n Found:\n", getunspecified0d7_kjuannotationsWrite9), false);
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("name", new getBlack0d7_KjU("name", "TEXT", true, 1, null, 1));
        linkedHashMap10.put("work_spec_id", new getBlack0d7_KjU("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        int iSerializer44 = getQueryParameterslambda2.serializer();
        int iSerializer45 = getQueryParameterslambda2.serializer();
        List list12 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer45, 516583654, new Object[]{"work_spec_id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer44);
        int iSerializer46 = getQueryParameterslambda2.serializer();
        int iSerializer47 = getQueryParameterslambda2.serializer();
        linkedHashSet10.add(new hsvToRgbComponent("WorkSpec", "CASCADE", list12, "CASCADE", (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer47, 516583654, new Object[]{"id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer46)));
        LinkedHashSet linkedHashSet11 = new LinkedHashSet();
        int iSerializer48 = getQueryParameterslambda2.serializer();
        int iSerializer49 = getQueryParameterslambda2.serializer();
        List list13 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer49, 516583654, new Object[]{"work_spec_id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer48);
        int iSerializer50 = getQueryParameterslambda2.serializer();
        int iSerializer51 = getQueryParameterslambda2.serializer();
        linkedHashSet11.add(new hslToRgbComponent("index_WorkName_work_spec_id", false, list13, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer51, 516583654, new Object[]{"ASC"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer50)));
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations10 = new getUnspecified0d7_KjUannotations("WorkName", linkedHashMap10, linkedHashSet10, linkedHashSet11);
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite10 = getBlue0d7_KjU.write(tintxetnrds, "WorkName");
        if (!getunspecified0d7_kjuannotations10.equals(getunspecified0d7_kjuannotationsWrite10)) {
            return new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", getunspecified0d7_kjuannotations10, "\n Found:\n", getunspecified0d7_kjuannotationsWrite10), false);
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("work_spec_id", new getBlack0d7_KjU("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap11.put("progress", new getBlack0d7_KjU("progress", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet12 = new LinkedHashSet();
        int iSerializer52 = getQueryParameterslambda2.serializer();
        int iSerializer53 = getQueryParameterslambda2.serializer();
        List list14 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer53, 516583654, new Object[]{"work_spec_id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer52);
        int iSerializer54 = getQueryParameterslambda2.serializer();
        int iSerializer55 = getQueryParameterslambda2.serializer();
        linkedHashSet12.add(new hsvToRgbComponent("WorkSpec", "CASCADE", list14, "CASCADE", (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer55, 516583654, new Object[]{"id"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer54)));
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations11 = new getUnspecified0d7_KjUannotations("WorkProgress", linkedHashMap11, linkedHashSet12, new LinkedHashSet());
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite11 = getBlue0d7_KjU.write(tintxetnrds, "WorkProgress");
        if (!getunspecified0d7_kjuannotations11.equals(getunspecified0d7_kjuannotationsWrite11)) {
            setDropDownVerticalOffset setdropdownverticaloffset2 = new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", getunspecified0d7_kjuannotations11, "\n Found:\n", getunspecified0d7_kjuannotationsWrite11), false);
            int i4 = RatingCompat + 81;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setdropdownverticaloffset2;
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("key", new getBlack0d7_KjU("key", "TEXT", true, 1, null, 1));
        linkedHashMap12.put("long_value", new getBlack0d7_KjU("long_value", "INTEGER", false, 0, null, 1));
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations12 = new getUnspecified0d7_KjUannotations("Preference", linkedHashMap12, new LinkedHashSet(), new LinkedHashSet());
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsWrite12 = getBlue0d7_KjU.write(tintxetnrds, "Preference");
        if (!getunspecified0d7_kjuannotations12.equals(getunspecified0d7_kjuannotationsWrite12)) {
            return new setDropDownVerticalOffset((Object) MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Preference(androidx.work.impl.model.Preference).\n Expected:\n", getunspecified0d7_kjuannotations12, "\n Found:\n", getunspecified0d7_kjuannotationsWrite12), false);
        }
        return new setDropDownVerticalOffset((Object) null, true);
    }

    @Override // o.getAndroidCanvasannotations
    public final void serializer(tintxETnrds tintxetnrds) {
        int iIconCompatParcelizer = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
        int iIconCompatParcelizer2 = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
        RemoteActionCompatParcelizer(400168958, iIconCompatParcelizer, new Object[]{this, tintxetnrds}, -400168958, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), iIconCompatParcelizer2);
    }

    private final setDropDownVerticalOffset MediaSessionCompatQueueItem(tintxETnrds tintxetnrds) {
        int iIconCompatParcelizer = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
        int iIconCompatParcelizer2 = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return (setDropDownVerticalOffset) RemoteActionCompatParcelizer(1473319677, iIconCompatParcelizer, new Object[]{this, tintxetnrds}, -1473319676, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), iIconCompatParcelizer2);
    }
}
