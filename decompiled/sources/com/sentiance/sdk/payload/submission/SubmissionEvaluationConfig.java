package com.sentiance.sdk.payload.submission;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import o.BrazeUserExternalSyntheticLambda1;
import o.IBrazeExternalSyntheticBUOutline0;
import o.getApiKeyandroid_sdk_base_release;
import o.getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations;
import o.getBadNetworkIntervalandroid_sdk_base_release;
import o.getGreatNetworkIntervalandroid_sdk_base_release;
import o.isGeofencesEnabledFromEnvironmentlambda1;
import o.logPurchasedefault;
import o.parseLonglambda0;
import o.r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4;
import o.removeFromSubscriptionGrouplambda0;
import o.setApiKeyandroid_sdk_base_release;
import o.setAutomaticLocationCollectionEnabledandroid_sdk_base_release;
import o.setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release;
import o.setCustomUserAttributeToSecondsFromEpoch;
import o.setCustomUserAttributedefault;
import o.setCustomWebViewActivityClass;
import o.setEmail;
import o.setEmaillambda3;
import o.setGender;
import o.setLineId;
import o.setSoundIfPresentAndSupportedlambda1;
import o.unsetCustomUserAttribute;
import o.unsetCustomUserAttributelambda1;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "SubmissionEvaluationConfig")
public class SubmissionEvaluationConfig {
    private final ConfigurationManager IconCompatParcelizer;
    private final setSoundIfPresentAndSupportedlambda1 RemoteActionCompatParcelizer;
    private final isGeofencesEnabledFromEnvironmentlambda1 read;
    private final EnumMap<Category, List<String>> write;

    public enum Category {
        REALTIME_ONLY,
        REALTIME_PREFERRED,
        REALTIME_NON_BLOCKING,
        ASYNCHRONOUS
    }

    public SubmissionEvaluationConfig(parseLonglambda0 parselonglambda0, ConfigurationManager configurationManager, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1) {
        this.IconCompatParcelizer = configurationManager;
        this.read = isgeofencesenabledfromenvironmentlambda1;
        this.RemoteActionCompatParcelizer = setsoundifpresentandsupportedlambda1;
        EnumMap<Category, List<String>> enumMap = new EnumMap<>(Category.class);
        this.write = enumMap;
        enumMap.put(Category.ASYNCHRONOUS, Arrays.asList(IconCompatParcelizer(BrazeUserExternalSyntheticLambda1.class), IconCompatParcelizer(unsetCustomUserAttributelambda1.class), IconCompatParcelizer(setEmail.class), IconCompatParcelizer(setAutomaticLocationCollectionEnabledandroid_sdk_base_release.class)));
        enumMap.put(Category.REALTIME_NON_BLOCKING, Collections.EMPTY_LIST);
        enumMap.put(Category.REALTIME_PREFERRED, Arrays.asList(IconCompatParcelizer(setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release.class) + '|' + IconCompatParcelizer(r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4.class), IconCompatParcelizer(setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release.class) + '|' + IconCompatParcelizer(setApiKeyandroid_sdk_base_release.class), IconCompatParcelizer(setGender.class) + '|' + IconCompatParcelizer(setLineId.class), IconCompatParcelizer(setGender.class) + '|' + IconCompatParcelizer(setCustomUserAttributeToSecondsFromEpoch.class), IconCompatParcelizer(setGender.class) + '|' + IconCompatParcelizer(removeFromSubscriptionGrouplambda0.class), IconCompatParcelizer(setEmaillambda3.class), IconCompatParcelizer(IBrazeExternalSyntheticBUOutline0.class), IconCompatParcelizer(setCustomUserAttributedefault.class), IconCompatParcelizer(getGreatNetworkIntervalandroid_sdk_base_release.class), IconCompatParcelizer(logPurchasedefault.class), IconCompatParcelizer(getBadNetworkIntervalandroid_sdk_base_release.class), IconCompatParcelizer(setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release.class) + '|' + IconCompatParcelizer(setCustomWebViewActivityClass.class), IconCompatParcelizer(unsetCustomUserAttribute.class)));
        enumMap.put(Category.REALTIME_ONLY, Arrays.asList(IconCompatParcelizer(setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release.class) + '|' + IconCompatParcelizer(removeFromSubscriptionGrouplambda0.class), IconCompatParcelizer(setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release.class) + '|' + IconCompatParcelizer(getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations.class)));
    }

    public final List<String> IconCompatParcelizer() {
        isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1 = this.read;
        boolean zMediaDescriptionCompat = isgeofencesenabledfromenvironmentlambda1.MediaDescriptionCompat();
        ConfigurationManager configurationManager = this.IconCompatParcelizer;
        if (zMediaDescriptionCompat) {
            return configurationManager.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
        }
        return isgeofencesenabledfromenvironmentlambda1.RatingCompat() ? configurationManager.MediaMetadataCompat() : Collections.EMPTY_LIST;
    }

    public final EnumMap RemoteActionCompatParcelizer() {
        EnumMap enumMap_init_lambda1 = this.IconCompatParcelizer._init_lambda1();
        return enumMap_init_lambda1 != null ? enumMap_init_lambda1 : this.write;
    }

    public final Category write(String str) {
        for (Map.Entry entry : RemoteActionCompatParcelizer().entrySet()) {
            if (((List) entry.getValue()).contains(str)) {
                return (Category) entry.getKey();
            }
        }
        return null;
    }

    public final ArrayList write() {
        List list = getApiKeyandroid_sdk_base_release.read;
        this.IconCompatParcelizer.getClass();
        return ConfigurationManager.IconCompatParcelizer(list);
    }

    private String IconCompatParcelizer(Class cls) {
        this.RemoteActionCompatParcelizer.getClass();
        return (String) setSoundIfPresentAndSupportedlambda1.serializer(cls).write();
    }
}
