package com.mapbox.navigation.core.telemetry.events;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes5.dex */
public final class FeedbackEvent {
    public static final String ALTERNATIVE_ROUTE_NOT_EXPECTED = "alternative_route_not_expected";
    public static final String ARRIVAL_FEEDBACK_CONFUSING_INSTRUCTIONS = "arrival_feedback_confusing_instructions";
    public static final String ARRIVAL_FEEDBACK_GOOD = "arrival_feedback_good";
    public static final String ARRIVAL_FEEDBACK_NOT_GOOD = "arrival_feedback_not_good";
    public static final String ARRIVAL_FEEDBACK_THIS_PLACE_IS_CLOSED = "arrival_feedback_this_place_is_closed";
    public static final String ARRIVAL_FEEDBACK_WRONG_ENTRANCE = "arrival_feedback_wrong_entrance";
    public static final String ARRIVAL_FEEDBACK_WRONG_LOCATION = "arrival_feedback_wrong_location";
    public static final String CARS_NOT_ALLOWED_ON_STREET = "cars_not_allowed_on_street";
    public static final String DRIVER_MODE_FREE_DRIVE = "freeDrive";
    public static final String DRIVER_MODE_TRIP = "trip";
    public static final String EXIT_INFO_INCORRECT = "exit_info_incorrect";
    public static final String GUIDANCE_TOO_EARLY = "guidance_too_early";
    public static final String GUIDANCE_TOO_LATE = "guidance_too_late";
    public static final String INCORRECT_AUDIO_GUIDANCE = "incorrect_audio_guidance";
    public static final String INCORRECT_SPEED_LIMIT = "incorrect_speed_limit";
    public static final String INCORRECT_VISUAL = "incorrect_visual";
    public static final String INCORRECT_VISUAL_GUIDANCE = "incorrect_visual_guidance";
    public static final FeedbackEvent INSTANCE = new FeedbackEvent();
    public static final String INSTRUCTION_MISSING = "instruction_missing";
    public static final String INSTRUCTION_UNNECESSARY = "instruction_unnecessary";
    public static final String LANE_GUIDANCE_INCORRECT = "lane_guidance_incorrect";
    public static final String MANEUVER_INCORRECT = "maneuver_incorrect";
    public static final String MISSING_ROAD = "missing_road";
    public static final String OTHER_ISSUE = "other_issue";
    public static final String POSITIONING_ISSUE = "positioning_issue";
    public static final String PRONUNCIATION_INCORRECT = "pronunciation_incorrect";
    public static final String REROUTE = "reroute";
    public static final String ROAD_CLOSED = "road_closed";
    public static final String ROAD_ISSUE = "road_issue";
    public static final String ROAD_NAME_REPEATED = "road_name_repeated";
    public static final String ROUTED_DOWN_A_ONE_WAY = "routed_down_a_one_way";
    public static final String ROUTE_HAD_ROADS_TOO_NARROW_TO_PASS = "route_had_roads_too_narrow_to_pass";
    public static final String ROUTE_INCLUDED_MISSING_ROADS = "route_included_missing_roads";
    public static final String ROUTE_NOT_ALLOWED = "route_not_allowed";
    public static final String ROUTE_NOT_DRIVE_ABLE = "route_not_driveable";
    public static final String ROUTE_NOT_PREFERRED = "route_not_preferred";
    public static final String ROUTING_ERROR = "routing_error";
    public static final String STREET_NAME_INCORRECT = "street_name_incorrect";
    public static final String STREET_PERMANENTLY_BLOCKED_OFF = "street_permanently_blocked_off";
    public static final String STREET_TEMPORARILY_BLOCKED_OFF = "street_temporarily_blocked_off";
    public static final String TRAFFIC_CONGESTION = "traffic_congestion";
    public static final String TRAFFIC_ISSUE = "traffic_issue";
    public static final String TRAFFIC_MODERATE = "traffic_moderate";
    public static final String TRAFFIC_NO = "traffic_no";
    public static final String TURN_ICON_INCORRECT = "turn_icon_incorrect";
    public static final String TURN_WAS_NOT_ALLOWED = "turn_was_not_allowed";
    public static final String UI = "user";
    public static final String VOICE_FEEDBACK = "voice_feedback";

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface DriverMode {
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.CLASS)
    @onItemDismisslambda0
    public @interface Source {
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.CLASS)
    public @interface SubType {
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.CLASS)
    public @interface Type {
    }

    private FeedbackEvent() {
    }
}
