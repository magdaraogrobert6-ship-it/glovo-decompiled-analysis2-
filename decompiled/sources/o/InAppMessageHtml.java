package o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleFeedbackInternal;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleInternal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class InAppMessageHtml extends setInAppMessageDarkThemeWrapper<handleLogClick> {
    private static InAppMessageHtml write;

    @Override // o.setInAppMessageDarkThemeWrapper
    public final List<String> MediaSessionCompatQueueItem() {
        return Collections.singletonList("FOREIGN KEY(unique_id) REFERENCES transport_change(unique_id) ON DELETE CASCADE ON UPDATE RESTRICT");
    }

    @Override // o.setInAppMessageDarkThemeWrapper
    public final List<String> RatingCompat() {
        return Collections.singletonList("CREATE UNIQUE INDEX transport_metadata_unique_id_index on transport_metadata(unique_id)");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<handleLogClick> RemoteActionCompatParcelizer() {
        return handleLogClick.class;
    }

    @Override // o.setInAppMessageDarkThemeWrapper
    public final void IconCompatParcelizer(SQLiteDatabase sQLiteDatabase, int i) throws SQLException {
        if (i == 5) {
            sQLiteDatabase.execSQL(ParcelableVolumeInfo().RemoteActionCompatParcelizer());
        }
        if (i == 7) {
            sQLiteDatabase.execSQL("ALTER TABLE transport_metadata ADD COLUMN transport_waypoints BLOB;");
        }
        if (i == 14) {
            sQLiteDatabase.execSQL("ALTER TABLE transport_metadata ADD COLUMN transport_tags text;");
        }
        if (i == 16) {
            sQLiteDatabase.execSQL("ALTER TABLE transport_metadata ADD COLUMN occupant_role text;");
            sQLiteDatabase.execSQL("ALTER TABLE transport_metadata ADD COLUMN occupant_role_probability real;");
            sQLiteDatabase.execSQL("ALTER TABLE transport_metadata ADD COLUMN occupant_role_feedback text;");
            sQLiteDatabase.execSQL("UPDATE transport_metadata SET occupant_role = '" + OccupantRoleInternal.UNAVAILABLE.getValue() + "' WHERE occupant_role IS NULL;");
        }
        if (i == 18) {
            sQLiteDatabase.execSQL("ALTER TABLE transport_metadata ADD COLUMN occupant_role_threshold real;");
        }
        if (i == 20) {
            sQLiteDatabase.execSQL("UPDATE transport_metadata SET occupant_role_feedback = '" + OccupantRoleFeedbackInternal.UNSET.getValue() + "' WHERE occupant_role_feedback IS NULL;");
        }
        if (i == 22) {
            sQLiteDatabase.execSQL("ALTER TABLE transport_metadata ADD COLUMN wrong_way_driving_details BLOB;");
        }
        if (i == 23) {
            sQLiteDatabase.execSQL("ALTER TABLE transport_metadata ADD COLUMN did_evaluate_phone_usage integer;");
        }
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final String MediaDescriptionCompat() {
        return "transport_metadata";
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ee  */
    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        OccupantRoleInternal occupantRoleInternal;
        OccupantRoleFeedbackInternal occupantRoleFeedbackInternal;
        Boolean boolValueOf;
        String str = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read("");
        boolean zIsNull = cursor.isNull(cursor.getColumnIndexOrThrow(str.concat("transport_tags")));
        boolean zIsNull2 = cursor.isNull(cursor.getColumnIndexOrThrow(str.concat("occupant_role_probability")));
        boolean zIsNull3 = cursor.isNull(cursor.getColumnIndexOrThrow(str.concat("occupant_role_threshold")));
        String str2 = MediaSessionCompatQueueItem.read(str, "unique_id", cursor);
        int i = cursor.getInt(cursor.getColumnIndexOrThrow(str.concat("distance")));
        byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow(str.concat("transport_waypoints")));
        String str3 = !zIsNull ? MediaSessionCompatQueueItem.read(str, "transport_tags", cursor) : null;
        Double dValueOf = !zIsNull2 ? Double.valueOf(cursor.getDouble(cursor.getColumnIndexOrThrow(str.concat("occupant_role_probability")))) : null;
        OccupantRoleInternal occupantRoleInternal2 = OccupantRoleInternal.UNAVAILABLE;
        if (cursor.isNull(cursor.getColumnIndexOrThrow(str.concat("occupant_role")))) {
            occupantRoleInternal = occupantRoleInternal2;
        } else {
            String str4 = MediaSessionCompatQueueItem.read(str, "occupant_role", cursor);
            OccupantRoleInternal.Companion.getClass();
            str4.getClass();
            OccupantRoleInternal occupantRoleInternal3 = OccupantRoleInternal.DRIVER;
            if (!str4.equals(occupantRoleInternal3.getValue())) {
                occupantRoleInternal3 = OccupantRoleInternal.PASSENGER;
                if (!str4.equals(occupantRoleInternal3.getValue())) {
                    str4.equals(occupantRoleInternal2.getValue());
                    occupantRoleInternal = occupantRoleInternal2;
                }
            }
            occupantRoleInternal = occupantRoleInternal3;
        }
        OccupantRoleFeedbackInternal occupantRoleFeedbackInternal2 = OccupantRoleFeedbackInternal.UNSET;
        if (cursor.isNull(cursor.getColumnIndexOrThrow(str.concat("occupant_role_feedback")))) {
            occupantRoleFeedbackInternal = occupantRoleFeedbackInternal2;
        } else {
            String str5 = MediaSessionCompatQueueItem.read(str, "occupant_role_feedback", cursor);
            OccupantRoleFeedbackInternal.Companion.getClass();
            str5.getClass();
            OccupantRoleFeedbackInternal occupantRoleFeedbackInternal3 = OccupantRoleFeedbackInternal.DRIVER;
            if (!str5.equals(occupantRoleFeedbackInternal3.getValue())) {
                occupantRoleFeedbackInternal3 = OccupantRoleFeedbackInternal.PASSENGER;
                if (!str5.equals(occupantRoleFeedbackInternal3.getValue())) {
                    occupantRoleFeedbackInternal = occupantRoleFeedbackInternal2;
                }
            }
            occupantRoleFeedbackInternal = occupantRoleFeedbackInternal3;
        }
        Double dValueOf2 = !zIsNull3 ? Double.valueOf(cursor.getDouble(cursor.getColumnIndexOrThrow(str.concat("occupant_role_threshold")))) : null;
        byte[] blob2 = cursor.getBlob(cursor.getColumnIndexOrThrow(str.concat("wrong_way_driving_details")));
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str.concat("did_evaluate_phone_usage"));
        if (cursor.isNull(columnIndexOrThrow)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getInt(columnIndexOrThrow) > 0);
        }
        return new handleLogClick(str2, i, blob, str3, dValueOf, occupantRoleInternal, occupantRoleFeedbackInternal, dValueOf2, blob2, boolValueOf);
    }

    public static InAppMessageHtml MediaBrowserCompatMediaItem() {
        if (write == null) {
            write = new InAppMessageHtml();
        }
        return write;
    }

    @Override // o.setInAppMessageDarkThemeWrapper
    public final List<String> read() {
        return Arrays.asList("distance integer not null", "transport_waypoints BLOB", "transport_tags text", "occupant_role text", "occupant_role_probability real", "occupant_role_feedback text", "occupant_role_threshold real", "wrong_way_driving_details BLOB", "did_evaluate_phone_usage integer");
    }
}
