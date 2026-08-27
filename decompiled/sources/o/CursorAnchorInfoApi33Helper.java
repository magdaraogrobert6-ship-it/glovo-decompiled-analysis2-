package o;

import android.content.Context;
import android.view.OrientationEventListener;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class CursorAnchorInfoApi33Helper extends OrientationEventListener {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ getPlatformAndroidManager RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnchorInfoApi33Helper(Context context, getPlatformAndroidManager getplatformandroidmanager) {
        super(context);
        this.RemoteActionCompatParcelizer = getplatformandroidmanager;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7;
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8;
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda9 = InAppCameraWithTagsKt.write;
        int i6 = ensuresubscribedtoinappmessageeventslambda9.write;
        if (i > ensuresubscribedtoinappmessageeventslambda9.read || i6 > i) {
            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda10 = InAppCameraWithTagsKt.MediaBrowserCompatMediaItem;
            int i7 = ensuresubscribedtoinappmessageeventslambda10.write;
            if (i > ensuresubscribedtoinappmessageeventslambda10.read || i7 > i) {
                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda11 = InAppCameraWithTagsKt.IconCompatParcelizer;
                int i8 = ensuresubscribedtoinappmessageeventslambda11.write;
                if (i <= ensuresubscribedtoinappmessageeventslambda11.read) {
                    int i9 = serializer + 21;
                    int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    write = i10;
                    int i11 = i9 % 2;
                    if (i8 <= i) {
                        int i12 = i10 + 93;
                        serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                    } else {
                        ensuresubscribedtoinappmessageeventslambda7 = InAppCameraWithTagsKt.RemoteActionCompatParcelizer;
                        int i14 = ensuresubscribedtoinappmessageeventslambda7.write;
                        if (i <= ensuresubscribedtoinappmessageeventslambda7.read || i14 > i) {
                            ensuresubscribedtoinappmessageeventslambda8 = InAppCameraWithTagsKt.MediaMetadataCompat;
                            i2 = ensuresubscribedtoinappmessageeventslambda8.write;
                            if (i <= ensuresubscribedtoinappmessageeventslambda8.read) {
                                return;
                            }
                            int i15 = write + 23;
                            i3 = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            serializer = i3;
                            int i16 = i15 % 2;
                            if (i2 <= i) {
                                return;
                            }
                            int i17 = i3 + 43;
                            write = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                        } else {
                            i4 = 1;
                        }
                    }
                } else {
                    ensuresubscribedtoinappmessageeventslambda7 = InAppCameraWithTagsKt.RemoteActionCompatParcelizer;
                    int i19 = ensuresubscribedtoinappmessageeventslambda7.write;
                    if (i <= ensuresubscribedtoinappmessageeventslambda7.read) {
                    }
                    ensuresubscribedtoinappmessageeventslambda8 = InAppCameraWithTagsKt.MediaMetadataCompat;
                    i2 = ensuresubscribedtoinappmessageeventslambda8.write;
                    if (i <= ensuresubscribedtoinappmessageeventslambda8.read) {
                        return;
                    }
                    int i110 = write + 23;
                    i3 = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    serializer = i3;
                    int i111 = i110 % 2;
                    if (i2 <= i) {
                        return;
                    }
                    int i112 = i3 + 43;
                    write = i112 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i113 = i112 % 2;
                }
            } else {
                int i20 = serializer + 11;
                int i21 = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                write = i21;
                int i22 = i20 % 2;
                int i23 = i21 + 91;
                serializer = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i24 = i23 % 2;
                i4 = 3;
            }
            ((onHideTranslationui) this.RemoteActionCompatParcelizer).serializer(i4);
        }
        int i25 = serializer + 97;
        write = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i26 = i25 % 2;
        i4 = 0;
        ((onHideTranslationui) this.RemoteActionCompatParcelizer).serializer(i4);
    }
}
