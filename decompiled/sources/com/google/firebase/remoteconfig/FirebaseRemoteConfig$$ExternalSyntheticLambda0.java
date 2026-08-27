package com.google.firebase.remoteconfig;

import bo.app.w4$$ExternalSyntheticLambda0;
import coil3.ImageLoader$Builder;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.tasks.Task;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import o.OuterPlacementScope;
import o.PausedPrecompositionImpl;
import o.accessaddNotificationForSysPropsChange;
import o.setPositiongyyYBs;
import o.setPrimaryDirectionalMotionAxisOverrider2epLt8ui;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class FirebaseRemoteConfig$$ExternalSyntheticLambda0 implements PausedPrecompositionImpl, OuterPlacementScope {
    public final /* synthetic */ FirebaseRemoteConfig IconCompatParcelizer;

    public /* synthetic */ FirebaseRemoteConfig$$ExternalSyntheticLambda0(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.IconCompatParcelizer = firebaseRemoteConfig;
    }

    @Override // o.OuterPlacementScope
    public Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            FirebaseRemoteConfig firebaseRemoteConfig = this.IconCompatParcelizer;
            firebaseRemoteConfig.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
            setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8ui = (setPrimaryDirectionalMotionAxisOverrider2epLt8ui) task.getResult();
            if (setprimarydirectionalmotionaxisoverrider2eplt8ui != null) {
                JSONArray jSONArray = setprimarydirectionalmotionaxisoverrider2eplt8ui.RemoteActionCompatParcelizer;
                FirebaseABTesting firebaseABTesting = firebaseRemoteConfig.MediaMetadataCompat;
                if (firebaseABTesting != null) {
                    try {
                        firebaseABTesting.RemoteActionCompatParcelizer(FirebaseRemoteConfig.serializer(jSONArray));
                    } catch (AbtException e) {
                        SentryLogcatAdapter.write("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
                    } catch (JSONException e2) {
                        SentryLogcatAdapter.read("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
                    }
                }
                ImageLoader$Builder imageLoader$Builder = firebaseRemoteConfig.PlaybackStateCompat;
                try {
                    accessaddNotificationForSysPropsChange accessaddnotificationforsyspropschange = ((zzbv) imageLoader$Builder.IconCompatParcelizer).read(setprimarydirectionalmotionaxisoverrider2eplt8ui);
                    Iterator it = ((Set) imageLoader$Builder.serializer).iterator();
                    while (it.hasNext()) {
                        ((Executor) imageLoader$Builder.read).execute(new w4$$ExternalSyntheticLambda0((setPositiongyyYBs) it.next(), 29, accessaddnotificationforsyspropschange));
                    }
                } catch (FirebaseRemoteConfigException e3) {
                    SentryLogcatAdapter.write("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e3);
                }
            } else {
                SentryLogcatAdapter.serializer("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // o.PausedPrecompositionImpl
    public Task then(Object obj) {
        return this.IconCompatParcelizer.write();
    }
}
