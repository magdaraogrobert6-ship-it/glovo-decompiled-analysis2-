package o;

import androidx.datastore.core.SingleProcessDataStore$file$2;
import bo.app.d$$ExternalSyntheticOutline0;
import fwfd.com.fwfsdk.constant.FWFConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class accesssetDrawInvalidation implements getDrawInvalidation {
    public final isAdapterPositionOnScreen read = new isAdapterPositionOnScreen(new SingleProcessDataStore$file$2(6, this));
    public final invalidateChildInParent serializer;

    public accesssetDrawInvalidation(createDropShadowPainter createdropshadowpainter, invalidateChildInParent invalidatechildinparent) {
        this.serializer = invalidatechildinparent;
    }

    public final com.deliveryhero.customerchat.analytics.model.EventCreationRequest write(String str, validateSizeN5eqBDc validatesizen5eqbdc, setDrawInvalidation setdrawinvalidation) {
        String str2 = validatesizen5eqbdc.read();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String str3 = simpleDateFormat.format(new Date());
        str3.getClass();
        com.deliveryhero.customerchat.analytics.model.Order order = new com.deliveryhero.customerchat.analytics.model.Order(validatesizen5eqbdc.write(), null, 2, null);
        com.deliveryhero.customerchat.analytics.model.Contact contactRemoteActionCompatParcelizer = io.sentry.android.core.internal.util.ParcelableVolumeInfo.RemoteActionCompatParcelizer(validatesizen5eqbdc);
        isAdapterPositionOnScreen isadapterpositiononscreen = this.read;
        com.deliveryhero.customerchat.analytics.model.User userIconCompatParcelizer = io.sentry.android.core.internal.util.ParcelableVolumeInfo.IconCompatParcelizer(validatesizen5eqbdc, (applyAlpha) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper());
        Map<String, String> details = userIconCompatParcelizer.getDetails();
        com.deliveryhero.customerchat.analytics.model.User userCopy$default = com.deliveryhero.customerchat.analytics.model.User.copy$default(userIconCompatParcelizer, null, details != null ? onMove.serializer(details, new onViewAttachedToWindowlambda0("source", "native_wrapper")) : null, 1, null);
        com.deliveryhero.customerchat.analytics.model.Product product = io.sentry.android.core.internal.util.ParcelableVolumeInfo.read((applyAlpha) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper());
        String strM = d$$ExternalSyntheticOutline0.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("event_version", "1");
        if (setdrawinvalidation != null) {
            linkedHashMap.put(FWFConstants.EXPLANATION_TYPE_ERROR, setdrawinvalidation.read());
        }
        return new com.deliveryhero.customerchat.analytics.model.EventCreationRequest(str2, str3, new com.deliveryhero.customerchat.analytics.model.Event(strM, str, linkedHashMap), product, userCopy$default, order, contactRemoteActionCompatParcelizer, null, null, 384, null);
    }
}
