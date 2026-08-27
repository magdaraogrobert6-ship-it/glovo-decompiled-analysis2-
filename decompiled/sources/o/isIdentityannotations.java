package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.internal.CustomerChatSdkLogger$CustomerChatSdkInternalError;
import com.roadrunner.customerchat.internal.CustomerChatSdkLogger$WebChatTokenError;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.Map;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class isIdentityannotations {
    private static int read = 1;
    private static int serializer;
    public final decode IconCompatParcelizer;
    public final setViewToWindowMatrixQ8lPUPs RemoteActionCompatParcelizer;
    public final transferSessionPackageI write;

    public isIdentityannotations(decode decodeVar, transferSessionPackageI transfersessionpackagei, setViewToWindowMatrixQ8lPUPs setviewtowindowmatrixq8lpups) {
        decodeVar.getClass();
        transfersessionpackagei.getClass();
        this.IconCompatParcelizer = decodeVar;
        this.write = transfersessionpackagei;
        this.RemoteActionCompatParcelizer = setviewtowindowmatrixq8lpups;
    }

    public final void RemoteActionCompatParcelizer(LayerSnapshotV22 layerSnapshotV22, String str, final String str2, final Throwable th) {
        int i;
        int i2 = 2 % 2;
        layerSnapshotV22.getClass();
        str2.getClass();
        int i3 = isIdentity.RemoteActionCompatParcelizer[layerSnapshotV22.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return;
            }
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(str, " ", str2), new Object[0]);
            return;
        }
        this.RemoteActionCompatParcelizer.write(str, str2, th);
        int iHashCode = str.hashCode();
        if (iHashCode != 93214083) {
            if (iHashCode != 1045658607) {
                if (iHashCode != 1539812132) {
                    i = serializer + 121;
                } else {
                    if (str.equals("WEB_PRELOADING")) {
                        Timber.RemoteActionCompatParcelizer.write(new Exception(str2, th) { // from class: com.roadrunner.customerchat.internal.CustomerChatSdkLogger$WebChatPreloadingError
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(str2, th);
                                str2.getClass();
                            }
                        });
                        int i4 = read + 9;
                        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 != 0) {
                            throw null;
                        }
                        return;
                    }
                    i = serializer + 73;
                }
                read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i % 2;
            } else if (str.equals("WEB_CHAT_OPEN_ERROR")) {
                Timber.RemoteActionCompatParcelizer.write(new Exception(str2, th) { // from class: com.roadrunner.customerchat.internal.CustomerChatSdkLogger$WebChatOpenError
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(str2, th);
                        str2.getClass();
                    }
                });
                return;
            }
        } else if (str.equals("WEB_CHAT")) {
            Timber.RemoteActionCompatParcelizer.write(new CustomerChatSdkLogger$WebChatTokenError(str2, th));
            int i6 = serializer + 75;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return;
        }
        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new CustomerChatSdkLogger$CustomerChatSdkInternalError(str, th), str2, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    public final void serializer(String str, Map map, Throwable th) {
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 121;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        String message = null;
        if (i3 % 2 == 0) {
            th.getClass();
            ((FirebaseRemoteConfigImpl) this.write).RemoteActionCompatParcelizer.serializer();
            message.hashCode();
            throw null;
        }
        th.getClass();
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.write;
        String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
        if (strSerializer == null) {
            int i4 = read + 65;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                lowerCase.getClass();
                this.IconCompatParcelizer.logEvent(lowerCase.concat("_fail"), map);
            }
        } else if (firebaseRemoteConfigImpl.IconCompatParcelizer.serializer("is_customer_chat_error_reporting_enabled", strSerializer)) {
            String lowerCase2 = str.toLowerCase(java.util.Locale.ROOT);
            lowerCase2.getClass();
            this.IconCompatParcelizer.logEvent(lowerCase2.concat("_fail"), map);
        }
        CustomerChatSdkLogger$CustomerChatSdkInternalError customerChatSdkLogger$CustomerChatSdkInternalError = new CustomerChatSdkLogger$CustomerChatSdkInternalError(str, th);
        Throwable cause = customerChatSdkLogger$CustomerChatSdkInternalError.getCause();
        if (cause != null) {
            message = cause.getMessage();
            i = read + 47;
        } else {
            i = read + 57;
        }
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i % 2;
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{message, "Connection has been canceled."}, iWrite3)).booleanValue()) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(customerChatSdkLogger$CustomerChatSdkInternalError.getMessage(), " - Connection has been canceled."), new Object[0]);
        } else {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new Exception(customerChatSdkLogger$CustomerChatSdkInternalError), "Sending customer chat log failed.", new Object[0]);
        }
    }

    public final void RemoteActionCompatParcelizer(String str, Map map) {
        int i = 2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.write;
        String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
        if (strSerializer != null) {
            boolean zSerializer = firebaseRemoteConfigImpl.IconCompatParcelizer.serializer("is_customer_chat_error_reporting_enabled", strSerializer);
            int i2 = serializer + 3;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (!zSerializer) {
                return;
            }
        } else {
            int i4 = read + 9;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return;
            }
        }
        int i5 = read + 37;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        lowerCase.getClass();
        this.IconCompatParcelizer.logEvent(lowerCase.concat("_success"), map);
        int i7 = read + 121;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }
}
