package androidx.camera.core.impl.utils.futures;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.huawei.location.Vw$Vw;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.ResourceLoadResultCallback;
import com.mapbox.navigation.ui.utils.internal.resource.DefaultResourceLoader;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.Crossfade;
import o.DrawModifierNodeKt;
import o.OuterPlacementScope;
import o.VideoQualityQuirk;
import o.accessgetHcp;
import o.accessgetMediaEjectcp;
import o.obtainGraphicsLayer;
import o.obtainShadowContext;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Futures$$ExternalSyntheticLambda3 implements obtainShadowContext, accessgetMediaEjectcp, OuterPlacementScope, ResourceLoadResultCallback {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ Futures$$ExternalSyntheticLambda3(Object obj, long j, Object obj2, int i) {
        this.read = i;
        this.write = obj;
        this.serializer = j;
        this.IconCompatParcelizer = obj2;
    }

    @Override // o.accessgetMediaEjectcp
    public Object apply(Object obj) {
        String str = (String) this.write;
        accessgetHcp accessgethcp = (accessgetHcp) this.IconCompatParcelizer;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(accessgethcp.getNumber())});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.serializer;
            if (z) {
                sQLiteDatabase.execSQL(m1$$ExternalSyntheticOutline0.m(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(accessgethcp.getNumber())});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(accessgethcp.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // com.mapbox.common.ResourceLoadResultCallback
    public void run(Expected expected) {
        DefaultResourceLoader defaultResourceLoader = (DefaultResourceLoader) this.write;
        Vw$Vw vw$Vw = (Vw$Vw) this.IconCompatParcelizer;
        defaultResourceLoader.getClass();
        expected.getClass();
        defaultResourceLoader.cancelableMap.remove(Long.valueOf(this.serializer));
        vw$Vw.run(expected);
    }

    @Override // o.OuterPlacementScope
    public Object then(Task task) {
        return ((ConfigFetchHandler) this.write).RemoteActionCompatParcelizer(task, this.serializer, (HashMap) this.IconCompatParcelizer);
    }

    @Override // o.obtainShadowContext
    public Object serializer(final onDrawWithContent ondrawwithcontent) {
        int i = this.read;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        final long j = this.serializer;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.write;
        if (i == 0) {
            final DrawModifierNodeKt drawModifierNodeKt = (DrawModifierNodeKt) obj2;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) obj;
            VideoQualityQuirk.write(drawModifierNodeKt, ondrawwithcontent);
            if (!drawModifierNodeKt.isDone()) {
                final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: o.CodecUtil
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(ondrawwithcontent.serializer(new TimeoutException("Future[" + drawModifierNodeKt + "] is not done within " + j + " ms.")));
                    }
                }, j, timeUnit);
                final int i2 = 0;
                drawModifierNodeKt.RemoteActionCompatParcelizer(new Runnable() { // from class: o.EncoderImpl
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        ScheduledFuture scheduledFuture = scheduledFutureSchedule;
                        if (i3 != 0) {
                            scheduledFuture.cancel(true);
                        } else {
                            scheduledFuture.cancel(true);
                        }
                    }
                }, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
            }
            return "TimeoutFuture[" + drawModifierNodeKt + "]";
        }
        onDrawBehind ondrawbehind = (onDrawBehind) obj2;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) obj;
        VideoQualityQuirk.write(ondrawbehind, ondrawwithcontent);
        obtainGraphicsLayer obtaingraphicslayer = ondrawbehind.serializer;
        if (!obtaingraphicslayer.isDone()) {
            final ScheduledFuture<?> scheduledFutureSchedule2 = scheduledExecutorService2.schedule(new Crossfade(ondrawwithcontent, 4, ondrawbehind), j, timeUnit);
            final int i3 = 1;
            obtaingraphicslayer.RemoteActionCompatParcelizer(new Runnable() { // from class: o.EncoderImpl
                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    ScheduledFuture scheduledFuture = scheduledFutureSchedule2;
                    if (i4 != 0) {
                        scheduledFuture.cancel(true);
                    } else {
                        scheduledFuture.cancel(true);
                    }
                }
            }, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        }
        return "TimeoutFuture[" + ondrawbehind + "]";
    }

    public /* synthetic */ Futures$$ExternalSyntheticLambda3(Object obj, Object obj2, long j, int i) {
        this.read = i;
        this.write = obj;
        this.IconCompatParcelizer = obj2;
        this.serializer = j;
    }
}
