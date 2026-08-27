package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat$BigPictureStyle;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.app.NotificationCompat$Style;
import androidx.core.graphics.drawable.IconCompat;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.FocusEventElement;
import o.getEnterdhqQ8s;
import o.getExitdhqQ8s;
import o.getPreviousdhqQ8s;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public class BrazeNotificationStyleFactory {
    private static final int BIG_PICTURE_STYLE_IMAGE_HEIGHT = 192;
    public static final Companion Companion = new Companion(null);
    private static final String STORY_SET_GRAVITY = "setGravity";
    private static final String STORY_SET_VISIBILITY = "setVisibility";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$0(String str) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to download image bitmap for big picture notification style. Url: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$1() {
            return "Failed to scale image bitmap, using original.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$2() {
            return "Failed to create Big Picture Style.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$0() {
            return "Reply person does not exist in mapping. Not rendering a style";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$2() {
            return "Failed to create conversation push style. Returning null.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$0() {
            return "Inline Image Push cannot render without a context";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$1() {
            return "Inline Image Push image url invalid";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$2() {
            return "Inline Image Push failed to get image bitmap";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$4() {
            return "Inline Image Push application info was null";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$0() {
            return "Rendering push notification with DecoratedCustomViewStyle (Story)";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$1() {
            return "Rendering conversational push";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$2() {
            return "Rendering push notification with custom inline image style";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$3() {
            return "Rendering push notification with BigPictureStyle";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$4() {
            return "Rendering push notification with BigTextStyle";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getStoryStyle$lambda$0() {
            return "Push story page cannot render without a context";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getStoryStyle$lambda$1() {
            return "Push story page was not populated correctly. Not using DecoratedCustomViewStyle.";
        }

        private final boolean populatePushStoryPage(RemoteViews remoteViews, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(24), 7, (Object) null);
                return false;
            }
            BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(25), 7, (Object) null);
                return false;
            }
            String bitmapUrl = pushStoryPage.getBitmapUrl();
            if (bitmapUrl == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) bitmapUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(27), 7, (Object) null);
                return false;
            }
            Bitmap pushBitmapFromUrl = Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, brazeNotificationPayload.getNotificationExtras(), bitmapUrl, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            if (pushBitmapFromUrl == null) {
                return false;
            }
            remoteViews.setImageViewBitmap(R.id.com_braze_story_image_view, pushBitmapFromUrl);
            String title = pushStoryPage.getTitle();
            if (title == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) title)) {
                remoteViews.setInt(R.id.com_braze_story_text_view_container, BrazeNotificationStyleFactory.STORY_SET_VISIBILITY, 8);
            } else {
                remoteViews.setTextViewText(R.id.com_braze_story_text_view, HtmlUtils.getHtmlSpannedTextIfEnabled(title, configurationProvider));
                remoteViews.setInt(R.id.com_braze_story_text_view_container, BrazeNotificationStyleFactory.STORY_SET_GRAVITY, pushStoryPage.getTitleGravity());
            }
            String subtitle = pushStoryPage.getSubtitle();
            if (subtitle == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) subtitle)) {
                remoteViews.setInt(R.id.com_braze_story_text_view_small_container, BrazeNotificationStyleFactory.STORY_SET_VISIBILITY, 8);
            } else {
                remoteViews.setTextViewText(R.id.com_braze_story_text_view_small, HtmlUtils.getHtmlSpannedTextIfEnabled(subtitle, configurationProvider));
                remoteViews.setInt(R.id.com_braze_story_text_view_small_container, BrazeNotificationStyleFactory.STORY_SET_GRAVITY, pushStoryPage.getSubtitleGravity());
            }
            remoteViews.setOnClickPendingIntent(R.id.com_braze_story_relative_layout, createStoryPageClickedPendingIntent(context, brazeNotificationPayload, pushStoryPage));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$0() {
            return "Push story page cannot render without a context";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$1() {
            return "Push story page cannot render without a configuration provider";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$2() {
            return "Push story page image url invalid";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setStyleIfSupported$lambda$0() {
            return "Setting style for notification";
        }

        public final NotificationCompat$Style getInlineImageStyle(BrazeNotificationPayload brazeNotificationPayload, getEnterdhqQ8s getenterdhqq8s) {
            brazeNotificationPayload.getClass();
            getenterdhqq8s.getClass();
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(17), 7, (Object) null);
                return null;
            }
            String bigImageUrl = brazeNotificationPayload.getBigImageUrl();
            if (bigImageUrl == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) bigImageUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(18), 7, (Object) null);
                return null;
            }
            Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
            Bitmap pushBitmapFromUrl = Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, notificationExtras, bigImageUrl, BrazeViewBounds.NOTIFICATION_INLINE_PUSH_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(19), 7, (Object) null);
                return null;
            }
            boolean zIsRemoteViewNotificationAvailableSpaceConstrained = isRemoteViewNotificationAvailableSpaceConstrained(context);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), zIsRemoteViewNotificationAvailableSpaceConstrained ? R.layout.com_braze_push_inline_image_constrained : R.layout.com_braze_notification_inline_image);
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            Icon iconCreateWithResource = Icon.createWithResource(context, configurationProvider.getSmallNotificationIconResourceId());
            iconCreateWithResource.getClass();
            Integer accentColor = brazeNotificationPayload.getAccentColor();
            if (accentColor != null) {
                iconCreateWithResource.setTint(accentColor.intValue());
            }
            remoteViews.setImageViewIcon(R.id.com_braze_inline_image_push_app_icon, iconCreateWithResource);
            PackageManager packageManager = context.getPackageManager();
            try {
                ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(0L)) : packageManager.getApplicationInfo(context.getPackageName(), 0);
                applicationInfo.getClass();
                CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                applicationLabel.getClass();
                remoteViews.setTextViewText(R.id.com_braze_inline_image_push_app_name_text, HtmlUtils.getHtmlSpannedTextIfEnabled((String) applicationLabel, configurationProvider));
                remoteViews.setTextViewText(R.id.com_braze_inline_image_push_time_text, DateTimeUtils.formatDateNow(BrazeDateFormat.CLOCK_12_HOUR));
                String string = notificationExtras.getString(Constants.BRAZE_PUSH_TITLE_KEY);
                if (string != null) {
                    remoteViews.setTextViewText(R.id.com_braze_inline_image_push_title_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string, configurationProvider));
                }
                String string2 = notificationExtras.getString(Constants.BRAZE_PUSH_CONTENT_KEY);
                if (string2 != null) {
                    remoteViews.setTextViewText(R.id.com_braze_inline_image_push_content_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string2, configurationProvider));
                }
                getenterdhqq8s.PlaybackStateCompat = remoteViews;
                if (!zIsRemoteViewNotificationAvailableSpaceConstrained) {
                    remoteViews.setImageViewBitmap(R.id.com_braze_inline_image_push_side_image, pushBitmapFromUrl);
                    return new NoOpSentinelStyle();
                }
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.IconCompatParcelizer = pushBitmapFromUrl;
                getenterdhqq8s.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = iconCompat;
                return new getPreviousdhqQ8s();
            } catch (PackageManager.NameNotFoundException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(20), 4, (Object) null);
                return null;
            }
        }

        public final NotificationCompat$BigPictureStyle getBigPictureNotificationStyle(BrazeNotificationPayload brazeNotificationPayload) {
            String bigImageUrl;
            IconCompat iconCompat;
            brazeNotificationPayload.getClass();
            Context context = brazeNotificationPayload.getContext();
            if (context == null || (bigImageUrl = brazeNotificationPayload.getBigImageUrl()) == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) bigImageUrl)) {
                return null;
            }
            Bitmap pushBitmapFromUrl = Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, brazeNotificationPayload.getNotificationExtras(), bigImageUrl, BrazeViewBounds.NOTIFICATION_EXPANDED_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(bigImageUrl, 12), 7, (Object) null);
                return null;
            }
            try {
                if (pushBitmapFromUrl.getWidth() > pushBitmapFromUrl.getHeight()) {
                    int pixelsFromDensityAndDp = BrazeImageUtils.getPixelsFromDensityAndDp(BrazeImageUtils.getDensityDpi(context), BrazeNotificationStyleFactory.BIG_PICTURE_STYLE_IMAGE_HEIGHT);
                    int i = pixelsFromDensityAndDp * 2;
                    int displayWidthPixels = BrazeImageUtils.getDisplayWidthPixels(context);
                    if (i > displayWidthPixels) {
                        i = displayWidthPixels;
                    }
                    try {
                        pushBitmapFromUrl = Bitmap.createScaledBitmap(pushBitmapFromUrl, i, pixelsFromDensityAndDp, true);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(26), 4, (Object) null);
                    }
                }
                NotificationCompat$BigPictureStyle notificationCompat$BigPictureStyle = new NotificationCompat$BigPictureStyle();
                if (pushBitmapFromUrl == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.IconCompatParcelizer = pushBitmapFromUrl;
                }
                notificationCompat$BigPictureStyle.IconCompatParcelizer = iconCompat;
                setBigPictureSummaryAndTitle(notificationCompat$BigPictureStyle, brazeNotificationPayload);
                return notificationCompat$BigPictureStyle;
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(28), 4, (Object) null);
                return null;
            }
        }

        public final NotificationCompat$MessagingStyle getConversationalPushStyle(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
            getenterdhqq8s.getClass();
            brazeNotificationPayload.getClass();
            int i = 1;
            try {
                Map<String, BrazeNotificationPayload.ConversationPerson> conversationPersonMap = brazeNotificationPayload.getConversationPersonMap();
                BrazeNotificationPayload.ConversationPerson conversationPerson = conversationPersonMap.get(brazeNotificationPayload.getConversationReplyPersonId());
                if (conversationPerson == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(29), 7, (Object) null);
                    return null;
                }
                NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(conversationPerson.getPerson());
                Iterator<BrazeNotificationPayload.ConversationMessage> it = brazeNotificationPayload.getConversationMessages().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        notificationCompat$MessagingStyle.read = Boolean.valueOf(conversationPersonMap.size() > 1);
                        getenterdhqq8s.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = brazeNotificationPayload.getConversationShortcutId();
                        return notificationCompat$MessagingStyle;
                    }
                    BrazeNotificationPayload.ConversationMessage next = it.next();
                    BrazeNotificationPayload.ConversationPerson conversationPerson2 = conversationPersonMap.get(next.getPersonId());
                    if (conversationPerson2 == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda7(4, next), 7, (Object) null);
                        return null;
                    }
                    FocusEventElement focusEventElement = new FocusEventElement(next.getMessage(), next.getTimestamp(), conversationPerson2.getPerson());
                    ArrayList arrayList = notificationCompat$MessagingStyle.RemoteActionCompatParcelizer;
                    arrayList.add(focusEventElement);
                    if (arrayList.size() > 25) {
                        arrayList.remove(0);
                    }
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(i), 4, (Object) null);
                return null;
            }
        }

        public final NotificationCompat$Style getNotificationStyle(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
            NotificationCompat$Style bigPictureNotificationStyle;
            getenterdhqq8s.getClass();
            brazeNotificationPayload.getClass();
            if (brazeNotificationPayload.isPushStory() && brazeNotificationPayload.getContext() != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(2), 7, (Object) null);
                bigPictureNotificationStyle = getStoryStyle(getenterdhqq8s, brazeNotificationPayload);
            } else if (brazeNotificationPayload.isConversationalPush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(3), 7, (Object) null);
                bigPictureNotificationStyle = getConversationalPushStyle(getenterdhqq8s, brazeNotificationPayload);
            } else if (brazeNotificationPayload.getBigImageUrl() == null) {
                bigPictureNotificationStyle = null;
            } else if (brazeNotificationPayload.isInlineImagePush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(4), 7, (Object) null);
                bigPictureNotificationStyle = getInlineImageStyle(brazeNotificationPayload, getenterdhqq8s);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(5), 7, (Object) null);
                bigPictureNotificationStyle = getBigPictureNotificationStyle(brazeNotificationPayload);
            }
            if (bigPictureNotificationStyle != null) {
                return bigPictureNotificationStyle;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(16), 7, (Object) null);
            return getBigTextNotificationStyle(brazeNotificationPayload);
        }

        public final getPreviousdhqQ8s getStoryStyle(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
            getenterdhqq8s.getClass();
            brazeNotificationPayload.getClass();
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(22), 7, (Object) null);
                return null;
            }
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = brazeNotificationPayload.getPushStoryPages();
            int pushStoryPageIndex = brazeNotificationPayload.getPushStoryPageIndex();
            BrazeNotificationPayload.PushStoryPage pushStoryPage = pushStoryPages.get(pushStoryPageIndex);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.com_braze_push_story_one_image);
            if (!populatePushStoryPage(remoteViews, brazeNotificationPayload, pushStoryPage)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(23), 6, (Object) null);
                return null;
            }
            Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
            getPreviousdhqQ8s getpreviousdhqq8s = new getPreviousdhqQ8s();
            int size = pushStoryPages.size();
            remoteViews.setOnClickPendingIntent(R.id.com_braze_story_button_previous, createStoryTraversedPendingIntent(context, notificationExtras, ((pushStoryPageIndex - 1) + size) % size));
            remoteViews.setOnClickPendingIntent(R.id.com_braze_story_button_next, createStoryTraversedPendingIntent(context, notificationExtras, (pushStoryPageIndex + 1) % size));
            getenterdhqq8s.IconCompatParcelizer = remoteViews;
            getenterdhqq8s.write(8, true);
            return getpreviousdhqq8s;
        }

        public final void setBigPictureSummaryAndTitle(NotificationCompat$BigPictureStyle notificationCompat$BigPictureStyle, BrazeNotificationPayload brazeNotificationPayload) {
            String contentText;
            notificationCompat$BigPictureStyle.getClass();
            brazeNotificationPayload.getClass();
            BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider == null) {
                return;
            }
            String bigSummaryText = brazeNotificationPayload.getBigSummaryText();
            String bigTitleText = brazeNotificationPayload.getBigTitleText();
            String summaryText = brazeNotificationPayload.getSummaryText();
            if (bigSummaryText != null) {
                notificationCompat$BigPictureStyle.write(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
            }
            if (bigTitleText != null) {
                notificationCompat$BigPictureStyle.read(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
            }
            if (summaryText == null && bigSummaryText == null && (contentText = brazeNotificationPayload.getContentText()) != null) {
                notificationCompat$BigPictureStyle.write(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
            }
        }

        public final void setStyleIfSupported(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
            getenterdhqq8s.getClass();
            brazeNotificationPayload.getClass();
            NotificationCompat$Style notificationStyle = getNotificationStyle(getenterdhqq8s, brazeNotificationPayload);
            if (notificationStyle instanceof NoOpSentinelStyle) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(21), 7, (Object) null);
            getenterdhqq8s.RemoteActionCompatParcelizer(notificationStyle);
        }

        private Companion() {
        }

        private final PendingIntent createStoryPageClickedPendingIntent(Context context, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Intent intent = new Intent(Constants.BRAZE_STORY_CLICKED_ACTION).setClass(context, NotificationTrampolineActivity.class);
            intent.getClass();
            intent.setFlags(intent.getFlags() | BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK));
            intent.putExtras(brazeNotificationPayload.getNotificationExtras());
            intent.putExtra(Constants.BRAZE_ACTION_URI_KEY, pushStoryPage.getDeeplink());
            intent.putExtra(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY, pushStoryPage.getUseWebview());
            intent.putExtra(Constants.BRAZE_STORY_PAGE_ID, pushStoryPage.getStoryPageId());
            intent.putExtra(Constants.BRAZE_CAMPAIGN_ID, pushStoryPage.getCampaignId());
            intent.putExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, BrazeNotificationUtils.getNotificationId(brazeNotificationPayload));
            PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags());
            activity.getClass();
            return activity;
        }

        private final PendingIntent createStoryTraversedPendingIntent(Context context, Bundle bundle, int i) {
            Intent intent = new Intent(Constants.BRAZE_STORY_TRAVERSE_CLICKED_ACTION).setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            intent.getClass();
            if (bundle != null) {
                bundle.putInt(Constants.BRAZE_STORY_INDEX_KEY, i);
                intent.putExtras(bundle);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824);
            broadcast.getClass();
            return broadcast;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$1(BrazeNotificationPayload.ConversationMessage conversationMessage) {
            return "Message person does not exist in mapping. Not rendering a style. " + conversationMessage;
        }

        public final getExitdhqQ8s getBigTextNotificationStyle(BrazeNotificationPayload brazeNotificationPayload) {
            CharSequence htmlSpannedTextIfEnabled;
            brazeNotificationPayload.getClass();
            getExitdhqQ8s getexitdhqq8s = new getExitdhqQ8s(0);
            BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider != null) {
                String contentText = brazeNotificationPayload.getContentText();
                if (contentText != null && (htmlSpannedTextIfEnabled = HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider)) != null) {
                    getexitdhqq8s.write(htmlSpannedTextIfEnabled);
                }
                String bigSummaryText = brazeNotificationPayload.getBigSummaryText();
                if (bigSummaryText != null) {
                    getexitdhqq8s.IconCompatParcelizer(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
                }
                String bigTitleText = brazeNotificationPayload.getBigTitleText();
                if (bigTitleText != null) {
                    getexitdhqq8s.serializer(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
                }
            }
            return getexitdhqq8s;
        }

        private final boolean isRemoteViewNotificationAvailableSpaceConstrained(Context context) {
            return Build.VERSION.SDK_INT >= 31 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 31;
        }
    }

    public static final class NoOpSentinelStyle extends NotificationCompat$Style {
    }

    public static final void setBigPictureSummaryAndTitle(NotificationCompat$BigPictureStyle notificationCompat$BigPictureStyle, BrazeNotificationPayload brazeNotificationPayload) {
        Companion.setBigPictureSummaryAndTitle(notificationCompat$BigPictureStyle, brazeNotificationPayload);
    }

    public static final void setStyleIfSupported(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        Companion.setStyleIfSupported(getenterdhqq8s, brazeNotificationPayload);
    }
}
