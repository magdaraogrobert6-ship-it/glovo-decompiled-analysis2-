package io.sentry;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import androidx.work.impl.WorkerWrapper;
import coil3.ImageLoader$Builder;
import coil3.compose.AsyncImagePainter$launchJob$1;
import com.adjust.sdk.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import com.mapbox.common.HttpHeaders;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda6;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.android.core.write;
import io.sentry.hints.IconCompatParcelizer;
import io.sentry.okhttp.RemoteActionCompatParcelizer;
import io.sentry.protocol.PlaybackStateCompat;
import io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import io.sentry.util.network.NetworkBody;
import io.sentry.util.network.serializer;
import java.io.EOFException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.YieldKt;
import o.AccessibilityIterators;
import o.BannerViewExternalSyntheticLambda2;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.BrazeContentCardUtils;
import o.IBannerWebViewClientListener;
import o.InAppMessageHtmlBaseView;
import o.MediaSessionCompatQueueItem;
import o.OuterPlacementScope;
import o.RegistryMissingComponentException;
import o.TextAnnouncementContentCardView;
import o.UriActionExternalSyntheticLambda4;
import o._get_messageWebView_lambda0;
import o.accessgetButton10cp;
import o.accessgetDvrcp;
import o.accessgetEightcp;
import o.accessgetEndCallcp;
import o.accessgetF1cp;
import o.accessgetHcp;
import o.accessgetLastChannelcp;
import o.accessgetMannerModecp;
import o.accessgetMediaEjectcp;
import o.accessgetMediaPlayPausecp;
import o.accessgetSizeNHjbRcjd;
import o.createInAppMessageEventSubscriber;
import o.ensureSubscribedToInAppMessageEvents;
import o.executelambda4;
import o.formatQueryBundleForLoglambda0;
import o.logHtmlClicklambda0;
import o.obtainShadowContext;
import o.onAnimationEndlambda1;
import o.onDrawWithContent;
import o.openUriWithActionView;
import o.r8lambdaJPvm7ZRd1Lj4xMBdTc04D7x6Y;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdagMOkLYZmBEc7ze6BrDiqOwxqh1E;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setNativeShader;
import o.setPositiongyyYBs;
import o.setPrimaryDirectionalMotionAxisOverrider2epLt8ui;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class SentryClient$$ExternalSyntheticLambda1 implements obtainShadowContext, accessgetMediaEjectcp, OuterPlacementScope, OnSuccessListener, r8lambdaJPvm7ZRd1Lj4xMBdTc04D7x6Y, r8lambdagMOkLYZmBEc7ze6BrDiqOwxqh1E, serializer {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ SentryClient$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
        this.serializer = obj2;
        this.write = obj3;
    }

    @Override // o.r8lambdaJPvm7ZRd1Lj4xMBdTc04D7x6Y
    public void RemoteActionCompatParcelizer(logHtmlClicklambda0 loghtmlclicklambda0) {
        ConcurrentHashMap concurrentHashMap;
        SentryClient sentryClient = (SentryClient) this.read;
        BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2 = (BannerViewExternalSyntheticLambda2) this.serializer;
        executelambda4 executelambda4Var = (executelambda4) this.write;
        if (loghtmlclicklambda0 == null) {
            ((SentryOptions) sentryClient.RemoteActionCompatParcelizer).getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String strIconCompatParcelizer = null;
        BrazeContentCardUtils brazeContentCardUtils = bannerViewExternalSyntheticLambda2.write() != null ? BrazeContentCardUtils.Crashed : null;
        boolean z = BrazeContentCardUtils.Crashed == brazeContentCardUtils || bannerViewExternalSyntheticLambda2.read();
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy = bannerViewExternalSyntheticLambda2.MediaBrowserCompatMediaItem;
        String str = (r8lambda7ijbvrn0shyidcazufwejfc7yy == null || (concurrentHashMap = r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaDescriptionCompat) == null || !concurrentHashMap.containsKey(HttpHeaders.USER_AGENT)) ? null : (String) bannerViewExternalSyntheticLambda2.MediaBrowserCompatMediaItem.MediaDescriptionCompat.get(HttpHeaders.USER_AGENT);
        Object obj = executelambda4Var.read("sentry:typeCheckHint");
        if (obj instanceof IconCompatParcelizer) {
            strIconCompatParcelizer = ((IconCompatParcelizer) obj).IconCompatParcelizer();
            brazeContentCardUtils = BrazeContentCardUtils.Abnormal;
        }
        if (!loghtmlclicklambda0.serializer(brazeContentCardUtils, str, z, strIconCompatParcelizer) || loghtmlclicklambda0.PlaybackStateCompat == BrazeContentCardUtils.Ok) {
            return;
        }
        loghtmlclicklambda0.serializer(setNativeShader.serializer());
    }

    @Override // o.accessgetMediaEjectcp
    public Object apply(Object obj) {
        long jInsert;
        SQLiteEventStore sQLiteEventStore;
        int i = this.RemoteActionCompatParcelizer;
        Object obj2 = this.write;
        Object obj3 = this.serializer;
        Object obj4 = this.read;
        int i2 = 1;
        int i3 = 0;
        int i4 = 2;
        if (i != 2) {
            SQLiteEventStore sQLiteEventStore2 = (SQLiteEventStore) obj4;
            ArrayList arrayList = (ArrayList) obj3;
            accessgetEightcp accessgeteightcp = (accessgetEightcp) obj2;
            Cursor cursor = (Cursor) obj;
            while (cursor.moveToNext()) {
                long j = cursor.getLong(i3);
                int i5 = cursor.getInt(7) != 0 ? i2 : i3;
                accessgetEndCallcp accessgetendcallcp = new accessgetEndCallcp();
                accessgetendcallcp.write = new HashMap();
                String string = cursor.getString(i2);
                if (string == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null transportName");
                    return null;
                }
                accessgetendcallcp.MediaMetadataCompat = string;
                accessgetendcallcp.IconCompatParcelizer = Long.valueOf(cursor.getLong(i4));
                accessgetendcallcp.MediaDescriptionCompat = Long.valueOf(cursor.getLong(3));
                if (i5 != 0) {
                    String string2 = cursor.getString(4);
                    accessgetendcallcp.read = new accessgetF1cp(string2 == null ? SQLiteEventStore.read : new accessgetButton10cp(string2), cursor.getBlob(5));
                    sQLiteEventStore = sQLiteEventStore2;
                } else {
                    String string3 = cursor.getString(4);
                    accessgetButton10cp accessgetbutton10cp = string3 == null ? SQLiteEventStore.read : new accessgetButton10cp(string3);
                    Cursor cursorQuery = sQLiteEventStore2.IconCompatParcelizer().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        int length = i3;
                        while (cursorQuery.moveToNext()) {
                            byte[] blob = cursorQuery.getBlob(i3);
                            arrayList2.add(blob);
                            length += blob.length;
                        }
                        byte[] bArr = new byte[length];
                        int length2 = i3;
                        int i6 = length2;
                        while (i6 < arrayList2.size()) {
                            byte[] bArr2 = (byte[]) arrayList2.get(i6);
                            SQLiteEventStore sQLiteEventStore3 = sQLiteEventStore2;
                            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                            length2 += bArr2.length;
                            i6++;
                            sQLiteEventStore2 = sQLiteEventStore3;
                        }
                        sQLiteEventStore = sQLiteEventStore2;
                        cursorQuery.close();
                        accessgetendcallcp.read = new accessgetF1cp(accessgetbutton10cp, bArr);
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                if (!cursor.isNull(6)) {
                    accessgetendcallcp.RemoteActionCompatParcelizer = Integer.valueOf(cursor.getInt(6));
                }
                if (!cursor.isNull(8)) {
                    accessgetendcallcp.MediaSessionCompatQueueItem = Integer.valueOf(cursor.getInt(8));
                }
                if (!cursor.isNull(9)) {
                    accessgetendcallcp.RatingCompat = cursor.getString(9);
                }
                if (!cursor.isNull(10)) {
                    accessgetendcallcp.serializer = cursor.getBlob(10);
                }
                if (!cursor.isNull(11)) {
                    accessgetendcallcp.MediaBrowserCompatMediaItem = cursor.getBlob(11);
                }
                arrayList.add(new accessgetMannerModecp(j, accessgeteightcp, accessgetendcallcp.read()));
                sQLiteEventStore2 = sQLiteEventStore;
                i2 = 1;
                i3 = 0;
                i4 = 2;
            }
            return null;
        }
        SQLiteEventStore sQLiteEventStore4 = (SQLiteEventStore) obj4;
        accessgetDvrcp accessgetdvrcp = (accessgetDvrcp) obj3;
        accessgetF1cp accessgetf1cp = accessgetdvrcp.RemoteActionCompatParcelizer;
        String str = accessgetdvrcp.RatingCompat;
        accessgetEightcp accessgeteightcp2 = (accessgetEightcp) obj2;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        long jSimpleQueryForLong = sQLiteEventStore4.IconCompatParcelizer().compileStatement("PRAGMA page_count").simpleQueryForLong();
        long jSimpleQueryForLong2 = sQLiteEventStore4.IconCompatParcelizer().compileStatement("PRAGMA page_size").simpleQueryForLong();
        accessgetLastChannelcp accessgetlastchannelcp = sQLiteEventStore4.IconCompatParcelizer;
        if (jSimpleQueryForLong2 * jSimpleQueryForLong >= accessgetlastchannelcp.MediaDescriptionCompat) {
            sQLiteEventStore4.read(1L, accessgetHcp.CACHE_FULL, str);
            return -1L;
        }
        Long lIconCompatParcelizer = SQLiteEventStore.IconCompatParcelizer(sQLiteDatabase, accessgeteightcp2);
        if (lIconCompatParcelizer != null) {
            jInsert = lIconCompatParcelizer.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", accessgeteightcp2.serializer);
            contentValues.put(RemoteMessageConst.Notification.PRIORITY, Integer.valueOf(accessgetMediaPlayPausecp.serializer(accessgeteightcp2.IconCompatParcelizer)));
            contentValues.put("next_request_ms", (Integer) 0);
            byte[] bArr3 = accessgeteightcp2.read;
            if (bArr3 != null) {
                contentValues.put(InAppMessageBase.EXTRAS, Base64.encodeToString(bArr3, 0));
            }
            jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        int i7 = accessgetlastchannelcp.serializer;
        byte[] bArr4 = accessgetf1cp.IconCompatParcelizer;
        boolean z = bArr4.length <= i7;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(jInsert));
        contentValues2.put("transport_name", str);
        contentValues2.put("timestamp_ms", Long.valueOf(accessgetdvrcp.write));
        contentValues2.put("uptime_ms", Long.valueOf(accessgetdvrcp.MediaMetadataCompat));
        contentValues2.put("payload_encoding", accessgetf1cp.write.serializer);
        contentValues2.put("code", accessgetdvrcp.read);
        contentValues2.put("num_attempts", (Integer) 0);
        contentValues2.put("inline", Boolean.valueOf(z));
        contentValues2.put("payload", z ? bArr4 : new byte[0]);
        contentValues2.put("product_id", accessgetdvrcp.MediaSessionCompatQueueItem);
        contentValues2.put("pseudonymous_id", accessgetdvrcp.MediaDescriptionCompat);
        contentValues2.put("experiment_ids_clear_blob", accessgetdvrcp.serializer);
        contentValues2.put("experiment_ids_encrypted_blob", accessgetdvrcp.MediaBrowserCompatMediaItem);
        long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
        if (!z) {
            int iCeil = (int) Math.ceil(((double) bArr4.length) / ((double) i7));
            for (int i8 = 1; i8 <= iCeil; i8++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, (i8 - 1) * i7, Math.min(i8 * i7, bArr4.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(jInsert2));
                contentValues3.put("sequence_num", Integer.valueOf(i8));
                contentValues3.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues3);
            }
        }
        for (Map.Entry entry : Collections.unmodifiableMap(accessgetdvrcp.IconCompatParcelizer).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(jInsert2));
            contentValues4.put("name", (String) entry.getKey());
            contentValues4.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues4);
        }
        return Long.valueOf(jInsert2);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ImageLoader$Builder imageLoader$Builder = (ImageLoader$Builder) this.read;
        Task task = (Task) this.serializer;
        setPositiongyyYBs setpositiongyyybs = (setPositiongyyYBs) this.write;
        try {
            setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8ui = (setPrimaryDirectionalMotionAxisOverrider2epLt8ui) task.getResult();
            if (setprimarydirectionalmotionaxisoverrider2eplt8ui != null) {
                ((Executor) imageLoader$Builder.read).execute(new ND$$ExternalSyntheticLambda0(setpositiongyyybs, 22, ((zzbv) imageLoader$Builder.IconCompatParcelizer).read(setprimarydirectionalmotionaxisoverrider2eplt8ui)));
            }
        } catch (FirebaseRemoteConfigException e) {
            SentryLogcatAdapter.write("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }

    @Override // io.sentry.util.network.serializer
    public NetworkBody read(Object obj) throws EOFException {
        String str;
        Charset charsetSerializer;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = (_get_messageWebView_lambda0) this.read;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = (createInAppMessageEventSubscriber) this.serializer;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) this.write;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = (r8lambday113fDFTSR5e4PZj6XsSXLtpL60) obj;
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        RequestBody requestBody = r8lambday113fdftsr5e4pzj6xssxltpl60.body;
        if (requestBody != null) {
            RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
            requestBody.writeTo(registryMissingComponentException);
            byte[] bArr = registryMissingComponentException.read(registryMissingComponentException.size);
            _get_messagewebview_lambda0.write(((r8lambday113fDFTSR5e4PZj6XsSXLtpL60) createinappmessageeventsubscriber.IconCompatParcelizer).method, r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.RemoteActionCompatParcelizer(RequestBody.Companion, bArr, requestBody.contentType(), 0, 6));
            InAppMessageHtmlBaseView inAppMessageHtmlBaseViewContentType = requestBody.contentType();
            BrazeActionParserExternalSyntheticLambda0 logger = remoteActionCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().getLogger();
            logger.getClass();
            if (inAppMessageHtmlBaseViewContentType != null) {
                try {
                    str = inAppMessageHtmlBaseViewContentType.mediaType;
                } catch (Exception e) {
                    logger.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, MediaSessionCompatQueueItem.read(e, new StringBuilder("Failed to parse buffered request body: ")), new Object[0]);
                }
            } else {
                str = null;
            }
            String strName = (inAppMessageHtmlBaseViewContentType == null || (charsetSerializer = inAppMessageHtmlBaseViewContentType.serializer(ensureSubscribedToInAppMessageEvents.write)) == null) ? null : charsetSerializer.name();
            if (strName == null) {
                strName = Constants.ENCODING;
            }
            return io.sentry.util.network.IconCompatParcelizer.read(bArr, str, strName, logger);
        }
        return null;
    }

    @Override // o.obtainShadowContext
    public Object serializer(onDrawWithContent ondrawwithcontent) {
        TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) this.read;
        CoroutineStart coroutineStart = (CoroutineStart) this.serializer;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.write;
        ondrawwithcontent.RemoteActionCompatParcelizer(new Sentry$$ExternalSyntheticLambda5(5, (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textAnnouncementContentCardView.get(onAnimationEndlambda1.RemoteActionCompatParcelizer)), accessgetSizeNHjbRcjd.INSTANCE);
        return BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(textAnnouncementContentCardView), null, coroutineStart, new AsyncImagePainter$launchJob$1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ondrawwithcontent, null, 7), 1);
    }

    @Override // o.r8lambdagMOkLYZmBEc7ze6BrDiqOwxqh1E
    public void serializer(IBannerWebViewClientListener iBannerWebViewClientListener) {
        write writeVarRemoteActionCompatParcelizer;
        formatQueryBundleForLoglambda0 formatquerybundleforloglambda0 = (formatQueryBundleForLoglambda0) this.read;
        r8lambdagMOkLYZmBEc7ze6BrDiqOwxqh1E r8lambdagmoklyzmbec7ze6brdiqowxqh1e = (r8lambdagMOkLYZmBEc7ze6BrDiqOwxqh1E) this.serializer;
        AtomicReference atomicReference = (AtomicReference) this.write;
        if (r8lambdagmoklyzmbec7ze6brdiqowxqh1e != null) {
            r8lambdagmoklyzmbec7ze6brdiqowxqh1e.serializer(iBannerWebViewClientListener);
        }
        ActivityLifecycleIntegration$$ExternalSyntheticLambda6 activityLifecycleIntegration$$ExternalSyntheticLambda6 = formatquerybundleforloglambda0.ComponentActivity.MediaBrowserCompatMediaItem;
        if (activityLifecycleIntegration$$ExternalSyntheticLambda6 != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) activityLifecycleIntegration$$ExternalSyntheticLambda6.RemoteActionCompatParcelizer;
            WeakReference weakReference = (WeakReference) activityLifecycleIntegration$$ExternalSyntheticLambda6.serializer;
            String str = (String) activityLifecycleIntegration$$ExternalSyntheticLambda6.IconCompatParcelizer;
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                WorkerWrapper.Builder builder = activityLifecycleIntegration.RemoteActionCompatParcelizer;
                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = formatquerybundleforloglambda0.read;
                UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = ((io.sentry.util.RemoteActionCompatParcelizer) builder.IconCompatParcelizer).serializer();
                try {
                    if (builder.read()) {
                        write writeVar = null;
                        builder.RemoteActionCompatParcelizer(new io.sentry.android.core.RemoteActionCompatParcelizer(builder, activity, 1), (String) null);
                        write writeVar2 = (write) ((WeakHashMap) builder.MediaBrowserCompatMediaItem).remove(activity);
                        if (writeVar2 != null && (writeVarRemoteActionCompatParcelizer = builder.RemoteActionCompatParcelizer()) != null) {
                            writeVar = new write(writeVarRemoteActionCompatParcelizer.write - writeVar2.write, writeVarRemoteActionCompatParcelizer.read - writeVar2.read, writeVarRemoteActionCompatParcelizer.IconCompatParcelizer - writeVar2.IconCompatParcelizer);
                        }
                        if (writeVar != null && (writeVar.write != 0 || writeVar.read != 0 || writeVar.IconCompatParcelizer != 0)) {
                            PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat("none", Integer.valueOf(writeVar.write));
                            PlaybackStateCompat playbackStateCompat2 = new PlaybackStateCompat("none", Integer.valueOf(writeVar.read));
                            PlaybackStateCompat playbackStateCompat3 = new PlaybackStateCompat("none", Integer.valueOf(writeVar.IconCompatParcelizer));
                            HashMap map = new HashMap();
                            map.put("frames_total", playbackStateCompat);
                            map.put("frames_slow", playbackStateCompat2);
                            map.put("frames_frozen", playbackStateCompat3);
                            ((ConcurrentHashMap) builder.read).put(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, map);
                        }
                    }
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th) {
                    try {
                        uriActionExternalSyntheticLambda4Serializer.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.MediaSessionCompatResultReceiverWrapper;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        openUriWithActionView openuriwithactionview = formatquerybundleforloglambda0.RemoteActionCompatParcelizer;
        if (openuriwithactionview != null) {
            atomicReference.set(openuriwithactionview.RemoteActionCompatParcelizer(formatquerybundleforloglambda0));
        }
    }

    @Override // o.OuterPlacementScope
    public Object then(Task task) {
        URL url;
        ConfigRealtimeHttpClient configRealtimeHttpClient = (ConfigRealtimeHttpClient) this.read;
        Task task2 = (Task) this.serializer;
        Task task3 = (Task) this.write;
        if (!task2.isSuccessful()) {
            Object[] objArr = {new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task2.getException())};
            return (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
        }
        if (!task3.isSuccessful()) {
            Object[] objArr2 = {new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task3.getException())};
            return (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr2);
        }
        try {
            try {
                url = new URL(configRealtimeHttpClient.serializer(configRealtimeHttpClient.ComponentActivity));
            } catch (MalformedURLException unused) {
                SentryLogcatAdapter.serializer("FirebaseRemoteConfig", "URL is malformed");
                url = null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            configRealtimeHttpClient.IconCompatParcelizer(httpURLConnection, (String) task3.getResult(), ((AccessibilityIterators) task2.getResult()).IconCompatParcelizer);
            return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(httpURLConnection);
        } catch (IOException e) {
            Object[] objArr3 = {new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", (Exception) e)};
            return (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr3);
        }
    }
}
