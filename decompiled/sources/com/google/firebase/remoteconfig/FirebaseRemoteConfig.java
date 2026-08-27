package com.google.firebase.remoteconfig;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda3;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import coil3.ImageLoader$Builder;
import com.google.android.gms.tasks.Task;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import com.logistics.rider.glovo.R;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.LazyKt__LazyJVMKt;
import o.AndroidComposeViewCompanion;
import o.LookaheadCapablePlaceablelayout1;
import o.r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U;
import o.r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs;
import o.r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M;
import o.setCoroutineContext;
import o.setFrameEndSchedulerui;
import o.setOnReadyForComposition;
import o.setPrimaryDirectionalMotionAxisOverrider2epLt8ui;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseRemoteConfig {
    public final Executor IconCompatParcelizer;
    public final setOnReadyForComposition MediaBrowserCompatMediaItem;
    public final r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U MediaDescriptionCompat;
    public final FirebaseABTesting MediaMetadataCompat;
    public final AndroidComposeViewCompanion MediaSessionCompatQueueItem;
    public final ImageLoader$Builder PlaybackStateCompat;
    public final ConfigFetchHandler RatingCompat;
    public final setOnReadyForComposition RemoteActionCompatParcelizer;
    public final Context read;
    public final setOnReadyForComposition serializer;
    public final ProtobufEncoder write;

    public static ArrayList serializer(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M RemoteActionCompatParcelizer() {
        r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M r8lambdawhxkhouvhbvdcjbbonyn9egki6m;
        AndroidComposeViewCompanion androidComposeViewCompanion = this.MediaSessionCompatQueueItem;
        synchronized (androidComposeViewCompanion.RemoteActionCompatParcelizer) {
            androidComposeViewCompanion.read.getLong("last_fetch_time_in_millis", -1L);
            int i = androidComposeViewCompanion.read.getInt("last_fetch_status", 0);
            long j = androidComposeViewCompanion.read.getLong("fetch_timeout_in_seconds", 60L);
            if (j < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
            }
            long j2 = androidComposeViewCompanion.read.getLong("minimum_fetch_interval_in_seconds", 43200L);
            if (j2 < 0) {
                throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
            }
            r8lambdawhxkhouvhbvdcjbbonyn9egki6m = new r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M(i);
        }
        return r8lambdawhxkhouvhbvdcjbbonyn9egki6m;
    }

    public final HashMap read() {
        r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs r8lambdarbjtxi0wczogl0tkad7_ud07lzs;
        HashSet<String> hashSet = new HashSet();
        r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U r8lambdaevlm9gvgkdldswyuoh9jhyuv2u = this.MediaDescriptionCompat;
        setOnReadyForComposition setonreadyforcomposition = r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.serializer;
        hashSet.addAll(r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.IconCompatParcelizer(setonreadyforcomposition));
        setOnReadyForComposition setonreadyforcomposition2 = r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.IconCompatParcelizer;
        hashSet.addAll(r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.IconCompatParcelizer(setonreadyforcomposition2));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            String str2 = r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.read(setonreadyforcomposition, str);
            if (str2 != null) {
                r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.write(setonreadyforcomposition.serializer(), str);
                r8lambdarbjtxi0wczogl0tkad7_ud07lzs = new r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs(str2, 2);
            } else {
                String str3 = r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.read(setonreadyforcomposition2, str);
                if (str3 != null) {
                    r8lambdarbjtxi0wczogl0tkad7_ud07lzs = new r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs(str3, 1);
                } else {
                    r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.read(str, "FirebaseRemoteConfigValue");
                    r8lambdarbjtxi0wczogl0tkad7_ud07lzs = new r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs("", 0);
                }
            }
            map.put(str, r8lambdarbjtxi0wczogl0tkad7_ud07lzs);
        }
        return map;
    }

    public final boolean read(String str) {
        Pattern pattern = r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.RemoteActionCompatParcelizer;
        Pattern pattern2 = r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.write;
        r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U r8lambdaevlm9gvgkdldswyuoh9jhyuv2u = this.MediaDescriptionCompat;
        setOnReadyForComposition setonreadyforcomposition = r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.serializer;
        String str2 = r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.read(setonreadyforcomposition, str);
        if (str2 != null) {
            if (pattern2.matcher(str2).matches()) {
                r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.write(setonreadyforcomposition.serializer(), str);
                return true;
            }
            if (pattern.matcher(str2).matches()) {
                r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.write(setonreadyforcomposition.serializer(), str);
                return false;
            }
        }
        String str3 = r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.read(r8lambdaevlm9gvgkdldswyuoh9jhyuv2u.IconCompatParcelizer, str);
        if (str3 != null) {
            if (pattern2.matcher(str3).matches()) {
                return true;
            }
            if (pattern.matcher(str3).matches()) {
                return false;
            }
        }
        r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.read(str, "Boolean");
        return false;
    }

    public final Task serializer() {
        ConfigFetchHandler configFetchHandler = this.RatingCompat;
        long j = configFetchHandler.MediaDescriptionCompat.read.getLong("minimum_fetch_interval_in_seconds", 43200L);
        HashMap map = new HashMap(configFetchHandler.RemoteActionCompatParcelizer);
        map.put("X-Firebase-RC-Fetch-Type", setFrameEndSchedulerui.BASE.getValue() + "/1");
        return configFetchHandler.read.read().continueWithTask(configFetchHandler.serializer, new Futures$$ExternalSyntheticLambda3(configFetchHandler, j, map, 3)).onSuccessTask(LookaheadCapablePlaceablelayout1.INSTANCE, new FieldType$$ExternalSyntheticBUOutline0(22)).onSuccessTask(this.IconCompatParcelizer, new FirebaseRemoteConfig$$ExternalSyntheticLambda0(this));
    }

    public final void serializer(boolean z) {
        HttpURLConnection httpURLConnection;
        ProtobufEncoder protobufEncoder = this.write;
        synchronized (protobufEncoder) {
            ConfigRealtimeHttpClient configRealtimeHttpClient = (ConfigRealtimeHttpClient) protobufEncoder.serializer;
            synchronized (configRealtimeHttpClient.read) {
                configRealtimeHttpClient.MediaSessionCompatToken = z;
                if (z && (httpURLConnection = configRealtimeHttpClient.MediaSessionCompatResultReceiverWrapper) != null) {
                    httpURLConnection.disconnect();
                }
            }
            if (!z) {
                protobufEncoder.serializer();
            }
        }
    }

    public final Task write() {
        Task task = this.MediaBrowserCompatMediaItem.read();
        Task task2 = this.RemoteActionCompatParcelizer.read();
        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(task, task2).continueWithTask(this.IconCompatParcelizer, new PreviewView$1$$ExternalSyntheticLambda2(this, task, task2, 19));
    }

    public FirebaseRemoteConfig(Context context, FirebaseABTesting firebaseABTesting, Executor executor, setOnReadyForComposition setonreadyforcomposition, setOnReadyForComposition setonreadyforcomposition2, setOnReadyForComposition setonreadyforcomposition3, ConfigFetchHandler configFetchHandler, r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U r8lambdaevlm9gvgkdldswyuoh9jhyuv2u, AndroidComposeViewCompanion androidComposeViewCompanion, ProtobufEncoder protobufEncoder, ImageLoader$Builder imageLoader$Builder) {
        this.read = context;
        this.MediaMetadataCompat = firebaseABTesting;
        this.IconCompatParcelizer = executor;
        this.MediaBrowserCompatMediaItem = setonreadyforcomposition;
        this.RemoteActionCompatParcelizer = setonreadyforcomposition2;
        this.serializer = setonreadyforcomposition3;
        this.RatingCompat = configFetchHandler;
        this.MediaDescriptionCompat = r8lambdaevlm9gvgkdldswyuoh9jhyuv2u;
        this.MediaSessionCompatQueueItem = androidComposeViewCompanion;
        this.write = protobufEncoder;
        this.PlaybackStateCompat = imageLoader$Builder;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007e A[Catch: IOException -> 0x0088, IOException | XmlPullParserException -> 0x008a, TryCatch #3 {IOException | XmlPullParserException -> 0x008a, blocks: (B:3:0x000a, B:5:0x0010, B:6:0x0017, B:11:0x002b, B:37:0x0083, B:14:0x0033, B:18:0x0043, B:19:0x0047, B:25:0x0055, B:36:0x007e, B:30:0x0064, B:32:0x006c, B:33:0x0071, B:35:0x0079), top: B:50:0x000a }] */
    public final void IconCompatParcelizer() {
        Context context = this.read;
        HashMap map = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                SentryLogcatAdapter.serializer("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
            } else {
                XmlResourceParser xml = resources.getXml(R.xml.remote_config);
                String name = null;
                String text = null;
                String text2 = null;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        name = xml.getName();
                    } else if (eventType == 3) {
                        if (xml.getName().equals("entry")) {
                            if (text == null || text2 == null) {
                                SentryLogcatAdapter.IconCompatParcelizer("FirebaseRemoteConfig", "An entry in the defaults XML has an invalid key and/or value tag.");
                            } else {
                                map.put(text, text2);
                            }
                            text = null;
                            text2 = null;
                        }
                        name = null;
                    } else if (eventType == 4 && name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != 106079) {
                            if (iHashCode == 111972721 && name.equals("value")) {
                                text2 = xml.getText();
                            } else {
                                SentryLogcatAdapter.IconCompatParcelizer("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                            }
                        } else if (name.equals("key")) {
                            text = xml.getText();
                        } else {
                            SentryLogcatAdapter.IconCompatParcelizer("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                        }
                    }
                }
            }
        } catch (IOException | XmlPullParserException e) {
            SentryLogcatAdapter.read("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
        }
        try {
            setCoroutineContext setcoroutinecontextRemoteActionCompatParcelizer = setPrimaryDirectionalMotionAxisOverrider2epLt8ui.RemoteActionCompatParcelizer();
            setcoroutinecontextRemoteActionCompatParcelizer.serializer = new JSONObject(map);
            this.serializer.IconCompatParcelizer(setcoroutinecontextRemoteActionCompatParcelizer.serializer()).onSuccessTask(LookaheadCapablePlaceablelayout1.INSTANCE, new Gson$$ExternalSyntheticBUOutline0(22));
        } catch (JSONException e2) {
            SentryLogcatAdapter.read("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e2);
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        }
    }
}
