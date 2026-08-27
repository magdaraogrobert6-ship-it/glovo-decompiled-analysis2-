package o;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteProgram;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.firestore.local.LocalDocumentsView;
import com.google.firebase.firestore.local.SQLiteTargetCache;
import com.mapbox.navigation.core.utils.Delayer;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes2.dex */
public final class headH91voCI extends getMinimumTouchTargetSizeNHjbRc {
    public final placeSelfApparentToRealOffsetMLgxB_4 IconCompatParcelizer;
    public boolean MediaDescriptionCompat;
    public final onCoordinatesUsedui MediaSessionCompatQueueItem;
    public final SQLiteTargetCache RatingCompat;
    public final OnGloballyPositionedModifierDefaultImpls RemoteActionCompatParcelizer;
    public final LocalDocumentsView read;
    public SQLiteDatabase serializer;
    public final getForceMeasureWithLookaheadConstraintsui write;

    public static void write(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                sQLiteProgram.bindNull(i + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteProgram.bindLong(i + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteProgram.bindLong(i + 1, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                sQLiteProgram.bindDouble(i + 1, ((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof byte[])) {
                    getRectManager.write("Unknown argument %s of type %s", obj, obj.getClass());
                    throw null;
                }
                sQLiteProgram.bindBlob(i + 1, (byte[]) obj);
            }
        }
    }

    @Override // o.getMinimumTouchTargetSizeNHjbRc
    public final SQLiteTargetCache IconCompatParcelizer() {
        return this.RatingCompat;
    }

    @Override // o.getMinimumTouchTargetSizeNHjbRc
    public final boolean read() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.getMinimumTouchTargetSizeNHjbRc
    public final LocalDocumentsView serializer() {
        return this.read;
    }

    @Override // o.getMinimumTouchTargetSizeNHjbRc
    public final OnGloballyPositionedModifierDefaultImpls write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(String str, Object... objArr) {
        this.serializer.execSQL(str, objArr);
    }

    @Override // o.getMinimumTouchTargetSizeNHjbRc
    public final com.huawei.wisesecurity.ucs_credential.x RemoteActionCompatParcelizer(setOffset setoffset) {
        return new com.huawei.wisesecurity.ucs_credential.x(this, this.write, setoffset);
    }

    @Override // o.getMinimumTouchTargetSizeNHjbRc
    public final getLastLayerDrawingWasSkippedui RemoteActionCompatParcelizer() {
        return new getLastLayerDrawingWasSkippedui(this);
    }

    public final com.huawei.wisesecurity.ucs_credential.x read(String str) {
        return new com.huawei.wisesecurity.ucs_credential.x(this.serializer, 4, str);
    }

    @Override // o.getMinimumTouchTargetSizeNHjbRc
    public final onLayoutModifierNodeChanged serializer(setOffset setoffset) {
        return new onLayoutModifierNodeChanged(this, this.write, setoffset);
    }

    @Override // o.getMinimumTouchTargetSizeNHjbRc
    public final androidx.recyclerview.widget.ChildHelper write(setOffset setoffset, onLayoutModifierNodeChanged onlayoutmodifiernodechanged) {
        return new androidx.recyclerview.widget.ChildHelper(this, this.write, setoffset);
    }

    @Override // o.getMinimumTouchTargetSizeNHjbRc
    public final Object write(String str, onRequestMeasure onrequestmeasure) {
        onEndApplyChanges.read("Persistence", "Starting transaction: %s", str);
        this.serializer.beginTransactionWithListener(this.MediaSessionCompatQueueItem);
        try {
            Object objWrite = onrequestmeasure.write();
            this.serializer.setTransactionSuccessful();
            return objWrite;
        } finally {
            this.serializer.endTransaction();
        }
    }

    @Override // o.getMinimumTouchTargetSizeNHjbRc
    public final void MediaSessionCompatQueueItem() {
        int i = 0;
        boolean z = true;
        getRectManager.RemoteActionCompatParcelizer(!this.MediaDescriptionCompat, "SQLitePersistence double-started!", new Object[0]);
        this.MediaDescriptionCompat = true;
        try {
            this.serializer = this.IconCompatParcelizer.getWritableDatabase();
            SQLiteTargetCache sQLiteTargetCache = this.RatingCompat;
            com.huawei.wisesecurity.ucs_credential.x xVar = sQLiteTargetCache.write.read("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1");
            setForcePlaceWithLookaheadOffsetui setforceplacewithlookaheadoffsetui = new setForcePlaceWithLookaheadOffsetui(i, sQLiteTargetCache);
            Cursor cursorIconCompatParcelizer = xVar.IconCompatParcelizer();
            try {
                if (cursorIconCompatParcelizer.moveToFirst()) {
                    setforceplacewithlookaheadoffsetui.IconCompatParcelizer(cursorIconCompatParcelizer);
                    cursorIconCompatParcelizer.close();
                } else {
                    cursorIconCompatParcelizer.close();
                    z = false;
                }
                getRectManager.RemoteActionCompatParcelizer(z, "Missing target_globals entry", new Object[0]);
                long j = sQLiteTargetCache.IconCompatParcelizer;
                OnGloballyPositionedModifierDefaultImpls onGloballyPositionedModifierDefaultImpls = this.RemoteActionCompatParcelizer;
                onGloballyPositionedModifierDefaultImpls.getClass();
                Delayer delayer = new Delayer(0);
                delayer.delayRemaining = j;
                onGloballyPositionedModifierDefaultImpls.IconCompatParcelizer = delayer;
            } catch (Throwable th) {
                if (cursorIconCompatParcelizer != null) {
                    try {
                        cursorIconCompatParcelizer.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteDatabaseLockedException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e);
        }
    }

    public headH91voCI(Context context, String str, visitNodesaLcG6gQ visitnodesalcg6gq, getForceMeasureWithLookaheadConstraintsui getforcemeasurewithlookaheadconstraintsui, com.huawei.hmf.tasks.a.j jVar) {
        try {
            placeSelfApparentToRealOffsetMLgxB_4 placeselfapparenttorealoffsetmlgxb_4 = new placeSelfApparentToRealOffsetMLgxB_4(context, getforcemeasurewithlookaheadconstraintsui, "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(visitnodesalcg6gq.write, "utf-8") + "." + URLEncoder.encode(visitnodesalcg6gq.serializer, "utf-8"));
            this.MediaSessionCompatQueueItem = new onCoordinatesUsedui(this);
            this.IconCompatParcelizer = placeselfapparenttorealoffsetmlgxb_4;
            this.write = getforcemeasurewithlookaheadconstraintsui;
            this.RatingCompat = new SQLiteTargetCache(this, getforcemeasurewithlookaheadconstraintsui);
            this.read = new LocalDocumentsView(this, getforcemeasurewithlookaheadconstraintsui);
            OnGloballyPositionedModifierDefaultImpls onGloballyPositionedModifierDefaultImpls = new OnGloballyPositionedModifierDefaultImpls();
            onGloballyPositionedModifierDefaultImpls.RemoteActionCompatParcelizer = -1L;
            onGloballyPositionedModifierDefaultImpls.read = this;
            onGloballyPositionedModifierDefaultImpls.write = new getLastLayerDrawingWasSkippedui(onGloballyPositionedModifierDefaultImpls, jVar);
            this.RemoteActionCompatParcelizer = onGloballyPositionedModifierDefaultImpls;
        } catch (UnsupportedEncodingException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            throw null;
        }
    }

    @Override // o.getMinimumTouchTargetSizeNHjbRc
    public final void read(Runnable runnable, String str) {
        onEndApplyChanges.read("Persistence", "Starting transaction: %s", str);
        this.serializer.beginTransactionWithListener(this.MediaSessionCompatQueueItem);
        try {
            runnable.run();
            this.serializer.setTransactionSuccessful();
        } finally {
            this.serializer.endTransaction();
        }
    }
}
