package com.mapbox.navigation.trip.notification.internal;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzlc;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.logistics.rider.glovo.R;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.api.directions.v5.models.BannerText;
import com.mapbox.api.directions.v5.models.StepManeuver;
import com.mapbox.navigation.base.formatter.DistanceFormatter;
import com.mapbox.navigation.base.formatter.TimeFormatter;
import com.mapbox.navigation.base.internal.maneuver.ManeuverTurnIcon;
import com.mapbox.navigation.base.internal.maneuver.TurnIconHelper;
import com.mapbox.navigation.base.internal.trip.notification.NotificationTurnIconResources;
import com.mapbox.navigation.base.options.NavigationOptions;
import com.mapbox.navigation.base.trip.model.TripNotificationState$TripNotificationData;
import com.mapbox.navigation.base.trip.model.TripNotificationState$TripNotificationFreeState;
import com.mapbox.navigation.base.trip.notification.NotificationAction;
import com.mapbox.navigation.base.trip.notification.TripNotification;
import com.mapbox.navigation.trip.notification.MapboxTripNotificationView;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import java.util.Arrays;
import java.util.Calendar;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import o.IInAppMessageViewWrapper;
import o.createFromParcel;
import o.getCieXyz;
import o.getCollapse;
import o.getCopyText;
import o.getEnterdhqQ8s;
import o.getScrollBy;
import o.logUnregisterActivitylambda1;
import o.removeNodeAtDepth;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes5.dex */
public final class MapboxTripNotification implements TripNotification {
    public static final getScrollBy Companion = new getScrollBy();
    private static logUnregisterActivitylambda1 notificationActionButtonChannel = SQLite.IconCompatParcelizer(1, 6, (IInAppMessageViewWrapper) null);
    private final Context applicationContext;
    private Double currentDistance;
    private SpannableString currentFormattedDistance;
    private String currentFormattedTime;
    private String currentInstructionText;
    private Bitmap currentManeuverImage;
    private String currentManeuverModifier;
    private String currentManeuverType;
    private Float currentRoundaboutAngle;
    private final DistanceFormatter distanceFormatter;
    private final String etaFormat;
    private final int flags;
    private final getCopyText interceptorOwner;
    private Boolean isInFreeDriveMode;
    private Notification notification;
    private final NotificationDismissedReceiver notificationDismissedReceiver;
    private final NotificationEndReceiver notificationEndReceiver;
    private NotificationManager notificationManager;
    private MapboxTripNotificationView notificationView;
    private PendingIntent pendingCloseIntent;
    private PendingIntent pendingDismissalIntent;
    private PendingIntent pendingOpenIntent;
    private State state;
    private final TimeFormatter timeFormatter;
    private final TurnIconHelper turnIconHelper;

