package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.LookaheadScopeKtLookaheadScope221;
import o.MultiContentMeasurePolicyKt;
import o.OnLayoutRectChangedNode;
import o.OnPlacedModifierKt;
import o.accessgetSystemNavigationDowncp;
import o.accesslayoutjd;
import o.registerOnLayoutRectChanged;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class AppMeasurement {
    public static volatile AppMeasurement IconCompatParcelizer;
    public final OnPlacedModifierKt write;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty(Bundle bundle) {
            accessgetSystemNavigationDowncp.IconCompatParcelizer(bundle);
            this.mAppId = (String) accesslayoutjd.read(bundle, HiAnalyticsConstant.BI_KEY_APP_ID, String.class, null);
            this.mOrigin = (String) accesslayoutjd.read(bundle, "origin", String.class, null);
            this.mName = (String) accesslayoutjd.read(bundle, "name", String.class, null);
            this.mValue = accesslayoutjd.read(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) accesslayoutjd.read(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) accesslayoutjd.read(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) accesslayoutjd.read(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) accesslayoutjd.read(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) accesslayoutjd.read(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) accesslayoutjd.read(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) accesslayoutjd.read(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) accesslayoutjd.read(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) accesslayoutjd.read(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) accesslayoutjd.read(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) accesslayoutjd.read(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) accesslayoutjd.read(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.write.write(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.write.serializer(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.write.read(str);
    }

    @Keep
    public long generateEventId() {
        return this.write.read();
    }

    @Keep
    public String getAppInstanceId() {
        return this.write.serializer();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List listRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(str, str2);
        ArrayList arrayList = new ArrayList(listRemoteActionCompatParcelizer == null ? 0 : listRemoteActionCompatParcelizer.size());
        Iterator it = listRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.write.RemoteActionCompatParcelizer();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.write.IconCompatParcelizer();
    }

    @Keep
    public String getGmpAppId() {
        return this.write.write();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.write.RemoteActionCompatParcelizer(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.write.read(str, str2, z);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.write.IconCompatParcelizer(str, str2, bundle);
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        MultiContentMeasurePolicyKt multiContentMeasurePolicyKt;
        if (IconCompatParcelizer == null) {
            synchronized (AppMeasurement.class) {
                if (IconCompatParcelizer == null) {
                    try {
                        multiContentMeasurePolicyKt = (MultiContentMeasurePolicyKt) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    } catch (Exception unused) {
                        multiContentMeasurePolicyKt = null;
                    }
                    if (multiContentMeasurePolicyKt != null) {
                        IconCompatParcelizer = new AppMeasurement(multiContentMeasurePolicyKt);
                    } else {
                        IconCompatParcelizer = new AppMeasurement(LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(context, new zzdd(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return IconCompatParcelizer;
    }

    public AppMeasurement(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        this.write = new registerOnLayoutRectChanged(lookaheadScopeKtLookaheadScope221);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            accesslayoutjd.read(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.write.serializer(bundle);
    }

    public AppMeasurement(MultiContentMeasurePolicyKt multiContentMeasurePolicyKt) {
        this.write = new OnLayoutRectChangedNode(multiContentMeasurePolicyKt);
    }
}
