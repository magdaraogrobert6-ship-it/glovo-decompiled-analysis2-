package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.play.core.appupdate.zzz;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.login.presentation.LoginActivity;
import com.sentiance.core.model.events.E$b;
import okhttp3.FormBody;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class setDefaultNotificationChannelName implements r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 {
    private static int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 0;
    private static int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 1;
    public Object ComponentActivity;
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public Object MediaSessionCompatResultReceiverWrapper;
    public Object MediaSessionCompatToken;
    public Object ParcelableVolumeInfo;
    public Object PlaybackStateCompat;
    public Object PlaybackStateCompatCustomAction;
    public Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object ResultReceiver;
    public Object r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public Object r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public Object r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public Object read;
    public Object serializer;
    public Object write;

    public setDefaultNotificationAccentColorandroid_sdk_base_release IconCompatParcelizer() {
        int i;
        int i2 = 2 % 2;
        int i3 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 19;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i4;
        int i5 = i3 % 2;
        if (((getBadNetworkIntervalandroid_sdk_base_release) this.read) != null) {
            int i6 = i4 + 17;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = 1;
        } else {
            i = 0;
        }
        if (((setCustomUserAttributedefault) this.serializer) != null) {
            i++;
        }
        if (((BrazeUserExternalSyntheticLambda1) this.RemoteActionCompatParcelizer) != null) {
            i++;
            int i8 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 117;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        if (((setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release) this.write) != null) {
            int i10 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 47;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i++;
        }
        if (((setGender) this.IconCompatParcelizer) != null) {
            i++;
        }
        if (((unsetCustomUserAttributelambda1) this.RatingCompat) != null) {
            i++;
        }
        if (((setEmaillambda3) this.MediaSessionCompatQueueItem) != null) {
            i++;
        }
        if (((IBrazeExternalSyntheticBUOutline0) this.MediaBrowserCompatMediaItem) != null) {
            int i12 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 67;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i++;
        }
        if (((BrazeUserExternalSyntheticLambda3) this.MediaMetadataCompat) != null) {
            i++;
        }
        if (((IBrazeDeeplinkHandler) this.MediaDescriptionCompat) != null) {
            i++;
        }
        if (((addAliaslambda0) this.MediaSessionCompatToken) != null) {
            i++;
        }
        if (((setDefaultNotificationChannelDescriptionandroid_sdk_base_release) this.ParcelableVolumeInfo) != null) {
            int i14 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 125;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                i++;
            }
        }
        if (((setDeviceObjectAllowlist) this.PlaybackStateCompatCustomAction) != null) {
            int i15 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 25;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i = i15 % 2 != 0 ? i >>> 1 : i + 1;
        }
        if (((getGreatNetworkIntervalandroid_sdk_base_release) this.PlaybackStateCompat) != null) {
            i++;
        }
        if (((addAliaslambda3) this.MediaSessionCompatResultReceiverWrapper) != null) {
            i++;
        }
        if (((setEmail) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) != null) {
            i++;
        }
        if (((logPurchasedefault) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) != null) {
            i++;
        }
        if (((setAutomaticLocationCollectionEnabledandroid_sdk_base_release) this.ComponentActivity) != null) {
            i++;
        }
        if (((setCustomUserAttributelambda0) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) != null) {
            i++;
        }
        if (((unsetCustomUserAttribute) this.ResultReceiver) != null) {
            i++;
        }
        if (i == 1) {
            return new setDefaultNotificationAccentColorandroid_sdk_base_release(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i, "Invalid union; ", " field(s) were set"));
        return null;
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public void inject(Object obj) {
        int i = 2 % 2;
        LoginActivity loginActivity = (LoginActivity) obj;
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.read;
        loginActivity._init_lambda1 = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
        loginActivity.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((setRefreshing) this.write);
        loginActivity.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((ba) this.IconCompatParcelizer);
        loginActivity.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((d4ExternalSyntheticLambda3) this.RatingCompat);
        loginActivity.MediaSessionCompatResultReceiverWrapper = (getThrottledCallbacksuiannotations) getstyleable_vector_drawable_group_rotation.getPopupContext.write;
        loginActivity._init_lambda4 = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((getModels) this.MediaSessionCompatQueueItem);
        loginActivity.ParcelableVolumeInfo = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((getModels) this.MediaBrowserCompatMediaItem);
        loginActivity.PlaybackStateCompat = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((r8lambda4qmPbs3swzMG_sQ6Wvv9rB3jZw) this.ParcelableVolumeInfo);
        loginActivity.MediaSessionCompatToken = (AndroidQuery) ((getDoubleOrNull) this.PlaybackStateCompatCustomAction).write;
        int iIconCompatParcelizer = bo.app.n5.IconCompatParcelizer();
        int iIconCompatParcelizer2 = bo.app.n5.IconCompatParcelizer();
        zzz zzzVar = (zzz) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(-411146129, new Object[]{getstyleable_vector_drawable_group_rotation}, bo.app.n5.IconCompatParcelizer(), 411146146, iIconCompatParcelizer, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer2);
        int iIconCompatParcelizer3 = bo.app.n5.IconCompatParcelizer();
        int iIconCompatParcelizer4 = bo.app.n5.IconCompatParcelizer();
        loginActivity.PlaybackStateCompatCustomAction = new r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w(zzzVar, new CreateHomeScope((zzz) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(-411146129, new Object[]{getstyleable_vector_drawable_group_rotation}, bo.app.n5.IconCompatParcelizer(), 411146146, iIconCompatParcelizer3, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer4)));
        loginActivity.ResultReceiver = new TransactionWithoutReturn(new RectManager(getColorIntegerOrNull.serializer(getstyleable_vector_drawable_group_rotation.onContentChanged)));
        loginActivity.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = getstyleable_vector_drawable_group_rotation.addOnPictureInPictureModeChangedListener();
        loginActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (AndroidSqliteDriverexecute1) ((getDoubleOrNull) this.ComponentActivity).write;
        loginActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = (transferSessionPackageI) getstyleable_vector_drawable_group_rotation.Contentfoundation.write();
        int iIconCompatParcelizer5 = bo.app.n5.IconCompatParcelizer();
        int iIconCompatParcelizer6 = bo.app.n5.IconCompatParcelizer();
        loginActivity._init_lambda3 = (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation}, bo.app.n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer5, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer6);
        loginActivity.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = (be) ((getDoubleOrNull) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).write;
        loginActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new C0153b();
        loginActivity.ComponentActivity = new ImageHeaderParserImageType(new accessisMainThread(), new Path$Companion());
        loginActivity.MediaBrowserCompatMediaItem = new com.huawei.agconnect.config.impl.m(new com.huawei.wisesecurity.ucs_credential.g0(0), 16, new com.huawei.wisesecurity.ucs_credential.n0(0));
        loginActivity.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = (SemanticsOwner) getstyleable_vector_drawable_group_rotation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write();
        loginActivity.MediaDescriptionCompat = (SemanticsOwnerKt) getstyleable_vector_drawable_group_rotation.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write();
        loginActivity.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new safeCallFlushDelayedInitPushAnalyticsQueuelambda1(new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY(getstyleable_vector_drawable_group_rotation.constructorimpl));
        int iIconCompatParcelizer7 = bo.app.n5.IconCompatParcelizer();
        int iIconCompatParcelizer8 = bo.app.n5.IconCompatParcelizer();
        loginActivity.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = (TraceTimeMeasurementWithPerformanceKit) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(1568881057, new Object[]{getstyleable_vector_drawable_group_rotation}, bo.app.n5.IconCompatParcelizer(), -1568881038, iIconCompatParcelizer7, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer8);
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) getstyleable_vector_drawable_group_rotation.Contentfoundation.write();
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY(getstyleable_vector_drawable_group_rotation.getOverflowIcon);
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY(getstyleable_vector_drawable_group_rotation.SeekableTransitionStatesnapTo2);
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny3 = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY(getstyleable_vector_drawable_group_rotation.SeekableTransitionStateseekTo31);
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny4 = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY(getstyleable_vector_drawable_group_rotation.accessrunAnimations);
        transferSessionPackageI transfersessionpackagei2 = (transferSessionPackageI) getstyleable_vector_drawable_group_rotation.Contentfoundation.write();
        int iIconCompatParcelizer9 = bo.app.n5.IconCompatParcelizer();
        int iIconCompatParcelizer10 = bo.app.n5.IconCompatParcelizer();
        loginActivity.MediaSessionCompatQueueItem = new E$b(transfersessionpackagei, r8lambdaudhhxliolpu0hpccqh6voskpny, r8lambdaudhhxliolpu0hpccqh6voskpny2, r8lambdaudhhxliolpu0hpccqh6voskpny3, r8lambdaudhhxliolpu0hpccqh6voskpny4, new FormBody.Builder(transfersessionpackagei2, (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation}, bo.app.n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer9, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer10)), new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY(getstyleable_vector_drawable_group_rotation.IconCompatParcelizer));
        loginActivity.RatingCompat = new stopInstancelambda11(6);
        loginActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new executedefault((SemanticsOwner) getstyleable_vector_drawable_group_rotation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write());
        loginActivity.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = (bindBoolean) ((getDoubleOrNull) this.ResultReceiver).write;
        int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 73;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
    }
}
