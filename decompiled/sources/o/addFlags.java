package o;

import android.os.Trace;
import com.incognia.Incognia;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class addFlags implements getShortEdge {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final transferSessionPackageI IconCompatParcelizer;
    public final IncogniaManagerImpl write;

    public addFlags(IncogniaManagerImpl incogniaManagerImpl, transferSessionPackageI transfersessionpackagei) {
        incogniaManagerImpl.getClass();
        transfersessionpackagei.getClass();
        this.write = incogniaManagerImpl;
        this.IconCompatParcelizer = transfersessionpackagei;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        String strGenerateRequestTokenSync$default;
        int i = 2 % 2;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = inAppMessageModalView.MediaDescriptionCompat;
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes = r8lambday113fdftsr5e4pzj6xssxltpl60.url;
        String str = setinappmessageimageviewattributes.host;
        String str2 = setinappmessageimageviewattributes.read();
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.IconCompatParcelizer;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_INCOGNIA_TOKEN_IN_API_REQUESTS_ENABLED) && setCarryoverInAppMessage.read(str, ".usehurrier.com", false)) {
            Set setRemoteActionCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer.RemoteActionCompatParcelizer("apis_allowed_to_send_incognia_token");
            if (!(setRemoteActionCompatParcelizer instanceof Collection) || !setRemoteActionCompatParcelizer.isEmpty()) {
                Iterator it = setRemoteActionCompatParcelizer.iterator();
                while (it.hasNext()) {
                    if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str2, (CharSequence) it.next(), false)) {
                        IncogniaManagerImpl incogniaManagerImpl = this.write;
                        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) incogniaManagerImpl.RatingCompat;
                        firebaseRemoteConfigImpl2.getClass();
                        Object obj = null;
                        if (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_INCOGNIA_SDK_ENABLED)) {
                            int i2 = RemoteActionCompatParcelizer + 91;
                            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i3 = i2 % 2;
                            TraceTimeMeasurementWithPerformanceKit traceTimeMeasurementWithPerformanceKit = (TraceTimeMeasurementWithPerformanceKit) incogniaManagerImpl.MediaSessionCompatQueueItem;
                            traceTimeMeasurementWithPerformanceKit.getClass();
                            SemanticsOwner semanticsOwner = traceTimeMeasurementWithPerformanceKit.serializer;
                            boolean zBooleanValue = ((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue();
                            if (zBooleanValue) {
                                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("asti_incognia_fetch_token_sync");
                            }
                            try {
                                try {
                                    getRootInfoui getrootinfoui = (getRootInfoui) semanticsOwner;
                                    getrootinfoui.serializer("asti_incognia_fetch_token_sync");
                                    strGenerateRequestTokenSync$default = Incognia.generateRequestTokenSync$default(0L, 1, null);
                                    getrootinfoui.write("asti_incognia_fetch_token_sync");
                                    if (zBooleanValue) {
                                        Trace.endSection();
                                    }
                                    if (strGenerateRequestTokenSync$default != null) {
                                        int i4 = RemoteActionCompatParcelizer + 81;
                                        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i5 = i4 % 2;
                                        if (strGenerateRequestTokenSync$default.length() == 0) {
                                            EnumColumnAdapter.serializer(incogniaManagerImpl.serializer, "incognia_fetch_token_failed", executeAsList.INFRA, "Something went wrong, sync token the value is null");
                                        }
                                    } else {
                                        EnumColumnAdapter.serializer(incogniaManagerImpl.serializer, "incognia_fetch_token_failed", executeAsList.INFRA, "Something went wrong, sync token the value is null");
                                    }
                                } catch (Throwable th) {
                                    ((getRootInfoui) semanticsOwner).write("asti_incognia_fetch_token_sync");
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                if (zBooleanValue) {
                                    Trace.endSection();
                                }
                                throw th2;
                            }
                        } else {
                            strGenerateRequestTokenSync$default = null;
                        }
                        if (strGenerateRequestTokenSync$default != null) {
                            if (strGenerateRequestTokenSync$default.length() == 0) {
                                int i6 = serializer + 25;
                                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i6 % 2 == 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                            } else {
                                _get_messageWebView_lambda0 _get_messagewebview_lambda0 = r8lambday113fdftsr5e4pzj6xssxltpl60.read();
                                _get_messagewebview_lambda0.IconCompatParcelizer("XX-Request-Token", strGenerateRequestTokenSync$default);
                                r8lambday113fdftsr5e4pzj6xssxltpl60 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
                            }
                        }
                        return inAppMessageModalView.write(r8lambday113fdftsr5e4pzj6xssxltpl60);
                    }
                }
            }
        }
        return inAppMessageModalView.write(r8lambday113fdftsr5e4pzj6xssxltpl60);
    }
}
