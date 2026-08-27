package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import com.google.firebase.firestore.FirebaseFirestore;

/* JADX INFO: loaded from: classes3.dex */
public final class canTrackThirdPartySharingI implements getShortEdge {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final setVerticalStyle IconCompatParcelizer;
    public final bootstrapLifecycleI write;

    public canTrackThirdPartySharingI(bootstrapLifecycleI bootstraplifecyclei, setVerticalStyle setverticalstyle) {
        this.write = bootstraplifecyclei;
        this.IconCompatParcelizer = setverticalstyle;
    }

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer;
        int i = 2 % 2;
        int i2 = read + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
            inAppMessageModalView.write(inAppMessageModalView.MediaDescriptionCompat);
            this.IconCompatParcelizer.write();
            setPaddingTop setpaddingtop = setPaddingTop.HUAWEI;
            obj.hashCode();
            throw null;
        }
        InAppMessageModalView inAppMessageModalView2 = (InAppMessageModalView) getmessageheadertextview;
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Write = inAppMessageModalView2.write(inAppMessageModalView2.MediaDescriptionCompat);
        String strWrite = this.IconCompatParcelizer.write() == setPaddingTop.HUAWEI ? null : _get_messagewebview_lambda1Write.headers.write("X-FIRESTORE-FLOW-ENABLED");
        if (strWrite != null) {
            int i3 = read + 17;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (strWrite.length() != 0) {
                boolean zEqualsIgnoreCase = strWrite.equalsIgnoreCase("true");
                bootstrapLifecycleI bootstraplifecyclei = this.write;
                PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = bootstraplifecyclei.RatingCompat;
                if (!zEqualsIgnoreCase) {
                    if (previewView$1$$ExternalSyntheticLambda2 != null) {
                        int i5 = RemoteActionCompatParcelizer + 47;
                        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i5 % 2 != 0) {
                            previewView$1$$ExternalSyntheticLambda2.IconCompatParcelizer();
                            obj.hashCode();
                            throw null;
                        }
                        previewView$1$$ExternalSyntheticLambda2.IconCompatParcelizer();
                    }
                    bootstraplifecyclei.RatingCompat = null;
                } else if (previewView$1$$ExternalSyntheticLambda2 == null && (r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer = ((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) bootstraplifecyclei.read).RemoteActionCompatParcelizer.serializer()) != null) {
                    int i6 = read + 115;
                    RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    Object objWrite = bootstraplifecyclei.RemoteActionCompatParcelizer.write();
                    objWrite.getClass();
                    if (pageLeftdefault.write((pageLeftdefault) objWrite)) {
                        FirebaseFirestore firebaseFirestore = (FirebaseFirestore) bootstraplifecyclei.serializer.write();
                        String str = r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.serializer;
                        java.util.Locale locale = java.util.Locale.getDefault();
                        locale.getClass();
                        String upperCase = str.toUpperCase(locale);
                        upperCase.getClass();
                        bootstraplifecyclei.RatingCompat = firebaseFirestore.write("HIGH_PRIO_NOTIFICATIONS_".concat(upperCase)).IconCompatParcelizer(String.valueOf(r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.read)).serializer(new checkActivityStateI(bootstraplifecyclei));
                        return _get_messagewebview_lambda1Write;
                    }
                }
            }
        }
        return _get_messagewebview_lambda1Write;
    }
}
