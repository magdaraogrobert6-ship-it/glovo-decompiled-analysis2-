package com.huawei.hmf.tasks.a;

import android.os.Handler;
import android.os.SystemClock;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.Vw$E5;
import com.huawei.location.ut;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import fwfd.com.fwfsdk.constant.FWFConstants;
import io.grpc.Status;
import io.grpc.internal.SharedResourcePool;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.performance.AppStartMetrics;
import io.socket.client.Manager$1$2;
import io.socket.client.Manager$7;
import io.socket.engineio.client.EngineIOException;
import io.socket.engineio.client.Socket$2;
import java.net.SocketAddress;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.io.TextStreamsKt;
import o.ContentCardsFragment;
import o.ContentCardsFragmentcontentCardsUpdate5;
import o.JsonUtilsa;
import o.PackageUtils;
import o.ViewLayerCompanionOutlineProvider1;
import o.ViewLayerUniqueDrawingIdApi29;
import o.WebContentUtilsExternalSyntheticLambda9;
import o.accessgetApparentToRealOffsetnOccac;
import o.accessgetViewRootjd;
import o.contentCardsUpdate;
import o.contentCardsUpdatelambda0;
import o.copyZipEntryToOutputStream;
import o.countOccurrences;
import o.findOverlaps;
import o.getCameraDistancePx;
import o.getContainer;
import o.getContentCardsRecyclerView;
import o.getContentCardsViewBindingHandler;
import o.getCustomContentCardsViewBindingHandler;
import o.getEMAIL_ADDRESS_MAX_LENGTHannotations;
import o.getLocalHtmlUrlFromRemoteUrllambda2;
import o.getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release;
import o.getNetworkUnavailableJob;
import o.getOutlineProvider;
import o.handleQueryAction;
import o.handleUrlOverridelambda00;
import o.hasPermissionlambda0;
import o.hasTooManyZipEntrieslambda0;
import o.isAutomaticGeofenceRequestsEnabled;
import o.isValidEmailAddress;
import o.isValidLogPurchaseInput;
import o.isValidLogPurchaseInputlambda0;
import o.isValidPhoneNumber;
import o.logPurchaseWithJSONlambda0;
import o.markPageFinishedlambda00;
import o.networkUnavailable;
import o.networkUnavailablelambda0;
import o.onRefresh;
import o.optEnum;
import o.r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ;
import o.r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM;
import o.r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw;
import o.r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc;
import o.r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA;
import o.r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74;
import o.r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo;
import o.r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE;
import o.r8lambdalffyX2I1EXju9ZCwYII3pJGhPcs;
import o.r8lambday78CcsNUxER22a2WVqifR2BmBdo;
import o.replacePrefetchedUrlsWithLocalAssetslambda1;
import o.setContentCardUpdateHandler;
import o.setContentCardsRecyclerView;
import o.setContentCardsSwipeLayout;
import o.setCustomContentCardUpdateHandler;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;
import o.setMaxUnpackedZipSizeBytesandroid_sdk_base_release;
import o.setResourcePackageNamelambda0;
import o.swapRecyclerViewAdapter;
import o.unpackZipIntoDirectory;
import o.validateChildFileExistsUnderParent;
import o.visitSubtreeYYKmhodefault;
import okhttp3.internal.http2.Huffman$Node;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class d$a implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object read;
    public final /* synthetic */ Object write;

    public /* synthetic */ d$a(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
        this.read = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        getLocalHtmlUrlFromRemoteUrllambda2 getlocalhtmlurlfromremoteurllambda2;
        boolean z;
        markPageFinishedlambda00 markpagefinishedlambda00;
        r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc r8lambdaqoeirmdgq8inorysjl29whdetbc;
        String[] strArr;
        int i;
        ContentCardsFragmentcontentCardsUpdate5 contentCardsFragmentcontentCardsUpdate5Write;
        int i2;
        int i3;
        int i4 = 15;
        int i5 = 4;
        int i6 = 1;
        int i7 = 0;
        ut utVar = null;
        exc = null;
        Exception exc = null;
        exc = null;
        Exception exc2 = null;
        utVar = null;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                synchronized (((accessgetViewRootjd) this.write).RemoteActionCompatParcelizer) {
                    getCameraDistancePx getcameradistancepx = (getCameraDistancePx) ((accessgetViewRootjd) this.write).serializer;
                    if (getcameradistancepx != null) {
                        getcameradistancepx.onComplete((ViewLayerUniqueDrawingIdApi29) this.read);
                    }
                    break;
                }
                return;
            case 1:
                synchronized (((accessgetViewRootjd) this.write).RemoteActionCompatParcelizer) {
                    getContainer getcontainer = (getContainer) ((accessgetViewRootjd) this.write).serializer;
                    if (getcontainer != null) {
                        getcontainer.onFailure(((ViewLayerUniqueDrawingIdApi29) this.read).read());
                    }
                    break;
                }
                return;
            case 2:
                synchronized (((accessgetViewRootjd) this.write).RemoteActionCompatParcelizer) {
                    getOutlineProvider getoutlineprovider = (getOutlineProvider) ((accessgetViewRootjd) this.write).serializer;
                    if (getoutlineprovider != null) {
                        getoutlineprovider.onSuccess(((ViewLayerUniqueDrawingIdApi29) this.read).IconCompatParcelizer());
                    }
                    break;
                }
                return;
            case 3:
                ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1 = (ViewLayerCompanionOutlineProvider1) this.read;
                try {
                    viewLayerCompanionOutlineProvider1.IconCompatParcelizer(((Callable) this.write).call());
                    return;
                } catch (Exception e) {
                    viewLayerCompanionOutlineProvider1.read(e);
                    return;
                }
            case 4:
                ((r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo) this.write).RemoteActionCompatParcelizer.unregisterNetworkCallback((findOverlaps) this.read);
                return;
            case 5:
                ((r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo) this.write).serializer.unregisterReceiver((countOccurrences) this.read);
                return;
            case 6:
                JsonUtilsa jsonUtilsa = ((WebContentUtilsExternalSyntheticLambda9) this.write).PlaybackStateCompat;
                Status status = (Status) this.read;
                jsonUtilsa.read(status.ComponentActivity, status.MediaSessionCompatToken);
                return;
            case 7:
                ((getEMAIL_ADDRESS_MAX_LENGTHannotations) this.write).read.read((r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) this.read);
                return;
            case 8:
                ((getEMAIL_ADDRESS_MAX_LENGTHannotations) this.write).read.serializer(this.read);
                return;
            case 9:
                TextStreamsKt.RemoteActionCompatParcelizer("Channel must have been shut down", ((hasTooManyZipEntrieslambda0) ((isValidEmailAddress) this.write).serializer.jsonReflectionObjectSerializer).addContentView.get());
                return;
            case 10:
                ((isValidLogPurchaseInput) this.write).MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer((Status) this.read);
                return;
            case 11:
                ((isValidLogPurchaseInputlambda0) this.write).write.serializer((SharedResourcePool) this.read);
                return;
            case 12:
                Huffman$Node huffman$Node = ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write).write;
                SocketAddress socketAddress = (SocketAddress) ((r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) ((List) huffman$Node.write).get(huffman$Node.serializer)).read.get(huffman$Node.read);
                Huffman$Node huffman$Node2 = ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write).write;
                huffman$Node2.write = (List) this.read;
                huffman$Node2.RemoteActionCompatParcelizer();
                ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write).read = (List) this.read;
                if (((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write).ComponentActivity.IconCompatParcelizer == setResourcePackageNamelambda0.READY || ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write).ComponentActivity.IconCompatParcelizer == setResourcePackageNamelambda0.CONNECTING) {
                    Huffman$Node huffman$Node3 = ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write).write;
                    int i8 = 0;
                    while (true) {
                        if (i8 < ((List) huffman$Node3.write).size()) {
                            int iIndexOf = ((r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) ((List) huffman$Node3.write).get(i8)).read.indexOf(socketAddress);
                            if (iIndexOf == -1) {
                                i8++;
                            } else {
                                huffman$Node3.serializer = i8;
                                huffman$Node3.read = iIndexOf;
                            }
                        } else {
                            setResourcePackageNamelambda0 setresourcepackagenamelambda0 = ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write).ComponentActivity.IconCompatParcelizer;
                            setResourcePackageNamelambda0 setresourcepackagenamelambda1 = setResourcePackageNamelambda0.READY;
                            r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write;
                            if (setresourcepackagenamelambda0 == setresourcepackagenamelambda1) {
                                getlocalhtmlurlfromremoteurllambda2 = r8lambday78ccsnuxer22a2wvqifr2bmbdo.IconCompatParcelizer;
                                ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write).IconCompatParcelizer = null;
                                ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write).write.RemoteActionCompatParcelizer();
                                r8lambday78CcsNUxER22a2WVqifR2BmBdo.IconCompatParcelizer((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write, setResourcePackageNamelambda0.IDLE);
                            } else {
                                r8lambday78ccsnuxer22a2wvqifr2bmbdo.ParcelableVolumeInfo.RemoteActionCompatParcelizer(Status.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("InternalSubchannel closed pending transport due to address change"));
                                r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo2 = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write;
                                r8lambday78ccsnuxer22a2wvqifr2bmbdo2.ParcelableVolumeInfo = null;
                                r8lambday78ccsnuxer22a2wvqifr2bmbdo2.write.RemoteActionCompatParcelizer();
                                r8lambday78CcsNUxER22a2WVqifR2BmBdo.serializer((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write);
                            }
                        }
                        getlocalhtmlurlfromremoteurllambda2 = null;
                    }
                } else {
                    getlocalhtmlurlfromremoteurllambda2 = null;
                }
                if (getlocalhtmlurlfromremoteurllambda2 != null) {
                    r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo3 = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write;
                    if (r8lambday78ccsnuxer22a2wvqifr2bmbdo3.ResultReceiver != null) {
                        r8lambday78ccsnuxer22a2wvqifr2bmbdo3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer(Status.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("InternalSubchannel closed transport early due to address change"));
                        ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write).ResultReceiver.RatingCompat();
                        r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo4 = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write;
                        r8lambday78ccsnuxer22a2wvqifr2bmbdo4.ResultReceiver = null;
                        r8lambday78ccsnuxer22a2wvqifr2bmbdo4.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                    }
                    r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo5 = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write;
                    r8lambday78ccsnuxer22a2wvqifr2bmbdo5.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getlocalhtmlurlfromremoteurllambda2;
                    r8lambday78ccsnuxer22a2wvqifr2bmbdo5.ResultReceiver = r8lambday78ccsnuxer22a2wvqifr2bmbdo5.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read(new isAutomaticGeofenceRequestsEnabled(8, this), 5L, TimeUnit.SECONDS, r8lambday78ccsnuxer22a2wvqifr2bmbdo5.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                    return;
                }
                return;
            case 13:
                if (((r8lambday78CcsNUxER22a2WVqifR2BmBdo) ((accessgetApparentToRealOffsetnOccac) this.write).write).ComponentActivity.IconCompatParcelizer == setResourcePackageNamelambda0.SHUTDOWN) {
                    return;
                }
                getLocalHtmlUrlFromRemoteUrllambda2 getlocalhtmlurlfromremoteurllambda3 = ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) ((accessgetApparentToRealOffsetnOccac) this.write).write).IconCompatParcelizer;
                accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac = (accessgetApparentToRealOffsetnOccac) this.write;
                getLocalHtmlUrlFromRemoteUrllambda2 getlocalhtmlurlfromremoteurllambda4 = (getLocalHtmlUrlFromRemoteUrllambda2) accessgetapparenttorealoffsetnoccac.serializer;
                r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo6 = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) accessgetapparenttorealoffsetnoccac.write;
                if (getlocalhtmlurlfromremoteurllambda3 == getlocalhtmlurlfromremoteurllambda4) {
                    r8lambday78ccsnuxer22a2wvqifr2bmbdo6.IconCompatParcelizer = null;
                    ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) ((accessgetApparentToRealOffsetnOccac) this.write).write).write.RemoteActionCompatParcelizer();
                    r8lambday78CcsNUxER22a2WVqifR2BmBdo.IconCompatParcelizer((r8lambday78CcsNUxER22a2WVqifR2BmBdo) ((accessgetApparentToRealOffsetnOccac) this.write).write, setResourcePackageNamelambda0.IDLE);
                    return;
                }
                if (r8lambday78ccsnuxer22a2wvqifr2bmbdo6.ParcelableVolumeInfo == getlocalhtmlurlfromremoteurllambda4) {
                    TextStreamsKt.IconCompatParcelizer("Expected state is CONNECTING, actual state is %s", ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) ((accessgetApparentToRealOffsetnOccac) this.write).write).ComponentActivity.IconCompatParcelizer, r8lambday78ccsnuxer22a2wvqifr2bmbdo6.ComponentActivity.IconCompatParcelizer == setResourcePackageNamelambda0.CONNECTING);
                    Huffman$Node huffman$Node4 = ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) ((accessgetApparentToRealOffsetnOccac) this.write).write).write;
                    r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE r8lambda_glyxfcg6xju1wmp26w6t1itdue = (r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) ((List) huffman$Node4.write).get(huffman$Node4.serializer);
                    int i9 = huffman$Node4.read + 1;
                    huffman$Node4.read = i9;
                    if (i9 >= r8lambda_glyxfcg6xju1wmp26w6t1itdue.read.size()) {
                        huffman$Node4.serializer++;
                        huffman$Node4.read = 0;
                    }
                    Huffman$Node huffman$Node5 = ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) ((accessgetApparentToRealOffsetnOccac) this.write).write).write;
                    int i10 = huffman$Node5.serializer;
                    int size = ((List) huffman$Node5.write).size();
                    r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo7 = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) ((accessgetApparentToRealOffsetnOccac) this.write).write;
                    if (i10 < size) {
                        r8lambday78CcsNUxER22a2WVqifR2BmBdo.serializer(r8lambday78ccsnuxer22a2wvqifr2bmbdo7);
                        return;
                    }
                    r8lambday78ccsnuxer22a2wvqifr2bmbdo7.ParcelableVolumeInfo = null;
                    r8lambday78ccsnuxer22a2wvqifr2bmbdo7.write.RemoteActionCompatParcelizer();
                    r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo8 = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) ((accessgetApparentToRealOffsetnOccac) this.write).write;
                    Status status2 = (Status) this.read;
                    r8lambday78ccsnuxer22a2wvqifr2bmbdo8.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write();
                    TextStreamsKt.read("The error status must not be OK", !status2.IconCompatParcelizer());
                    r8lambday78ccsnuxer22a2wvqifr2bmbdo8.write(new PackageUtils(setResourcePackageNamelambda0.TRANSIENT_FAILURE, status2));
                    if (r8lambday78ccsnuxer22a2wvqifr2bmbdo8.PlaybackStateCompat == null) {
                        r8lambday78ccsnuxer22a2wvqifr2bmbdo8.RemoteActionCompatParcelizer.getClass();
                        r8lambday78ccsnuxer22a2wvqifr2bmbdo8.PlaybackStateCompat = new isValidPhoneNumber();
                    }
                    long jWrite = r8lambday78ccsnuxer22a2wvqifr2bmbdo8.PlaybackStateCompat.write();
                    visitSubtreeYYKmhodefault visitsubtreeyykmhodefault = r8lambday78ccsnuxer22a2wvqifr2bmbdo8.MediaMetadataCompat;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long jRemoteActionCompatParcelizer = jWrite - visitsubtreeyykmhodefault.RemoteActionCompatParcelizer();
                    r8lambday78ccsnuxer22a2wvqifr2bmbdo8.RatingCompat.IconCompatParcelizer(optEnum.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", r8lambday78CcsNUxER22a2WVqifR2BmBdo.RemoteActionCompatParcelizer(status2), Long.valueOf(jRemoteActionCompatParcelizer));
                    TextStreamsKt.RemoteActionCompatParcelizer("previous reconnectTask is not done", r8lambday78ccsnuxer22a2wvqifr2bmbdo8.PlaybackStateCompatCustomAction == null);
                    r8lambday78ccsnuxer22a2wvqifr2bmbdo8.PlaybackStateCompatCustomAction = r8lambday78ccsnuxer22a2wvqifr2bmbdo8.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read(new copyZipEntryToOutputStream(r8lambday78ccsnuxer22a2wvqifr2bmbdo8, 1), jRemoteActionCompatParcelizer, timeUnit, r8lambday78ccsnuxer22a2wvqifr2bmbdo8.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                    return;
                }
                return;
            case 14:
                validateChildFileExistsUnderParent validatechildfileexistsunderparent = (validateChildFileExistsUnderParent) this.write;
                Status status3 = (Status) this.read;
                Logger logger = hasTooManyZipEntrieslambda0.MediaMetadataCompat;
                Level level = Level.WARNING;
                hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = validatechildfileexistsunderparent.RemoteActionCompatParcelizer;
                logger.log(level, "[{0}] Failed to resolve name. status={1}", new Object[]{hastoomanyzipentrieslambda0._init_lambda2, status3});
                getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release getmaxunpackedzipentrysizebytesandroid_sdk_base_release = hastoomanyzipentrieslambda0.fullyDrawnReporter_delegatelambda0;
                if (getmaxunpackedzipentrysizebytesandroid_sdk_base_release.read.get() == hasTooManyZipEntrieslambda0.IconCompatParcelizer) {
                    getmaxunpackedzipentrysizebytesandroid_sdk_base_release.serializer(null);
                }
                setMaxUnpackedZipSizeBytesandroid_sdk_base_release setmaxunpackedzipsizebytesandroid_sdk_base_release = hastoomanyzipentrieslambda0.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                setMaxUnpackedZipSizeBytesandroid_sdk_base_release setmaxunpackedzipsizebytesandroid_sdk_base_release2 = setMaxUnpackedZipSizeBytesandroid_sdk_base_release.ERROR;
                if (setmaxunpackedzipsizebytesandroid_sdk_base_release != setmaxunpackedzipsizebytesandroid_sdk_base_release2) {
                    hastoomanyzipentrieslambda0.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(optEnum.WARNING, "Failed to resolve name: {0}", status3);
                    hastoomanyzipentrieslambda0.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = setmaxunpackedzipsizebytesandroid_sdk_base_release2;
                }
                unpackZipIntoDirectory unpackzipintodirectory = validatechildfileexistsunderparent.IconCompatParcelizer;
                if (unpackzipintodirectory != hastoomanyzipentrieslambda0.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
                    return;
                }
                ((hasPermissionlambda0) unpackzipintodirectory.RemoteActionCompatParcelizer.write).serializer(status3);
                return;
            case 15:
                synchronized (((replacePrefetchedUrlsWithLocalAssetslambda1) ((d$a) this.write).write).ResultReceiver) {
                    d$a d_a = (d$a) this.write;
                    if (((ut) d_a.read).write) {
                        z = true;
                    } else {
                        replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda1 = (replacePrefetchedUrlsWithLocalAssetslambda1) d_a.write;
                        replaceprefetchedurlswithlocalassetslambda1.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = replaceprefetchedurlswithlocalassetslambda1.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.serializer((handleUrlOverridelambda00) this.read);
                        replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda2 = (replacePrefetchedUrlsWithLocalAssetslambda1) ((d$a) this.write).write;
                        if (!replaceprefetchedurlswithlocalassetslambda2.serializer(replaceprefetchedurlswithlocalassetslambda2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) || ((markpagefinishedlambda00 = ((replacePrefetchedUrlsWithLocalAssetslambda1) ((d$a) this.write).write)._init_lambda1) != null && markpagefinishedlambda00.read.get() <= markpagefinishedlambda00.IconCompatParcelizer)) {
                            replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda3 = (replacePrefetchedUrlsWithLocalAssetslambda1) ((d$a) this.write).write;
                            handleQueryAction handlequeryaction = replaceprefetchedurlswithlocalassetslambda3.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                            if (!handlequeryaction.MediaSessionCompatQueueItem) {
                                handlequeryaction = new handleQueryAction(handlequeryaction.IconCompatParcelizer, handlequeryaction.read, handlequeryaction.RemoteActionCompatParcelizer, handlequeryaction.MediaMetadataCompat, handlequeryaction.write, handlequeryaction.MediaDescriptionCompat, true, handlequeryaction.serializer);
                            }
                            replaceprefetchedurlswithlocalassetslambda3.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = handlequeryaction;
                            ((replacePrefetchedUrlsWithLocalAssetslambda1) ((d$a) this.write).write).r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
                        } else {
                            replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda4 = (replacePrefetchedUrlsWithLocalAssetslambda1) ((d$a) this.write).write;
                            utVar = new ut(i4, replaceprefetchedurlswithlocalassetslambda4.ResultReceiver);
                            replaceprefetchedurlswithlocalassetslambda4.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = utVar;
                        }
                        z = false;
                    }
                    break;
                }
                if (z) {
                    handleUrlOverridelambda00 handleurloverridelambda00 = (handleUrlOverridelambda00) this.read;
                    handleurloverridelambda00.IconCompatParcelizer.read(new logPurchaseWithJSONlambda0((replacePrefetchedUrlsWithLocalAssetslambda1) ((d$a) this.write).write, 4, handleurloverridelambda00));
                    ((handleUrlOverridelambda00) this.read).IconCompatParcelizer.RemoteActionCompatParcelizer(Status.RemoteActionCompatParcelizer.IconCompatParcelizer("Unneeded hedging"));
                    return;
                } else {
                    if (utVar != null) {
                        replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda5 = (replacePrefetchedUrlsWithLocalAssetslambda1) ((d$a) this.write).write;
                        utVar.RemoteActionCompatParcelizer(replaceprefetchedurlswithlocalassetslambda5.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.schedule(new d$a(replaceprefetchedurlswithlocalassetslambda5, 16, utVar), replaceprefetchedurlswithlocalassetslambda5.PlaybackStateCompat.write, TimeUnit.NANOSECONDS));
                    }
                    ((replacePrefetchedUrlsWithLocalAssetslambda1) ((d$a) this.write).write).serializer((handleUrlOverridelambda00) this.read);
                    return;
                }
            case 16:
                replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda6 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.write;
                handleUrlOverridelambda00 handleurloverridelambda00RemoteActionCompatParcelizer = replaceprefetchedurlswithlocalassetslambda6.RemoteActionCompatParcelizer(replaceprefetchedurlswithlocalassetslambda6.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.serializer, false);
                if (handleurloverridelambda00RemoteActionCompatParcelizer == null) {
                    return;
                }
                ((replacePrefetchedUrlsWithLocalAssetslambda1) this.write).IconCompatParcelizer.execute(new d$a(this, i4, handleurloverridelambda00RemoteActionCompatParcelizer));
                return;
            case 17:
                ((AppStartMetrics) this.write).MediaSessionCompatToken = SystemClock.uptimeMillis();
                ((Handler) this.read).post(new e$$ExternalSyntheticLambda0(21, this));
                return;
            case 18:
                r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm = (r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM) this.write;
                URI uri = r8lambdach50szxgsvgzrle_f5bmf0a81gm.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                LinkedList linkedList = r8lambdach50szxgsvgzrle_f5bmf0a81gm.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                Logger logger2 = r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM.serializer;
                Level level2 = Level.FINE;
                if (logger2.isLoggable(level2)) {
                    logger2.fine("readyState " + r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaSessionCompatResultReceiverWrapper);
                }
                r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc r8lambdaqoeirmdgq8inorysjl29whdetbc2 = r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaSessionCompatResultReceiverWrapper;
                if (r8lambdaqoeirmdgq8inorysjl29whdetbc2 == r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc.OPEN || r8lambdaqoeirmdgq8inorysjl29whdetbc2 == (r8lambdaqoeirmdgq8inorysjl29whdetbc = r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc.OPENING)) {
                    return;
                }
                if (logger2.isLoggable(level2)) {
                    logger2.fine("opening " + uri);
                }
                contentCardsUpdatelambda0 contentcardsupdatelambda0 = new contentCardsUpdatelambda0(uri, r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaSessionCompatToken);
                r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaMetadataCompat = contentcardsupdatelambda0;
                r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaSessionCompatResultReceiverWrapper = r8lambdaqoeirmdgq8inorysjl29whdetbc;
                r8lambdach50szxgsvgzrle_f5bmf0a81gm.PlaybackStateCompat = false;
                int i11 = 1;
                contentcardsupdatelambda0.read("transport", new ContentCardsFragment(r8lambdach50szxgsvgzrle_f5bmf0a81gm, i11));
                Manager$1$2 manager$1$2 = new Manager$1$2(this, r8lambdach50szxgsvgzrle_f5bmf0a81gm, 0);
                contentcardsupdatelambda0.read("open", manager$1$2);
                contentCardsUpdate contentcardsupdate = new contentCardsUpdate(contentcardsupdatelambda0, "open", manager$1$2);
                Manager$1$2 manager$1$3 = new Manager$1$2(this, r8lambdach50szxgsvgzrle_f5bmf0a81gm, i11);
                contentcardsupdatelambda0.read(FWFConstants.EXPLANATION_TYPE_ERROR, manager$1$3);
                contentCardsUpdate contentcardsupdate2 = new contentCardsUpdate(contentcardsupdatelambda0, FWFConstants.EXPLANATION_TYPE_ERROR, manager$1$3);
                long j = r8lambdach50szxgsvgzrle_f5bmf0a81gm.IconCompatParcelizer;
                Vw$E5 vw$E5 = new Vw$E5(j, contentcardsupdate, contentcardsupdatelambda0);
                if (j == 0) {
                    r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(vw$E5);
                    return;
                }
                if (j > 0) {
                    logger2.fine(String.format("connection attempt will timeout after %d", Long.valueOf(j)));
                    Timer timer = new Timer();
                    timer.schedule(new Manager$7(5, vw$E5), j);
                    linkedList.add(new r8lambdalffyX2I1EXju9ZCwYII3pJGhPcs(timer, 1));
                }
                linkedList.add(contentcardsupdate);
                linkedList.add(contentcardsupdate2);
                contentCardsUpdatelambda0 contentcardsupdatelambda1 = r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaMetadataCompat;
                contentcardsupdatelambda1.getClass();
                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new Socket$2(contentcardsupdatelambda1, 0));
                return;
            case 19:
                Object[] objArr = (Object[]) this.read;
                getContentCardsRecyclerView getcontentcardsrecyclerview = (getContentCardsRecyclerView) this.write;
                boolean[] zArr = getcontentcardsrecyclerview.write;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                Logger logger3 = networkUnavailablelambda0.write;
                if (logger3.isLoggable(Level.FINE)) {
                    logger3.fine(String.format("sending ack %s", objArr.length != 0 ? objArr : null));
                }
                JSONArray jSONArray = new JSONArray();
                for (Object obj : objArr) {
                    jSONArray.put(obj);
                }
                r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ r8lambdaa1ganccjs3o2sewhmv3kuv99jq = new r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ();
                r8lambdaa1ganccjs3o2sewhmv3kuv99jq.read = 3;
                r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer = jSONArray;
                r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer = getcontentcardsrecyclerview.read;
                getcontentcardsrecyclerview.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdaa1ganccjs3o2sewhmv3kuv99jq);
                return;
            case 20:
                getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler = (getCustomContentCardsViewBindingHandler) this.write;
                String str = (String) this.read;
                getcustomcontentcardsviewbindinghandler.getClass();
                getcustomcontentcardsviewbindinghandler.RemoteActionCompatParcelizer(new ContentCardsFragmentcontentCardsUpdate5("message", str));
                return;
            case 21:
                getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler2 = (getCustomContentCardsViewBindingHandler) this.write;
                byte[] bArr = (byte[]) this.read;
                getcustomcontentcardsviewbindinghandler2.getClass();
                getcustomcontentcardsviewbindinghandler2.RemoteActionCompatParcelizer(new ContentCardsFragmentcontentCardsUpdate5("message", bArr));
                return;
            case 22:
                getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler3 = (getCustomContentCardsViewBindingHandler) this.read;
                getContentCardsViewBindingHandler[] getcontentcardsviewbindinghandlerArr = (getContentCardsViewBindingHandler[]) this.write;
                getcustomcontentcardsviewbindinghandler3.serializer("upgrade", getcontentcardsviewbindinghandlerArr[0]);
                getcustomcontentcardsviewbindinghandler3.serializer("upgradeError", getcontentcardsviewbindinghandlerArr[0]);
                return;
            case 23:
                getNetworkUnavailableJob getnetworkunavailablejob = (getNetworkUnavailableJob) this.write;
                if (getnetworkunavailablejob.RatingCompat == onRefresh.OPEN) {
                    getnetworkunavailablejob.IconCompatParcelizer((ContentCardsFragmentcontentCardsUpdate5[]) this.read);
                    return;
                } else {
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Transport not open");
                    return;
                }
            case 24:
                networkUnavailable.PlaybackStateCompatCustomAction.fine("paused");
                ((networkUnavailable) this.read).RatingCompat = onRefresh.PAUSED;
                ((r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74) ((d$a) this.write).read).run();
                return;
            case 25:
                networkUnavailable networkunavailable = (networkUnavailable) this.write;
                networkunavailable.RatingCompat = onRefresh.PAUSED;
                d$a d_a2 = new d$a(this, 24, networkunavailable);
                boolean z2 = networkunavailable.ParcelableVolumeInfo;
                if (!z2 && networkunavailable.MediaSessionCompatToken) {
                    d_a2.run();
                    return;
                }
                int[] iArr = {0};
                if (z2) {
                    networkUnavailable.PlaybackStateCompatCustomAction.fine("we are currently polling - waiting to pause");
                    iArr[0] = iArr[0] + 1;
                    networkunavailable.serializer("pollComplete", new setContentCardUpdateHandler(iArr, d_a2, 0));
                }
                if (networkunavailable.MediaSessionCompatToken) {
                    return;
                }
                networkUnavailable.PlaybackStateCompatCustomAction.fine("we are currently writing - waiting to pause");
                iArr[0] = iArr[0] + 1;
                networkunavailable.serializer("drain", new setContentCardUpdateHandler(iArr, d_a2, 1));
                return;
            case 26:
                ((setContentCardsRecyclerView) this.write).write.write("responseHeaders", ((Object[]) this.read)[0]);
                return;
            case 27:
                Object[] objArr2 = (Object[]) this.read;
                if (objArr2.length > 0) {
                    Object obj2 = objArr2[0];
                    if (obj2 instanceof Exception) {
                        exc2 = (Exception) obj2;
                    }
                }
                setContentCardsSwipeLayout setcontentcardsswipelayout = ((setContentCardsRecyclerView) this.write).write;
                Logger logger4 = setContentCardsSwipeLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                setcontentcardsswipelayout.write(FWFConstants.EXPLANATION_TYPE_ERROR, new EngineIOException("xhr post error", exc2));
                return;
            case 28:
                Object[] objArr3 = (Object[]) this.read;
                Object obj3 = objArr3.length > 0 ? objArr3[0] : null;
                setContentCardsSwipeLayout setcontentcardsswipelayout2 = ((setContentCardsRecyclerView) this.write).write;
                String str2 = (String) obj3;
                setcontentcardsswipelayout2.getClass();
                Logger logger5 = networkUnavailable.PlaybackStateCompatCustomAction;
                if (logger5.isLoggable(Level.FINE)) {
                    logger5.fine("polling got data " + str2);
                }
                setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(20, setcontentcardsswipelayout2);
                ContentCardsFragmentcontentCardsUpdate5 contentCardsFragmentcontentCardsUpdate5 = swapRecyclerViewAdapter.RemoteActionCompatParcelizer;
                if (str2 == null || str2.length() == 0) {
                    sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.RemoteActionCompatParcelizer(contentCardsFragmentcontentCardsUpdate5);
                } else {
                    String[] strArrSplit = str2.split(String.valueOf((char) 30));
                    int length = strArrSplit.length;
                    int i12 = 0;
                    while (i12 < length) {
                        String str3 = strArrSplit[i12];
                        if (str3 == null) {
                            strArr = strArrSplit;
                            contentCardsFragmentcontentCardsUpdate5Write = contentCardsFragmentcontentCardsUpdate5;
                            i = length;
                        } else {
                            if (str3.charAt(i7) == 'b') {
                                byte[] bytes = str3.substring(i6).getBytes();
                                int length2 = bytes.length;
                                int i13 = (length2 * 3) / i5;
                                byte[] bArr2 = new byte[i13];
                                int[] iArr2 = setCustomContentCardUpdateHandler.IconCompatParcelizer;
                                int i14 = 0;
                                int i15 = 0;
                                int i16 = 0;
                                int i17 = 0;
                                while (true) {
                                    if (i14 < length2) {
                                        if (i15 == 0) {
                                            while (true) {
                                                int i18 = i14 + 4;
                                                if (i18 <= length2) {
                                                    strArr = strArrSplit;
                                                    i = length;
                                                    int i19 = (iArr2[bytes[i14 + 1] & 255 ? 1 : 0] << 12) | (iArr2[bytes[i14] & 255 ? 1 : 0] << 18) | (iArr2[bytes[i14 + 2] & 255 ? 1 : 0] << 6) | iArr2[bytes[i14 + 3] & 255 ? 1 : 0];
                                                    if (i19 >= 0) {
                                                        bArr2[i16 + 2] = (byte) i19;
                                                        bArr2[i16 + 1] = (byte) (i19 >> 8);
                                                        bArr2[i16] = (byte) (i19 >> 16);
                                                        i16 += 3;
                                                        i17 = i19;
                                                        i14 = i18;
                                                        strArrSplit = strArr;
                                                        length = i;
                                                    } else {
                                                        i17 = i19;
                                                    }
                                                } else {
                                                    strArr = strArrSplit;
                                                    i = length;
                                                }
                                            }
                                            if (i14 >= length2) {
                                                i2 = 1;
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("bad base-64");
                                            return;
                                        }
                                        strArr = strArrSplit;
                                        i = length;
                                        int i20 = iArr2[bytes[i14] & 255 ? 1 : 0];
                                        if (i15 != 0) {
                                            if (i15 != 1) {
                                                if (i15 != 2) {
                                                    if (i15 != 3) {
                                                        if (i15 != 4) {
                                                            if (i15 == 5 && i20 != -1) {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("bad base-64");
                                                                return;
                                                            }
                                                        } else if (i20 == -2) {
                                                            i15++;
                                                        } else if (i20 != -1) {
                                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("bad base-64");
                                                            return;
                                                        }
                                                    } else if (i20 >= 0) {
                                                        int i21 = i20 | (i17 << 6);
                                                        bArr2[i16 + 2] = (byte) i21;
                                                        bArr2[i16 + 1] = (byte) (i21 >> 8);
                                                        bArr2[i16] = (byte) (i21 >> 16);
                                                        i16 += 3;
                                                        i17 = i21;
                                                        i15 = 0;
                                                    } else if (i20 == -2) {
                                                        bArr2[i16 + 1] = (byte) (i17 >> 2);
                                                        bArr2[i16] = (byte) (i17 >> 10);
                                                        i16 += 2;
                                                        i15 = 5;
                                                    } else if (i20 != -1) {
                                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("bad base-64");
                                                        return;
                                                    }
                                                } else if (i20 >= 0) {
                                                    i20 |= i17 << 6;
                                                    i15++;
                                                    i17 = i20;
                                                } else if (i20 == -2) {
                                                    bArr2[i16] = (byte) (i17 >> 4);
                                                    i16++;
                                                    i15 = 4;
                                                } else if (i20 != -1) {
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("bad base-64");
                                                    return;
                                                }
                                            } else if (i20 >= 0) {
                                                i20 |= i17 << 6;
                                                i15++;
                                                i17 = i20;
                                            } else if (i20 != -1) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("bad base-64");
                                                return;
                                            }
                                        } else if (i20 >= 0) {
                                            i15++;
                                            i17 = i20;
                                        } else if (i20 != -1) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("bad base-64");
                                            return;
                                        }
                                        i14++;
                                        strArrSplit = strArr;
                                        length = i;
                                        i6 = 1;
                                    } else {
                                        strArr = strArrSplit;
                                        i = length;
                                        i2 = i6;
                                    }
                                }
                                if (i15 != i2) {
                                    if (i15 != 2) {
                                        if (i15 == 3) {
                                            bArr2[i16] = (byte) (i17 >> 10);
                                            bArr2[i16 + 1] = (byte) (i17 >> 2);
                                            i16 += 2;
                                        } else if (i15 == 4) {
                                        }
                                        i3 = i16;
                                    } else {
                                        i3 = i16 + 1;
                                        bArr2[i16] = (byte) (i17 >> 4);
                                    }
                                    if (i3 != i13) {
                                        byte[] bArr3 = new byte[i3];
                                        System.arraycopy(bArr2, 0, bArr3, 0, i3);
                                        bArr2 = bArr3;
                                    }
                                    contentCardsFragmentcontentCardsUpdate5Write = new ContentCardsFragmentcontentCardsUpdate5("message", bArr2);
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("bad base-64");
                                return;
                            }
                            strArr = strArrSplit;
                            i = length;
                            contentCardsFragmentcontentCardsUpdate5Write = swapRecyclerViewAdapter.write(str3);
                        }
                        if (contentCardsFragmentcontentCardsUpdate5.IconCompatParcelizer.equals(contentCardsFragmentcontentCardsUpdate5Write.IconCompatParcelizer) && ((String) contentCardsFragmentcontentCardsUpdate5.RemoteActionCompatParcelizer).equals(contentCardsFragmentcontentCardsUpdate5Write.RemoteActionCompatParcelizer)) {
                            sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.RemoteActionCompatParcelizer(contentCardsFragmentcontentCardsUpdate5);
                        } else if (sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.RemoteActionCompatParcelizer(contentCardsFragmentcontentCardsUpdate5Write)) {
                            i12++;
                            strArrSplit = strArr;
                            length = i;
                            i5 = 4;
                            i6 = 1;
                            i7 = 0;
                        }
                    }
                }
                if (setcontentcardsswipelayout2.RatingCompat != onRefresh.CLOSED) {
                    setcontentcardsswipelayout2.ParcelableVolumeInfo = false;
                    setcontentcardsswipelayout2.write("pollComplete", new Object[0]);
                    if (setcontentcardsswipelayout2.RatingCompat == onRefresh.OPEN) {
                        setcontentcardsswipelayout2.read();
                        return;
                    }
                    if (logger5.isLoggable(Level.FINE)) {
                        logger5.fine("ignoring poll - transport state '" + setcontentcardsswipelayout2.RatingCompat + "'");
                        return;
                    }
                    return;
                }
                return;
            default:
                Object[] objArr4 = (Object[]) this.read;
                if (objArr4.length > 0) {
                    Object obj4 = objArr4[0];
                    if (obj4 instanceof Exception) {
                        exc = (Exception) obj4;
                    }
                }
                setContentCardsSwipeLayout setcontentcardsswipelayout3 = ((setContentCardsRecyclerView) this.write).write;
                Logger logger6 = setContentCardsSwipeLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                setcontentcardsswipelayout3.getClass();
                setcontentcardsswipelayout3.write(FWFConstants.EXPLANATION_TYPE_ERROR, new EngineIOException("xhr poll error", exc));
                return;
        }
    }

    public /* synthetic */ d$a(Object obj, Object obj2, boolean z, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
        this.write = obj2;
    }
}
