package com.braze.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.support.i$$ExternalSyntheticLambda0;
import com.braze.ui.actions.UriAction;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public class BrazeDeeplinkHandler implements IBrazeDeeplinkHandler {
    private static volatile IBrazeDeeplinkHandler customHandler;
    public static final Companion Companion = new Companion(null);
    private static final IBrazeDeeplinkHandler defaultHandler = new BrazeDeeplinkHandler();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createUriActionFromUrlString$lambda$0() {
        return "createUriActionFromUrlString url was null. Returning null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createUriActionFromUrlString$lambda$1() {
        return "createUriActionFromUrlString failed. Returning null.";
    }

    public static final IBrazeDeeplinkHandler getInstance() {
        return Companion.getInstance();
    }

    public static final void setBrazeDeeplinkHandler(IBrazeDeeplinkHandler iBrazeDeeplinkHandler) {
        Companion.setBrazeDeeplinkHandler(iBrazeDeeplinkHandler);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setBrazeDeeplinkHandler$lambda$0(IBrazeDeeplinkHandler iBrazeDeeplinkHandler) {
            String str;
            if (iBrazeDeeplinkHandler == null) {
                str = "cleared";
            } else {
                str = "set";
            }
            return "Custom IBrazeDeeplinkHandler ".concat(str);
        }

        public final void setBrazeDeeplinkHandler(IBrazeDeeplinkHandler iBrazeDeeplinkHandler) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda28(4, iBrazeDeeplinkHandler), 7, (Object) null);
            BrazeDeeplinkHandler.customHandler = iBrazeDeeplinkHandler;
        }

        public final IBrazeDeeplinkHandler getInstance() {
            IBrazeDeeplinkHandler iBrazeDeeplinkHandler = BrazeDeeplinkHandler.customHandler;
            return iBrazeDeeplinkHandler == null ? BrazeDeeplinkHandler.defaultHandler : iBrazeDeeplinkHandler;
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IBrazeDeeplinkHandler.IntentFlagPurpose.values().length];
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public UriAction createUriActionFromUri(Uri uri, Bundle bundle, boolean z, Channel channel) {
        uri.getClass();
        channel.getClass();
        return new UriAction(uri, bundle, z, channel);
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public UriAction createUriActionFromUrlString(String str, Bundle bundle, boolean z, Channel channel) {
        str.getClass();
        channel.getClass();
        try {
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                return createUriActionFromUri(Uri.parse(str), bundle, z, channel);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(2), 6, (Object) null);
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(3), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public int getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose intentFlagPurpose) {
        intentFlagPurpose.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[intentFlagPurpose.ordinal()]) {
            case 1:
            case 2:
                return 1073741824;
            case 3:
            case 4:
            case 5:
                return 872415232;
            case 6:
            case 7:
                return 268435456;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return 0;
        }
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public void gotoUri(Context context, UriAction uriAction) {
        context.getClass();
        uriAction.getClass();
        uriAction.execute(context);
    }
}
