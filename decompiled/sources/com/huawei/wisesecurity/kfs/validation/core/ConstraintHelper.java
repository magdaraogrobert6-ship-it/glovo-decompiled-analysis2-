package com.huawei.wisesecurity.kfs.validation.core;

import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import com.mapbox.navigation.base.internal.route.operations.OptionallyRefreshedData;
import com.mapbox.navigation.base.internal.utils.FloatKt;
import com.mapbox.navigation.core.internal.router.RouterErrorMapperKt;
import com.mapbox.navigation.core.routerefresh.RouteRefreshValidator;
import com.mapbox.navigation.navigator.internal.utils.TripStatusEx;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverInstructionGenerator;
import com.mapbox.navigation.ui.maps.camera.data.ViewportDataSourceProcessor;
import com.mapbox.navigation.ui.maps.camera.utils.MapboxNavigationCameraUtilsKt;
import com.mapbox.navigation.ui.maps.route.line.api.HeavyRouteLineValueProvider;
import com.mapbox.navigation.ui.utils.internal.resource.ResourceLoaderExtensionsKt;
import com.mapbox.navigation.utils.internal.LoggerFrontendKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.search.RequestOptionsKt;
import com.mapbox.search.base.factory.ImageKt;
import com.mapbox.search.base.logger.LogKt;
import com.mapbox.search.base.result.BaseSearchResponseKt;
import com.mapbox.search.base.utils.extension.DoubleKt;
import com.mapbox.search.base.utils.extension.MapKt;
import com.mapbox.search.base.utils.extension.SearchResponseErrorKt;
import com.mapbox.search.result.SearchAddressKt;
import com.roadrunner.customerchat.selfservice.data.remote.service.AnalyticsServiceResultKt;
import com.roadrunner.delivery.pickupdropoff.tasks.api.extension.FlowExtensionsKt;
import java.util.concurrent.ConcurrentHashMap;
import o.AdjustRemoteTrigger;
import o.CustomAccessibilityAction;
import o.EmptySemanticsElement;
import o.EmptySemanticsModifier;
import o.InputTextSuggestionState;
import o.LiveRegionMode;
import o.LiveRegionModeCompanion;
import o.Paragraph_EkL_Ydefault;
import o.PurchaseVerificationResponseData;
import o.SemanticsActionsCustomActions1;
import o.accessgetAssertivecp;
import o.accessgetIndeterminatecp;
import o.accessgetSwitchcp;
import o.getAssertive0phEisY;
import o.getColumnIndex;
import o.getHyphensvmbZdU8;
import o.getInsertTextAtCursor;
import o.getOnSessionTrackingFailedListener;
import o.getPageLeft;
import o.getPolite0phEisY;
import o.getRequiredTypeConverters;
import o.getSubscripty9eOQZsannotations;
import o.isClearingSemantics;
import o.isCommittedByInputMethodEditor;
import o.r8lambdaUACe5LkyhSyksr6e5YrbkS_EXLU;
import o.resolveroom_runtime;
import o.setClearingSemantics;
import o.setMergeDescendants;
import o.setProperties;
import o.skippedEntity;
import o.updateTypeface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ConstraintHelper {
    private static final byte[] $$a = {58, 31, 32, 124, -64, 63, -53};
    private static final int $$b = 59;
    public static final ConcurrentHashMap IconCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.wisesecurity.kfs.validation.core.ConstraintHelper.$$a
            int r5 = r5 * 4
            int r5 = 4 - r5
            int r6 = r6 * 3
            int r1 = r6 + 4
            int r7 = r7 * 4
            int r7 = r7 + 111
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2a:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.wisesecurity.kfs.validation.core.ConstraintHelper.a(int, short, byte, java.lang.Object[]):void");
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        IconCompatParcelizer = concurrentHashMap;
        concurrentHashMap.put(LiveRegionMode.class, new getAssertive0phEisY(TripStatusEx.class));
        byte b = (byte) 0;
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b, b2, b2, objArr);
        concurrentHashMap.put(InputTextSuggestionState.class, new getAssertive0phEisY(ManeuverInstructionGenerator.class, Class.forName((String) objArr[0]), LiveRegionModeCompanion.class, ImageKt.class, ResourceLoaderExtensionsKt.class, getInsertTextAtCursor.class, MapboxNavigationCameraUtilsKt.class, getOnSessionTrackingFailedListener.class, updateTypeface.class, MapKt.class, RouterErrorMapperKt.class, LogKt.class));
        concurrentHashMap.put(getColumnIndex.class, new getAssertive0phEisY(FloatKt.class, AnalyticsServiceResultKt.class, LoggingLevelUtilKt.class, ViewportDataSourceProcessor.class));
        concurrentHashMap.put(EmptySemanticsModifier.class, new getAssertive0phEisY(SearchResponseErrorKt.class, RouteRefreshValidator.class, RequestOptionsKt.class, PurchaseVerificationResponseData.class, accessgetAssertivecp.class, skippedEntity.class, getHyphensvmbZdU8.class, SemanticsActionsCustomActions1.class, BaseSearchResponseKt.class, r8lambdaUACe5LkyhSyksr6e5YrbkS_EXLU.class, Paragraph_EkL_Ydefault.class, FlowExtensionsKt.class));
        concurrentHashMap.put(CustomAccessibilityAction.class, new getAssertive0phEisY(HeavyRouteLineValueProvider.class));
        concurrentHashMap.put(setProperties.class, new getAssertive0phEisY(getSubscripty9eOQZsannotations.class, SearchAddressKt.class));
        concurrentHashMap.put(setClearingSemantics.class, new getAssertive0phEisY(LoggerFrontendKt.class, AdjustRemoteTrigger.class));
        concurrentHashMap.put(setMergeDescendants.class, new getAssertive0phEisY(getRequiredTypeConverters.class));
        concurrentHashMap.put(isClearingSemantics.class, new getAssertive0phEisY(DoubleKt.class));
        concurrentHashMap.put(isCommittedByInputMethodEditor.class, new getAssertive0phEisY(getPageLeft.class));
        concurrentHashMap.put(EmptySemanticsElement.class, new getAssertive0phEisY(OptionallyRefreshedData.class));
        concurrentHashMap.put(getPolite0phEisY.class, new getAssertive0phEisY(resolveroom_runtime.class));
    }

    public static Class serializer(Class cls, Class cls2) throws KfsValidationException {
        Class clsSerializer;
        Object obj;
        getAssertive0phEisY getassertive0pheisy = (getAssertive0phEisY) IconCompatParcelizer.get(cls);
        ConcurrentHashMap concurrentHashMap = getassertive0pheisy.IconCompatParcelizer;
        if (cls2 == null) {
            clsSerializer = null;
        } else {
            accessgetIndeterminatecp accessgetindeterminatecp = getassertive0pheisy.read;
            Class cls3 = accessgetindeterminatecp.containsKey(cls2) ? (Class) accessgetindeterminatecp.get(cls2) : cls2;
            if (concurrentHashMap.containsKey(Object.class)) {
                obj = concurrentHashMap.get(Object.class);
            } else if (concurrentHashMap.containsKey(cls3)) {
                obj = concurrentHashMap.get(cls3);
            } else {
                clsSerializer = cls3.isArray() ? getAssertive0phEisY.serializer(getassertive0pheisy.serializer, cls3.getComponentType()) : getAssertive0phEisY.serializer(concurrentHashMap, cls3);
                if (clsSerializer != null) {
                    concurrentHashMap.put(cls3, clsSerializer);
                }
            }
            clsSerializer = (Class) obj;
        }
        if (clsSerializer != null) {
            return clsSerializer;
        }
        StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("unsupported target class:");
        sbIconCompatParcelizer.append(cls2.getSimpleName());
        sbIconCompatParcelizer.append(" for constraint:");
        sbIconCompatParcelizer.append(cls.getSimpleName());
        throw new KfsValidationException(sbIconCompatParcelizer.toString());
    }
}
