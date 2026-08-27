package io.socket.parser;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.k7$$ExternalSyntheticLambda9;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.settings.data.SettingsApiRequest$getSettings$1;
import com.roadrunner.sidemenu.data.SideMenuRepository;
import com.sentiance.core.model.events.ThriftBool;
import com.sentiance.core.model.thrift.CMMotionActivityConfidence;
import com.sentiance.okhttp3.u$a;
import io.sentry.SentryAttributes;
import io.sentry.util.network.NetworkBody;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.DrawableTransformation;
import o.IBrazeDeeplinkHandlerIntentFlagPurpose;
import o.InAppMessageHtmlBaseViewCompanion;
import o.InAppMessageImmersiveBaseView;
import o.RectManager;
import o.ShortNewsContentCardView;
import o.ViewUtilsExternalSyntheticLambda1;
import o._get_messageWebView_lambda1;
import o.clipCanvasToPath;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations;
import o.getMessageTextView;
import o.getSdkEnablementProviderandroid_sdk_base_release;
import o.getSdkFlavorandroid_sdk_base_release;
import o.getShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release;
import o.getShouldUseWindowFlagSecureInActivitiesandroid_sdk_base_release;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isUnreadIndicatorEnabled;
import o.onActivityPausedlambda0;
import o.onCreateWindowlambda3;
import o.onItemDismiss;
import o.onReceivelambda0;
import o.r8lambda0088L0EiZH2mqIpRPuXhwYCr8;
import o.r8lambda8wlcaTG4WSLSeoWnhVT_DMKDe7Y;
import o.r8lambda9dwTneWqHzFwEeeDLZ80_1lxoOc;
import o.r8lambdaMqJZvG9RjEdNq0uR_kRBAiM5YUM;
import o.r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.resetMessageMarginslambda00;
import o.setCarryoverInAppMessage;
import o.setGender;
import o.setGenderlambda1;
import o.setLanguage;
import o.setMessageImageView;
import o.setRectf;
import o.setSessionHandlingBlocklist;
import o.setSessionHandlingBlocklistlambda0;
import o.setWebViewContent;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes4.dex */
public final class IOParser$Decoder implements setMessageImageView {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public Object RemoteActionCompatParcelizer;
    public Object read;

