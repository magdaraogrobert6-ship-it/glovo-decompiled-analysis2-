package o;

import com.sentiance.sdk.events.EventUploadResult;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class copyandroid_sdk_base_releasedefault extends r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE {
    private final _init_lambda00 read;
    final /* synthetic */ forJsonPutlambda0 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copyandroid_sdk_base_releasedefault(forJsonPutlambda0 forjsonputlambda0, _init_lambda00 _init_lambda00Var) {
        super(forjsonputlambda0.MediaBrowserCompatMediaItem);
        this.serializer = forjsonputlambda0;
        this.read = _init_lambda00Var;
    }

    @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
    public final void IconCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        forJsonPutlambda0 forjsonputlambda0 = this.serializer;
        forjsonputlambda0.MediaSessionCompatQueueItem.write();
        forjsonputlambda0.read(EventUploadResult.ResultType.FAILURE_OTHER);
        forjsonputlambda0.MediaDescriptionCompat.IconCompatParcelizer();
    }

    @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
    public final void write(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) {
        forJsonPutlambda0 forjsonputlambda0 = this.serializer;
        forjsonputlambda0.MediaSessionCompatQueueItem.write();
        boolean z = setshouldpersistwebviewwhenbackgroundingapp.write() && setshouldpersistwebviewwhenbackgroundingapp.RatingCompat.write().contains("_rs");
        _init_lambda00 _init_lambda00Var = this.read;
        ArrayList arrayListSerializer = _init_lambda00Var.serializer();
        if (z) {
            forjsonputlambda0.ParcelableVolumeInfo = arrayListSerializer.size();
            getCooldownEnterSeconds getcooldownenterseconds = forjsonputlambda0.write;
            getcooldownenterseconds.getClass();
            if (!arrayListSerializer.isEmpty()) {
                getcooldownenterseconds.serializer(new equivalentServerData(1, arrayListSerializer));
            }
        } else {
            forjsonputlambda0.RatingCompat.IconCompatParcelizer("Upload failed: %s %s", Integer.valueOf(setshouldpersistwebviewwhenbackgroundingapp.serializer), setshouldpersistwebviewwhenbackgroundingapp.read);
        }
        if (!z) {
            forjsonputlambda0.read(EventUploadResult.ResultType.FAILURE_OTHER);
        } else if (_init_lambda00Var.hasNext()) {
            forjsonputlambda0.IconCompatParcelizer(_init_lambda00Var);
        } else {
            forjsonputlambda0.read(EventUploadResult.ResultType.SUCCESS);
        }
        forjsonputlambda0.MediaDescriptionCompat.IconCompatParcelizer();
    }

    @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
    public final void IconCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, IOException iOException) {
        forJsonPutlambda0 forjsonputlambda0 = this.serializer;
        forjsonputlambda0.MediaSessionCompatQueueItem.write();
        forjsonputlambda0.RatingCompat.IconCompatParcelizer(false, iOException, "Unexpected IOException while handling event upload response", new Object[0]);
        forjsonputlambda0.read(EventUploadResult.ResultType.FAILURE_OTHER);
        forjsonputlambda0.MediaDescriptionCompat.IconCompatParcelizer();
    }
}
