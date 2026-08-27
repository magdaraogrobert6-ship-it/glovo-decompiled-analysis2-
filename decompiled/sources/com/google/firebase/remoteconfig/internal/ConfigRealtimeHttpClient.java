package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.fwf_cache.UtilKt;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import io.sentry.MovePreviousSession;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt;
import o.AndroidComposeViewCompanion;
import o.AndroidComposeViewExternalSyntheticLambda3;
import o.accessgetTvInputComposite1cp;
import o.accessgetTvInputVga1cp;
import o.accesssetInstancecp;
import o.isTreeConsistent;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.requestClearInvalidObservations;
import o.setOnReadyForComposition;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigRealtimeHttpClient {
    public final String ComponentActivity;
    public final setOnReadyForComposition IconCompatParcelizer;
    public final Context MediaBrowserCompatMediaItem;
    public final accesssetInstancecp MediaDescriptionCompat;
    public final ConfigFetchHandler MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public HttpURLConnection MediaSessionCompatResultReceiverWrapper;
    public final LinkedHashSet PlaybackStateCompatCustomAction;
    public final FirebaseApp RatingCompat;
    public final AndroidComposeViewCompanion r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final ScheduledExecutorService r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public static final int[] serializer = {2, 4, 8, 16, 32, 64, Fields.SpotShadowColor, Fields.RotationX};
    public static final Pattern RemoteActionCompatParcelizer = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public boolean ParcelableVolumeInfo = false;
    public final Random r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new Random();
    public final accessgetTvInputComposite1cp write = accessgetTvInputComposite1cp.read;
    public boolean PlaybackStateCompat = false;
    public boolean MediaSessionCompatToken = false;
    public final Object read = new Object();

    public static boolean RemoteActionCompatParcelizer(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public final void IconCompatParcelizer(long j) {
        synchronized (this) {
            if (RemoteActionCompatParcelizer()) {
                int i = this.MediaSessionCompatQueueItem;
                if (i > 0) {
                    this.MediaSessionCompatQueueItem = i - 1;
                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.schedule(new MovePreviousSession(11, this), j, TimeUnit.MILLISECONDS);
                } else if (!this.MediaSessionCompatToken) {
                    FirebaseRemoteConfigException.write writeVar = FirebaseRemoteConfigException.write.UNKNOWN;
                    IconCompatParcelizer(new FirebaseRemoteConfigClientException());
                }
            }
        }
    }

    public final void IconCompatParcelizer(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        synchronized (this) {
            Iterator it = this.PlaybackStateCompatCustomAction.iterator();
            while (it.hasNext()) {
                ((requestClearInvalidObservations) it.next()).serializer(firebaseRemoteConfigException);
            }
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        boolean z;
        synchronized (this) {
            z = (this.PlaybackStateCompatCustomAction.isEmpty() || this.ParcelableVolumeInfo || this.PlaybackStateCompat || this.MediaSessionCompatToken) ? false : true;
        }
        return z;
    }

    public final ConfigAutoFetch serializer(HttpURLConnection httpURLConnection) {
        ConfigAutoFetch configAutoFetch;
        synchronized (this) {
            configAutoFetch = new ConfigAutoFetch(httpURLConnection, this.MediaMetadataCompat, this.IconCompatParcelizer, this.PlaybackStateCompatCustomAction, new AndroidComposeViewExternalSyntheticLambda3(this), this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        }
        return configAutoFetch;
    }

    public final void write() {
        synchronized (this) {
            this.write.getClass();
            IconCompatParcelizer(Math.max(0L, ((Date) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer().RemoteActionCompatParcelizer).getTime() - new Date(System.currentTimeMillis()).getTime()));
        }
    }

    public static String IconCompatParcelizer(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final void IconCompatParcelizer(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        String strIconCompatParcelizer;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        FirebaseApp firebaseApp = this.RatingCompat;
        firebaseApp.IconCompatParcelizer();
        isTreeConsistent istreeconsistent = firebaseApp.PlaybackStateCompatCustomAction;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", istreeconsistent.write);
        Context context = this.MediaBrowserCompatMediaItem;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArr = BuildersKt.read(context, context.getPackageName());
            if (bArr == null) {
                SentryLogcatAdapter.serializer("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strIconCompatParcelizer = null;
            } else {
                strIconCompatParcelizer = accessgetTvInputVga1cp.IconCompatParcelizer(bArr);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strIconCompatParcelizer);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty(ConstantKt.CONTENT_TYPE_HEADER, ConstantKt.CONTENT_TYPE_JSON);
        httpURLConnection.setRequestProperty("Accept", ConstantKt.CONTENT_TYPE_JSON);
        HashMap map = new HashMap();
        firebaseApp.IconCompatParcelizer();
        Matcher matcher = RemoteActionCompatParcelizer.matcher(istreeconsistent.IconCompatParcelizer);
        map.put(UtilKt.PROJECT_KEY, matcher.matches() ? matcher.group(1) : null);
        map.put("namespace", this.ComponentActivity);
        map.put("lastKnownVersionNumber", Long.toString(this.MediaMetadataCompat.MediaDescriptionCompat.read.getLong("last_template_version", 0L)));
        firebaseApp.IconCompatParcelizer();
        map.put("appId", istreeconsistent.IconCompatParcelizer);
        map.put("sdkVersion", "23.0.1");
        map.put("appInstanceId", str);
        byte[] bytes = new JSONObject(map).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final void RemoteActionCompatParcelizer(Date date) {
        AndroidComposeViewCompanion androidComposeViewCompanion = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i = androidComposeViewCompanion.serializer().IconCompatParcelizer + 1;
        long millis = TimeUnit.MINUTES.toMillis(serializer[(i < 8 ? i : 8) - 1]);
        androidComposeViewCompanion.write(i, new Date(date.getTime() + (millis / 2) + ((long) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.nextInt((int) millis))));
    }

    public final String serializer(String str) {
        FirebaseApp firebaseApp = this.RatingCompat;
        firebaseApp.IconCompatParcelizer();
        Matcher matcher = RemoteActionCompatParcelizer.matcher(firebaseApp.PlaybackStateCompatCustomAction.IconCompatParcelizer);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, accesssetInstancecp accesssetinstancecp, ConfigFetchHandler configFetchHandler, setOnReadyForComposition setonreadyforcomposition, Context context, String str, LinkedHashSet linkedHashSet, AndroidComposeViewCompanion androidComposeViewCompanion, ScheduledExecutorService scheduledExecutorService) {
        this.PlaybackStateCompatCustomAction = linkedHashSet;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = scheduledExecutorService;
        this.MediaSessionCompatQueueItem = Math.max(8 - androidComposeViewCompanion.serializer().IconCompatParcelizer, 1);
        this.RatingCompat = firebaseApp;
        this.MediaMetadataCompat = configFetchHandler;
        this.MediaDescriptionCompat = accesssetinstancecp;
        this.IconCompatParcelizer = setonreadyforcomposition;
        this.MediaBrowserCompatMediaItem = context;
        this.ComponentActivity = str;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = androidComposeViewCompanion;
    }

    public final void serializer(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.MediaSessionCompatResultReceiverWrapper;
        if (httpURLConnection != null && !this.MediaSessionCompatToken) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused2) {
            }
        }
    }
}
