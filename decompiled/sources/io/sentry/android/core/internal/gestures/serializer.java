package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.android.SystemUtils;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.ensureViewModelStore;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import o.AddToCustomAttributeArrayStep;
import o.BrazeActionParserExternalSyntheticLambda0;
import o._get_messageWebView_lambda0;
import o.accessgetDismissSubscriberp;
import o.defaultCardHandling;
import o.defaultCardHandlinglambda0;
import o.executelambda4;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.handleCardClicklambda4;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer implements GestureDetector.OnGestureListener {
    public final SentryAndroidOptions IconCompatParcelizer;
    public final AddToCustomAttributeArrayStep MediaBrowserCompatMediaItem;
    public final MediaBrowserCompatMediaItem MediaDescriptionCompat;
    public final WeakReference read;
    public RemoteActionCompatParcelizer serializer;
    public io.sentry.internal.gestures.serializer RemoteActionCompatParcelizer = null;
    public getChildStepIteratorandroid_sdk_ui_release write = null;

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View view = read("onScroll");
        if (view != null && motionEvent != null) {
            MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this.MediaDescriptionCompat;
            if (mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer == RemoteActionCompatParcelizer.Unknown) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                io.sentry.internal.gestures.IconCompatParcelizer iconCompatParcelizer = io.sentry.internal.gestures.IconCompatParcelizer.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.IconCompatParcelizer;
                io.sentry.internal.gestures.serializer serializerVarSerializer = MediaMetadataCompat.serializer(sentryAndroidOptions, view, x, y, iconCompatParcelizer);
                if (serializerVarSerializer == null) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer.Scroll;
                    return false;
                }
                BrazeActionParserExternalSyntheticLambda0 logger = sentryAndroidOptions.getLogger();
                r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
                String str = serializerVarSerializer.write;
                if (str == null) {
                    str = serializerVarSerializer.RemoteActionCompatParcelizer;
                    setNativeShader.read(str, "UiElement.tag can't be null");
                }
                logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Scroll target found: ".concat(str), new Object[0]);
                mediaBrowserCompatMediaItem.serializer = serializerVarSerializer;
                mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View view = read("onSingleTapUp");
        if (view != null && motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            io.sentry.internal.gestures.IconCompatParcelizer iconCompatParcelizer = io.sentry.internal.gestures.IconCompatParcelizer.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.IconCompatParcelizer;
            io.sentry.internal.gestures.serializer serializerVarSerializer = MediaMetadataCompat.serializer(sentryAndroidOptions, view, x, y, iconCompatParcelizer);
            if (serializerVarSerializer == null) {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = RemoteActionCompatParcelizer.Click;
            write(serializerVarSerializer, remoteActionCompatParcelizer, Collections.EMPTY_MAP, motionEvent);
            RemoteActionCompatParcelizer(serializerVarSerializer, remoteActionCompatParcelizer);
        }
        return false;
    }

    public final View read(String str) {
        Activity activity = (Activity) this.read.get();
        SentryAndroidOptions sentryAndroidOptions = this.IconCompatParcelizer;
        if (activity == null) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, ff$$ExternalSyntheticOutline0.m("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, ff$$ExternalSyntheticOutline0.m("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, ff$$ExternalSyntheticOutline0.m("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    public final void write(io.sentry.internal.gestures.serializer serializerVar, RemoteActionCompatParcelizer remoteActionCompatParcelizer, Map map, MotionEvent motionEvent) {
        String str;
        if (this.IconCompatParcelizer.isEnableUserInteractionBreadcrumbs()) {
            int i = IconCompatParcelizer.write[remoteActionCompatParcelizer.ordinal()];
            if (i == 1) {
                str = "click";
            } else if (i != 2) {
                str = i != 3 ? SystemUtils.UNKNOWN : "swipe";
            } else {
                str = "scroll";
            }
            executelambda4 executelambda4Var = new executelambda4();
            executelambda4Var.RemoteActionCompatParcelizer("android:motionEvent", motionEvent);
            executelambda4Var.RemoteActionCompatParcelizer("android:view", serializerVar.IconCompatParcelizer.get());
            String str2 = serializerVar.write;
            String str3 = serializerVar.serializer;
            String str4 = serializerVar.RemoteActionCompatParcelizer;
            getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1();
            getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem = FeedbackEvent.UI;
            getintentarraywithconfiguredbackstacklambda1.write = "ui.".concat(str);
            if (str2 != null) {
                getintentarraywithconfiguredbackstacklambda1.read(str2, "view.id");
            }
            if (str3 != null) {
                getintentarraywithconfiguredbackstacklambda1.read(str3, "view.class");
            }
            if (str4 != null) {
                getintentarraywithconfiguredbackstacklambda1.read(str4, "view.tag");
            }
            for (Map.Entry entry : map.entrySet()) {
                getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.put((String) entry.getKey(), entry.getValue());
            }
            getintentarraywithconfiguredbackstacklambda1.read = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO;
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer(getintentarraywithconfiguredbackstacklambda1, executelambda4Var);
        }
    }

    public serializer(Activity activity, accessgetDismissSubscriberp accessgetdismisssubscriberp, SentryAndroidOptions sentryAndroidOptions) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = RemoteActionCompatParcelizer.Unknown;
        this.serializer = remoteActionCompatParcelizer;
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = new MediaBrowserCompatMediaItem();
        mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        mediaBrowserCompatMediaItem.read = 0.0f;
        mediaBrowserCompatMediaItem.IconCompatParcelizer = 0.0f;
        this.MediaDescriptionCompat = mediaBrowserCompatMediaItem;
        this.read = new WeakReference(activity);
        this.MediaBrowserCompatMediaItem = accessgetdismisssubscriberp;
        this.IconCompatParcelizer = sentryAndroidOptions;
    }

    public final void write(defaultCardHandlinglambda0 defaultcardhandlinglambda0) {
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release = this.write;
        if (getchildstepiteratorandroid_sdk_ui_release != null) {
            defaultCardHandlinglambda0 defaultcardhandlinglambda0MediaSessionCompatQueueItem = getchildstepiteratorandroid_sdk_ui_release.MediaSessionCompatQueueItem();
            getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release2 = this.write;
            if (defaultcardhandlinglambda0MediaSessionCompatQueueItem == null) {
                getchildstepiteratorandroid_sdk_ui_release2.write(defaultcardhandlinglambda0);
            } else {
                getchildstepiteratorandroid_sdk_ui_release2.read();
            }
        }
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new d0$$ExternalSyntheticLambda0(15, this));
        this.write = null;
        if (this.RemoteActionCompatParcelizer != null) {
            this.RemoteActionCompatParcelizer = null;
        }
        this.serializer = RemoteActionCompatParcelizer.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this.MediaDescriptionCompat;
        mediaBrowserCompatMediaItem.serializer = null;
        mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer.Unknown;
        mediaBrowserCompatMediaItem.read = 0.0f;
        mediaBrowserCompatMediaItem.IconCompatParcelizer = 0.0f;
        mediaBrowserCompatMediaItem.read = motionEvent.getX();
        mediaBrowserCompatMediaItem.IconCompatParcelizer = motionEvent.getY();
        return false;
    }

    public final void RemoteActionCompatParcelizer(io.sentry.internal.gestures.serializer serializerVar, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        String str;
        boolean z = remoteActionCompatParcelizer == RemoteActionCompatParcelizer.Click || !(remoteActionCompatParcelizer == this.serializer && serializerVar.equals(this.RemoteActionCompatParcelizer));
        SentryAndroidOptions sentryAndroidOptions = this.IconCompatParcelizer;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = this.MediaBrowserCompatMediaItem;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z) {
                if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
                    addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(24));
                }
                this.RemoteActionCompatParcelizer = serializerVar;
                this.serializer = remoteActionCompatParcelizer;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.read.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str2 = serializerVar.write;
        if (str2 == null) {
            str2 = serializerVar.RemoteActionCompatParcelizer;
            setNativeShader.read(str2, "UiElement.tag can't be null");
        }
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release = this.write;
        if (getchildstepiteratorandroid_sdk_ui_release != null) {
            if (!z && !getchildstepiteratorandroid_sdk_ui_release.MediaDescriptionCompat()) {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, ff$$ExternalSyntheticOutline0.m("The view with id: ", str2, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.write.MediaSessionCompatResultReceiverWrapper();
                    return;
                }
                return;
            }
            write(defaultCardHandlinglambda0.OK);
        }
        String str3 = activity.getClass().getSimpleName() + "." + str2;
        int i = IconCompatParcelizer.write[remoteActionCompatParcelizer.ordinal()];
        if (i == 1) {
            str = "click";
        } else if (i != 2) {
            str = i != 3 ? SystemUtils.UNKNOWN : "swipe";
        } else {
            str = "scroll";
        }
        String strConcat = "ui.action.".concat(str);
        handleCardClicklambda4 handlecardclicklambda4 = new handleCardClicklambda4();
        handlecardclicklambda4.MediaSessionCompatQueueItem = true;
        long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
        handlecardclicklambda4.RatingCompat = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
        handlecardclicklambda4.MediaDescriptionCompat = sentryAndroidOptions.getIdleTimeout();
        handlecardclicklambda4.RemoteActionCompatParcelizer = true;
        handlecardclicklambda4.read = "auto.ui.gesture_listener." + serializerVar.read;
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_releaseSerializer = addToCustomAttributeArrayStep.serializer(new defaultCardHandling(str3, ensureViewModelStore.COMPONENT, strConcat, (_get_messageWebView_lambda0) null), handlecardclicklambda4);
        addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(new ArrivalProgressObserver$$ExternalSyntheticLambda0(this, 26, getchildstepiteratorandroid_sdk_ui_releaseSerializer));
        this.write = getchildstepiteratorandroid_sdk_ui_releaseSerializer;
        this.RemoteActionCompatParcelizer = serializerVar;
        this.serializer = remoteActionCompatParcelizer;
    }
}
