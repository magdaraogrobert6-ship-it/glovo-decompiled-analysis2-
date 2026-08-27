package com.roadrunner.experience_tools.braze;

import android.app.Application;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.braze.Braze;
import com.braze.BrazeActivityLifecycleCallbackListener;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.huawei.hms.framework.common.BundleUtil;
import com.roadrunner.logger.api.data.AppInfoChangedListener;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.Locale;
import java.util.Map;
import o.ExecutableQueryexecuteAsOneOrNull1;
import o.executeAsOneOrNull;
import o.getCardAtIndexlambda0;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.parseLayoutDescription;
import o.setConstraintSet;
import o.setMaxWidth;
import o.setMinWidth;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
@getCardAtIndexlambda0
public final class BrazeManagerImpl implements parseLayoutDescription, setConstraintSet, AppInfoChangedListener {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final Application IconCompatParcelizer;
    public final transferSessionPackageI MediaBrowserCompatMediaItem;
    public volatile setMaxWidth RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(24, this));
    public final isOpenInternalroom_runtime serializer;
    public final setMinWidth write;

    public BrazeManagerImpl(Application application, setMinWidth setminwidth, transferSessionPackageI transfersessionpackagei, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.IconCompatParcelizer = application;
        this.write = setminwidth;
        this.MediaBrowserCompatMediaItem = transfersessionpackagei;
        this.serializer = isopeninternalroom_runtime;
        application.registerActivityLifecycleCallbacks(new BrazeActivityLifecycleCallbackListener(true, true, null, null, 12, null));
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateProperties(Map map) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 53;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            map.getClass();
            int i3 = 27 / 0;
        } else {
            map.getClass();
        }
        int i4 = MediaMetadataCompat + 59;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperties(ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 19;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        executableQueryexecuteAsOneOrNull1.getClass();
        int i4 = MediaMetadataCompat + 49;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperty(String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 97;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            str2.getClass();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        str.getClass();
        str2.getClass();
        int i3 = MediaDescriptionCompat + 11;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public final Braze read() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 111;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (Braze) this.read.MediaSessionCompatResultReceiverWrapper();
        }
        int i3 = 90 / 0;
        return (Braze) this.read.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void onInfoUpdated(executeAsOneOrNull executeasoneornull) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 25;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        executeasoneornull.getClass();
        ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1 = executeasoneornull.MediaMetadataCompat;
        String str = executableQueryexecuteAsOneOrNull1.read;
        String str2 = executableQueryexecuteAsOneOrNull1.serializer;
        if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            int i4 = MediaMetadataCompat + 15;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                boolean zIconCompatParcelizer = ((FirebaseRemoteConfigImpl) this.MediaBrowserCompatMediaItem).IconCompatParcelizer(updateAdidI.IS_BRAZE_CUSTOM_ATTRIBUTE_FIX_ENABLED);
                String str3 = executeasoneornull.RemoteActionCompatParcelizer;
                if (!zIconCompatParcelizer) {
                    String strM = af$$ExternalSyntheticOutline0.m(str2, BundleUtil.UNDERLINE_TAG, str);
                    Braze braze = read();
                    braze.changeUser(strM);
                    braze.getCurrentUser(new PreviewView$1$$ExternalSyntheticLambda2(str, str2, str3, 24));
                    int i6 = MediaMetadataCompat + 53;
                    MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                String displayLanguage = Locale.getDefault().getDisplayLanguage();
                displayLanguage.getClass();
                setMaxWidth setmaxwidth = new setMaxWidth(str, str2, str3, displayLanguage);
                setMaxWidth setmaxwidth2 = this.RemoteActionCompatParcelizer;
                if (setmaxwidth.equals(setmaxwidth2)) {
                    return;
                }
                this.RemoteActionCompatParcelizer = setmaxwidth;
                Braze braze2 = read();
                braze2.changeUser(str2 + BundleUtil.UNDERLINE_TAG + str);
                braze2.getCurrentUser(new JankStatsFrameTracker$$ExternalSyntheticLambda3(this, setmaxwidth2, setmaxwidth));
                return;
            }
        }
        if (((FirebaseRemoteConfigImpl) this.MediaBrowserCompatMediaItem).IconCompatParcelizer(updateAdidI.IS_BRAZE_CUSTOM_ATTRIBUTE_FIX_ENABLED)) {
            int i7 = MediaDescriptionCompat + 27;
            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            this.RemoteActionCompatParcelizer = null;
        }
    }
}
