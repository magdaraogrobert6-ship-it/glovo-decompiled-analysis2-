package com.braze.support;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.df;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda0;
import com.braze.Braze$$ExternalSyntheticLambda75;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Set;
import o.createInAppMessageEventSubscriber;
import o.getInAppMessageEventMap;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardClicked;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class ValidationUtils {
    public static final int BRAZE_STRING_MAX_LENGTH = 255;
    public static final int EMAIL_ADDRESS_MAX_LENGTH = 255;
    public static final int LINE_ID_MAX_LENGTH = 33;
    public static final ValidationUtils INSTANCE = new ValidationUtils();
    private static final Set<String> VALID_CURRENCY_CODES = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWL"});
    private static final getInAppMessageEventMap EMAIL_ADDRESS_REGEX = new getInAppMessageEventMap(".+@.+\\..+");
    private static final getInAppMessageEventMap PHONE_NUMBER_REGEX = new getInAppMessageEventMap("^[0-9 .\\(\\)\\+\\-]+$");
    private static final getInAppMessageEventMap ENDPOINT_REGEX = new getInAppMessageEventMap("rest\\.[a-z]+-[0-9]+\\.braze\\.");

    private ValidationUtils() {
    }

    public static /* synthetic */ void getEMAIL_ADDRESS_MAX_LENGTH$annotations() {
    }

    public static final boolean isValidLocation(double d, double d2) {
        return d < 90.0d && d > -90.0d && d2 < 180.0d && d2 > -180.0d;
    }

    public final Set<String> getVALID_CURRENCY_CODES() {
        return VALID_CURRENCY_CODES;
    }

    public static final String ensureBrazeFieldLength(String str) {
        if (str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            return "";
        }
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        String string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString();
        createinappmessageeventsubscriber.IconCompatParcelizer = string;
        if (string.length() > 255) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda75(createinappmessageeventsubscriber, 3), 6, (Object) null);
            createinappmessageeventsubscriber.IconCompatParcelizer = ((String) createinappmessageeventsubscriber.IconCompatParcelizer).substring(0, 255);
        }
        return (String) createinappmessageeventsubscriber.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureBrazeFieldLength$lambda$0(createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        return d$$ExternalSyntheticOutline0.m(((String) createinappmessageeventsubscriber.IconCompatParcelizer).length(), "Provided string field is too long [", "]. The max length is 255, truncating provided field.");
    }

    public static final boolean isInvalidCustomEndpoint$android_sdk_base_release(String str) {
        if (str != null) {
            return ENDPOINT_REGEX.write(str);
        }
        return false;
    }

    public static final boolean isValidLineId(String str) {
        return str != null && str.length() <= 33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogCustomEventInput$lambda$0() {
        return "The custom event name cannot be null or contain only whitespaces. Invalid custom event.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$0() {
        return "The productId is empty, not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("The productId is a blocklisted productId: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$4() {
        return "The price is null.";
    }

    public static final boolean isValidPhoneNumber(String str) {
        return str != null && PHONE_NUMBER_REGEX.read(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidPushStoryClickInput$lambda$0() {
        return "Campaign ID cannot be null or blank";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidPushStoryClickInput$lambda$1() {
        return "Push story page ID cannot be null or blank";
    }

    public static final boolean isValidEmailAddress(String str) {
        if (str == null || str.length() == 0 || str.length() > 255) {
            return false;
        }
        return EMAIL_ADDRESS_REGEX.read(str);
    }

    public static final boolean isValidPushStoryClickInput(String str, String str2) {
        if (str != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            if (str2 != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(17), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(18), 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogCustomEventInput$lambda$1(String str) {
        return ff$$ExternalSyntheticOutline0.m("The custom event is a blocklisted custom event: ", str, ". Invalid custom event.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$5(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "The requested purchase quantity of ", " is less than one. Invalid purchase");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$6(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "The requested purchase quantity of ", " is greater than the maximum of 100");
    }

    public static final boolean isValidLogCustomEventInput(String str, df dfVar) {
        dfVar.getClass();
        if (str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(16), 6, (Object) null);
            return false;
        }
        if (!dfVar.f().contains(str)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str, 22), 6, (Object) null);
        return false;
    }

    public static final boolean isValidLogPurchaseInput(String str, String str2, BigDecimal bigDecimal, int i, df dfVar) {
        dfVar.getClass();
        if (str != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            if (dfVar.g().contains(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str, 23), 6, (Object) null);
                return false;
            }
            if (str2 != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                Set<String> set = VALID_CURRENCY_CODES;
                String string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2).toString();
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase = string.toUpperCase(locale);
                upperCase.getClass();
                if (!set.contains(upperCase)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str2, 24), 6, (Object) null);
                    return false;
                }
                if (bigDecimal == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(19), 6, (Object) null);
                    return false;
                }
                if (i <= 0) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(i, 27), 6, (Object) null);
                    return false;
                }
                if (i <= 100) {
                    return true;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(i, 28), 6, (Object) null);
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(14), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(15), 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$2() {
        return "The currencyCode is empty. Expected one of " + VALID_CURRENCY_CODES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$3(String str) {
        return "The currencyCode " + str + " is invalid. Expected one of " + VALID_CURRENCY_CODES;
    }
}
