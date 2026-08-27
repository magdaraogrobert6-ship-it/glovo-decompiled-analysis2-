package o;

import android.location.Location;
import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes4.dex */
final class setLargeIcon extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ setInlineImagePush RemoteActionCompatParcelizer;

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        setInlineImagePush setinlineimagepush = this.RemoteActionCompatParcelizer;
        setinlineimagepush.IconCompatParcelizer.read(this);
        migrateTriggersReeligibilityToJsonlambda4 migratetriggersreeligibilitytojsonlambda4 = setinlineimagepush.MediaDescriptionCompat;
        setinlineimagepush.serializer.getClass();
        migratetriggersreeligibilitytojsonlambda4.IconCompatParcelizer(Long.valueOf(System.currentTimeMillis()));
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = setinlineimagepush.IconCompatParcelizer;
        byte bSerializer = setInlineImagePush.serializer(setinlineimagepush);
        setinlineimagepush.serializer.getClass();
        getanalyticsenabledenterannotations.serializer(setinlineimagepush.read.serializer((Location) obj, bSerializer, System.currentTimeMillis()));
        setinlineimagepush.serializer(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setLargeIcon(setInlineImagePush setinlineimagepush, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "HeartbeatTask");
        this.RemoteActionCompatParcelizer = setinlineimagepush;
    }
}
