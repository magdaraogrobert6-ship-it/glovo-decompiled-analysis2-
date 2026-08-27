package o;

import com.roadrunner.rider.recruitment.applicant.domain.AddRiderHiringQueryParamsImpl;
import fwfd.com.fwfsdk.util.FWFHelper;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setPlayStoreKidsComplianceInDelay {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final accessgetOldDependencyp RemoteActionCompatParcelizer;
    public final AddRiderHiringQueryParamsImpl serializer;
    public final RectManager write;

    public setPlayStoreKidsComplianceInDelay(RectManager rectManager, AddRiderHiringQueryParamsImpl addRiderHiringQueryParamsImpl, accessgetOldDependencyp accessgetolddependencyp) {
        rectManager.getClass();
        addRiderHiringQueryParamsImpl.getClass();
        accessgetolddependencyp.getClass();
        this.write = rectManager;
        this.serializer = addRiderHiringQueryParamsImpl;
        this.RemoteActionCompatParcelizer = accessgetolddependencyp;
    }

    public final Object IconCompatParcelizer(ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacksSerializer = this.write.serializer();
        if (metamarkupdatedandhascallbacksSerializer == null) {
            int i2 = IconCompatParcelizer + 13;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            String str = metamarkupdatedandhascallbacksSerializer.registerUrl;
            if (str != null) {
                String language = java.util.Locale.getDefault().getLanguage();
                String str2 = metamarkupdatedandhascallbacksSerializer.countryIsoCode;
                language.getClass();
                createAppropriateViews createappropriateviews = new createAppropriateViews();
                createappropriateviews.read(null, str);
                createAppropriateViews createappropriateviewsMediaDescriptionCompat = createappropriateviews.RemoteActionCompatParcelizer().MediaDescriptionCompat();
                createappropriateviewsMediaDescriptionCompat.write(com.deliveryhero.chatsdk.util.PushNotificationParserObj.COUNTRY_KEY, str2);
                createappropriateviewsMediaDescriptionCompat.write("language", language);
                createappropriateviewsMediaDescriptionCompat.write(FWFHelper.fwfDeviceOS, "true");
                createappropriateviewsMediaDescriptionCompat.write("app_version", ((getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) this.RemoteActionCompatParcelizer).read);
                return this.serializer.invoke(createappropriateviewsMediaDescriptionCompat.RemoteActionCompatParcelizer().url, continuationImpl);
            }
        }
        int i4 = IconCompatParcelizer + 51;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }
}
