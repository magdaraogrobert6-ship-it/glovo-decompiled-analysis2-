package o;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class toPixelMapdefault extends getBlack0d7_KjUannotations {
    public final Context read;
    public final /* synthetic */ int write = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toPixelMapdefault(Context context) {
        super(9, 10);
        context.getClass();
        this.read = context;
    }

    @Override // o.getBlack0d7_KjUannotations
    public final void write(UncheckedColor uncheckedColor) {
        int i = this.write;
        Context context = this.read;
        uncheckedColor.getClass();
        if (i != 0) {
            if (this.serializer >= 10) {
                uncheckedColor.read(new Object[]{"reschedule_needed", 1});
                return;
            } else {
                context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                return;
            }
        }
        uncheckedColor.RemoteActionCompatParcelizer("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            uncheckedColor.serializer();
            try {
                uncheckedColor.read(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                uncheckedColor.read(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                uncheckedColor.MediaSessionCompatResultReceiverWrapper();
                uncheckedColor.MediaMetadataCompat();
            } catch (Throwable th) {
                uncheckedColor.MediaMetadataCompat();
                throw th;
            }
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            uncheckedColor.serializer();
            try {
                uncheckedColor.read(new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                uncheckedColor.read(new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                sharedPreferences2.edit().clear().apply();
                uncheckedColor.MediaSessionCompatResultReceiverWrapper();
            } finally {
                uncheckedColor.MediaMetadataCompat();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toPixelMapdefault(Context context, int i, int i2) {
        super(i, i2);
        context.getClass();
        this.read = context;
    }
}
