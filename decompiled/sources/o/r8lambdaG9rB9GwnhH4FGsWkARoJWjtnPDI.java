package o;

import com.roadrunner.settings.SettingsViewModel;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.N$b;
import io.grpc.internal.SharedResourcePool;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaG9rB9GwnhH4FGsWkARoJWjtnPDI implements getColorIntegerOrNulllambda0 {
    private static int ComponentActivity = 0;
    private static int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 1;
    public final r8lambda4qmPbs3swzMG_sQ6Wvv9rB3jZw IconCompatParcelizer;
    public final setSdkAuthenticationSignature MediaBrowserCompatMediaItem;
    public final r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 MediaDescriptionCompat;
    public final r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 MediaMetadataCompat;
    public final mergeJsonObjects MediaSessionCompatQueueItem;
    public final setSdkAuthenticationSignature MediaSessionCompatResultReceiverWrapper;
    public final mergeJsonObjects MediaSessionCompatToken;
    public final mergeJsonObjects ParcelableVolumeInfo;
    public final isHiddenannotations PlaybackStateCompat;
    public final mergeJsonObjects PlaybackStateCompatCustomAction;
    public final mergeJsonObjects RatingCompat;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects ResultReceiver;
    public final mergeJsonObjects r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final mergeJsonObjects r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final mergeJsonObjects write;

    public r8lambdaG9rB9GwnhH4FGsWkARoJWjtnPDI(mergeJsonObjects mergejsonobjects, setSdkAuthenticationSignature setsdkauthenticationsignature, r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv8, r8lambda4qmPbs3swzMG_sQ6Wvv9rB3jZw r8lambda4qmpbs3swzmg_sq6wvv9rb3jzw, isHiddenannotations ishiddenannotations, invokeqtAw6s invokeqtaw6s, mergeJsonObjects mergejsonobjects2, r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv9, r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv10, getContentDataType getcontentdatatype, PreferenceGroupAdapter preferenceGroupAdapter, mergeJsonObjects mergejsonobjects3, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, setSdkAuthenticationSignature setsdkauthenticationsignature2, r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv11, setStateDescription setstatedescription, mergeJsonObjects mergejsonobjects4, mergeJsonObjects mergejsonobjects5, getDoubleOrNull getdoubleornull) {
        this.ParcelableVolumeInfo = mergejsonobjects;
        this.MediaSessionCompatResultReceiverWrapper = setsdkauthenticationsignature;
        this.MediaSessionCompatQueueItem = r8lambdahmuf48geqgedwlhl7mczo1q1bv8;
        this.IconCompatParcelizer = r8lambda4qmpbs3swzmg_sq6wvv9rb3jzw;
        this.PlaybackStateCompat = ishiddenannotations;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = invokeqtaw6s;
        this.RatingCompat = mergejsonobjects2;
        this.MediaMetadataCompat = r8lambdahmuf48geqgedwlhl7mczo1q1bv9;
        this.MediaDescriptionCompat = r8lambdahmuf48geqgedwlhl7mczo1q1bv10;
        this.write = getcontentdatatype;
        this.RemoteActionCompatParcelizer = preferenceGroupAdapter;
        this.MediaSessionCompatToken = mergejsonobjects3;
        this.PlaybackStateCompatCustomAction = semanticsPropertiesLinkTestMarker1;
        this.MediaBrowserCompatMediaItem = setsdkauthenticationsignature2;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambdahmuf48geqgedwlhl7mczo1q1bv11;
        this.read = setstatedescription;
        this.serializer = mergejsonobjects4;
        this.ResultReceiver = mergejsonobjects5;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getdoubleornull;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        SettingsViewModel settingsViewModel = new SettingsViewModel((setTransactionSuccessful) this.ParcelableVolumeInfo.write(), (subscribeToBannersDismissedEventandroid_sdk_base_release) this.MediaSessionCompatResultReceiverWrapper.write(), (r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds) this.MediaSessionCompatQueueItem.write(), (r8lambda5_PQMw30AYpvgDY5yFJI1wIvaeg) this.IconCompatParcelizer.write(), (N$b) this.PlaybackStateCompat.write(), (SemanticsPropertyKey) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write(), (r8lambdadaazyEDDzwnij76sC1FsKvBpnqQ) this.RatingCompat.write(), new SharedResourcePool(24), (r8lambdad3KDFaViDQCaterPKviUURECBdQ) this.MediaMetadataCompat.write(), (C$b) this.MediaDescriptionCompat.write(), (accessgetOldDependencyp) this.write.write(), (disable) this.RemoteActionCompatParcelizer.write(), (getInstallBeginTimeInSeconds) this.MediaSessionCompatToken.write(), (isSensitiveData) this.PlaybackStateCompatCustomAction.write(), (FormBody.Builder) this.MediaBrowserCompatMediaItem.write(), (r8lambdaGjDZxd7jQZoBcNzNhpVRngZ6jXY) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(), (textEntryKey) this.read.write(), (transferSessionPackageI) this.serializer.write(), (r8lambdaeEn0GUG5cGviZ6WG1OS4uJPKt0) this.ResultReceiver.write(), (r8lambdaQOx6sXjdIhzywvIPc1cbblE4PLg) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write());
        int i2 = ComponentActivity + 85;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return settingsViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
