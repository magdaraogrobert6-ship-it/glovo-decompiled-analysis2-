package com.braze;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import coil3.util.UtilsKt;
import com.braze.enums.Channel;
import com.braze.ui.actions.UriAction;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes.dex */
public interface IBrazeDeeplinkHandler {

    public enum IntentFlagPurpose {
        NOTIFICATION_ACTION_WITH_DEEPLINK,
        NOTIFICATION_PUSH_STORY_PAGE_CLICK,
        URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY,
        URI_ACTION_OPEN_WITH_ACTION_VIEW,
        URI_ACTION_BACK_STACK_GET_ROOT_INTENT,
        URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT,
        URI_UTILS_GET_MAIN_ACTIVITY_INTENT;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    UriAction createUriActionFromUri(Uri uri, Bundle bundle, boolean z, Channel channel);

    UriAction createUriActionFromUrlString(String str, Bundle bundle, boolean z, Channel channel);

    int getIntentFlags(IntentFlagPurpose intentFlagPurpose);

    void gotoUri(Context context, UriAction uriAction);
}
