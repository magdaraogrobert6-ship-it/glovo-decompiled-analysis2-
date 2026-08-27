package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.net.URI;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambda9ZY36wGhLruV8pSk7W6zmogPxg {
    public static final java.util.logging.Logger IconCompatParcelizer = java.util.logging.Logger.getLogger(r8lambda9ZY36wGhLruV8pSk7W6zmogPxg.class.getName());
    public static final ConcurrentHashMap RemoteActionCompatParcelizer = new ConcurrentHashMap();

    public static networkUnavailablelambda0 IconCompatParcelizer(String str, r8lambdaH4El2AuEYS7SZhBdBoHhFTah6iY r8lambdah4el2aueys7szhbdbohhftah6iy) {
        r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm;
        networkUnavailablelambda0 networkunavailablelambda0;
        String str2;
        URI uri = new URI(str);
        Pattern pattern = getContentCardsUpdatedSubscriber.serializer;
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.matches("^https?|wss?$")) {
            scheme = com.adjust.sdk.Constants.SCHEME;
        }
        int port = uri.getPort();
        if (port == -1) {
            if ("http".equals(scheme) || "ws".equals(scheme)) {
                port = 80;
            } else if (com.adjust.sdk.Constants.SCHEME.equals(scheme) || "wss".equals(scheme)) {
                port = 443;
            }
        }
        String rawPath = uri.getRawPath();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        String rawUserInfo = uri.getRawUserInfo();
        String rawQuery = uri.getRawQuery();
        String rawFragment = uri.getRawFragment();
        String host = uri.getHost();
        if (host == null) {
            String rawAuthority = uri.getRawAuthority();
            if (rawAuthority == null) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("unable to parse the host from the authority");
                return null;
            }
            Matcher matcher = getContentCardsUpdatedSubscriber.serializer.matcher(rawAuthority);
            if (!matcher.matches()) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("unable to parse the host from the authority");
                return null;
            }
            host = matcher.group(2);
        }
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(scheme, "://");
        sbM.append(rawUserInfo != null ? rawUserInfo.concat("@") : "");
        sbM.append(host);
        sbM.append(port != -1 ? c8$$ExternalSyntheticOutline0.m(port, ":") : "");
        sbM.append(rawPath);
        sbM.append(rawQuery != null ? "?".concat(rawQuery) : "");
        sbM.append(rawFragment != null ? "#".concat(rawFragment) : "");
        URI uriCreate = URI.create(sbM.toString());
        String str3 = scheme + "://" + host + ":" + port;
        ConcurrentHashMap concurrentHashMap = RemoteActionCompatParcelizer;
        boolean z = concurrentHashMap.containsKey(str3) && ((r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM) concurrentHashMap.get(str3)).MediaSessionCompatQueueItem.containsKey(uriCreate.getPath());
        String query = uriCreate.getQuery();
        if (query != null && ((str2 = r8lambdah4el2aueys7szhbdbohhftah6iy.RemoteActionCompatParcelizer) == null || str2.isEmpty())) {
            r8lambdah4el2aueys7szhbdbohhftah6iy.RemoteActionCompatParcelizer = query;
        }
        if (z) {
            java.util.logging.Logger logger = IconCompatParcelizer;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine("ignoring socket cache for " + uriCreate);
            }
            r8lambdach50szxgsvgzrle_f5bmf0a81gm = new r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM(uriCreate, r8lambdah4el2aueys7szhbdbohhftah6iy);
        } else {
            if (!concurrentHashMap.containsKey(str3)) {
                java.util.logging.Logger logger2 = IconCompatParcelizer;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine("new io instance for " + uriCreate);
                }
                concurrentHashMap.putIfAbsent(str3, new r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM(uriCreate, r8lambdah4el2aueys7szhbdbohhftah6iy));
            }
            r8lambdach50szxgsvgzrle_f5bmf0a81gm = (r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM) concurrentHashMap.get(str3);
        }
        String path = uriCreate.getPath();
        synchronized (r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaSessionCompatQueueItem) {
            networkunavailablelambda0 = (networkUnavailablelambda0) r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaSessionCompatQueueItem.get(path);
            if (networkunavailablelambda0 == null) {
                networkunavailablelambda0 = new networkUnavailablelambda0(r8lambdach50szxgsvgzrle_f5bmf0a81gm, path);
                r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaSessionCompatQueueItem.put(path, networkunavailablelambda0);
            }
        }
        return networkunavailablelambda0;
    }
}
