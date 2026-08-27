package o;

import android.database.Cursor;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class reflectiveQuadTo extends getBlack0d7_KjUannotations {
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ reflectiveQuadTo(int i, int i2, int i3) {
        super(i, i2);
        this.read = i3;
    }

    @Override // o.getBlack0d7_KjUannotations
    public final void write(UncheckedColor uncheckedColor) {
        int i = this.read;
        uncheckedColor.getClass();
        switch (i) {
            case 0:
                uncheckedColor.RemoteActionCompatParcelizer("CREATE INDEX IF NOT EXISTS index_tracking_perseus_events_priority_timestamp\nON tracking_perseus_events (priority, timestamp DESC);");
                break;
            case 1:
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN appBuildVersion TEXT DEFAULT \"\" NOT NULL");
                break;
            case 2:
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN payloadTimeStamp TEXT NOT NULL DEFAULT \"\"");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN country TEXT NOT NULL DEFAULT \"\"");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN advertisingId TEXT NOT NULL DEFAULT \"\"");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN appId TEXT NOT NULL DEFAULT \"\"");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN appName TEXT NOT NULL DEFAULT \"\"");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN appVersionCode TEXT NOT NULL DEFAULT \"\"");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN adjustId TEXT NOT NULL DEFAULT \"\"");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN userId TEXT NOT NULL DEFAULT \"\"");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN uaId TEXT NOT NULL DEFAULT \"\"");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN clientId TEXT NOT NULL DEFAULT \"\"");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN sessionId TEXT NOT NULL DEFAULT \"\"");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN sdkVersionName TEXT NOT NULL DEFAULT \"\"");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN globalEntityId TEXT");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN consent TEXT");
                break;
            case 3:
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN ecommerceItems TEXT DEFAULT \"[]\"");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN ecommerceComponents TEXT DEFAULT \"[]\"");
                break;
            case 4:
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN eventAction TEXT");
                break;
            case 5:
                Cursor cursorSerializer = uncheckedColor.serializer("pragma table_info(tracking_perseus_events)");
                ArrayList arrayList = new ArrayList();
                while (cursorSerializer.moveToNext()) {
                    String string = cursorSerializer.getString(cursorSerializer.getColumnIndex("name"));
                    string.getClass();
                    arrayList.add(string);
                }
                if (!arrayList.contains("firebaseInstanceId")) {
                    uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN firebaseInstanceId TEXT DEFAULT \"\"");
                }
                break;
            case 6:
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN sessionOffset INTEGER NOT NULL DEFAULT 0");
                break;
            case 7:
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN eventVariables TEXT NOT NULL DEFAULT \"{}\"");
                Cursor cursorSerializer2 = uncheckedColor.serializer("SELECT * FROM tracking_perseus_events");
                int columnIndex = cursorSerializer2.getColumnIndex("id");
                while (cursorSerializer2.moveToNext()) {
                    long j = cursorSerializer2.getLong(columnIndex);
                    Cursor cursorSerializer3 = uncheckedColor.serializer("SELECT * FROM HitEventValues WHERE timestampId=" + j + " order by id");
                    int columnIndex2 = cursorSerializer3.getColumnIndex("key");
                    int columnIndex3 = cursorSerializer3.getColumnIndex("value");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (cursorSerializer3.moveToNext()) {
                        linkedHashMap.put(cursorSerializer3.getString(columnIndex2), cursorSerializer3.getString(columnIndex3));
                    }
                    uncheckedColor.RemoteActionCompatParcelizer("UPDATE tracking_perseus_events SET eventVariables = '" + getArcStartX.RemoteActionCompatParcelizer(linkedHashMap) + "' WHERE id = " + j);
                }
                break;
            case 8:
                uncheckedColor.RemoteActionCompatParcelizer("CREATE TABLE IF NOT EXISTS `temp_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `payloadTimeStamp` TEXT NOT NULL, `country` TEXT NOT NULL, `advertisingId` TEXT NOT NULL, `appId` TEXT NOT NULL, `appName` TEXT NOT NULL, `appVersionCode` TEXT NOT NULL, `adjustId` TEXT NOT NULL, `userId` TEXT NOT NULL, `uaId` TEXT NOT NULL, `clientId` TEXT NOT NULL, `sessionId` TEXT NOT NULL, `sdkVersionName` TEXT NOT NULL, `globalEntityId` TEXT, `consent` TEXT, `sessionOffset` INTEGER NOT NULL)");
                uncheckedColor.RemoteActionCompatParcelizer("\n            INSERT INTO temp_table\n            (timestamp, payloadTimeStamp, country, advertisingId, appId, appName, appVersionCode, adjustId, userId, uaId, clientId, sessionId, sdkVersionName, globalEntityId, consent, sessionOffset)\n            SELECT timestamp, payloadTimeStamp, country, advertisingId, appId, appName, appVersionCode, adjustId, userId, uaId, clientId, sessionId, sdkVersionName, globalEntityId, consent, sessionOffset FROM tracking_perseus_events\n            ");
                uncheckedColor.RemoteActionCompatParcelizer("DROP TABLE tracking_perseus_events");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE `temp_table` RENAME TO tracking_perseus_events");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE HitEventValues ADD COLUMN `timestampId` INTEGER NOT NULL DEFAULT 0");
                Cursor cursorSerializer4 = uncheckedColor.serializer("SELECT timestamp, id FROM tracking_perseus_events");
                int columnIndex4 = cursorSerializer4.getColumnIndex("timestamp");
                int columnIndex5 = cursorSerializer4.getColumnIndex("id");
                while (cursorSerializer4.moveToNext()) {
                    long j2 = cursorSerializer4.getLong(columnIndex4);
                    StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(cursorSerializer4.getLong(columnIndex5), "UPDATE HitEventValues SET timestampId = ", " WHERE timestamp = ");
                    sbM.append(j2);
                    uncheckedColor.RemoteActionCompatParcelizer(sbM.toString());
                }
                break;
            case 9:
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN isDebug INTEGER DEFAULT 0 NOT NULL");
                break;
            case 10:
                Cursor cursorSerializer5 = uncheckedColor.serializer("pragma table_info(tracking_perseus_events)");
                ArrayList arrayList2 = new ArrayList();
                while (cursorSerializer5.moveToNext()) {
                    String string2 = cursorSerializer5.getString(cursorSerializer5.getColumnIndex("name"));
                    string2.getClass();
                    arrayList2.add(string2);
                }
                if (!arrayList2.contains(RemoteMessageConst.Notification.PRIORITY)) {
                    uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN priority INTEGER DEFAULT NULL");
                }
                uncheckedColor.RemoteActionCompatParcelizer("CREATE INDEX IF NOT EXISTS index_tracking_perseus_events_eventAction ON tracking_perseus_events(eventAction)");
                uncheckedColor.RemoteActionCompatParcelizer("CREATE INDEX IF NOT EXISTS index_tracking_perseus_events_eventAction_priority ON tracking_perseus_events(eventAction, priority)");
                uncheckedColor.RemoteActionCompatParcelizer("CREATE INDEX IF NOT EXISTS index_tracking_perseus_events_priority ON tracking_perseus_events(priority)");
                break;
            case 11:
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE tracking_perseus_events ADD COLUMN rechargeTo TEXT DEFAULT \"\"");
                break;
            default:
                uncheckedColor.RemoteActionCompatParcelizer("drop table IF EXISTS temp_table");
                uncheckedColor.RemoteActionCompatParcelizer(isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("\n            CREATE TABLE IF NOT EXISTS `temp_table` (\n                `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                `timestamp` INTEGER NOT NULL,\n                `payloadTimeStamp` TEXT NOT NULL,\n                `country` TEXT NOT NULL,\n                `advertisingId` TEXT,\n                `appId` TEXT NOT NULL,\n                `appName` TEXT NOT NULL,\n                `appVersionCode` TEXT NOT NULL,\n                `adjustId` TEXT,\n                `userId` TEXT NOT NULL,\n                `uaId` TEXT,\n                `clientId` TEXT NOT NULL,\n                `sessionId` TEXT NOT NULL,\n                `sdkVersionName` TEXT NOT NULL,\n                `globalEntityId` TEXT,\n                `consent` TEXT,\n                `sessionOffset` INTEGER NOT NULL,\n                `eventVariables` TEXT NOT NULL,\n                `ecommerceItems` TEXT,\n                `ecommerceComponents` TEXT,\n                `isDebug` INTEGER NOT NULL,\n                `eventAction` TEXT\n            )\n        "));
                uncheckedColor.RemoteActionCompatParcelizer(isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("\n            insert into temp_table\n            (\n                id,\n                timestamp,\n                payloadTimeStamp,\n                country,\n                advertisingId,\n                appId,\n                appName,\n                appVersionCode,\n                adjustId,\n                userId,\n                uaId,\n                clientId,\n                sessionId,\n                sdkVersionName,\n                globalEntityId,\n                consent,\n                sessionOffset,\n                eventVariables,\n                ecommerceItems,\n                ecommerceComponents,\n                isDebug,\n                eventAction\n            )\n            select * from tracking_perseus_events\n        "));
                uncheckedColor.RemoteActionCompatParcelizer("DROP TABLE tracking_perseus_events");
                uncheckedColor.RemoteActionCompatParcelizer("ALTER TABLE temp_table RENAME TO tracking_perseus_events");
                break;
        }
    }
}
