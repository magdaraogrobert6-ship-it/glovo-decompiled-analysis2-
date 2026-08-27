package com.braze.ui.actions;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda2;
import com.braze.BrazeInternal;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.i$$ExternalSyntheticLambda0;
import com.braze.support.i$$ExternalSyntheticLambda1;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.support.UriUtils;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public class UriAction implements IAction {
    private final Channel channel;
    private final Bundle extras;
    private Uri uri;
    private boolean useWebView;

    @Override // com.braze.ui.actions.IAction
    public final Channel getChannel() {
        return this.channel;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final boolean getUseWebView() {
        return this.useWebView;
    }

    public final void setUseWebView(boolean z) {
        this.useWebView = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$2(UriAction uriAction) {
        return "Executing Uri action from channel " + uriAction.channel + ": " + uriAction.uri + ". UseWebView: " + uriAction.useWebView + ". Extras: " + uriAction.extras;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getActionViewIntent$lambda$0(ResolveInfo resolveInfo) {
        return ff$$ExternalSyntheticOutline0.m("Setting deep link intent package to ", resolveInfo.activityInfo.packageName, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$0() {
        return "Adding main activity intent to back stack while opening uri from push";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Adding custom back stack activity while opening uri from push: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$3(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Not adding unregistered activity to the back stack while opening uri from push: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$4() {
        return "Not adding back stack activity while opening uri from push due to disabled configuration setting.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getWebViewActivityIntent$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Launching custom WebView Activity with class name: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithActionViewFromPush$lambda$0(Uri uri) {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Could not find appropriate activity to open for deep link ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithWebViewActivity$lambda$0() {
        return "BrazeWebViewActivity not opened successfully.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithWebViewActivityFromPush$lambda$0() {
        return "Braze WebView Activity not opened successfully.";
    }

    public UriAction(UriAction uriAction) {
        uriAction.getClass();
        this.uri = uriAction.uri;
        this.extras = uriAction.extras;
        this.useWebView = uriAction.useWebView;
        this.channel = uriAction.channel;
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(Context context) {
        context.getClass();
        if (BrazeFileUtils.isLocalUri(this.uri)) {
            final int i = 0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.braze.ui.actions.UriAction$$ExternalSyntheticLambda1
                public final /* synthetic */ UriAction f$0;

                {
                    this.f$0 = this;
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i2 = i;
                    UriAction uriAction = this.f$0;
                    if (i2 != 0) {
                        return i2 != 1 ? UriAction.execute$lambda$2(uriAction) : UriAction.execute$lambda$1(uriAction);
                    }
                    return UriAction.execute$lambda$0(uriAction);
                }
            }, 7, (Object) null);
            return;
        }
        BrazeActionParser brazeActionParser = BrazeActionParser.INSTANCE;
        if (brazeActionParser.isBrazeActionUri(this.uri)) {
            final int i2 = 1;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.braze.ui.actions.UriAction$$ExternalSyntheticLambda1
                public final /* synthetic */ UriAction f$0;

                {
                    this.f$0 = this;
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i3 = i2;
                    UriAction uriAction = this.f$0;
                    if (i3 != 0) {
                        return i3 != 1 ? UriAction.execute$lambda$2(uriAction) : UriAction.execute$lambda$1(uriAction);
                    }
                    return UriAction.execute$lambda$0(uriAction);
                }
            }, 6, (Object) null);
            brazeActionParser.execute(context, this.uri, this.channel);
            return;
        }
        final int i3 = 2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.braze.ui.actions.UriAction$$ExternalSyntheticLambda1
            public final /* synthetic */ UriAction f$0;

            {
                this.f$0 = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = i3;
                UriAction uriAction = this.f$0;
                if (i4 != 0) {
                    return i4 != 1 ? UriAction.execute$lambda$2(uriAction) : UriAction.execute$lambda$1(uriAction);
                }
                return UriAction.execute$lambda$0(uriAction);
            }
        }, 7, (Object) null);
        if (this.useWebView && onContentCardDismissed.write(BrazeFileUtils.REMOTE_SCHEMES, this.uri.getScheme())) {
            Channel channel = this.channel;
            Channel channel2 = Channel.PUSH;
            Uri uri = this.uri;
            Bundle bundle = this.extras;
            if (channel == channel2) {
                openUriWithWebViewActivityFromPush(context, uri, bundle);
                return;
            } else {
                openUriWithWebViewActivity(context, uri, bundle);
                return;
            }
        }
        Channel channel3 = this.channel;
        Channel channel4 = Channel.PUSH;
        Uri uri2 = this.uri;
        Bundle bundle2 = this.extras;
        if (channel3 == channel4) {
            openUriWithActionViewFromPush(context, uri2, bundle2);
        } else {
            openUriWithActionView(context, uri2, bundle2);
        }
    }

    @SuppressLint
    public final Intent getActionViewIntent(Context context, Uri uri, Bundle bundle) {
        context.getClass();
        uri.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : context.getPackageManager().queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.size() > 1) {
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{resolveInfo.activityInfo.packageName, context.getPackageName()}, getCieXyz.write())).booleanValue()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda28(6, resolveInfo), 7, (Object) null);
                    intent.setPackage(resolveInfo.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ba  */
    public final Intent[] getIntentArrayWithConfiguredBackStack(Context context, Bundle bundle, Intent intent, BrazeConfigurationProvider brazeConfigurationProvider) {
        Intent mainActivityIntent;
        context.getClass();
        intent.getClass();
        brazeConfigurationProvider.getClass();
        if (brazeConfigurationProvider.isPushDeepLinkBackStackActivityEnabled()) {
            String pushDeepLinkBackStackActivityClassName = brazeConfigurationProvider.getPushDeepLinkBackStackActivityClassName();
            if (pushDeepLinkBackStackActivityClassName == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(13), 6, (Object) null);
                mainActivityIntent = UriUtils.getMainActivityIntent(context, bundle);
            } else if (UriUtils.isActivityRegisteredInManifest(context, pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(pushDeepLinkBackStackActivityClassName, 17), 6, (Object) null);
                if (bundle != null) {
                    mainActivityIntent = new Intent().setClassName(context, pushDeepLinkBackStackActivityClassName).setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT)).putExtras(bundle);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(pushDeepLinkBackStackActivityClassName, 18), 6, (Object) null);
            }
            if (mainActivityIntent == null) {
                return new Intent[]{mainActivityIntent, intent};
            }
            intent.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT));
            return new Intent[]{intent};
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(11), 6, (Object) null);
        mainActivityIntent = null;
        if (mainActivityIntent == null) {
            return new Intent[]{mainActivityIntent, intent};
        }
        intent.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT));
        return new Intent[]{intent};
    }

    public final Intent getWebViewActivityIntent(Context context, Uri uri, Bundle bundle) {
        Intent intent;
        context.getClass();
        uri.getClass();
        String customHtmlWebViewActivityClassName = BrazeInternal.INSTANCE.getConfigurationProvider(context).getCustomHtmlWebViewActivityClassName();
        if (customHtmlWebViewActivityClassName == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) customHtmlWebViewActivityClassName) || !UriUtils.isActivityRegisteredInManifest(context, customHtmlWebViewActivityClassName)) {
            intent = new Intent(context, (Class<?>) BrazeWebViewActivity.class);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(customHtmlWebViewActivityClassName, 16), 7, (Object) null);
            intent = new Intent().setClassName(context, customHtmlWebViewActivityClassName);
            intent.getClass();
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("url", uri.toString());
        return intent;
    }

    public void openUriWithActionView(Context context, Uri uri, Bundle bundle) {
        context.getClass();
        uri.getClass();
        Intent actionViewIntent = getActionViewIntent(context, uri, bundle);
        actionViewIntent.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW));
        try {
            context.startActivity(actionViewIntent);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(uri, 28, bundle), 4, (Object) null);
        }
    }

    public void openUriWithActionViewFromPush(Context context, Uri uri, Bundle bundle) {
        context.getClass();
        uri.getClass();
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, bundle, getActionViewIntent(context, uri, bundle), BrazeInternal.INSTANCE.getConfigurationProvider(context)));
        } catch (ActivityNotFoundException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new UriAction$$ExternalSyntheticLambda4(0, uri), 4, (Object) null);
        }
    }

    public void openUriWithWebViewActivity(Context context, Uri uri, Bundle bundle) {
        context.getClass();
        uri.getClass();
        Intent webViewActivityIntent = getWebViewActivityIntent(context, uri, bundle);
        webViewActivityIntent.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY));
        try {
            context.startActivity(webViewActivityIntent);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(10), 4, (Object) null);
        }
    }

    public void openUriWithWebViewActivityFromPush(Context context, Uri uri, Bundle bundle) {
        context.getClass();
        uri.getClass();
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, bundle, getWebViewActivityIntent(context, uri, bundle), BrazeInternal.INSTANCE.getConfigurationProvider(context)));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(12), 4, (Object) null);
        }
    }

    public final void setUri(Uri uri) {
        uri.getClass();
        this.uri = uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$0(UriAction uriAction) {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(uriAction.uri, "Not executing local Uri: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithActionView$lambda$0(Uri uri, Bundle bundle) {
        return "Failed to handle uri " + uri + " with extras: " + bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$1(UriAction uriAction) {
        return "Executing BrazeActions uri:\n'" + uriAction.uri + "'";
    }

    public UriAction(Uri uri, Bundle bundle, boolean z, Channel channel) {
        uri.getClass();
        channel.getClass();
        this.uri = uri;
        this.extras = bundle;
        this.useWebView = z;
        this.channel = channel;
    }
}
