package com.mapbox.navigation.trip.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.widget.RemoteViews;
import com.logistics.rider.glovo.R;

/* JADX INFO: loaded from: classes5.dex */
public final class MapboxTripNotificationView {
    public RemoteViews collapsedView;
    public final Context context;
    public RemoteViews expandedView;

    public final void setFreeDriveMode(boolean z) {
        Context context = this.context;
        if (!z) {
            if (z) {
                return;
            }
            updateViewVisibility(this.collapsedView, R.id.etaContent, 0);
            updateViewVisibility(this.expandedView, R.id.etaContent, 0);
            updateViewVisibility(this.collapsedView, R.id.notificationInstructionText, 0);
            updateViewVisibility(this.expandedView, R.id.notificationInstructionText, 0);
            updateViewVisibility(this.collapsedView, R.id.freeDriveText, 8);
            updateViewVisibility(this.expandedView, R.id.freeDriveText, 8);
            RemoteViews remoteViews = this.expandedView;
            if (remoteViews != null) {
                remoteViews.setTextViewText(R.id.endNavigationBtn, context.getString(R.string.mapbox_end_navigation));
                return;
            }
            return;
        }
        updateViewVisibility(this.collapsedView, R.id.etaContent, 8);
        updateViewVisibility(this.expandedView, R.id.etaContent, 8);
        updateViewVisibility(this.collapsedView, R.id.notificationInstructionText, 8);
        updateViewVisibility(this.expandedView, R.id.notificationInstructionText, 8);
        updateViewVisibility(this.collapsedView, R.id.freeDriveText, 0);
        updateViewVisibility(this.expandedView, R.id.freeDriveText, 0);
        RemoteViews remoteViews2 = this.collapsedView;
        if (remoteViews2 != null) {
            remoteViews2.setImageViewResource(R.id.maneuverImage, R.drawable.mapbox_ic_navigation);
        }
        RemoteViews remoteViews3 = this.expandedView;
        if (remoteViews3 != null) {
            remoteViews3.setImageViewResource(R.id.maneuverImage, R.drawable.mapbox_ic_navigation);
        }
        RemoteViews remoteViews4 = this.expandedView;
        if (remoteViews4 != null) {
            remoteViews4.setTextViewText(R.id.endNavigationBtn, context.getString(R.string.mapbox_stop_session));
        }
    }

    public static void updateViewVisibility(RemoteViews remoteViews, int i, int i2) {
        if (remoteViews != null) {
            remoteViews.setViewVisibility(i, i2);
        }
    }

    public MapboxTripNotificationView(Context context) {
        context.getClass();
        this.context = context;
    }

    public final void buildRemoteViews(PendingIntent pendingIntent) {
        Context context = this.context;
        int color = context.getColor(R.color.mapbox_notification_blue);
        String packageName = context.getPackageName();
        packageName.getClass();
        RemoteViews remoteViews = new RemoteViews(packageName, R.layout.mapbox_notification_navigation_collapsed);
        remoteViews.setInt(R.id.navigationCollapsedNotificationLayout, "setBackgroundColor", color);
        this.collapsedView = remoteViews;
        String packageName2 = context.getPackageName();
        packageName2.getClass();
        RemoteViews remoteViews2 = new RemoteViews(packageName2, R.layout.mapbox_notification_navigation_expanded);
        remoteViews2.setInt(R.id.navigationExpandedNotificationLayout, "setBackgroundColor", color);
        remoteViews2.setOnClickPendingIntent(R.id.endNavigationBtn, pendingIntent);
        this.expandedView = remoteViews2;
    }

    public final void resetView() {
        RemoteViews remoteViews = this.collapsedView;
        if (remoteViews != null) {
            remoteViews.setTextViewText(R.id.notificationDistanceText, "");
            remoteViews.setTextViewText(R.id.notificationArrivalText, "");
            remoteViews.setTextViewText(R.id.notificationInstructionText, "");
            remoteViews.setViewVisibility(R.id.etaContent, 8);
            remoteViews.setViewVisibility(R.id.notificationInstructionText, 8);
            remoteViews.setViewVisibility(R.id.freeDriveText, 8);
        }
        RemoteViews remoteViews2 = this.expandedView;
        if (remoteViews2 != null) {
            remoteViews2.setTextViewText(R.id.notificationDistanceText, "");
            remoteViews2.setTextViewText(R.id.notificationArrivalText, "");
            remoteViews2.setTextViewText(R.id.notificationInstructionText, "");
            remoteViews2.setTextViewText(R.id.endNavigationBtn, "");
            remoteViews2.setViewVisibility(R.id.etaContent, 8);
            remoteViews2.setViewVisibility(R.id.notificationInstructionText, 8);
            remoteViews2.setViewVisibility(R.id.freeDriveText, 8);
        }
    }
}
