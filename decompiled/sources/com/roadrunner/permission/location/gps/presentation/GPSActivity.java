package com.roadrunner.permission.location.gps.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import coil3.ComponentRegistry$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.location.ActivityIdentificationData;
import com.logistics.rider.glovo.R;
import com.mapbox.common.LogConfiguration;
import com.roadrunner.permission.location.gps.presentation.GPSActivity;
import com.ui.common.base.BaseInjectionActivity;
import com.ui.common.widget.message_dialog.MessageDialogFragment;
import io.sentry.hints.MediaSessionCompatQueueItem;
import o.createFromParcel;
import o.createImageBitmap;
import o.displayInAppMessagelambda1;
import o.getTimeFromEpochInSeconds;
import o.nowInMillisecondslambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaLB0xylucpNeM6is_roDUUNoVIEI;
import o.r8lambdaNLh2unasuTAJyl7UfQl7Zvjqkp0;
import o.r8lambdaNqhrgEfabAqwf0tWjfi5TXi8Y;
import o.r8lambdaPO7RMOx5_w8jhcfg0pDu3GUdFjk;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaSNLjO_HuHH0BcjkmeJ_eXZT7iMA;
import o.r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I;
import o.r8lambdaT4v5FDQjCyVCqF4Q_RBnbXLvo;
import o.r8lambda_8tdJ25vpD8Y8RN041XoXhmn3eU;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class GPSActivity extends BaseInjectionActivity {
    private static int ComponentActivity = 1;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int MediaSessionCompatToken;
    public static final r8lambdaNqhrgEfabAqwf0tWjfi5TXi8Y RatingCompat = new r8lambdaNqhrgEfabAqwf0tWjfi5TXi8Y();
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdaPO7RMOx5_w8jhcfg0pDu3GUdFjk MediaBrowserCompatMediaItem;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY MediaDescriptionCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY MediaSessionCompatQueueItem;
    private final onViewDetachedFromWindowlambda1 ParcelableVolumeInfo;
    private final onViewDetachedFromWindowlambda1 PlaybackStateCompat;
    private MessageDialogFragment PlaybackStateCompatCustomAction;

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = (~(i7 | i5)) | i2;
        int i9 = ~i2;
        int i10 = ~(i7 | i9);
        int i11 = ~i5;
        int i12 = i10 | (~(i9 | i11));
        int i13 = (~(i5 | i9)) | (~(i7 | i11));
        int i14 = i3 + i2 + i6 + (417615942 * i) + (566850886 * i4);
        int i15 = i14 * i14;
        int i16 = ((-370608051) * i3) + 147849216 + ((-2147356519) * i2) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i6) + ((-354418688) * i) + ((-85983232) * i4) + ((-608960512) * i15);
        int i17 = (i3 * (-1357469509)) + 140661806 + (i2 * (-1357469617)) + (i8 * ActivityIdentificationData.RUNNING) + (i12 * ActivityIdentificationData.RUNNING) + (i13 * ActivityIdentificationData.RUNNING) + (i6 * (-1357469401)) + (i * 1137340586) + (i4 * 304092074) + (i15 * 1282146304);
        int i18 = i16 + (i17 * i17 * 1158414336);
        if (i18 == 1) {
            return read(objArr);
        }
        if (i18 != 2) {
            return i18 != 3 ? write(objArr) : serializer(objArr);
        }
        return IconCompatParcelizer(objArr);
    }

    static {
        int i = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 57;
        ComponentActivity = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private final void read() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 81;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        finish();
        int i4 = MediaSessionCompatResultReceiverWrapper + 111;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ createFromParcel IconCompatParcelizer(GPSActivity gPSActivity, r8lambdaSNLjO_HuHH0BcjkmeJ_eXZT7iMA r8lambdasnljo_huhh0bcjkmej_exzt7ima) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 57;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iIconCompatParcelizer = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        int iIconCompatParcelizer2 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        createFromParcel createfromparcel = (createFromParcel) read(LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), 1047561828, -1047561826, LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{gPSActivity, r8lambdasnljo_huhh0bcjkmej_exzt7ima}, iIconCompatParcelizer2);
        int i4 = MediaSessionCompatResultReceiverWrapper + 83;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    public static /* synthetic */ createImageBitmap IconCompatParcelizer(GPSActivity gPSActivity) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 61;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iIconCompatParcelizer = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        int iIconCompatParcelizer2 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        createImageBitmap createimagebitmap = (createImageBitmap) read(LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), 452143097, -452143094, LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{gPSActivity}, iIconCompatParcelizer2);
        int i4 = MediaSessionCompatToken + 105;
        MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createimagebitmap;
    }

    public static /* synthetic */ createFromParcel read(GPSActivity gPSActivity, nowInMillisecondslambda0 nowinmillisecondslambda0) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 83;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcelIconCompatParcelizer = IconCompatParcelizer(gPSActivity, nowinmillisecondslambda0);
        int i4 = MediaSessionCompatToken + 115;
        MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcelIconCompatParcelizer;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        GPSActivity gPSActivity = (GPSActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 109;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            gPSActivity.write();
            throw null;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpnyWrite = gPSActivity.write();
        int i3 = MediaSessionCompatToken + 51;
        MediaSessionCompatResultReceiverWrapper = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return r8lambdaudhhxliolpu0hpccqh6voskpnyWrite;
    }

    private static final createImageBitmap serializer(GPSActivity gPSActivity) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 19;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpnySerializer = gPSActivity.serializer();
        int i4 = MediaSessionCompatResultReceiverWrapper + 59;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdaudhhxliolpu0hpccqh6voskpnySerializer;
    }

    public static /* synthetic */ createImageBitmap write(GPSActivity gPSActivity) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 45;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            serializer(gPSActivity);
            throw null;
        }
        createImageBitmap createimagebitmapSerializer = serializer(gPSActivity);
        int i3 = MediaSessionCompatToken + 7;
        MediaSessionCompatResultReceiverWrapper = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 30 / 0;
        }
        return createimagebitmapSerializer;
    }

    public GPSActivity() {
        final int i = 0;
        final int i2 = 1;
        this.ParcelableVolumeInfo = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I.class), new r8lambdaT4v5FDQjCyVCqF4Q_RBnbXLvo(this, i), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.r8lambdaKrVLZsyaDgGklSfulf2u6KmcNg
            private static int read = 0;
            private static int write = 1;
            public final /* synthetic */ GPSActivity IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = write + 31;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = i;
                GPSActivity gPSActivity = this.IconCompatParcelizer;
                if (i5 != 0) {
                    return GPSActivity.write(gPSActivity);
                }
                createImageBitmap createimagebitmapIconCompatParcelizer = GPSActivity.IconCompatParcelizer(gPSActivity);
                int i6 = read + 87;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return createimagebitmapIconCompatParcelizer;
                }
                throw null;
            }
        }, new r8lambdaT4v5FDQjCyVCqF4Q_RBnbXLvo(this, i2));
        this.PlaybackStateCompat = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(getTimeFromEpochInSeconds.class), new r8lambdaT4v5FDQjCyVCqF4Q_RBnbXLvo(this, 2), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.r8lambdaKrVLZsyaDgGklSfulf2u6KmcNg
            private static int read = 0;
            private static int write = 1;
            public final /* synthetic */ GPSActivity IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = write + 31;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = i2;
                GPSActivity gPSActivity = this.IconCompatParcelizer;
                if (i5 != 0) {
                    return GPSActivity.write(gPSActivity);
                }
                createImageBitmap createimagebitmapIconCompatParcelizer = GPSActivity.IconCompatParcelizer(gPSActivity);
                int i6 = read + 87;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return createimagebitmapIconCompatParcelizer;
                }
                throw null;
            }
        }, new r8lambdaT4v5FDQjCyVCqF4Q_RBnbXLvo(this, 3));
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 27;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            super.onCreate(bundle);
            write(bundle);
            int i3 = 57 / 0;
        } else {
            super.onCreate(bundle);
            write(bundle);
        }
        int i4 = MediaSessionCompatResultReceiverWrapper + 7;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private final getTimeFromEpochInSeconds RatingCompat() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 23;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getTimeFromEpochInSeconds gettimefromepochinseconds = (getTimeFromEpochInSeconds) this.PlaybackStateCompat.MediaSessionCompatResultReceiverWrapper();
        int i4 = MediaSessionCompatResultReceiverWrapper + 117;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return gettimefromepochinseconds;
        }
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        GPSActivity gPSActivity = (GPSActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 97;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I r8lambdasxcf6mwwlj1mupt8fjzle1zmi5i = (r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I) gPSActivity.ParcelableVolumeInfo.MediaSessionCompatResultReceiverWrapper();
        int i4 = MediaSessionCompatToken + 53;
        MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdasxcf6mwwlj1mupt8fjzle1zmi5i;
    }

    private final void MediaDescriptionCompat() {
        int i = 2 % 2;
        startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        int i2 = MediaSessionCompatResultReceiverWrapper + 91;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final r8lambdaPO7RMOx5_w8jhcfg0pDu3GUdFjk RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        r8lambdaPO7RMOx5_w8jhcfg0pDu3GUdFjk r8lambdapo7rmox5_w8jhcfg0pdu3gudfjk = this.MediaBrowserCompatMediaItem;
        Object obj = null;
        if (r8lambdapo7rmox5_w8jhcfg0pdu3gudfjk == null) {
            removeNodeAtDepth.serializer("deviceStateChangeHandlerFactory");
            throw null;
        }
        int i2 = MediaSessionCompatToken + 47;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i3;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 115;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambdapo7rmox5_w8jhcfg0pdu3gudfjk;
        }
        obj.hashCode();
        throw null;
    }

    public final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 115;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = this.MediaDescriptionCompat;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("messageViewModelFactory");
            throw null;
        }
        int i4 = i3 + 27;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return r8lambdaudhhxliolpu0hpccqh6voskpny;
    }

    private static final createFromParcel IconCompatParcelizer(GPSActivity gPSActivity, nowInMillisecondslambda0 nowinmillisecondslambda0) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 41;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        nowinmillisecondslambda0.getClass();
        int iIconCompatParcelizer = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        int iIconCompatParcelizer2 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        ((r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I) read(LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), -10179524, 10179524, LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{gPSActivity}, iIconCompatParcelizer2)).RemoteActionCompatParcelizer(nowinmillisecondslambda0);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = MediaSessionCompatResultReceiverWrapper + 25;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return createfromparcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r0 = 40 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        o.removeNodeAtDepth.serializer("viewModelFactory");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 57;
        com.roadrunner.permission.location.gps.presentation.GPSActivity.MediaSessionCompatToken = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY write() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.permission.location.gps.presentation.GPSActivity.MediaSessionCompatResultReceiverWrapper
            int r2 = r1 + 89
            int r3 = r2 % 128
            com.roadrunner.permission.location.gps.presentation.GPSActivity.MediaSessionCompatToken = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r2 = r4.MediaSessionCompatQueueItem
            r3 = 26
            int r3 = r3 / 0
            if (r2 == 0) goto L29
            goto L1b
        L17:
            o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r2 = r4.MediaSessionCompatQueueItem
            if (r2 == 0) goto L29
        L1b:
            int r1 = r1 + 57
            int r3 = r1 % 128
            com.roadrunner.permission.location.gps.presentation.GPSActivity.MediaSessionCompatToken = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L28
            r0 = 40
            int r0 = r0 / 0
        L28:
            return r2
        L29:
            java.lang.String r0 = "viewModelFactory"
            o.removeNodeAtDepth.serializer(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.permission.location.gps.presentation.GPSActivity.write():o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY");
    }

    private final void write(Bundle bundle) throws NoSuchMethodException {
        int i = 2 % 2;
        Object obj = null;
        if (bundle == null) {
            read(LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), -1940388479, 1940388480, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1565117727, LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.customer_chat_user_left_channel).substring(0, 4).length() + 818494446);
            int i2 = MediaSessionCompatResultReceiverWrapper + 27;
            MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 4 % 3;
            }
        }
        MediaSessionCompatQueueItem();
        MediaBrowserCompatMediaItem();
        PlaybackStateCompatCustomAction();
        int i4 = MediaSessionCompatToken + 45;
        MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 11;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getLifecycle().IconCompatParcelizer(RemoteActionCompatParcelizer().IconCompatParcelizer());
        int i4 = MediaSessionCompatToken + 67;
        MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
    }

    private final void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int iIconCompatParcelizer = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        int iIconCompatParcelizer2 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        ((r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I) read(LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), -10179524, 10179524, LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{this}, iIconCompatParcelizer2)).IconCompatParcelizer().RemoteActionCompatParcelizer(this, new r8lambdaLB0xylucpNeM6is_roDUUNoVIEI(this, 0));
        int i2 = MediaSessionCompatToken + 117;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    private final void MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        RatingCompat().read().RemoteActionCompatParcelizer(this, new r8lambdaLB0xylucpNeM6is_roDUUNoVIEI(this, 1));
        int i2 = MediaSessionCompatToken + 31;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        GPSActivity gPSActivity = (GPSActivity) objArr[0];
        r8lambdaSNLjO_HuHH0BcjkmeJ_eXZT7iMA r8lambdasnljo_huhh0bcjkmej_exzt7ima = (r8lambdaSNLjO_HuHH0BcjkmeJ_eXZT7iMA) objArr[1];
        int i = 2 % 2;
        r8lambdasnljo_huhh0bcjkmej_exzt7ima.getClass();
        int i2 = r8lambdaNLh2unasuTAJyl7UfQl7Zvjqkp0.serializer[r8lambdasnljo_huhh0bcjkmej_exzt7ima.ordinal()];
        if (i2 != 1) {
            int i3 = MediaSessionCompatResultReceiverWrapper;
            int i4 = i3 + 121;
            MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
            Object obj = null;
            if (i4 % 2 == 0 ? i2 != 2 : i2 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            int i5 = i3 + 39;
            MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                gPSActivity.read();
                obj.hashCode();
                throw null;
            }
            gPSActivity.read();
        } else {
            gPSActivity.MediaDescriptionCompat();
        }
        return createFromParcel.INSTANCE;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        GPSActivity gPSActivity = (GPSActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 91;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iIconCompatParcelizer = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        int iIconCompatParcelizer2 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        r8lambda_8tdJ25vpD8Y8RN041XoXhmn3eU r8lambda_8tdj25vpd8y8rn041xoxhmn3euRemoteActionCompatParcelizer = ((r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I) read(LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), -10179524, 10179524, LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{gPSActivity}, iIconCompatParcelizer2)).RemoteActionCompatParcelizer();
        MessageDialogFragment messageDialogFragmentIconCompatParcelizer = MediaSessionCompatQueueItem.IconCompatParcelizer(r8lambda_8tdj25vpd8y8rn041xoxhmn3euRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), r8lambda_8tdj25vpd8y8rn041xoxhmn3euRemoteActionCompatParcelizer.IconCompatParcelizer(), r8lambda_8tdj25vpd8y8rn041xoxhmn3euRemoteActionCompatParcelizer.write(), null, null, false, false, false, 440);
        messageDialogFragmentIconCompatParcelizer.RemoteActionCompatParcelizer(gPSActivity.getSupportFragmentManager(), "GPSActivity_TAG");
        gPSActivity.PlaybackStateCompatCustomAction = messageDialogFragmentIconCompatParcelizer;
        int i4 = MediaSessionCompatResultReceiverWrapper + 15;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    private static final createImageBitmap read(GPSActivity gPSActivity) {
        int iIconCompatParcelizer = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        int iIconCompatParcelizer2 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        return (createImageBitmap) read(LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), 452143097, -452143094, LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{gPSActivity}, iIconCompatParcelizer2);
    }

    private final void ParcelableVolumeInfo() {
        read(LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), -1940388479, 1940388480, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1565117727, LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), new Object[]{this}, 818494446 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.customer_chat_user_left_channel).substring(0, 4).length());
    }

    private static final createFromParcel RemoteActionCompatParcelizer(GPSActivity gPSActivity, r8lambdaSNLjO_HuHH0BcjkmeJ_eXZT7iMA r8lambdasnljo_huhh0bcjkmej_exzt7ima) {
        int iIconCompatParcelizer = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        int iIconCompatParcelizer2 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        return (createFromParcel) read(LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), 1047561828, -1047561826, LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{gPSActivity, r8lambdasnljo_huhh0bcjkmej_exzt7ima}, iIconCompatParcelizer2);
    }

    private final r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I MediaMetadataCompat() {
        int iIconCompatParcelizer = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        int iIconCompatParcelizer2 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
        return (r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I) read(LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), -10179524, 10179524, LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{this}, iIconCompatParcelizer2);
    }
}
