package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.AndroidComposeViewCompanion;
import o.AndroidComposeViewExternalSyntheticLambda3;
import o.accessgetTvInputComposite1cp;
import o.requestClearInvalidObservations;
import o.setConfiguration;
import o.setOnReadyForComposition;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigAutoFetch {
    public final setOnReadyForComposition IconCompatParcelizer;
    public final AndroidComposeViewExternalSyntheticLambda3 MediaBrowserCompatMediaItem;
    public final ScheduledExecutorService MediaSessionCompatQueueItem;
    public final AndroidComposeViewCompanion RatingCompat;
    public final HttpURLConnection read;
    public final LinkedHashSet serializer;
    public final ConfigFetchHandler write;
    public final Random MediaMetadataCompat = new Random();
    public final accessgetTvInputComposite1cp RemoteActionCompatParcelizer = accessgetTvInputComposite1cp.read;

    public final void read(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        synchronized (this) {
            Iterator it = this.serializer.iterator();
            while (it.hasNext()) {
                ((requestClearInvalidObservations) it.next()).serializer(firebaseRemoteConfigException);
            }
        }
    }

    public final void serializer(int i) {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.getClass();
            Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (((long) i) * 1000));
            AndroidComposeViewCompanion androidComposeViewCompanion = this.RatingCompat;
            synchronized (androidComposeViewCompanion.MediaBrowserCompatMediaItem) {
                androidComposeViewCompanion.read.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
            }
        }
    }

    public ConfigAutoFetch(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, setOnReadyForComposition setonreadyforcomposition, LinkedHashSet linkedHashSet, AndroidComposeViewExternalSyntheticLambda3 androidComposeViewExternalSyntheticLambda3, ScheduledExecutorService scheduledExecutorService, AndroidComposeViewCompanion androidComposeViewCompanion) {
        this.read = httpURLConnection;
        this.write = configFetchHandler;
        this.IconCompatParcelizer = setonreadyforcomposition;
        this.serializer = linkedHashSet;
        this.MediaBrowserCompatMediaItem = androidComposeViewExternalSyntheticLambda3;
        this.MediaSessionCompatQueueItem = scheduledExecutorService;
        this.RatingCompat = androidComposeViewCompanion;
    }

    public final void read(int i, long j) {
        if (i == 0) {
            FirebaseRemoteConfigException.write writeVar = FirebaseRemoteConfigException.write.UNKNOWN;
            read(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template."));
            return;
        }
        this.MediaSessionCompatQueueItem.schedule(new setConfiguration(this, i, j), this.MediaMetadataCompat.nextInt(4), TimeUnit.SECONDS);
    }

    public final void RemoteActionCompatParcelizer() {
        HttpURLConnection httpURLConnection = this.read;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
                write(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException unused) {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException unused3) {
        }
    }

    public final void write(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strConcat = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strConcat = strConcat.concat(line);
            if (line.contains("}")) {
                int iIndexOf = strConcat.indexOf(123);
                int iLastIndexOf = strConcat.lastIndexOf(125);
                if (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) {
                    strConcat = "";
                } else {
                    strConcat = strConcat.substring(iIndexOf, iLastIndexOf + 1);
                }
                if (strConcat.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strConcat);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            AndroidComposeViewExternalSyntheticLambda3 androidComposeViewExternalSyntheticLambda3 = this.MediaBrowserCompatMediaItem;
                            FirebaseRemoteConfigException.write writeVar = FirebaseRemoteConfigException.write.UNKNOWN;
                            androidComposeViewExternalSyntheticLambda3.serializer(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes."));
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = this.serializer.isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j = this.write.MediaDescriptionCompat.read.getLong("last_template_version", 0L);
                            long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j2 > j) {
                                read(3, j2);
                            }
                        }
                        if (jSONObject.has("retryIntervalSeconds")) {
                            serializer(jSONObject.getInt("retryIntervalSeconds"));
                        }
                        strConcat = "";
                    } catch (JSONException e) {
                        Throwable cause = e.getCause();
                        FirebaseRemoteConfigException.write writeVar2 = FirebaseRemoteConfigException.write.UNKNOWN;
                        read(new FirebaseRemoteConfigClientException("Unable to parse config update message.", cause));
                        SentryLogcatAdapter.read("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                    }
                }
            }
        }
        bufferedReader.close();
    }
}
