package o;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class QueryResultCompanion {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final PhoneNumberUtil RemoteActionCompatParcelizer;
    public final boundingRectInRoot read;
    public final transferSessionPackageI write;

    public QueryResultCompanion(transferSessionPackageI transfersessionpackagei, boundingRectInRoot boundingrectinroot, PhoneNumberUtil phoneNumberUtil) {
        this.write = transfersessionpackagei;
        this.read = boundingrectinroot;
        this.RemoteActionCompatParcelizer = phoneNumberUtil;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0062  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[EXC_TOP_SPLITTER, PHI: r1
  0x0042: PHI (r1v8 java.lang.String) = (r1v7 java.lang.String), (r1v15 java.lang.String) binds: [B:8:0x0040, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public final String RemoteActionCompatParcelizer() {
        String upperCase;
        String str;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 77;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            upperCase = this.read.write().countryIsoCode.toUpperCase(java.util.Locale.ROOT);
            upperCase.getClass();
            int i4 = 97 / 0;
            if (upperCase.length() > 0) {
                try {
                    str = "+" + this.RemoteActionCompatParcelizer.IconCompatParcelizer(upperCase);
                    i = IconCompatParcelizer + 55;
                    serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        return str;
                    }
                    throw null;
                } catch (IllegalArgumentException e) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Couldn't fetch the CountryCode prefix from the phoneNumberUtil ", e.getMessage()), new Object[0]);
                }
            }
        } else {
            upperCase = this.read.write().countryIsoCode.toUpperCase(java.util.Locale.ROOT);
            upperCase.getClass();
            if (upperCase.length() > 0) {
                str = "+" + this.RemoteActionCompatParcelizer.IconCompatParcelizer(upperCase);
                i = IconCompatParcelizer + 55;
                serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    return str;
                }
                throw null;
            }
        }
        return null;
    }

    public final String IconCompatParcelizer(String str) {
        boolean zRemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = serializer + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PhoneNumberUtil phoneNumberUtil = this.RemoteActionCompatParcelizer;
        str.getClass();
        if (((FirebaseRemoteConfigImpl) this.write).IconCompatParcelizer(updateAdidI.IS_GOOGLE_PHONE_SANITIZING_ENABLED)) {
            try {
                String upperCase = this.read.write().countryIsoCode.toUpperCase(java.util.Locale.ROOT);
                upperCase.getClass();
                return phoneNumberUtil.read(phoneNumberUtil.write(str, upperCase), getLocalSavedStateRegistryOwner.E164);
            } catch (NumberParseException e) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Couldn't get phone number with country code prefix ", e.getMessage()), new Object[0]);
                return str;
            }
        }
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer != null) {
            int i4 = serializer + 3;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            zRemoteActionCompatParcelizer = setCarryoverInAppMessage.RemoteActionCompatParcelizer(hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), strRemoteActionCompatParcelizer, false);
        } else {
            zRemoteActionCompatParcelizer = true;
        }
        if (!(true ^ zRemoteActionCompatParcelizer)) {
            return str;
        }
        if (strRemoteActionCompatParcelizer == null) {
            int i6 = serializer + 89;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            strRemoteActionCompatParcelizer = "";
        }
        return strRemoteActionCompatParcelizer.concat(str);
    }

    public final String serializer(String str) {
        String strWrite;
        int i = 2 % 2;
        str.getClass();
        if (((FirebaseRemoteConfigImpl) this.write).IconCompatParcelizer(updateAdidI.IS_GOOGLE_PHONE_SANITIZING_ENABLED)) {
            try {
                PhoneNumberUtil phoneNumberUtil = this.RemoteActionCompatParcelizer;
                String upperCase = this.read.write().countryIsoCode.toUpperCase(java.util.Locale.ROOT);
                upperCase.getClass();
                return String.valueOf(phoneNumberUtil.write(str, upperCase).MediaDescriptionCompat);
            } catch (NumberParseException e) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Couldn't get phone number without country code prefix ", e.getMessage()), new Object[0]);
                return str;
            }
        }
        int i2 = serializer + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        Object obj = null;
        if (strRemoteActionCompatParcelizer != null) {
            int i4 = IconCompatParcelizer + 39;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            strWrite = setCarryoverInAppMessage.write(strRemoteActionCompatParcelizer, "+", "");
            int i6 = IconCompatParcelizer + 121;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 5 / 5;
            }
        } else {
            strWrite = null;
        }
        String string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) setCarryoverInAppMessage.write(str, "+", "")).toString();
        if (strWrite != null && setCarryoverInAppMessage.RemoteActionCompatParcelizer(string, strWrite, false)) {
            String strSubstring = string.substring(strWrite.length());
            int i8 = IconCompatParcelizer + 3;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return strSubstring;
        }
        String string2 = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString();
        int i10 = serializer + 5;
        IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            return string2;
        }
        obj.hashCode();
        throw null;
    }
}
