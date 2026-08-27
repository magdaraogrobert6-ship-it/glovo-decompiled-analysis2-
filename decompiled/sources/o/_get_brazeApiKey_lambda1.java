package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class _get_brazeApiKey_lambda1 {
    public final ArrayList IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final setTriggerActionMinimumTimeIntervalSeconds MediaMetadataCompat;
    public final setSessionTimeoutandroid_sdk_base_release MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public final int PlaybackStateCompat;
    public final setSessionTimeout RatingCompat;
    public final _get_applicationIconResourceId_lambda0 RemoteActionCompatParcelizer;
    public final r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE read;
    public final int serializer;
    public final r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw write;

    public final setShouldPersistWebViewWhenBackgroundingApp write(setSessionTimeout setsessiontimeout, r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw r8lambdat8fev0yhsugjmgcolxj0pkxlpw, _get_applicationIconResourceId_lambda0 _get_applicationiconresourceid_lambda0, r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve) {
        ArrayList arrayList = this.IconCompatParcelizer;
        int size = arrayList.size();
        int i = this.serializer;
        if (i >= size) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
            return null;
        }
        this.MediaSessionCompatResultReceiverWrapper++;
        _get_applicationIconResourceId_lambda0 _get_applicationiconresourceid_lambda1 = this.RemoteActionCompatParcelizer;
        if (_get_applicationiconresourceid_lambda1 != null && !this.read.RemoteActionCompatParcelizer(setsessiontimeout.write)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("network interceptor ", arrayList.get(i - 1), " must retain the same host and port");
            return null;
        }
        if (_get_applicationiconresourceid_lambda1 != null && this.MediaSessionCompatResultReceiverWrapper > 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("network interceptor ", arrayList.get(i - 1), " must call proceed() exactly once");
            return null;
        }
        int i2 = i + 1;
        _get_brazeApiKey_lambda1 _get_brazeapikey_lambda1 = new _get_brazeApiKey_lambda1(arrayList, r8lambdat8fev0yhsugjmgcolxj0pkxlpw, _get_applicationiconresourceid_lambda0, r8lambdaik1pft6kfq5yrxiftoy3aewpve, i2, setsessiontimeout, this.MediaSessionCompatQueueItem, this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, this.PlaybackStateCompat);
        isFirebaseMessagingServiceOnNewTokenRegistrationEnabled isfirebasemessagingserviceonnewtokenregistrationenabled = (isFirebaseMessagingServiceOnNewTokenRegistrationEnabled) arrayList.get(i);
        setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingappSerializer = isfirebasemessagingserviceonnewtokenregistrationenabled.serializer(_get_brazeapikey_lambda1);
        if (_get_applicationiconresourceid_lambda0 != null && i2 < arrayList.size() && _get_brazeapikey_lambda1.MediaSessionCompatResultReceiverWrapper != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("network interceptor ", isfirebasemessagingserviceonnewtokenregistrationenabled, " must call proceed() exactly once");
            return null;
        }
        if (setshouldpersistwebviewwhenbackgroundingappSerializer != null) {
            if (setshouldpersistwebviewwhenbackgroundingappSerializer.MediaBrowserCompatMediaItem != null) {
                return setshouldpersistwebviewwhenbackgroundingappSerializer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("interceptor ", isfirebasemessagingserviceonnewtokenregistrationenabled, " returned a response with no body");
            return null;
        }
        throw new NullPointerException("interceptor " + isfirebasemessagingserviceonnewtokenregistrationenabled + " returned null");
    }

    public _get_brazeApiKey_lambda1(ArrayList arrayList, r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw r8lambdat8fev0yhsugjmgcolxj0pkxlpw, _get_applicationIconResourceId_lambda0 _get_applicationiconresourceid_lambda0, r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve, int i, setSessionTimeout setsessiontimeout, setSessionTimeoutandroid_sdk_base_release setsessiontimeoutandroid_sdk_base_release, setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds, int i2, int i3, int i4) {
        this.IconCompatParcelizer = arrayList;
        this.read = r8lambdaik1pft6kfq5yrxiftoy3aewpve;
        this.write = r8lambdat8fev0yhsugjmgcolxj0pkxlpw;
        this.RemoteActionCompatParcelizer = _get_applicationiconresourceid_lambda0;
        this.serializer = i;
        this.RatingCompat = setsessiontimeout;
        this.MediaSessionCompatQueueItem = setsessiontimeoutandroid_sdk_base_release;
        this.MediaMetadataCompat = settriggeractionminimumtimeintervalseconds;
        this.MediaBrowserCompatMediaItem = i2;
        this.MediaDescriptionCompat = i3;
        this.PlaybackStateCompat = i4;
    }

    public final setShouldPersistWebViewWhenBackgroundingApp serializer(setSessionTimeout setsessiontimeout) {
        return write(setsessiontimeout, this.write, this.RemoteActionCompatParcelizer, this.read);
    }
}
