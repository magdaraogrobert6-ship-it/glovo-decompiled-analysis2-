package io.sentry.hints;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.emoji2.text.EmojiProcessor;
import com.braze.models.Banner;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gtm.zziu;
import com.google.firebase.components.ComponentRegistrar;
import fwfd.com.fwfsdk.util.FWFHelper;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.AndroidPointerIconType;
import o.LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2;
import o.MutableVectorWithMutationTracking;
import o.NestedScrollNodeonPreFling1;
import o.accessfindNearestAttachedAncestor;
import o.accessgetDarkencp;
import o.accessgetExtendedTouchPaddingNHjbRcjd;
import o.accesswithTimeoutOrNulljd;
import o.applyDisplayCutoutMarginsToContentArealambda0;
import o.awaitPointerEventdefault;
import o.getAdapters;
import o.getDragWNlRxjI;
import o.getF5EK5gGoQ;
import o.getF7EK5gGoQ;
import o.getFiveEK5gGoQ;
import o.getFlingWNlRxjI;
import o.getFourEK5gGoQ;
import o.getHasMeasureResult;
import o.getRelocateWNlRxjI;
import o.getTouchSlop;
import o.getValueOverride;
import o.isPlacedUnderMotionFrameOfReference;
import o.premeasure0kLqBqw;
import o.r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M;
import o.setDetachedFromParentLookaheadPassui;
import o.setNativeShader;
import o.speculativeHit;
import o.updateDispatcherFields;
import okio.Options;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackStateCompatCustomAction implements Arrangement.Horizontal, accessgetDarkencp, LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2, getTouchSlop, setDetachedFromParentLookaheadPassui, getValueOverride, isPlacedUnderMotionFrameOfReference {
    public final /* synthetic */ int ResultReceiver;
    public static final /* synthetic */ PlaybackStateCompatCustomAction serializer = new PlaybackStateCompatCustomAction(10);
    public static final /* synthetic */ PlaybackStateCompatCustomAction read = new PlaybackStateCompatCustomAction(11);
    public static final /* synthetic */ PlaybackStateCompatCustomAction MediaMetadataCompat = new PlaybackStateCompatCustomAction(12);
    public static final /* synthetic */ PlaybackStateCompatCustomAction MediaBrowserCompatMediaItem = new PlaybackStateCompatCustomAction(13);
    public static final /* synthetic */ PlaybackStateCompatCustomAction ParcelableVolumeInfo = new PlaybackStateCompatCustomAction(14);
    public static final /* synthetic */ PlaybackStateCompatCustomAction MediaSessionCompatResultReceiverWrapper = new PlaybackStateCompatCustomAction(15);
    public static final /* synthetic */ PlaybackStateCompatCustomAction PlaybackStateCompat = new PlaybackStateCompatCustomAction(16);
    public static final /* synthetic */ PlaybackStateCompatCustomAction MediaSessionCompatToken = new PlaybackStateCompatCustomAction(17);
    public static final /* synthetic */ PlaybackStateCompatCustomAction PlaybackStateCompatCustomAction = new PlaybackStateCompatCustomAction(18);
    public static final /* synthetic */ PlaybackStateCompatCustomAction r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new PlaybackStateCompatCustomAction(19);
    public static final /* synthetic */ PlaybackStateCompatCustomAction IconCompatParcelizer = new PlaybackStateCompatCustomAction(20);
    public static final /* synthetic */ PlaybackStateCompatCustomAction write = new PlaybackStateCompatCustomAction(21);
    public static final /* synthetic */ PlaybackStateCompatCustomAction MediaSessionCompatQueueItem = new PlaybackStateCompatCustomAction(22);
    public static final /* synthetic */ PlaybackStateCompatCustomAction MediaDescriptionCompat = new PlaybackStateCompatCustomAction(23);
    public static final /* synthetic */ PlaybackStateCompatCustomAction RatingCompat = new PlaybackStateCompatCustomAction(24);

    @Override // o.accessgetDarkencp
    public void IconCompatParcelizer(int i, Object obj) {
    }

    public /* synthetic */ PlaybackStateCompatCustomAction(int i) {
        this.ResultReceiver = i;
    }

    @Override // o.setDetachedFromParentLookaheadPassui
    public Object IconCompatParcelizer(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }

    @Override // o.isPlacedUnderMotionFrameOfReference
    public List IconCompatParcelizer(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (getHasMeasureResult gethasmeasureresult : componentRegistrar.getComponents()) {
            String str = gethasmeasureresult.RemoteActionCompatParcelizer;
            if (str != null) {
                gethasmeasureresult = new getHasMeasureResult(str, gethasmeasureresult.serializer, gethasmeasureresult.read, gethasmeasureresult.write, gethasmeasureresult.MediaMetadataCompat, new JankStatsFrameTracker$$ExternalSyntheticLambda3(str, 13, gethasmeasureresult), gethasmeasureresult.RatingCompat);
            }
            arrayList.add(gethasmeasureresult);
        }
        return arrayList;
    }

    @Override // o.getValueOverride
    public getAdapters read(speculativeHit speculativehit, JSONObject jSONObject) throws JSONException {
        r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M r8lambdawhxkhouvhbvdcjbbonyn9egki6m;
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", DateTimeConstants.SECONDS_PER_HOUR);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            r8lambdawhxkhouvhbvdcjbbonyn9egki6m = new r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            r8lambdawhxkhouvhbvdcjbbonyn9egki6m = new r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M r8lambdawhxkhouvhbvdcjbbonyn9egki6m2 = r8lambdawhxkhouvhbvdcjbbonyn9egki6m;
        JSONObject jSONObject2 = jSONObject.getJSONObject(FWFHelper.ENDPOINT_FEATURES);
        MutableVectorWithMutationTracking mutableVectorWithMutationTracking = new MutableVectorWithMutationTracking(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has(Banner.EXPIRATION)) {
            jCurrentTimeMillis = jSONObject.optLong(Banner.EXPIRATION);
        } else {
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new getAdapters(jCurrentTimeMillis, r8lambdawhxkhouvhbvdcjbbonyn9egki6m2, mutableVectorWithMutationTracking, dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
    public void RemoteActionCompatParcelizer(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.Ltr) {
            Arrangement.serializer(iArr, iArr2, false);
        } else {
            Arrangement.RemoteActionCompatParcelizer(i, iArr, iArr2, true);
        }
    }

    public String toString() {
        return this.ResultReceiver != 1 ? super.toString() : "Arrangement#Start";
    }

    public getF5EK5gGoQ RemoteActionCompatParcelizer(byte[] bArr) throws zziu {
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0;
        if (bArr == null) {
            throw new zziu("Cannot parse a null byte[]");
        }
        if (bArr.length == 0) {
            throw new zziu("Cannot parse a 0 length byte[]");
        }
        try {
            Object obj = new JSONObject(new String(bArr)).get("resource");
            if (!(obj instanceof JSONObject)) {
                throw new zziu("Resource map not found");
            }
            JSONObject jSONObject = (JSONObject) obj;
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            String strOptString = jSONObject.optString("version");
            JSONArray jSONArray = jSONObject.getJSONArray("macros");
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList2.add(jSONArray.getJSONObject(i).getString("instance_name"));
            }
            ArrayList arrayListRemoteActionCompatParcelizer = setNativeShader.RemoteActionCompatParcelizer(jSONObject.getJSONArray("tags"), arrayList2);
            ArrayList arrayListRemoteActionCompatParcelizer2 = setNativeShader.RemoteActionCompatParcelizer(jSONObject.getJSONArray("predicates"), arrayList2);
            for (getFourEK5gGoQ getfourek5ggoq : setNativeShader.RemoteActionCompatParcelizer(jSONObject.getJSONArray("macros"), arrayList2)) {
                map.put(((getFiveEK5gGoQ) getfourek5ggoq.serializer.get("instance_name")).toString(), getfourek5ggoq);
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("rules");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList.add(setNativeShader.serializer(jSONArray2.getJSONArray(i2), arrayListRemoteActionCompatParcelizer, arrayListRemoteActionCompatParcelizer2));
            }
            EmojiProcessor emojiProcessor = new EmojiProcessor(arrayList, map, strOptString);
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            if (bArr == null) {
                throw new zziu("Cannot parse a null byte[]");
            }
            if (bArr.length == 0) {
                throw new zziu("Cannot parse a 0 length byte[]");
            }
            try {
                JSONObject jSONObject2 = new JSONObject(new String(bArr));
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("runtime");
                if (jSONArrayOptJSONArray == null) {
                    applydisplaycutoutmarginstocontentarealambda0 = null;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Object obj2 = jSONObject2.get("resource");
                    if (!(obj2 instanceof JSONObject)) {
                        throw new zziu("Resource map not found");
                    }
                    ((JSONObject) obj2).optString("version");
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                        Object obj3 = jSONArrayOptJSONArray.get(i3);
                        if (!(obj3 instanceof JSONArray) || ((JSONArray) obj3).length() != 0) {
                            arrayList3.add(setNativeShader.read(obj3));
                        }
                    }
                    applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0(arrayList3);
                }
                if (applydisplaycutoutmarginstocontentarealambda0 != null) {
                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                }
                Status status = Status.IconCompatParcelizer;
                return new getF5EK5gGoQ(status, 0, new getF7EK5gGoQ(null, null, emojiProcessor, 0L), new getF5EK5gGoQ(status, 0, null, applydisplaycutoutmarginstocontentarealambda0).write);
            } catch (zziu unused) {
                throw new zziu("The resource data is invalid. The runtime  configuration cannot be extracted from the JSON data");
            } catch (JSONException unused2) {
                throw new zziu("The resource data is corrupted. The runtime configuration cannot be extracted from the JSON data");
            }
        } catch (zziu unused3) {
            throw new zziu("The resource data is invalid. The container cannot be extracted from the JSON data");
        } catch (JSONException unused4) {
            throw new zziu("The resource data is corrupted. The container cannot be extracted from the JSON data");
        }
    }

    @Override // o.LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2
    public Object serializer() {
        switch (this.ResultReceiver) {
            case 10:
                return new Boolean(((Boolean) accessfindNearestAttachedAncestor.IconCompatParcelizer.read()).booleanValue());
            case 11:
                List list = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                return Boolean.valueOf(accesswithTimeoutOrNulljd.read());
            case 12:
                List list2 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.getLifecycle.read()).longValue());
            case 13:
                List list3 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l = (Long) NestedScrollNodeonPreFling1.MediaMetadataCompat.read();
                l.getClass();
                return l;
            case 14:
                List list4 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l2 = (Long) NestedScrollNodeonPreFling1.MediaSessionCompatQueueItem.read();
                l2.getClass();
                return l2;
            case 15:
                List list5 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l3 = (Long) NestedScrollNodeonPreFling1.onBackPressed.read();
                l3.getClass();
                return l3;
            case 16:
                List list6 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l4 = (Long) NestedScrollNodeonPreFling1.getFullyDrawnReporter.read();
                l4.getClass();
                return l4;
            case 17:
                List list7 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                getRelocateWNlRxjI.read.B_();
                Long l5 = (Long) getFlingWNlRxjI.read.read();
                l5.getClass();
                return l5;
            case 18:
                List list8 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l6 = (Long) NestedScrollNodeonPreFling1.accessensureViewModelStore.read();
                l6.getClass();
                return l6;
            case 19:
                List list9 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l7 = (Long) NestedScrollNodeonPreFling1.addOnUserLeaveHintListener.read();
                l7.getClass();
                return l7;
            case 20:
                List list10 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read()).longValue());
            case 21:
                List list11 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.defaultViewModelProviderFactory_delegatelambda0.read()).longValue());
            case 22:
                List list12 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                return Boolean.valueOf(awaitPointerEventdefault.IconCompatParcelizer());
            case 23:
                List list13 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                accessgetExtendedTouchPaddingNHjbRcjd.write.B_();
                Boolean bool = (Boolean) AndroidPointerIconType.serializer.read();
                bool.getClass();
                return bool;
            default:
                return new Boolean(((Boolean) getDragWNlRxjI.read.read()).booleanValue());
        }
    }
}
