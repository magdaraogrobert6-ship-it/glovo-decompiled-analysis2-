package com.braze;

import bo.app.a3;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b3;
import bo.app.c3;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.d3;
import bo.app.df;
import bo.app.e3;
import bo.app.f2;
import bo.app.f3;
import bo.app.f8$$ExternalSyntheticLambda2;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.g3;
import bo.app.g9;
import bo.app.h2;
import bo.app.h3;
import bo.app.i3;
import bo.app.i9;
import bo.app.ih;
import bo.app.ih$$ExternalSyntheticLambda2;
import bo.app.j3;
import bo.app.m1$$ExternalSyntheticLambda16;
import bo.app.m1$$ExternalSyntheticLambda18;
import bo.app.m1$$ExternalSyntheticLambda7;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda2;
import bo.app.n1;
import bo.app.u2;
import bo.app.v2;
import bo.app.vf;
import bo.app.w2;
import bo.app.w8$$ExternalSyntheticLambda1;
import bo.app.w9;
import bo.app.we;
import bo.app.x2;
import bo.app.y2;
import bo.app.z2;
import bo.app.zc$$ExternalSyntheticLambda0;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.models.outgoing.AttributionData;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.ValidationUtils;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.BuildersKt;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeUser {
    private final i9 brazeManager;
    private volatile String internalUserId;
    private final w9 locationManager;
    private final df serverConfigStorageProvider;
    private final ih userCache;
    private final ReentrantLock userIdLock;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_userId_$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("User object user id set to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$0() {
        return "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$1() {
        return "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$3(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to set alias: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToCustomAttributeArray$lambda$0() {
        return "Custom attribute key was invalid. Not adding to attribute array.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToSubscriptionGroup$lambda$0() {
        return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not adding user to subscription group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToSubscriptionGroup$lambda$2(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to add user to subscription group ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromCustomAttributeArray$lambda$0() {
        return "Custom attribute key was invalid. Not removing from attribute array.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromSubscriptionGroup$lambda$0() {
        return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not removing user from subscription group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromSubscriptionGroup$lambda$2(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to remove user from subscription group ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAttributionData$lambda$0() {
        return "Failed to set attribution data.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCountry$lambda$0() {
        return "Invalid country parameter: country is required to be non-blank. Not setting country.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCountry$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to set country to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$0() {
        return "Custom attribute key cannot be null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$0() {
        return "Invalid email parameter: email is required to be non-empty. Not setting email.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$2$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Email address is not valid: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$3(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to set email to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFirstName$lambda$0() {
        return "Invalid first name parameter: first name is required to be non-empty. Not setting first name.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFirstName$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to set first name to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setHomeCity$lambda$0() {
        return "Invalid home city parameter: home city is required to be non-blank. Not setting home city.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setHomeCity$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to set home city to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLanguage$lambda$0() {
        return "Invalid language parameter: language is required to be non-empty. Not setting language.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLanguage$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to set language to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastKnownLocation$lambda$0() {
        return "Failed to manually set location.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastName$lambda$0() {
        return "Invalid last name parameter: last name is required to be non-empty. Not setting last name.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastName$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to set last name to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$0() {
        return "Invalid LINE ID parameter: LINE ID is required to be non-empty or null. Not setting LINE ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$2$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("LINE ID is longer than 33 characters: Failed to set LINE ID: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$3(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to set LINE ID to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$0() {
        return "Custom location attribute key was invalid. Not setting attribute.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$0() {
        return "Invalid phone number parameter: phone number is required to be non-empty. Not setting phone number.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$2$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$3(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to set phone number to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsetCustomUserAttribute$lambda$0() {
        return "Custom attribute key cannot be null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsetLocationCustomAttribute$lambda$0() {
        return "Custom location attribute key was invalid. Not setting attribute.";
    }

    public final boolean addAlias(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(7), 6, (Object) null);
            return false;
        }
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(8), 6, (Object) null);
            return false;
        }
        try {
            g9 g9VarS = n1.g.s(str, str2);
            if (g9VarS != null) {
                return ((h2) this.brazeManager).a(g9VarS);
            }
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 20), 4, (Object) null);
            return false;
        }
    }

    public final boolean addToSubscriptionGroup(String str) {
        str.getClass();
        int i = 1;
        try {
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(24), 6, (Object) null);
                return false;
            }
            g9 g9VarA = n1.g.a(str, vf.SUBSCRIBED);
            if (g9VarA != null) {
                ((h2) this.brazeManager).a(g9VarA);
            }
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, i), 4, (Object) null);
            return false;
        }
    }

    public final String getUserId() {
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            return this.internalUserId;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean removeFromSubscriptionGroup(String str) {
        str.getClass();
        int i = 0;
        try {
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(i), 6, (Object) null);
                return false;
            }
            g9 g9VarA = n1.g.a(str, vf.UNSUBSCRIBED);
            if (g9VarA == null) {
                return true;
            }
            ((h2) this.brazeManager).a(g9VarA);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 16), 4, (Object) null);
            return false;
        }
    }

    public final boolean setAttributionData(AttributionData attributionData) {
        try {
            BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new u2(this, attributionData, null), 3);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(4), 4, (Object) null);
            return false;
        }
    }

    public final boolean setGender(Gender gender) {
        try {
            BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new b3(this, gender, null), 3);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda28(2, gender), 4, (Object) null);
            return false;
        }
    }

    public final void setLocationCustomAttribute(String str, double d, double d2) {
        str.getClass();
        try {
            try {
                if (!com.braze.support.c.a(str, this.serverConfigStorageProvider.e())) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(26), 6, (Object) null);
                    return;
                }
                if (!ValidationUtils.isValidLocation(d, d2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda29(d, d2, 2), 6, (Object) null);
                    return;
                }
                g9 g9VarA = n1.g.a(ValidationUtils.ensureBrazeFieldLength(str), d, d2);
                if (g9VarA != null) {
                    ((h2) this.brazeManager).a(g9VarA);
                }
            } catch (Exception e) {
                e = e;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new m1$$ExternalSyntheticLambda16(d, d2, 1, str), 4, (Object) null);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public BrazeUser(ih ihVar, i9 i9Var, String str, w9 w9Var, df dfVar) {
        ihVar.getClass();
        i9Var.getClass();
        str.getClass();
        w9Var.getClass();
        dfVar.getClass();
        this.userCache = ihVar;
        this.brazeManager = i9Var;
        this.internalUserId = str;
        this.locationManager = w9Var;
        this.serverConfigStorageProvider = dfVar;
        this.userIdLock = new ReentrantLock();
    }

    public final boolean addToCustomAttributeArray(String str, String str2) {
        str.getClass();
        str2.getClass();
        try {
            if (!com.braze.support.c.a(str, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(29), 6, (Object) null);
                return false;
            }
            if (com.braze.support.c.c(str2)) {
                g9 g9VarA = n1.g.a(ValidationUtils.ensureBrazeFieldLength(str), ValidationUtils.ensureBrazeFieldLength(str2));
                if (g9VarA != null) {
                    return ((h2) this.brazeManager).a(g9VarA);
                }
            }
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 10), 4, (Object) null);
            return false;
        }
    }

    public final boolean removeFromCustomAttributeArray(String str, String str2) {
        str.getClass();
        str2.getClass();
        try {
            if (!com.braze.support.c.a(str, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(10), 6, (Object) null);
                return false;
            }
            if (com.braze.support.c.c(str2)) {
                g9 g9VarQ = n1.g.q(ValidationUtils.ensureBrazeFieldLength(str), ValidationUtils.ensureBrazeFieldLength(str2));
                if (g9VarQ != null) {
                    return ((h2) this.brazeManager).a(g9VarQ);
                }
            }
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w8$$ExternalSyntheticLambda1(str, 28), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomAttribute(String str, Object obj, boolean z) {
        str.getClass();
        obj.getClass();
        if (!com.braze.support.c.a(str, this.serverConfigStorageProvider.e())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(25), 6, (Object) null);
            return false;
        }
        String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
        Object objA = com.braze.support.c.a.a(obj, 0);
        int i = 1;
        if (objA == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ih$$ExternalSyntheticLambda2(i, str, obj), 6, (Object) null);
            return false;
        }
        if (!(objA instanceof JSONObject) || !z) {
            BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new w2(this, strEnsureBrazeFieldLength, objA, null), 3);
            return true;
        }
        g9 g9VarA = n1.g.a(strEnsureBrazeFieldLength, (JSONObject) objA);
        if (g9VarA != null) {
            return ((h2) this.brazeManager).a(g9VarA);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ih$$ExternalSyntheticLambda2(2, strEnsureBrazeFieldLength, objA), 6, (Object) null);
        return false;
    }

    public final boolean setCustomAttributeArray(String str, String[] strArr) {
        str.getClass();
        strArr.getClass();
        try {
            if (com.braze.support.c.a(str, this.serverConfigStorageProvider.e())) {
                String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str2 : strArr) {
                    arrayList.add(ValidationUtils.ensureBrazeFieldLength(str2));
                }
                g9 g9VarA = n1.g.a(strEnsureBrazeFieldLength, (String[]) arrayList.toArray(new String[0]));
                if (g9VarA != null) {
                    return ((h2) this.brazeManager).a(g9VarA);
                }
            }
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 21), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomAttributeToSecondsFromEpoch(String str, long j) {
        str.getClass();
        return setCustomAttribute$default(this, str, DateTimeUtils.createDate(j), false, 4, null);
    }

    public final boolean setCustomUserAttributeToNow(String str) {
        str.getClass();
        try {
            return setCustomAttributeToSecondsFromEpoch(str, DateTimeUtils.nowInSeconds());
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 12), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttributeToSecondsFromEpoch(String str, long j) {
        str.getClass();
        try {
            return setCustomAttributeToSecondsFromEpoch(str, j);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new zc$$ExternalSyntheticLambda0(str, j, 1), 4, (Object) null);
            return false;
        }
    }

    public final boolean setDateOfBirth(int i, Month month, int i2) {
        month.getClass();
        try {
            BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new x2(this, DateTimeUtils.formatDate$default(DateTimeUtils.createDate$default(i, month.getValue(), i2, 0, 0, 0, 56, null), BrazeDateFormat.SHORT, null, 2, null), null), 3);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new f8$$ExternalSyntheticLambda2(i, month, i2), 4, (Object) null);
            return false;
        }
    }

    public final boolean setEmailNotificationSubscriptionType(NotificationSubscriptionType notificationSubscriptionType) {
        notificationSubscriptionType.getClass();
        try {
            BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new z2(this, notificationSubscriptionType, null), 3);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda28(0, notificationSubscriptionType), 4, (Object) null);
            return false;
        }
    }

    public final void setUserId(String str) {
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 11), 6, (Object) null);
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.internalUserId, ""}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.internalUserId, str}, getCieXyz.write())).booleanValue()) {
                    throw new IllegalArgumentException(("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [" + this.internalUserId + "], tried to change to: [" + str + "]").toString());
                }
            }
            this.internalUserId = str;
            BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new j3(this, str, null), 3);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void unsetLocationCustomAttribute(String str) {
        str.getClass();
        try {
            if (!com.braze.support.c.a(str, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(1), 6, (Object) null);
                return;
            }
            g9 g9VarO = n1.g.o(ValidationUtils.ensureBrazeFieldLength(str));
            if (g9VarO != null) {
                ((h2) this.brazeManager).a(g9VarO);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 13), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToCustomAttributeArray$lambda$1(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to add custom attribute with key '", str, "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementCustomUserAttribute$lambda$0(String str, int i) {
        return "Failed to increment custom attribute " + str + " by " + i + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromCustomAttributeArray$lambda$1(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to remove custom attribute with key '", str, "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$1$0(String str, Object obj) {
        return "Could not add unsupported custom attribute value with key: " + str + " and value: " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$1$1(String str, Object obj) {
        return "Could not build NestedCustomAttributeEvent for key " + str + " and " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttributeArray$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to set custom attribute array with key: '", str, "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to set custom boolean attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$1(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to set custom integer attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$2(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to set custom float attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$3(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to set custom long attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$4(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to set custom string attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$5(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to set custom double attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeToNow$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to set custom attribute ", str, " to now.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeToSecondsFromEpoch$lambda$0(String str, long j) {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Failed to set custom attribute ", str, j, " to ");
        sbM.append(" seconds from epoch.");
        return sbM.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmailNotificationSubscriptionType$lambda$0(NotificationSubscriptionType notificationSubscriptionType) {
        return "Failed to set email notification subscription to: " + notificationSubscriptionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGender$lambda$0(Gender gender) {
        return "Failed to set gender to: " + gender;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$1(double d, double d2) {
        return ff$$ExternalSyntheticOutline0.m(d2, "'", af$$ExternalSyntheticOutline0.m(d, "Cannot set custom location attribute due with invalid latitude '", " and longitude '"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$3(String str, double d, double d2) {
        return "Failed to set custom location attribute with key '" + str + "' and latitude '" + d + "' and longitude '" + d2 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPushNotificationSubscriptionType$lambda$0(NotificationSubscriptionType notificationSubscriptionType) {
        return "Failed to set push notification subscription to: " + notificationSubscriptionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsetCustomUserAttribute$lambda$1(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to unset custom attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsetLocationCustomAttribute$lambda$2(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to unset custom location attribute with key '", str, "'");
    }

    public final boolean incrementCustomUserAttribute(String str, int i) {
        str.getClass();
        try {
            if (com.braze.support.c.a(str, this.serverConfigStorageProvider.e())) {
                g9 g9VarA = n1.g.a(ValidationUtils.ensureBrazeFieldLength(str), i);
                if (g9VarA != null) {
                    return ((h2) this.brazeManager).a(g9VarA);
                }
            }
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new m1$$ExternalSyntheticLambda18(str, i, 1), 4, (Object) null);
            return false;
        }
    }

    public final boolean setPushNotificationSubscriptionType(NotificationSubscriptionType notificationSubscriptionType) {
        notificationSubscriptionType.getClass();
        int i = 3;
        try {
            BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new h3(this, notificationSubscriptionType, null), 3);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda0(i, notificationSubscriptionType), 4, (Object) null);
            return false;
        }
    }

    public final boolean unsetCustomUserAttribute(String str) {
        str.getClass();
        try {
            if (com.braze.support.c.a(str, this.serverConfigStorageProvider.e())) {
                BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new i3(this, str, null), 3);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(23), 6, (Object) null);
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w8$$ExternalSyntheticLambda1(str, 29), 4, (Object) null);
            return false;
        }
    }

    public static /* synthetic */ boolean incrementCustomUserAttribute$default(BrazeUser brazeUser, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return brazeUser.incrementCustomUserAttribute(str, i);
    }

    public static /* synthetic */ boolean setCustomAttribute$default(BrazeUser brazeUser, String str, Object obj, boolean z, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = false;
        }
        return brazeUser.setCustomAttribute(str, obj, z);
    }

    public static /* synthetic */ boolean setCustomUserAttribute$default(BrazeUser brazeUser, String str, JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return brazeUser.setCustomUserAttribute(str, jSONObject, z);
    }

    public final boolean setCountry(String str) {
        if (str != null) {
            try {
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(25), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 2), 4, (Object) null);
                return false;
            }
        }
        BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new v2(this, str, null), 3);
        return true;
    }

    public final boolean setEmail(String str) {
        String string;
        if (str != null) {
            try {
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(9), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 23), 4, (Object) null);
                return false;
            }
        }
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = removeNodeAtDepth.serializer(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            string = str.subSequence(i, length + 1).toString();
        } else {
            string = null;
        }
        if (string != null && !ValidationUtils.isValidEmailAddress(string)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 22), 7, (Object) null);
            return false;
        }
        BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new y2(this, string, null), 3);
        return true;
    }

    public final boolean setFirstName(String str) {
        if (str != null) {
            try {
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(28), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 9), 4, (Object) null);
                return false;
            }
        }
        BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new a3(this, str, null), 3);
        return true;
    }

    public final boolean setLanguage(String str) {
        if (str != null) {
            try {
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(27), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 8), 4, (Object) null);
                return false;
            }
        }
        BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new d3(this, str, null), 3);
        return true;
    }

    public final boolean setLastName(String str) {
        if (str != null) {
            try {
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(2), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 14), 4, (Object) null);
                return false;
            }
        }
        BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new e3(this, str, null), 3);
        return true;
    }

    public final boolean setLineId(String str) {
        String string;
        if (str != null) {
            try {
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(6), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 19), 4, (Object) null);
                return false;
            }
        }
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = removeNodeAtDepth.serializer(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            string = str.subSequence(i, length + 1).toString();
        } else {
            string = null;
        }
        if (string != null && !ValidationUtils.isValidLineId(string)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(string, 18), 6, (Object) null);
            return false;
        }
        BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new f3(this, string, null), 3);
        return true;
    }

    public final boolean setPhoneNumber(String str) {
        String string;
        int i = 0;
        if (str != null) {
            try {
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(i), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 6), 4, (Object) null);
                return false;
            }
        }
        if (str != null) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = removeNodeAtDepth.serializer(str.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            string = str.subSequence(i2, length + 1).toString();
        } else {
            string = null;
        }
        if (string != null && !ValidationUtils.isValidPhoneNumber(string)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(string, i), 6, (Object) null);
            return false;
        }
        BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new g3(this, string, null), 3);
        return true;
    }

    public final boolean setHomeCity(String str) {
        int i = 3;
        if (str != null) {
            try {
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(i), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 15), 4, (Object) null);
                return false;
            }
        }
        BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new c3(this, str, null), 3);
        return true;
    }

    public final void setLastKnownLocation(double d, double d2, Double d3, Double d4, Double d5) {
        try {
            try {
                ((f2) this.locationManager).a(new BrazeLocation(d, d2, d3, d4, d5));
            } catch (Exception e) {
                e = e;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(5), 4, (Object) null);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$0(int i, Month month, int i2) {
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(i, month.getValue(), "Failed to set date of birth to: ", "-", "-");
        sbM.append(i2);
        return sbM.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$6(String str, JSONObject jSONObject) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Failed to set custom json attribute ", str, " with value \n", JsonUtils.getPrettyPrintedString(jSONObject), ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$7(String str, JSONArray jSONArray) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Failed to set custom json attribute ", str, " with value \n", JsonUtils.getPrettyPrintedString(jSONArray), ".");
    }

    public final boolean setCustomUserAttribute(String str, boolean z) {
        str.getClass();
        try {
            return setCustomAttribute$default(this, str, Boolean.valueOf(z), false, 4, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 17), 4, (Object) null);
            return false;
        }
    }

    public static /* synthetic */ void setLastKnownLocation$default(BrazeUser brazeUser, double d, double d2, Double d3, Double d4, Double d5, int i, Object obj) {
        brazeUser.setLastKnownLocation(d, d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4, (i & 16) != 0 ? null : d5);
    }

    public final void setLastKnownLocation(double d, double d2, Double d3) {
        setLastKnownLocation$default(this, d, d2, d3, null, null, 24, null);
    }

    public final void setLastKnownLocation(double d, double d2, Double d3, Double d4) {
        setLastKnownLocation$default(this, d, d2, d3, d4, null, 16, null);
    }

    public final void setLastKnownLocation(double d, double d2) {
        setLastKnownLocation$default(this, d, d2, null, null, null, 28, null);
    }

    public final boolean setCustomUserAttribute(String str, JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        return setCustomUserAttribute$default(this, str, jSONObject, false, 4, null);
    }

    public final boolean setCustomUserAttribute(String str, int i) {
        str.getClass();
        try {
            return setCustomAttribute$default(this, str, Integer.valueOf(i), false, 4, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 7), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String str, float f) {
        str.getClass();
        try {
            return setCustomAttribute$default(this, str, Float.valueOf(f), false, 4, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 5), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String str, long j) {
        str.getClass();
        try {
            return setCustomAttribute$default(this, str, Long.valueOf(j), false, 4, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 3), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String str, String str2) {
        str.getClass();
        str2.getClass();
        try {
            return setCustomAttribute$default(this, str, str2, false, 4, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda14(str, 9), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String str, double d) {
        str.getClass();
        try {
            return setCustomAttribute$default(this, str, Double.valueOf(d), false, 4, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 4), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String str, JSONObject jSONObject, boolean z) {
        str.getClass();
        jSONObject.getClass();
        try {
            return setCustomAttribute(str, jSONObject, z);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new m1$$ExternalSyntheticLambda7(jSONObject, str, 1), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String str, JSONArray jSONArray) {
        str.getClass();
        jSONArray.getClass();
        try {
            return setCustomAttribute$default(this, str, jSONArray, false, 4, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(str, 18, jSONArray), 4, (Object) null);
            return false;
        }
    }

    public final boolean incrementCustomUserAttribute(String str) {
        str.getClass();
        return incrementCustomUserAttribute$default(this, str, 0, 2, null);
    }

    public final boolean setCustomAttribute(String str, Object obj) {
        str.getClass();
        obj.getClass();
        return setCustomAttribute$default(this, str, obj, false, 4, null);
    }
}
