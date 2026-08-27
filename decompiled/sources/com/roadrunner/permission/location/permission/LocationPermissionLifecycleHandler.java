package com.roadrunner.permission.location.permission;

import androidx.activity.result.ActivityResultRegistry;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.foodora.courier.main.presentation.MainActivity;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import com.roadrunner.permission.api.model.PermissionModel;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.accessisRenderNodeCompatiblecp;
import o.onBackPressed;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08;
import o.r8lambda93nPh_UiO6LLly5QJWhviIL_k;
import o.r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA;
import o.r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik;
import o.r8lambdadiHCtAejt895m8HzbAibmUGZMKo;
import o.removeNodeAtDepth;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;
import o.updateAdidI;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class LocationPermissionLifecycleHandler implements DefaultLifecycleObserver {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    public final ActivityResultRegistry IconCompatParcelizer;
    public final r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik MediaBrowserCompatMediaItem;
    public final r8lambda93nPh_UiO6LLly5QJWhviIL_k MediaMetadataCompat;
    public final r8lambdadiHCtAejt895m8HzbAibmUGZMKo MediaSessionCompatQueueItem;
    public final transferSessionPackageI RatingCompat;
    public onBackPressed RemoteActionCompatParcelizer;
    public final r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA read;
    public final MainActivity serializer;
    public final onViewDetachedFromWindowlambda1 write;

    public LocationPermissionLifecycleHandler(r8lambda93nPh_UiO6LLly5QJWhviIL_k r8lambda93nph_uio6llly5qjwhviil_k, r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA r8lambdaekymoxv_2c6wlkkhzt5tho0_ya, r8lambdadiHCtAejt895m8HzbAibmUGZMKo r8lambdadihctaejt895m8hzbaibmugzmko, r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik r8lambda_dfitvnggdulnvz_azfzdrtp1ik, transferSessionPackageI transfersessionpackagei, MainActivity mainActivity, ActivityResultRegistry activityResultRegistry) {
        r8lambda93nph_uio6llly5qjwhviil_k.getClass();
        r8lambdaekymoxv_2c6wlkkhzt5tho0_ya.getClass();
        r8lambdadihctaejt895m8hzbaibmugzmko.getClass();
        r8lambda_dfitvnggdulnvz_azfzdrtp1ik.getClass();
        transfersessionpackagei.getClass();
        this.MediaMetadataCompat = r8lambda93nph_uio6llly5qjwhviil_k;
        this.read = r8lambdaekymoxv_2c6wlkkhzt5tho0_ya;
        this.MediaSessionCompatQueueItem = r8lambdadihctaejt895m8hzbaibmugzmko;
        this.MediaBrowserCompatMediaItem = r8lambda_dfitvnggdulnvz_azfzdrtp1ik;
        this.RatingCompat = transfersessionpackagei;
        this.serializer = mainActivity;
        this.IconCompatParcelizer = activityResultRegistry;
        this.write = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new ResourceFileSystem$$ExternalSyntheticLambda0(17, this));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 13;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onResume(accessisrendernodecompatiblecp);
        this.MediaSessionCompatQueueItem.serializer.IconCompatParcelizer(Boolean.valueOf(this.read.read(((PermissionModel) this.write.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer, this.serializer)));
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.RatingCompat;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_LOCATION_PERMISSION_DISMISSIBLE_ENABLED)) {
            return;
        }
        int i4 = MediaDescriptionCompat + 59;
        MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        write();
    }

    public final void write() {
        int i = 2 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = this.write;
        r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08 r8lambda60pwjrj_ieyypznb7gugmuamr08 = ((PermissionModel) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer;
        r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA r8lambdaekymoxv_2c6wlkkhzt5tho0_ya = this.read;
        MainActivity mainActivity = this.serializer;
        this.MediaSessionCompatQueueItem.serializer.IconCompatParcelizer(Boolean.valueOf(r8lambdaekymoxv_2c6wlkkhzt5tho0_ya.read(r8lambda60pwjrj_ieyypznb7gugmuamr08, mainActivity)));
        if (!r8lambdaekymoxv_2c6wlkkhzt5tho0_ya.read(((PermissionModel) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer, mainActivity)) {
            int i2 = MediaDescriptionCompat + 69;
            int i3 = i2 % Fields.SpotShadowColor;
            MediaSessionCompatResultReceiverWrapper = i3;
            int i4 = i2 % 2;
            onBackPressed onbackpressed = this.RemoteActionCompatParcelizer;
            if (onbackpressed == null) {
                removeNodeAtDepth.serializer("activityResultLauncher");
                throw null;
            }
            int i5 = i3 + 61;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                onbackpressed.write((PermissionModel) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper());
            } else {
                onbackpressed.write((PermissionModel) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper());
                int i6 = 25 / 0;
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        onBackPressed onbackpressedRegister = this.IconCompatParcelizer.register("location_activity_launcher_key", accessisrendernodecompatiblecp, this.MediaMetadataCompat.write, new PerseusInitializerImpl$$ExternalSyntheticLambda0(28, this));
        onbackpressedRegister.getClass();
        this.RemoteActionCompatParcelizer = onbackpressedRegister;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.RatingCompat;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_LOCATION_PERMISSION_DISMISSIBLE_ENABLED)) {
            int i2 = MediaSessionCompatResultReceiverWrapper + 27;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            write();
            int i4 = MediaSessionCompatResultReceiverWrapper + 31;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new SaveShiftInfo$invoke$2(accessisrendernodecompatiblecp, this, null, 8), 3);
    }
}
