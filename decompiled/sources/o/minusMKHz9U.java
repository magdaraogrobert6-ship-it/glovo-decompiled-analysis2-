package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import bo.app.d$$ExternalSyntheticOutline0;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class minusMKHz9U implements MutableRecttz77jQw {
    public ThreadPoolExecutor IconCompatParcelizer;
    public ThreadPoolExecutor MediaBrowserCompatMediaItem;
    public final scheduleInvalidationForOwner MediaDescriptionCompat;
    public Handler RatingCompat;
    public final Object RemoteActionCompatParcelizer = new Object();
    public DefaultContentCardsUpdateHandlerCompanionCREATOR1 read;
    public final accessgetWcp serializer;
    public final Context write;

    public final FocusOwnerdispatchRotaryEvent1 IconCompatParcelizer() {
        try {
            accessgetWcp accessgetwcp = this.serializer;
            Context context = this.write;
            scheduleInvalidationForOwner scheduleinvalidationforowner = this.MediaDescriptionCompat;
            accessgetwcp.getClass();
            Object[] objArr = {scheduleinvalidationforowner};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            CSSParseException cSSParseExceptionSerializer = requestOwnerFocus7o62pno.serializer(context, Collections.unmodifiableList(arrayList));
            int i = cSSParseExceptionSerializer.IconCompatParcelizer;
            if (i != 0) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(d$$ExternalSyntheticOutline0.m(i, "fetchFonts failed (", ")"));
                return null;
            }
            FocusOwnerdispatchRotaryEvent1[] focusOwnerdispatchRotaryEvent1Arr = (FocusOwnerdispatchRotaryEvent1[]) ((List) cSSParseExceptionSerializer.RemoteActionCompatParcelizer).get(0);
            if (focusOwnerdispatchRotaryEvent1Arr != null && focusOwnerdispatchRotaryEvent1Arr.length != 0) {
                return focusOwnerdispatchRotaryEvent1Arr[0];
            }
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("provider not found", e);
            return null;
        }
    }

    public final void serializer() {
        synchronized (this.RemoteActionCompatParcelizer) {
            this.read = null;
            Handler handler = this.RatingCompat;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.RatingCompat = null;
            ThreadPoolExecutor threadPoolExecutor = this.MediaBrowserCompatMediaItem;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompatMediaItem = null;
        }
    }

    @Override // o.MutableRecttz77jQw
    public final void write(DefaultContentCardsUpdateHandlerCompanionCREATOR1 defaultContentCardsUpdateHandlerCompanionCREATOR1) {
        synchronized (this.RemoteActionCompatParcelizer) {
            this.read = defaultContentCardsUpdateHandlerCompanionCREATOR1;
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            if (this.read == null) {
                return;
            }
            if (this.IconCompatParcelizer == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new translate("emojiCompat"));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                this.MediaBrowserCompatMediaItem = threadPoolExecutor;
                this.IconCompatParcelizer = threadPoolExecutor;
            }
            this.IconCompatParcelizer.execute(new Sentry$$ExternalSyntheticLambda5(2, this));
        }
    }

    public minusMKHz9U(Context context, scheduleInvalidationForOwner scheduleinvalidationforowner) {
        coil3.util.UtilsKt.IconCompatParcelizer(context, "Context cannot be null");
        this.write = context.getApplicationContext();
        this.MediaDescriptionCompat = scheduleinvalidationforowner;
        this.serializer = getDistanceSquaredimpl.write;
    }
}
