package androidx.camera.video;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavArgsLazy;
import androidx.sqlite.SQLite;
import bo.app.n5;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzb;
import com.google.android.gms.tasks.Task;
import com.google.re2j.Machine$Queue;
import com.huawei.location.ut;
import com.huawei.wisesecurity.ucs.credential.outer.HACapability;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.EntrancePictureFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.reason.AmountChangingReasonDialogFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.delivery.repository.StateV3DeliveryProvider;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.domain.util.RetryWithDelay;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationContainerFragment;
import com.roadrunner.nafath.presentation.ui.NafathModalFragment;
import com.roadrunner.recentdeliveries.presentation.RecentDeliveriesFragment;
import com.roadrunner.rider.state.worksettings.presentation.SettingsInfoBottomSheet;
import com.roadrunner.settings.subscreens.chatLanguageSelector.ChatLanguageSelectorFragment;
import com.roadrunner.sidemenu.photoId.preview.PhotoIdPreviewFragment;
import com.sentiance.core.model.events.E$b;
import com.sentiance.okhttp3.u$a;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.util.UrlUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import o.AnimatedContentTransitionScopeImplSizeModifierNodemeasure1;
import o.AnimatedEnterExitMeasurePolicy;
import o.AnimatedVisibilityKtAnimatedVisibilityImpl11;
import o.BrazeExternalSyntheticLambda45;
import o.CacheDrawScopeonDrawBehind1;
import o.CameraXExternalSyntheticLambda0;
import o.CollectionInfo;
import o.CollectionItemInfo;
import o.Colordefault;
import o.CrossfadeKt;
import o.EnterExitTransitionKtexpandHorizontally2;
import o.FeatureCombinationQueryImplExternalSyntheticLambda2;
import o.FocusMeteringAction;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2;
import o.LayoutNodeSubcompositionsStateScope;
import o.OnePixelShiftQuirk;
import o.OuterPlacementScope;
import o.ParentDataModifierDefaultImpls;
import o.PreferenceGroupAdapter;
import o.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import o.PreviewExternalSyntheticLambda0;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.PreviewOrientationIncorrectQuirk;
import o.PreviewView1ExternalSyntheticLambda2;
import o.ProgressBarRangeInfo;
import o.ReportedVideoQualityNotSupportedQuirk;
import o.SurfaceRequest;
import o.SurfaceViewNotCroppedByParentQuirk;
import o.Toolbar;
import o.VideoEncoderCrashQuirk;
import o.accessgetGreencp;
import o.accessgetLightGraycp;
import o.accessgetNumPad0cp;
import o.accessgetNumPad1cp;
import o.accessgetNumPadRightParenthesiscp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTextBottomcp;
import o.accessgetTvAudioDescriptionMixingVolumeDowncp;
import o.accessgetTvAudioDescriptioncp;
import o.accessgetTvContentsMenucp;
import o.accessroundToPxR2X_6ojd;
import o.accessrunAnimations;
import o.accesstoDpSizekrfVVMjd;
import o.accesstoPxR2X_6ojd;
import o.accesstoRectjd;
import o.animate;
import o.animateDecay;
import o.awaitNavigationRoutes;
import o.clipPathmtrdDEdefault;
import o.component27NrFUSI;
import o.decode;
import o.drawArcyD3GUKodefault;
import o.drawCircleVaOC9Bgdefault;
import o.executeQuery;
import o.getAndroidCanvas;
import o.getBEK5gGoQ;
import o.getColorIntegerOrNulllambda0;
import o.getColumnCount;
import o.getDataStoreFileName;
import o.getDefaultImageFormat;
import o.getDisplayManager;
import o.getDrawParams;
import o.getEotfFuncui_graphics;
import o.getF;
import o.getFailureMessage;
import o.getInflatedId;
import o.getMeasurementConstraintsmsEJaDk;
import o.getMediaPauseEK5gGoQ;
import o.getMinusEK5gGoQ;
import o.getNumPadAddEK5gGoQ;
import o.getNumPadDeleteEK5gGoQ;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.getSteps;
import o.getSurfaceClass;
import o.getX;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isHiddenannotations;
import o.lambda31;
import o.lambdaprocessAndResolveDeeplink15;
import o.mapToBase;
import o.mergeJsonObjects;
import o.onDrawWithContent;
import o.r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdajyieMEPHfDZ0H9VbS9ICj8_yOE;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdapkx6kfYbgP4lEOWkebovjPb0ug;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.readInstallReferrerHuaweiAppGallery;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.requestSingleLocationUpdatelambda1;
import o.seekAnimationsanimation_core;
import o.setBaselineAlignedChildIndex;
import o.setBrightness;
import o.setController;
import o.setInflatedId;
import o.setInitialAnimationsanimation_core;
import o.setSdkAuthenticationSignature;
import o.setTextFuture;
import o.shutdown;
import o.stopInstancelambda11;
import o.tintxETnrds;
import o.updateInitialValuesanimation_core;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes.dex */
public final class Recorder$3 implements HACapability, VideoEncoderCrashQuirk, getDefaultImageFormat, animateDecay, shutdown, Colordefault, r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34, OuterPlacementScope, accessgetNumPadRightParenthesiscp {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public static CollectionItemInfo read;
    public final /* synthetic */ int IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object RemoteActionCompatParcelizer;

    @Override // o.animateDecay
    public void IconCompatParcelizer(seekAnimationsanimation_core seekanimationsanimation_core) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 11;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.huawei.wisesecurity.ucs.credential.outer.HACapability
    public void onEvent(Context context, String str, CollectionInfo collectionInfo) {
        synchronized (Recorder$3.class) {
            if (read == null) {
                read = new CollectionItemInfo(context, (String) this.RemoteActionCompatParcelizer, new IsFixableByRetry(1));
            }
            CollectionItemInfo collectionItemInfo = read;
            if (collectionItemInfo != null) {
                if (ProgressBarRangeInfo.REPORT_ALWAYS == ((ProgressBarRangeInfo) this.MediaBrowserCompatMediaItem)) {
                    getSteps.read("BaseReporter", "set OobeCheckOff.", new Object[0]);
                    collectionItemInfo.IconCompatParcelizer.serializer = false;
                }
                CollectionItemInfo collectionItemInfo2 = read;
                collectionItemInfo2.getClass();
                collectionItemInfo2.read(context, collectionInfo, getColumnCount.HIANALYTICS_MAINTENANCE);
            }
        }
    }

