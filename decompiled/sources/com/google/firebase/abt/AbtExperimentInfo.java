package com.google.firebase.abt;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.logTreeprintSubTree;

/* JADX INFO: loaded from: classes2.dex */
public final class AbtExperimentInfo {
    public static final String[] read = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final SimpleDateFormat serializer = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final long MediaMetadataCompat;
    public final String RatingCompat;
    public final Date RemoteActionCompatParcelizer;
    public final long write;

    public final String IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    public static AbtExperimentInfo RemoteActionCompatParcelizer(Map map) throws AbtException {
        write(map);
        try {
            return new AbtExperimentInfo((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", serializer.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    public static void write(Map map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            String str = read[i];
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    public final HashMap RemoteActionCompatParcelizer() {
        HashMap map = new HashMap();
        map.put("experimentId", this.IconCompatParcelizer);
        map.put("variantId", this.MediaBrowserCompatMediaItem);
        map.put("triggerEvent", this.RatingCompat);
        map.put("experimentStartTime", serializer.format(this.RemoteActionCompatParcelizer));
        map.put("triggerTimeoutMillis", Long.toString(this.MediaMetadataCompat));
        map.put("timeToLiveMillis", Long.toString(this.write));
        return map;
    }

    public final logTreeprintSubTree serializer(String str) {
        logTreeprintSubTree logtreeprintsubtree = new logTreeprintSubTree(0);
        logtreeprintsubtree.MediaMetadataCompat = str;
        logtreeprintsubtree.IconCompatParcelizer = this.RemoteActionCompatParcelizer.getTime();
        logtreeprintsubtree.write = this.IconCompatParcelizer;
        logtreeprintsubtree.MediaSessionCompatToken = this.MediaBrowserCompatMediaItem;
        String str2 = this.RatingCompat;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        logtreeprintsubtree.MediaBrowserCompatMediaItem = str2;
        logtreeprintsubtree.PlaybackStateCompat = this.MediaMetadataCompat;
        logtreeprintsubtree.RatingCompat = this.write;
        return logtreeprintsubtree;
    }

    public AbtExperimentInfo(String str, String str2, String str3, Date date, long j, long j2) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompatMediaItem = str2;
        this.RatingCompat = str3;
        this.RemoteActionCompatParcelizer = date;
        this.MediaMetadataCompat = j;
        this.write = j2;
    }

    public static AbtExperimentInfo read(logTreeprintSubTree logtreeprintsubtree) {
        String str = logtreeprintsubtree.MediaBrowserCompatMediaItem;
        if (str == null) {
            str = "";
        }
        return new AbtExperimentInfo(logtreeprintsubtree.write, String.valueOf(logtreeprintsubtree.MediaSessionCompatToken), str, new Date(logtreeprintsubtree.IconCompatParcelizer), logtreeprintsubtree.PlaybackStateCompat, logtreeprintsubtree.RatingCompat);
    }
}
