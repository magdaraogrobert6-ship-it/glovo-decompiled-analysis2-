package io.sentry;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.util.Base64OutputStream;
import android.util.Log;
import androidx.lifecycle.BlockRunner;
import bo.app.f2$$ExternalSyntheticLambda4;
import coil3.util.UtilsKt;
import com.adjust.sdk.Constants;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.firestore.remote.FirestoreCallCredentials;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.grpc.CallOptions$Builder;
import io.grpc.stub.ClientCalls;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import o.AndroidComposeViewCompanion;
import o.ParentDataModifierDefaultImpls;
import o.Rstyleable;
import o.StringUtils;
import o.access500;
import o.colorResource;
import o.getBrazeActionVersionAndJsonlambda0;
import o.getFontLoaderannotations;
import o.getInspectableElements;
import o.getShowLayoutBounds;
import o.getTextInputService;
import o.mergeJsonObjectslambda00;
import o.mergeJsonObjectslambda10;
import o.onEndApplyChanges;
import o.onSemanticsChange;
import o.r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo;
import o.setCustomUserAttributeJSON;
import o.setEnableExtraAssertions;
import o.voteFrameRate;
import o.wouldPushPermissionPromptDisplaylambda2;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class HostnameCache$$ExternalSyntheticLambda1 implements Callable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ HostnameCache$$ExternalSyntheticLambda1(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.IconCompatParcelizer;
        boolean z = false;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                getBrazeActionVersionAndJsonlambda0 getbrazeactionversionandjsonlambda0 = (getBrazeActionVersionAndJsonlambda0) obj;
                try {
                    getbrazeactionversionandjsonlambda0.MediaSessionCompatQueueItem.getClass();
                    getbrazeactionversionandjsonlambda0.MediaMetadataCompat = InetAddress.getLocalHost().getCanonicalHostName();
                    getbrazeactionversionandjsonlambda0.IconCompatParcelizer = System.currentTimeMillis() + getbrazeactionversionandjsonlambda0.read;
                    return null;
                } finally {
                    getbrazeactionversionandjsonlambda0.MediaBrowserCompatMediaItem.set(false);
                }
            case 1:
                return (AssetFileDescriptor) obj;
            case 2:
                access500 access500Var = (access500) ((colorResource) obj).write;
                mergeJsonObjectslambda00 mergejsonobjectslambda00 = (mergeJsonObjectslambda00) access500Var.MediaSessionCompatQueueItem;
                getInspectableElements getinspectableelements = (getInspectableElements) access500Var.serializer;
                mergejsonobjectslambda00.getClass();
                CrashlyticsWorkers.read();
                try {
                    HashMap mapSerializer = mergeJsonObjectslambda00.serializer(getinspectableelements);
                    HttpGetRequest httpGetRequest = new HttpGetRequest(mergejsonobjectslambda00.RemoteActionCompatParcelizer, mapSerializer);
                    httpGetRequest.RemoteActionCompatParcelizer(ConstantKt.USER_AGENT_HEADER, "Crashlytics Android SDK/20.0.4");
                    httpGetRequest.RemoteActionCompatParcelizer("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    mergeJsonObjectslambda00.write(httpGetRequest, getinspectableelements);
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    mapSerializer.toString();
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    return mergejsonobjectslambda00.serializer(httpGetRequest.RemoteActionCompatParcelizer());
                } catch (IOException e) {
                    SentryLogcatAdapter.read("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
            case 3:
                BlockRunner blockRunner = (BlockRunner) obj;
                getTextInputService gettextinputservice = (getTextInputService) blockRunner.serializer;
                Context context = (Context) blockRunner.RemoteActionCompatParcelizer;
                try {
                    ProviderInstaller.installIfNeeded(context);
                    break;
                } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IllegalStateException e2) {
                    onEndApplyChanges.RemoteActionCompatParcelizer("GrpcCallProvider", "Failed to update ssl context: %s", e2);
                }
                int i2 = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
                Rstyleable rstyleable = (Rstyleable) UtilsKt.RemoteActionCompatParcelizer(1751724500, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{"firestore.googleapis.com"}, -1751724496, i2, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
                rstyleable.MediaSessionCompatQueueItem = 30000000000L;
                long jMax = Math.max(30000000000L, 10000000000L);
                rstyleable.MediaSessionCompatQueueItem = jMax;
                if (jMax >= Rstyleable.serializer) {
                    rstyleable.MediaSessionCompatQueueItem = Long.MAX_VALUE;
                }
                StringUtils stringUtils = new StringUtils(rstyleable);
                stringUtils.write = context;
                wouldPushPermissionPromptDisplaylambda2 wouldpushpermissionpromptdisplaylambda2 = stringUtils.read();
                gettextinputservice.RemoteActionCompatParcelizer(new getFontLoaderannotations(blockRunner, (r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo) wouldpushpermissionpromptdisplaylambda2, objArr == true ? 1 : 0));
                mergeJsonObjectslambda10 mergejsonobjectslambda10IconCompatParcelizer = mergeJsonObjectslambda10.RemoteActionCompatParcelizer.IconCompatParcelizer(ClientCalls.RemoteActionCompatParcelizer, setCustomUserAttributeJSON.ASYNC);
                FirestoreCallCredentials firestoreCallCredentials = (FirestoreCallCredentials) blockRunner.IconCompatParcelizer;
                CallOptions$Builder callOptions$BuilderRemoteActionCompatParcelizer = mergeJsonObjectslambda10.RemoteActionCompatParcelizer(mergejsonobjectslambda10IconCompatParcelizer);
                callOptions$BuilderRemoteActionCompatParcelizer.read = firestoreCallCredentials;
                mergeJsonObjectslambda10 mergejsonobjectslambda10 = new mergeJsonObjectslambda10(callOptions$BuilderRemoteActionCompatParcelizer);
                getShowLayoutBounds getshowlayoutbounds = gettextinputservice.RemoteActionCompatParcelizer;
                CallOptions$Builder callOptions$BuilderRemoteActionCompatParcelizer2 = mergeJsonObjectslambda10.RemoteActionCompatParcelizer(mergejsonobjectslambda10);
                callOptions$BuilderRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer = getshowlayoutbounds;
                blockRunner.RatingCompat = new mergeJsonObjectslambda10(callOptions$BuilderRemoteActionCompatParcelizer2);
                onEndApplyChanges.read("GrpcCallProvider", "Channel successfully reset.", new Object[0]);
                return wouldpushpermissionpromptdisplaylambda2;
            case 4:
                ((Runnable) obj).run();
                return null;
            case 5:
                onSemanticsChange onsemanticschange = (onSemanticsChange) obj;
                synchronized (onsemanticschange) {
                    setEnableExtraAssertions setenableextraassertions = (setEnableExtraAssertions) onsemanticschange.write.write();
                    ArrayList arrayList = setenableextraassertions.read();
                    synchronized (setenableextraassertions) {
                        setenableextraassertions.read.serializer(new f2$$ExternalSyntheticLambda4(23, setenableextraassertions));
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        voteFrameRate voteframerate = (voteFrameRate) arrayList.get(i3);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", voteframerate.read);
                        jSONObject.put("dates", new JSONArray((Collection) voteframerate.write));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put("version", "2");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        try {
                            gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.ENCODING));
                            gZIPOutputStream.close();
                            base64OutputStream.close();
                            string = byteArrayOutputStream.toString(Constants.ENCODING);
                        } catch (Throwable th) {
                            try {
                                gZIPOutputStream.close();
                                break;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            base64OutputStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                return string;
            case 6:
                ((ParentDataModifierDefaultImpls) obj).IconCompatParcelizer((Object) null);
                return null;
            default:
                FirebaseRemoteConfig firebaseRemoteConfig = (FirebaseRemoteConfig) obj;
                firebaseRemoteConfig.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                firebaseRemoteConfig.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
                firebaseRemoteConfig.serializer.RemoteActionCompatParcelizer();
                AndroidComposeViewCompanion androidComposeViewCompanion = firebaseRemoteConfig.MediaSessionCompatQueueItem;
                synchronized (androidComposeViewCompanion.RemoteActionCompatParcelizer) {
                    androidComposeViewCompanion.read.edit().clear().commit();
                    break;
                }
                return null;
        }
    }
}
