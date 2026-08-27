package o;

import android.view.View;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.huawei.hmf.tasks.a.d$a;
import com.huawei.location.lite.common.util.filedownload.DownloadFileParam;
import com.huawei.location.vdr.VdrManager;
import com.roadrunner.login.presentation.LoginActivity;
import io.grpc.Status;
import io.sentry.CombinedScopeView;
import io.sentry.MovePreviousSession;
import io.sentry.metrics.MetricsBatchProcessor;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class isAutomaticGeofenceRequestsEnabled implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    public isAutomaticGeofenceRequestsEnabled(View view, LoginActivity loginActivity) {
        this.RemoteActionCompatParcelizer = 5;
        this.write = loginActivity;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        long j;
        int i = 10;
        int i2 = 0;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                break;
            case 1:
                ((ViewLayerCompanionOutlineProvider1) this.write).RemoteActionCompatParcelizer.write();
                return;
            case 2:
                Thread.currentThread().setName("Loc-SDM-CheckPlugin" + hashCode());
                colorResource colorresource = (colorResource) this.write;
                colorresource.getClass();
                synchronized (colorResource.class) {
                    getOrder getorder = new getOrder("sp_libSdmSo_filename");
                    colorresource.IconCompatParcelizer = getorder;
                    long jWrite = getorder.write("libSdm_last_time");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    colorresource.write = ((getOrder) colorresource.IconCompatParcelizer).RemoteActionCompatParcelizer("libSdm_version_num");
                    File file = new File(bringIntoViewdefault.RemoteActionCompatParcelizer);
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SdmFileManager", "the file isFileExist is " + file.exists());
                    if (!file.exists() || jCurrentTimeMillis - jWrite >= 604800000) {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SdmFileManager", "libSdm file is not exists or determine whether the libSdm file needs to be updated ");
                        DownloadFileParam downloadFileParam = new DownloadFileParam();
                        downloadFileParam.setFileName("libSdm.7z");
                        downloadFileParam.setSaveFilePath(bringIntoViewdefault.read);
                        downloadFileParam.setServiceType("Sdm");
                        downloadFileParam.setSubType("libSdm");
                        new com.huawei.wisesecurity.ucs_credential.x(downloadFileParam, i, new fontResource(colorresource)).IconCompatParcelizer(new setTextStyle(colorresource));
                    } else {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SdmFileManager", "libSdm file is exists and is not need update");
                    }
                    break;
                }
                return;
            case 3:
                Thread.currentThread().setName("Loc-Vdr-EphUpdate" + hashCode());
                VdrManager vdrManager = (VdrManager) this.write;
                vdrManager.currentEphemeris = vdrManager.ephProvider.serializer();
                if (vdrManager.currentEphemeris != null) {
                    vdrManager.ephProvider.getClass();
                    vdrManager.ephExpiredTime = onScrollCaptureImageRequest.RemoteActionCompatParcelizer();
                    vdrManager.updateEphemeris.set(true);
                    return;
                }
                return;
            case 4:
                Thread.currentThread().setName("Loc-VDR-CheckPlugin" + hashCode());
                drawDebugBackground drawdebugbackground = (drawDebugBackground) this.write;
                synchronized (drawDebugBackground.class) {
                    getOrder getorder2 = new getOrder("sp_libVdrSo_filename");
                    drawdebugbackground.serializer = getorder2;
                    long jWrite2 = getorder2.write("libVdr_last_time");
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    drawdebugbackground.IconCompatParcelizer = drawdebugbackground.serializer.RemoteActionCompatParcelizer("libVdr_version_num");
                    File file2 = new File(onScrollCaptureStart.RemoteActionCompatParcelizer);
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrFileManager", "the file isFileExist is " + file2.exists());
                    if (!file2.exists() || jCurrentTimeMillis2 - jWrite2 >= 604800000) {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrFileManager", "libVdr file is not exists or determine whether the libVdr file needs to be updated ");
                        DownloadFileParam downloadFileParam2 = new DownloadFileParam();
                        downloadFileParam2.setFileName("libVdr.7z");
                        downloadFileParam2.setSaveFilePath(onScrollCaptureStart.IconCompatParcelizer);
                        downloadFileParam2.setServiceType("Vdr");
                        downloadFileParam2.setSubType("libVdr");
                        new com.huawei.wisesecurity.ucs_credential.x(downloadFileParam2, i, new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(25, drawdebugbackground)).IconCompatParcelizer(new drawDebugOverlay(drawdebugbackground));
                    } else {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrFileManager", "libVdr file is exists and is not need update");
                        drawdebugbackground.RemoteActionCompatParcelizer.handleLoadResult(true);
                    }
                    break;
                }
                return;
            case 5:
                ((getRootInfoui) ((LoginActivity) this.write).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus().write).write("login_post_oncreate_first_frame");
                return;
            case 6:
                ((getEMAIL_ADDRESS_MAX_LENGTHannotations) this.write).read.RemoteActionCompatParcelizer();
                return;
            case 7:
                ((isValidLogPurchaseInput) this.write).MediaSessionCompatResultReceiverWrapper.serializer();
                return;
            case 8:
                r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) ((d$a) this.write).write;
                accesssetCustomHandlercp accesssetcustomhandlercp = r8lambday78ccsnuxer22a2wvqifr2bmbdo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                r8lambday78ccsnuxer22a2wvqifr2bmbdo.ResultReceiver = null;
                r8lambday78ccsnuxer22a2wvqifr2bmbdo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                accesssetcustomhandlercp.RemoteActionCompatParcelizer(Status.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("InternalSubchannel closed transport due to address change"));
                return;
            case 9:
                accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac = (accessgetApparentToRealOffsetnOccac) this.write;
                ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) accessgetapparenttorealoffsetnoccac.write).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.remove((getLocalHtmlUrlFromRemoteUrllambda2) accessgetapparenttorealoffsetnoccac.serializer);
                if (((r8lambday78CcsNUxER22a2WVqifR2BmBdo) ((accessgetApparentToRealOffsetnOccac) this.write).write).ComponentActivity.IconCompatParcelizer == setResourcePackageNamelambda0.SHUTDOWN && ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) ((accessgetApparentToRealOffsetnOccac) this.write).write).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.isEmpty()) {
                    r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo2 = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) ((accessgetApparentToRealOffsetnOccac) this.write).write;
                    r8lambday78ccsnuxer22a2wvqifr2bmbdo2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.execute(new copyZipEntryToOutputStream(r8lambday78ccsnuxer22a2wvqifr2bmbdo2, i2));
                    return;
                }
                return;
            case 10:
                hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = ((unpackZipIntoDirectory) this.write).serializer;
                hastoomanyzipentrieslambda0.addOnNewIntentListener.write();
                if (hastoomanyzipentrieslambda0.createFullyDrawnExecutor) {
                    hastoomanyzipentrieslambda0._init_lambda1.write();
                    return;
                }
                return;
            case 11:
                r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo3 = ((cExternalSyntheticLambda7) this.write).MediaMetadataCompat;
                r8lambday78ccsnuxer22a2wvqifr2bmbdo3.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.execute(new r8lambdaclfS62tZC2OFo9lifeMcE91mC8(r8lambday78ccsnuxer22a2wvqifr2bmbdo3, hasTooManyZipEntrieslambda0.MediaSessionCompatQueueItem, i2));
                return;
            case 12:
                setBrazeDeeplinkHandler setbrazedeeplinkhandler = (setBrazeDeeplinkHandler) this.write;
                setbrazedeeplinkhandler.MediaSessionCompatResultReceiverWrapper = null;
                if (setbrazedeeplinkhandler.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer()) {
                    setbrazedeeplinkhandler.RemoteActionCompatParcelizer();
                    return;
                }
                return;
            case 13:
                ((JsonUtilsExternalSyntheticLambda1) ((r8lambdaTGvqp69thpNCiLzSqCbcGsuVFtw) this.write).write).MediaDescriptionCompat();
                return;
            case 14:
                onRenderProcessGone onrenderprocessgone = (onRenderProcessGone) this.write;
                if (!onrenderprocessgone.read) {
                    onrenderprocessgone.RatingCompat = null;
                    return;
                }
                long jRemoteActionCompatParcelizer = onrenderprocessgone.RemoteActionCompatParcelizer - ((visitSubtreeYYKmhodefault) onrenderprocessgone.MediaDescriptionCompat).RemoteActionCompatParcelizer();
                if (jRemoteActionCompatParcelizer > 0) {
                    onrenderprocessgone.RatingCompat = ((ScheduledExecutorService) onrenderprocessgone.write).schedule(new MovePreviousSession(18, onrenderprocessgone), jRemoteActionCompatParcelizer, TimeUnit.NANOSECONDS);
                    return;
                }
                onrenderprocessgone.read = false;
                onrenderprocessgone.RatingCompat = null;
                ((MovePreviousSession) onrenderprocessgone.IconCompatParcelizer).run();
                return;
            case 15:
                replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda1 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
                if (replaceprefetchedurlswithlocalassetslambda1.ParcelableVolumeInfo) {
                    return;
                }
                replaceprefetchedurlswithlocalassetslambda1.ComponentActivity.read();
                return;
            case 16:
                handleUrlOverridelambda1 handleurloverridelambda1 = (handleUrlOverridelambda1) this.write;
                replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda2 = (replacePrefetchedUrlsWithLocalAssetslambda1) handleurloverridelambda1.serializer.write;
                handleUrlOverridelambda00 handleurloverridelambda00 = handleurloverridelambda1.IconCompatParcelizer;
                ReflectionUtils reflectionUtils = replacePrefetchedUrlsWithLocalAssetslambda1.write;
                replaceprefetchedurlswithlocalassetslambda2.serializer(handleurloverridelambda00);
                return;
            case 17:
                replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda3 = (replacePrefetchedUrlsWithLocalAssetslambda1) ((logPurchaseWithJSONlambda0) this.write).write;
                replaceprefetchedurlswithlocalassetslambda3.ParcelableVolumeInfo = true;
                r8lambda6LGSESzBuanebUADYycWZpXP5Kw r8lambda6lgseszbuanebuadyycwzpxp5kw = replaceprefetchedurlswithlocalassetslambda3.ComponentActivity;
                CombinedScopeView combinedScopeView = replaceprefetchedurlswithlocalassetslambda3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                r8lambda6lgseszbuanebuadyycwzpxp5kw.serializer((Status) combinedScopeView.RemoteActionCompatParcelizer, (r8lambdacIxdbs1VMz7DJpiM5hikhHgartg) combinedScopeView.read, (r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) combinedScopeView.write);
                return;
            case 18:
                ((markPageFinished) this.write).write();
                return;
            case 19:
                logPurchaseWithJSONlambda1 logpurchasewithjsonlambda1 = (logPurchaseWithJSONlambda1) this.write;
                r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu = logpurchasewithjsonlambda1.MediaSessionCompatToken;
                try {
                    RecyclableBufferedInputStreamInvalidMarkException recyclableBufferedInputStreamInvalidMarkException = logpurchasewithjsonlambda1.MediaSessionCompatQueueItem;
                    if (recyclableBufferedInputStreamInvalidMarkException != null) {
                        RegistryMissingComponentException registryMissingComponentException = logpurchasewithjsonlambda1.RemoteActionCompatParcelizer;
                        long j2 = registryMissingComponentException.size;
                        if (j2 > 0) {
                            recyclableBufferedInputStreamInvalidMarkException.write(registryMissingComponentException, j2);
                        }
                    }
                } catch (IOException e) {
                    r8lambda1dlenebwpksdsvf_xikspxtdeu.IconCompatParcelizer(e);
                }
                try {
                    RecyclableBufferedInputStreamInvalidMarkException recyclableBufferedInputStreamInvalidMarkException2 = logpurchasewithjsonlambda1.MediaSessionCompatQueueItem;
                    if (recyclableBufferedInputStreamInvalidMarkException2 != null) {
                        recyclableBufferedInputStreamInvalidMarkException2.close();
                    }
                } catch (IOException e2) {
                    r8lambda1dlenebwpksdsvf_xikspxtdeu.IconCompatParcelizer(e2);
                }
                try {
                    Socket socket = logpurchasewithjsonlambda1.MediaSessionCompatResultReceiverWrapper;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    r8lambda1dlenebwpksdsvf_xikspxtdeu.IconCompatParcelizer(e3);
                    return;
                }
            case 20:
                ((io.sentry.android.core.MediaMetadataCompat) this.write).IconCompatParcelizer(DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
                return;
            case 21:
                ((io.sentry.android.core.MediaSessionCompatToken) this.write).RemoteActionCompatParcelizer(DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
                return;
            case 22:
                ((io.sentry.android.replay.capture.read) this.write).invoke();
                return;
            case 23:
                ((io.sentry.android.replay.capture.read) this.write).invoke();
                return;
            case 24:
                ((io.sentry.android.replay.capture.read) this.write).invoke();
                return;
            case 25:
                ((io.sentry.android.replay.capture.read) this.write).invoke();
                return;
            case 26:
                ((io.sentry.android.replay.capture.read) this.write).invoke();
                return;
            case 27:
                ((io.sentry.android.replay.capture.read) this.write).invoke();
                return;
            case 28:
                io.sentry.logger.IconCompatParcelizer iconCompatParcelizer = (io.sentry.logger.IconCompatParcelizer) this.write;
                do {
                    iconCompatParcelizer.read();
                } while (iconCompatParcelizer.MediaDescriptionCompat.size() >= 100);
                UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = iconCompatParcelizer.MediaBrowserCompatMediaItem.serializer();
                try {
                    if (iconCompatParcelizer.MediaDescriptionCompat.isEmpty()) {
                        iconCompatParcelizer.read = false;
                    } else {
                        iconCompatParcelizer.serializer(true, false);
                    }
                    uriActionExternalSyntheticLambda4Serializer.close();
                    return;
                } catch (Throwable th) {
                    try {
                        uriActionExternalSyntheticLambda4Serializer.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            default:
                MetricsBatchProcessor metricsBatchProcessor = (MetricsBatchProcessor) this.write;
                do {
                    metricsBatchProcessor.serializer();
                } while (((ConcurrentLinkedQueue) metricsBatchProcessor.write).size() >= 1000);
                UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer2 = ((io.sentry.util.RemoteActionCompatParcelizer) metricsBatchProcessor.MediaSessionCompatQueueItem).serializer();
                try {
                    if (!((ConcurrentLinkedQueue) metricsBatchProcessor.write).isEmpty()) {
                        metricsBatchProcessor.read(false);
                        break;
                    }
                    uriActionExternalSyntheticLambda4Serializer2.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        uriActionExternalSyntheticLambda4Serializer2.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
        }
        while (true) {
            getVersionCode getversioncode = (getVersionCode) this.write;
            long jNanoTime = System.nanoTime();
            synchronized (getversioncode) {
                long j3 = Long.MIN_VALUE;
                r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve = null;
                int i3 = 0;
                int i4 = 0;
                for (r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve2 : getversioncode.read) {
                    if (getversioncode.RemoteActionCompatParcelizer(r8lambdaik1pft6kfq5yrxiftoy3aewpve2, jNanoTime) > 0) {
                        i4++;
                    } else {
                        i3++;
                        long j4 = jNanoTime - r8lambdaik1pft6kfq5yrxiftoy3aewpve2.PlaybackStateCompat;
                        if (j4 > j3) {
                            j3 = j4;
                            r8lambdaik1pft6kfq5yrxiftoy3aewpve = r8lambdaik1pft6kfq5yrxiftoy3aewpve2;
                        }
                    }
                }
                j = getversioncode.RemoteActionCompatParcelizer;
                if (j3 >= j || i3 > getversioncode.IconCompatParcelizer) {
                    getversioncode.read.remove(r8lambdaik1pft6kfq5yrxiftoy3aewpve);
                    r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(r8lambdaik1pft6kfq5yrxiftoy3aewpve.RemoteActionCompatParcelizer);
                    j = 0;
                } else if (i3 > 0) {
                    j -= j3;
                } else if (i4 <= 0) {
                    getversioncode.MediaSessionCompatQueueItem = false;
                    j = -1;
                }
            }
            if (j == -1) {
                return;
            }
            if (j > 0) {
                long j5 = j / 1000000;
                synchronized (((getVersionCode) this.write)) {
                    try {
                        ((getVersionCode) this.write).wait(j5, (int) (j - (1000000 * j5)));
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public /* synthetic */ isAutomaticGeofenceRequestsEnabled(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }
}
