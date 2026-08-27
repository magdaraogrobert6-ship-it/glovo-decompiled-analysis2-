package io.grpc.internal;

import com.google.protobuf.GeneratedMessageLite;
import io.grpc.Status;
import io.sentry.CombinedScopeView;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.io.TextStreamsKt;
import kotlin.ranges.RangesKt;
import o.BrazeWebViewClientType;
import o.WebContentUtilsExternalSyntheticLambda9;
import o.createWebViewClient;
import o.emptyToNull;
import o.getDeclaredMethodQuietly;
import o.getDeclaredMethodQuietlylambda1;
import o.getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release;
import o.getMd5Hash;
import o.getMethodQuietlylambda1;
import o.getPrettyPrintedStringlambda0;
import o.getSUFFIX_CACHE_USER_ID_HASH_VALUEannotations;
import o.hasPermission;
import o.hasPermissionlambda0;
import o.hasTooManyZipEntrieslambda0;
import o.isAutomaticGeofenceRequestsEnabled;
import o.isInvalidCustomEndpointandroid_sdk_base_release;
import o.isValidLogPurchaseInput;
import o.isValidLogPurchaseInputlambda0;
import o.isValidLogPurchaseInputlambda1;
import o.isValidLogPurchaseInputlambda3;
import o.logPurchaseWithJSONlambda0;
import o.markPageFinished;
import o.optEnum;
import o.parseCustomEventNameFromQueryBundle;
import o.parseJsonObjectIntoBundle;
import o.r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs;
import o.r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY;
import o.r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA;
import o.r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE;
import o.r8lambdaeBKMbUtEz9b64pfeC1hMDB8oxqM;
import o.r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8;
import o.r8lambdajAFF3CaZIwgetnRL48Ckjoh_eo;
import o.r8lambdakcTilwmporjFCAWe8ASdQv1Ks;
import o.replacePrefetchedUrlsWithLocalAssetslambda1;
import o.requestPushPermissionPromptlambda1;
import o.runOnUserlambda0;
import o.setDateOfBirthlambda3;
import o.setMaxUnpackedZipSizeBytesandroid_sdk_base_release;
import o.setResourcePackageNamelambda0;
import o.unpackZipIntoDirectory;
import o.validateChildFileExistsUnderParent;
import o.wouldPushPermissionPromptDisplaylambda1;
import o.wouldPushPermissionPromptDisplaylambda3;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class DelayedStream$3 implements Runnable {
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;
    public final Object write;

    public DelayedStream$3(isValidLogPurchaseInputlambda1 isvalidlogpurchaseinputlambda1, RangesKt rangesKt) {
        this.read = 8;
        this.serializer = isvalidlogpurchaseinputlambda1;
        TextStreamsKt.serializer(rangesKt, "savedListener");
        this.write = rangesKt;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8 r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8;
        Status statusRemoteActionCompatParcelizer;
        Object obj;
        CombinedScopeView combinedScopeViewRemoteActionCompatParcelizer;
        isValidLogPurchaseInputlambda3 isvalidlogpurchaseinputlambda3;
        getDeclaredMethodQuietlylambda1 getdeclaredmethodquietlylambda1;
        CombinedScopeView combinedScopeView = null;
        combinedScopeView = null;
        boolean z = true;
        switch (this.read) {
            case 0:
                ((isValidLogPurchaseInput) this.serializer).MediaSessionCompatResultReceiverWrapper.serializer((r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY) this.write);
                return;
            case 1:
                parseJsonObjectIntoBundle parsejsonobjectintobundle = hasPermission.read;
                validateChildFileExistsUnderParent validatechildfileexistsunderparent = (validateChildFileExistsUnderParent) this.serializer;
                hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = validatechildfileexistsunderparent.RemoteActionCompatParcelizer;
                if (hastoomanyzipentrieslambda0._init_lambda1 != validatechildfileexistsunderparent.read) {
                    return;
                }
                getDeclaredMethodQuietly getdeclaredmethodquietly = (getDeclaredMethodQuietly) this.write;
                List list = getdeclaredmethodquietly.serializer;
                getMd5Hash getmd5hash = hastoomanyzipentrieslambda0.MediaSessionCompatResultReceiverWrapper;
                optEnum optenum = optEnum.DEBUG;
                getmd5hash.IconCompatParcelizer(optenum, "Resolved address: {0}, config={1}", list, getdeclaredmethodquietly.write);
                hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda1 = ((validateChildFileExistsUnderParent) this.serializer).RemoteActionCompatParcelizer;
                setMaxUnpackedZipSizeBytesandroid_sdk_base_release setmaxunpackedzipsizebytesandroid_sdk_base_release = hastoomanyzipentrieslambda1.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                setMaxUnpackedZipSizeBytesandroid_sdk_base_release setmaxunpackedzipsizebytesandroid_sdk_base_release2 = setMaxUnpackedZipSizeBytesandroid_sdk_base_release.SUCCESS;
                if (setmaxunpackedzipsizebytesandroid_sdk_base_release != setmaxunpackedzipsizebytesandroid_sdk_base_release2) {
                    hastoomanyzipentrieslambda1.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(optEnum.INFO, "Address resolved: {0}", list);
                    ((validateChildFileExistsUnderParent) this.serializer).RemoteActionCompatParcelizer.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = setmaxunpackedzipsizebytesandroid_sdk_base_release2;
                }
                getDeclaredMethodQuietly getdeclaredmethodquietly2 = (getDeclaredMethodQuietly) this.write;
                getDeclaredMethodQuietlylambda1 getdeclaredmethodquietlylambda2 = getdeclaredmethodquietly2.IconCompatParcelizer;
                parseCustomEventNameFromQueryBundle parsecustomeventnamefromquerybundle = (parseCustomEventNameFromQueryBundle) getdeclaredmethodquietly2.write.read.get(markPageFinished.IconCompatParcelizer);
                hasPermission haspermission = (hasPermission) ((getDeclaredMethodQuietly) this.write).write.read.get(parsejsonobjectintobundle);
                r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8 r8lambdaizpyvcrxwzt4q0ceuk5mc_mf9 = (getdeclaredmethodquietlylambda2 == null || (obj = getdeclaredmethodquietlylambda2.write) == null) ? null : (r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8) obj;
                Status status = getdeclaredmethodquietlylambda2 != null ? getdeclaredmethodquietlylambda2.IconCompatParcelizer : null;
                hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda2 = ((validateChildFileExistsUnderParent) this.serializer).RemoteActionCompatParcelizer;
                int i = 15;
                int i2 = 18;
                if (hastoomanyzipentrieslambda2._init_lambda4) {
                    if (r8lambdaizpyvcrxwzt4q0ceuk5mc_mf9 != null) {
                        getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release getmaxunpackedzipentrysizebytesandroid_sdk_base_release = hastoomanyzipentrieslambda2.fullyDrawnReporter_delegatelambda0;
                        if (haspermission != null) {
                            getmaxunpackedzipentrysizebytesandroid_sdk_base_release.serializer(haspermission);
                            if (r8lambdaizpyvcrxwzt4q0ceuk5mc_mf9.RemoteActionCompatParcelizer() != null) {
                                ((validateChildFileExistsUnderParent) this.serializer).RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper.serializer(optenum, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            getmaxunpackedzipentrysizebytesandroid_sdk_base_release.serializer(r8lambdaizpyvcrxwzt4q0ceuk5mc_mf9.RemoteActionCompatParcelizer());
                        }
                    } else if (status == null) {
                        r8lambdaizpyvcrxwzt4q0ceuk5mc_mf9 = hasTooManyZipEntrieslambda0.read;
                        hastoomanyzipentrieslambda2.fullyDrawnReporter_delegatelambda0.serializer(null);
                    } else {
                        if (!hastoomanyzipentrieslambda2.onBackPressedDispatcher_delegatelambda00) {
                            hastoomanyzipentrieslambda2.MediaSessionCompatResultReceiverWrapper.serializer(optEnum.INFO, "Fallback to error due to invalid first service config without default config");
                            ((validateChildFileExistsUnderParent) this.serializer).serializer(getdeclaredmethodquietlylambda2.IconCompatParcelizer);
                            if (parsecustomeventnamefromquerybundle != null) {
                                boolean zIconCompatParcelizer = getdeclaredmethodquietlylambda2.IconCompatParcelizer.IconCompatParcelizer();
                                markPageFinished markpagefinished = parsecustomeventnamefromquerybundle.serializer;
                                getSUFFIX_CACHE_USER_ID_HASH_VALUEannotations getsuffix_cache_user_id_hash_valueannotations = markpagefinished.RatingCompat;
                                if (!zIconCompatParcelizer) {
                                    getsuffix_cache_user_id_hash_valueannotations.IconCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(i2, markpagefinished));
                                    return;
                                }
                                getMethodQuietlylambda1 getmethodquietlylambda1 = getsuffix_cache_user_id_hash_valueannotations.RemoteActionCompatParcelizer;
                                getmethodquietlylambda1.write();
                                getmethodquietlylambda1.execute(new Sentry$$ExternalSyntheticLambda5(i, getsuffix_cache_user_id_hash_valueannotations));
                                return;
                            }
                            return;
                        }
                        r8lambdaizpyvcrxwzt4q0ceuk5mc_mf9 = hastoomanyzipentrieslambda2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                    }
                    if (!r8lambdaizpyvcrxwzt4q0ceuk5mc_mf9.equals(((validateChildFileExistsUnderParent) this.serializer).RemoteActionCompatParcelizer.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw)) {
                        ((validateChildFileExistsUnderParent) this.serializer).RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(optEnum.INFO, "Service config changed{0}", r8lambdaizpyvcrxwzt4q0ceuk5mc_mf9 == hasTooManyZipEntrieslambda0.read ? " to empty" : "");
                        hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda3 = ((validateChildFileExistsUnderParent) this.serializer).RemoteActionCompatParcelizer;
                        hastoomanyzipentrieslambda3.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = r8lambdaizpyvcrxwzt4q0ceuk5mc_mf9;
                        hastoomanyzipentrieslambda3.getFullyDrawnReporter.RemoteActionCompatParcelizer = r8lambdaizpyvcrxwzt4q0ceuk5mc_mf9.write;
                    }
                    try {
                        ((validateChildFileExistsUnderParent) this.serializer).RemoteActionCompatParcelizer.onBackPressedDispatcher_delegatelambda00 = true;
                    } catch (RuntimeException e) {
                        hasTooManyZipEntrieslambda0.MediaMetadataCompat.log(Level.WARNING, "[" + ((validateChildFileExistsUnderParent) this.serializer).RemoteActionCompatParcelizer._init_lambda2 + "] Unexpected exception from parsing service config", (Throwable) e);
                    }
                    r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8 = r8lambdaizpyvcrxwzt4q0ceuk5mc_mf9;
                    break;
                } else {
                    if (r8lambdaizpyvcrxwzt4q0ceuk5mc_mf9 != null) {
                        hastoomanyzipentrieslambda2.MediaSessionCompatResultReceiverWrapper.serializer(optEnum.INFO, "Service config from name resolver discarded by channel settings");
                    }
                    hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda4 = ((validateChildFileExistsUnderParent) this.serializer).RemoteActionCompatParcelizer;
                    r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8 = hasTooManyZipEntrieslambda0.read;
                    if (haspermission != null) {
                        hastoomanyzipentrieslambda4.MediaSessionCompatResultReceiverWrapper.serializer(optEnum.INFO, "Config selector from name resolver discarded by channel settings");
                    }
                    ((validateChildFileExistsUnderParent) this.serializer).RemoteActionCompatParcelizer.fullyDrawnReporter_delegatelambda0.serializer(r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8.RemoteActionCompatParcelizer());
                }
                getPrettyPrintedStringlambda0 getprettyprintedstringlambda0 = ((getDeclaredMethodQuietly) this.write).write;
                validateChildFileExistsUnderParent validatechildfileexistsunderparent2 = (validateChildFileExistsUnderParent) this.serializer;
                if (validatechildfileexistsunderparent2.IconCompatParcelizer == validatechildfileexistsunderparent2.RemoteActionCompatParcelizer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
                    getprettyprintedstringlambda0.getClass();
                    OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(getprettyprintedstringlambda0);
                    if (getprettyprintedstringlambda0.read.containsKey(parsejsonobjectintobundle)) {
                        IdentityHashMap identityHashMap = new IdentityHashMap(((getPrettyPrintedStringlambda0) okHttpCall$1.write).read);
                        identityHashMap.remove(parsejsonobjectintobundle);
                        okHttpCall$1.write = new getPrettyPrintedStringlambda0(identityHashMap);
                    }
                    IdentityHashMap identityHashMap2 = (IdentityHashMap) okHttpCall$1.serializer;
                    if (identityHashMap2 != null) {
                        identityHashMap2.remove(parsejsonobjectintobundle);
                    }
                    Map map = r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8.RemoteActionCompatParcelizer;
                    if (map != null) {
                        okHttpCall$1.write(hasPermissionlambda0.IconCompatParcelizer, map);
                        okHttpCall$1.read();
                    }
                    getPrettyPrintedStringlambda0 getprettyprintedstringlambda1 = okHttpCall$1.read();
                    CallTracer callTracer = ((validateChildFileExistsUnderParent) this.serializer).IconCompatParcelizer.RemoteActionCompatParcelizer;
                    getPrettyPrintedStringlambda0 getprettyprintedstringlambda2 = getPrettyPrintedStringlambda0.serializer;
                    requestPushPermissionPromptlambda1 requestpushpermissionpromptlambda1 = new requestPushPermissionPromptlambda1(list, getprettyprintedstringlambda1, r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8.IconCompatParcelizer);
                    unpackZipIntoDirectory unpackzipintodirectory = (unpackZipIntoDirectory) callTracer.RemoteActionCompatParcelizer;
                    BrazeWebViewClientType brazeWebViewClientType = (BrazeWebViewClientType) requestpushpermissionpromptlambda1.RemoteActionCompatParcelizer;
                    if (brazeWebViewClientType == null) {
                        try {
                            logPurchaseWithJSONlambda0 logpurchasewithjsonlambda0 = (logPurchaseWithJSONlambda0) callTracer.IconCompatParcelizer;
                            String str = (String) logpurchasewithjsonlambda0.write;
                            wouldPushPermissionPromptDisplaylambda3 wouldpushpermissionpromptdisplaylambda3 = ((wouldPushPermissionPromptDisplaylambda1) logpurchasewithjsonlambda0.serializer).read(str);
                            if (wouldpushpermissionpromptdisplaylambda3 == null) {
                                final String str2 = "Trying to load '" + str + "' because using default policy, but it's unavailable";
                                throw new Exception(str2) { // from class: io.grpc.internal.AutoConfiguredLoadBalancerFactory$PolicyException
                                };
                            }
                            brazeWebViewClientType = new BrazeWebViewClientType(wouldpushpermissionpromptdisplaylambda3, null);
                        } catch (AutoConfiguredLoadBalancerFactory$PolicyException e2) {
                            unpackzipintodirectory.write(setResourcePackageNamelambda0.TRANSIENT_FAILURE, new createWebViewClient(Status.write.IconCompatParcelizer(e2.getMessage())));
                            ((hasPermissionlambda0) callTracer.write).read();
                            callTracer.serializer = null;
                            callTracer.write = new emptyToNull();
                            statusRemoteActionCompatParcelizer = Status.RatingCompat;
                        }
                    }
                    Object obj2 = brazeWebViewClientType.write;
                    wouldPushPermissionPromptDisplaylambda3 wouldpushpermissionpromptdisplaylambda4 = brazeWebViewClientType.RemoteActionCompatParcelizer;
                    if (((wouldPushPermissionPromptDisplaylambda3) callTracer.serializer) == null || !wouldpushpermissionpromptdisplaylambda4.read().equals(((wouldPushPermissionPromptDisplaylambda3) callTracer.serializer).read())) {
                        unpackzipintodirectory.write(setResourcePackageNamelambda0.CONNECTING, new runOnUserlambda0(z ? 1 : 0));
                        ((hasPermissionlambda0) callTracer.write).read();
                        callTracer.serializer = wouldpushpermissionpromptdisplaylambda4;
                        hasPermissionlambda0 haspermissionlambda0 = (hasPermissionlambda0) callTracer.write;
                        callTracer.write = wouldpushpermissionpromptdisplaylambda4.RemoteActionCompatParcelizer(unpackzipintodirectory);
                        unpackzipintodirectory.serializer.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(optEnum.INFO, "Load balancer changed from {0} to {1}", haspermissionlambda0.getClass().getSimpleName(), ((hasPermissionlambda0) callTracer.write).getClass().getSimpleName());
                    }
                    if (obj2 != null) {
                        unpackzipintodirectory.serializer.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(optEnum.DEBUG, "Load-balancing config: {0}", obj2);
                    }
                    statusRemoteActionCompatParcelizer = ((hasPermissionlambda0) callTracer.write).RemoteActionCompatParcelizer(new requestPushPermissionPromptlambda1(requestpushpermissionpromptlambda1.read, requestpushpermissionpromptlambda1.serializer, obj2));
                    if (parsecustomeventnamefromquerybundle != null) {
                        boolean zIconCompatParcelizer2 = statusRemoteActionCompatParcelizer.IconCompatParcelizer();
                        markPageFinished markpagefinished2 = parsecustomeventnamefromquerybundle.serializer;
                        getSUFFIX_CACHE_USER_ID_HASH_VALUEannotations getsuffix_cache_user_id_hash_valueannotations2 = markpagefinished2.RatingCompat;
                        if (!zIconCompatParcelizer2) {
                            getsuffix_cache_user_id_hash_valueannotations2.IconCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(i2, markpagefinished2));
                            return;
                        }
                        getMethodQuietlylambda1 getmethodquietlylambda2 = getsuffix_cache_user_id_hash_valueannotations2.RemoteActionCompatParcelizer;
                        getmethodquietlylambda2.write();
                        getmethodquietlylambda2.execute(new Sentry$$ExternalSyntheticLambda5(i, getsuffix_cache_user_id_hash_valueannotations2));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((WebContentUtilsExternalSyntheticLambda9) this.serializer).serializer(Status.read.IconCompatParcelizer(((StringBuilder) this.write).toString()), true);
                return;
            case 3:
                ((WebContentUtilsExternalSyntheticLambda9) this.serializer).PlaybackStateCompat.read((GeneratedMessageLite) this.write);
                return;
            case 4:
                ((isValidLogPurchaseInput) this.serializer).MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer((r8lambdakcTilwmporjFCAWe8ASdQv1Ks) this.write);
                return;
            case 5:
                ((isValidLogPurchaseInput) this.serializer).MediaSessionCompatResultReceiverWrapper.serializer((r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs) this.write);
                return;
            case 6:
                ((isValidLogPurchaseInput) this.serializer).MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer((setDateOfBirthlambda3) this.write);
                return;
            case 7:
                ((isValidLogPurchaseInputlambda0) this.serializer).write.write((r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) this.write);
                return;
            case 8:
                RangesKt rangesKt = (RangesKt) this.write;
                isValidLogPurchaseInputlambda1 isvalidlogpurchaseinputlambda1 = (isValidLogPurchaseInputlambda1) this.serializer;
                String str3 = isvalidlogpurchaseinputlambda1.MediaSessionCompatToken;
                getMethodQuietlylambda1 getmethodquietlylambda3 = isvalidlogpurchaseinputlambda1.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                Logger logger = isValidLogPurchaseInputlambda1.MediaMetadataCompat;
                Level level = Level.FINER;
                if (logger.isLoggable(level)) {
                    logger.finer("Attempting DNS resolution of " + str3);
                }
                int i3 = 0;
                try {
                    try {
                        r8lambdaeBKMbUtEz9b64pfeC1hMDB8oxqM r8lambdaebkmbutez9b64pfec1hmdb8oxqmWrite = isvalidlogpurchaseinputlambda1.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write(InetSocketAddress.createUnresolved(str3, isvalidlogpurchaseinputlambda1.ComponentActivity));
                        r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE r8lambda_glyxfcg6xju1wmp26w6t1itdue = r8lambdaebkmbutez9b64pfec1hmdb8oxqmWrite != null ? new r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE(r8lambdaebkmbutez9b64pfec1hmdb8oxqmWrite) : null;
                        List listSingletonList = Collections.EMPTY_LIST;
                        getPrettyPrintedStringlambda0 getprettyprintedstringlambda3 = getPrettyPrintedStringlambda0.serializer;
                        if (r8lambda_glyxfcg6xju1wmp26w6t1itdue == null) {
                            combinedScopeViewRemoteActionCompatParcelizer = isvalidlogpurchaseinputlambda1.RemoteActionCompatParcelizer();
                            try {
                                Status status2 = (Status) combinedScopeViewRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                                if (status2 != null) {
                                    rangesKt.serializer(status2);
                                    isvalidlogpurchaseinputlambda3 = new isValidLogPurchaseInputlambda3(this, ((Status) combinedScopeViewRemoteActionCompatParcelizer.RemoteActionCompatParcelizer) == null, i3);
                                } else {
                                    List list2 = (List) combinedScopeViewRemoteActionCompatParcelizer.read;
                                    if (list2 != null) {
                                        listSingletonList = list2;
                                    }
                                    getDeclaredMethodQuietlylambda1 getdeclaredmethodquietlylambda3 = (getDeclaredMethodQuietlylambda1) combinedScopeViewRemoteActionCompatParcelizer.write;
                                    getdeclaredmethodquietlylambda1 = getdeclaredmethodquietlylambda3 != null ? getdeclaredmethodquietlylambda3 : null;
                                    combinedScopeView = combinedScopeViewRemoteActionCompatParcelizer;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                combinedScopeView = combinedScopeViewRemoteActionCompatParcelizer;
                                rangesKt.serializer(Status.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Unable to resolve host " + str3).RemoteActionCompatParcelizer(e));
                                isvalidlogpurchaseinputlambda3 = new isValidLogPurchaseInputlambda3(this, combinedScopeView != null && ((Status) combinedScopeView.RemoteActionCompatParcelizer) == null, i3);
                            } catch (Throwable th) {
                                th = th;
                                getmethodquietlylambda3.execute(new isValidLogPurchaseInputlambda3(this, combinedScopeViewRemoteActionCompatParcelizer != null && ((Status) combinedScopeViewRemoteActionCompatParcelizer.RemoteActionCompatParcelizer) == null, i3));
                                throw th;
                            }
                            getmethodquietlylambda3.execute(isvalidlogpurchaseinputlambda3);
                            return;
                        }
                        if (logger.isLoggable(level)) {
                            logger.finer("Using proxy address " + r8lambda_glyxfcg6xju1wmp26w6t1itdue);
                        }
                        listSingletonList = Collections.singletonList(r8lambda_glyxfcg6xju1wmp26w6t1itdue);
                        getdeclaredmethodquietlylambda1 = null;
                        rangesKt.IconCompatParcelizer(new getDeclaredMethodQuietly(listSingletonList, getprettyprintedstringlambda3, getdeclaredmethodquietlylambda1));
                        isvalidlogpurchaseinputlambda3 = new isValidLogPurchaseInputlambda3(this, combinedScopeView != null && ((Status) combinedScopeView.RemoteActionCompatParcelizer) == null, i3);
                    } catch (Throwable th2) {
                        th = th2;
                        combinedScopeViewRemoteActionCompatParcelizer = null;
                    }
                } catch (IOException e4) {
                    e = e4;
                }
                getmethodquietlylambda3.execute(isvalidlogpurchaseinputlambda3);
                return;
            case 9:
                WebContentUtilsExternalSyntheticLambda9 webContentUtilsExternalSyntheticLambda9 = (WebContentUtilsExternalSyntheticLambda9) this.write;
                getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release getmaxunpackedzipentrysizebytesandroid_sdk_base_release2 = (getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release) this.serializer;
                hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda5 = getmaxunpackedzipentrysizebytesandroid_sdk_base_release2.write;
                if (getmaxunpackedzipentrysizebytesandroid_sdk_base_release2.read.get() != hasTooManyZipEntrieslambda0.IconCompatParcelizer) {
                    webContentUtilsExternalSyntheticLambda9.serializer();
                    return;
                }
                if (hastoomanyzipentrieslambda5.menuHostHelperlambda0 == null) {
                    hastoomanyzipentrieslambda5.menuHostHelperlambda0 = new LinkedHashSet();
                    hastoomanyzipentrieslambda5.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RemoteActionCompatParcelizer(hastoomanyzipentrieslambda5.fullyDrawnReporter_delegatelambda00, true);
                }
                hastoomanyzipentrieslambda5.menuHostHelperlambda0.add(webContentUtilsExternalSyntheticLambda9);
                return;
            case 10:
                ((r8lambdajAFF3CaZIwgetnRL48Ckjoh_eo) this.write).run();
                WebContentUtilsExternalSyntheticLambda9 webContentUtilsExternalSyntheticLambda10 = (WebContentUtilsExternalSyntheticLambda9) this.serializer;
                webContentUtilsExternalSyntheticLambda10.ParcelableVolumeInfo.write.addOnNewIntentListener.execute(new isInvalidCustomEndpointandroid_sdk_base_release(webContentUtilsExternalSyntheticLambda10, z ? 1 : 0));
                return;
            case 11:
                ((replacePrefetchedUrlsWithLocalAssetslambda1) ((logPurchaseWithJSONlambda0) this.serializer).write).ComponentActivity.write((r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) this.write);
                return;
            default:
                ((replacePrefetchedUrlsWithLocalAssetslambda1) ((logPurchaseWithJSONlambda0) this.serializer).write).ComponentActivity.serializer((SharedResourcePool) this.write);
                return;
        }
    }

    public /* synthetic */ DelayedStream$3(Object obj, int i, Object obj2) {
        this.read = i;
        this.serializer = obj;
        this.write = obj2;
    }
}
