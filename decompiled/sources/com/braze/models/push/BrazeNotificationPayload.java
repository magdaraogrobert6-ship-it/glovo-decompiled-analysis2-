package com.braze.models.push;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.Person;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.support.JsonUtils;
import com.braze.support.JsonUtils$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeNotificationPayload {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_PUSH_DELIVERY_MAX_FLUSH = 120;
    public static final long DEFAULT_PUSH_DELIVERY_MIN_FLUSH = 5;
    private Integer accentColor;
    private List<ActionButton> actionButtonsInternal;
    private String bigImageUrl;
    private String bigSummaryText;
    private String bigTitleText;
    private Bundle brazeExtras;
    private String campaignId;
    private BrazeConfigurationProvider configurationProvider;
    private String contentCardSyncData;
    private String contentCardSyncUserId;
    private String contentText;
    private Context context;
    private final List<ConversationMessage> conversationMessagesInternal;
    private final Map<String, ConversationPerson> conversationPersonMapInternal;
    private String conversationReplyPersonId;
    private String conversationShortcutId;
    private Integer customNotificationId;
    private String deeplink;
    private Map<String, String> extras;
    private long flushMaxMinutes;
    private long flushMinMinutes;
    private boolean isConversationalPush;
    private boolean isInlineImagePush;
    private boolean isNewlyReceivedPushStory;
    private boolean isPushDeliveryEnabled;
    private boolean isPushStory;
    private boolean isUninstallTrackingPush;
    private String largeIcon;
    private Integer notificationBadgeNumber;
    private String notificationCategory;
    private String notificationChannelId;
    private final Bundle notificationExtras;
    private Integer notificationPriorityInt;
    private Long notificationReceivedTimestampMillis;
    private String notificationSound;
    private Integer notificationVisibility;
    private String publicNotificationExtras;
    private Integer pushDuration;
    private int pushStoryPageIndex;
    private List<PushStoryPage> pushStoryPagesInternal;
    private String pushUniqueId;
    private boolean shouldFetchTestTriggers;
    private boolean shouldRefreshBanners;
    private boolean shouldRefreshFeatureFlags;
    private String summaryText;
    private String titleText;
    private Boolean useWebView;

    public static final class ActionButton {
        private String actionId;
        private int actionIndex;
        private String text;
        private String type;
        private String uri;
        private String useWebview;

        public final String getActionId() {
            return this.actionId;
        }

        public final int getActionIndex() {
            return this.actionIndex;
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUri() {
            return this.uri;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public final void setActionId(String str) {
            this.actionId = str;
        }

        public final void setActionIndex(int i) {
            this.actionIndex = i;
        }

        public final void setText(String str) {
            this.text = str;
        }

        public final void setType(String str) {
            this.type = str;
        }

        public final void setUri(String str) {
            this.uri = str;
        }

        public final void setUseWebview(String str) {
            this.useWebview = str;
        }

        public String toString() {
            Companion companion = BrazeNotificationPayload.Companion;
            return companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex)) + companion.stringAndKey("Type", this.type) + companion.stringAndKey("Id", this.actionId) + companion.stringAndKey("Uri", this.uri) + companion.stringAndKey("UseWebview", this.useWebview) + companion.stringAndKey("Text", this.text);
        }

        public ActionButton(Bundle bundle, int i) {
            bundle.getClass();
            this.actionIndex = i;
            Companion companion = BrazeNotificationPayload.Companion;
            this.type = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_PUSH_ACTION_TYPE_KEY_TEMPLATE);
            this.actionId = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_ACTION_ID_KEY_TEMPLATE);
            this.uri = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_ACTION_URI_KEY_TEMPLATE);
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_ACTION_USE_WEBVIEW_KEY_TEMPLATE);
            this.text = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_ACTION_TEXT_KEY_TEMPLATE);
        }

        public final void putIntoBundle(Bundle bundle) {
            bundle.getClass();
            bundle.putInt(Constants.BRAZE_ACTION_INDEX_KEY, this.actionIndex);
            bundle.putString(Constants.BRAZE_ACTION_TYPE_KEY, this.type);
            bundle.putString(Constants.BRAZE_ACTION_ID_KEY, this.actionId);
            bundle.putString(Constants.BRAZE_ACTION_URI_KEY, this.uri);
            bundle.putString(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY, this.useWebview);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDEFAULT_PUSH_DELIVERY_MAX_FLUSH$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getDEFAULT_PUSH_DELIVERY_MIN_FLUSH$android_sdk_base_release$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getTemplateFieldAtIndex$lambda$0() {
            return "Failed to parse action field boolean. Returning default.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getTemplateFieldAtIndex$lambda$1() {
            return "Failed to parse action field long. Returning default.";
        }

        public final int getPushStoryGravityAtIndex(int i, Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            String string = bundle.getString(setCarryoverInAppMessage.write(str, "*", String.valueOf(i)));
            if (string == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string)) {
                return 17;
            }
            int iHashCode = string.hashCode();
            if (iHashCode == -1364013995) {
                string.equals("center");
                return 17;
            }
            if (iHashCode != 100571) {
                return (iHashCode == 109757538 && string.equals("start")) ? 8388611 : 17;
            }
            return !string.equals("end") ? 17 : 8388613;
        }

        public final boolean getTemplateFieldAtIndex(int i, Bundle bundle, String str, boolean z) {
            bundle.getClass();
            str.getClass();
            String string = bundle.getString(setCarryoverInAppMessage.write(str, "*", String.valueOf(i)));
            if (string == null) {
                return z;
            }
            try {
                return Boolean.parseBoolean(string);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(14), 4, (Object) null);
                return z;
            }
        }

        public final Long parseLong(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            try {
                if (bundle.containsKey(str)) {
                    return Long.valueOf(bundle.getLong(str));
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationPayload$Companion$$ExternalSyntheticLambda0(3, bundle, str), 7, (Object) null);
                return null;
            }
        }

        public final String parseNonBlankString(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            try {
                String string = parseString(bundle, str);
                if (string == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string)) {
                    return null;
                }
                return string;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationPayload$Companion$$ExternalSyntheticLambda0(6, bundle, str), 7, (Object) null);
                return null;
            }
        }

        public final int parseObjectAsInteger(Bundle bundle, String str, int i) {
            Object obj;
            bundle.getClass();
            str.getClass();
            try {
                return (!bundle.containsKey(str) || (obj = bundle.get(str)) == null) ? i : Integer.parseInt(obj.toString());
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationPayload$Companion$$ExternalSyntheticLambda0(0, bundle, str), 7, (Object) null);
                return i;
            }
        }

        public final String parseString(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            try {
                if (bundle.containsKey(str)) {
                    return bundle.getString(str);
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationPayload$Companion$$ExternalSyntheticLambda0(4, bundle, str), 7, (Object) null);
                return null;
            }
        }

        public final boolean parseStringAsBoolean(Bundle bundle, String str) {
            String string;
            bundle.getClass();
            str.getClass();
            try {
                if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                    return false;
                }
                return Boolean.parseBoolean(string);
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationPayload$Companion$$ExternalSyntheticLambda0(5, bundle, str), 7, (Object) null);
                return false;
            }
        }

        public final Integer parseStringAsColorInt(Bundle bundle, String str) {
            String string;
            bundle.getClass();
            str.getClass();
            try {
                if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                    return null;
                }
                return Integer.valueOf((int) Long.parseLong(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationPayload$Companion$$ExternalSyntheticLambda0(2, bundle, str), 7, (Object) null);
                return null;
            }
        }

        public final Integer parseStringAsInteger(Bundle bundle, String str) {
            String string;
            bundle.getClass();
            str.getClass();
            try {
                if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                    return null;
                }
                return Integer.valueOf(Integer.parseInt(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationPayload$Companion$$ExternalSyntheticLambda0(7, bundle, str), 7, (Object) null);
                return null;
            }
        }

        public final Long parseStringAsLong(Bundle bundle, String str) {
            String string;
            bundle.getClass();
            str.getClass();
            try {
                if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                    return null;
                }
                return Long.valueOf(Long.parseLong(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationPayload$Companion$$ExternalSyntheticLambda0(1, bundle, str), 7, (Object) null);
                return null;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseLong$lambda$0(String str, Bundle bundle) {
            return "Failed to parse long with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseNonBlankString$lambda$0(String str, Bundle bundle) {
            return "Failed to parse non blank string with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseObjectAsInteger$lambda$1(String str, Bundle bundle) {
            return "Failed to parse string as int with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseString$lambda$0(String str, Bundle bundle) {
            return "Failed to parse string with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseStringAsBoolean$lambda$1(String str, Bundle bundle) {
            return "Failed to parse string as boolean with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseStringAsColorInt$lambda$1(String str, Bundle bundle) {
            return "Failed to parse string as color int with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseStringAsInteger$lambda$1(String str, Bundle bundle) {
            return "Failed to parse string as int with key " + str + " and bundle: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseStringAsLong$lambda$1(String str, Bundle bundle) {
            return "Failed to parse string as long with key " + str + " and bundle: " + bundle;
        }

        public final Bundle getAttachedBrazeExtras(Bundle bundle) {
            if (bundle == null) {
                return new Bundle();
            }
            if (bundle.containsKey(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED) && !bundle.getBoolean(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED)) {
                Bundle bundle2 = bundle.getBundle(Constants.BRAZE_PUSH_EXTRAS_KEY);
                return bundle2 == null ? new Bundle() : bundle2;
            }
            if (Constants.isAmazonDevice()) {
                return new Bundle(bundle);
            }
            Object obj = bundle.get(Constants.BRAZE_PUSH_EXTRAS_KEY);
            if (obj instanceof String) {
                return JsonUtils.parseJsonObjectIntoBundle((String) obj);
            }
            if (obj instanceof Bundle) {
                return (Bundle) obj;
            }
            return new Bundle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String stringAndKey(String str, Object obj) {
            if (obj != null) {
                return "\n" + str + " = " + obj;
            }
            return "";
        }

        public final String getTemplateFieldAtIndex(int i, Bundle bundle, String str, String str2) {
            bundle.getClass();
            str.getClass();
            String string = bundle.getString(setCarryoverInAppMessage.write(str, "*", String.valueOf(i)));
            return string == null ? str2 : string;
        }

        public final String getTemplateFieldAtIndex(int i, Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            return getTemplateFieldAtIndex(i, bundle, str, "");
        }

        public final long getTemplateFieldAtIndex(int i, Bundle bundle, String str, long j) {
            bundle.getClass();
            str.getClass();
            String string = bundle.getString(setCarryoverInAppMessage.write(str, "*", String.valueOf(i)));
            if (string == null) {
                return j;
            }
            try {
                return Long.parseLong(string);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(13), 4, (Object) null);
                return j;
            }
        }
    }

    public static final class ConversationMessage {
        private final String message;
        private final String personId;
        private final long timestamp;

        public final String getMessage() {
            return this.message;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public String toString() {
            Companion companion = BrazeNotificationPayload.Companion;
            return af$$ExternalSyntheticOutline0.m(companion.stringAndKey("Message", this.message), companion.stringAndKey("Timestamp", Long.valueOf(this.timestamp)), companion.stringAndKey("PersonId", this.personId));
        }

        public ConversationMessage(Bundle bundle, int i) {
            bundle.getClass();
            Companion companion = BrazeNotificationPayload.Companion;
            this.message = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE);
            this.timestamp = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TIMESTAMP_TEMPLATE, 0L);
            this.personId = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_PERSON_ID_TEMPLATE);
        }
    }

    public static final class ConversationPerson {
        private final boolean isBot;
        private final boolean isImportant;
        private final String name;
        private final String personId;
        private final String uri;

        public final String getName() {
            return this.name;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final String getUri() {
            return this.uri;
        }

        public final boolean isBot() {
            return this.isBot;
        }

        public final boolean isImportant() {
            return this.isImportant;
        }

        public final Person getPerson() {
            String str = this.personId;
            String str2 = this.name;
            String str3 = this.uri;
            boolean z = this.isBot;
            boolean z2 = this.isImportant;
            Person person = new Person();
            person.write = str2;
            person.read = null;
            person.MediaDescriptionCompat = str3;
            person.serializer = str;
            person.RemoteActionCompatParcelizer = z;
            person.IconCompatParcelizer = z2;
            return person;
        }

        public String toString() {
            Companion companion = BrazeNotificationPayload.Companion;
            return companion.stringAndKey("PersonId", this.personId) + companion.stringAndKey("Name", this.name) + companion.stringAndKey("Uri", this.uri) + companion.stringAndKey("IsImportant", Boolean.valueOf(this.isImportant)) + companion.stringAndKey("IsBot", Boolean.valueOf(this.isBot));
        }

        public ConversationPerson(Bundle bundle, int i) {
            bundle.getClass();
            Companion companion = BrazeNotificationPayload.Companion;
            this.personId = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE);
            this.name = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_NAME_TEMPLATE);
            this.uri = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_URI_TEMPLATE, (String) null);
            this.isImportant = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_IMPORTANT_TEMPLATE, false);
            this.isBot = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_BOT_TEMPLATE, false);
        }
    }

    public static final class PushStoryPage {
        private int actionIndex;
        private String bitmapUrl;
        private final String campaignId;
        private String deeplink;
        private String storyPageId;
        private String subtitle;
        private int subtitleGravity;
        private String title;
        private int titleGravity;
        private String useWebview;

        public final int getActionIndex() {
            return this.actionIndex;
        }

        public final String getBitmapUrl() {
            return this.bitmapUrl;
        }

        public final String getCampaignId() {
            return this.campaignId;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getStoryPageId() {
            return this.storyPageId;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final int getSubtitleGravity() {
            return this.subtitleGravity;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getTitleGravity() {
            return this.titleGravity;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public final void setActionIndex(int i) {
            this.actionIndex = i;
        }

        public final void setBitmapUrl(String str) {
            this.bitmapUrl = str;
        }

        public final void setDeeplink(String str) {
            this.deeplink = str;
        }

        public final void setStoryPageId(String str) {
            this.storyPageId = str;
        }

        public final void setSubtitle(String str) {
            this.subtitle = str;
        }

        public final void setSubtitleGravity(int i) {
            this.subtitleGravity = i;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final void setTitleGravity(int i) {
            this.titleGravity = i;
        }

        public final void setUseWebview(String str) {
            this.useWebview = str;
        }

        public String toString() {
            Companion companion = BrazeNotificationPayload.Companion;
            String strStringAndKey = companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex));
            String strStringAndKey2 = companion.stringAndKey("CampaignId", this.campaignId);
            String strStringAndKey3 = companion.stringAndKey("Title", this.title);
            String strStringAndKey4 = companion.stringAndKey("TitleGravity", Integer.valueOf(this.titleGravity));
            String strStringAndKey5 = companion.stringAndKey("Subtitle", this.subtitle);
            String strStringAndKey6 = companion.stringAndKey("SubtitleGravity=", Integer.valueOf(this.subtitleGravity));
            String strStringAndKey7 = companion.stringAndKey("BitmapUrl", this.bitmapUrl);
            String strStringAndKey8 = companion.stringAndKey("StoryPageId", this.storyPageId);
            String strStringAndKey9 = companion.stringAndKey("Deeplink", this.deeplink);
            String strStringAndKey10 = companion.stringAndKey("UseWebview", this.useWebview);
            StringBuilder sb = new StringBuilder();
            sb.append(strStringAndKey);
            sb.append(strStringAndKey2);
            sb.append(strStringAndKey3);
            sb.append(strStringAndKey4);
            sb.append(strStringAndKey5);
            c8$$ExternalSyntheticOutline0.m(sb, strStringAndKey6, strStringAndKey7, strStringAndKey8, strStringAndKey9);
            sb.append(strStringAndKey10);
            return sb.toString();
        }

        public PushStoryPage(Bundle bundle, int i) {
            bundle.getClass();
            this.actionIndex = i;
            Companion companion = BrazeNotificationPayload.Companion;
            this.campaignId = companion.parseString(bundle, Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
            this.title = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_TITLE_KEY_TEMPLATE);
            this.titleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_TITLE_JUSTIFICATION_KEY_TEMPLATE);
            this.subtitle = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_SUBTITLE_KEY_TEMPLATE);
            this.subtitleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_SUBTITLE_JUSTIFICATION_KEY_TEMPLATE);
            this.bitmapUrl = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            this.storyPageId = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_ID_KEY_TEMPLATE, "");
            this.deeplink = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_DEEP_LINK_KEY_TEMPLATE);
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.BRAZE_PUSH_STORY_USE_WEBVIEW_KEY_TEMPLATE);
        }
    }

    public static /* synthetic */ void getCampaignId$annotations() {
    }

    public static /* synthetic */ void getFlushMaxMinutes$annotations() {
    }

    public static /* synthetic */ void getFlushMinMinutes$annotations() {
    }

    public static /* synthetic */ void isPushDeliveryEnabled$annotations() {
    }

    public final Integer getAccentColor() {
        return this.accentColor;
    }

    public final List<ActionButton> getActionButtons() {
        return this.actionButtonsInternal;
    }

    public final String getBigImageUrl() {
        return this.bigImageUrl;
    }

    public final String getBigSummaryText() {
        return this.bigSummaryText;
    }

    public final String getBigTitleText() {
        return this.bigTitleText;
    }

    public final Bundle getBrazeExtras() {
        return this.brazeExtras;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    public final String getContentCardSyncData() {
        return this.contentCardSyncData;
    }

    public final String getContentCardSyncUserId() {
        return this.contentCardSyncUserId;
    }

    public final String getContentText() {
        return this.contentText;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<ConversationMessage> getConversationMessages() {
        return this.conversationMessagesInternal;
    }

    public final Map<String, ConversationPerson> getConversationPersonMap() {
        return this.conversationPersonMapInternal;
    }

    public final String getConversationReplyPersonId() {
        return this.conversationReplyPersonId;
    }

    public final String getConversationShortcutId() {
        return this.conversationShortcutId;
    }

    public final Integer getCustomNotificationId() {
        return this.customNotificationId;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final long getFlushMaxMinutes() {
        return this.flushMaxMinutes;
    }

    public final long getFlushMinMinutes() {
        return this.flushMinMinutes;
    }

    public final String getLargeIcon() {
        return this.largeIcon;
    }

    public final Integer getNotificationBadgeNumber() {
        return this.notificationBadgeNumber;
    }

    public final String getNotificationCategory() {
        return this.notificationCategory;
    }

    public final String getNotificationChannelId() {
        return this.notificationChannelId;
    }

    public final Bundle getNotificationExtras() {
        return this.notificationExtras;
    }

    public final Integer getNotificationPriorityInt() {
        return this.notificationPriorityInt;
    }

    public final Long getNotificationReceivedTimestampMillis() {
        return this.notificationReceivedTimestampMillis;
    }

    public final String getNotificationSound() {
        return this.notificationSound;
    }

    public final Integer getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public final String getPublicNotificationExtras() {
        return this.publicNotificationExtras;
    }

    public final Integer getPushDuration() {
        return this.pushDuration;
    }

    public final int getPushStoryPageIndex() {
        return this.pushStoryPageIndex;
    }

    public final List<PushStoryPage> getPushStoryPages() {
        return this.pushStoryPagesInternal;
    }

    public final String getPushUniqueId() {
        return this.pushUniqueId;
    }

    public final boolean getShouldFetchTestTriggers() {
        return this.shouldFetchTestTriggers;
    }

    public final boolean getShouldRefreshBanners() {
        return this.shouldRefreshBanners;
    }

    public final boolean getShouldRefreshFeatureFlags() {
        return this.shouldRefreshFeatureFlags;
    }

    public final String getSummaryText() {
        return this.summaryText;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final Boolean getUseWebView() {
        return this.useWebView;
    }

    public final boolean isConversationalPush() {
        return this.isConversationalPush;
    }

    public final boolean isInlineImagePush() {
        return this.isInlineImagePush;
    }

    public final boolean isNewlyReceivedPushStory() {
        return this.isNewlyReceivedPushStory;
    }

    public final boolean isPushDeliveryEnabled() {
        return this.isPushDeliveryEnabled;
    }

    public final boolean isPushStory() {
        return this.isPushStory;
    }

    public final boolean isUninstallTrackingPush() {
        return this.isUninstallTrackingPush;
    }

    public final void setAccentColor(Integer num) {
        this.accentColor = num;
    }

    public final void setBigImageUrl(String str) {
        this.bigImageUrl = str;
    }

    public final void setBigSummaryText(String str) {
        this.bigSummaryText = str;
    }

    public final void setBigTitleText(String str) {
        this.bigTitleText = str;
    }

    public final void setCampaignId(String str) {
        this.campaignId = str;
    }

    public final void setConfigurationProvider(BrazeConfigurationProvider brazeConfigurationProvider) {
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setContentCardSyncData(String str) {
        this.contentCardSyncData = str;
    }

    public final void setContentCardSyncUserId(String str) {
        this.contentCardSyncUserId = str;
    }

    public final void setContentText(String str) {
        this.contentText = str;
    }

    public final void setContext(Context context) {
        this.context = context;
    }

    public final void setConversationShortcutId(String str) {
        this.conversationShortcutId = str;
    }

    public final void setConversationalPush(boolean z) {
        this.isConversationalPush = z;
    }

    public final void setCustomNotificationId(Integer num) {
        this.customNotificationId = num;
    }

    public final void setDeeplink(String str) {
        this.deeplink = str;
    }

    public final void setFlushMaxMinutes(long j) {
        this.flushMaxMinutes = j;
    }

    public final void setFlushMinMinutes(long j) {
        this.flushMinMinutes = j;
    }

    public final void setInlineImagePush(boolean z) {
        this.isInlineImagePush = z;
    }

    public final void setIsInlineImagePush(boolean z) {
        this.isInlineImagePush = z;
    }

    public final void setLargeIcon(String str) {
        this.largeIcon = str;
    }

    public final void setNewlyReceivedPushStory(boolean z) {
        this.isNewlyReceivedPushStory = z;
    }

    public final void setNotificationBadgeNumber(Integer num) {
        this.notificationBadgeNumber = num;
    }

    public final void setNotificationCategory(String str) {
        this.notificationCategory = str;
    }

    public final void setNotificationChannelId(String str) {
        this.notificationChannelId = str;
    }

    public final void setNotificationPriorityInt(Integer num) {
        this.notificationPriorityInt = num;
    }

    public final void setNotificationReceivedTimestampMillis(Long l) {
        this.notificationReceivedTimestampMillis = l;
    }

    public final void setNotificationSound(String str) {
        this.notificationSound = str;
    }

    public final void setNotificationVisibility(Integer num) {
        this.notificationVisibility = num;
    }

    public final void setPublicNotificationExtras(String str) {
        this.publicNotificationExtras = str;
    }

    public final void setPushDeliveryEnabled(boolean z) {
        this.isPushDeliveryEnabled = z;
    }

    public final void setPushDuration(Integer num) {
        this.pushDuration = num;
    }

    public final void setPushStory(boolean z) {
        this.isPushStory = z;
    }

    public final void setPushStoryPageIndex(int i) {
        this.pushStoryPageIndex = i;
    }

    public final void setPushUniqueId(String str) {
        this.pushUniqueId = str;
    }

    public final void setShouldFetchTestTriggers(boolean z) {
        this.shouldFetchTestTriggers = z;
    }

    public final void setShouldRefreshBanners(boolean z) {
        this.shouldRefreshBanners = z;
    }

    public final void setShouldRefreshFeatureFlags(boolean z) {
        this.shouldRefreshFeatureFlags = z;
    }

    public final void setSummaryText(String str) {
        this.summaryText = str;
    }

    public final void setTitleText(String str) {
        this.titleText = str;
    }

    public final void setUninstallTrackingPush(boolean z) {
        this.isUninstallTrackingPush = z;
    }

    public final void setUseWebView(Boolean bool) {
        this.useWebView = bool;
    }

    public static final Bundle getAttachedBrazeExtras(Bundle bundle) {
        return Companion.getAttachedBrazeExtras(bundle);
    }

    public static final int getPushStoryGravityAtIndex(int i, Bundle bundle, String str) {
        return Companion.getPushStoryGravityAtIndex(i, bundle, str);
    }

    public static final Long parseLong(Bundle bundle, String str) {
        return Companion.parseLong(bundle, str);
    }

    public static final String parseNonBlankString(Bundle bundle, String str) {
        return Companion.parseNonBlankString(bundle, str);
    }

    public static final int parseObjectAsInteger(Bundle bundle, String str, int i) {
        return Companion.parseObjectAsInteger(bundle, str, i);
    }

    private static final void parsePayloadFieldsFromBundle$parseActionButtons(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.actionButtonsInternal.clear();
        int i = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_ACTION_TYPE_KEY_TEMPLATE);
            if (templateFieldAtIndex == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) templateFieldAtIndex)) {
                return;
            }
            brazeNotificationPayload.actionButtonsInternal.add(new ActionButton(brazeNotificationPayload.notificationExtras, i));
            i++;
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseBigImageStyle(BrazeNotificationPayload brazeNotificationPayload) {
        String str;
        String nonBlankString = Companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_BIG_IMAGE_URL_TOP_LEVEL_KEY);
        brazeNotificationPayload.bigImageUrl = nonBlankString;
        if ((nonBlankString != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) nonBlankString)) || (str = brazeNotificationPayload.extras.get(Constants.BRAZE_PUSH_BIG_IMAGE_URL_KEY)) == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            return;
        }
        brazeNotificationPayload.bigImageUrl = str;
    }

    private static final void parsePayloadFieldsFromBundle$parseBigTextStyle(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.bigSummaryText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_BIG_SUMMARY_TEXT_KEY);
        brazeNotificationPayload.bigTitleText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_BIG_TITLE_TEXT_KEY);
    }

    private static final void parsePayloadFieldsFromBundle$parseContentCardData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.contentCardSyncData = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CONTENT_CARD_SYNC_DATA_KEY);
        brazeNotificationPayload.contentCardSyncUserId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CONTENT_CARD_SYNC_USER_ID_KEY);
    }

    private static final void parsePayloadFieldsFromBundle$parseConversationPushData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.conversationShortcutId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_SHORTCUT_ID_KEY);
        brazeNotificationPayload.conversationReplyPersonId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_REPLY_PERSON_ID_KEY);
        brazeNotificationPayload.conversationMessagesInternal.clear();
        brazeNotificationPayload.conversationPersonMapInternal.clear();
        int i = 0;
        int i2 = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i2, brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE);
            if (templateFieldAtIndex == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) templateFieldAtIndex)) {
                break;
            }
            brazeNotificationPayload.conversationMessagesInternal.add(new ConversationMessage(brazeNotificationPayload.notificationExtras, i2));
            i2++;
        }
        while (true) {
            String templateFieldAtIndex2 = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE);
            if (templateFieldAtIndex2 == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) templateFieldAtIndex2)) {
                return;
            }
            ConversationPerson conversationPerson = new ConversationPerson(brazeNotificationPayload.notificationExtras, i);
            brazeNotificationPayload.conversationPersonMapInternal.put(conversationPerson.getPersonId(), conversationPerson);
            i++;
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseNotificationMetadata(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.pushDuration = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_DURATION_KEY);
        brazeNotificationPayload.isPushStory = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_PUSH_STORY_KEY);
        brazeNotificationPayload.notificationCategory = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CATEGORY_KEY);
        brazeNotificationPayload.notificationVisibility = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_VISIBILITY_KEY);
        brazeNotificationPayload.notificationBadgeNumber = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_BADGE_COUNT_KEY);
        brazeNotificationPayload.publicNotificationExtras = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_PUBLIC_NOTIFICATION_KEY);
        brazeNotificationPayload.customNotificationId = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID);
        brazeNotificationPayload.notificationReceivedTimestampMillis = companion.parseLong(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS);
        brazeNotificationPayload.isInlineImagePush = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_PUSH_INLINE_IMAGE_STYLE_KEY);
        brazeNotificationPayload.isConversationalPush = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_CONVERSATIONAL_PUSH_STYLE_KEY);
        brazeNotificationPayload.notificationPriorityInt = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_PRIORITY_KEY);
        brazeNotificationPayload.shouldFetchTestTriggers = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_FETCH_TEST_TRIGGERS_KEY);
        brazeNotificationPayload.shouldRefreshFeatureFlags = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_REFRESH_FEATURE_FLAGS);
        brazeNotificationPayload.shouldRefreshBanners = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_REFRESH_BANNERS);
        brazeNotificationPayload.isUninstallTrackingPush = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY) || brazeNotificationPayload.brazeExtras.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY);
        brazeNotificationPayload.deeplink = companion.parseString(brazeNotificationPayload.notificationExtras, "uri");
        brazeNotificationPayload.campaignId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
        brazeNotificationPayload.pushUniqueId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_UNIQUE_ID);
        brazeNotificationPayload.useWebView = Boolean.valueOf(companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    private static final void parsePayloadFieldsFromBundle$parsePushDeliveryEventData(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        Companion companion = Companion;
        Integer stringAsInteger = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_DELIVERY_ENABLED_KEY);
        if (stringAsInteger != null) {
            z = stringAsInteger.intValue() == 1;
        }
        brazeNotificationPayload.isPushDeliveryEnabled = z;
        Long stringAsLong = companion.parseStringAsLong(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_DELIVERY_FLUSH_MIN_KEY);
        brazeNotificationPayload.flushMinMinutes = stringAsLong != null ? stringAsLong.longValue() : 5L;
        Long stringAsLong2 = companion.parseStringAsLong(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_DELIVERY_FLUSH_MAX_KEY);
        brazeNotificationPayload.flushMaxMinutes = stringAsLong2 != null ? stringAsLong2.longValue() : 120L;
    }

    private static final void parsePayloadFieldsFromBundle$parsePushStoryData(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.pushStoryPageIndex = Companion.parseObjectAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_STORY_INDEX_KEY, 0);
        int i = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            if (templateFieldAtIndex == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) templateFieldAtIndex)) {
                break;
            }
            brazeNotificationPayload.pushStoryPagesInternal.add(new PushStoryPage(brazeNotificationPayload.notificationExtras, i));
            i++;
        }
        brazeNotificationPayload.isNewlyReceivedPushStory = brazeNotificationPayload.notificationExtras.getBoolean(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED, false);
    }

    private static final void parsePayloadFieldsFromBundle$parseVisibleContent(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.notificationChannelId = companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY);
        brazeNotificationPayload.titleText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_TITLE_KEY);
        brazeNotificationPayload.contentText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CONTENT_KEY);
        brazeNotificationPayload.largeIcon = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_LARGE_ICON_KEY);
        brazeNotificationPayload.notificationSound = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_KEY);
        brazeNotificationPayload.summaryText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
        brazeNotificationPayload.accentColor = companion.parseStringAsColorInt(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_ACCENT_KEY);
    }

    public static final String parseString(Bundle bundle, String str) {
        return Companion.parseString(bundle, str);
    }

    public static final boolean parseStringAsBoolean(Bundle bundle, String str) {
        return Companion.parseStringAsBoolean(bundle, str);
    }

    public static final Integer parseStringAsColorInt(Bundle bundle, String str) {
        return Companion.parseStringAsColorInt(bundle, str);
    }

    public static final Integer parseStringAsInteger(Bundle bundle, String str) {
        return Companion.parseStringAsInteger(bundle, str);
    }

    public static final Long parseStringAsLong(Bundle bundle, String str) {
        return Companion.parseStringAsLong(bundle, str);
    }

    public String toString() {
        Companion companion = Companion;
        String strStringAndKey = companion.stringAndKey("PushDuration", this.pushDuration);
        String strStringAndKey2 = companion.stringAndKey("IsPushStory", Boolean.valueOf(this.isPushStory));
        String strStringAndKey3 = companion.stringAndKey("IsInlineImagePush", Boolean.valueOf(this.isInlineImagePush));
        String strStringAndKey4 = companion.stringAndKey("IsConversationalPush", Boolean.valueOf(this.isConversationalPush));
        String strStringAndKey5 = companion.stringAndKey("PublicNotificationExtras", this.publicNotificationExtras);
        String strStringAndKey6 = companion.stringAndKey("NotificationChannelId", this.notificationChannelId);
        String strStringAndKey7 = companion.stringAndKey("NotificationCategory", this.notificationCategory);
        String strStringAndKey8 = companion.stringAndKey("NotificationVisibility", this.notificationVisibility);
        String strStringAndKey9 = companion.stringAndKey("NotificationBadgeNumber", this.notificationBadgeNumber);
        String strStringAndKey10 = companion.stringAndKey("CustomNotificationId", this.customNotificationId);
        String strStringAndKey11 = companion.stringAndKey("NotificationReceivedTimestampMillis", this.notificationReceivedTimestampMillis);
        String strStringAndKey12 = companion.stringAndKey("ContentCardSyncData", this.contentCardSyncData);
        String strStringAndKey13 = companion.stringAndKey("ContentCardSyncUserId", this.contentCardSyncUserId);
        String strStringAndKey14 = companion.stringAndKey("TitleText", this.titleText);
        String strStringAndKey15 = companion.stringAndKey("ContentText", this.contentText);
        String strStringAndKey16 = companion.stringAndKey("LargeIcon", this.largeIcon);
        String strStringAndKey17 = companion.stringAndKey("NotificationSound", this.notificationSound);
        String strStringAndKey18 = companion.stringAndKey("SummaryText", this.summaryText);
        String strStringAndKey19 = companion.stringAndKey("AccentColor", this.accentColor);
        String strStringAndKey20 = companion.stringAndKey("BigSummaryText", this.bigSummaryText);
        String strStringAndKey21 = companion.stringAndKey("BigTitleText", this.bigTitleText);
        String strStringAndKey22 = companion.stringAndKey("BigImageUrl", this.bigImageUrl);
        String strStringAndKey23 = companion.stringAndKey("ActionButtons", getActionButtons());
        String strStringAndKey24 = companion.stringAndKey("PushStoryPageIndex", Integer.valueOf(this.pushStoryPageIndex));
        String strStringAndKey25 = companion.stringAndKey("PushStoryPages", this.pushStoryPagesInternal);
        String strStringAndKey26 = companion.stringAndKey("ConversationMessages", this.conversationMessagesInternal);
        String strStringAndKey27 = companion.stringAndKey("ConversationPersonMap", this.conversationPersonMapInternal);
        String strStringAndKey28 = companion.stringAndKey("PushDeliveryEnabled", Boolean.valueOf(this.isPushDeliveryEnabled));
        String strStringAndKey29 = companion.stringAndKey("PushUniqueId", this.pushUniqueId);
        String strStringAndKey30 = companion.stringAndKey("ConversationShortcutId", this.conversationShortcutId);
        StringBuilder sb = new StringBuilder();
        sb.append(strStringAndKey);
        sb.append(strStringAndKey2);
        sb.append(strStringAndKey3);
        sb.append(strStringAndKey4);
        sb.append(strStringAndKey5);
        c8$$ExternalSyntheticOutline0.m(sb, strStringAndKey6, strStringAndKey7, strStringAndKey8, strStringAndKey9);
        c8$$ExternalSyntheticOutline0.m(sb, strStringAndKey10, strStringAndKey11, strStringAndKey12, strStringAndKey13);
        c8$$ExternalSyntheticOutline0.m(sb, strStringAndKey14, strStringAndKey15, strStringAndKey16, strStringAndKey17);
        c8$$ExternalSyntheticOutline0.m(sb, strStringAndKey18, strStringAndKey19, strStringAndKey20, strStringAndKey21);
        c8$$ExternalSyntheticOutline0.m(sb, strStringAndKey22, strStringAndKey23, strStringAndKey24, strStringAndKey25);
        c8$$ExternalSyntheticOutline0.m(sb, strStringAndKey26, strStringAndKey27, strStringAndKey28, strStringAndKey29);
        sb.append(strStringAndKey30);
        return sb.toString();
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context, BrazeConfigurationProvider brazeConfigurationProvider) {
        this.configurationProvider = brazeConfigurationProvider;
        this.notificationExtras = bundle == null ? new Bundle() : bundle;
        this.brazeExtras = bundle2 == null ? new Bundle() : bundle2;
        this.extras = BundleUtils.toStringMap(bundle2);
        this.context = context != null ? context.getApplicationContext() : null;
        this.flushMinMinutes = 5L;
        this.flushMaxMinutes = 120L;
        this.actionButtonsInternal = new ArrayList();
        this.pushStoryPagesInternal = new ArrayList();
        this.conversationMessagesInternal = new ArrayList();
        this.conversationPersonMapInternal = new HashMap();
        parsePayloadFieldsFromBundle();
    }

    private final void parsePayloadFieldsFromBundle() {
        parsePayloadFieldsFromBundle$parseNotificationMetadata(this);
        parsePayloadFieldsFromBundle$parseContentCardData(this);
        parsePayloadFieldsFromBundle$parseVisibleContent(this);
        parsePayloadFieldsFromBundle$parseBigTextStyle(this);
        parsePayloadFieldsFromBundle$parseBigImageStyle(this);
        parsePayloadFieldsFromBundle$parseActionButtons(this);
        parsePayloadFieldsFromBundle$parsePushStoryData(this);
        parsePayloadFieldsFromBundle$parseConversationPushData(this);
        parsePayloadFieldsFromBundle$parsePushDeliveryEventData(this);
    }

    public final void setActionButtons(List<ActionButton> list) {
        list.getClass();
        this.actionButtonsInternal = list;
    }

    public final void setBrazeExtras(Bundle bundle) {
        bundle.getClass();
        this.brazeExtras = bundle;
    }

    public final void setExtras(Map<String, String> map) {
        map.getClass();
        this.extras = map;
    }

    public final void setPushStoryPages(List<PushStoryPage> list) {
        list.getClass();
        this.pushStoryPagesInternal = list;
    }

    public final boolean isSilentPush() {
        return this.titleText == null && this.contentText == null;
    }

    public static final long getTemplateFieldAtIndex(int i, Bundle bundle, String str, long j) {
        return Companion.getTemplateFieldAtIndex(i, bundle, str, j);
    }

    public static final String getTemplateFieldAtIndex(int i, Bundle bundle, String str) {
        return Companion.getTemplateFieldAtIndex(i, bundle, str);
    }

    public static final String getTemplateFieldAtIndex(int i, Bundle bundle, String str, String str2) {
        return Companion.getTemplateFieldAtIndex(i, bundle, str, str2);
    }

    public static final boolean getTemplateFieldAtIndex(int i, Bundle bundle, String str, boolean z) {
        return Companion.getTemplateFieldAtIndex(i, bundle, str, z);
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2) {
        this(bundle, bundle2, null, null, 12, null);
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context) {
        this(bundle, bundle2, context, null, 8, null);
    }

    public BrazeNotificationPayload(Bundle bundle) {
        this(bundle, null, null, null, 14, null);
    }

    public /* synthetic */ BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context, BrazeConfigurationProvider brazeConfigurationProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle, (i & 2) != 0 ? Companion.getAttachedBrazeExtras(bundle) : bundle2, (i & 4) != 0 ? null : context, (i & 8) != 0 ? null : brazeConfigurationProvider);
    }
}
