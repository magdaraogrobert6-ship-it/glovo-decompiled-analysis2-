package io.sentry.logger;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import io.sentry.CombinedScopeView;
import io.sentry.SentryAttributes;
import io.sentry.SentryOptions;
import io.sentry.protocol.addObserverForBackInvoker;
import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
import io.sentry.util.PlaybackStateCompatCustomAction;
import io.socket.parser.IOParser$Decoder;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionUtils;
import o._get_messageWebView_lambda0;
import o.createBannerWebViewClientListenerandroid_sdk_ui_release;
import o.dismissSubscriberlambda0;
import o.fireOnDismissCallbacklambda0;
import o.getBrazeActionVersionAndJsonlambda0;
import o.logClicklambda0;
import o.performDismissTeardownlambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY;
import o.r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k;
import o.r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer implements RemoteActionCompatParcelizer {
    public final Object scopes;

    @Override // io.sentry.logger.RemoteActionCompatParcelizer
    public void IconCompatParcelizer(logClicklambda0 logclicklambda0, IOParser$Decoder iOParser$Decoder, String str, Object... objArr) {
        String str2;
        dismissSubscriberlambda0 dismisssubscriberlambda0 = (dismissSubscriberlambda0) this.scopes;
        SentryOptions sentryOptionsRemoteActionCompatParcelizer = dismisssubscriberlambda0.RemoteActionCompatParcelizer();
        BrazeActionUtils brazeActionUtils = dismisssubscriberlambda0.serializer;
        try {
            if (!dismisssubscriberlambda0.MediaBrowserCompatMediaItem()) {
                sentryOptionsRemoteActionCompatParcelizer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (!sentryOptionsRemoteActionCompatParcelizer.getLogs().write) {
                sentryOptionsRemoteActionCompatParcelizer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Sentry Log is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (str == null) {
                return;
            }
            createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_releaseRemoteActionCompatParcelizer = sentryOptionsRemoteActionCompatParcelizer.getDateProvider().RemoteActionCompatParcelizer();
            if (objArr.length == 0) {
                str2 = str;
            } else {
                try {
                    str2 = String.format(str, objArr);
                } catch (Throwable th) {
                    dismisssubscriberlambda0.RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error while running log through String.format", th);
                    str2 = str;
                }
            }
            _get_messageWebView_lambda0 _get_messagewebview_lambda0ComponentActivity = brazeActionUtils.ComponentActivity();
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = brazeActionUtils.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            if (r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                brazeActionUtils.serializer(new JankStatsFrameTracker$$ExternalSyntheticLambda3(brazeActionUtils, 23, sentryOptionsRemoteActionCompatParcelizer));
            }
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null ? (r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) _get_messagewebview_lambda0ComponentActivity.write : r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer().PlaybackStateCompat;
            r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k = r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null ? (r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) _get_messagewebview_lambda0ComponentActivity.RemoteActionCompatParcelizer : r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer().ParcelableVolumeInfo;
            r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY r8lambdawgrr1ctqcsomiguyjgvk752ezy = new r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, createbannerwebviewclientlistenerandroid_sdk_ui_releaseRemoteActionCompatParcelizer, str2, logclicklambda0);
            r8lambdawgrr1ctqcsomiguyjgvk752ezy.serializer(r8lambdayq9qbmke5in5qopvpj_kuggks_k);
            r8lambdawgrr1ctqcsomiguyjgvk752ezy.IconCompatParcelizer(write(iOParser$Decoder, str, objArr));
            r8lambdawgrr1ctqcsomiguyjgvk752ezy.RemoteActionCompatParcelizer(Integer.valueOf(logclicklambda0.getSeverityNumber()));
            brazeActionUtils.MediaSessionCompatQueueItem().write(r8lambdawgrr1ctqcsomiguyjgvk752ezy, brazeActionUtils);
        } catch (Throwable th2) {
            sentryOptionsRemoteActionCompatParcelizer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error while capturing log event", th2);
        }
    }

    public HashMap write(IOParser$Decoder iOParser$Decoder, String str, Object... objArr) {
        String strWrite;
        performDismissTeardownlambda1 performdismissteardownlambda1;
        performDismissTeardownlambda1 performdismissteardownlambda1Serializer;
        dismissSubscriberlambda0 dismisssubscriberlambda0 = (dismissSubscriberlambda0) this.scopes;
        CombinedScopeView combinedScopeView = dismisssubscriberlambda0.serializer;
        HashMap map = new HashMap();
        String strMediaSessionCompatToken = iOParser$Decoder.MediaSessionCompatToken();
        if (!"manual".equalsIgnoreCase(strMediaSessionCompatToken)) {
            map.put("sentry.origin", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performDismissTeardownlambda1.STRING, strMediaSessionCompatToken));
        }
        SentryAttributes sentryAttributesMediaBrowserCompatMediaItem = iOParser$Decoder.MediaBrowserCompatMediaItem();
        if (sentryAttributesMediaBrowserCompatMediaItem != null) {
            for (fireOnDismissCallbacklambda0 fireondismisscallbacklambda0 : ((ConcurrentHashMap) sentryAttributesMediaBrowserCompatMediaItem.RemoteActionCompatParcelizer()).values()) {
                Object obj = fireondismisscallbacklambda0.read();
                if (fireondismisscallbacklambda0.serializer() != null) {
                    performdismissteardownlambda1Serializer = fireondismisscallbacklambda0.serializer();
                } else if (obj instanceof Boolean) {
                    performdismissteardownlambda1Serializer = performDismissTeardownlambda1.BOOLEAN;
                } else if (obj instanceof Integer) {
                    performdismissteardownlambda1Serializer = performDismissTeardownlambda1.INTEGER;
                } else {
                    performdismissteardownlambda1Serializer = obj instanceof Number ? performDismissTeardownlambda1.DOUBLE : performDismissTeardownlambda1.STRING;
                }
                map.put("timber.tag", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performdismissteardownlambda1Serializer, obj));
            }
        }
        int i = 0;
        for (Object obj2 : objArr) {
            if (obj2 instanceof Boolean) {
                performdismissteardownlambda1 = performDismissTeardownlambda1.BOOLEAN;
            } else if (obj2 instanceof Integer) {
                performdismissteardownlambda1 = performDismissTeardownlambda1.INTEGER;
            } else {
                performdismissteardownlambda1 = obj2 instanceof Number ? performDismissTeardownlambda1.DOUBLE : performDismissTeardownlambda1.STRING;
            }
            map.put(c8$$ExternalSyntheticOutline0.m(i, "sentry.message.parameter."), new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performdismissteardownlambda1, obj2));
            i++;
        }
        if (i > 0 && map.get("sentry.message.template") == null) {
            map.put("sentry.message.template", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performDismissTeardownlambda1.STRING, str));
        }
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 sdkVersion = dismisssubscriberlambda0.RemoteActionCompatParcelizer().getSdkVersion();
        if (sdkVersion != null) {
            performDismissTeardownlambda1 performdismissteardownlambda2 = performDismissTeardownlambda1.STRING;
            map.put("sentry.sdk.name", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performdismissteardownlambda2, sdkVersion.RemoteActionCompatParcelizer));
            map.put("sentry.sdk.version", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performdismissteardownlambda2, sdkVersion.IconCompatParcelizer));
        }
        String environment = dismisssubscriberlambda0.RemoteActionCompatParcelizer().getEnvironment();
        if (environment != null) {
            map.put("sentry.environment", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performDismissTeardownlambda1.STRING, environment));
        }
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys = combinedScopeView.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.equals(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys)) {
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgMediaMetadataCompat = dismisssubscriberlambda0.RemoteActionCompatParcelizer().getReplayController().MediaMetadataCompat();
            if (!r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.equals(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgMediaMetadataCompat)) {
                map.put("sentry.replay_id", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performDismissTeardownlambda1.STRING, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgMediaMetadataCompat.toString()));
                map.put("sentry._internal.replay_is_buffering", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performDismissTeardownlambda1.BOOLEAN, Boolean.TRUE));
            }
        } else {
            map.put("sentry.replay_id", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performDismissTeardownlambda1.STRING, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys.toString()));
        }
        String release = dismisssubscriberlambda0.RemoteActionCompatParcelizer().getRelease();
        if (release != null) {
            map.put("sentry.release", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performDismissTeardownlambda1.STRING, release));
        }
        if (!PlaybackStateCompatCustomAction.serializer) {
            SentryOptions sentryOptionsRemoteActionCompatParcelizer = dismisssubscriberlambda0.RemoteActionCompatParcelizer();
            String serverName = sentryOptionsRemoteActionCompatParcelizer.getServerName();
            if (serverName != null) {
                map.put("server.address", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performDismissTeardownlambda1.STRING, serverName));
            } else if (sentryOptionsRemoteActionCompatParcelizer.isAttachServerName() && (strWrite = getBrazeActionVersionAndJsonlambda0.serializer().write()) != null) {
                map.put("server.address", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performDismissTeardownlambda1.STRING, strWrite));
            }
        }
        if (dismisssubscriberlambda0.RemoteActionCompatParcelizer().isSendDefaultPii()) {
            addObserverForBackInvoker addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = combinedScopeView.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            if (addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 == null) {
                String distinctId = dismisssubscriberlambda0.RemoteActionCompatParcelizer().getDistinctId();
                if (distinctId != null) {
                    map.put("user.id", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performDismissTeardownlambda1.STRING, distinctId));
                    return map;
                }
            } else {
                String str2 = addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read;
                if (str2 != null) {
                    map.put("user.id", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performDismissTeardownlambda1.STRING, str2));
                }
                String str3 = addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.MediaSessionCompatQueueItem;
                if (str3 != null) {
                    map.put("user.name", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performDismissTeardownlambda1.STRING, str3));
                }
                String str4 = addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer;
                if (str4 != null) {
                    map.put("user.email", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performDismissTeardownlambda1.STRING, str4));
                }
            }
        }
        return map;
    }

    public serializer(int i) {
        if (i != 2) {
            this.scopes = new ConcurrentHashMap(16);
        } else {
            this.scopes = new LinkedHashSet();
        }
    }

    public serializer(dismissSubscriberlambda0 dismisssubscriberlambda0) {
        this.scopes = dismisssubscriberlambda0;
    }
}
