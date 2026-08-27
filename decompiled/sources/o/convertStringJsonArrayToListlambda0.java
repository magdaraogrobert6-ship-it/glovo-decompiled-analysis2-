package o;

import android.app.Application;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.user.properties.data.UserPropertiesDataStore;
import com.roadrunner.user.properties.data.UserPropertiesRepository;
import com.roadrunner.vendor.review.data.cache.VendorReviewConfigCache;
import com.roadrunner.vendor.review.data.database.VendorReviewDatabase;

/* JADX INFO: loaded from: classes4.dex */
public final class convertStringJsonArrayToListlambda0 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public mergeJsonObjects serializer;

    public /* synthetic */ convertStringJsonArrayToListlambda0(mergeJsonObjects mergejsonobjects, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = mergejsonobjects;
    }

    public /* synthetic */ convertStringJsonArrayToListlambda0() {
        this.RemoteActionCompatParcelizer = 0;
    }

    public /* synthetic */ convertStringJsonArrayToListlambda0(io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, mergeJsonObjects mergejsonobjects, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = mergejsonobjects;
    }

    public static void IconCompatParcelizer(convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, mergeJsonObjects mergejsonobjects) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 57;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            mergeJsonObjects mergejsonobjects2 = convertstringjsonarraytolistlambda0.serializer;
            throw null;
        }
        if (convertstringjsonarraytolistlambda0.serializer == null) {
            convertstringjsonarraytolistlambda0.serializer = mergejsonobjects;
            int i4 = i2 + 103;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
        int i6 = IconCompatParcelizer + 9;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 103;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                mergeJsonObjects mergejsonobjects = this.serializer;
                Object objWrite = null;
                if (mergejsonobjects != null) {
                    int i5 = i2 + 119;
                    write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        mergejsonobjects.write();
                        throw null;
                    }
                    objWrite = mergejsonobjects.write();
                } else {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                }
                int i6 = write + 27;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return objWrite;
            case 1:
                return new setCustomBrazeNotificationFactory((setTransactionSuccessful) this.serializer.write());
            case 2:
                Object objWrite2 = this.serializer.write();
                objWrite2.getClass();
                return new UserPropertiesRepository((UserPropertiesDataStore) objWrite2);
            case 3:
                Object objWrite3 = this.serializer.write();
                objWrite3.getClass();
                return new subscribeToBannersUpdateslambda2((UserPropertiesRepository) objWrite3);
            case 4:
                return new subscribeToNewInAppMessageslambda1((decode) this.serializer.write());
            case 5:
                Application application = (Application) this.serializer.write();
                application.getClass();
                clipRectmtrdDE cliprectmtrddeRemoteActionCompatParcelizer = androidx.room.Room.RemoteActionCompatParcelizer(application, VendorReviewDatabase.class, "rr_vendor_review.db");
                cliprectmtrddeRemoteActionCompatParcelizer.read();
                return (VendorReviewDatabase) cliprectmtrddeRemoteActionCompatParcelizer.write();
            case 6:
                Application application2 = (Application) this.serializer.write();
                application2.getClass();
                return new VendorReviewConfigCache(getConfigurationProviderandroid_sdk_base_release.RemoteActionCompatParcelizer(application2));
            case 7:
                VendorReviewDatabase vendorReviewDatabase = (VendorReviewDatabase) this.serializer.write();
                vendorReviewDatabase.getClass();
                changeUser changeuserSerializer = vendorReviewDatabase.serializer();
                setNativeShader.IconCompatParcelizer(changeuserSerializer);
                return changeuserSerializer;
            case 8:
                return (waitForUserDependencyThreadlambda1) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) this.serializer.write(), "http://localhost/", waitForUserDependencyThreadlambda1.class);
            case 9:
                return new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release((addSingleSynchronousSubscription) this.serializer.write());
            case 10:
                return new getDeviceId((transferSessionPackageI) this.serializer.write());
            case 11:
                return new getExternalIEventMessengerandroid_sdk_base_release((addSingleSynchronousSubscription) this.serializer.write());
            case 12:
                return new getHardwareName((decode) this.serializer.write());
            default:
                return new BrazeExternalSyntheticLambda206((transferSessionPackageI) this.serializer.write(), 0);
        }
    }
}
