package o;

import io.sentry.JsonObjectSerializer;
import io.sentry.SentryClient;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE extends getCacheFileSuffix {
    public static final RegistryMissingComponentException MediaBrowserCompatMediaItem = new RegistryMissingComponentException();
    public final String ComponentActivity;
    public final String MediaDescriptionCompat;
    public final getPrettyPrintedStringlambda0 MediaMetadataCompat;
    public final JsonObjectSerializer MediaSessionCompatResultReceiverWrapper;
    public final r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 MediaSessionCompatToken;
    public final r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4 ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public final SentryClient PlaybackStateCompatCustomAction;

    public r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE(SentryClient sentryClient, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa, parseProperties parseproperties, r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu, r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcek, Object obj, int i, int i2, String str, String str2, r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 r8lambdamwysina6epuugeuvjtl8aepfjn0, logPurchaseWithJSONlambda0 logpurchasewithjsonlambda0, mergeJsonObjectslambda10 mergejsonobjectslambda10) {
        super(new AndroidUiFrameClock(), r8lambdamwysina6epuugeuvjtl8aepfjn0, logpurchasewithjsonlambda0, r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergejsonobjectslambda10, false);
        this.MediaSessionCompatResultReceiverWrapper = new JsonObjectSerializer(9, this);
        this.PlaybackStateCompat = false;
        this.MediaSessionCompatToken = r8lambdamwysina6epuugeuvjtl8aepfjn0;
        this.PlaybackStateCompatCustomAction = sentryClient;
        this.MediaDescriptionCompat = str;
        this.ComponentActivity = str2;
        this.MediaMetadataCompat = r8lambda1dlenebwpksdsvf_xikspxtdeu.IconCompatParcelizer;
        Object obj2 = sentryClient.MediaBrowserCompatMediaItem;
        this.ParcelableVolumeInfo = new r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4(this, i, r8lambdamwysina6epuugeuvjtl8aepfjn0, obj, parseproperties, r8lambdau31fnmctqqics3i75jr9dkzcek, r8lambda1dlenebwpksdsvf_xikspxtdeu, i2);
    }
}
