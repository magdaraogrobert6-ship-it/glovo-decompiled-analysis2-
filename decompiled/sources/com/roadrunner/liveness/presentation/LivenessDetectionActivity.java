package com.roadrunner.liveness.presentation;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase$createConnectionManager$2;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.login.presentation.LoginActivity$onCreate$1$1$1$1$5$1;
import com.ui.common.base.BaseInjectionActivity;
import kotlinx.coroutines.BuildersKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.BrazeExternalSyntheticLambda45;
import o.DBUtil__DBUtil_androidKtperformBlocking1;
import o.DBUtil__DBUtil_androidKtperformInTransactionSuspending2;
import o.DragAndDropTargetModifierNode;
import o.FrameworkSQLiteOpenHelperOpenHelper;
import o.PassthroughConnection;
import o.PopulateViewStructure_androidKtpopulate7;
import o.RoomDatabaseExternalSyntheticLambda2;
import o.RoomDatabaseperformClear11;
import o.SQLite;
import o.SavedStateRegistryImplExternalSyntheticLambda0;
import o.SemanticsOwner;
import o.SemanticsOwnerKt;
import o.SparseArraySerializerSparseArraySurrogateCompanion;
import o.asComposePath;
import o.compareTo0680j_4;
import o.createFromParcel;
import o.createImageBitmap;
import o.displayInAppMessagelambda1;
import o.getBirthDateFull;
import o.getCompass;
import o.getCreditCardExpirationMonth;
import o.getKeyTemplate;
import o.getPostalCode;
import o.getQueryContext;
import o.getRootSemanticsNode;
import o.hd;
import o.hideTranslatedText;
import o.onConfigure;
import o.onPostMigrate;
import o.onViewAttachedToWindow;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaLZjsjPSXWRendXZH98LKrH6PSs;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.registerInAppMessageManagerlambda0;
import o.relativeMoveTo;
import o.removeNodeAtDepth;
import o.requestGeofences;
import o.setWebView;
import o.toAndroidPathDashPathEffectStyleoQv6xUo;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes3.dex */
public final class LivenessDetectionActivity extends BaseInjectionActivity {
    private static int ResultReceiver = 1;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private SparseArraySerializerSparseArraySurrogateCompanion ComponentActivity;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public PassthroughConnection MediaBrowserCompatMediaItem;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public DBUtil__DBUtil_androidKtperformInTransactionSuspending2 MediaDescriptionCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public SemanticsOwnerKt MediaSessionCompatQueueItem;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY MediaSessionCompatResultReceiverWrapper;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY MediaSessionCompatToken;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY ParcelableVolumeInfo;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY PlaybackStateCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public SemanticsOwner PlaybackStateCompatCustomAction;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public requestGeofences RatingCompat;
    private final onViewDetachedFromWindowlambda1 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdaLZjsjPSXWRendXZH98LKrH6PSs r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = i3 | i;
        int i8 = ~i4;
        int i9 = i7 | i8;
        int i10 = ~(i8 | i3);
        int i11 = (~i7) | i10;
        int i12 = i10 | (~((~i3) | (~i)));
        int i13 = i3 + i + i6 + (1699743442 * i5) + (2071835342 * i2);
        int i14 = i13 * i13;
        int i15 = ((i3 * (-557635572)) - 1375207424) + ((-557635572) * i) + (i9 * (-2106796043)) + (2106796043 * i11) + ((-2106796043) * i12) + (1630535680 * i6) + ((-648019968) * i5) + ((-1801453568) * i2) + (1296564224 * i14);
        int i16 = ((i3 * (-355764420)) - 259725689) + (i * (-355764420)) + (i9 * 521) + (i11 * (-521)) + (i12 * 521) + (i6 * (-355763899)) + (i5 * 2119243930) + (i2 * (-943812730)) + (i14 * (-597164032));
        switch (i15 + (i16 * i16 * 58195968)) {
            case 1:
                return write(objArr);
            case 2:
                return IconCompatParcelizer(objArr);
            case 3:
                return read(objArr);
            case 4:
                return RemoteActionCompatParcelizer(objArr);
            case 5:
                return MediaSessionCompatQueueItem(objArr);
            case 6:
                return MediaDescriptionCompat(objArr);
            case 7:
                return MediaMetadataCompat(objArr);
            case 8:
                return MediaBrowserCompatMediaItem(objArr);
            default:
                return serializer(objArr);
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(LivenessDetectionActivity livenessDetectionActivity) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 105;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        livenessDetectionActivity.MediaSessionCompatResultReceiverWrapper();
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 5;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void IconCompatParcelizer(LivenessDetectionActivity livenessDetectionActivity, boolean z) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 73;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            livenessDetectionActivity.serializer(z);
            int i3 = 89 / 0;
        } else {
            livenessDetectionActivity.serializer(z);
        }
        int i4 = ResultReceiver + 51;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void MediaBrowserCompatMediaItem(LivenessDetectionActivity livenessDetectionActivity) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 73;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int iSerializer = compareTo0680j_4.serializer();
            int iSerializer2 = compareTo0680j_4.serializer();
            int iSerializer3 = compareTo0680j_4.serializer();
            RemoteActionCompatParcelizer(2049215811, compareTo0680j_4.serializer(), -2049215806, iSerializer, new Object[]{livenessDetectionActivity}, iSerializer3, iSerializer2);
            return;
        }
        int iSerializer4 = compareTo0680j_4.serializer();
        int iSerializer5 = compareTo0680j_4.serializer();
        int iSerializer6 = compareTo0680j_4.serializer();
        RemoteActionCompatParcelizer(2049215811, compareTo0680j_4.serializer(), -2049215806, iSerializer4, new Object[]{livenessDetectionActivity}, iSerializer6, iSerializer5);
        throw null;
    }

    public static final /* synthetic */ void MediaDescriptionCompat(LivenessDetectionActivity livenessDetectionActivity) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 123;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        livenessDetectionActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 123;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void MediaMetadataCompat(LivenessDetectionActivity livenessDetectionActivity) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 33;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int iSerializer = compareTo0680j_4.serializer();
            int iSerializer2 = compareTo0680j_4.serializer();
            int iSerializer3 = compareTo0680j_4.serializer();
            RemoteActionCompatParcelizer(-1623174067, compareTo0680j_4.serializer(), 1623174069, iSerializer, new Object[]{livenessDetectionActivity}, iSerializer3, iSerializer2);
            return;
        }
        int iSerializer4 = compareTo0680j_4.serializer();
        int iSerializer5 = compareTo0680j_4.serializer();
        int iSerializer6 = compareTo0680j_4.serializer();
        RemoteActionCompatParcelizer(-1623174067, compareTo0680j_4.serializer(), 1623174069, iSerializer4, new Object[]{livenessDetectionActivity}, iSerializer6, iSerializer5);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void MediaSessionCompatQueueItem(LivenessDetectionActivity livenessDetectionActivity) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 15;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            livenessDetectionActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        livenessDetectionActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 71;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
    }

    public static final /* synthetic */ void RemoteActionCompatParcelizer(LivenessDetectionActivity livenessDetectionActivity, String str) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 119;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iSerializer = compareTo0680j_4.serializer();
        int iSerializer2 = compareTo0680j_4.serializer();
        int iSerializer3 = compareTo0680j_4.serializer();
        RemoteActionCompatParcelizer(-9616773, compareTo0680j_4.serializer(), 9616776, iSerializer, new Object[]{livenessDetectionActivity, str}, iSerializer3, iSerializer2);
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 99;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
    }

    public static final /* synthetic */ void read(LivenessDetectionActivity livenessDetectionActivity, RoomDatabaseperformClear11 roomDatabaseperformClear11, RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 61;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            livenessDetectionActivity.read(roomDatabaseperformClear11, roomDatabaseExternalSyntheticLambda2);
            throw null;
        }
        livenessDetectionActivity.read(roomDatabaseperformClear11, roomDatabaseExternalSyntheticLambda2);
        int i3 = ResultReceiver + 89;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        LivenessDetectionActivity livenessDetectionActivity = (LivenessDetectionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 59;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iSerializer = compareTo0680j_4.serializer();
        int iSerializer2 = compareTo0680j_4.serializer();
        int iSerializer3 = compareTo0680j_4.serializer();
        RemoteActionCompatParcelizer(-1623819892, compareTo0680j_4.serializer(), 1623819898, iSerializer, new Object[]{livenessDetectionActivity}, iSerializer3, iSerializer2);
        int i4 = ResultReceiver + 73;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ void serializer(LivenessDetectionActivity livenessDetectionActivity, setWebView setwebview) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 41;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        livenessDetectionActivity.serializer(setwebview);
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 13;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void write(LivenessDetectionActivity livenessDetectionActivity) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 21;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        livenessDetectionActivity.ParcelableVolumeInfo();
        int i4 = ResultReceiver + 59;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private static final createImageBitmap PlaybackStateCompat(LivenessDetectionActivity livenessDetectionActivity) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 113;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return livenessDetectionActivity.MediaDescriptionCompat();
        }
        livenessDetectionActivity.MediaDescriptionCompat();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ createFromParcel serializer(LivenessDetectionActivity livenessDetectionActivity) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 9;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            RatingCompat(livenessDetectionActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        createFromParcel createfromparcelRatingCompat = RatingCompat(livenessDetectionActivity);
        int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 11;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 65 / 0;
        }
        return createfromparcelRatingCompat;
    }

    public static /* synthetic */ createFromParcel serializer(LivenessDetectionActivity livenessDetectionActivity, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = ResultReceiver + 13;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return RemoteActionCompatParcelizer(livenessDetectionActivity, getbirthdatefull, i);
        }
        RemoteActionCompatParcelizer(livenessDetectionActivity, getbirthdatefull, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        LivenessDetectionActivity livenessDetectionActivity = (LivenessDetectionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ResultReceiver + 89;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createImageBitmap createimagebitmapPlaybackStateCompat = PlaybackStateCompat(livenessDetectionActivity);
        int i4 = ResultReceiver + 55;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createimagebitmapPlaybackStateCompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ createFromParcel write(LivenessDetectionActivity livenessDetectionActivity, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 39;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object[] objArr = {livenessDetectionActivity, getbirthdatefull, Integer.valueOf(i)};
            int iSerializer = compareTo0680j_4.serializer();
            int iSerializer2 = compareTo0680j_4.serializer();
            throw null;
        }
        Object[] objArr2 = {livenessDetectionActivity, getbirthdatefull, Integer.valueOf(i)};
        int iSerializer3 = compareTo0680j_4.serializer();
        int iSerializer4 = compareTo0680j_4.serializer();
        createFromParcel createfromparcel = (createFromParcel) RemoteActionCompatParcelizer(-143939490, compareTo0680j_4.serializer(), 143939498, iSerializer3, objArr2, compareTo0680j_4.serializer(), iSerializer4);
        int i4 = ResultReceiver + 85;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    public LivenessDetectionActivity() {
        int i = 1;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(LivenessDetectionViewModel.class), new onConfigure(this, 0), new SQLite(this, i), new onConfigure(this, i));
    }

    private static final FrameworkSQLiteOpenHelperOpenHelper IconCompatParcelizer(onViewAttachedToWindow onviewattachedtowindow) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 65;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        FrameworkSQLiteOpenHelperOpenHelper frameworkSQLiteOpenHelperOpenHelper = (FrameworkSQLiteOpenHelperOpenHelper) onviewattachedtowindow.getValue();
        int i3 = ResultReceiver + 77;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return frameworkSQLiteOpenHelperOpenHelper;
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        LivenessDetectionActivity livenessDetectionActivity = (LivenessDetectionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 101;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        livenessDetectionActivity.setResult(i2 % 2 == 0 ? 1 : 0);
        livenessDetectionActivity.finish();
        int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 115;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 45;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setResult(-1);
        finish();
        int i4 = ResultReceiver + 17;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void read(RoomDatabaseperformClear11 roomDatabaseperformClear11, RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 85;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            PlaybackStateCompatCustomAction().read(roomDatabaseperformClear11, roomDatabaseExternalSyntheticLambda2);
        } else {
            PlaybackStateCompatCustomAction().read(roomDatabaseperformClear11, roomDatabaseExternalSyntheticLambda2);
            int i3 = 80 / 0;
        }
    }

    private final void serializer(setWebView setwebview) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 81;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PlaybackStateCompatCustomAction().RemoteActionCompatParcelizer(setwebview);
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 77;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private final void serializer(boolean z) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 119;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            PlaybackStateCompatCustomAction().IconCompatParcelizer(z);
            int i3 = 12 / 0;
        } else {
            PlaybackStateCompatCustomAction().IconCompatParcelizer(z);
        }
        int i4 = ResultReceiver + 115;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private final void ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 121;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        setResult(i2 % 2 == 0 ? 77 : 42);
        finish();
    }

    private final LivenessDetectionViewModel PlaybackStateCompatCustomAction() {
        LivenessDetectionViewModel livenessDetectionViewModel;
        int i = 2 % 2;
        int i2 = ResultReceiver + 99;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            livenessDetectionViewModel = (LivenessDetectionViewModel) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaSessionCompatResultReceiverWrapper();
            int i3 = 57 / 0;
        } else {
            livenessDetectionViewModel = (LivenessDetectionViewModel) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaSessionCompatResultReceiverWrapper();
        }
        int i4 = ResultReceiver + 99;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return livenessDetectionViewModel;
    }

    private static /* synthetic */ Object MediaSessionCompatQueueItem(Object[] objArr) {
        LivenessDetectionActivity livenessDetectionActivity = (LivenessDetectionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 97;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            livenessDetectionActivity.PlaybackStateCompatCustomAction().write(getKeyTemplate.Recording);
            throw null;
        }
        livenessDetectionActivity.PlaybackStateCompatCustomAction().write(getKeyTemplate.Recording);
        int i3 = ResultReceiver + 33;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 33 / 0;
        }
        return null;
    }

    private final void r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 51;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PlaybackStateCompatCustomAction().write(getKeyTemplate.Review);
        int i4 = ResultReceiver + 67;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
    }

    private final void r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 83;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            PlaybackStateCompatCustomAction().write(getKeyTemplate.Instruction);
            int i3 = 9 / 0;
        } else {
            PlaybackStateCompatCustomAction().write(getKeyTemplate.Instruction);
        }
        int i4 = ResultReceiver + 53;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final boolean ComponentActivity() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 61;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean booleanExtra = getIntent().getBooleanExtra("is_dismissable", true);
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 79;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return booleanExtra;
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        LivenessDetectionActivity livenessDetectionActivity = (LivenessDetectionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ResultReceiver + 117;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3;
        int i4 = i2 % 2;
        PassthroughConnection passthroughConnection = livenessDetectionActivity.MediaBrowserCompatMediaItem;
        if (passthroughConnection == null) {
            removeNodeAtDepth.serializer("failureViewModelFactory");
            throw null;
        }
        int i5 = i3 + 59;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return passthroughConnection;
        }
        throw null;
    }

    private static final createFromParcel RatingCompat(LivenessDetectionActivity livenessDetectionActivity) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 61;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        livenessDetectionActivity.PlaybackStateCompatCustomAction().write(getKeyTemplate.Recording);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = ResultReceiver + 101;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        LivenessDetectionActivity livenessDetectionActivity = (LivenessDetectionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ResultReceiver;
        int i3 = i2 + 11;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            DBUtil__DBUtil_androidKtperformInTransactionSuspending2 dBUtil__DBUtil_androidKtperformInTransactionSuspending2 = livenessDetectionActivity.MediaDescriptionCompat;
            throw null;
        }
        DBUtil__DBUtil_androidKtperformInTransactionSuspending2 dBUtil__DBUtil_androidKtperformInTransactionSuspending3 = livenessDetectionActivity.MediaDescriptionCompat;
        if (dBUtil__DBUtil_androidKtperformInTransactionSuspending3 == null) {
            removeNodeAtDepth.serializer("cameraPermissionHandlerFactory");
            throw null;
        }
        int i4 = i2 + 7;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return dBUtil__DBUtil_androidKtperformInTransactionSuspending3;
        }
        throw null;
    }

    public final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 47;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3;
        int i4 = i2 % 2;
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = this.PlaybackStateCompat;
        Object obj = null;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("instructionViewModelProviderFactory");
            throw null;
        }
        int i5 = i3 + 1;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdaudhhxliolpu0hpccqh6voskpny;
        }
        obj.hashCode();
        throw null;
    }

    public final requestGeofences read() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i3 = i2 + 13;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        requestGeofences requestgeofences = this.RatingCompat;
        if (requestgeofences == null) {
            removeNodeAtDepth.serializer("cancellationSignal");
            throw null;
        }
        int i5 = i2 + 7;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return requestgeofences;
        }
        throw null;
    }

    public final SemanticsOwnerKt write() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i3 = i2 + 81;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        SemanticsOwnerKt semanticsOwnerKt = this.MediaSessionCompatQueueItem;
        if (semanticsOwnerKt == null) {
            removeNodeAtDepth.serializer("appStartToInteractiveCoordinator");
            throw null;
        }
        int i4 = i2 + 15;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return semanticsOwnerKt;
    }

    public final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY MediaDescriptionCompat() {
        int i = 2 % 2;
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = this.ParcelableVolumeInfo;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i3 = i2 + 43;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 45;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return r8lambdaudhhxliolpu0hpccqh6voskpny;
    }

    public final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = ResultReceiver;
        int i3 = i2 + 9;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = this.MediaSessionCompatToken;
        Object obj = null;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("recordingViewModelProviderFactory");
            throw null;
        }
        int i5 = i2 + 35;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdaudhhxliolpu0hpccqh6voskpny;
        }
        obj.hashCode();
        throw null;
    }

    public final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i3 = i2 + 3;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = this.MediaSessionCompatResultReceiverWrapper;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("reviewViewModelProviderFactory");
            throw null;
        }
        int i4 = i2 + 89;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdaudhhxliolpu0hpccqh6voskpny;
    }

    public final r8lambdaLZjsjPSXWRendXZH98LKrH6PSs MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 81;
        int i3 = i2 % Fields.SpotShadowColor;
        ResultReceiver = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        r8lambdaLZjsjPSXWRendXZH98LKrH6PSs r8lambdalzjsjpsxwrendxzh98lkrh6pss = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (r8lambdalzjsjpsxwrendxzh98lkrh6pss == null) {
            removeNodeAtDepth.serializer("webNavigator");
            throw null;
        }
        int i4 = i3 + 121;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambdalzjsjpsxwrendxzh98lkrh6pss;
        }
        throw null;
    }

    public final SemanticsOwner RatingCompat() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 59;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3;
        int i4 = i2 % 2;
        SemanticsOwner semanticsOwner = this.PlaybackStateCompatCustomAction;
        if (semanticsOwner == null) {
            removeNodeAtDepth.serializer("performanceTrackingManager");
            throw null;
        }
        int i5 = i3 + 31;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return semanticsOwner;
        }
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        LivenessDetectionActivity livenessDetectionActivity = (LivenessDetectionActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = ResultReceiver + 81;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((BrazeExternalSyntheticLambda45) livenessDetectionActivity.MediaSessionCompatToken()).RemoteActionCompatParcelizer(Uri.parse(str), livenessDetectionActivity);
            int i3 = 8 / 0;
        } else {
            ((BrazeExternalSyntheticLambda45) livenessDetectionActivity.MediaSessionCompatToken()).RemoteActionCompatParcelizer(Uri.parse(str), livenessDetectionActivity);
        }
        int i4 = ResultReceiver + 81;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r5.PlaybackStateCompatCustomAction().RemoteActionCompatParcelizer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r5.ComponentActivity() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r5.ComponentActivity() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r5 = com.roadrunner.liveness.presentation.LivenessDetectionActivity.ResultReceiver + 91;
        com.roadrunner.liveness.presentation.LivenessDetectionActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r5) {
        /*
            r0 = 0
            r5 = r5[r0]
            com.roadrunner.liveness.presentation.LivenessDetectionActivity r5 = (com.roadrunner.liveness.presentation.LivenessDetectionActivity) r5
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.roadrunner.liveness.presentation.LivenessDetectionActivity.ResultReceiver
            int r2 = r2 + 23
            int r3 = r2 % 128
            com.roadrunner.liveness.presentation.LivenessDetectionActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r3
            int r2 = r2 % r1
            r3 = 0
            if (r2 == 0) goto L1e
            boolean r2 = r5.ComponentActivity()
            r4 = 83
            int r4 = r4 / r0
            if (r2 != 0) goto L2e
            goto L24
        L1e:
            boolean r0 = r5.ComponentActivity()
            if (r0 != 0) goto L2e
        L24:
            int r5 = com.roadrunner.liveness.presentation.LivenessDetectionActivity.ResultReceiver
            int r5 = r5 + 91
            int r0 = r5 % 128
            com.roadrunner.liveness.presentation.LivenessDetectionActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r0
            int r5 = r5 % r1
            return r3
        L2e:
            com.roadrunner.liveness.presentation.LivenessDetectionViewModel r5 = r5.PlaybackStateCompatCustomAction()
            r5.RemoteActionCompatParcelizer()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.liveness.presentation.LivenessDetectionActivity.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    private final void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        int i = 2 % 2;
        int iRemoteActionCompatParcelizer = hd.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = hd.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = hd.RemoteActionCompatParcelizer();
        this.ComponentActivity = ((SavedStateRegistryImplExternalSyntheticLambda0) ((DBUtil__DBUtil_androidKtperformInTransactionSuspending2) RemoteActionCompatParcelizer(1263428699, compareTo0680j_4.serializer(), -1263428695, iRemoteActionCompatParcelizer, new Object[]{this}, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer2))).write(new SQLite(this, 0), this);
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 7;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    private final void r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new DividerUiModelImpl$1(this, null, 17), 3);
        int i2 = ResultReceiver + 19;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        UtilsKt.write(this, new DragAndDropTargetModifierNode(new getCompass(this, 1), true, -1398860653));
        int i2 = ResultReceiver + 11;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    private static final createFromParcel RemoteActionCompatParcelizer(LivenessDetectionActivity livenessDetectionActivity, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = 0;
        if ((i & 3) != 2) {
            int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 23;
            ResultReceiver = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, z)) {
            AndroidContentCaptureManagerCompanion.IconCompatParcelizer(new hideTranslatedText[]{getRootSemanticsNode.RemoteActionCompatParcelizer().write(livenessDetectionActivity.RatingCompat()), getRootSemanticsNode.read().write(livenessDetectionActivity.write())}, ExtrasKt.write(-371030061, new getCompass(livenessDetectionActivity, i3), getpostalcode), getpostalcode, 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i6 = ResultReceiver + 83;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Code duplicated, block: B:47:0x0138  */
    /* JADX WARN: Code duplicated, block: B:51:0x0152  */
    /* JADX WARN: Code duplicated, block: B:55:0x016e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0184  */
    /* JADX WARN: Code duplicated, block: B:60:0x0190  */
    /* JADX WARN: Code duplicated, block: B:63:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0199  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c0  */
    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        boolean z;
        String str;
        boolean zIconCompatParcelizer;
        Object objComponentActivity;
        boolean zIconCompatParcelizer2;
        Object objComponentActivity2;
        boolean zIconCompatParcelizer3;
        Object objComponentActivity3;
        boolean zIconCompatParcelizer4;
        Object objComponentActivity4;
        boolean zIconCompatParcelizer5;
        Object objComponentActivity5;
        boolean zIconCompatParcelizer6;
        Object objComponentActivity6;
        int i;
        LivenessDetectionActivity livenessDetectionActivity = (LivenessDetectionActivity) objArr[0];
        getBirthDateFull getbirthdatefull = (getBirthDateFull) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i3 = ResultReceiver + 81;
            int i4 = i3 % Fields.SpotShadowColor;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 35;
            ResultReceiver = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, z)) {
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(livenessDetectionActivity.PlaybackStateCompatCustomAction().read(), getpostalcode, 0);
            relativeMoveTo relativemoveto = asComposePath.read(new toAndroidPathDashPathEffectStyleoQv6xUo[0], getpostalcode);
            getQueryContext getquerycontextSerializer = livenessDetectionActivity.PlaybackStateCompatCustomAction().serializer();
            boolean zRemoteActionCompatParcelizer = IconCompatParcelizer(populateViewStructure_androidKtpopulate7Write).RemoteActionCompatParcelizer();
            String str2 = IconCompatParcelizer(populateViewStructure_androidKtpopulate7Write).read();
            boolean zIconCompatParcelizer7 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer7 || objComponentActivity7 == androidContentCaptureManager) {
                objComponentActivity7 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 11);
                getpostalcode.write(objComponentActivity7);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity7;
            boolean zIconCompatParcelizer8 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer8) {
                objComponentActivity8 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 13);
                getpostalcode.write(objComponentActivity8);
            } else {
                int i8 = ResultReceiver + 47;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (objComponentActivity8 == androidContentCaptureManager) {
                    objComponentActivity8 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 13);
                    getpostalcode.write(objComponentActivity8);
                }
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity8;
            boolean zIconCompatParcelizer9 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
            Object objComponentActivity9 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer9 || objComponentActivity9 == androidContentCaptureManager) {
                objComponentActivity9 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 14);
                getpostalcode.write(objComponentActivity9);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda2 = (registerInAppMessageManagerlambda0) objComponentActivity9;
            boolean zIconCompatParcelizer10 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
            Object objComponentActivity10 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer10) {
                objComponentActivity10 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 15);
                getpostalcode.write(objComponentActivity10);
            } else {
                int i10 = ResultReceiver + 91;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                if (objComponentActivity10 == androidContentCaptureManager) {
                    objComponentActivity10 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 15);
                    getpostalcode.write(objComponentActivity10);
                }
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda3 = (registerInAppMessageManagerlambda0) objComponentActivity10;
            boolean zIconCompatParcelizer11 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
            Object objComponentActivity11 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer11 || objComponentActivity11 == androidContentCaptureManager) {
                objComponentActivity11 = new NestFragment.AnonymousClass1(livenessDetectionActivity, 14);
                getpostalcode.write(objComponentActivity11);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda4 = (registerInAppMessageManagerlambda0) objComponentActivity11;
            SparseArraySerializerSparseArraySurrogateCompanion sparseArraySerializerSparseArraySurrogateCompanion = livenessDetectionActivity.ComponentActivity;
            if (sparseArraySerializerSparseArraySurrogateCompanion == null) {
                removeNodeAtDepth.serializer("cameraPermissionHandler");
                throw null;
            }
            boolean zIconCompatParcelizer12 = getpostalcode.IconCompatParcelizer(sparseArraySerializerSparseArraySurrogateCompanion);
            Object objComponentActivity12 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer12) {
                str = str2;
            } else {
                int i12 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 5;
                str = str2;
                ResultReceiver = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (objComponentActivity12 == androidContentCaptureManager) {
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda5 = (registerInAppMessageManagerlambda0) objComponentActivity12;
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new RoomDatabase$createConnectionManager$2(livenessDetectionActivity);
                    getpostalcode.write(objComponentActivity);
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda6 = (registerInAppMessageManagerlambda0) objComponentActivity;
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 17);
                    getpostalcode.write(objComponentActivity2);
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda7 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer3 || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 18);
                    getpostalcode.write(objComponentActivity3);
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda8 = (registerInAppMessageManagerlambda0) objComponentActivity3;
                zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
                objComponentActivity4 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer4 || objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new NestFragment.AnonymousClass1(livenessDetectionActivity, 12);
                    getpostalcode.write(objComponentActivity4);
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda9 = (registerInAppMessageManagerlambda0) objComponentActivity4;
                zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
                objComponentActivity5 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer5) {
                    objComponentActivity5 = new NestFragment.AnonymousClass1(livenessDetectionActivity, 13);
                    getpostalcode.write(objComponentActivity5);
                    int i14 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 77;
                    ResultReceiver = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                } else {
                    i = ResultReceiver + 47;
                    r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        int i16 = 56 / 0;
                        if (objComponentActivity5 == androidContentCaptureManager) {
                            objComponentActivity5 = new NestFragment.AnonymousClass1(livenessDetectionActivity, 13);
                            getpostalcode.write(objComponentActivity5);
                            int i17 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 77;
                            ResultReceiver = i17 % Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                        }
                    } else if (objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new NestFragment.AnonymousClass1(livenessDetectionActivity, 13);
                        getpostalcode.write(objComponentActivity5);
                        int i19 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 77;
                        ResultReceiver = i19 % Fields.SpotShadowColor;
                        int i110 = i19 % 2;
                    }
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda10 = (registerInAppMessageManagerlambda0) objComponentActivity5;
                zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
                objComponentActivity6 = getpostalcode.ComponentActivity();
                if ((!zIconCompatParcelizer6) || objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 12);
                    getpostalcode.write(objComponentActivity6);
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda11 = (registerInAppMessageManagerlambda0) objComponentActivity6;
                boolean zComponentActivity = livenessDetectionActivity.ComponentActivity();
                int iSerializer = compareTo0680j_4.serializer();
                int iSerializer2 = compareTo0680j_4.serializer();
                PassthroughConnection passthroughConnection = (PassthroughConnection) RemoteActionCompatParcelizer(-723608722, compareTo0680j_4.serializer(), 723608729, iSerializer, new Object[]{livenessDetectionActivity}, compareTo0680j_4.serializer(), iSerializer2);
                onPostMigrate onpostmigrateIconCompatParcelizer = livenessDetectionActivity.PlaybackStateCompatCustomAction().IconCompatParcelizer();
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda1;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda2;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda3;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda5;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) registerinappmessagemanagerlambda6;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda7;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda8;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda4;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda9;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda10;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k7 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda11;
                String str3 = str;
                DBUtil__DBUtil_androidKtperformBlocking1.serializer(relativemoveto, getquerycontextSerializer, zRemoteActionCompatParcelizer, str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdardpfsr94j4iebcwx_kpqzpm8k7, zComponentActivity, livenessDetectionActivity.MediaBrowserCompatMediaItem(), livenessDetectionActivity.MediaMetadataCompat(), livenessDetectionActivity.MediaSessionCompatQueueItem(), passthroughConnection, onpostmigrateIconCompatParcelizer, getpostalcode, 64, 0, 0);
            }
            objComponentActivity12 = new LoginActivity$onCreate$1$1$1$1$5$1(sparseArraySerializerSparseArraySurrogateCompanion);
            getpostalcode.write(objComponentActivity12);
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda12 = (registerInAppMessageManagerlambda0) objComponentActivity12;
            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer) {
                objComponentActivity = new RoomDatabase$createConnectionManager$2(livenessDetectionActivity);
                getpostalcode.write(objComponentActivity);
            } else {
                objComponentActivity = new RoomDatabase$createConnectionManager$2(livenessDetectionActivity);
                getpostalcode.write(objComponentActivity);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda13 = (registerInAppMessageManagerlambda0) objComponentActivity;
            zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2) {
                objComponentActivity2 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 17);
                getpostalcode.write(objComponentActivity2);
            } else {
                objComponentActivity2 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 17);
                getpostalcode.write(objComponentActivity2);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda14 = (registerInAppMessageManagerlambda0) objComponentActivity2;
            zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
            objComponentActivity3 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3) {
                objComponentActivity3 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 18);
                getpostalcode.write(objComponentActivity3);
            } else {
                objComponentActivity3 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 18);
                getpostalcode.write(objComponentActivity3);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda15 = (registerInAppMessageManagerlambda0) objComponentActivity3;
            zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
            objComponentActivity4 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer4) {
                objComponentActivity4 = new NestFragment.AnonymousClass1(livenessDetectionActivity, 12);
                getpostalcode.write(objComponentActivity4);
            } else {
                objComponentActivity4 = new NestFragment.AnonymousClass1(livenessDetectionActivity, 12);
                getpostalcode.write(objComponentActivity4);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda16 = (registerInAppMessageManagerlambda0) objComponentActivity4;
            zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
            objComponentActivity5 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer5) {
                i = ResultReceiver + 47;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    int i111 = 56 / 0;
                    if (objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new NestFragment.AnonymousClass1(livenessDetectionActivity, 13);
                        getpostalcode.write(objComponentActivity5);
                        int i112 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 77;
                        ResultReceiver = i112 % Fields.SpotShadowColor;
                        int i113 = i112 % 2;
                    }
                } else if (objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = new NestFragment.AnonymousClass1(livenessDetectionActivity, 13);
                    getpostalcode.write(objComponentActivity5);
                    int i114 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 77;
                    ResultReceiver = i114 % Fields.SpotShadowColor;
                    int i115 = i114 % 2;
                }
            } else {
                objComponentActivity5 = new NestFragment.AnonymousClass1(livenessDetectionActivity, 13);
                getpostalcode.write(objComponentActivity5);
                int i116 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 77;
                ResultReceiver = i116 % Fields.SpotShadowColor;
                int i117 = i116 % 2;
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda17 = (registerInAppMessageManagerlambda0) objComponentActivity5;
            zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(livenessDetectionActivity);
            objComponentActivity6 = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer6) {
                objComponentActivity6 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 12);
                getpostalcode.write(objComponentActivity6);
            } else {
                objComponentActivity6 = new LoginActivity$onCreate$1$1$1$1$5$1(livenessDetectionActivity, 12);
                getpostalcode.write(objComponentActivity6);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda18 = (registerInAppMessageManagerlambda0) objComponentActivity6;
            boolean zComponentActivity2 = livenessDetectionActivity.ComponentActivity();
            int iSerializer3 = compareTo0680j_4.serializer();
            int iSerializer4 = compareTo0680j_4.serializer();
            PassthroughConnection passthroughConnection2 = (PassthroughConnection) RemoteActionCompatParcelizer(-723608722, compareTo0680j_4.serializer(), 723608729, iSerializer3, new Object[]{livenessDetectionActivity}, compareTo0680j_4.serializer(), iSerializer4);
            onPostMigrate onpostmigrateIconCompatParcelizer2 = livenessDetectionActivity.PlaybackStateCompatCustomAction().IconCompatParcelizer();
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k8 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k9 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda1;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k10 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda2;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k11 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda3;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k12 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda12;
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) registerinappmessagemanagerlambda13;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k13 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda14;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k14 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda15;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda4;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda16;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda17;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k15 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda18;
            String str4 = str;
            DBUtil__DBUtil_androidKtperformBlocking1.serializer(relativemoveto, getquerycontextSerializer, zRemoteActionCompatParcelizer, str4, r8lambdardpfsr94j4iebcwx_kpqzpm8k8, r8lambdardpfsr94j4iebcwx_kpqzpm8k9, r8lambdardpfsr94j4iebcwx_kpqzpm8k10, r8lambdardpfsr94j4iebcwx_kpqzpm8k11, r8lambdardpfsr94j4iebcwx_kpqzpm8k12, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdardpfsr94j4iebcwx_kpqzpm8k13, r8lambdardpfsr94j4iebcwx_kpqzpm8k14, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaunavo3sxub_pc9xroryotnrlvsm5, r8lambdaunavo3sxub_pc9xroryotnrlvsm6, r8lambdardpfsr94j4iebcwx_kpqzpm8k15, zComponentActivity2, livenessDetectionActivity.MediaBrowserCompatMediaItem(), livenessDetectionActivity.MediaMetadataCompat(), livenessDetectionActivity.MediaSessionCompatQueueItem(), passthroughConnection2, onpostmigrateIconCompatParcelizer2, getpostalcode, 64, 0, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i20 = ResultReceiver + 125;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
        }
        return createFromParcel.INSTANCE;
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

    public final PassthroughConnection RemoteActionCompatParcelizer() {
        int iSerializer = compareTo0680j_4.serializer();
        int iSerializer2 = compareTo0680j_4.serializer();
        int iSerializer3 = compareTo0680j_4.serializer();
        return (PassthroughConnection) RemoteActionCompatParcelizer(-723608722, compareTo0680j_4.serializer(), 723608729, iSerializer, new Object[]{this}, iSerializer3, iSerializer2);
    }

    public final DBUtil__DBUtil_androidKtperformInTransactionSuspending2 serializer() {
        int iRemoteActionCompatParcelizer = hd.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = hd.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = hd.RemoteActionCompatParcelizer();
        return (DBUtil__DBUtil_androidKtperformInTransactionSuspending2) RemoteActionCompatParcelizer(1263428699, compareTo0680j_4.serializer(), -1263428695, iRemoteActionCompatParcelizer, new Object[]{this}, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer2);
    }

    private final void IconCompatParcelizer(String str) {
        int iSerializer = compareTo0680j_4.serializer();
        int iSerializer2 = compareTo0680j_4.serializer();
        int iSerializer3 = compareTo0680j_4.serializer();
        RemoteActionCompatParcelizer(-9616773, compareTo0680j_4.serializer(), 9616776, iSerializer, new Object[]{this, str}, iSerializer3, iSerializer2);
    }

    private static final createFromParcel IconCompatParcelizer(LivenessDetectionActivity livenessDetectionActivity, getBirthDateFull getbirthdatefull, int i) {
        Object[] objArr = {livenessDetectionActivity, getbirthdatefull, Integer.valueOf(i)};
        int iSerializer = compareTo0680j_4.serializer();
        int iSerializer2 = compareTo0680j_4.serializer();
        return (createFromParcel) RemoteActionCompatParcelizer(-143939490, compareTo0680j_4.serializer(), 143939498, iSerializer, objArr, compareTo0680j_4.serializer(), iSerializer2);
    }

    private final void r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        int iSerializer = compareTo0680j_4.serializer();
        int iSerializer2 = compareTo0680j_4.serializer();
        int iSerializer3 = compareTo0680j_4.serializer();
        RemoteActionCompatParcelizer(-1623174067, compareTo0680j_4.serializer(), 1623174069, iSerializer, new Object[]{this}, iSerializer3, iSerializer2);
    }

    private final void ResultReceiver() {
        int iSerializer = compareTo0680j_4.serializer();
        int iSerializer2 = compareTo0680j_4.serializer();
        int iSerializer3 = compareTo0680j_4.serializer();
        RemoteActionCompatParcelizer(2049215811, compareTo0680j_4.serializer(), -2049215806, iSerializer, new Object[]{this}, iSerializer3, iSerializer2);
    }

    private final void PlaybackStateCompat() {
        int iSerializer = compareTo0680j_4.serializer();
        int iSerializer2 = compareTo0680j_4.serializer();
        int iSerializer3 = compareTo0680j_4.serializer();
        RemoteActionCompatParcelizer(-1623819892, compareTo0680j_4.serializer(), 1623819898, iSerializer, new Object[]{this}, iSerializer3, iSerializer2);
    }

    public static final /* synthetic */ void RemoteActionCompatParcelizer(LivenessDetectionActivity livenessDetectionActivity) {
        int iSerializer = compareTo0680j_4.serializer();
        int iSerializer2 = compareTo0680j_4.serializer();
        int iSerializer3 = compareTo0680j_4.serializer();
        RemoteActionCompatParcelizer(-218475005, compareTo0680j_4.serializer(), 218475005, iSerializer, new Object[]{livenessDetectionActivity}, iSerializer3, iSerializer2);
    }

    public static /* synthetic */ createImageBitmap read(LivenessDetectionActivity livenessDetectionActivity) {
        int iSerializer = compareTo0680j_4.serializer();
        int iSerializer2 = compareTo0680j_4.serializer();
        int iSerializer3 = compareTo0680j_4.serializer();
        return (createImageBitmap) RemoteActionCompatParcelizer(2098210808, compareTo0680j_4.serializer(), -2098210807, iSerializer, new Object[]{livenessDetectionActivity}, iSerializer3, iSerializer2);
    }
}
