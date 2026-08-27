package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.cardview.widget.CardView$1;
import androidx.transition.Transition$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class DrawScoperecord1 implements Handler.Callback {
    public static final io.sentry.hints.PlaybackStateCompatCustomAction serializer = new io.sentry.hints.PlaybackStateCompatCustomAction(5);
    public final getDefaultBlendMode0nO6VwU IconCompatParcelizer;
    public volatile com.bumptech.glide.RequestManager RemoteActionCompatParcelizer;
    public final CardView$1 read = new CardView$1(serializer);

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    public final com.bumptech.glide.RequestManager RemoteActionCompatParcelizer(Context context) {
        if (context != null) {
            if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
                if (context instanceof androidx.fragment.app.FragmentActivity) {
                    androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) context;
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        return RemoteActionCompatParcelizer(fragmentActivity.getApplicationContext());
                    }
                    if (!fragmentActivity.isDestroyed()) {
                        this.IconCompatParcelizer.RemoteActionCompatParcelizer(fragmentActivity);
                        Activity activityIconCompatParcelizer = IconCompatParcelizer(fragmentActivity);
                        boolean z = activityIconCompatParcelizer == null || !activityIconCompatParcelizer.isFinishing();
                        com.bumptech.glide.Glide glideIconCompatParcelizer = com.bumptech.glide.Glide.IconCompatParcelizer(fragmentActivity.getApplicationContext());
                        CardView$1 cardView$1 = this.read;
                        supportsColorMatrixQuery lifecycle = fragmentActivity.getLifecycle();
                        div7Ah8Wj8 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        cardView$1.getClass();
                        Fill.serializer();
                        Fill.serializer();
                        com.bumptech.glide.RequestManager requestManager = (com.bumptech.glide.RequestManager) ((HashMap) cardView$1.RemoteActionCompatParcelizer).get(lifecycle);
                        if (requestManager != null) {
                            return requestManager;
                        }
                        DrawScopeCompanion drawScopeCompanion = new DrawScopeCompanion(lifecycle);
                        io.sentry.hints.PlaybackStateCompatCustomAction playbackStateCompatCustomAction = (io.sentry.hints.PlaybackStateCompatCustomAction) cardView$1.IconCompatParcelizer;
                        Transition$1 transition$1 = new Transition$1(cardView$1, supportFragmentManager);
                        playbackStateCompatCustomAction.getClass();
                        com.bumptech.glide.RequestManager requestManager2 = new com.bumptech.glide.RequestManager(glideIconCompatParcelizer, drawScopeCompanion, transition$1, fragmentActivity);
                        ((HashMap) cardView$1.RemoteActionCompatParcelizer).put(lifecycle, requestManager2);
                        drawScopeCompanion.IconCompatParcelizer(new DrawScopeDefaultImpls(cardView$1, lifecycle));
                        if (z) {
                            requestManager2.write();
                        }
                        return requestManager2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("You cannot start a load for a destroyed activity");
                    return null;
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return RemoteActionCompatParcelizer(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.RemoteActionCompatParcelizer == null) {
                synchronized (this) {
                    if (this.RemoteActionCompatParcelizer == null) {
                        this.RemoteActionCompatParcelizer = new com.bumptech.glide.RequestManager(com.bumptech.glide.Glide.IconCompatParcelizer(context.getApplicationContext()), new speculativeHit(6), new getIntentArrayWithConfiguredBackStacklambda4(5), context.getApplicationContext());
                    }
                }
            }
            return this.RemoteActionCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("You cannot start a load on a null Context");
        return null;
    }

    public static Activity IconCompatParcelizer(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return IconCompatParcelizer(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public DrawScoperecord1() {
        this.IconCompatParcelizer = (accessdrawImageAZ2fEMsjd.IconCompatParcelizer && accessdrawImageAZ2fEMsjd.write) ? new drawRoundRectuAw5IAdefault() : new accessgetWcp(6);
    }
}
