package o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "SafetyScoresMetadataTable")
public class logImpressionlambda3 extends setInAppMessageDarkThemeWrapper<r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ> {
    private static logImpressionlambda3 RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;

    @Override // o.setInAppMessageDarkThemeWrapper
    public final List<String> RatingCompat() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final String MediaDescriptionCompat() {
        return "safety_scores";
    }

    @Override // o.setInAppMessageDarkThemeWrapper
    public final List<String> MediaSessionCompatQueueItem() {
        return Collections.singletonList("FOREIGN KEY(unique_id) REFERENCES transport_change(unique_id) ON DELETE CASCADE ON UPDATE RESTRICT");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ> RemoteActionCompatParcelizer() {
        return r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ.class;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        String str = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read("");
        String str2 = MediaSessionCompatQueueItem.read(str, "type", cursor);
        SafetyScoreType safetyScoreTypeOf = SafetyScoreType.of(str2);
        if (safetyScoreTypeOf != null) {
            return new r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ(MediaSessionCompatQueueItem.read(str, "unique_id", cursor), safetyScoreTypeOf, cursor.getDouble(cursor.getColumnIndexOrThrow(str.concat("value"))));
        }
        this.read.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Unknown SafetyScoreType: ", str2), new Object[0]);
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Unknown SafetyScoreType: ", str2));
        return null;
    }

    public logImpressionlambda3(parseLonglambda0 parselonglambda0) {
        this.read = parselonglambda0;
    }

    @Override // o.setInAppMessageDarkThemeWrapper
    public final void IconCompatParcelizer(SQLiteDatabase sQLiteDatabase, int i) throws SQLException {
        if (i == 9) {
            sQLiteDatabase.execSQL(ParcelableVolumeInfo().RemoteActionCompatParcelizer());
            return;
        }
        if (i == 10) {
            sQLiteDatabase.beginTransactionNonExclusive();
            try {
                try {
                    sQLiteDatabase.execSQL("ALTER TABLE safety_scores RENAME TO safety_scores_old;");
                    sQLiteDatabase.execSQL(ParcelableVolumeInfo().RemoteActionCompatParcelizer());
                    sQLiteDatabase.execSQL("INSERT INTO safety_scores (unique_id,type,value) SELECT unique_id,type,value FROM safety_scores_old;");
                    sQLiteDatabase.execSQL("DROP TABLE safety_scores_old;");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Exception e) {
                    this.read.IconCompatParcelizer(false, e, "Failed to migrate table: safety_scores", new Object[0]);
                }
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
    }

    @Override // o.setInAppMessageDarkThemeWrapper
    public final List<String> read() {
        return Arrays.asList("type string", "value real");
    }

    public static logImpressionlambda3 MediaBrowserCompatMediaItem() {
        if (RemoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer = new logImpressionlambda3((parseLonglambda0) setPushUniqueId.read(parseLonglambda0.class, logImpressionlambda3.class));
        }
        return RemoteActionCompatParcelizer;
    }
}
