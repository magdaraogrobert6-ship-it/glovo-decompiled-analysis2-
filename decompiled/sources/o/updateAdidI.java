package o;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.huawei.riemann.location.common.utils.Constant;
import org.joda.time.DateTimeConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class updateAdidI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ updateAdidI[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    private final String firebaseFlagName;
    public static final updateAdidI HEATMAP_ENABLED = new updateAdidI("HEATMAP_ENABLED", 0, "heatmap_enabled");
    public static final updateAdidI MOCK_LOCATION_EQUIPMENT = new updateAdidI("MOCK_LOCATION_EQUIPMENT", 1, "mock_location_equipment");
    public static final updateAdidI TWILIO_ENABLED = new updateAdidI("TWILIO_ENABLED", 2, "twilio_enabled");
    public static final updateAdidI ACTIVITY_MONITORING_ENABLED = new updateAdidI("ACTIVITY_MONITORING_ENABLED", 3, "activity_monitoring_enabled");
    public static final updateAdidI CUSTOMER_CHAT_ENABLED_FROM = new updateAdidI("CUSTOMER_CHAT_ENABLED_FROM", 4, "customer_chat_enabled_from");
    public static final updateAdidI CALL_VENDOR_ENABLED = new updateAdidI("CALL_VENDOR_ENABLED", 5, "call_vendor_enabled");
    public static final updateAdidI SEARCH_SHIFTS = new updateAdidI("SEARCH_SHIFTS", 6, "search_shifts");
    public static final updateAdidI HISTORY_DISTANCE = new updateAdidI("HISTORY_DISTANCE", 7, "history_distance_enabled");
    public static final updateAdidI LOCATION_SERVICE_CRASH_FIX_ENABLED = new updateAdidI("LOCATION_SERVICE_CRASH_FIX_ENABLED", 8, "location_service_crash_fix_enabled");
    public static final updateAdidI IS_AUTO_ACCEPT_TOGGLE_ENABLED = new updateAdidI("IS_AUTO_ACCEPT_TOGGLE_ENABLED", 9, "auto_accept_toggle_enabled");
    public static final updateAdidI IS_AUTO_ACCEPT_ENABLED = new updateAdidI("IS_AUTO_ACCEPT_ENABLED", 10, "is_auto_accept_enabled");
    public static final updateAdidI HELP_CENTER_TRACKING_ENABLED = new updateAdidI("HELP_CENTER_TRACKING_ENABLED", 11, "help_center_tracking_enabled");
    public static final updateAdidI INSTANT_SHIFTS_ENABLED = new updateAdidI("INSTANT_SHIFTS_ENABLED", 12, "unassigned_shifts_enabled");
    public static final updateAdidI IS_NAVIGATION_MODE_SUPPORTED = new updateAdidI("IS_NAVIGATION_MODE_SUPPORTED", 13, "is_navigation_mode_supported");
    public static final updateAdidI IS_SYSTEM_CURRENCY_FORMATTING_ENABLED = new updateAdidI("IS_SYSTEM_CURRENCY_FORMATTING_ENABLED", 14, "system_currency_formatting_enabled");
    public static final updateAdidI IS_CUSTOMER_CHAT_CALL_MASKING_ENABLED = new updateAdidI("IS_CUSTOMER_CHAT_CALL_MASKING_ENABLED", 15, "customer_chat_call_masking_enabled");
    public static final updateAdidI IS_RIDER_REVIEWS_OF_VENDORS_ENABLED = new updateAdidI("IS_RIDER_REVIEWS_OF_VENDORS_ENABLED", 16, "rider_reviews_of_vendors_enabled");
    public static final updateAdidI START_WORKING_IDENTITY_VERIFICATION_ENABLED = new updateAdidI("START_WORKING_IDENTITY_VERIFICATION_ENABLED", 17, "start_working_identity_verification_enabled");
    public static final updateAdidI APP_REVIEW_MODE_ENABLED = new updateAdidI("APP_REVIEW_MODE_ENABLED", 18, "app_review_mode_enabled");
    public static final updateAdidI SHOW_VENDOR_LABEL_ON_GOOGLE_MAPS = new updateAdidI("SHOW_VENDOR_LABEL_ON_GOOGLE_MAPS", 19, "show_vendor_label_on_google_maps");
    public static final updateAdidI SHOW_CUSTOMER_LABEL_ON_GOOGLE_MAPS = new updateAdidI("SHOW_CUSTOMER_LABEL_ON_GOOGLE_MAPS", 20, "show_customer_label_on_google_maps");
    public static final updateAdidI IS_APP_REVIEW_TRIGGER_ENABLED = new updateAdidI("IS_APP_REVIEW_TRIGGER_ENABLED", 21, "is_in_app_review_enabled");
    public static final updateAdidI IS_SAFETY_OPTION_AVAILABLE_IN_SETTINGS = new updateAdidI("IS_SAFETY_OPTION_AVAILABLE_IN_SETTINGS", 22, "is_safety_option_available_in_settings");
    public static final updateAdidI IS_RIDER_SAFETY_DISABLING_BATTERY_OPTIMIZATION_ALLOWED = new updateAdidI("IS_RIDER_SAFETY_DISABLING_BATTERY_OPTIMIZATION_ALLOWED", 23, "rider_safety_disabling_battery_optimization_allowed");
    public static final updateAdidI IS_RIDER_SAFETY_TIMEOUT_FIX_ENABLED = new updateAdidI("IS_RIDER_SAFETY_TIMEOUT_FIX_ENABLED", 24, "rider_safety_timeout_fix_enabled_android");
    public static final updateAdidI IS_SENTIANCE_ADDITIONAL_LOG_ENABLED = new updateAdidI("IS_SENTIANCE_ADDITIONAL_LOG_ENABLED", 25, "is_sentiance_additional_log_enabled_android");
    public static final updateAdidI IS_RIDER_SAFETY_PHASE2_ENABLED = new updateAdidI("IS_RIDER_SAFETY_PHASE2_ENABLED", 26, "rider_safety_phase2_enabled");
    public static final updateAdidI CAN_DISPLAY_RIDER_SAFETY_NEW_TAG = new updateAdidI("CAN_DISPLAY_RIDER_SAFETY_NEW_TAG", 27, "can_display_rider_safety_new_tag");
    public static final updateAdidI IS_PICTURE_FROM_GALLERY_ENABLED = new updateAdidI("IS_PICTURE_FROM_GALLERY_ENABLED", 28, "is_picture_from_gallery_enabled");
    public static final updateAdidI IS_OFF_SHIFT_PICTURE_FROM_GALLERY_ENABLED = new updateAdidI("IS_OFF_SHIFT_PICTURE_FROM_GALLERY_ENABLED", 29, "is_off_shift_picture_from_gallery_enabled");
    public static final updateAdidI IS_WEB_DISPATCHER_CHAT_CHAT_BUBBLE_ENABLED = new updateAdidI("IS_WEB_DISPATCHER_CHAT_CHAT_BUBBLE_ENABLED", 30, "dispatcher_chat_chat_bubble_enabled");
    public static final updateAdidI IS_WEB_DISPATCHER_CHAT_UNREAD_COUNT_THROTTLING_ENABLED = new updateAdidI("IS_WEB_DISPATCHER_CHAT_UNREAD_COUNT_THROTTLING_ENABLED", 31, "dispatcher_chat_unread_count_throttling_enabled");
    public static final updateAdidI IS_PUSH_NOTIFICATION_RECEIVED_AT_ACK_ENABLED = new updateAdidI("IS_PUSH_NOTIFICATION_RECEIVED_AT_ACK_ENABLED", 32, "received_timestamp_acknowledgement_enabled");
    public static final updateAdidI IS_TURN_BY_TURN_DEPENDENCIES_ASYNC_LOAD_ENABLED = new updateAdidI("IS_TURN_BY_TURN_DEPENDENCIES_ASYNC_LOAD_ENABLED", 33, "is_turn_by_turn_dependencies_async_load_enabled");
    public static final updateAdidI IS_TURN_BY_TURN_BUILDING_HIGHLIGHT_ENABLED = new updateAdidI("IS_TURN_BY_TURN_BUILDING_HIGHLIGHT_ENABLED", 34, "is_turn_by_turn_building_highlight_enabled");
    public static final updateAdidI IS_TRACKING_SCREEN_TIME_TO_INTERACTIVE_ENABLED = new updateAdidI("IS_TRACKING_SCREEN_TIME_TO_INTERACTIVE_ENABLED", 35, "tracking_screen_time_to_interactive_enabled");
    public static final updateAdidI LRTMI_ANDROID_FWF_PERSEUS_TRACKING_ENABLED = new updateAdidI("LRTMI_ANDROID_FWF_PERSEUS_TRACKING_ENABLED", 36, "lrtmi_android_fwf_perseus_tracking_enabled_v2");
    public static final updateAdidI IS_LIVENESS_DETECTION_ENABLED = new updateAdidI("IS_LIVENESS_DETECTION_ENABLED", 37, "liveness_detection_v3_enabled");
    public static final updateAdidI IS_RECENT_DELIVERIES_ENABLED = new updateAdidI("IS_RECENT_DELIVERIES_ENABLED", 38, "is_recent_deliveries_android_enabled");
    public static final updateAdidI IS_STATE_MACHINE_INITIALIZER_ENABLED = new updateAdidI("IS_STATE_MACHINE_INITIALIZER_ENABLED", 39, "is_state_machine_initializer_enabled");
    public static final updateAdidI IS_AUTH_STATE_MACHINE_ENABLED = new updateAdidI("IS_AUTH_STATE_MACHINE_ENABLED", 40, "auth_state_machine_enabled");
    public static final updateAdidI IS_RESET_STALE_LOGOUT_STATE_ENABLED = new updateAdidI("IS_RESET_STALE_LOGOUT_STATE_ENABLED", 41, "is_reset_stale_logout_state_enabled");
    public static final updateAdidI IS_ASYNC_LOGIN_FLOW_ENABLED = new updateAdidI("IS_ASYNC_LOGIN_FLOW_ENABLED", 42, "is_async_login_flow_enabled_v3");
    public static final updateAdidI IS_HUAWEI_DEVICE_CHECK_ENABLED = new updateAdidI("IS_HUAWEI_DEVICE_CHECK_ENABLED", 43, "is_huawei_device_check_enabled");
    public static final updateAdidI IS_LIVENESS_PROCEED_ANYWAY_BUTTON_DISABLED = new updateAdidI("IS_LIVENESS_PROCEED_ANYWAY_BUTTON_DISABLED", 44, "is_liveness_proceed_anyway_button_disabled");
    public static final updateAdidI IS_RIDER_RECRUITMENT_PHASE_2_ENABLED = new updateAdidI("IS_RIDER_RECRUITMENT_PHASE_2_ENABLED", 45, "is_rider_recruitment_phase_two_enabled");
    public static final updateAdidI IS_NOTIFICATION_OVERLAY_ENABLED = new updateAdidI("IS_NOTIFICATION_OVERLAY_ENABLED", 46, "is_notification_overlay_enabled");
    public static final updateAdidI IS_LOGIN_LOGGER_SUCCESS_TRACKING_ENABLED = new updateAdidI("IS_LOGIN_LOGGER_SUCCESS_TRACKING_ENABLED", 47, "is_login_logger_success_tracking_enabled");
    public static final updateAdidI IS_LOGIN_LOGGER_FAILURE_TRACKING_ENABLED = new updateAdidI("IS_LOGIN_LOGGER_FAILURE_TRACKING_ENABLED", 48, "is_login_logger_failure_tracking_enabled");
    public static final updateAdidI IS_LOGIN_LOGGER_TRACKING_ENABLED = new updateAdidI("IS_LOGIN_LOGGER_TRACKING_ENABLED", 49, "is_login_logger_tracking_enabled");
    public static final updateAdidI IS_LOGIN_LOGGER_FALLBACK_ENABLED = new updateAdidI("IS_LOGIN_LOGGER_FALLBACK_ENABLED", 50, "is_login_logger_fallback_enabled");
    public static final updateAdidI IS_SENTRY_NON_FATAL_LOGS_ENABLED = new updateAdidI("IS_SENTRY_NON_FATAL_LOGS_ENABLED", 51, "android_sentry_non_fatal_logs_enabled");
    public static final updateAdidI IS_SENTRY_NDK_ENABLED = new updateAdidI("IS_SENTRY_NDK_ENABLED", 52, "android_sentry_ndk_enabled");
    public static final updateAdidI IS_SENTRY_ADDITIONAL_CONTEXT_ENABLED = new updateAdidI("IS_SENTRY_ADDITIONAL_CONTEXT_ENABLED", 53, "android_sentry_additional_context_enabled");
    public static final updateAdidI IS_SENTRY_ATTACH_VIEW_HIERARCHY_ENABLED = new updateAdidI("IS_SENTRY_ATTACH_VIEW_HIERARCHY_ENABLED", 54, "android_sentry_attach_view_hierarchy_enabled");
    public static final updateAdidI IS_SENTRY_USER_INTERACTIONS_ENABLED = new updateAdidI("IS_SENTRY_USER_INTERACTIONS_ENABLED", 55, "android_sentry_user_interactions_enabled");
    public static final updateAdidI IS_SENTRY_CUSTOM_TRACES_ENABLED = new updateAdidI("IS_SENTRY_CUSTOM_TRACES_ENABLED", 56, "android_sentry_custom_traces_enabled");
    public static final updateAdidI IS_SENTRY_TOMBSTONE_ENABLED = new updateAdidI("IS_SENTRY_TOMBSTONE_ENABLED", 57, "android_sentry_tombstone_enabled");
    public static final updateAdidI IS_RIDER_RECRUITMENT_PHASE_2_AUTO_LOGIN_ENABLED = new updateAdidI("IS_RIDER_RECRUITMENT_PHASE_2_AUTO_LOGIN_ENABLED", 58, "is_rider_recruitment_phase_two_auto_login_enabled");
    public static final updateAdidI IS_SEAMLESS_TOKEN_REFRESH_ENABLED = new updateAdidI("IS_SEAMLESS_TOKEN_REFRESH_ENABLED", 59, "is_seamless_token_refresh_enabled_v1");
    public static final updateAdidI IS_AUTH_STATE_MACHINE_FOR_LOGOUT_ENABLED = new updateAdidI("IS_AUTH_STATE_MACHINE_FOR_LOGOUT_ENABLED", 60, "is_auth_state_machine_for_logout_enabled");
    public static final updateAdidI IS_STACKED_DELIVERY_LIST_ENABLED = new updateAdidI("IS_STACKED_DELIVERY_LIST_ENABLED", 61, "is_stacked_delivery_list_enabled");
    public static final updateAdidI IS_CUSTOMER_UNAVAILABLE_KILLSWITCH_ENABLED = new updateAdidI("IS_CUSTOMER_UNAVAILABLE_KILLSWITCH_ENABLED", 62, "killswitch_customer_unavailable");
    public static final updateAdidI IS_RIDER_SAFETY_BACKGROUND_INIT_ENABLED = new updateAdidI("IS_RIDER_SAFETY_BACKGROUND_INIT_ENABLED", 63, "is_rider_safety_background_init_enabled_v3");
    public static final updateAdidI IS_BIOMETRICS_ENABLED = new updateAdidI("IS_BIOMETRICS_ENABLED", 64, "biometric_login_enabled");
    public static final updateAdidI IS_BOTTOM_SHEET_HEIGHT_DYNAMIC_ENABLED = new updateAdidI("IS_BOTTOM_SHEET_HEIGHT_DYNAMIC_ENABLED", 65, "is_bottom_sheet_height_dynamic_enabled");
    public static final updateAdidI IS_AUTO_ACCEPT_BACKGROUND_ENABLED = new updateAdidI("IS_AUTO_ACCEPT_BACKGROUND_ENABLED", 66, "auto_accept_background_enabled");
    public static final updateAdidI IS_AUTO_ACCEPT_EARNING_DISPLAY_ENABLED = new updateAdidI("IS_AUTO_ACCEPT_EARNING_DISPLAY_ENABLED", 67, "auto_accept_earnings_display_enabled");
    public static final updateAdidI IS_SEAMLESS_TOKEN_FOR_RIDER_HIRING_ENABLED = new updateAdidI("IS_SEAMLESS_TOKEN_FOR_RIDER_HIRING_ENABLED", 68, "is_seamless_token_for_rider_hiring_enabled");
    public static final updateAdidI IS_LOGIN_LOGGER_SUCCESS_DISABLED = new updateAdidI("IS_LOGIN_LOGGER_SUCCESS_DISABLED", 69, "is_login_logger_success_disabled");
    public static final updateAdidI IS_LOGIN_LOGGER_FAILURE_DISABLED = new updateAdidI("IS_LOGIN_LOGGER_FAILURE_DISABLED", 70, "is_login_logger_failure_disabled");
    public static final updateAdidI IS_MAIN_SCREEN_LOGGER_ENABLED = new updateAdidI("IS_MAIN_SCREEN_LOGGER_ENABLED", 71, "is_main_screen_logger_enabled");
    public static final updateAdidI IS_RUSH_BONUS_PHASE_1_ENABLED = new updateAdidI("IS_RUSH_BONUS_PHASE_1_ENABLED", 72, "is_rush_bonus_phase1_enabled_v2");
    public static final updateAdidI IS_INSTANT_DELIVERY_SEEN_ENABLED = new updateAdidI("IS_INSTANT_DELIVERY_SEEN_ENABLED", 73, "is_instant_delivery_seen_enabled");
    public static final updateAdidI IS_PUSH_NOTIFICATION_FOR_APPLICANT_ENABLED = new updateAdidI("IS_PUSH_NOTIFICATION_FOR_APPLICANT_ENABLED", 74, "is_push_notification_for_applicant_enabled");
    public static final updateAdidI IS_DEBOUNCE_LOCATION_SERVICE_ACTIONS = new updateAdidI("IS_DEBOUNCE_LOCATION_SERVICE_ACTIONS", 75, "is_debounce_location_service_actions");
    public static final updateAdidI SHOULD_ALLOW_SEAMLESS_TOKEN_FIREBASE_LOGGING = new updateAdidI("SHOULD_ALLOW_SEAMLESS_TOKEN_FIREBASE_LOGGING", 76, "should_allow_seamless_token_firebase_logging");
    public static final updateAdidI IS_MAP_CLUSTERING_ENABLED = new updateAdidI("IS_MAP_CLUSTERING_ENABLED", 77, "is_map_clustering_enabled");
    public static final updateAdidI IS_START_WORKING_EQUIPMENT_FIX_ENABLED = new updateAdidI("IS_START_WORKING_EQUIPMENT_FIX_ENABLED", 78, "is_start_working_equipment_fix_enabled");
    public static final updateAdidI IS_HELP_CENTER_NAVIGATION_FIX_ENABLED = new updateAdidI("IS_HELP_CENTER_NAVIGATION_FIX_ENABLED", 79, "is_help_center_navigation_fix_enabled_v2");
    public static final updateAdidI IS_PERSEUS_EMPTY_VALUES_FIX_ENABLED = new updateAdidI("IS_PERSEUS_EMPTY_VALUES_FIX_ENABLED", 80, "is_perseus_empty_values_fix_enabled");
    public static final updateAdidI IS_BIOMETRIC_BASELINE_TRACKING_ENABLED = new updateAdidI("IS_BIOMETRIC_BASELINE_TRACKING_ENABLED", 81, "is_biometric_baseline_tracking_enabled");
    public static final updateAdidI IS_PICKUP_DROPOFF_TAP_TO_PAY_TASK_ENABLED = new updateAdidI("IS_PICKUP_DROPOFF_TAP_TO_PAY_TASK_ENABLED", 82, "is_tap_to_pay_task_enabled");
    public static final updateAdidI IS_TRIP_PLANNER_ENABLED = new updateAdidI("IS_TRIP_PLANNER_ENABLED", 83, "is_trip_planner_enabled");
    public static final updateAdidI IS_RESET_PASSWORD_BY_MAGIC_LINK_ENABLED = new updateAdidI("IS_RESET_PASSWORD_BY_MAGIC_LINK_ENABLED", 84, "is_reset_password_by_magic_link_enabled_v2");
    public static final updateAdidI IS_CUSTOMER_UNAVAILABLE_CANCEL_FLOW_ENABLED = new updateAdidI("IS_CUSTOMER_UNAVAILABLE_CANCEL_FLOW_ENABLED", 85, "customer_unavailable_cancel_flow_enabled");
    public static final updateAdidI IS_RIDER_STATE_CHANGE_SILENT_PUSH_ENABLED = new updateAdidI("IS_RIDER_STATE_CHANGE_SILENT_PUSH_ENABLED", 86, "is_rider_state_change_silent_push_enabled");
    public static final updateAdidI IS_ACTIONABLE_CUSTOMER_CHAT_NOTIFICATION_ENABLED = new updateAdidI("IS_ACTIONABLE_CUSTOMER_CHAT_NOTIFICATION_ENABLED", 87, "actionable_customer_chat_notification_enabled");
    public static final updateAdidI IS_SESSIONS_ON_MAP_PHASE_1_ENABLED = new updateAdidI("IS_SESSIONS_ON_MAP_PHASE_1_ENABLED", 88, "is_sessions_on_map_phase1_enabled");
    public static final updateAdidI IS_WEBVIEW_HEADER_HIDING_ENABLED = new updateAdidI("IS_WEBVIEW_HEADER_HIDING_ENABLED", 89, "is_webview_header_hiding_enabled");
    public static final updateAdidI IS_TURN_BY_TURN_ENABLED = new updateAdidI("IS_TURN_BY_TURN_ENABLED", 90, "is_turn_by_turn_navigation_enabled");
    public static final updateAdidI IS_RIDER_ONBOARDING_CDA_ENABLED = new updateAdidI("IS_RIDER_ONBOARDING_CDA_ENABLED", 91, "is_v2_rider_onboarding_cda_enabled_android");
    public static final updateAdidI IS_SUPPORT_FOR_NO_ZONE_RENDERING_ENABLED = new updateAdidI("IS_SUPPORT_FOR_NO_ZONE_RENDERING_ENABLED", 92, "is_support_for_no_zone_rendering_enabled_android");
    public static final updateAdidI IS_KILL_REFRESH_BUTTON_EXPERIMENT_ENABLED = new updateAdidI("IS_KILL_REFRESH_BUTTON_EXPERIMENT_ENABLED", 93, "refresh_button_experiment_kill_switch");
    public static final updateAdidI IS_ORDER_STATUS_COUNTDOWN_KILLSWITCH_ENABLED = new updateAdidI("IS_ORDER_STATUS_COUNTDOWN_KILLSWITCH_ENABLED", 94, "order_status_countdown_killswitch");
    public static final updateAdidI IS_SPLIT_ORDER_INSTRUCTION_KILLSWITCH_ENABLED = new updateAdidI("IS_SPLIT_ORDER_INSTRUCTION_KILLSWITCH_ENABLED", 95, "split_order_instruction_kill_switch");
    public static final updateAdidI IS_GPS_STATE_LISTENER_FOR_LOCATION_UPDATES_ENABLED = new updateAdidI("IS_GPS_STATE_LISTENER_FOR_LOCATION_UPDATES_ENABLED", 96, "is_gps_state_listener_for_location_updates_enabled");
    public static final updateAdidI IS_UPLOAD_IMAGE_TASK_PATH_FIX_ENABLED = new updateAdidI("IS_UPLOAD_IMAGE_TASK_PATH_FIX_ENABLED", 97, "upload_image_task_path_fix_enabled");
    public static final updateAdidI SHOULD_BLOCK_LOGOUT_ON_ACTIVE_ORDER = new updateAdidI("SHOULD_BLOCK_LOGOUT_ON_ACTIVE_ORDER", 98, "should_block_logout_on_active_order");
    public static final updateAdidI IS_ORDER_DETAILS_EXTRA_ITEMS_KILLSWITCH_ENABLED = new updateAdidI("IS_ORDER_DETAILS_EXTRA_ITEMS_KILLSWITCH_ENABLED", 99, "order_details_extra_items_killswitch");
    public static final updateAdidI IS_LOCATION_PERMISSION_DISMISSIBLE_ENABLED = new updateAdidI("IS_LOCATION_PERMISSION_DISMISSIBLE_ENABLED", 100, "is_location_permission_dismissible_enabled");
    public static final updateAdidI IS_SESSION_LOG_ENABLED = new updateAdidI("IS_SESSION_LOG_ENABLED", 101, "is_session_log_enabled");
    public static final updateAdidI IS_SESSION_LOG_FOR_AR_ENABLED = new updateAdidI("IS_SESSION_LOG_FOR_AR_ENABLED", 102, "is_session_log_for_ar_enabled");
    public static final updateAdidI IS_HEATMAP_IN_STARTING_STATE_ENABLED = new updateAdidI("IS_HEATMAP_IN_STARTING_STATE_ENABLED", 103, "is_heatmap_in_starting_state_enabled");
    public static final updateAdidI IS_GO_AND_START_ENABLED = new updateAdidI("IS_GO_AND_START_ENABLED", 104, "is_go_and_start_enabled");
    public static final updateAdidI IS_NAVER_MAPS_ENABLED = new updateAdidI("IS_NAVER_MAPS_ENABLED", 105, "naver_enabled");
    public static final updateAdidI IS_INTUITIVE_ZOOM_ENABLED = new updateAdidI("IS_INTUITIVE_ZOOM_ENABLED", GwiErrorCode.ALG_LIBRARY_NOT_EXIST, "is_intuitive_zoom_enabled");
    public static final updateAdidI IS_REFRESH_STATE_ON_START_WORKING_FAILURE_ENABLED = new updateAdidI("IS_REFRESH_STATE_ON_START_WORKING_FAILURE_ENABLED", 107, "is_refresh_state_on_start_now_failure_enabled");
    public static final updateAdidI IS_TBT_TRIP_INFORMATION_DISTANCE_DISABLED = new updateAdidI("IS_TBT_TRIP_INFORMATION_DISTANCE_DISABLED", ActivityIdentificationData.RUNNING, "is_tbt_trip_information_distance_disabled");
    public static final updateAdidI IS_TBT_TRIP_INFORMATION_TIME_DISABLED = new updateAdidI("IS_TBT_TRIP_INFORMATION_TIME_DISABLED", 109, "is_tbt_trip_information_time_disabled");
    public static final updateAdidI IS_ORDER_DETAILS_INSTRUCTIONS_V2_KILLSWITCH_ENABLED = new updateAdidI("IS_ORDER_DETAILS_INSTRUCTIONS_V2_KILLSWITCH_ENABLED", 110, "order_details_instructions_v2_killswitch");
    public static final updateAdidI IS_ENTRANCE_PINS_V1_KILLSWITCH_ENABLED = new updateAdidI("IS_ENTRANCE_PINS_V1_KILLSWITCH_ENABLED", 111, "entrance_pins_v1_killswitch");
    public static final updateAdidI IS_RESET_PASSWORD_FLEXIBILITY_ENABLED = new updateAdidI("IS_RESET_PASSWORD_FLEXIBILITY_ENABLED", 112, "is_reset_password_flexibility_enabled");
    public static final updateAdidI IS_PERSIST_TIMER_IN_RESET_PASSWORD_ENABLED = new updateAdidI("IS_PERSIST_TIMER_IN_RESET_PASSWORD_ENABLED", 113, "is_persist_timer_in_reset_password_enabled_temp");
    public static final updateAdidI IS_TURN_BY_TURN_ROUTE_PREVIEW_ENABLED = new updateAdidI("IS_TURN_BY_TURN_ROUTE_PREVIEW_ENABLED", 114, "is_turn_by_turn_route_preview_enabled");
    public static final updateAdidI IS_BACK_TO_BACK_ORDERS_ENABLED = new updateAdidI("IS_BACK_TO_BACK_ORDERS_ENABLED", 115, "back_to_back_orders_enabled");
    public static final updateAdidI IS_KEEP_SCREEN_ON_ENABLED = new updateAdidI("IS_KEEP_SCREEN_ON_ENABLED", 116, "is_keep_screen_on_enabled");
    public static final updateAdidI IS_INCOGNIA_SDK_ENABLED = new updateAdidI("IS_INCOGNIA_SDK_ENABLED", 117, "is_incognia_sdk_enabled");
    public static final updateAdidI IS_INCOGNIA_TOKEN_IN_API_REQUESTS_ENABLED = new updateAdidI("IS_INCOGNIA_TOKEN_IN_API_REQUESTS_ENABLED", 118, "is_incognia_token_in_api_http_requests_enabled");
    public static final updateAdidI IS_CASH_BLOCK_ENABLED = new updateAdidI("IS_CASH_BLOCK_ENABLED", 119, "is_cash_block_enabled_v2");
    public static final updateAdidI IS_NEAR_DESTINATION_OBSERVER_ENABLED = new updateAdidI("IS_NEAR_DESTINATION_OBSERVER_ENABLED", 120, "is_near_destination_observer_enabled");
    public static final updateAdidI IS_ENTRANCE_PICTURE_ENABLED = new updateAdidI("IS_ENTRANCE_PICTURE_ENABLED", 121, "entrance_picture_enabled");
    public static final updateAdidI IS_FOREGROUND_SOUND_AUTO_STOP_ENABLED = new updateAdidI("IS_FOREGROUND_SOUND_AUTO_STOP_ENABLED", 122, "is_foreground_sound_auto_stop_enabled");
    public static final updateAdidI IS_CUSTOMER_CHAT_TOKEN_REFRESH_ENABLED = new updateAdidI("IS_CUSTOMER_CHAT_TOKEN_REFRESH_ENABLED", 123, "is_customer_chat_token_refresh_enabled");
    public static final updateAdidI IS_HOME_RESPONSE_VALIDATION_SYNCHRONOUS_DISABLED = new updateAdidI("IS_HOME_RESPONSE_VALIDATION_SYNCHRONOUS_DISABLED", 124, "is_home_response_validation_synchronous_disabled");
    public static final updateAdidI IS_FIREBASE_TO_FWF_MIGRATION_ENABLED = new updateAdidI("IS_FIREBASE_TO_FWF_MIGRATION_ENABLED", 125, "is_firebase_to_fwf_migration_enabled");
    public static final updateAdidI IS_CUSTOMER_UNAVAILABLE_TAKE_PHOTO_KILLSWITCH_ENABLED = new updateAdidI("IS_CUSTOMER_UNAVAILABLE_TAKE_PHOTO_KILLSWITCH_ENABLED", 126, "customer_unavailable_take_photo_killswitch");
    public static final updateAdidI IS_MAPBOX_LOGGING_ENABLED = new updateAdidI("IS_MAPBOX_LOGGING_ENABLED", 127, "is_mapbox_logging_enabled");
    public static final updateAdidI IS_TRUSTED_TIME_BLOCKING_UI_ENABLED = new updateAdidI("IS_TRUSTED_TIME_BLOCKING_UI_ENABLED", androidx.compose.ui.graphics.Fields.SpotShadowColor, "is_trusted_time_blocking_ui_enabled");
    public static final updateAdidI IS_HEURISTICS_IMPROVEMENTS_ENABLED = new updateAdidI("IS_HEURISTICS_IMPROVEMENTS_ENABLED", 129, "is_heuristics_improvements_enabled");
    public static final updateAdidI BACK_TO_BACK_ORDERS_REDISPATCHED_MESSAGE_ENABLED = new updateAdidI("BACK_TO_BACK_ORDERS_REDISPATCHED_MESSAGE_ENABLED", 130, "back_to_back_orders_redispatched_message_enabled");
    public static final updateAdidI IS_NATIVE_ACCOUNT_CREATION_ENABLED = new updateAdidI("IS_NATIVE_ACCOUNT_CREATION_ENABLED", 131, "is_native_account_creation_enabled");
    public static final updateAdidI TAKE_PICTURE_TASK_NEW_CAMERA_OVERLAY_KILL_SWITCH_ENABLED = new updateAdidI("TAKE_PICTURE_TASK_NEW_CAMERA_OVERLAY_KILL_SWITCH_ENABLED", 132, "take_picture_task_new_camera_overlay_killswitch");
    public static final updateAdidI IS_TURN_BY_TURN_VOICE_INSTRUCTIONS_ENABLED = new updateAdidI("IS_TURN_BY_TURN_VOICE_INSTRUCTIONS_ENABLED", 133, "is_turn_by_turn_voice_instructions_enabled");
    public static final updateAdidI IS_CUSTOMER_UNAVAILABLE_IVR_CALL_KILLSWITCH_ENABLED = new updateAdidI("IS_CUSTOMER_UNAVAILABLE_IVR_CALL_KILLSWITCH_ENABLED", 134, "customer_unavailable_ivr_call_killswitch");
    public static final updateAdidI IS_DEFAULT_NOTIFICATION_SOUND_CHANGE_ENABLED = new updateAdidI("IS_DEFAULT_NOTIFICATION_SOUND_CHANGE_ENABLED", 135, "default_notification_sound_change_enabled");
    public static final updateAdidI IS_DISPATCHER_CHAT_NOTIFICATIONS_ENABLED = new updateAdidI("IS_DISPATCHER_CHAT_NOTIFICATIONS_ENABLED", 136, "is_dispatcher_chat_notifications_enabled");
    public static final updateAdidI IS_NEW_PERMISSIONS_FLOW_ENABLED = new updateAdidI("IS_NEW_PERMISSIONS_FLOW_ENABLED", 137, "is_new_permissions_flow_enabled");
    public static final updateAdidI IS_DF_PIN_CONNECTORS_ENABLED = new updateAdidI("IS_DF_PIN_CONNECTORS_ENABLED", 138, "is_df_pin_connectors_enabled");
    public static final updateAdidI IS_QUESTS_ENABLED = new updateAdidI("IS_QUESTS_ENABLED", 139, "is_quests_enabled");
    public static final updateAdidI IS_MEDIA_AUDIO_ATTRIBUTES_ENABLED = new updateAdidI("IS_MEDIA_AUDIO_ATTRIBUTES_ENABLED", 140, "is_media_audio_attributes_enabled");
    public static final updateAdidI IS_SMART_POLLING_RACE_CONDITION_FIX_ENABLED = new updateAdidI("IS_SMART_POLLING_RACE_CONDITION_FIX_ENABLED", 141, "android_smart_polling_race_condition_fix");
    public static final updateAdidI IS_SMART_POLLING_IN_OFFLINE_STATE_ENABLED = new updateAdidI("IS_SMART_POLLING_IN_OFFLINE_STATE_ENABLED", 142, "is_smart_polling_in_offline_state_enabled");
    public static final updateAdidI IS_SMART_POLLING_DEBUG_LOGGING_ENABLED = new updateAdidI("IS_SMART_POLLING_DEBUG_LOGGING_ENABLED", 143, "android_is_smart_polling_debug_logging_enabled");
    public static final updateAdidI IS_GOOGLE_PHONE_SANITIZING_ENABLED = new updateAdidI("IS_GOOGLE_PHONE_SANITIZING_ENABLED", 144, "is_google_phone_sanitizing_enabled");
    public static final updateAdidI IS_TAKE_PICTURE_CAMERA_SECURITY_EXCEPTION_FIX_ENABLED = new updateAdidI("IS_TAKE_PICTURE_CAMERA_SECURITY_EXCEPTION_FIX_ENABLED", 145, "is_take_picture_camera_security_exception_fix_enabled");
    public static final updateAdidI IS_DECLINE_ESTIMATION_MIGRATION_ENABLED = new updateAdidI("IS_DECLINE_ESTIMATION_MIGRATION_ENABLED", 146, "is_decline_estimation_migration_enabled");
    public static final updateAdidI IS_ENTRANCE_PICTURE_V2_ENABLED = new updateAdidI("IS_ENTRANCE_PICTURE_V2_ENABLED", 147, "is_entrance_picture_v2_enabled");
    public static final updateAdidI IS_VOIP_CALLING_ENABLED = new updateAdidI("IS_VOIP_CALLING_ENABLED", 148, "is_voip_calling_enabled");
    public static final updateAdidI OTW_VOIP_ENABLE_CALL_FALLBACK_WHEN_MIC_DISABLED = new updateAdidI("OTW_VOIP_ENABLE_CALL_FALLBACK_WHEN_MIC_DISABLED", 149, "otw_voip_enable_call_fallback_when_mic_disabled");
    public static final updateAdidI IS_NAVER_ROUTE_PREVIEW_ENABLED = new updateAdidI("IS_NAVER_ROUTE_PREVIEW_ENABLED", 150, "is_naver_route_preview_enabled");
    public static final updateAdidI IS_FORCE_UPDATE_DIALOG_ON_LOGOUT_ENABLED = new updateAdidI("IS_FORCE_UPDATE_DIALOG_ON_LOGOUT_ENABLED", 151, "is_force_update_dialog_on_logout_enabled_temp");
    public static final updateAdidI IS_DELIVERY_TASKS_DATA_STORE_CACHING_ENABLED = new updateAdidI("IS_DELIVERY_TASKS_DATA_STORE_CACHING_ENABLED", 152, "is_delivery_tasks_data_store_caching_enabled");
    public static final updateAdidI IS_AUDIO_DUCKING_ENABLED = new updateAdidI("IS_AUDIO_DUCKING_ENABLED", 153, "is_audio_ducking_enabled");
    public static final updateAdidI IS_INFRA_PAYMENTS_ON_MAP_ENABLED = new updateAdidI("IS_INFRA_PAYMENTS_ON_MAP_ENABLED", 154, "is_infra_payments_on_map_enabled_temp");
    public static final updateAdidI IS_QR_PAYMENT_TASK_KILLSWITCH_ENABLED = new updateAdidI("IS_QR_PAYMENT_TASK_KILLSWITCH_ENABLED", ModuleDescriptor.MODULE_VERSION, "qr_payment_task_killswitch");
    public static final updateAdidI IS_SHOW_CITY_BOUNDARIES_ENABLED = new updateAdidI("IS_SHOW_CITY_BOUNDARIES_ENABLED", 156, "is_zone_in_online_and_city_grey_enabled");
    public static final updateAdidI IS_OVERRIDE_SILENT_MODE_ENABLED = new updateAdidI("IS_OVERRIDE_SILENT_MODE_ENABLED", 157, "is_override_silent_mode_enabled");
    public static final updateAdidI IS_BACKGROUND_WEBVIEW_WARMUP_ENABLED = new updateAdidI("IS_BACKGROUND_WEBVIEW_WARMUP_ENABLED", 158, "is_background_webview_warmup_enabled_v2");
    public static final updateAdidI IS_UI_THREAD_WEBVIEW_WARMUP_ENABLED = new updateAdidI("IS_UI_THREAD_WEBVIEW_WARMUP_ENABLED", 159, "is_ui_thread_webview_warmup_enabled_v2");
    public static final updateAdidI IS_LOGIN_2FA_ENABLED = new updateAdidI("IS_LOGIN_2FA_ENABLED", 160, "is_login_2fa_enabled");
    public static final updateAdidI IS_SCREEN_SHOT_DETECTION_LOGGING_ENABLED = new updateAdidI("IS_SCREEN_SHOT_DETECTION_LOGGING_ENABLED", 161, "is_screen_shot_detection_logging_enabled");
    public static final updateAdidI IS_SHOW_WEBVIEW_ERROR_OR_CONNECTION_LOST_PAGE_ENABLED = new updateAdidI("IS_SHOW_WEBVIEW_ERROR_OR_CONNECTION_LOST_PAGE_ENABLED", 162, "is_show_webview_error_or_connection_lost_page_enabled");
    public static final updateAdidI IS_QR_CODE_SCAN_AT_PICKUP_KILLSWITCH_ENABLED = new updateAdidI("IS_QR_CODE_SCAN_AT_PICKUP_KILLSWITCH_ENABLED", 163, "qr_code_scan_at_pickup_killswitch");
    public static final updateAdidI IS_QUICK_REPLIES_LOCALIZATION_ENABLED = new updateAdidI("IS_QUICK_REPLIES_LOCALIZATION_ENABLED", 164, "is_quick_replies_localization_enabled");
    public static final updateAdidI IS_ANDROID_16_WEBVIEW_CRASH_FIX_ENABLED = new updateAdidI("IS_ANDROID_16_WEBVIEW_CRASH_FIX_ENABLED", 165, "is_android_16_webview_crash_fix_enabled");
    public static final updateAdidI IS_LOCAL_PUSH_CACHE_AUTO_CLEAR_ENABLED = new updateAdidI("IS_LOCAL_PUSH_CACHE_AUTO_CLEAR_ENABLED", 166, "is_local_push_cache_auto_clear_enabled");
    public static final updateAdidI LAST_STOP_FEATURE_KILLSWTITCH = new updateAdidI("LAST_STOP_FEATURE_KILLSWTITCH", 167, "last_stop_feature_killswitch");
    public static final updateAdidI LAST_STOP_SAVING_ADDRESS_ENABLED = new updateAdidI("LAST_STOP_SAVING_ADDRESS_ENABLED", DateTimeConstants.HOURS_PER_WEEK, "last_stop_saving_address_enabled");
    public static final updateAdidI IS_HELP_CENTER_BUTTON_REMOVED_FROM_ACCEPT_SCREEN = new updateAdidI("IS_HELP_CENTER_BUTTON_REMOVED_FROM_ACCEPT_SCREEN", 169, "is_help_center_button_removed_from_accept_screen");
    public static final updateAdidI IS_LOCATION_PERMISSION_TOGGLE_ENABLED = new updateAdidI("IS_LOCATION_PERMISSION_TOGGLE_ENABLED", 170, "is_location_permission_toggle_enabled");
    public static final updateAdidI IS_HELP_CENTER_NATIVE_LOADING_IMPROVEMENTS_ENABLED = new updateAdidI("IS_HELP_CENTER_NATIVE_LOADING_IMPROVEMENTS_ENABLED", 171, "is_helpcenter_native_loading_improvements_enabled");
    public static final updateAdidI IS_SENSORS_REPORTING_ENABLED = new updateAdidI("IS_SENSORS_REPORTING_ENABLED", 172, "is_sensors_reporting_enabled");
    public static final updateAdidI IS_WEBVIEW_CRASH_HANDLING_ENABLED = new updateAdidI("IS_WEBVIEW_CRASH_HANDLING_ENABLED", 173, "is_webview_crash_handling_enabled");
    public static final updateAdidI IS_WEBVIEW_DETACH_ON_DESTROY_ENABLED = new updateAdidI("IS_WEBVIEW_DETACH_ON_DESTROY_ENABLED", 174, "is_webview_detach_on_destroy_enabled");
    public static final updateAdidI IS_NAFATH_VERIFICATION_ENABLED = new updateAdidI("IS_NAFATH_VERIFICATION_ENABLED", 175, "is_nafath_verification_enabled");
    public static final updateAdidI WEB_VIEW_TNC_CONSENT_FLOW_ENABLED = new updateAdidI("WEB_VIEW_TNC_CONSENT_FLOW_ENABLED", 176, "webview_tnc_consent_flow_enabled_v0");
    public static final updateAdidI IS_SELFIE_CONSENT_ENABLED = new updateAdidI("IS_SELFIE_CONSENT_ENABLED", 177, "is_selfie_consent_enabled");
    public static final updateAdidI SHOULD_UNLOCK_MUTEX_AUTH_SAFELY = new updateAdidI("SHOULD_UNLOCK_MUTEX_AUTH_SAFELY", 178, "should_unlock_mutex_auth_safely");
    public static final updateAdidI USE_JS_ACCESS_TOKEN_ENABLED = new updateAdidI("USE_JS_ACCESS_TOKEN_ENABLED", 179, "use_js_access_token_enabled");
    public static final updateAdidI IS_TURN_BY_TURN_SETTINGS_M1_ENABLED = new updateAdidI("IS_TURN_BY_TURN_SETTINGS_M1_ENABLED", 180, "is_turn_by_turn_settings_m1_enabled");
    public static final updateAdidI IS_OFFLINE_PIN_VALIDATION_KILLSWITCH_ENABLED = new updateAdidI("IS_OFFLINE_PIN_VALIDATION_KILLSWITCH_ENABLED", 181, "offline_pin_validation_killswitch");
    public static final updateAdidI REVOKE_PREVIOUS_LOGIN_SESSION_ENABLED = new updateAdidI("REVOKE_PREVIOUS_LOGIN_SESSION_ENABLED", 182, "revoke_previous_login_session_enabled");
    public static final updateAdidI IS_DESIGN_SYSTEM_MODES_ENABLED = new updateAdidI("IS_DESIGN_SYSTEM_MODES_ENABLED", 183, "is_design_system_modes_enabled_v2");
    public static final updateAdidI IS_DARK_MODE_DISCOVERY_DIALOG_ENABLED = new updateAdidI("IS_DARK_MODE_DISCOVERY_DIALOG_ENABLED", 184, "is_dark_mode_discovery_dialog_enabled_v2");
    public static final updateAdidI IS_SENTRY_CORE_TTI_ENABLED = new updateAdidI("IS_SENTRY_CORE_TTI_ENABLED", 185, "is_sentry_core_tti_enabled");
    public static final updateAdidI RIDER_HOME_PHASE2_ENABLED = new updateAdidI("RIDER_HOME_PHASE2_ENABLED", 186, "rider_home_phase2_enabled_temp");
    public static final updateAdidI IS_ACTIONABLE_PINS_ENABLED = new updateAdidI("IS_ACTIONABLE_PINS_ENABLED", 187, "is_actionable_pins_enabled");
    public static final updateAdidI REALTIME_CONNECTION_ENABLED = new updateAdidI("REALTIME_CONNECTION_ENABLED", 188, "realtime_connection_enabled");
    public static final updateAdidI REALTIME_CONNECTION_RECONNECT_TOKEN_EXPIRATION_ANDROID_ENABLED = new updateAdidI("REALTIME_CONNECTION_RECONNECT_TOKEN_EXPIRATION_ANDROID_ENABLED", 189, "realtime_connection_reconnect_token_expiration_android_enabled");
    public static final updateAdidI REALTIME_CONNECTION_DEBUG_LOGS_ENABLED = new updateAdidI("REALTIME_CONNECTION_DEBUG_LOGS_ENABLED", 190, "realtime_connection_debug_logs_enabled");
    public static final updateAdidI IS_CUSTOMER_CHAT_TRACKING_ENABLED = new updateAdidI("IS_CUSTOMER_CHAT_TRACKING_ENABLED", 191, "is_customer_chat_tracking_enabled_temp");
    public static final updateAdidI IS_CUSTOMER_CHAT_IMAGE_SHARING_CAMERA_ONLY_ENABLED = new updateAdidI("IS_CUSTOMER_CHAT_IMAGE_SHARING_CAMERA_ONLY_ENABLED", 192, "is_customer_chat_image_sharing_camera_only_enabled_temp");
    public static final updateAdidI IS_CUSTOMER_CHAT_MIGRATION_ENABLED = new updateAdidI("IS_CUSTOMER_CHAT_MIGRATION_ENABLED", 193, "is_customer_chat_migration_enabled");
    public static final updateAdidI IS_ASYNC_HOME_SCOPE_CANCELLATION_ENABLED = new updateAdidI("IS_ASYNC_HOME_SCOPE_CANCELLATION_ENABLED", 194, "is_async_home_scope_cancellation_enabled");
    public static final updateAdidI IS_LAZY_SOUND_PLAYER_ENABLED = new updateAdidI("IS_LAZY_SOUND_PLAYER_ENABLED", 195, "is_lazy_sound_player_enabled");
    public static final updateAdidI IS_DEFERRED_NAVIGATION_SDK_INIT_ENABLED = new updateAdidI("IS_DEFERRED_NAVIGATION_SDK_INIT_ENABLED", 196, "is_deferred_navigation_sdk_init_enabled");
    public static final updateAdidI IS_HELPCENTER_GALLERY_FIX_ENABLED = new updateAdidI("IS_HELPCENTER_GALLERY_FIX_ENABLED", 197, "is_helpcenter_gallery_fix_enabled");
    public static final updateAdidI IS_WEBVIEW_PERMISSION_REQUEST_FIX_ENABLED = new updateAdidI("IS_WEBVIEW_PERMISSION_REQUEST_FIX_ENABLED", 198, "is_webview_permission_request_fix_enabled");
    public static final updateAdidI IS_BRAZE_CUSTOM_ATTRIBUTE_FIX_ENABLED = new updateAdidI("IS_BRAZE_CUSTOM_ATTRIBUTE_FIX_ENABLED", 199, "is_braze_custom_attribute_fix_enabled");
    public static final updateAdidI IS_BRAZE_ID_ASYNC_RESOLUTION_ENABLED = new updateAdidI("IS_BRAZE_ID_ASYNC_RESOLUTION_ENABLED", 200, "is_braze_id_async_resolution_enabled");
    public static final updateAdidI IS_CROWD_SOURCING_ENABLED = new updateAdidI("IS_CROWD_SOURCING_ENABLED", 201, "is_crowd_sourcing_enabled");
    public static final updateAdidI IS_CROWD_SOURCING_GALLERY_ENABLED = new updateAdidI("IS_CROWD_SOURCING_GALLERY_ENABLED", 202, "is_crowd_sourcing_gallery_enabled");
    public static final updateAdidI IS_COMPONENT_DRIVEN_UTCC_ENABLED = new updateAdidI("IS_COMPONENT_DRIVEN_UTCC_ENABLED", 203, "component_driven_utcc_enabled");
    public static final updateAdidI IS_NEW_IN_APP_CAMERA_MODULE_ENABLED = new updateAdidI("IS_NEW_IN_APP_CAMERA_MODULE_ENABLED", Constant.ERROR_ACC_INVALID, "is_new_in_app_camera_module_enabled_v1");
    public static final updateAdidI IS_AUTO_ACCEPT_MULTIPLE_REQUESTS_PREVENTION_ENABLED = new updateAdidI("IS_AUTO_ACCEPT_MULTIPLE_REQUESTS_PREVENTION_ENABLED", Constant.ERROR_ACC_GRAVITY_INVALID, "is_auto_accept_multiple_requests_prevention_enabled");
    public static final updateAdidI IS_AUTO_ACCEPT_HOSTS_ENABLED = new updateAdidI("IS_AUTO_ACCEPT_HOSTS_ENABLED", Constant.ERROR_ACC_JUMP, "auto_accept_hosts_enabled");
    public static final updateAdidI HIDE_RIDER_SAFETY_BATCH_CALCULATION_MESSAGE = new updateAdidI("HIDE_RIDER_SAFETY_BATCH_CALCULATION_MESSAGE", 207, "is_rider_safety_batch_calculation_message_hidden");
    public static final updateAdidI IS_OVERLAY_VISIBILITY_BANNER_ENABLED = new updateAdidI("IS_OVERLAY_VISIBILITY_BANNER_ENABLED", 208, "is_overlay_visibility_banner_enabled");
    public static final updateAdidI IS_PICKUP_QCOMMERCE_MULTIPLE_CODE_SCAN_ENABLED = new updateAdidI("IS_PICKUP_QCOMMERCE_MULTIPLE_CODE_SCAN_ENABLED", 209, "pickup_qcommerce_multiple_code_scan_enabled");
    public static final updateAdidI IS_GODROID_BLE_SCANNING_ENABLED = new updateAdidI("IS_GODROID_BLE_SCANNING_ENABLED", 210, "is_godroid_ble_scanning_enabled");
    public static final updateAdidI IS_RACC_PASS_VERIFICATION_ENABLED = new updateAdidI("IS_RACC_PASS_VERIFICATION_ENABLED", Constant.ERROR_GYRO_NO_DATA, "racc_pass_verification");
    public static final updateAdidI IS_RACC_ACCOUNT_CREATION_WITH_OTP_ENABLED = new updateAdidI("IS_RACC_ACCOUNT_CREATION_WITH_OTP_ENABLED", Constant.ERROR_GYRO_LOW_FREQ, "racc_account_creation_with_otp");
    public static final updateAdidI IS_TEXT_PREWARM_ENABLED = new updateAdidI("IS_TEXT_PREWARM_ENABLED", Constant.ERROR_GYRO_TIME_DIFF_LARGE, "is_text_prewarm_enabled");
    public static final updateAdidI IS_IMU_DATA_COLLECTION_ENABLED = new updateAdidI("IS_IMU_DATA_COLLECTION_ENABLED", Constant.ERROR_GYRO_INVALID, "is_imu_data_collection_enabled");
    public static final updateAdidI IS_ON_DEMAND_QUICK_WINS_ENABLED = new updateAdidI("IS_ON_DEMAND_QUICK_WINS_ENABLED", 215, "is_on_demand_quick_wins_enabled");
    public static final updateAdidI IS_ON_DEMAND_QUICK_WINS_FLOATING_ITEM_ENABLED = new updateAdidI("IS_ON_DEMAND_QUICK_WINS_FLOATING_ITEM_ENABLED", Constant.ERROR_GYRO_JUMP, "is_on_demand_quick_wins_floating_item_enabled");
    public static final updateAdidI IS_RIDER_SAFETY_HEADER_MESSAGE_ENABLED = new updateAdidI("IS_RIDER_SAFETY_HEADER_MESSAGE_ENABLED", 217, "rxp_rider_safety_header_message_enabled");
    public static final updateAdidI IS_EARLY_REMOTE_CONFIG_STARTUP_ENABLED = new updateAdidI("IS_EARLY_REMOTE_CONFIG_STARTUP_ENABLED", com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor.MODULE_VERSION, "is_early_remote_config_startup_enabled");
    public static final updateAdidI IS_DELIVERY_SERVICE_START_FOREGROUND_FIX_ENABLED = new updateAdidI("IS_DELIVERY_SERVICE_START_FOREGROUND_FIX_ENABLED", 219, "is_delivery_service_start_foreground_fix_enabled");
    public static final updateAdidI IS_GARNET_MIGRATION_ENABLED = new updateAdidI("IS_GARNET_MIGRATION_ENABLED", 220, "rxp_garnet_migration_enabled");
    public static final updateAdidI IS_RACC_START_WORKING_IDENTITY_VERIFICATION_AB_TEST_ENABLED = new updateAdidI("IS_RACC_START_WORKING_IDENTITY_VERIFICATION_AB_TEST_ENABLED", Constant.ERROR_WSS_NO_DATA, "is_racc_start_working_identity_verification_ab_test_enabled");
    public static final updateAdidI IS_LIVENESS_IMAGE_CAPTURE_EXECUTOR_FIX_ENABLED = new updateAdidI("IS_LIVENESS_IMAGE_CAPTURE_EXECUTOR_FIX_ENABLED", Constant.ERROR_WSS_LOW_FREQ, "rxp_android_liveness_image_capture_executor_fix_enabled");
    public static final updateAdidI IS_REMOVE_TOKEN_WEBPAGE_QUERY = new updateAdidI("IS_REMOVE_TOKEN_WEBPAGE_QUERY", Constant.ERROR_WSS_TIME_DIFF_LARGE, "rxp_android_remove_token_webpage_query");
    public static final updateAdidI IS_CONFIRM_BUTTON_BOTTOM_SHEET_ENABLED = new updateAdidI("IS_CONFIRM_BUTTON_BOTTOM_SHEET_ENABLED", Constant.ERROR_WSS_INVALID, "is_pudo_confirm_button_bottom_sheet_enabled");
    public static final updateAdidI IS_RACC_MID_SHIFT_VERIFICATION_ENABLED = new updateAdidI("IS_RACC_MID_SHIFT_VERIFICATION_ENABLED", 225, "racc_mid_shift_selfie");
    public static final updateAdidI IS_LOW_END_DEVICE_FPS_LIMITER_ENABLED = new updateAdidI("IS_LOW_END_DEVICE_FPS_LIMITER_ENABLED", Constant.ERROR_WSS_SPEED_JUMP, "is_low_end_device_fps_limiter_enabled");
    public static final updateAdidI IS_NAVIGATION_FLOW_THROTTLING_ENABLED = new updateAdidI("IS_NAVIGATION_FLOW_THROTTLING_ENABLED", 227, "is_rotw_navigation_flow_throttling_enabled");
    public static final updateAdidI IS_ADAPTIVE_SMART_POLLING_KILLSWITCH_ENABLED = new updateAdidI("IS_ADAPTIVE_SMART_POLLING_KILLSWITCH_ENABLED", 228, "adaptive_smart_polling_retry_mechanism_killswitch");
    public static final updateAdidI IS_RACC_PASS_BACKSTACK_FIX_ANDROID = new updateAdidI("IS_RACC_PASS_BACKSTACK_FIX_ANDROID", 229, "racc_pass_backstack_fix_android");
    public static final updateAdidI IS_CROWDSOURCING_ZOOM_CONTROLS_ENABLED = new updateAdidI("IS_CROWDSOURCING_ZOOM_CONTROLS_ENABLED", 230, "rotw_android_cwd_zoom_controls_enabled");
    public static final updateAdidI IS_QUICK_SESSIONS_ENABLED = new updateAdidI("IS_QUICK_SESSIONS_ENABLED", 231, "is_quick_sessions_enabled_temp");
    public static final updateAdidI IS_MEDIA_SESSION_CRASH_GUARD_ENABLED = new updateAdidI("IS_MEDIA_SESSION_CRASH_GUARD_ENABLED", 232, "is_media_session_crash_guard_enabled");
    public static final updateAdidI IS_ROTW_CONFETTI_ANIMATION_ENABLED = new updateAdidI("IS_ROTW_CONFETTI_ANIMATION_ENABLED", 233, "rotw_confetti_animation_enabled");
    public static final updateAdidI IS_USERCENTRICS_SETTINGS_ENABLED = new updateAdidI("IS_USERCENTRICS_SETTINGS_ENABLED", Constant.ERROR_LOCATION_INVALID, "lrmi_usercentrics_settings_enabled_temp");
    public static final updateAdidI IS_DECLINE_COMPOSE_ENABLED = new updateAdidI("IS_DECLINE_COMPOSE_ENABLED", 235, "rtoa_is_decline_compose_enabled");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 93;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 53;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFirebaseFlagName() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 27;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.firebaseFlagName;
        int i5 = i2 + 125;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private updateAdidI(String str, int i, String str2) {
        super(str, i);
        this.firebaseFlagName = str2;
    }

    static {
        updateAdidI[] updateadidiArr$values = $values();
        $VALUES = updateadidiArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) updateadidiArr$values);
        int i = IconCompatParcelizer + 43;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static updateAdidI valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        updateAdidI updateadidi = (updateAdidI) Enum.valueOf(updateAdidI.class, str);
        int i4 = read + 65;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return updateadidi;
    }

    public static updateAdidI[] values() {
        int i = 2 % 2;
        int i2 = read + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (updateAdidI[]) $VALUES.clone();
        }
        throw null;
    }

    private static final /* synthetic */ updateAdidI[] $values() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 91;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        updateAdidI[] updateadidiArr = {HEATMAP_ENABLED, MOCK_LOCATION_EQUIPMENT, TWILIO_ENABLED, ACTIVITY_MONITORING_ENABLED, CUSTOMER_CHAT_ENABLED_FROM, CALL_VENDOR_ENABLED, SEARCH_SHIFTS, HISTORY_DISTANCE, LOCATION_SERVICE_CRASH_FIX_ENABLED, IS_AUTO_ACCEPT_TOGGLE_ENABLED, IS_AUTO_ACCEPT_ENABLED, HELP_CENTER_TRACKING_ENABLED, INSTANT_SHIFTS_ENABLED, IS_NAVIGATION_MODE_SUPPORTED, IS_SYSTEM_CURRENCY_FORMATTING_ENABLED, IS_CUSTOMER_CHAT_CALL_MASKING_ENABLED, IS_RIDER_REVIEWS_OF_VENDORS_ENABLED, START_WORKING_IDENTITY_VERIFICATION_ENABLED, APP_REVIEW_MODE_ENABLED, SHOW_VENDOR_LABEL_ON_GOOGLE_MAPS, SHOW_CUSTOMER_LABEL_ON_GOOGLE_MAPS, IS_APP_REVIEW_TRIGGER_ENABLED, IS_SAFETY_OPTION_AVAILABLE_IN_SETTINGS, IS_RIDER_SAFETY_DISABLING_BATTERY_OPTIMIZATION_ALLOWED, IS_RIDER_SAFETY_TIMEOUT_FIX_ENABLED, IS_SENTIANCE_ADDITIONAL_LOG_ENABLED, IS_RIDER_SAFETY_PHASE2_ENABLED, CAN_DISPLAY_RIDER_SAFETY_NEW_TAG, IS_PICTURE_FROM_GALLERY_ENABLED, IS_OFF_SHIFT_PICTURE_FROM_GALLERY_ENABLED, IS_WEB_DISPATCHER_CHAT_CHAT_BUBBLE_ENABLED, IS_WEB_DISPATCHER_CHAT_UNREAD_COUNT_THROTTLING_ENABLED, IS_PUSH_NOTIFICATION_RECEIVED_AT_ACK_ENABLED, IS_TURN_BY_TURN_DEPENDENCIES_ASYNC_LOAD_ENABLED, IS_TURN_BY_TURN_BUILDING_HIGHLIGHT_ENABLED, IS_TRACKING_SCREEN_TIME_TO_INTERACTIVE_ENABLED, LRTMI_ANDROID_FWF_PERSEUS_TRACKING_ENABLED, IS_LIVENESS_DETECTION_ENABLED, IS_RECENT_DELIVERIES_ENABLED, IS_STATE_MACHINE_INITIALIZER_ENABLED, IS_AUTH_STATE_MACHINE_ENABLED, IS_RESET_STALE_LOGOUT_STATE_ENABLED, IS_ASYNC_LOGIN_FLOW_ENABLED, IS_HUAWEI_DEVICE_CHECK_ENABLED, IS_LIVENESS_PROCEED_ANYWAY_BUTTON_DISABLED, IS_RIDER_RECRUITMENT_PHASE_2_ENABLED, IS_NOTIFICATION_OVERLAY_ENABLED, IS_LOGIN_LOGGER_SUCCESS_TRACKING_ENABLED, IS_LOGIN_LOGGER_FAILURE_TRACKING_ENABLED, IS_LOGIN_LOGGER_TRACKING_ENABLED, IS_LOGIN_LOGGER_FALLBACK_ENABLED, IS_SENTRY_NON_FATAL_LOGS_ENABLED, IS_SENTRY_NDK_ENABLED, IS_SENTRY_ADDITIONAL_CONTEXT_ENABLED, IS_SENTRY_ATTACH_VIEW_HIERARCHY_ENABLED, IS_SENTRY_USER_INTERACTIONS_ENABLED, IS_SENTRY_CUSTOM_TRACES_ENABLED, IS_SENTRY_TOMBSTONE_ENABLED, IS_RIDER_RECRUITMENT_PHASE_2_AUTO_LOGIN_ENABLED, IS_SEAMLESS_TOKEN_REFRESH_ENABLED, IS_AUTH_STATE_MACHINE_FOR_LOGOUT_ENABLED, IS_STACKED_DELIVERY_LIST_ENABLED, IS_CUSTOMER_UNAVAILABLE_KILLSWITCH_ENABLED, IS_RIDER_SAFETY_BACKGROUND_INIT_ENABLED, IS_BIOMETRICS_ENABLED, IS_BOTTOM_SHEET_HEIGHT_DYNAMIC_ENABLED, IS_AUTO_ACCEPT_BACKGROUND_ENABLED, IS_AUTO_ACCEPT_EARNING_DISPLAY_ENABLED, IS_SEAMLESS_TOKEN_FOR_RIDER_HIRING_ENABLED, IS_LOGIN_LOGGER_SUCCESS_DISABLED, IS_LOGIN_LOGGER_FAILURE_DISABLED, IS_MAIN_SCREEN_LOGGER_ENABLED, IS_RUSH_BONUS_PHASE_1_ENABLED, IS_INSTANT_DELIVERY_SEEN_ENABLED, IS_PUSH_NOTIFICATION_FOR_APPLICANT_ENABLED, IS_DEBOUNCE_LOCATION_SERVICE_ACTIONS, SHOULD_ALLOW_SEAMLESS_TOKEN_FIREBASE_LOGGING, IS_MAP_CLUSTERING_ENABLED, IS_START_WORKING_EQUIPMENT_FIX_ENABLED, IS_HELP_CENTER_NAVIGATION_FIX_ENABLED, IS_PERSEUS_EMPTY_VALUES_FIX_ENABLED, IS_BIOMETRIC_BASELINE_TRACKING_ENABLED, IS_PICKUP_DROPOFF_TAP_TO_PAY_TASK_ENABLED, IS_TRIP_PLANNER_ENABLED, IS_RESET_PASSWORD_BY_MAGIC_LINK_ENABLED, IS_CUSTOMER_UNAVAILABLE_CANCEL_FLOW_ENABLED, IS_RIDER_STATE_CHANGE_SILENT_PUSH_ENABLED, IS_ACTIONABLE_CUSTOMER_CHAT_NOTIFICATION_ENABLED, IS_SESSIONS_ON_MAP_PHASE_1_ENABLED, IS_WEBVIEW_HEADER_HIDING_ENABLED, IS_TURN_BY_TURN_ENABLED, IS_RIDER_ONBOARDING_CDA_ENABLED, IS_SUPPORT_FOR_NO_ZONE_RENDERING_ENABLED, IS_KILL_REFRESH_BUTTON_EXPERIMENT_ENABLED, IS_ORDER_STATUS_COUNTDOWN_KILLSWITCH_ENABLED, IS_SPLIT_ORDER_INSTRUCTION_KILLSWITCH_ENABLED, IS_GPS_STATE_LISTENER_FOR_LOCATION_UPDATES_ENABLED, IS_UPLOAD_IMAGE_TASK_PATH_FIX_ENABLED, SHOULD_BLOCK_LOGOUT_ON_ACTIVE_ORDER, IS_ORDER_DETAILS_EXTRA_ITEMS_KILLSWITCH_ENABLED, IS_LOCATION_PERMISSION_DISMISSIBLE_ENABLED, IS_SESSION_LOG_ENABLED, IS_SESSION_LOG_FOR_AR_ENABLED, IS_HEATMAP_IN_STARTING_STATE_ENABLED, IS_GO_AND_START_ENABLED, IS_NAVER_MAPS_ENABLED, IS_INTUITIVE_ZOOM_ENABLED, IS_REFRESH_STATE_ON_START_WORKING_FAILURE_ENABLED, IS_TBT_TRIP_INFORMATION_DISTANCE_DISABLED, IS_TBT_TRIP_INFORMATION_TIME_DISABLED, IS_ORDER_DETAILS_INSTRUCTIONS_V2_KILLSWITCH_ENABLED, IS_ENTRANCE_PINS_V1_KILLSWITCH_ENABLED, IS_RESET_PASSWORD_FLEXIBILITY_ENABLED, IS_PERSIST_TIMER_IN_RESET_PASSWORD_ENABLED, IS_TURN_BY_TURN_ROUTE_PREVIEW_ENABLED, IS_BACK_TO_BACK_ORDERS_ENABLED, IS_KEEP_SCREEN_ON_ENABLED, IS_INCOGNIA_SDK_ENABLED, IS_INCOGNIA_TOKEN_IN_API_REQUESTS_ENABLED, IS_CASH_BLOCK_ENABLED, IS_NEAR_DESTINATION_OBSERVER_ENABLED, IS_ENTRANCE_PICTURE_ENABLED, IS_FOREGROUND_SOUND_AUTO_STOP_ENABLED, IS_CUSTOMER_CHAT_TOKEN_REFRESH_ENABLED, IS_HOME_RESPONSE_VALIDATION_SYNCHRONOUS_DISABLED, IS_FIREBASE_TO_FWF_MIGRATION_ENABLED, IS_CUSTOMER_UNAVAILABLE_TAKE_PHOTO_KILLSWITCH_ENABLED, IS_MAPBOX_LOGGING_ENABLED, IS_TRUSTED_TIME_BLOCKING_UI_ENABLED, IS_HEURISTICS_IMPROVEMENTS_ENABLED, BACK_TO_BACK_ORDERS_REDISPATCHED_MESSAGE_ENABLED, IS_NATIVE_ACCOUNT_CREATION_ENABLED, TAKE_PICTURE_TASK_NEW_CAMERA_OVERLAY_KILL_SWITCH_ENABLED, IS_TURN_BY_TURN_VOICE_INSTRUCTIONS_ENABLED, IS_CUSTOMER_UNAVAILABLE_IVR_CALL_KILLSWITCH_ENABLED, IS_DEFAULT_NOTIFICATION_SOUND_CHANGE_ENABLED, IS_DISPATCHER_CHAT_NOTIFICATIONS_ENABLED, IS_NEW_PERMISSIONS_FLOW_ENABLED, IS_DF_PIN_CONNECTORS_ENABLED, IS_QUESTS_ENABLED, IS_MEDIA_AUDIO_ATTRIBUTES_ENABLED, IS_SMART_POLLING_RACE_CONDITION_FIX_ENABLED, IS_SMART_POLLING_IN_OFFLINE_STATE_ENABLED, IS_SMART_POLLING_DEBUG_LOGGING_ENABLED, IS_GOOGLE_PHONE_SANITIZING_ENABLED, IS_TAKE_PICTURE_CAMERA_SECURITY_EXCEPTION_FIX_ENABLED, IS_DECLINE_ESTIMATION_MIGRATION_ENABLED, IS_ENTRANCE_PICTURE_V2_ENABLED, IS_VOIP_CALLING_ENABLED, OTW_VOIP_ENABLE_CALL_FALLBACK_WHEN_MIC_DISABLED, IS_NAVER_ROUTE_PREVIEW_ENABLED, IS_FORCE_UPDATE_DIALOG_ON_LOGOUT_ENABLED, IS_DELIVERY_TASKS_DATA_STORE_CACHING_ENABLED, IS_AUDIO_DUCKING_ENABLED, IS_INFRA_PAYMENTS_ON_MAP_ENABLED, IS_QR_PAYMENT_TASK_KILLSWITCH_ENABLED, IS_SHOW_CITY_BOUNDARIES_ENABLED, IS_OVERRIDE_SILENT_MODE_ENABLED, IS_BACKGROUND_WEBVIEW_WARMUP_ENABLED, IS_UI_THREAD_WEBVIEW_WARMUP_ENABLED, IS_LOGIN_2FA_ENABLED, IS_SCREEN_SHOT_DETECTION_LOGGING_ENABLED, IS_SHOW_WEBVIEW_ERROR_OR_CONNECTION_LOST_PAGE_ENABLED, IS_QR_CODE_SCAN_AT_PICKUP_KILLSWITCH_ENABLED, IS_QUICK_REPLIES_LOCALIZATION_ENABLED, IS_ANDROID_16_WEBVIEW_CRASH_FIX_ENABLED, IS_LOCAL_PUSH_CACHE_AUTO_CLEAR_ENABLED, LAST_STOP_FEATURE_KILLSWTITCH, LAST_STOP_SAVING_ADDRESS_ENABLED, IS_HELP_CENTER_BUTTON_REMOVED_FROM_ACCEPT_SCREEN, IS_LOCATION_PERMISSION_TOGGLE_ENABLED, IS_HELP_CENTER_NATIVE_LOADING_IMPROVEMENTS_ENABLED, IS_SENSORS_REPORTING_ENABLED, IS_WEBVIEW_CRASH_HANDLING_ENABLED, IS_WEBVIEW_DETACH_ON_DESTROY_ENABLED, IS_NAFATH_VERIFICATION_ENABLED, WEB_VIEW_TNC_CONSENT_FLOW_ENABLED, IS_SELFIE_CONSENT_ENABLED, SHOULD_UNLOCK_MUTEX_AUTH_SAFELY, USE_JS_ACCESS_TOKEN_ENABLED, IS_TURN_BY_TURN_SETTINGS_M1_ENABLED, IS_OFFLINE_PIN_VALIDATION_KILLSWITCH_ENABLED, REVOKE_PREVIOUS_LOGIN_SESSION_ENABLED, IS_DESIGN_SYSTEM_MODES_ENABLED, IS_DARK_MODE_DISCOVERY_DIALOG_ENABLED, IS_SENTRY_CORE_TTI_ENABLED, RIDER_HOME_PHASE2_ENABLED, IS_ACTIONABLE_PINS_ENABLED, REALTIME_CONNECTION_ENABLED, REALTIME_CONNECTION_RECONNECT_TOKEN_EXPIRATION_ANDROID_ENABLED, REALTIME_CONNECTION_DEBUG_LOGS_ENABLED, IS_CUSTOMER_CHAT_TRACKING_ENABLED, IS_CUSTOMER_CHAT_IMAGE_SHARING_CAMERA_ONLY_ENABLED, IS_CUSTOMER_CHAT_MIGRATION_ENABLED, IS_ASYNC_HOME_SCOPE_CANCELLATION_ENABLED, IS_LAZY_SOUND_PLAYER_ENABLED, IS_DEFERRED_NAVIGATION_SDK_INIT_ENABLED, IS_HELPCENTER_GALLERY_FIX_ENABLED, IS_WEBVIEW_PERMISSION_REQUEST_FIX_ENABLED, IS_BRAZE_CUSTOM_ATTRIBUTE_FIX_ENABLED, IS_BRAZE_ID_ASYNC_RESOLUTION_ENABLED, IS_CROWD_SOURCING_ENABLED, IS_CROWD_SOURCING_GALLERY_ENABLED, IS_COMPONENT_DRIVEN_UTCC_ENABLED, IS_NEW_IN_APP_CAMERA_MODULE_ENABLED, IS_AUTO_ACCEPT_MULTIPLE_REQUESTS_PREVENTION_ENABLED, IS_AUTO_ACCEPT_HOSTS_ENABLED, HIDE_RIDER_SAFETY_BATCH_CALCULATION_MESSAGE, IS_OVERLAY_VISIBILITY_BANNER_ENABLED, IS_PICKUP_QCOMMERCE_MULTIPLE_CODE_SCAN_ENABLED, IS_GODROID_BLE_SCANNING_ENABLED, IS_RACC_PASS_VERIFICATION_ENABLED, IS_RACC_ACCOUNT_CREATION_WITH_OTP_ENABLED, IS_TEXT_PREWARM_ENABLED, IS_IMU_DATA_COLLECTION_ENABLED, IS_ON_DEMAND_QUICK_WINS_ENABLED, IS_ON_DEMAND_QUICK_WINS_FLOATING_ITEM_ENABLED, IS_RIDER_SAFETY_HEADER_MESSAGE_ENABLED, IS_EARLY_REMOTE_CONFIG_STARTUP_ENABLED, IS_DELIVERY_SERVICE_START_FOREGROUND_FIX_ENABLED, IS_GARNET_MIGRATION_ENABLED, IS_RACC_START_WORKING_IDENTITY_VERIFICATION_AB_TEST_ENABLED, IS_LIVENESS_IMAGE_CAPTURE_EXECUTOR_FIX_ENABLED, IS_REMOVE_TOKEN_WEBPAGE_QUERY, IS_CONFIRM_BUTTON_BOTTOM_SHEET_ENABLED, IS_RACC_MID_SHIFT_VERIFICATION_ENABLED, IS_LOW_END_DEVICE_FPS_LIMITER_ENABLED, IS_NAVIGATION_FLOW_THROTTLING_ENABLED, IS_ADAPTIVE_SMART_POLLING_KILLSWITCH_ENABLED, IS_RACC_PASS_BACKSTACK_FIX_ANDROID, IS_CROWDSOURCING_ZOOM_CONTROLS_ENABLED, IS_QUICK_SESSIONS_ENABLED, IS_MEDIA_SESSION_CRASH_GUARD_ENABLED, IS_ROTW_CONFETTI_ANIMATION_ENABLED, IS_USERCENTRICS_SETTINGS_ENABLED, IS_DECLINE_COMPOSE_ENABLED};
        int i5 = i2 + 39;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return updateadidiArr;
    }
}
