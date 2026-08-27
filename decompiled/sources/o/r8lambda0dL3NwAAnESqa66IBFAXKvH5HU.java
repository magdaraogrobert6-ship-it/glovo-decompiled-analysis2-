package o;

import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.customerchat.selfservice.domain.GeidUserIdMismatchException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda0dL3NwAAnESqa66IBFAXKvH5HU {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public final isOpenInternalroom_runtime IconCompatParcelizer;
    public final endPrefixMapping RemoteActionCompatParcelizer;
    public final AnnotatedStringExhaustiveAnnotation serializer;
    public final HelpCenterRemoteDataSourceImpl write;

    public r8lambda0dL3NwAAnESqa66IBFAXKvH5HU(endPrefixMapping endprefixmapping, HelpCenterRemoteDataSourceImpl helpCenterRemoteDataSourceImpl, isOpenInternalroom_runtime isopeninternalroom_runtime, AnnotatedStringExhaustiveAnnotation annotatedStringExhaustiveAnnotation) {
        endprefixmapping.getClass();
        helpCenterRemoteDataSourceImpl.getClass();
        isopeninternalroom_runtime.getClass();
        annotatedStringExhaustiveAnnotation.getClass();
        this.RemoteActionCompatParcelizer = endprefixmapping;
        this.write = helpCenterRemoteDataSourceImpl;
        this.IconCompatParcelizer = isopeninternalroom_runtime;
        this.serializer = annotatedStringExhaustiveAnnotation;
    }

    public static final void write(r8lambda0dL3NwAAnESqa66IBFAXKvH5HU r8lambda0dl3nwaanesqa66ibfaxkvh5hu, String str, String str2, String str3) {
        int i = 2 % 2;
        r8lambda0dl3nwaanesqa66ibfaxkvh5hu.getClass();
        String strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(str, '-');
        StringBuilder sb = new StringBuilder();
        int length = strIconCompatParcelizer.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = read + 21;
            MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                Character.isLetter(strIconCompatParcelizer.charAt(i2));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            char cCharAt = strIconCompatParcelizer.charAt(i2);
            if (Character.isLetter(cCharAt)) {
                sb.append(cCharAt);
            }
            i2++;
            int i4 = read + 63;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        String string = sb.toString();
        java.util.Locale locale = java.util.Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = str2.toLowerCase(locale);
        lowerCase2.getClass();
        if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) lowerCase2, (CharSequence) lowerCase, false)) {
            return;
        }
        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new GeidUserIdMismatchException(lowerCase, str2), str3, new Object[0]);
        int i6 = MediaBrowserCompatMediaItem + 109;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 34 / 0;
        }
    }
}
