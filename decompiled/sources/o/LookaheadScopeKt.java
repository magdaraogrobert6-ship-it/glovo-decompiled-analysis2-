package o;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import coil3.ImageLoader$Builder;
import com.google.android.gms.measurement.internal.zzgs;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadScopeKt extends Measurable {
    public static final Pair read = new Pair("", 0L);
    public final r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI ComponentActivity;
    public localLookaheadPositionOfauaQtc IconCompatParcelizer;
    public final ImageLoader$Builder MediaBrowserCompatMediaItem;
    public final setScopeCoordinates MediaDescriptionCompat;
    public final r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI MediaMetadataCompat;
    public final LookaheadScopeImpl MediaSessionCompatQueueItem;
    public final setScopeCoordinates MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public final LookaheadScopeImpl ParcelableVolumeInfo;
    public final LookaheadScopeImpl PlaybackStateCompat;
    public final setScopeCoordinates PlaybackStateCompatCustomAction;
    public final setScopeCoordinates RatingCompat;
    public final r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI RemoteActionCompatParcelizer;
    public final LookaheadScopeImpl ResultReceiver;
    public final ImageLoader$Builder r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public SharedPreferences r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public SharedPreferences r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public String r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final LookaheadScopeImpl serializer;
    public final LookaheadScopeImpl write;

    @Override // o.Measurable
    public final boolean read() {
        return true;
    }

    public final SparseArray MediaSessionCompatQueueItem() {
        Bundle bundleSerializer = this.MediaBrowserCompatMediaItem.serializer();
        int[] intArray = bundleSerializer.getIntArray("uriSources");
        long[] longArray = bundleSerializer.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final boolean serializer(long j) {
        return j - this.serializer.RemoteActionCompatParcelizer() > this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
    }

    public final SharedPreferences MediaMetadataCompat() {
        MediaSessionCompatToken();
        ComponentActivity();
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == null) {
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            String strValueOf = String.valueOf(lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getPackageName());
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            zzgs zzgsVar = getlookaheaddelegate.PlaybackStateCompat;
            String strConcat = strValueOf.concat("_preferences");
            zzgsVar.serializer(strConcat, "Default prefs file");
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getSharedPreferences(strConcat, 0);
        }
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }

    public final getMeasuredWidth MediaSessionCompatResultReceiverWrapper() {
        MediaSessionCompatToken();
        return getMeasuredWidth.IconCompatParcelizer(serializer().getInt("consent_source", 100), serializer().getString("consent_settings", "G1"));
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        MediaSessionCompatToken();
        getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.PlaybackStateCompat.serializer(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = serializer().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    public final SharedPreferences serializer() {
        MediaSessionCompatToken();
        ComponentActivity();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    public final boolean serializer(updateViewport updateviewport) {
        MediaSessionCompatToken();
        String string = serializer().getString("stored_tcf_param", "");
        String strWrite = updateviewport.write();
        if (strWrite.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = serializer().edit();
        editorEdit.putString("stored_tcf_param", strWrite);
        editorEdit.apply();
        return true;
    }

    public LookaheadScopeKt(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
        this.serializer = new LookaheadScopeImpl(this, "session_timeout", 1800000L);
        this.RatingCompat = new setScopeCoordinates(this, "start_new_session", true);
        this.MediaSessionCompatQueueItem = new LookaheadScopeImpl(this, "last_pause_time", 0L);
        this.PlaybackStateCompat = new LookaheadScopeImpl(this, "session_id", 0L);
        this.MediaMetadataCompat = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(this, "non_personalized_ads");
        this.MediaBrowserCompatMediaItem = new ImageLoader$Builder(this, "last_received_uri_timestamps_by_source");
        this.MediaDescriptionCompat = new setScopeCoordinates(this, "allow_remote_dynamite", false);
        this.write = new LookaheadScopeImpl(this, "first_open_time", 0L);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer("app_install_time");
        this.RemoteActionCompatParcelizer = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(this, "app_instance_id");
        this.MediaSessionCompatResultReceiverWrapper = new setScopeCoordinates(this, "app_backgrounded", false);
        this.PlaybackStateCompatCustomAction = new setScopeCoordinates(this, "deep_link_retrieval_complete", false);
        this.ParcelableVolumeInfo = new LookaheadScopeImpl(this, "deep_link_retrieval_attempts", 0L);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(this, "firebase_feature_rollouts");
        this.ComponentActivity = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(this, "deferred_attribution_cache");
        this.ResultReceiver = new LookaheadScopeImpl(this, "deferred_attribution_cache_timestamp", 0L);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new ImageLoader$Builder(this, "default_event_parameters");
    }
}
