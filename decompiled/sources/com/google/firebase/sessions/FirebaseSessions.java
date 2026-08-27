package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import androidx.datastore.core.SimpleActor$offer$2;
import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.settings.SessionsSettings;
import io.sentry.android.core.SentryLogcatAdapter;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseSessions {
    public final SessionsSettings IconCompatParcelizer;
    public final FirebaseApp serializer;

    public FirebaseSessions(FirebaseApp firebaseApp, SessionsSettings sessionsSettings, TextAnnouncementContentCardView textAnnouncementContentCardView, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        firebaseApp.getClass();
        sessionsSettings.getClass();
        textAnnouncementContentCardView.getClass();
        sessionsActivityLifecycleCallbacks.getClass();
        this.serializer = firebaseApp;
        this.IconCompatParcelizer = sessionsSettings;
        firebaseApp.IconCompatParcelizer();
        Context applicationContext = firebaseApp.read.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(textAnnouncementContentCardView), null, null, new SimpleActor$offer$2(this, sessionsActivityLifecycleCallbacks, (ShortNewsContentCardView) null, 21), 3);
        } else {
            SentryLogcatAdapter.serializer("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
