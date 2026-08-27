package com.qualtrics.digital;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.common.BundleUtil;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Map;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes3.dex */
public class Properties {
    public static final String APP_REVIEWS_COUNT = "Qualtrics_NUM_APP_REVIEWS_REQUESTED";
    public static final String LAST_DISPLAY_TIME = "lastDisplayTime";
    private static final String NOTIFICATION_ICON = "notificationIcon";
    private static final String QUALTRICS_SURVEY_TAKEN = "QST_";
    private static final String SHARED_PREFERENCE_NAME = "com.qualtrics.qualtrics.QUALTRICS";
    public static final String SHOW_NATIVE_APP_REVIEWS = "show_native_app_reviews";
    private static final String TAG = "Qualtrics";
    private static Properties instance;
    private Context context;

    public void setContext(Context context) {
        setContextInternal(context);
    }

    public void removeNotificationIconAsset() {
        removeProperty(NOTIFICATION_ICON);
    }

    public Properties(Context context) {
        setContextInternal(context);
    }

    private void setContextInternal(Context context) {
        if (context == null) {
            return;
        }
        if (context instanceof Application) {
            this.context = context;
        } else {
            this.context = context.getApplicationContext();
        }
    }

    public static Properties instance(Context context) {
        if (instance == null) {
            instance = new Properties(context);
        }
        return instance;
    }

    public void removeSurveyHasBeenTaken(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(QUALTRICS_SURVEY_TAKEN + str).apply();
        }
    }

    public void setCreativeActionButtonPressed(String str, String str2, String str3) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        String str4 = str + BundleUtil.UNDERLINE_TAG + str2 + BundleUtil.UNDERLINE_TAG + str3;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong(str4, System.currentTimeMillis()).apply();
        }
    }

    public void setDisplayNativeAppReviews(boolean z) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(SHOW_NATIVE_APP_REVIEWS, z).apply();
        } else {
            SentryLogcatAdapter.serializer("Qualtrics", "Unable to set display native app reviews");
        }
    }

    public void setLastDisplayTime() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong(LAST_DISPLAY_TIME, System.currentTimeMillis()).apply();
        }
    }

    public void setNativeAppReviewCount(int i) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt(APP_REVIEWS_COUNT, i).apply();
        }
    }

    public void setSurveyHasBeenTaken(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(QUALTRICS_SURVEY_TAKEN, str), System.currentTimeMillis()).apply();
        }
    }

    public void removeProperty(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public void setDateTime(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong(str, System.currentTimeMillis());
        editorEdit.apply();
    }

    public void setNotificationIconAsset(int i) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt(NOTIFICATION_ICON, i);
        editorEdit.apply();
    }

    public void setNumber(String str, double d) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(str, Double.toString(d));
        editorEdit.apply();
    }

    public void setString(String str, String str2) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    private SharedPreferences getSharedPreferences() {
        Context context = this.context;
        if (context != null) {
            return context.getSharedPreferences(SHARED_PREFERENCE_NAME, 0);
        }
        SentryLogcatAdapter.serializer("Qualtrics", "Unable to get shared properties. Ensure the context is set");
        return null;
    }

    public Map<String, ?> getAllQProperties() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getAll();
    }

    public Long getDateTime(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null && sharedPreferences.contains(str)) {
            return Long.valueOf(sharedPreferences.getLong(str, 0L));
        }
        return null;
    }

    public Double getNumber(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null && sharedPreferences.contains(str)) {
            return Double.valueOf(Double.parseDouble(sharedPreferences.getString(str, null)));
        }
        return null;
    }

    public String getString(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString(str, null);
    }

    public void setLastDisplayTimeForIntercept(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("lastDisplayTime_", str), System.currentTimeMillis()).apply();
        }
    }

    public int getNativeAppReviewCount() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(APP_REVIEWS_COUNT, 0);
        }
        return 0;
    }

    public long getLastDisplayTime() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(LAST_DISPLAY_TIME, 0L);
        }
        return Long.MAX_VALUE;
    }

    public long getLastDisplayTimeForIntercept(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            return Long.MAX_VALUE;
        }
        return sharedPreferences.getLong("lastDisplayTime_" + str, 0L);
    }

    public int getNotificationIconAsset() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            return 0;
        }
        return sharedPreferences.getInt(NOTIFICATION_ICON, 0);
    }

    public boolean shouldDisplayNativeAppReviews() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(SHOW_NATIVE_APP_REVIEWS, true);
        }
        return true;
    }

    public long getSurveyHasBeenTaken(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null reference to SharedPreferences");
            return 0L;
        }
        return sharedPreferences.getLong(QUALTRICS_SURVEY_TAKEN + str, 0L);
    }
}