    public final class NotificationDismissedReceiver extends BroadcastReceiver {
        public NotificationDismissedReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            MapboxTripNotification.this.onNotificationDismissed();
        }
    }

    public final class NotificationEndReceiver extends BroadcastReceiver {
        public NotificationEndReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) throws Exception {
            MapboxTripNotification.this.onEndNavigationBtnClick();
        }
    }

    public enum State {
        NOT_STARTED,
        STARTED,
        DISMISSED
    }

    private final void cleanUp() {
        synchronized (this) {
            if (this.state == State.STARTED) {
                this.currentManeuverType = null;
                this.currentManeuverModifier = null;
                this.currentInstructionText = null;
                this.currentDistance = null;
                this.isInFreeDriveMode = null;
                this.notificationView.resetView();
                unregisterReceivers();
                try {
                    notificationActionButtonChannel.write(null);
                } catch (Exception e) {
                    if (!(e instanceof CancellationException) && !(e instanceof ClosedSendChannelException) && !(e instanceof ClosedReceiveChannelException)) {
                        throw e;
                    }
                }
            }
        }
    }

    @StepManeuver.StepManeuverType
    public static /* synthetic */ void getCurrentManeuverType$annotations() {
    }

    public final String getCurrentManeuverModifier() {
        return this.currentManeuverModifier;
    }

    public final String getCurrentManeuverType() {
        return this.currentManeuverType;
    }

    @Override // com.mapbox.navigation.base.trip.notification.TripNotification
    public int getNotificationId() {
        return 7654;
    }

    private final void applyNotificationContent(getCollapse getcollapse) {
        MapboxTripNotificationView mapboxTripNotificationView = this.notificationView;
        MapboxTripNotificationView.updateViewVisibility(mapboxTripNotificationView.collapsedView, R.id.navigationIsStarting, 8);
        MapboxTripNotificationView.updateViewVisibility(mapboxTripNotificationView.expandedView, R.id.navigationIsStarting, 8);
        if (getcollapse instanceof TripNotificationState$TripNotificationFreeState) {
            this.notificationView.setFreeDriveMode(true);
            return;
        }
        if (getcollapse instanceof TripNotificationState$TripNotificationData) {
            SpannableString spannableString = this.currentFormattedDistance;
            if (spannableString != null) {
                MapboxTripNotificationView mapboxTripNotificationView2 = this.notificationView;
                RemoteViews remoteViews = mapboxTripNotificationView2.collapsedView;
                if (remoteViews != null) {
                    remoteViews.setTextViewText(R.id.notificationDistanceText, String.valueOf(spannableString));
                }
                RemoteViews remoteViews2 = mapboxTripNotificationView2.expandedView;
                if (remoteViews2 != null) {
                    remoteViews2.setTextViewText(R.id.notificationDistanceText, String.valueOf(spannableString));
                }
            }
            String str = this.currentFormattedTime;
            if (str != null) {
                MapboxTripNotificationView mapboxTripNotificationView3 = this.notificationView;
                mapboxTripNotificationView3.getClass();
                RemoteViews remoteViews3 = mapboxTripNotificationView3.collapsedView;
                if (remoteViews3 != null) {
                    remoteViews3.setTextViewText(R.id.notificationArrivalText, str);
                }
                RemoteViews remoteViews4 = mapboxTripNotificationView3.expandedView;
                if (remoteViews4 != null) {
                    remoteViews4.setTextViewText(R.id.notificationArrivalText, str);
                }
            }
            String str2 = this.currentInstructionText;
            if (str2 != null) {
                MapboxTripNotificationView mapboxTripNotificationView4 = this.notificationView;
                mapboxTripNotificationView4.getClass();
                RemoteViews remoteViews5 = mapboxTripNotificationView4.collapsedView;
                if (remoteViews5 != null) {
                    remoteViews5.setTextViewText(R.id.notificationInstructionText, str2);
                }
                RemoteViews remoteViews6 = mapboxTripNotificationView4.expandedView;
                if (remoteViews6 != null) {
                    remoteViews6.setTextViewText(R.id.notificationInstructionText, str2);
                }
            }
            Bitmap bitmap = this.currentManeuverImage;
            if (bitmap != null) {
                MapboxTripNotificationView mapboxTripNotificationView5 = this.notificationView;
                mapboxTripNotificationView5.getClass();
                RemoteViews remoteViews7 = mapboxTripNotificationView5.collapsedView;
                if (remoteViews7 != null) {
                    remoteViews7.setImageViewBitmap(R.id.maneuverImage, bitmap);
                }
                RemoteViews remoteViews8 = mapboxTripNotificationView5.expandedView;
                if (remoteViews8 != null) {
                    remoteViews8.setImageViewBitmap(R.id.maneuverImage, bitmap);
                }
            }
            this.notificationView.setFreeDriveMode(false);
        }
    }

    private final boolean computeArrivalTime(Double d) {
        String strGenerateArrivalTime$default = generateArrivalTime$default(this, d, null, 2, null);
        if (strGenerateArrivalTime$default == null || strGenerateArrivalTime$default.equals(this.currentFormattedTime)) {
            return false;
        }
        this.currentFormattedTime = strGenerateArrivalTime$default;
        return true;
    }

    private final String generateArrivalTime(Double d, Calendar calendar) {
        if (d == null) {
            return null;
        }
        calendar.add(13, (int) d.doubleValue());
        DeltaDecoder deltaDecoder = (DeltaDecoder) this.timeFormatter;
        deltaDecoder.getClass();
        return String.format(this.etaFormat, Arrays.copyOf(new Object[]{zzlc.formatTime$default(calendar, deltaDecoder.write, DateFormat.is24HourFormat((Context) deltaDecoder.serializer))}, 1));
    }

    private final getEnterdhqQ8s getNotificationBuilder() {
        Context context = this.applicationContext;
        context.getClass();
        getEnterdhqQ8s getenterdhqq8s = new getEnterdhqQ8s(context, "NAVIGATION_NOTIFICATION_CHANNEL");
        getenterdhqq8s.read = "service";
        getenterdhqq8s.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 2;
        Notification notification = getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        notification.icon = R.drawable.mapbox_ic_navigation;
        MapboxTripNotificationView mapboxTripNotificationView = this.notificationView;
        getenterdhqq8s.PlaybackStateCompat = mapboxTripNotificationView.collapsedView;
        getenterdhqq8s.IconCompatParcelizer = mapboxTripNotificationView.expandedView;
        getenterdhqq8s.write(2, true);
        if (Build.VERSION.SDK_INT >= 31) {
            getenterdhqq8s.MediaSessionCompatQueueItem = this.applicationContext.getColor(R.color.mapbox_notification_blue);
            getenterdhqq8s.MediaBrowserCompatMediaItem = true;
            getenterdhqq8s.RatingCompat = true;
        }
        PendingIntent pendingIntent = this.pendingOpenIntent;
        if (pendingIntent != null) {
            getenterdhqq8s.MediaMetadataCompat = pendingIntent;
        }
        PendingIntent pendingIntent2 = this.pendingDismissalIntent;
        if (pendingIntent2 != null) {
            notification.deleteIntent = pendingIntent2;
        }
        this.interceptorOwner.getClass();
        return getenterdhqq8s;
    }

    private final boolean isManeuverStateChanged(BannerInstructions bannerInstructions) {
        String str = this.currentManeuverType;
        String str2 = this.currentManeuverModifier;
        Float f = this.currentRoundaboutAngle;
        this.currentManeuverType = bannerInstructions.primary().type();
        this.currentManeuverModifier = bannerInstructions.primary().modifier();
        Double dDegrees = bannerInstructions.primary().degrees();
        this.currentRoundaboutAngle = dDegrees != null ? Float.valueOf((float) dDegrees.doubleValue()) : null;
        return (TextUtils.equals(this.currentManeuverType, str) && TextUtils.equals(this.currentManeuverModifier, str2) && removeNodeAtDepth.IconCompatParcelizer(this.currentRoundaboutAngle, f)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEndNavigationBtnClick() throws Exception {
        try {
            notificationActionButtonChannel.b_(NotificationAction.END_NAVIGATION);
        } catch (Exception e) {
            if (!(e instanceof ClosedReceiveChannelException) && !(e instanceof ClosedSendChannelException)) {
                throw e;
            }
        }
    }

    @SuppressLint
    private final void registerReceivers() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.applicationContext;
        if (i >= 34) {
            context.registerReceiver(this.notificationEndReceiver, new IntentFilter("com.mapbox.intent.action.END_NAVIGATION"), 4);
            this.applicationContext.registerReceiver(this.notificationDismissedReceiver, new IntentFilter("com.mapbox.intent.action.DISMISS_NOTIFICATION"), 4);
        } else {
            context.registerReceiver(this.notificationEndReceiver, new IntentFilter("com.mapbox.intent.action.END_NAVIGATION"));
            this.applicationContext.registerReceiver(this.notificationDismissedReceiver, new IntentFilter("com.mapbox.intent.action.DISMISS_NOTIFICATION"));
        }
    }

    private final void unregisterReceivers() {
        this.applicationContext.unregisterReceiver(this.notificationEndReceiver);
        this.applicationContext.unregisterReceiver(this.notificationDismissedReceiver);
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            notificationManager.cancel(7654);
        } else {
            removeNodeAtDepth.serializer("notificationManager");
            throw null;
        }
    }

    public MapboxTripNotification(NavigationOptions navigationOptions, getCopyText getcopytext, DistanceFormatter distanceFormatter) {
        createFromParcel createfromparcel;
        navigationOptions.getClass();
        getcopytext.getClass();
        distanceFormatter.getClass();
        this.interceptorOwner = getcopytext;
        this.distanceFormatter = distanceFormatter;
        Context context = navigationOptions.applicationContext;
        this.applicationContext = context;
        this.timeFormatter = navigationOptions.timeFormatter;
        String string = context.getString(R.string.mapbox_eta_format);
        string.getClass();
        this.etaFormat = string;
        this.notificationEndReceiver = new NotificationEndReceiver();
        this.notificationDismissedReceiver = new NotificationDismissedReceiver();
        this.state = State.NOT_STARTED;
        this.turnIconHelper = new TurnIconHelper(new NotificationTurnIconResources());
        this.flags = 201326592;
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (systemService != null) {
            this.notificationManager = (NotificationManager) systemService;
            createfromparcel = createFromParcel.INSTANCE;
        } else {
            createfromparcel = null;
        }
        if (createfromparcel == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unable to create a NotificationManager");
            throw null;
        }
        this.pendingOpenIntent = createPendingOpenIntent(context);
        this.pendingCloseIntent = createPendingCloseIntent(context);
        this.pendingDismissalIntent = createPendingDismissalIntent(context);
        MapboxTripNotificationView mapboxTripNotificationView = new MapboxTripNotificationView(context);
        this.notificationView = mapboxTripNotificationView;
        mapboxTripNotificationView.buildRemoteViews(this.pendingCloseIntent);
        createNotificationChannel();
    }

    private final boolean computeDistance(Double d) {
        if (d == null || removeNodeAtDepth.read(this.currentDistance, d)) {
            return false;
        }
        this.currentDistance = d;
        SpannableString distance = ((AnalyticsServiceImpl) this.distanceFormatter).formatDistance(d.doubleValue());
        String string = distance.toString();
        SpannableString spannableString = this.currentFormattedDistance;
        String string2 = spannableString != null ? spannableString.toString() : null;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{string, string2}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        this.currentFormattedDistance = distance;
        return true;
    }

    private final boolean computeInstructionText(BannerInstructions bannerInstructions) {
        BannerText bannerTextPrimary;
        String strText;
        if (bannerInstructions == null || (bannerTextPrimary = bannerInstructions.primary()) == null || (strText = bannerTextPrimary.text()) == null || !isInstructionTextChanged(strText)) {
            return false;
        }
        this.currentInstructionText = strText;
        return true;
    }

    private final boolean computeManeuverState(BannerInstructions bannerInstructions, String str) {
        Bitmap maneuverBitmap;
        if (bannerInstructions == null || !isManeuverStateChanged(bannerInstructions)) {
            return false;
        }
        TurnIconHelper turnIconHelper = this.turnIconHelper;
        String str2 = this.currentManeuverType;
        Float f = this.currentRoundaboutAngle;
        String str3 = this.currentManeuverModifier;
        if (str == null) {
            str = "right";
        }
        ManeuverTurnIcon maneuverTurnIconRetrieveTurnIcon = turnIconHelper.retrieveTurnIcon(str2, f, str3, str);
        if (maneuverTurnIconRetrieveTurnIcon == null) {
            return true;
        }
        Drawable drawable = this.notificationView.context.getDrawable(maneuverTurnIconRetrieveTurnIcon.icon.intValue());
        if (drawable == null || (maneuverBitmap = getManeuverBitmap(drawable, maneuverTurnIconRetrieveTurnIcon.shouldFlipIcon)) == null) {
            return true;
        }
        this.currentManeuverImage = maneuverBitmap;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNotificationDismissed() {
        cleanUp();
        this.state = State.DISMISSED;
    }

    @Override // com.mapbox.navigation.base.trip.notification.TripNotification
    public void onTripSessionStopped() {
        cleanUp();
        this.state = State.NOT_STARTED;
    }

    public void updateNotification(getCollapse getcollapse) {
        getcollapse.getClass();
        synchronized (this) {
            if (this.state != State.STARTED) {
                return;
            }
            if (computeNotificationContent(getcollapse)) {
                this.notificationView.buildRemoteViews(this.pendingCloseIntent);
                applyNotificationContent(getcollapse);
                Notification notificationWrite = getNotificationBuilder().write();
                notificationWrite.getClass();
                this.notification = notificationWrite;
                NotificationManager notificationManager = this.notificationManager;
                if (notificationManager == null) {
                    removeNodeAtDepth.serializer("notificationManager");
                    throw null;
                }
                notificationManager.notify(7654, notificationWrite);
            }
        }
    }

    private final PendingIntent createPendingCloseIntent(Context context) {
        Intent intent = new Intent("com.mapbox.intent.action.END_NAVIGATION");
        intent.setPackage(context.getPackageName());
        return PendingIntent.getBroadcast(context, 0, intent, this.flags);
    }

    private final PendingIntent createPendingDismissalIntent(Context context) {
        Intent intent = new Intent("com.mapbox.intent.action.DISMISS_NOTIFICATION");
        intent.setPackage(context.getPackageName());
        return PendingIntent.getBroadcast(context, 0, intent, this.flags);
    }

    private final PendingIntent createPendingOpenIntent(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        launchIntentForPackage.setPackage(null);
        return PendingIntent.getActivity(context, 0, launchIntentForPackage, this.flags);
    }

    public static /* synthetic */ String generateArrivalTime$default(MapboxTripNotification mapboxTripNotification, Double d, Calendar calendar, int i, Object obj) {
        if ((i & 2) != 0) {
            calendar = Calendar.getInstance();
            calendar.getClass();
        }
        return mapboxTripNotification.generateArrivalTime(d, calendar);
    }

    private final Bitmap getManeuverBitmap(Drawable drawable, boolean z) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        canvas.restoreToCount(canvas.getSaveCount());
        if (!z) {
            return bitmapCreateBitmap;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, intrinsicWidth, intrinsicHeight, matrix, false);
    }

    private final boolean isInstructionTextChanged(String str) {
        String str2 = this.currentInstructionText;
        if (str2 == null || str2.length() == 0) {
            return true;
        }
        return !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currentInstructionText, str}, getCieXyz.write())).booleanValue();
    }

    @Override // com.mapbox.navigation.base.trip.notification.TripNotification
    public Notification getNotification() {
        if (this.notification == null) {
            Notification notificationWrite = getNotificationBuilder().write();
            notificationWrite.getClass();
            this.notification = notificationWrite;
        }
        Notification notification = this.notification;
        if (notification != null) {
            return notification;
        }
        removeNodeAtDepth.serializer(RemoteMessageConst.NOTIFICATION);
        throw null;
    }

    private final boolean computeNotificationContent(getCollapse getcollapse) {
        if (getcollapse instanceof TripNotificationState$TripNotificationFreeState) {
            Boolean bool = this.isInFreeDriveMode;
            Boolean bool2 = Boolean.TRUE;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool, bool2}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            this.isInFreeDriveMode = bool2;
            this.currentManeuverType = null;
            this.currentManeuverModifier = null;
            this.currentRoundaboutAngle = null;
            return true;
        }
        if (!(getcollapse instanceof TripNotificationState$TripNotificationData)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return false;
        }
        Boolean bool3 = this.isInFreeDriveMode;
        Boolean bool4 = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool3, bool4}, getCieXyz.write())).booleanValue();
        this.isInFreeDriveMode = bool4;
        TripNotificationState$TripNotificationData tripNotificationState$TripNotificationData = (TripNotificationState$TripNotificationData) getcollapse;
        BannerInstructions bannerInstructions = tripNotificationState$TripNotificationData.bannerInstructions;
        return !zBooleanValue || computeDistance(tripNotificationState$TripNotificationData.distanceRemaining) || computeArrivalTime(tripNotificationState$TripNotificationData.durationRemaining) || computeInstructionText(bannerInstructions) || computeManeuverState(bannerInstructions, tripNotificationState$TripNotificationData.drivingSide);
    }

    public void onTripSessionStarted() {
        registerReceivers();
        notificationActionButtonChannel = SQLite.IconCompatParcelizer(1, 6, (IInAppMessageViewWrapper) null);
        MapboxTripNotificationView mapboxTripNotificationView = this.notificationView;
        MapboxTripNotificationView.updateViewVisibility(mapboxTripNotificationView.collapsedView, R.id.navigationIsStarting, 0);
        MapboxTripNotificationView.updateViewVisibility(mapboxTripNotificationView.expandedView, R.id.navigationIsStarting, 0);
        MapboxTripNotificationView mapboxTripNotificationView2 = this.notificationView;
        RemoteViews remoteViews = mapboxTripNotificationView2.expandedView;
        if (remoteViews != null) {
            remoteViews.setTextViewText(R.id.endNavigationBtn, mapboxTripNotificationView2.context.getString(R.string.mapbox_stop_session));
        }
        this.state = State.STARTED;
    }

    private final void createNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel("NAVIGATION_NOTIFICATION_CHANNEL", "Navigation Notifications", 2);
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        } else {
            removeNodeAtDepth.serializer("notificationManager");
            throw null;
        }
    }
}