    @Override // o.shutdown
    public SurfaceRequest write(int i) {
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 61;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            read(i);
            throw null;
        }
        SurfaceRequest surfaceRequest = read(i);
        int i4 = MediaDescriptionCompat + 97;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return surfaceRequest;
    }

    public void write(String str) {
        getX getx;
        synchronized (this) {
            getx = (getX) ((HashMap) this.MediaBrowserCompatMediaItem).get(str);
            UrlUtils.serializer(getx, "Argument must not be null");
            int i = getx.RemoteActionCompatParcelizer;
            if (i >= 1) {
                int i2 = i - 1;
                getx.RemoteActionCompatParcelizer = i2;
                if (i2 == 0) {
                    getX getx2 = (getX) ((HashMap) this.MediaBrowserCompatMediaItem).remove(str);
                    if (getx2.equals(getx)) {
                        component27NrFUSI component27nrfusi = (component27NrFUSI) this.RemoteActionCompatParcelizer;
                        synchronized (component27nrfusi.RemoteActionCompatParcelizer) {
                            if (component27nrfusi.RemoteActionCompatParcelizer.size() < 10) {
                                component27nrfusi.RemoteActionCompatParcelizer.offer(getx2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + getx + ", but actually removed: " + getx2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + getx.RemoteActionCompatParcelizer);
            }
        }
        getx.read.unlock();
    }

    public Recorder$3(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, int i) {
        this.IconCompatParcelizer = i;
        int i2 = 11;
        switch (i) {
            case 16:
                this.MediaBrowserCompatMediaItem = getstyleable_vector_drawable_group_rotation;
                this.RemoteActionCompatParcelizer = new isHiddenannotations(new executeQuery(getstyleable_vector_drawable_group_rotation.shutdown, i2), getstyleable_vector_drawable_group_rotation.getEntries, getstyleable_vector_drawable_group_rotation.toClipEntry, getstyleable_vector_drawable_group_rotation.trimToSize, 4);
                break;
            case 17:
            default:
                this.MediaBrowserCompatMediaItem = getstyleable_vector_drawable_group_rotation;
                this.RemoteActionCompatParcelizer = new readInstallReferrerHuaweiAppGallery(7);
                break;
            case 18:
                this.MediaBrowserCompatMediaItem = getstyleable_vector_drawable_group_rotation;
                this.RemoteActionCompatParcelizer = new lambda31(getstyleable_vector_drawable_group_rotation.Contentfoundation, (getColorIntegerOrNulllambda0) new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(new accessgetTextBottomcp(getstyleable_vector_drawable_group_rotation.AndroidCursorHandle_androidKt, getstyleable_vector_drawable_group_rotation.scroll, 5), 4), (getColorIntegerOrNulllambda0) new accessgetTextBottomcp(getstyleable_vector_drawable_group_rotation.setItemInvoker, getstyleable_vector_drawable_group_rotation.setForceShowIcon, 6), 3);
                break;
            case 19:
                this.MediaBrowserCompatMediaItem = getstyleable_vector_drawable_group_rotation;
                this.RemoteActionCompatParcelizer = new lambdaprocessAndResolveDeeplink15(getstyleable_vector_drawable_group_rotation.setImageResource, 2);
                break;
            case 20:
                this.MediaBrowserCompatMediaItem = getstyleable_vector_drawable_group_rotation;
                int i3 = 18;
                this.RemoteActionCompatParcelizer = new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(new requestSingleLocationUpdatelambda1(getstyleable_vector_drawable_group_rotation.LazyLayoutPagerKt, i3), i3);
                break;
            case 21:
                this.MediaBrowserCompatMediaItem = getstyleable_vector_drawable_group_rotation;
                readInstallReferrerHuaweiAppGallery readinstallreferrerhuaweiappgallery = new readInstallReferrerHuaweiAppGallery(22);
                lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15 = new lambdaprocessAndResolveDeeplink15(getstyleable_vector_drawable_group_rotation.setNavigationIcon, 12);
                readInstallReferrerHuaweiAppGallery readinstallreferrerhuaweiappgallery2 = new readInstallReferrerHuaweiAppGallery(21);
                mergeJsonObjects mergejsonobjects = getstyleable_vector_drawable_group_rotation.toClipEntry;
                int i4 = 10;
                this.RemoteActionCompatParcelizer = new getDataStoreFileName(new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(new isHiddenannotations(getstyleable_vector_drawable_group_rotation.accessprocessDragStop, getstyleable_vector_drawable_group_rotation.getSupportCompoundDrawablesTintList, getstyleable_vector_drawable_group_rotation.AfRegionFlipHorizontallyQuirk, new PreferenceGroupAdapter((getColorIntegerOrNulllambda0) new isHiddenannotations(readinstallreferrerhuaweiappgallery, lambdaprocessandresolvedeeplink15, readinstallreferrerhuaweiappgallery2, mergejsonobjects, 9), (mergeJsonObjects) getstyleable_vector_drawable_group_rotation.createnHHXs2Y, i4), 8), 9), getstyleable_vector_drawable_group_rotation.trimToSize, new lambdaprocessAndResolveDeeplink15(getstyleable_vector_drawable_group_rotation.AbstractClickableNodeonKeyEvent1, i2), mergejsonobjects, new lambdaprocessAndResolveDeeplink15(getstyleable_vector_drawable_group_rotation.setItemInvoker, i4), getstyleable_vector_drawable_group_rotation.toStringimpl);
                break;
            case 22:
                this.MediaBrowserCompatMediaItem = getstyleable_vector_drawable_group_rotation;
                this.RemoteActionCompatParcelizer = new PreferenceGroupAdapter((getColorIntegerOrNulllambda0) new setSdkAuthenticationSignature(getstyleable_vector_drawable_group_rotation.setBackInvokedCallbackEnabled, getstyleable_vector_drawable_group_rotation.holdsCameraSlot, 1), (mergeJsonObjects) new lambdaprocessAndResolveDeeplink15(getstyleable_vector_drawable_group_rotation.toClipEntry, 29), 15);
                break;
            case 23:
                this.MediaBrowserCompatMediaItem = getstyleable_vector_drawable_group_rotation;
                this.RemoteActionCompatParcelizer = new getFailureMessage(getstyleable_vector_drawable_group_rotation.donePlaying, getstyleable_vector_drawable_group_rotation.PreviewGreenTintQuirk, getstyleable_vector_drawable_group_rotation.Contentfoundation, getstyleable_vector_drawable_group_rotation.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk, 2);
                break;
        }
    }

    @Override // o.getDefaultImageFormat
    public void read() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 81;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((ut) this.MediaBrowserCompatMediaItem).read();
        int i4 = MediaMetadataCompat + 45;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.getDefaultImageFormat
    public void serializer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 23;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((ut) this.MediaBrowserCompatMediaItem).serializer();
            throw null;
        }
        ((ut) this.MediaBrowserCompatMediaItem).serializer();
        int i3 = MediaMetadataCompat + 15;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // o.animateDecay
    public void serializer(EncodeException encodeException) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 89;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((onDrawWithContent) this.MediaBrowserCompatMediaItem).serializer(encodeException);
        } else {
            ((onDrawWithContent) this.MediaBrowserCompatMediaItem).serializer(encodeException);
            throw null;
        }
    }

    @Override // o.getDefaultImageFormat
    public int MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 89;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((ut) this.MediaBrowserCompatMediaItem).MediaBrowserCompatMediaItem();
            throw null;
        }
        int iMediaBrowserCompatMediaItem = ((ut) this.MediaBrowserCompatMediaItem).MediaBrowserCompatMediaItem();
        int i3 = MediaDescriptionCompat + 11;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iMediaBrowserCompatMediaItem;
        }
        throw null;
    }

    @Override // o.getDefaultImageFormat
    public int MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 121;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((ut) this.MediaBrowserCompatMediaItem).MediaDescriptionCompat();
            throw null;
        }
        int iMediaDescriptionCompat = ((ut) this.MediaBrowserCompatMediaItem).MediaDescriptionCompat();
        int i3 = MediaMetadataCompat + 89;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iMediaDescriptionCompat;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.getDefaultImageFormat
    public int MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 95;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((ut) this.MediaBrowserCompatMediaItem).MediaMetadataCompat();
            throw null;
        }
        int iMediaMetadataCompat = ((ut) this.MediaBrowserCompatMediaItem).MediaMetadataCompat();
        int i3 = MediaDescriptionCompat + 17;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
        return iMediaMetadataCompat;
    }

    @Override // o.Colordefault
    public boolean MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 29;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zMediaSessionCompatQueueItem = ((Colordefault) this.MediaBrowserCompatMediaItem).MediaSessionCompatQueueItem();
        int i4 = MediaMetadataCompat + 123;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return zMediaSessionCompatQueueItem;
    }

    @Override // o.animateDecay
    public void MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((onDrawWithContent) this.MediaBrowserCompatMediaItem).RemoteActionCompatParcelizer(null);
        int i4 = MediaDescriptionCompat + 125;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
    }

    @Override // o.getDefaultImageFormat
    public Surface RatingCompat() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 13;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Surface surfaceRatingCompat = ((ut) this.MediaBrowserCompatMediaItem).RatingCompat();
        int i4 = MediaMetadataCompat + 81;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return surfaceRatingCompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getDefaultImageFormat
    public int RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 11;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iRemoteActionCompatParcelizer = ((ut) this.MediaBrowserCompatMediaItem).RemoteActionCompatParcelizer();
        int i4 = MediaMetadataCompat + 25;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iRemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.shutdown
    public boolean serializer(int i) {
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 29;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (read(i) == null) {
            return false;
        }
        int i5 = MediaMetadataCompat + 21;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        return i5 % 2 != 0;
    }

    @Override // o.getDefaultImageFormat
    public getInflatedId IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 67;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FeatureCombinationQueryImplExternalSyntheticLambda2 featureCombinationQueryImplExternalSyntheticLambda2 = read(((ut) this.MediaBrowserCompatMediaItem).IconCompatParcelizer());
        int i4 = MediaDescriptionCompat + 97;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return featureCombinationQueryImplExternalSyntheticLambda2;
    }

    @Override // o.getDefaultImageFormat
    public getInflatedId write() {
        FeatureCombinationQueryImplExternalSyntheticLambda2 featureCombinationQueryImplExternalSyntheticLambda2;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 43;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            featureCombinationQueryImplExternalSyntheticLambda2 = read(((ut) this.MediaBrowserCompatMediaItem).write());
            int i3 = 18 / 0;
        } else {
            featureCombinationQueryImplExternalSyntheticLambda2 = read(((ut) this.MediaBrowserCompatMediaItem).write());
        }
        int i4 = MediaDescriptionCompat + 1;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return featureCombinationQueryImplExternalSyntheticLambda2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static drawCircleVaOC9Bgdefault read(ArrayList arrayList, getF getf) {
        int i = 2 % 2;
        drawCircleVaOC9Bgdefault drawcirclevaoc9bgdefault = new drawCircleVaOC9Bgdefault(new Recorder$3(arrayList, getf, false, 14), 0 == true ? 1 : 0);
        int i2 = MediaMetadataCompat + 93;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
        return drawcirclevaoc9bgdefault;
    }

    @Override // o.getDefaultImageFormat
    public void RemoteActionCompatParcelizer(getSurfaceClass getsurfaceclass, Executor executor) {
        int i = 2 % 2;
        ((ut) this.MediaBrowserCompatMediaItem).RemoteActionCompatParcelizer(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(this, 5, getsurfaceclass), executor);
        int i2 = MediaMetadataCompat + 73;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public static drawCircleVaOC9Bgdefault RemoteActionCompatParcelizer(ArrayList arrayList, getF getf) {
        int i = 2 % 2;
        drawCircleVaOC9Bgdefault drawcirclevaoc9bgdefault = new drawCircleVaOC9Bgdefault(new Recorder$3(arrayList, getf, false, 14), 1);
        int i2 = MediaMetadataCompat + 55;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return drawcirclevaoc9bgdefault;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(Recorder$3 recorder$3, CacheDrawScopeonDrawBehind1 cacheDrawScopeonDrawBehind1, float f, int i) {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 39;
        int i4 = i3 % Fields.SpotShadowColor;
        MediaMetadataCompat = i4;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 2) != 0) {
            int i5 = i4 + 81;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            f = i5 % 2 == 0 ? Dp.m3673constructorimpl(2.0f) : Dp.m3673constructorimpl(0.0f);
        }
        recorder$3.IconCompatParcelizer(cacheDrawScopeonDrawBehind1, f, Dp.m3673constructorimpl(0.0f));
    }

    public static drawArcyD3GUKodefault IconCompatParcelizer(ImageDecoder.Source source, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) throws IOException {
        int i3 = 2 % 2;
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new getDrawParams(i, i2, geteotffuncui_graphics));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new drawArcyD3GUKodefault(3, (AnimatedImageDrawable) drawableDecodeDrawable);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(drawableDecodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        int i4 = MediaMetadataCompat + 49;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    public SurfaceRequest read(int i) {
        int i2 = 2 % 2;
        HashMap map = (HashMap) this.RemoteActionCompatParcelizer;
        Object obj = null;
        if (map != null) {
            int i3 = MediaMetadataCompat + 101;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (map.containsKey(Integer.valueOf(i))) {
                int i5 = MediaDescriptionCompat + 33;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return (SurfaceRequest) map.get(Integer.valueOf(i));
                }
                obj.hashCode();
                throw null;
            }
        }
        SurfaceRequest surfaceRequestWrite = ((shutdown) this.MediaBrowserCompatMediaItem).write(i);
        int i6 = MediaMetadataCompat + 67;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return surfaceRequestWrite;
        }
        throw null;
    }

    @Override // o.OuterPlacementScope
    public Object then(Task task) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 21;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Rpc rpc = (Rpc) this.MediaBrowserCompatMediaItem;
        Bundle bundle = (Bundle) this.RemoteActionCompatParcelizer;
        rpc.getClass();
        if (!task.isSuccessful()) {
            int i4 = MediaDescriptionCompat + 103;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 == null || !bundle2.containsKey("google.messenger")) {
            return task;
        }
        int i6 = MediaMetadataCompat + 23;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return rpc.RemoteActionCompatParcelizer(bundle).onSuccessTask(accessgetNumPad1cp.read, accessgetNumPad0cp.read);
    }

    @Override // o.VideoEncoderCrashQuirk
    public void a_(Object obj) throws Throwable {
        int i = 2 % 2;
        if (this.IconCompatParcelizer != 3) {
            SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk = (SurfaceViewNotCroppedByParentQuirk) obj;
            surfaceViewNotCroppedByParentQuirk.getClass();
            try {
                ((PreviewView1ExternalSyntheticLambda2) ((NavArgsLazy) this.RemoteActionCompatParcelizer).MediaSessionCompatQueueItem).read(surfaceViewNotCroppedByParentQuirk);
                int i2 = MediaMetadataCompat + 75;
                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            } catch (ProcessingException e) {
                setInflatedId.read("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
                return;
            }
        }
        if (((Camera2CameraImpl) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer.IconCompatParcelizer() == 2) {
            int i4 = MediaMetadataCompat + 9;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                setTextFuture settextfuture = ((Camera2CameraImpl) this.RemoteActionCompatParcelizer)._init_lambda1;
                setTextFuture settextfuture2 = setTextFuture.OPENED;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (((Camera2CameraImpl) this.RemoteActionCompatParcelizer)._init_lambda1 == setTextFuture.OPENED) {
                ((Camera2CameraImpl) this.RemoteActionCompatParcelizer).read(setTextFuture.CONFIGURED);
                int i5 = MediaMetadataCompat + 85;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 2 / 5;
                }
            }
        }
    }

    public void IconCompatParcelizer(CacheDrawScopeonDrawBehind1 cacheDrawScopeonDrawBehind1, float f, float f2) {
        String str;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 67;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = cacheDrawScopeonDrawBehind1.read;
        if (i4 == 0) {
            str = "top";
        } else if (i4 != 1) {
            SentryLogcatAdapter.serializer("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            int i5 = MediaDescriptionCompat + 61;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            str = "top";
        } else {
            str = "bottom";
        }
        accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd = new accessroundToPxR2X_6ojd(new char[0]);
        accessroundtopxr2x_6ojd.serializer(accesstoDpSizekrfVVMjd.serializer(cacheDrawScopeonDrawBehind1.RemoteActionCompatParcelizer.toString()));
        accessroundtopxr2x_6ojd.serializer(accesstoDpSizekrfVVMjd.serializer(str));
        accessroundtopxr2x_6ojd.serializer(new accesstoRectjd(f));
        accessroundtopxr2x_6ojd.serializer(new accesstoRectjd(f2));
        ((accesstoPxR2X_6ojd) this.MediaBrowserCompatMediaItem).RemoteActionCompatParcelizer((String) this.RemoteActionCompatParcelizer, accessroundtopxr2x_6ojd);
    }

    public FeatureCombinationQueryImplExternalSyntheticLambda2 read(getInflatedId getinflatedid) {
        OnePixelShiftQuirk onePixelShiftQuirk;
        int i = 2 % 2;
        Object obj = null;
        if (getinflatedid == null) {
            int i2 = MediaMetadataCompat + 7;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (((ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) obj2) != null) {
            ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) obj2;
            Pair pair = new Pair(imageCaptureFailedWhenVideoCaptureIsBoundQuirk.MediaSessionCompatToken, imageCaptureFailedWhenVideoCaptureIsBoundQuirk.MediaBrowserCompatMediaItem.get(0));
            OnePixelShiftQuirk onePixelShiftQuirk2 = OnePixelShiftQuirk.read;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            onePixelShiftQuirk = new OnePixelShiftQuirk(arrayMap);
        } else {
            int i3 = MediaDescriptionCompat + 111;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            onePixelShiftQuirk = OnePixelShiftQuirk.read;
        }
        this.RemoteActionCompatParcelizer = null;
        return new FeatureCombinationQueryImplExternalSyntheticLambda2(getinflatedid, new Size(getinflatedid.RatingCompat(), getinflatedid.serializer()), new getDisplayManager(new LayoutNodeSubcompositionsStateScope((CameraXExternalSyntheticLambda0) null, onePixelShiftQuirk, getinflatedid.read().serializer())));
    }

    @Override // o.accessgetNumPadRightParenthesiscp
    public void serializer(Object obj, Object obj2) throws RemoteException {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 61;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        if (i4 == 26) {
            accessgetTvAudioDescriptioncp accessgettvaudiodescriptioncp = new accessgetTvAudioDescriptioncp((zay) this.MediaBrowserCompatMediaItem, (ParentDataModifierDefaultImpls) obj2, 0);
            accessgetTvAudioDescriptionMixingVolumeDowncp accessgettvaudiodescriptionmixingvolumedowncp = (accessgetTvAudioDescriptionMixingVolumeDowncp) ((accessgetTvContentsMenucp) obj).MediaSessionCompatResultReceiverWrapper();
            ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) this.RemoteActionCompatParcelizer;
            Parcel parcelWrite = accessgettvaudiodescriptionmixingvolumedowncp.write();
            int i5 = getBEK5gGoQ.serializer;
            parcelWrite.writeStrongBinder(accessgettvaudiodescriptioncp);
            getBEK5gGoQ.serializer(parcelWrite, apiFeatureRequest);
            accessgettvaudiodescriptionmixingvolumedowncp.RemoteActionCompatParcelizer(1, parcelWrite);
            return;
        }
        if (i4 != 27) {
            ((zzdz) obj).serializer((r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) this.MediaBrowserCompatMediaItem, (LocationRequest) this.RemoteActionCompatParcelizer, (ParentDataModifierDefaultImpls) obj2);
            int i6 = MediaDescriptionCompat + 119;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return;
        }
        getMeasurementConstraintsmsEJaDk getmeasurementconstraintsmsejadk = new getMeasurementConstraintsmsEJaDk((ParentDataModifierDefaultImpls) obj2);
        zzb zzbVar = (zzb) this.MediaBrowserCompatMediaItem;
        PendingIntent pendingIntent = (PendingIntent) this.RemoteActionCompatParcelizer;
        accessgetSystemNavigationDowncp.serializer(pendingIntent, "PendingIntent must be specified.");
        getMediaPauseEK5gGoQ getmediapauseek5ggoq = new getMediaPauseEK5gGoQ(getmeasurementconstraintsmsejadk);
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) ((getNumPadAddEK5gGoQ) obj).MediaSessionCompatResultReceiverWrapper();
        Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, zzbVar);
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, pendingIntent);
        parcelZza.writeStrongBinder(getmediapauseek5ggoq);
        getnumpaddeleteek5ggoq.zzc(70, parcelZza);
    }

    @Override // o.VideoEncoderCrashQuirk
    public void write(Throwable th) throws Throwable {
        PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0;
        Iterator it;
        Camera2CameraImpl camera2CameraImpl;
        ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirkIconCompatParcelizer;
        awaitNavigationRoutes awaitnavigationroutes;
        int i = 2 % 2;
        mapToBase maptobase = null;
        if (this.IconCompatParcelizer != 3) {
            int i2 = ((setBrightness) this.MediaBrowserCompatMediaItem).PlaybackStateCompatCustomAction;
            if (i2 == 2) {
                int i3 = MediaDescriptionCompat;
                int i4 = i3 + 49;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    boolean z = th instanceof CancellationException;
                    maptobase.hashCode();
                    throw null;
                }
                if (th instanceof CancellationException) {
                    int i5 = i3 + 109;
                    MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    setInflatedId.IconCompatParcelizer(3, "SurfaceProcessorNode");
                    return;
                }
            }
            setInflatedId.RemoteActionCompatParcelizer("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + r8lambdajyieMEPHfDZ0H9VbS9ICj8_yOE.write(i2), th);
            return;
        }
        boolean z2 = th instanceof DeferrableSurface$SurfaceClosedException;
        Camera2CameraImpl camera2CameraImpl2 = (Camera2CameraImpl) this.RemoteActionCompatParcelizer;
        if (!z2) {
            if (th instanceof CancellationException) {
                camera2CameraImpl2.write("Unable to configure camera cancelled");
                return;
            }
            setTextFuture settextfuture = camera2CameraImpl2._init_lambda1;
            setTextFuture settextfuture2 = setTextFuture.OPENED;
            if (settextfuture == settextfuture2) {
                ((Camera2CameraImpl) this.RemoteActionCompatParcelizer).serializer(settextfuture2, new Toolbar(4, th), true);
                int i7 = MediaDescriptionCompat + 99;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            setInflatedId.read("Camera2CameraImpl", "Unable to configure camera " + ((Camera2CameraImpl) this.RemoteActionCompatParcelizer), th);
            Camera2CameraImpl camera2CameraImpl3 = (Camera2CameraImpl) this.RemoteActionCompatParcelizer;
            if (camera2CameraImpl3.PlaybackStateCompat == ((setBaselineAlignedChildIndex) this.MediaBrowserCompatMediaItem)) {
                camera2CameraImpl3.PlaybackStateCompatCustomAction();
                return;
            }
            return;
        }
        int i9 = MediaMetadataCompat + 57;
        MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            previewExternalSyntheticLambda0 = ((DeferrableSurface$SurfaceClosedException) th).write;
            it = camera2CameraImpl2.addObserverForBackInvoker.IconCompatParcelizer().iterator();
            int i10 = 41 / 0;
        } else {
            previewExternalSyntheticLambda0 = ((DeferrableSurface$SurfaceClosedException) th).write;
            it = camera2CameraImpl2.addObserverForBackInvoker.IconCompatParcelizer().iterator();
        }
        while (it.hasNext()) {
            mapToBase maptobase2 = (mapToBase) it.next();
            if (maptobase2.RemoteActionCompatParcelizer().contains(previewExternalSyntheticLambda0)) {
                maptobase = maptobase2;
                break;
            }
        }
        if (maptobase != null) {
            int i11 = MediaMetadataCompat + 53;
            MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                camera2CameraImpl = (Camera2CameraImpl) this.RemoteActionCompatParcelizer;
                reportedVideoQualityNotSupportedQuirkIconCompatParcelizer = removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer();
                awaitnavigationroutes = maptobase.RemoteActionCompatParcelizer;
                int i12 = 29 / 0;
                if (awaitnavigationroutes == null) {
                    return;
                }
            } else {
                camera2CameraImpl = (Camera2CameraImpl) this.RemoteActionCompatParcelizer;
                reportedVideoQualityNotSupportedQuirkIconCompatParcelizer = removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer();
                awaitnavigationroutes = maptobase.RemoteActionCompatParcelizer;
                if (awaitnavigationroutes == null) {
                    return;
                }
            }
            new Throwable();
            camera2CameraImpl.write("Posting surface closed");
            reportedVideoQualityNotSupportedQuirkIconCompatParcelizer.execute(new CameraX$$ExternalSyntheticLambda2(awaitnavigationroutes, 7, maptobase));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    @Override // o.Colordefault
    public tintxETnrds read(String str) {
        boolean z;
        FileChannel fileChannel;
        FileChannel fileChannel2;
        int i = 2 % 2;
        str.getClass();
        clipPathmtrdDEdefault clippathmtrddedefault = (clipPathmtrdDEdefault) this.RemoteActionCompatParcelizer;
        if (!str.equals(":memory:")) {
            str = clippathmtrddedefault.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z2 = true;
        Object obj = null;
        if (clippathmtrddedefault.IconCompatParcelizer) {
            z = false;
        } else {
            int i2 = MediaMetadataCompat + 43;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                boolean z3 = clippathmtrddedefault.serializer;
                obj.hashCode();
                throw null;
            }
            if (clippathmtrddedefault.serializer) {
                z = false;
            } else {
                int i3 = MediaMetadataCompat + 65;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                if (str.equals(":memory:")) {
                    z = false;
                } else {
                    int i5 = MediaMetadataCompat + 33;
                    MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    z = true;
                }
            }
        }
        accessgetLightGraycp accessgetlightgraycp = new accessgetLightGraycp(str, z);
        ReentrantLock reentrantLock = accessgetlightgraycp.write;
        reentrantLock.lock();
        accessgetGreencp accessgetgreencp = accessgetlightgraycp.RemoteActionCompatParcelizer;
        if (accessgetgreencp != null) {
            try {
                accessgetgreencp.MediaSessionCompatResultReceiverWrapper();
            } catch (Throwable th) {
                th = th;
                z2 = false;
            }
        }
        try {
            try {
                if (clippathmtrddedefault.serializer) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                tintxETnrds tintxetnrds = ((Colordefault) this.MediaBrowserCompatMediaItem).read(str);
                if (clippathmtrddedefault.IconCompatParcelizer) {
                    clipPathmtrdDEdefault.RemoteActionCompatParcelizer(tintxetnrds);
                    if (clippathmtrddedefault.RemoteActionCompatParcelizer.RatingCompat == getAndroidCanvas.WRITE_AHEAD_LOGGING) {
                        int i7 = MediaDescriptionCompat + 73;
                        MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        SQLite.serializer(tintxetnrds, "PRAGMA synchronous = NORMAL");
                    } else {
                        SQLite.serializer(tintxetnrds, "PRAGMA synchronous = FULL");
                    }
                    clippathmtrddedefault.MediaSessionCompatQueueItem.IconCompatParcelizer(tintxetnrds);
                } else {
                    try {
                        clippathmtrddedefault.serializer = true;
                        clipPathmtrdDEdefault.write(clippathmtrddedefault, tintxetnrds);
                        clippathmtrddedefault.serializer = false;
                        int i9 = MediaDescriptionCompat + 25;
                        MediaMetadataCompat = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                    } catch (Throwable th2) {
                        clippathmtrddedefault.serializer = false;
                        throw th2;
                    }
                }
                if (accessgetgreencp != null && (fileChannel2 = (FileChannel) accessgetgreencp.write) != null) {
                    try {
                        fileChannel2.close();
                        accessgetgreencp.write = null;
                    } catch (Throwable th3) {
                        accessgetgreencp.write = null;
                        throw th3;
                    }
                }
                reentrantLock.unlock();
                return tintxetnrds;
            } catch (Throwable th4) {
                if (accessgetgreencp != null && (fileChannel = (FileChannel) accessgetgreencp.write) != null) {
                    try {
                        fileChannel.close();
                    } finally {
                        accessgetgreencp.write = null;
                    }
                }
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th = th5;
        try {
            if (z2) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x010e  */
    @Override // o.animateDecay
    public void serializer(animate animateVar) {
        boolean z;
        int i = 2;
        int i2 = 2 % 2;
        AnimatedVisibilityKtAnimatedVisibilityImpl11 animatedVisibilityKtAnimatedVisibilityImpl11 = (AnimatedVisibilityKtAnimatedVisibilityImpl11) this.RemoteActionCompatParcelizer;
        Machine$Queue machine$Queue = animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        int i3 = 3;
        if (animatedVisibilityKtAnimatedVisibilityImpl11.ComponentActivity) {
            setInflatedId.IconCompatParcelizer(3, "Recorder");
            animateVar.close();
            return;
        }
        int i4 = MediaDescriptionCompat + 75;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        Object obj = null;
        if (i4 % 2 != 0) {
            animate animateVar2 = animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            throw null;
        }
        animate animateVar3 = animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (animateVar3 != null) {
            animateVar3.close();
            animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
            z = true;
        } else {
            z = false;
        }
        if ((animateVar.RemoteActionCompatParcelizer.flags & 1) == 0) {
            if (z) {
                setInflatedId.IconCompatParcelizer(3, "Recorder");
            }
            setInflatedId.IconCompatParcelizer(3, "Recorder");
            EncoderImpl encoderImpl = animatedVisibilityKtAnimatedVisibilityImpl11._init_lambda1;
            encoderImpl.RatingCompat.execute(new CrossfadeKt(encoderImpl, i));
            animateVar.close();
            return;
        }
        animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = animateVar;
        EnterExitTransitionKtexpandHorizontally2 enterExitTransitionKtexpandHorizontally2 = animatedVisibilityKtAnimatedVisibilityImpl11.MediaSessionCompatToken;
        EnterExitTransitionKtexpandHorizontally2 enterExitTransitionKtexpandHorizontally3 = EnterExitTransitionKtexpandHorizontally2.ENABLED;
        if (enterExitTransitionKtexpandHorizontally2 == enterExitTransitionKtexpandHorizontally3 && machine$Queue.serializer()) {
            if (!z) {
                setInflatedId.IconCompatParcelizer(3, "Recorder");
                return;
            }
            int i5 = MediaDescriptionCompat + 85;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                setInflatedId.IconCompatParcelizer(3, "Recorder");
                return;
            } else {
                setInflatedId.IconCompatParcelizer(3, "Recorder");
                return;
            }
        }
        setInflatedId.IconCompatParcelizer(3, "Recorder");
        if (animatedVisibilityKtAnimatedVisibilityImpl11.MediaSessionCompatToken == enterExitTransitionKtexpandHorizontally3 && machine$Queue.serializer()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "Audio is enabled but no audio sample is ready. Cannot start media muxer.");
            return;
        }
        animate animateVar4 = animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (animateVar4 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "Media muxer cannot be started without an encoded video frame.");
            return;
        }
        try {
            animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
            long j = animateVar4.RemoteActionCompatParcelizer.presentationTimeUs;
            ArrayList arrayList = new ArrayList();
            while (!machine$Queue.serializer()) {
                int i6 = MediaMetadataCompat + 103;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                animate animateVar5 = (animate) machine$Queue.RemoteActionCompatParcelizer();
                if (animateVar5.RemoteActionCompatParcelizer.presentationTimeUs >= j) {
                    arrayList.add(animateVar5);
                }
            }
            animateVar4.IconCompatParcelizer();
            Iterator it = arrayList.iterator();
            int i8 = MediaDescriptionCompat + 31;
            MediaMetadataCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            while (!(!it.hasNext())) {
                ((animate) it.next()).IconCompatParcelizer();
            }
            try {
                if (((AnimatedContentTransitionScopeImplSizeModifierNodemeasure1) AnimatedVisibilityKtAnimatedVisibilityImpl11.write(animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss)).serializer != -1) {
                    throw null;
                }
                InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 = animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                int i10 = AnimatedVisibilityKtAnimatedVisibilityImpl11.IconCompatParcelizer.serializer;
                if (infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 == null) {
                    throw null;
                }
                int i11 = MediaDescriptionCompat + 111;
                MediaMetadataCompat = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                int i13 = infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2.write;
                throw null;
            } catch (IOException e) {
                if (e instanceof FileNotFoundException) {
                    int i14 = MediaDescriptionCompat + 79;
                    MediaMetadataCompat = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        e.getMessage();
                        obj.hashCode();
                        throw null;
                    }
                    String message = e.getMessage();
                    if (message == null || !hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) message, (CharSequence) "No space left on device", false)) {
                        i3 = 5;
                    } else {
                        int i15 = MediaMetadataCompat + 9;
                        MediaDescriptionCompat = i15 % Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                    }
                } else {
                    i3 = 5;
                }
                animatedVisibilityKtAnimatedVisibilityImpl11.read(i3, e);
                animateVar4.close();
            }
        } catch (Throwable th) {
            try {
                animateVar4.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ Recorder$3(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.MediaBrowserCompatMediaItem = obj2;
    }

    public /* synthetic */ Recorder$3(Object obj, Object obj2, boolean z, int i) {
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompatMediaItem = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    public Recorder$3() {
        this.IconCompatParcelizer = 13;
        this.MediaBrowserCompatMediaItem = new HashMap();
        this.RemoteActionCompatParcelizer = new component27NrFUSI(1);
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public void inject(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 67;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        switch (this.IconCompatParcelizer) {
            case 15:
                AmountChangingReasonDialogFragment amountChangingReasonDialogFragment = (AmountChangingReasonDialogFragment) obj;
                getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.MediaBrowserCompatMediaItem;
                amountChangingReasonDialogFragment.getSavedStateRegistry = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
                amountChangingReasonDialogFragment.getOnBackPressedDispatcher = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((readInstallReferrerHuaweiAppGallery) this.RemoteActionCompatParcelizer);
                return;
            case 16:
                BookShiftConfirmationContainerFragment bookShiftConfirmationContainerFragment = (BookShiftConfirmationContainerFragment) obj;
                bookShiftConfirmationContainerFragment.getOnBackPressedDispatcher = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.MediaBrowserCompatMediaItem).PlaybackStateCompatCustomAction();
                bookShiftConfirmationContainerFragment.getSavedStateRegistry = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((isHiddenannotations) this.RemoteActionCompatParcelizer);
                return;
            case 17:
                ChatLanguageSelectorFragment chatLanguageSelectorFragment = (ChatLanguageSelectorFragment) obj;
                chatLanguageSelectorFragment.removeOnUserLeaveHintListener = ((E$b) this.MediaBrowserCompatMediaItem).read();
                chatLanguageSelectorFragment.getSavedStateRegistry = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((isHiddenannotations) this.RemoteActionCompatParcelizer);
                return;
            case 18:
                EntrancePictureFragment entrancePictureFragment = (EntrancePictureFragment) obj;
                entrancePictureFragment.removeOnUserLeaveHintListener = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.MediaBrowserCompatMediaItem).PlaybackStateCompatCustomAction();
                entrancePictureFragment.getNavigationEventDispatcher = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((lambda31) this.RemoteActionCompatParcelizer);
                return;
            case 19:
                NafathModalFragment nafathModalFragment = (NafathModalFragment) obj;
                getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation2 = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.MediaBrowserCompatMediaItem;
                nafathModalFragment.removeOnUserLeaveHintListener = getstyleable_vector_drawable_group_rotation2.PlaybackStateCompatCustomAction();
                nafathModalFragment.getSavedStateRegistry = new stopInstancelambda11(3);
                nafathModalFragment.getOnBackPressedDispatcher = new FormBody.Builder((decode) getstyleable_vector_drawable_group_rotation2.setItemInvoker.write(), new CachedDeliveryRepository((StateV3DeliveryProvider) getstyleable_vector_drawable_group_rotation2.BasicTextFieldKt.write()));
                nafathModalFragment.invalidateMenu = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((lambdaprocessAndResolveDeeplink15) this.RemoteActionCompatParcelizer);
                int i3 = MediaMetadataCompat + 61;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return;
            case 20:
                PhotoIdPreviewFragment photoIdPreviewFragment = (PhotoIdPreviewFragment) obj;
                photoIdPreviewFragment.removeOnUserLeaveHintListener = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.MediaBrowserCompatMediaItem).PlaybackStateCompatCustomAction();
                photoIdPreviewFragment.getSavedStateRegistry = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) this.RemoteActionCompatParcelizer);
                int i5 = MediaMetadataCompat + 53;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 15 / 0;
                    return;
                }
                return;
            case 21:
                RecentDeliveriesFragment recentDeliveriesFragment = (RecentDeliveriesFragment) obj;
                getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation3 = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.MediaBrowserCompatMediaItem;
                recentDeliveriesFragment.removeOnUserLeaveHintListener = getstyleable_vector_drawable_group_rotation3.PlaybackStateCompatCustomAction();
                recentDeliveriesFragment.onActivityResult = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((getDataStoreFileName) this.RemoteActionCompatParcelizer);
                int iIconCompatParcelizer = n5.IconCompatParcelizer();
                int iIconCompatParcelizer2 = n5.IconCompatParcelizer();
                recentDeliveriesFragment.onBackPressed = (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation3}, n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer, n5.IconCompatParcelizer(), iIconCompatParcelizer2);
                recentDeliveriesFragment.getSavedStateRegistry = getstyleable_vector_drawable_group_rotation3.getLifecycle();
                recentDeliveriesFragment.getNavigationEventDispatcher = getstyleable_vector_drawable_group_rotation3.addOnPictureInPictureUiStateChangedListener();
                return;
            case 22:
                SettingsInfoBottomSheet settingsInfoBottomSheet = (SettingsInfoBottomSheet) obj;
                settingsInfoBottomSheet.onCreate = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.MediaBrowserCompatMediaItem).PlaybackStateCompatCustomAction();
                settingsInfoBottomSheet.getSavedStateRegistry = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((PreferenceGroupAdapter) this.RemoteActionCompatParcelizer);
                return;
            default:
                InAppCameraWithTagsFragment inAppCameraWithTagsFragment = (InAppCameraWithTagsFragment) obj;
                inAppCameraWithTagsFragment.removeOnUserLeaveHintListener = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.MediaBrowserCompatMediaItem).PlaybackStateCompatCustomAction();
                inAppCameraWithTagsFragment.getOnBackPressedDispatcher = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((getFailureMessage) this.RemoteActionCompatParcelizer);
                int i7 = MediaMetadataCompat + 81;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
        }
    }

    public Recorder$3(PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk) {
        this.IconCompatParcelizer = 4;
        this.MediaBrowserCompatMediaItem = previewFreezeAfterHighSpeedRecordingQuirk;
        this.RemoteActionCompatParcelizer = new AtomicInteger(0);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x0163  */
    public Recorder$3(FocusMeteringAction focusMeteringAction, shutdown shutdownVar, u$a u_a) {
        boolean z;
        PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk;
        HashMap map;
        this.IconCompatParcelizer = 7;
        this.MediaBrowserCompatMediaItem = shutdownVar;
        ArrayList arrayListSerializer = u_a.serializer(ExtraSupportedQualityQuirk.class);
        if (arrayListSerializer.isEmpty()) {
            return;
        }
        if (arrayListSerializer.size() == 1) {
            int i = MediaMetadataCompat + 115;
            MediaDescriptionCompat = i % Fields.SpotShadowColor;
            int i2 = i % 2;
            z = true;
        } else {
            int i3 = 2 % 2;
            z = false;
        }
        Map map2 = null;
        map = null;
        map2 = null;
        map = null;
        Map map3 = null;
        UtilsKt.RemoteActionCompatParcelizer((String) null, z);
        ((ExtraSupportedQualityQuirk) arrayListSerializer.get(0)).getClass();
        if ("motorola".equalsIgnoreCase(Build.BRAND)) {
            int i4 = MediaMetadataCompat + 109;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                "moto c".equalsIgnoreCase(Build.MODEL);
                map2.hashCode();
                throw null;
            }
            if (!"moto c".equalsIgnoreCase(Build.MODEL)) {
                map3 = Collections.EMPTY_MAP;
            } else if (!(!"1".equals(focusMeteringAction.read()))) {
                int i5 = MediaMetadataCompat + 3;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0 ? !shutdownVar.serializer(4) : !shutdownVar.serializer(4)) {
                    SurfaceRequest surfaceRequestWrite = shutdownVar.write(1);
                    if (surfaceRequestWrite != null) {
                        int i6 = MediaDescriptionCompat + 65;
                        MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        if (surfaceRequestWrite.RemoteActionCompatParcelizer().isEmpty()) {
                            previewDelayWhenVideoCaptureIsBoundQuirk = null;
                        } else {
                            previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) surfaceRequestWrite.RemoteActionCompatParcelizer().get(0);
                        }
                    } else {
                        previewDelayWhenVideoCaptureIsBoundQuirk = null;
                    }
                    if (previewDelayWhenVideoCaptureIsBoundQuirk == null) {
                        int i8 = MediaDescriptionCompat + 83;
                        MediaMetadataCompat = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 == 0) {
                        }
                    } else {
                        setInitialAnimationsanimation_core setinitialanimationsanimation_coreSerializer = updateInitialValuesanimation_core.serializer(previewDelayWhenVideoCaptureIsBoundQuirk.MediaSessionCompatQueueItem);
                        Range rangeSerializer = setinitialanimationsanimation_coreSerializer != null ? setinitialanimationsanimation_coreSerializer.serializer() : AnimatedEnterExitMeasurePolicy.write;
                        Size size = setController.IconCompatParcelizer;
                        int i9 = previewDelayWhenVideoCaptureIsBoundQuirk.write;
                        int i10 = previewDelayWhenVideoCaptureIsBoundQuirk.serializer;
                        int i11 = previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer;
                        PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirkSerializer = PreviewOrientationIncorrectQuirk.serializer(surfaceRequestWrite.write(), surfaceRequestWrite.IconCompatParcelizer(), surfaceRequestWrite.read(), Collections.singletonList(new PreviewDelayWhenVideoCaptureIsBoundQuirk(previewDelayWhenVideoCaptureIsBoundQuirk.read, previewDelayWhenVideoCaptureIsBoundQuirk.MediaSessionCompatQueueItem, accessrunAnimations.read(i9, i10, i10, i11, i11, size.getWidth(), previewDelayWhenVideoCaptureIsBoundQuirk.MediaDescriptionCompat, size.getHeight(), previewDelayWhenVideoCaptureIsBoundQuirk.MediaMetadataCompat, rangeSerializer), previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer, size.getWidth(), size.getHeight(), previewDelayWhenVideoCaptureIsBoundQuirk.MediaBrowserCompatMediaItem, previewDelayWhenVideoCaptureIsBoundQuirk.serializer, previewDelayWhenVideoCaptureIsBoundQuirk.IconCompatParcelizer, previewDelayWhenVideoCaptureIsBoundQuirk.RatingCompat)));
                        map = new HashMap();
                        map.put(4, previewOrientationIncorrectQuirkSerializer);
                        Size size2 = previewDelayWhenVideoCaptureIsBoundQuirk.read();
                        map2 = map;
                        if (size.getHeight() * size.getWidth() > size2.getHeight() * size2.getWidth()) {
                            int i12 = MediaMetadataCompat + 25;
                            MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            map.put(1, previewOrientationIncorrectQuirkSerializer);
                        }
                    }
                }
            }
            int i14 = 2 % 2;
            map2 = map3;
        } else {
            map3 = Collections.EMPTY_MAP;
            int i15 = 2 % 2;
            map2 = map3;
        }
        if (map2 == null) {
            map2 = map;
            return;
        } else {
            map2 = map;
            this.RemoteActionCompatParcelizer = new HashMap(map2);
        }
    }

    public Recorder$3(ut utVar) {
        this.IconCompatParcelizer = 5;
        this.MediaBrowserCompatMediaItem = utVar;
    }

    public Recorder$3(clipPathmtrdDEdefault clippathmtrddedefault, Colordefault colordefault) {
        this.IconCompatParcelizer = 11;
        colordefault.getClass();
        this.RemoteActionCompatParcelizer = clippathmtrddedefault;
        this.MediaBrowserCompatMediaItem = colordefault;
    }

    public Recorder$3(int i, accesstoPxR2X_6ojd accesstopxr2x_6ojd) {
        String str;
        this.IconCompatParcelizer = 9;
        this.MediaBrowserCompatMediaItem = accesstopxr2x_6ojd;
        if (i == 0) {
            str = "top";
        } else if (i != 1) {
            int i2 = MediaMetadataCompat + 27;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            SentryLogcatAdapter.serializer("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            int i4 = MediaDescriptionCompat + 61;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = "top";
        } else {
            int i7 = MediaDescriptionCompat + 43;
            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
            str = "bottom";
        }
        this.RemoteActionCompatParcelizer = str;
    }

    public Recorder$3(BiometricManager.Strings strings) {
        this.IconCompatParcelizer = 2;
        this.MediaBrowserCompatMediaItem = strings;
        this.RemoteActionCompatParcelizer = null;
    }

    public Recorder$3(RetryWithDelay retryWithDelay) {
        this.IconCompatParcelizer = 2;
        this.MediaBrowserCompatMediaItem = null;
        this.RemoteActionCompatParcelizer = retryWithDelay;
    }

    public Recorder$3(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, E$b e$b) {
        this.IconCompatParcelizer = 17;
        this.MediaBrowserCompatMediaItem = e$b;
        this.RemoteActionCompatParcelizer = new isHiddenannotations(getstyleable_vector_drawable_group_rotation.toClipEntry, getstyleable_vector_drawable_group_rotation.TransitionState, new r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(getstyleable_vector_drawable_group_rotation.Contentfoundation, 4), new r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(getstyleable_vector_drawable_group_rotation.setItemInvoker, 5), 14);
    }

    public /* synthetic */ Recorder$3(int i) {
        this.IconCompatParcelizer = i;
    }
}
