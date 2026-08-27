package com.mapbox.navigation.core.telemetry.events;

import android.graphics.Bitmap;
import android.util.Base64;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayOutputStream;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes5.dex */
public final class FeedbackHelper {
    public static final FeedbackHelper INSTANCE = new FeedbackHelper();

    private FeedbackHelper() {
    }

    public static final String encodeScreenshot(Bitmap bitmap, BitmapEncodeOptions bitmapEncodeOptions) {
        bitmap.getClass();
        bitmapEncodeOptions.getClass();
        int iMin = Math.min(bitmap.getWidth(), bitmapEncodeOptions.getWidth());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iMin, MathKt.write((iMin * bitmap.getHeight()) / bitmap.getWidth()), true);
        bitmapCreateScaledBitmap.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, bitmapEncodeOptions.getCompressQuality(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        String strEncodeToString = Base64.encodeToString(byteArray, 0);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String[] getFeedbackSubTypes(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -2086290618:
                if (str.equals(FeedbackEvent.ROUTE_NOT_ALLOWED)) {
                    return new String[]{FeedbackEvent.ROUTED_DOWN_A_ONE_WAY, FeedbackEvent.TURN_WAS_NOT_ALLOWED, FeedbackEvent.CARS_NOT_ALLOWED_ON_STREET};
                }
                break;
            case -1687248675:
                if (str.equals(FeedbackEvent.INCORRECT_VISUAL_GUIDANCE)) {
                    return new String[]{FeedbackEvent.TURN_ICON_INCORRECT, FeedbackEvent.STREET_NAME_INCORRECT, FeedbackEvent.INSTRUCTION_UNNECESSARY, FeedbackEvent.INSTRUCTION_MISSING, FeedbackEvent.MANEUVER_INCORRECT, FeedbackEvent.EXIT_INFO_INCORRECT, FeedbackEvent.LANE_GUIDANCE_INCORRECT, FeedbackEvent.INCORRECT_SPEED_LIMIT};
                }
                break;
            case -1383962289:
                if (str.equals(FeedbackEvent.ROUTING_ERROR)) {
                    return new String[]{FeedbackEvent.ROUTE_NOT_DRIVE_ABLE, FeedbackEvent.ROUTE_NOT_PREFERRED, FeedbackEvent.ALTERNATIVE_ROUTE_NOT_EXPECTED, FeedbackEvent.ROUTE_INCLUDED_MISSING_ROADS, FeedbackEvent.ROUTE_HAD_ROADS_TOO_NARROW_TO_PASS};
                }
                break;
            case -1363869974:
                if (str.equals(FeedbackEvent.OTHER_ISSUE)) {
                    return new String[0];
                }
                break;
            case -1061440774:
                if (str.equals(FeedbackEvent.ROAD_ISSUE)) {
                    return new String[]{FeedbackEvent.STREET_PERMANENTLY_BLOCKED_OFF, FeedbackEvent.STREET_TEMPORARILY_BLOCKED_OFF, FeedbackEvent.MISSING_ROAD};
                }
                break;
            case -639231718:
                if (str.equals(FeedbackEvent.INCORRECT_VISUAL)) {
                    return new String[]{FeedbackEvent.STREET_NAME_INCORRECT, FeedbackEvent.INCORRECT_SPEED_LIMIT};
                }
                break;
            case -366483619:
                if (str.equals(FeedbackEvent.ARRIVAL_FEEDBACK_NOT_GOOD)) {
                    return new String[]{FeedbackEvent.ARRIVAL_FEEDBACK_WRONG_LOCATION, FeedbackEvent.ARRIVAL_FEEDBACK_WRONG_ENTRANCE, FeedbackEvent.ARRIVAL_FEEDBACK_CONFUSING_INSTRUCTIONS, FeedbackEvent.ARRIVAL_FEEDBACK_THIS_PLACE_IS_CLOSED};
                }
                break;
            case 203947031:
                if (str.equals(FeedbackEvent.TRAFFIC_ISSUE)) {
                    return new String[]{FeedbackEvent.TRAFFIC_CONGESTION, FeedbackEvent.TRAFFIC_MODERATE, FeedbackEvent.TRAFFIC_NO};
                }
                break;
            case 233867121:
                if (str.equals(FeedbackEvent.ARRIVAL_FEEDBACK_GOOD)) {
                    return new String[0];
                }
                break;
            case 280660347:
                if (str.equals(FeedbackEvent.INCORRECT_AUDIO_GUIDANCE)) {
                    return new String[]{FeedbackEvent.GUIDANCE_TOO_EARLY, FeedbackEvent.GUIDANCE_TOO_LATE, FeedbackEvent.PRONUNCIATION_INCORRECT, FeedbackEvent.ROAD_NAME_REPEATED, FeedbackEvent.INSTRUCTION_MISSING};
                }
                break;
            case 1067145011:
                if (str.equals(FeedbackEvent.POSITIONING_ISSUE)) {
                    return new String[0];
                }
                break;
            case 1276713835:
                if (str.equals(FeedbackEvent.ROAD_CLOSED)) {
                    return new String[]{FeedbackEvent.STREET_PERMANENTLY_BLOCKED_OFF};
                }
                break;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("feedback type ", str, " is not supported"));
        return null;
    }

    public static final String[] getArrivalFeedbackTypes() {
        return new String[]{FeedbackEvent.ARRIVAL_FEEDBACK_GOOD, FeedbackEvent.ARRIVAL_FEEDBACK_NOT_GOOD};
    }

    public static /* synthetic */ String encodeScreenshot$default(Bitmap bitmap, BitmapEncodeOptions bitmapEncodeOptions, int i, Object obj) {
        if ((i & 2) != 0) {
            bitmapEncodeOptions = new BitmapEncodeOptions.Builder().build();
        }
        return encodeScreenshot(bitmap, bitmapEncodeOptions);
    }

    public static final String[] getFreeDriveFeedbackTypes() {
        return new String[]{FeedbackEvent.INCORRECT_VISUAL, FeedbackEvent.ROAD_ISSUE, FeedbackEvent.TRAFFIC_ISSUE, FeedbackEvent.POSITIONING_ISSUE, FeedbackEvent.OTHER_ISSUE};
    }

    public static final String[] getActiveNavigationFeedbackTypes() {
        return new String[]{FeedbackEvent.INCORRECT_VISUAL_GUIDANCE, FeedbackEvent.INCORRECT_AUDIO_GUIDANCE, FeedbackEvent.ROUTING_ERROR, FeedbackEvent.ROUTE_NOT_ALLOWED, FeedbackEvent.ROAD_CLOSED, FeedbackEvent.POSITIONING_ISSUE};
    }

    public static final String encodeScreenshot(Bitmap bitmap) {
        bitmap.getClass();
        return encodeScreenshot$default(bitmap, null, 2, null);
    }
}
