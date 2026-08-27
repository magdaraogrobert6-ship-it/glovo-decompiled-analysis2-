package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.logistics.rider.glovo.R;
import fwfd.com.fwfsdk.util.FWFHelper;
import io.sentry.android.core.SentryLogcatAdapter;
import java.text.NumberFormat;
import o.accessgetLeftcp;
import o.getEnterdhqQ8s;
import o.getExitdhqQ8s;
import o.getPreviousdhqQ8s;
import o.getUpdhqQ8s;

/* JADX INFO: loaded from: classes.dex */
public abstract class NotificationCompat$Style {
    public boolean MediaSessionCompatResultReceiverWrapper = false;
    public CharSequence MediaSessionCompatToken;
    public CharSequence PlaybackStateCompat;
    protected getEnterdhqQ8s PlaybackStateCompatCustomAction;

    public void apply(accessgetLeftcp accessgetleftcp) {
    }

    public boolean displayCustomViewInline() {
        return false;
    }

    public String getClassName() {
        return null;
    }

    public RemoteViews makeBigContentView(accessgetLeftcp accessgetleftcp) {
        return null;
    }

    public RemoteViews makeContentView(accessgetLeftcp accessgetleftcp) {
        return null;
    }

    public RemoteViews makeHeadsUpContentView(accessgetLeftcp accessgetleftcp) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    public static NotificationCompat$Style constructCompatStyleByName(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "androidx.core.app.NotificationCompat$ProgressStyle":
                return new NotificationCompat$ProgressStyle();
            case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                return new getPreviousdhqQ8s();
            case "androidx.core.app.NotificationCompat$BigPictureStyle":
                return new NotificationCompat$BigPictureStyle();
            case "androidx.core.app.NotificationCompat$CallStyle":
                return new NotificationCompat$CallStyle();
            case "androidx.core.app.NotificationCompat$InboxStyle":
                return new getUpdhqQ8s();
            case "androidx.core.app.NotificationCompat$BigTextStyle":
                return new getExitdhqQ8s(0);
            case "androidx.core.app.NotificationCompat$MessagingStyle":
                return new NotificationCompat$MessagingStyle();
            default:
                return null;
        }
    }

    public static NotificationCompat$Style constructCompatStyleForBundle(Bundle bundle) {
        NotificationCompat$Style notificationCompat$StyleConstructCompatStyleByName = constructCompatStyleByName(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
        if (notificationCompat$StyleConstructCompatStyleByName != null) {
            return notificationCompat$StyleConstructCompatStyleByName;
        }
        if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
            return new NotificationCompat$MessagingStyle();
        }
        if (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) {
            return new NotificationCompat$BigPictureStyle();
        }
        if (bundle.containsKey("android.bigText")) {
            return new getExitdhqQ8s(0);
        }
        if (bundle.containsKey("android.textLines")) {
            return new getUpdhqQ8s();
        }
        if (bundle.containsKey("android.callType")) {
            return new NotificationCompat$CallStyle();
        }
        if (bundle.containsKey("android.progressSegments") || bundle.containsKey("android.progressPoints")) {
            return new NotificationCompat$ProgressStyle();
        }
        String string = bundle.getString("android.template");
        if (string == null) {
            return null;
        }
        if (string.equals(Notification.BigPictureStyle.class.getName())) {
            return new NotificationCompat$BigPictureStyle();
        }
        if (string.equals(Notification.BigTextStyle.class.getName())) {
            return new getExitdhqQ8s(0);
        }
        if (string.equals(Notification.InboxStyle.class.getName())) {
            return new getUpdhqQ8s();
        }
        if (Build.VERSION.SDK_INT >= 36 && string.equals(Notification.ProgressStyle.class.getName())) {
            return new NotificationCompat$ProgressStyle();
        }
        if (string.equals(Notification.MessagingStyle.class.getName())) {
            return new NotificationCompat$MessagingStyle();
        }
        if (string.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
            return new getPreviousdhqQ8s();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0159  */
    public RemoteViews applyStandardTemplate(boolean z, int i, boolean z2) {
        boolean z3;
        int i2;
        Resources resources = this.PlaybackStateCompatCustomAction.MediaSessionCompatToken.getResources();
        RemoteViews remoteViews = new RemoteViews(this.PlaybackStateCompatCustomAction.MediaSessionCompatToken.getPackageName(), i);
        getEnterdhqQ8s getenterdhqq8s = this.PlaybackStateCompatCustomAction;
        if (getenterdhqq8s.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            remoteViews.setImageViewBitmap(R.id.icon, createColoredBitmap(this.PlaybackStateCompatCustomAction.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, 0));
            if (z && this.PlaybackStateCompatCustomAction.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.icon != 0) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_right_icon_size);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_small_icon_background_padding);
                getEnterdhqQ8s getenterdhqq8s2 = this.PlaybackStateCompatCustomAction;
                remoteViews.setImageViewBitmap(R.id.right_icon, createIconWithBackground(getenterdhqq8s2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.icon, dimensionPixelSize, dimensionPixelSize - (dimensionPixelSize2 * 2), getenterdhqq8s2.MediaSessionCompatQueueItem));
                remoteViews.setViewVisibility(R.id.right_icon, 0);
            }
        } else if (z && getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.icon != 0) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.notification_large_icon_width);
            int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.notification_big_circle_margin);
            int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.notification_small_icon_size_as_large);
            getEnterdhqQ8s getenterdhqq8s3 = this.PlaybackStateCompatCustomAction;
            remoteViews.setImageViewBitmap(R.id.icon, createIconWithBackground(getenterdhqq8s3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.icon, dimensionPixelSize3 - dimensionPixelSize4, dimensionPixelSize5, getenterdhqq8s3.MediaSessionCompatQueueItem));
        }
        CharSequence charSequence = this.PlaybackStateCompatCustomAction.PlaybackStateCompatCustomAction;
        if (charSequence != null) {
            remoteViews.setTextViewText(R.id.title, charSequence);
        }
        CharSequence charSequence2 = this.PlaybackStateCompatCustomAction.MediaDescriptionCompat;
        boolean z4 = true;
        if (charSequence2 != null) {
            remoteViews.setTextViewText(R.id.text, charSequence2);
            z3 = true;
        } else {
            z3 = false;
        }
        this.PlaybackStateCompatCustomAction.getClass();
        if (this.PlaybackStateCompatCustomAction.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus > 0) {
            if (this.PlaybackStateCompatCustomAction.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus > resources.getInteger(R.integer.status_bar_notification_info_maxnum)) {
                remoteViews.setTextViewText(R.id.info, resources.getString(R.string.status_bar_notification_info_overflow));
            } else {
                remoteViews.setTextViewText(R.id.info, NumberFormat.getIntegerInstance().format(this.PlaybackStateCompatCustomAction.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus));
            }
            remoteViews.setViewVisibility(R.id.info, 0);
            z3 = true;
        } else {
            remoteViews.setViewVisibility(R.id.info, 8);
            z4 = false;
        }
        CharSequence charSequence3 = this.PlaybackStateCompatCustomAction.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (charSequence3 != null) {
            remoteViews.setTextViewText(R.id.text, charSequence3);
            CharSequence charSequence4 = this.PlaybackStateCompatCustomAction.MediaDescriptionCompat;
            if (charSequence4 != null) {
                remoteViews.setTextViewText(R.id.text2, charSequence4);
                remoteViews.setViewVisibility(R.id.text2, 0);
                if (z2) {
                    remoteViews.setTextViewTextSize(R.id.text, 0, resources.getDimensionPixelSize(R.dimen.notification_subtext_size));
                }
                remoteViews.setViewPadding(R.id.line1, 0, 0, 0, 0);
            } else {
                remoteViews.setViewVisibility(R.id.text2, 8);
            }
        }
        getEnterdhqQ8s getenterdhqq8s4 = this.PlaybackStateCompatCustomAction;
        if ((getenterdhqq8s4.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 ? getenterdhqq8s4.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.when : 0L) == 0) {
            if (!z4) {
                i2 = 8;
            }
            remoteViews.setViewVisibility(R.id.right_side, i2);
            remoteViews.setViewVisibility(R.id.line3, z3 ? 0 : 8);
            return remoteViews;
        }
        getenterdhqq8s4.getClass();
        remoteViews.setViewVisibility(R.id.time, 0);
        getEnterdhqQ8s getenterdhqq8s5 = this.PlaybackStateCompatCustomAction;
        remoteViews.setLong(R.id.time, "setTime", getenterdhqq8s5.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 ? getenterdhqq8s5.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.when : 0L);
        i2 = 0;
        remoteViews.setViewVisibility(R.id.right_side, i2);
        remoteViews.setViewVisibility(R.id.line3, z3 ? 0 : 8);
        return remoteViews;
    }

    public void clearCompatExtraKeys(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    public final Bitmap createColoredBitmap(IconCompat iconCompat, int i, int i2) {
        Object obj;
        Resources resourcesForApplication;
        Context context = this.PlaybackStateCompatCustomAction.MediaSessionCompatToken;
        if (iconCompat.PlaybackStateCompatCustomAction == 2 && (obj = iconCompat.IconCompatParcelizer) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4)) {
                    String strSerializer = iconCompat.serializer();
                    if (FWFHelper.fwfDeviceOS.equals(strSerializer)) {
                        resourcesForApplication = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strSerializer, 8192);
                            resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                        } catch (PackageManager.NameNotFoundException e) {
                            SentryLogcatAdapter.read("IconCompat", "Unable to find pkg=" + strSerializer + " for icon", e);
                        }
                    }
                    int identifier = resourcesForApplication.getIdentifier(str4, str3, str5);
                    if (iconCompat.RemoteActionCompatParcelizer != identifier) {
                        iconCompat.RemoteActionCompatParcelizer = identifier;
                    }
                }
            }
        }
        Drawable drawableLoadDrawable = iconCompat.read(context).loadDrawable(context);
        int intrinsicWidth = i2 == 0 ? drawableLoadDrawable.getIntrinsicWidth() : i2;
        if (i2 == 0) {
            i2 = drawableLoadDrawable.getIntrinsicHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
        drawableLoadDrawable.setBounds(0, 0, intrinsicWidth, i2);
        if (i != 0) {
            drawableLoadDrawable.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        drawableLoadDrawable.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public void restoreFromCompatExtras(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.PlaybackStateCompat = bundle.getCharSequence("android.summaryText");
            this.MediaSessionCompatResultReceiverWrapper = true;
        }
        this.MediaSessionCompatToken = bundle.getCharSequence("android.title.big");
    }

    public final Bitmap createIconWithBackground(int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            i4 = 0;
        }
        Context context = this.PlaybackStateCompatCustomAction.MediaSessionCompatToken;
        PorterDuff.Mode mode = IconCompat.write;
        context.getClass();
        Bitmap bitmapCreateColoredBitmap = createColoredBitmap(IconCompat.read(context.getResources(), context.getPackageName(), R.drawable.notification_icon_background), i4, i2);
        Canvas canvas = new Canvas(bitmapCreateColoredBitmap);
        Drawable drawableMutate = this.PlaybackStateCompatCustomAction.MediaSessionCompatToken.getResources().getDrawable(i).mutate();
        drawableMutate.setFilterBitmap(true);
        int i5 = (i2 - i3) / 2;
        int i6 = i3 + i5;
        drawableMutate.setBounds(i5, i5, i6, i6);
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        drawableMutate.draw(canvas);
        return bitmapCreateColoredBitmap;
    }

    public Notification build() {
        getEnterdhqQ8s getenterdhqq8s = this.PlaybackStateCompatCustomAction;
        if (getenterdhqq8s != null) {
            return getenterdhqq8s.write();
        }
        return null;
    }

    public void setBuilder(getEnterdhqQ8s getenterdhqq8s) {
        if (this.PlaybackStateCompatCustomAction != getenterdhqq8s) {
            this.PlaybackStateCompatCustomAction = getenterdhqq8s;
            if (getenterdhqq8s != null) {
                getenterdhqq8s.RemoteActionCompatParcelizer(this);
            }
        }
    }

    public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
        remoteViews.setViewVisibility(R.id.title, 8);
        remoteViews.setViewVisibility(R.id.text2, 8);
        remoteViews.setViewVisibility(R.id.text, 8);
        remoteViews.removeAllViews(R.id.notification_main_column);
        remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
        remoteViews.setViewVisibility(R.id.notification_main_column, 0);
        Resources resources = this.PlaybackStateCompatCustomAction.MediaSessionCompatToken.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
        float f = resources.getConfiguration().fontScale;
        if (f < 1.0f) {
            f = 1.0f;
        } else if (f > 1.3f) {
            f = 1.3f;
        }
        float f2 = (f - 1.0f) / 0.29999995f;
        remoteViews.setViewPadding(R.id.notification_main_column_container, 0, Math.round((dimensionPixelSize2 * f2) + ((1.0f - f2) * dimensionPixelSize)), 0, 0);
    }

    public static NotificationCompat$Style extractStyleFromNotification(Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return null;
        }
        return constructStyleForExtras(bundle);
    }

    public void addCompatExtras(Bundle bundle) {
        if (this.MediaSessionCompatResultReceiverWrapper) {
            bundle.putCharSequence("android.summaryText", this.PlaybackStateCompat);
        }
        CharSequence charSequence = this.MediaSessionCompatToken;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String className = getClassName();
        if (className != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
        }
    }

    public static NotificationCompat$Style constructStyleForExtras(Bundle bundle) {
        NotificationCompat$Style notificationCompat$StyleConstructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
        if (notificationCompat$StyleConstructCompatStyleForBundle == null) {
            return null;
        }
        try {
            notificationCompat$StyleConstructCompatStyleForBundle.restoreFromCompatExtras(bundle);
            return notificationCompat$StyleConstructCompatStyleForBundle;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Bitmap createColoredBitmap(int i, int i2) {
        Context context = this.PlaybackStateCompatCustomAction.MediaSessionCompatToken;
        PorterDuff.Mode mode = IconCompat.write;
        context.getClass();
        return createColoredBitmap(IconCompat.read(context.getResources(), context.getPackageName(), i), i2, 0);
    }

    public Bitmap createColoredBitmap(IconCompat iconCompat, int i) {
        return createColoredBitmap(iconCompat, i, 0);
    }
}
