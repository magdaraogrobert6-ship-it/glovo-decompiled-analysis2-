package o;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class neighborsScoredByDistanceui {
    public static final Set IconCompatParcelizer;
    private static int serializer = 0;
    private static int write = 1;

    static {
        executeAsList executeaslist = executeAsList.RAVL;
        RectListDebuggerModifierElement rectListDebuggerModifierElement = RectListDebuggerModifierElement.GET;
        updateFlagsFor updateflagsfor = new updateFlagsFor("/api/start-working-api/v1/rider_status", "endpoint_issue_rider_status", executeaslist, rectListDebuggerModifierElement);
        updateFlagsFor updateflagsfor2 = new updateFlagsFor("/api/start-working-api/v1/start_working", "endpoint_issue_start_working_v1", executeaslist, rectListDebuggerModifierElement);
        updateFlagsFor updateflagsfor3 = new updateFlagsFor("/api/start-working-api/v2/start_working", "endpoint_issue_start_working_v2", executeaslist, rectListDebuggerModifierElement);
        RectListDebuggerModifierElement rectListDebuggerModifierElement2 = RectListDebuggerModifierElement.PUT;
        updateFlagsFor updateflagsfor4 = new updateFlagsFor("/api/start-working-api/v1/start_working", "endpoint_issue_start_working_put", executeaslist, rectListDebuggerModifierElement2);
        updateFlagsFor updateflagsfor5 = new updateFlagsFor("/api/start-working-api/v1/stop_working", "endpoint_issue_stop_working_put", executeaslist, rectListDebuggerModifierElement2);
        updateFlagsFor updateflagsfor6 = new updateFlagsFor("/api/start-working-api/v2/stop_working", "endpoint_issue_stop_working_put_v2", executeaslist, rectListDebuggerModifierElement2);
        executeAsList executeaslist2 = executeAsList.RACC;
        RectListDebuggerModifierElement rectListDebuggerModifierElement3 = RectListDebuggerModifierElement.POST;
        updateFlagsFor updateflagsfor7 = new updateFlagsFor("/api/iam-login/v2/auth", "endpoint_issue_login_error", executeaslist2, rectListDebuggerModifierElement3);
        updateFlagsFor updateflagsfor8 = new updateFlagsFor("/api/iam-login/v2/auth/magic_link/verify", "endpoint_issue_reset_password_verify_error", executeaslist2, rectListDebuggerModifierElement3);
        updateFlagsFor updateflagsfor9 = new updateFlagsFor("/api/iam-login/v2/auth/magic_link/generate", "endpoint_issue_reset_password_error", executeaslist2, rectListDebuggerModifierElement3);
        updateFlagsFor updateflagsfor10 = new updateFlagsFor("/api/iam-login/users/reset_password", "endpoint_issue_forgot_password", executeaslist2, rectListDebuggerModifierElement2);
        updateFlagsFor updateflagsfor11 = new updateFlagsFor("/api/iam-login/users/update_password", "endpoint_issue_custom_password_error", executeaslist2, rectListDebuggerModifierElement2);
        updateFlagsFor updateflagsfor12 = new updateFlagsFor("/api/iam-login/selfie", "endpoint_issue_identity_verification_error", executeaslist2, rectListDebuggerModifierElement3);
        updateFlagsFor updateflagsfor13 = new updateFlagsFor("/api/iam-login/v2/auth/refresh_token", "endpoint_issue_refresh_token_post", executeaslist2, rectListDebuggerModifierElement3);
        executeAsList executeaslist3 = executeAsList.RXP;
        updateFlagsFor updateflagsfor14 = new updateFlagsFor("/api/rider-experience/v1/settings_deeplinks", "endpoint_issue_app_settings_deeplinks_error", executeaslist3, rectListDebuggerModifierElement);
        updateFlagsFor updateflagsfor15 = new updateFlagsFor("/api/rider-experience/v1/home", "endpoint_issue_home", executeaslist3, rectListDebuggerModifierElement);
        updateFlagsFor updateflagsfor16 = new updateFlagsFor("/api/start-working-api/v1/break_options", "endpoint_issue_break_get", executeaslist, rectListDebuggerModifierElement);
        updateFlagsFor updateflagsfor17 = new updateFlagsFor("/api/start-working-api/v1/break_options", "endpoint_issue_break_post", executeaslist, rectListDebuggerModifierElement3);
        executeAsList executeaslist4 = executeAsList.OTW;
        updateFlagsFor updateflagsfor18 = new updateFlagsFor("/api/geo-tracking/v1/couriers/<redacted>/location", "endpoint_issue_location_update", executeaslist4, rectListDebuggerModifierElement3);
        updateFlagsFor updateflagsfor19 = new updateFlagsFor("/api/delivery-flow/v1/route-preview", "endpoint_issue_route_preview", executeaslist4, rectListDebuggerModifierElement3);
        updateFlagsFor updateflagsfor20 = new updateFlagsFor("/api/delivery-flow/v1/deliveries/<redacted>/proxy-phone", "endpoint_issue_proxy_phone", executeaslist4, rectListDebuggerModifierElement);
        executeAsList executeaslist5 = executeAsList.OA;
        updateFlagsFor updateflagsfor21 = new updateFlagsFor("/api/interactions/voip/rider/token", "endpoint_interactions_voip_token", executeaslist5, rectListDebuggerModifierElement3);
        updateFlagsFor updateflagsfor22 = new updateFlagsFor("/api/delivery-flow/v1/deliveries/<redacted>/accept", "endpoint_delivery_accept_failed_ev1", executeaslist5, rectListDebuggerModifierElement2);
        updateFlagsFor updateflagsfor23 = new updateFlagsFor("/api/delivery-flow/v1/deliveries/decline", "endpoint_delivery_decline_failed", executeaslist5, rectListDebuggerModifierElement3);
        updateFlagsFor updateflagsfor24 = new updateFlagsFor("/api/delivery-flow/v1/deliveries/earnings", "endpoint_delivery_earnings_failed", executeaslist5, rectListDebuggerModifierElement);
        updateFlagsFor updateflagsfor25 = new updateFlagsFor("/api/delivery-flow/v1/deliveries/<redacted>/acknowledge", "endpoint_delivery_acknowledgement_failed", executeaslist5, RectListDebuggerModifierElement.PATCH);
        updateFlagsFor updateflagsfor26 = new updateFlagsFor("/api/delivery-flow/v1/deliveries/list", "endpoint_delivery_list_mode_failed", executeaslist5, rectListDebuggerModifierElement);
        updateFlagsFor updateflagsfor27 = new updateFlagsFor("/api/delivery-flow/v1/deliveries/auto-accept", "endpoint_issue_delivery_auto_accept_failed", executeaslist5, rectListDebuggerModifierElement2);
        updateFlagsFor updateflagsfor28 = new updateFlagsFor("/api/delivery-flow/v1/courier/last_stop", "endpoint_delivery_last_stop_failed", executeaslist5, rectListDebuggerModifierElement);
        updateFlagsFor updateflagsfor29 = new updateFlagsFor("/api/delivery-flow/v1/courier/last_stop", "endpoint_delivery_last_stop_save_failed", executeaslist5, rectListDebuggerModifierElement2);
        updateFlagsFor updateflagsfor30 = new updateFlagsFor("/api/delivery-flow/v1/courier/last_stop", "endpoint_delivery_last_stop_delete_failed", executeaslist5, RectListDebuggerModifierElement.DELETE);
        executeAsList executeaslist6 = executeAsList.PUDO;
        IconCompatParcelizer = onContentCardClicked.MediaSessionCompatQueueItem(new updateFlagsFor[]{updateflagsfor, updateflagsfor2, updateflagsfor3, updateflagsfor4, updateflagsfor5, updateflagsfor6, updateflagsfor7, updateflagsfor8, updateflagsfor9, updateflagsfor10, updateflagsfor11, updateflagsfor12, updateflagsfor13, updateflagsfor14, updateflagsfor15, updateflagsfor16, updateflagsfor17, updateflagsfor18, updateflagsfor19, updateflagsfor20, updateflagsfor21, updateflagsfor22, updateflagsfor23, updateflagsfor24, updateflagsfor25, updateflagsfor26, updateflagsfor27, updateflagsfor28, updateflagsfor29, updateflagsfor30, new updateFlagsFor("/api/delivery-flow/v1/deliveries/<redacted>/tasks", "endpoint_tasks_failed", executeaslist6, rectListDebuggerModifierElement), new updateFlagsFor("/api/delivery-flow/v1/deliveries/<redacted>/proof_of_pickup", "endpoint_proof_pickup_failed", executeaslist6, rectListDebuggerModifierElement3), new updateFlagsFor("/api/delivery-flow/v1/deliveries/<redacted>/menu_collection", "endpoint_menu_collection_failed", executeaslist6, rectListDebuggerModifierElement3), new updateFlagsFor("/api/delivery-flow/v1/deliveries/<redacted>/pickup", "endpoint_pickup_failed", executeaslist6, rectListDebuggerModifierElement2), new updateFlagsFor("/api/delivery-flow/v1/deliveries/<redacted>/proof_of_delivery", "endpoint_proof_delivery_failed", executeaslist6, rectListDebuggerModifierElement3), new updateFlagsFor("/api/delivery-flow/v1/deliveries/<redacted>/dropoff", "endpoint_dropoff_failed", executeaslist6, rectListDebuggerModifierElement2), new updateFlagsFor("/api/df-tasks/v1/tasks/customer-unavailable/inform-customer", "endpoint_inform_customer_failed", executeaslist6, rectListDebuggerModifierElement2), new updateFlagsFor("/api/df-tasks/v1/tasks/customer-unavailable/initiate-ivr-flow", "endpoint_initiate_ivr_flow_failed", executeaslist6, rectListDebuggerModifierElement3), new updateFlagsFor("/api/delivery-flow/v1/orders/<redacted>/cancel", "endpoint_cancel_order_failed", executeaslist6, rectListDebuggerModifierElement2), new updateFlagsFor("/api/delivery-flow/v1/deliveries/<redacted>/deeplink", "endpoint_softpos_deeplink_failed", executeaslist6, rectListDebuggerModifierElement), new updateFlagsFor("/api/rider-automation/v1/help_center", "endpoint_help_center_not_loaded", executeAsList.INFRA, rectListDebuggerModifierElement3), new updateFlagsFor("/api/rider-experience/v1/nest", "endpoint_issue_nest", executeaslist3, rectListDebuggerModifierElement), new updateFlagsFor("/api/rider-experience/v3/side_menu", "endpoint_issue_side_menu", executeaslist3, rectListDebuggerModifierElement), new updateFlagsFor("/api/delivery-flow/v1/state", "endpoint_issue_delivery_status_v3", executeaslist6, rectListDebuggerModifierElement), new updateFlagsFor("/api/start-working-api/v1/heatmaps", "endpoint_issue_heatmap_v1", executeaslist, rectListDebuggerModifierElement), new updateFlagsFor("/api/start-working-api/v1/unassigned_shifts", "endpoint_issue_unassigned_shifts", executeaslist, rectListDebuggerModifierElement), new updateFlagsFor("/api/start-working-api/v1/work_opportunities", "endpoint_issue_work_opportunities", executeaslist, rectListDebuggerModifierElement), new updateFlagsFor("/api/iam-login/v2/auth/2fa/verify", "endpoint_issue_verify_2fa", executeaslist2, rectListDebuggerModifierElement3), new updateFlagsFor("/api/iam-login/v2/auth/2fa/trigger", "endpoint_issue_trigger_2fa", executeaslist2, rectListDebuggerModifierElement3)});
        int i = write + 41;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