    public void IconCompatParcelizer(setGenderlambda1 setgenderlambda1) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = setgenderlambda1;
            return;
        }
        this.RemoteActionCompatParcelizer = setgenderlambda1;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public IOParser$Decoder(int i) {
        if (i == 22) {
            this.read = "manual";
            return;
        }
        if (i != 24) {
            this.read = new u$a(13);
            return;
        }
        this.RemoteActionCompatParcelizer = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        byte[] bArr = new byte[Fields.SpotShadowColor];
        this.read = bArr;
        int i2 = 0;
        int i3 = 0;
        while (i3 < 128) {
            bArr[i3] = -1;
            i3++;
            int i4 = IconCompatParcelizer + 91;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        while (true) {
            byte[] bArr2 = (byte[]) this.RemoteActionCompatParcelizer;
            if (i2 < bArr2.length) {
                bArr[bArr2[i2]] = (byte) i2;
                i2++;
            } else {
                bArr[65] = bArr[97];
                bArr[66] = bArr[98];
                bArr[67] = bArr[99];
                bArr[68] = bArr[100];
                bArr[69] = bArr[101];
                bArr[70] = bArr[102];
                int i7 = serializer + 73;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return;
            }
        }
    }

    public SentryAttributes MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        SentryAttributes sentryAttributes = (SentryAttributes) this.RemoteActionCompatParcelizer;
        int i5 = i3 + 31;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return sentryAttributes;
        }
        throw null;
    }

    public String MediaSessionCompatToken() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 29;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = (String) this.read;
            int i4 = 85 / 0;
        } else {
            str = (String) this.read;
        }
        int i5 = i2 + 71;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0117 A[PHI: r19 r20
  0x0117: PHI (r19v7 java.lang.Integer) = (r19v5 java.lang.Integer), (r19v5 java.lang.Integer), (r19v8 java.lang.Integer) binds: [B:51:0x010a, B:48:0x0101, B:31:0x00d6] A[DONT_GENERATE, DONT_INLINE]
  0x0117: PHI (r20v8 java.lang.Integer) = (r20v5 java.lang.Integer), (r20v6 java.lang.Integer), (r20v5 java.lang.Integer) binds: [B:51:0x010a, B:48:0x0101, B:31:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.setMessageImageView
    public void onResponse(getMessageTextView getmessagetextview, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        String strRemoteActionCompatParcelizer;
        r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8 = _get_messagewebview_lambda1.exchange;
        int i = 4;
        try {
            ((ViewUtilsExternalSyntheticLambda1) this.RemoteActionCompatParcelizer).read(_get_messagewebview_lambda1, r8lambda0088l0eizh2mqiprpuxhwycr8);
            clipCanvasToPath clipcanvastopath = r8lambda0088l0eizh2mqiprpuxhwycr8.call;
            if (!clipcanvastopath.timeoutEarlyExit) {
                clipcanvastopath.timeoutEarlyExit = true;
                clipcanvastopath.timeout.write();
                r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c r8lambdar1c7uo5jlailqwouhjeywopeq4cRemoteActionCompatParcelizer = r8lambda0088l0eizh2mqiprpuxhwycr8.codec.RemoteActionCompatParcelizer();
                r8lambdar1c7uo5jlailqwouhjeywopeq4cRemoteActionCompatParcelizer.getClass();
                InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView = (InAppMessageImmersiveBaseView) r8lambdar1c7uo5jlailqwouhjeywopeq4cRemoteActionCompatParcelizer;
                int i2 = 0;
                inAppMessageImmersiveBaseView.socket.setSoTimeout(0);
                inAppMessageImmersiveBaseView.RatingCompat();
                setRectf setrectf = new setRectf(r8lambda0088l0eizh2mqiprpuxhwycr8, inAppMessageImmersiveBaseView.source, inAppMessageImmersiveBaseView.sink);
                resetMessageMarginslambda00 resetmessagemarginslambda00 = _get_messagewebview_lambda1.headers;
                int iRemoteActionCompatParcelizer = resetmessagemarginslambda00.RemoteActionCompatParcelizer();
                int i3 = 0;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                Integer num = null;
                Integer num2 = null;
                while (i3 < iRemoteActionCompatParcelizer) {
                    if (resetmessagemarginslambda00.serializer(i3).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                        String str = resetmessagemarginslambda00.read(i3);
                        int i4 = i2;
                        while (i4 < str.length()) {
                            int i5 = InAppMessageHtmlBaseViewCompanion.read(str, ',', i4, i2, i);
                            int iRemoteActionCompatParcelizer2 = InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(';', i4, i5, str);
                            int iSerializer = InAppMessageHtmlBaseViewCompanion.serializer(i4, iRemoteActionCompatParcelizer2, str);
                            String strSubstring = str.substring(iSerializer, InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(iSerializer, iRemoteActionCompatParcelizer2, str));
                            int i6 = iRemoteActionCompatParcelizer2 + 1;
                            if (strSubstring.equalsIgnoreCase("permessage-deflate")) {
                                if (z) {
                                    z4 = true;
                                }
                                while (i6 < i5) {
                                    int iRemoteActionCompatParcelizer3 = InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(';', i6, i5, str);
                                    int iRemoteActionCompatParcelizer4 = InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer('=', i6, iRemoteActionCompatParcelizer3, str);
                                    int iSerializer2 = InAppMessageHtmlBaseViewCompanion.serializer(i6, iRemoteActionCompatParcelizer4, str);
                                    String strSubstring2 = str.substring(iSerializer2, InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(iSerializer2, iRemoteActionCompatParcelizer4, str));
                                    if (iRemoteActionCompatParcelizer4 < iRemoteActionCompatParcelizer3) {
                                        int iSerializer3 = InAppMessageHtmlBaseViewCompanion.serializer(iRemoteActionCompatParcelizer4 + 1, iRemoteActionCompatParcelizer3, str);
                                        strRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str.substring(iSerializer3, InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(iSerializer3, iRemoteActionCompatParcelizer3, str)), "\"", "\"");
                                    } else {
                                        strRemoteActionCompatParcelizer = null;
                                    }
                                    int i7 = iRemoteActionCompatParcelizer3 + 1;
                                    if (strSubstring2.equalsIgnoreCase("client_max_window_bits")) {
                                        if (num != null) {
                                            z4 = true;
                                        }
                                        Integer numMediaSessionCompatQueueItem = strRemoteActionCompatParcelizer != null ? setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, strRemoteActionCompatParcelizer) : null;
                                        num = numMediaSessionCompatQueueItem;
                                        if (numMediaSessionCompatQueueItem == null) {
                                            z4 = true;
                                        }
                                    } else if (strSubstring2.equalsIgnoreCase("client_no_context_takeover")) {
                                        if (z2) {
                                            z4 = true;
                                        }
                                        if (strRemoteActionCompatParcelizer != null) {
                                            z4 = true;
                                        }
                                        z2 = true;
                                    } else if (strSubstring2.equalsIgnoreCase("server_max_window_bits")) {
                                        if (num2 != null) {
                                            z4 = true;
                                        }
                                        Integer numMediaSessionCompatQueueItem2 = strRemoteActionCompatParcelizer != null ? setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, strRemoteActionCompatParcelizer) : null;
                                        num2 = numMediaSessionCompatQueueItem2;
                                        if (numMediaSessionCompatQueueItem2 == null) {
                                            z4 = true;
                                        }
                                    } else if (strSubstring2.equalsIgnoreCase("server_no_context_takeover")) {
                                        if (z3) {
                                            z4 = true;
                                        }
                                        if (strRemoteActionCompatParcelizer != null) {
                                            z4 = true;
                                        }
                                        z3 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    i6 = i7;
                                }
                                i4 = i6;
                                z = true;
                            } else {
                                i4 = i6;
                                z4 = true;
                            }
                            i = 4;
                            i2 = 0;
                        }
                    }
                    i3++;
                    i = 4;
                    i2 = 0;
                }
                ((ViewUtilsExternalSyntheticLambda1) this.RemoteActionCompatParcelizer).write = new r8lambda9dwTneWqHzFwEeeDLZ80_1lxoOc(z, num, z2, num2, z3, z4);
                if (z4 || num != null || (num2 != null && !new ensureSubscribedToInAppMessageEventslambda7(8, 15, 1).serializer(num2.intValue()))) {
                    ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda1 = (ViewUtilsExternalSyntheticLambda1) this.RemoteActionCompatParcelizer;
                    synchronized (viewUtilsExternalSyntheticLambda1) {
                        viewUtilsExternalSyntheticLambda1.MediaBrowserCompatMediaItem.clear();
                        viewUtilsExternalSyntheticLambda1.RemoteActionCompatParcelizer(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                String str2 = setWebViewContent.read + " WebSocket " + ((r8lambday113fDFTSR5e4PZj6XsSXLtpL60) this.read).url.MediaSessionCompatQueueItem();
                ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda2 = (ViewUtilsExternalSyntheticLambda1) this.RemoteActionCompatParcelizer;
                r8lambda9dwTneWqHzFwEeeDLZ80_1lxoOc r8lambda9dwtnewqhzfweeedlz80_1lxooc = viewUtilsExternalSyntheticLambda2.write;
                r8lambda9dwtnewqhzfweeedlz80_1lxooc.getClass();
                synchronized (viewUtilsExternalSyntheticLambda2) {
                    viewUtilsExternalSyntheticLambda2.MediaSessionCompatToken = str2;
                    viewUtilsExternalSyntheticLambda2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = setrectf;
                    viewUtilsExternalSyntheticLambda2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new isUnreadIndicatorEnabled(setrectf.write, viewUtilsExternalSyntheticLambda2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, r8lambda9dwtnewqhzfweeedlz80_1lxooc.write, r8lambda9dwtnewqhzfweeedlz80_1lxooc.read, viewUtilsExternalSyntheticLambda2.MediaDescriptionCompat);
                    viewUtilsExternalSyntheticLambda2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new r8lambda8wlcaTG4WSLSeoWnhVT_DMKDe7Y(viewUtilsExternalSyntheticLambda2);
                    long j = viewUtilsExternalSyntheticLambda2.MediaSessionCompatResultReceiverWrapper;
                    if (j != 0) {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                        onCreateWindowlambda3 oncreatewindowlambda3 = viewUtilsExternalSyntheticLambda2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                        String strConcat = str2.concat(" ping");
                        k7$$ExternalSyntheticLambda9 k7__externalsyntheticlambda9 = new k7$$ExternalSyntheticLambda9(nanos, 2, viewUtilsExternalSyntheticLambda2);
                        oncreatewindowlambda3.getClass();
                        oncreatewindowlambda3.read(new r8lambda8wlcaTG4WSLSeoWnhVT_DMKDe7Y(strConcat, k7__externalsyntheticlambda9), nanos);
                    }
                    if (!viewUtilsExternalSyntheticLambda2.MediaBrowserCompatMediaItem.isEmpty()) {
                        viewUtilsExternalSyntheticLambda2.serializer();
                    }
                }
                viewUtilsExternalSyntheticLambda2.ComponentActivity = new r8lambdaMqJZvG9RjEdNq0uR_kRBAiM5YUM(setrectf.IconCompatParcelizer, viewUtilsExternalSyntheticLambda2, r8lambda9dwtnewqhzfweeedlz80_1lxooc.write, r8lambda9dwtnewqhzfweeedlz80_1lxooc.RemoteActionCompatParcelizer);
                ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda3 = (ViewUtilsExternalSyntheticLambda1) this.RemoteActionCompatParcelizer;
                try {
                    viewUtilsExternalSyntheticLambda3.RatingCompat.onOpen(viewUtilsExternalSyntheticLambda3, _get_messagewebview_lambda1);
                    while (viewUtilsExternalSyntheticLambda3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == -1) {
                        r8lambdaMqJZvG9RjEdNq0uR_kRBAiM5YUM r8lambdamqjzvg9rjednq0ur_krbaim5yum = viewUtilsExternalSyntheticLambda3.ComponentActivity;
                        r8lambdamqjzvg9rjednq0ur_krbaim5yum.getClass();
                        r8lambdamqjzvg9rjednq0ur_krbaim5yum.write();
                    }
                    return;
                } catch (Exception e) {
                    ViewUtilsExternalSyntheticLambda1.RemoteActionCompatParcelizer(viewUtilsExternalSyntheticLambda3, e, null, 6);
                    return;
                } finally {
                    viewUtilsExternalSyntheticLambda3.write();
                }
            }
            throw new IllegalStateException("Check failed.");
        } catch (IOException e2) {
            ViewUtilsExternalSyntheticLambda1.RemoteActionCompatParcelizer((ViewUtilsExternalSyntheticLambda1) this.RemoteActionCompatParcelizer, e2, _get_messagewebview_lambda1, 4);
            InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(_get_messagewebview_lambda1);
            if (r8lambda0088l0eizh2mqiprpuxhwycr8 != null) {
                r8lambda0088L0EiZH2mqIpRPuXhwYCr8.serializer(r8lambda0088l0eizh2mqiprpuxhwycr8, 0L, null, 1);
            }
        }
    }

    @Override // o.setMessageImageView
    public void onFailure(getMessageTextView getmessagetextview, IOException iOException) {
        ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda1;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 65;
        serializer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            viewUtilsExternalSyntheticLambda1 = (ViewUtilsExternalSyntheticLambda1) this.RemoteActionCompatParcelizer;
            i = 103;
        } else {
            viewUtilsExternalSyntheticLambda1 = (ViewUtilsExternalSyntheticLambda1) this.RemoteActionCompatParcelizer;
            i = 6;
        }
        ViewUtilsExternalSyntheticLambda1.RemoteActionCompatParcelizer(viewUtilsExternalSyntheticLambda1, iOException, null, i);
        int i4 = serializer + 35;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public NetworkBody RatingCompat() {
        int i = 2 % 2;
        int i2 = serializer + 1;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (((setGenderlambda1) this.RemoteActionCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("url == null");
            return null;
        }
        NetworkBody networkBody = new NetworkBody(this);
        int i4 = IconCompatParcelizer + 11;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return networkBody;
        }
        throw null;
    }

    public getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations serializer() {
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 85;
        serializer = i4 % Fields.SpotShadowColor;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (((Byte) this.RemoteActionCompatParcelizer) != null) {
            int i5 = i3 + 7;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = 1;
        } else {
            i = 0;
        }
        if (((CMMotionActivityConfidence) this.read) != null) {
            i++;
        }
        if (i == 1) {
            return new getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i, "Invalid union; ", " field(s) were set"));
        return null;
    }

    public void RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'trip_id' cannot be null");
            int i2 = IconCompatParcelizer + 5;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        int i4 = serializer + 75;
        int i5 = i4 % Fields.SpotShadowColor;
        IconCompatParcelizer = i5;
        if (i4 % 2 != 0) {
            this.RemoteActionCompatParcelizer = str;
            int i6 = i5 + 13;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return;
        }
        this.RemoteActionCompatParcelizer = str;
        throw null;
    }

    public getSdkFlavorandroid_sdk_base_release MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = serializer + 55;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = ((getShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release) this.RemoteActionCompatParcelizer) != null ? 1 : 0;
        if (((getShouldUseWindowFlagSecureInActivitiesandroid_sdk_base_release) this.read) != null) {
            i3++;
        }
        if (i3 == 1) {
            return new getSdkFlavorandroid_sdk_base_release(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i3, "Invalid union; ", " field(s) were set"));
        int i4 = IconCompatParcelizer + 77;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return null;
    }

    public onActivityPausedlambda0 RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        if (((ThriftBool) this.RemoteActionCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_low' is missing");
            return null;
        }
        int i2 = IconCompatParcelizer + 29;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (((Byte) this.read) != null) {
            return new onActivityPausedlambda0(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'percent_threshold' is missing");
        int i4 = serializer + 31;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    public setSessionHandlingBlocklist IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (((Byte) this.RemoteActionCompatParcelizer) != null) {
            if (((setSessionHandlingBlocklistlambda0) this.read) != null) {
                return new setSessionHandlingBlocklist(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'confidence' is missing");
            int i3 = IconCompatParcelizer + 125;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 5 % 2;
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'activity' is missing");
        }
        int i5 = serializer + 43;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public onReceivelambda0 read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (((ThriftBool) this.RemoteActionCompatParcelizer) != null) {
            int i5 = i3 + 65;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (((Integer) this.read) != null) {
                return new onReceivelambda0(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'duration_millis' is missing");
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_phone_usage' is missing");
        }
        int i7 = serializer + 51;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public setGender write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (((String) this.RemoteActionCompatParcelizer) != null) {
            if (((setLanguage) this.read) != null) {
                setGender setgender = new setGender(this);
                int i3 = serializer + 9;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return setgender;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'property' is missing");
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'stationary_id' is missing");
        }
        int i5 = IconCompatParcelizer + 33;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public IBrazeDeeplinkHandlerIntentFlagPurpose MediaMetadataCompat() {
        int i = 2 % 2;
        if (((Long) this.RemoteActionCompatParcelizer) != null) {
            int i2 = serializer + 39;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (((Byte) this.read) != null) {
                return new IBrazeDeeplinkHandlerIntentFlagPurpose(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'reason' is missing");
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'start' is missing");
        }
        int i4 = IconCompatParcelizer + 81;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    public byte[] serializer(int i, String str) throws IOException {
        int i2 = 2 % 2;
        byte[] bArr = (byte[]) this.read;
        if (i < 0 || str.length() - i < 0) {
            DrawableTransformation.read("invalid offset and/or length specified");
            return null;
        }
        int i3 = IconCompatParcelizer + 55;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("a hexadecimal encoding must have an even number of characters");
            int i4 = IconCompatParcelizer + 125;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return null;
        }
        int i6 = i >>> 1;
        byte[] bArr2 = new byte[i6];
        int i7 = 0;
        int i8 = 0;
        while (i8 < i6) {
            int i9 = serializer + 23;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            int i11 = i7 + 2;
            int i12 = bArr[str.charAt(i7 + 1)] | (bArr[str.charAt(i7)] << 4);
            if (i12 < 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("invalid characters encountered in Hex string");
                return null;
            }
            bArr2[i8] = (byte) i12;
            i8++;
            i7 = i11;
        }
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: getSettings-IoAF18A, reason: not valid java name */
    public Object m5142getSettingsIoAF18A(ContinuationImpl continuationImpl) {
        SettingsApiRequest$getSettings$1 settingsApiRequest$getSettings$1;
        int i = 2 % 2;
        if (!(continuationImpl instanceof SettingsApiRequest$getSettings$1)) {
            settingsApiRequest$getSettings$1 = new SettingsApiRequest$getSettings$1(this, continuationImpl);
        } else {
            settingsApiRequest$getSettings$1 = (SettingsApiRequest$getSettings$1) continuationImpl;
            int i2 = settingsApiRequest$getSettings$1.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsApiRequest$getSettings$1.write = i2 - Integer.MIN_VALUE;
            } else {
                settingsApiRequest$getSettings$1 = new SettingsApiRequest$getSettings$1(this, continuationImpl);
            }
        }
        Object obj = settingsApiRequest$getSettings$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = settingsApiRequest$getSettings$1.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.read;
            MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 24);
            settingsApiRequest$getSettings$1.write = 1;
            Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(mapboxNavigation$parsing$2, settingsApiRequest$getSettings$1);
            if (objM4875invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
            int i4 = serializer + 43;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return objM4875invokegIAlus;
            }
            throw null;
        }
        int i5 = IconCompatParcelizer;
        int i6 = i5 + 51;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0 ? i3 != 1 : i3 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i7 = i5 + 123;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        int i9 = IconCompatParcelizer + 119;
        serializer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            int i10 = 85 / 0;
        }
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (((o.setContentCardsUnreadVisualIndicatorEnabled) r3.read) != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        return new o.setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'property' is missing");
        r1 = io.socket.parser.IOParser$Decoder.IconCompatParcelizer + 75;
        io.socket.parser.IOParser$Decoder.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (((o.setContentCardsUnreadVisualIndicatorEnabled) r3.read) != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release MediaDescriptionCompat() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.Object r1 = r3.RemoteActionCompatParcelizer
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L3a
            int r1 = io.socket.parser.IOParser$Decoder.serializer
            int r1 = r1 + 123
            int r2 = r1 % 128
            io.socket.parser.IOParser$Decoder.IconCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1f
            java.lang.Object r1 = r3.read
            o.setContentCardsUnreadVisualIndicatorEnabled r1 = (o.setContentCardsUnreadVisualIndicatorEnabled) r1
            r2 = 56
            int r2 = r2 / 0
            if (r1 == 0) goto L2b
            goto L25
        L1f:
            java.lang.Object r1 = r3.read
            o.setContentCardsUnreadVisualIndicatorEnabled r1 = (o.setContentCardsUnreadVisualIndicatorEnabled) r1
            if (r1 == 0) goto L2b
        L25:
            o.setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release r0 = new o.setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release
            r0.<init>(r3)
            return r0
        L2b:
            java.lang.String r1 = "Required field 'property' is missing"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r1)
            int r1 = io.socket.parser.IOParser$Decoder.IconCompatParcelizer
            int r1 = r1 + 75
            int r2 = r1 % 128
            io.socket.parser.IOParser$Decoder.serializer = r2
            int r1 = r1 % r0
            goto L3f
        L3a:
            java.lang.String r1 = "Required field 'trip_id' is missing"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r1)
        L3f:
            int r1 = io.socket.parser.IOParser$Decoder.IconCompatParcelizer
            int r1 = r1 + 119
            int r2 = r1 % 128
            io.socket.parser.IOParser$Decoder.serializer = r2
            int r1 = r1 % r0
            r0 = 0
            if (r1 != 0) goto L4c
            return r0
        L4c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.socket.parser.IOParser$Decoder.MediaDescriptionCompat():o.setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release");
    }

    public IOParser$Decoder(RectManager rectManager, transferSessionPackageI transfersessionpackagei) {
        transfersessionpackagei.getClass();
        this.RemoteActionCompatParcelizer = rectManager;
        this.read = transfersessionpackagei;
    }

    public IOParser$Decoder(SideMenuRepository sideMenuRepository, getSdkEnablementProviderandroid_sdk_base_release getsdkenablementproviderandroid_sdk_base_release) {
        sideMenuRepository.getClass();
        getsdkenablementproviderandroid_sdk_base_release.getClass();
        this.RemoteActionCompatParcelizer = sideMenuRepository;
        this.read = getsdkenablementproviderandroid_sdk_base_release;
    }

    public /* synthetic */ IOParser$Decoder(Object obj, Object obj2) {
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
    }

    public void read(String str, String str2) {
        int i = 2 % 2;
        ArrayList arrayList = ((u$a) this.read).IconCompatParcelizer;
        if (!(!str.isEmpty())) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("name is empty");
            return;
        }
        int length = str.length();
        int i2 = IconCompatParcelizer + 59;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = 0;
        int i5 = 0;
        while (i5 < length) {
            int i6 = IconCompatParcelizer + 69;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            char cCharAt = str.charAt(i5);
            if (cCharAt <= 31 || cCharAt >= 127) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i5), str));
                return;
            } else {
                int i8 = serializer + 79;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                i5 = i8 % 2 == 0 ? i5 + 47 : i5 + 1;
            }
        }
        if (str2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("value == null");
            return;
        }
        int length2 = str2.length();
        for (int i9 = 0; i9 < length2; i9++) {
            char cCharAt2 = str2.charAt(i9);
            if (cCharAt2 > 31) {
                int i10 = serializer + 39;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                if (cCharAt2 < 127) {
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i9), str2));
            return;
        }
        while (i4 < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i4))) {
                int i12 = IconCompatParcelizer + 91;
                serializer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    arrayList.remove(i4);
                    arrayList.remove(i4);
                    i4 += 2;
                } else {
                    arrayList.remove(i4);
                    arrayList.remove(i4);
                    i4 -= 2;
                }
            }
            i4 += 2;
        }
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0106, code lost:
    
        if (r1.isNull(0) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0109, code lost:
    
        if (r1 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010e, code lost:
    
        if (r1 != false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void read(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.socket.parser.IOParser$Decoder.read(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r6 != r2.serializer) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r6 = (java.util.ArrayList) r1.serializer;
        r6 = (byte[][]) r6.toArray(new byte[r6.size()][]);
        r3 = o.ContentCardsFragmentonViewStateRestored1.RemoteActionCompatParcelizer;
        r2.IconCompatParcelizer = o.ContentCardsFragmentonViewStateRestored1.serializer(r2.IconCompatParcelizer, r6);
        r2.serializer = -1;
        r1.RemoteActionCompatParcelizer = null;
        r1.serializer = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        r6 = io.socket.parser.IOParser$Decoder.serializer + 119;
        io.socket.parser.IOParser$Decoder.IconCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
        r5.RemoteActionCompatParcelizer = null;
        r6 = (o.r8lambdaprDihMTuOcOeFIKgVogJEIatYzo) r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        r6.serializer.write("packet", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        r6 = io.socket.parser.IOParser$Decoder.serializer + 81;
        io.socket.parser.IOParser$Decoder.IconCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if ((r6 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("got binary data when not reconstructing a packet");
        r6 = io.socket.parser.IOParser$Decoder.serializer + 65;
        io.socket.parser.IOParser$Decoder.IconCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        ((java.util.ArrayList) r1.serializer).add(r6);
        r6 = ((java.util.ArrayList) r1.serializer).size();
        r2 = (o.r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ) r1.RemoteActionCompatParcelizer;
        r4 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(byte[] r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = io.socket.parser.IOParser$Decoder.IconCompatParcelizer
            int r1 = r1 + 69
            int r2 = r1 % 128
            io.socket.parser.IOParser$Decoder.serializer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            java.lang.Object r1 = r5.RemoteActionCompatParcelizer
            okhttp3.FormBody$Builder r1 = (okhttp3.FormBody.Builder) r1
            r2 = 98
            int r2 = r2 / 0
            if (r1 == 0) goto L8d
            goto L1f
        L19:
            java.lang.Object r1 = r5.RemoteActionCompatParcelizer
            okhttp3.FormBody$Builder r1 = (okhttp3.FormBody.Builder) r1
            if (r1 == 0) goto L8d
        L1f:
            java.lang.Object r2 = r1.serializer
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r6)
            java.lang.Object r6 = r1.serializer
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            java.lang.Object r2 = r1.RemoteActionCompatParcelizer
            o.r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ r2 = (o.r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ) r2
            int r3 = r2.serializer
            r4 = 0
            if (r6 != r3) goto L5e
            java.lang.Object r6 = r1.serializer
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r3 = r6.size()
            byte[][] r3 = new byte[r3][]
            java.lang.Object[] r6 = r6.toArray(r3)
            byte[][] r6 = (byte[][]) r6
            java.util.logging.Logger r3 = o.ContentCardsFragmentonViewStateRestored1.RemoteActionCompatParcelizer
            java.lang.Object r3 = r2.IconCompatParcelizer
            java.lang.Object r6 = o.ContentCardsFragmentonViewStateRestored1.serializer(r3, r6)
            r2.IconCompatParcelizer = r6
            r6 = -1
            r2.serializer = r6
            r1.RemoteActionCompatParcelizer = r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r1.serializer = r6
            goto L5f
        L5e:
            r2 = r4
        L5f:
            if (r2 == 0) goto L7d
            int r6 = io.socket.parser.IOParser$Decoder.serializer
            int r6 = r6 + 119
            int r1 = r6 % 128
            io.socket.parser.IOParser$Decoder.IconCompatParcelizer = r1
            int r6 = r6 % r0
            r5.RemoteActionCompatParcelizer = r4
            java.lang.Object r6 = r5.read
            o.r8lambdaprDihMTuOcOeFIKgVogJEIatYzo r6 = (o.r8lambdaprDihMTuOcOeFIKgVogJEIatYzo) r6
            if (r6 == 0) goto L7d
            o.r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r6 = r6.serializer
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r2 = "packet"
            r6.write(r2, r1)
        L7d:
            int r6 = io.socket.parser.IOParser$Decoder.serializer
            int r6 = r6 + 81
            int r1 = r6 % 128
            io.socket.parser.IOParser$Decoder.IconCompatParcelizer = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L89
            return
        L89:
            r4.hashCode()
            throw r4
        L8d:
            java.lang.String r6 = "got binary data when not reconstructing a packet"
            io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(r6)
            int r6 = io.socket.parser.IOParser$Decoder.serializer
            int r6 = r6 + 65
            int r1 = r6 % 128
            io.socket.parser.IOParser$Decoder.IconCompatParcelizer = r1
            int r6 = r6 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.socket.parser.IOParser$Decoder.write(byte[]):void");
    }

    public IOParser$Decoder() {
    }
}
