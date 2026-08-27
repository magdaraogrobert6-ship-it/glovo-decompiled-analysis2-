package o;

import android.content.SharedPreferences;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.IllformedLocaleException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class roundDownToMultipleOf8 {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final SharedPreferences RemoteActionCompatParcelizer;
    public final transferSessionPackageI serializer;
    public final setTransactionSuccessful write;

    public roundDownToMultipleOf8(publishError publisherror, String str, SharedPreferences sharedPreferences, setTransactionSuccessful settransactionsuccessful, transferSessionPackageI transfersessionpackagei) {
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = sharedPreferences;
        this.write = settransactionsuccessful;
        this.serializer = transfersessionpackagei;
    }

    public final String IconCompatParcelizer() {
        java.util.Locale.Builder locale;
        int i = 2 % 2;
        int i2 = read + 87;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setTransactionSuccessful settransactionsuccessful = this.write;
        String string = this.RemoteActionCompatParcelizer.getString(this.IconCompatParcelizer, (String) onContentCardDismissed.MediaMetadataCompat(((FirebaseRemoteConfigImpl) this.serializer).RemoteActionCompatParcelizer()));
        if (string == null) {
            string = "";
        }
        try {
            locale = new java.util.Locale.Builder().setLanguageTag(string);
            String country = locale.build().getCountry();
            country.getClass();
            if (country.length() == 0) {
                locale.setRegion(settransactionsuccessful.read().getCountry());
            }
        } catch (IllformedLocaleException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to parse customer chat preferred language from ".concat(string), new Object[0]);
            locale = new java.util.Locale.Builder().setLocale(settransactionsuccessful.read());
        }
        String languageTag = locale.setScript(null).build().toLanguageTag();
        languageTag.getClass();
        int i4 = MediaMetadataCompat + 17;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return languageTag;
    }
}
