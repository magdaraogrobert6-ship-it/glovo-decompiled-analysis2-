package com.braze.ui;

import android.content.Context;
import android.webkit.JavascriptInterface;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d0$$ExternalSyntheticLambda4;
import bo.app.f2$$ExternalSyntheticLambda4;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils$$ExternalSyntheticLambda9;
import com.braze.support.i$$ExternalSyntheticLambda0;
import com.braze.support.i$$ExternalSyntheticLambda1;
import com.incognia.internal.mn$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.resumeWebviewIfNecessaryandroid_sdk_ui_release;
import o.setCarryoverInAppMessage;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UserJavascriptInterfaceBase {
    public static final Companion Companion = new Companion(null);
    public static final String JS_BRIDGE_ATTRIBUTE_VALUE = "value";
    private final Context context;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void runOnUser(Braze braze, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            braze.getCurrentUser(new mn$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runOnUser$lambda$0(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, BrazeUser brazeUser) {
            brazeUser.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(brazeUser);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseStringArrayFromJsonString$lambda$1() {
        return "Failed to parse custom attribute array";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeArray$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to set custom attribute array for key ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse setDateOfBirth month for value ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmailNotificationSubscriptionType$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGender$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse gender in Braze HTML in-app message javascript interface with gender: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPushNotificationSubscriptionType$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: ", str);
    }

    public final String[] parseStringArrayFromJsonString(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(9), 4, (Object) null);
            return null;
        }
    }

    @JavascriptInterface
    public final void setCountry(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new d0$$ExternalSyntheticLambda4(str, 11));
    }

    @JavascriptInterface
    public final void setEmail(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new d0$$ExternalSyntheticLambda4(str, 15));
    }

    @JavascriptInterface
    public final void setFirstName(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new d0$$ExternalSyntheticLambda4(str, 12));
    }

    @JavascriptInterface
    public final void setHomeCity(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new d0$$ExternalSyntheticLambda4(str, 13));
    }

    @JavascriptInterface
    public final void setLanguage(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new d0$$ExternalSyntheticLambda4(str, 8));
    }

    @JavascriptInterface
    public final void setLastName(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new d0$$ExternalSyntheticLambda4(str, 17));
    }

    @JavascriptInterface
    public final void setLineId(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new d0$$ExternalSyntheticLambda4(str, 16));
    }

    @JavascriptInterface
    public final void setPhoneNumber(String str) {
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new d0$$ExternalSyntheticLambda4(str, 14));
    }

    public final NotificationSubscriptionType subscriptionTypeFromJavascriptString(String str) {
        return NotificationSubscriptionType.Companion.fromValue(str);
    }

    public UserJavascriptInterfaceBase(Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel addAlias$lambda$0(String str, String str2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.addAlias(str, str2);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel addToCustomAttributeArray$lambda$0(String str, String str2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.addToCustomAttributeArray(str, str2);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel addToSubscriptionGroup$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.addToSubscriptionGroup(str);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel incrementCustomUserAttribute$lambda$1(String str, Integer num, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.incrementCustomUserAttribute(str, num.intValue());
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel removeFromCustomAttributeArray$lambda$0(String str, String str2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.removeFromCustomAttributeArray(str, str2);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel removeFromSubscriptionGroup$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.removeFromSubscriptionGroup(str);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setCountry$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setCountry(str);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setCustomLocationAttribute$lambda$2(String str, Double d, Double d2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setLocationCustomAttribute(str, d.doubleValue(), d2.doubleValue());
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setCustomUserAttributeArray$lambda$1(String str, String[] strArr, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setCustomAttributeArray(str, strArr);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setCustomUserAttributeJSON$lambda$0(UserJavascriptInterfaceBase userJavascriptInterfaceBase, String str, String str2, boolean z, BrazeUser brazeUser) {
        brazeUser.getClass();
        userJavascriptInterfaceBase.setCustomAttribute(brazeUser, str, str2, z);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setDateOfBirth$lambda$3(Integer num, Month month, Integer num2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setDateOfBirth(num.intValue(), month, num2.intValue());
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setEmail$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setEmail(str);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setEmailNotificationSubscriptionType$lambda$1(NotificationSubscriptionType notificationSubscriptionType, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setEmailNotificationSubscriptionType(notificationSubscriptionType);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setFirstName$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setFirstName(str);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setGender$lambda$1(Gender gender, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setGender(gender);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setHomeCity$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setHomeCity(str);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setLanguage$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setLanguage(str);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setLastName$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setLastName(str);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setLineId$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setLineId(str);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setPhoneNumber$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setPhoneNumber(str);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setPushNotificationSubscriptionType$lambda$1(NotificationSubscriptionType notificationSubscriptionType, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setPushNotificationSubscriptionType(notificationSubscriptionType);
        return createFromParcel.INSTANCE;
    }

    @JavascriptInterface
    public final void addAlias(String str, String str2) {
        str.getClass();
        str2.getClass();
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda6(str, str2, 0));
    }

    @JavascriptInterface
    public final void addToCustomAttributeArray(String str, String str2) {
        str.getClass();
        str2.getClass();
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda6(str, str2, 2));
    }

    @JavascriptInterface
    public final void addToSubscriptionGroup(String str) {
        str.getClass();
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new d0$$ExternalSyntheticLambda4(str, 9));
    }

    @JavascriptInterface
    public final void incrementCustomUserAttribute(String str, String str2) {
        str.getClass();
        str2.getClass();
        Integer numMediaSessionCompatQueueItem = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str2);
        if (numMediaSessionCompatQueueItem == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str2, 11), 6, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new Navigator$$ExternalSyntheticLambda1(str, 22, numMediaSessionCompatQueueItem));
        }
    }

    public final Gender parseGender(String str) {
        str.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        Gender gender = Gender.MALE;
        if (lowerCase.equals(gender.forJsonPut())) {
            return gender;
        }
        Gender gender2 = Gender.FEMALE;
        if (lowerCase.equals(gender2.forJsonPut())) {
            return gender2;
        }
        Gender gender3 = Gender.OTHER;
        if (lowerCase.equals(gender3.forJsonPut())) {
            return gender3;
        }
        Gender gender4 = Gender.UNKNOWN;
        if (lowerCase.equals(gender4.forJsonPut())) {
            return gender4;
        }
        Gender gender5 = Gender.NOT_APPLICABLE;
        if (lowerCase.equals(gender5.forJsonPut())) {
            return gender5;
        }
        Gender gender6 = Gender.PREFER_NOT_TO_SAY;
        if (lowerCase.equals(gender6.forJsonPut())) {
            return gender6;
        }
        return null;
    }

    @JavascriptInterface
    public final void removeFromCustomAttributeArray(String str, String str2) {
        str.getClass();
        str2.getClass();
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda6(str, str2, 1));
    }

    @JavascriptInterface
    public final void removeFromSubscriptionGroup(String str) {
        str.getClass();
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new d0$$ExternalSyntheticLambda4(str, 10));
    }

    @JavascriptInterface
    public final void setCustomLocationAttribute(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        Double dMediaMetadataCompat = resumeWebviewIfNecessaryandroid_sdk_ui_release.MediaMetadataCompat(str2);
        if (dMediaMetadataCompat == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str2, 9), 6, (Object) null);
            return;
        }
        Double dMediaMetadataCompat2 = resumeWebviewIfNecessaryandroid_sdk_ui_release.MediaMetadataCompat(str3);
        if (dMediaMetadataCompat2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str3, 10), 6, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(str, dMediaMetadataCompat, dMediaMetadataCompat2, 23));
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeArray(String str, String str2) {
        str.getClass();
        String[] stringArrayFromJsonString = parseStringArrayFromJsonString(str2);
        if (stringArrayFromJsonString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, 13), 6, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new Navigator$$ExternalSyntheticLambda1(str, 23, stringArrayFromJsonString));
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeJSON(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        Companion.runOnUser(Braze.Companion.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda26(this, str, str2, z, 0));
    }

    @JavascriptInterface
    public final void setDateOfBirth(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        Integer numMediaSessionCompatQueueItem = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str);
        if (numMediaSessionCompatQueueItem == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, 15), 6, (Object) null);
            return;
        }
        Month monthMonthFromInt = monthFromInt(str2);
        if (monthMonthFromInt == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str2, 7), 6, (Object) null);
            return;
        }
        Integer numMediaSessionCompatQueueItem2 = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str3);
        if (numMediaSessionCompatQueueItem2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str3, 8), 6, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(numMediaSessionCompatQueueItem, monthMonthFromInt, numMediaSessionCompatQueueItem2));
        }
    }

    @JavascriptInterface
    public final void setEmailNotificationSubscriptionType(String str) {
        str.getClass();
        NotificationSubscriptionType notificationSubscriptionTypeSubscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(str);
        if (notificationSubscriptionTypeSubscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, 6), 6, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda1(notificationSubscriptionTypeSubscriptionTypeFromJavascriptString, 0));
        }
    }

    @JavascriptInterface
    public final void setGender(String str) {
        str.getClass();
        Gender gender = parseGender(str);
        if (gender == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, 12), 6, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new f2$$ExternalSyntheticLambda4(11, gender));
        }
    }

    @JavascriptInterface
    public final void setPushNotificationSubscriptionType(String str) {
        str.getClass();
        NotificationSubscriptionType notificationSubscriptionTypeSubscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(str);
        if (notificationSubscriptionTypeSubscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, 14), 6, (Object) null);
        } else {
            Companion.runOnUser(Braze.Companion.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda1(notificationSubscriptionTypeSubscriptionTypeFromJavascriptString, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementCustomUserAttribute$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to parse incrementCustomUserAttribute increment value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$0(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Failed to parse custom attribute type for key: ", str, " and json string value: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$1(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Failed to parse custom attribute type for key: ", str, " and json string value: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomLocationAttribute$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to parse setCustomLocationAttribute latitude value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomLocationAttribute$lambda$1(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to parse setCustomLocationAttribute longitude value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to parse setDateOfBirth year value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$2(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to parse setDateOfBirth day value '", str, "'");
    }

    public final Month monthFromInt(String str) {
        int iIntValue;
        str.getClass();
        Integer numMediaSessionCompatQueueItem = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str);
        if (numMediaSessionCompatQueueItem == null || (iIntValue = numMediaSessionCompatQueueItem.intValue()) < 1 || iIntValue > 12) {
            return null;
        }
        return Month.Companion.getMonth(iIntValue - 1);
    }

    public final void setCustomAttribute(BrazeUser brazeUser, String str, String str2, boolean z) {
        brazeUser.getClass();
        str.getClass();
        str2.getClass();
        try {
            Object obj = new JSONObject(str2).get("value");
            if (obj instanceof String) {
                brazeUser.setCustomUserAttribute(str, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                brazeUser.setCustomUserAttribute(str, ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof Integer) {
                brazeUser.setCustomUserAttribute(str, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Double) {
                brazeUser.setCustomUserAttribute(str, ((Number) obj).doubleValue());
            } else if (obj instanceof JSONObject) {
                brazeUser.setCustomUserAttribute(str, (JSONObject) obj, z);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new WebContentUtils$$ExternalSyntheticLambda9(str, str2, 1), 6, (Object) null);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new WebContentUtils$$ExternalSyntheticLambda9(str, str2, 2), 4, (Object) null);
        }
    }
}
