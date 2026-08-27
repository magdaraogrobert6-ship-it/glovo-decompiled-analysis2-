package o;

import android.content.Context;
import android.view.OrientationEventListener;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getTypeUIouoOA extends OrientationEventListener {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ getPlatformAndroidManager read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTypeUIouoOA(Context context, getPlatformAndroidManager getplatformandroidmanager) {
        super(context);
        this.read = getplatformandroidmanager;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030 A[PHI: r1
  0x0030: PHI (r1v14 int) = (r1v8 int), (r1v15 int) binds: [B:35:0x0095, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 105;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = InAppCameraWithTagsKt.serializer;
            i2 = ensuresubscribedtoinappmessageeventslambda7.write;
            if (i <= ensuresubscribedtoinappmessageeventslambda7.read) {
                i3 = 1;
                int i7 = serializer + 51;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (i2 <= i) {
                    i4 = i3;
                }
                ((onHideTranslationui) this.read).serializer(i4);
            }
            i3 = 1;
        } else {
            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8 = InAppCameraWithTagsKt.serializer;
            i2 = ensuresubscribedtoinappmessageeventslambda8.write;
            if (i <= ensuresubscribedtoinappmessageeventslambda8.read) {
                i3 = 0;
                int i9 = serializer + 51;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i2 <= i) {
                    i4 = i3;
                }
                ((onHideTranslationui) this.read).serializer(i4);
            }
            i3 = 0;
        }
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda9 = InAppCameraWithTagsKt.MediaBrowserCompatMediaItem;
        int i11 = ensuresubscribedtoinappmessageeventslambda9.write;
        if (i > ensuresubscribedtoinappmessageeventslambda9.read || i11 > i) {
            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda10 = InAppCameraWithTagsKt.RemoteActionCompatParcelizer;
            int i12 = ensuresubscribedtoinappmessageeventslambda10.write;
            if (i > ensuresubscribedtoinappmessageeventslambda10.read || i12 > i) {
                getDisplayingInAppMessageannotations getdisplayinginappmessageannotations = InAppCameraWithTagsKt.write;
                long j = getdisplayinginappmessageannotations.read;
                long j2 = getdisplayinginappmessageannotations.IconCompatParcelizer;
                long j3 = i;
                if (j > j3 || j3 > j2) {
                    ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda11 = InAppCameraWithTagsKt.IconCompatParcelizer;
                    int i13 = ensuresubscribedtoinappmessageeventslambda11.write;
                    if (i > ensuresubscribedtoinappmessageeventslambda11.read || i13 > i) {
                        return;
                    }
                    int i14 = IconCompatParcelizer + 85;
                    serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    i4 = i3;
                } else {
                    int i15 = serializer + 101;
                    IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i4 = i15 % 2 == 0 ? 0 : 1;
                }
            } else {
                int i16 = IconCompatParcelizer + 51;
                serializer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i17 = i16 % 2;
            }
        } else {
            int i18 = serializer;
            int i19 = i18 + 63;
            IconCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i20 = i19 % 2;
            int i21 = i18 + 45;
            IconCompatParcelizer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i22 = i21 % 2;
            i4 = 3;
        }
        ((onHideTranslationui) this.read).serializer(i4);
    }
}
