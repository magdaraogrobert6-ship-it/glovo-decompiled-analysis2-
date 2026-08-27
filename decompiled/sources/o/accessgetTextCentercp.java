package o;

import android.net.Uri;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.ContainerUtils;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.composable.LastStopMapPinKt;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DelayKt;
import retrofit2.OkHttpCall$1;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class accessgetTextCentercp implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ accessgetTextCentercp(int i) {
        this.serializer = i;
    }

    public /* synthetic */ accessgetTextCentercp(int i, Object obj) {
        this.serializer = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = null;
        switch (i2) {
            case 0:
                tintxETnrds tintxetnrds = (tintxETnrds) obj;
                tintxetnrds.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("DELETE FROM session");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
                    return createfromparcel;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                }
            case 1:
                setToggleableState settoggleablestate = (setToggleableState) obj;
                settoggleablestate.getClass();
                return settoggleablestate.getType();
            case 2:
                ((String) obj).getClass();
                return createfromparcel;
            case 3:
                return createfromparcel;
            case 4:
                Timber.RemoteActionCompatParcelizer.serializer((Throwable) obj, "CustomerChat syncTotalUnreadCount failed", new Object[0]);
                return createfromparcel;
            case 5:
                List list = (List) obj;
                list.getClass();
                int i3 = read + 115;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return list;
                }
                throw null;
            case 6:
                onTouch ontouch = (onTouch) obj;
                ontouch.getClass();
                ontouch.MediaDescriptionCompat = true;
                ontouch.MediaSessionCompatQueueItem = true;
                prepareInAppMessageWithZippedAssetHtmllambda3 prepareinappmessagewithzippedassethtmllambda3 = new prepareInAppMessageWithZippedAssetHtmllambda3();
                OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(displayInAppMessagelambda1.serializer(getPlaceholderRects.class));
                okHttpCall$1.read(displayInAppMessagelambda1.serializer(isLineEllipsized.class), isLineEllipsized.Companion.serializer());
                okHttpCall$1.read(displayInAppMessagelambda1.serializer(accesstoLayoutAlignaXe7zB0.class), accesstoLayoutAlignaXe7zB0.Companion.serializer());
                okHttpCall$1.read(displayInAppMessagelambda1.serializer(flatMapAnnotations.class), flatMapAnnotations.Companion.serializer());
                okHttpCall$1.read(displayInAppMessagelambda1.serializer(numberOfLinesThatFitMaxHeight.class), numberOfLinesThatFitMaxHeight.Companion.serializer());
                okHttpCall$1.read(displayInAppMessagelambda1.serializer(getTextPaintui_text.class), getTextPaintui_text.Companion.serializer());
                okHttpCall$1.read(displayInAppMessagelambda1.serializer(getLinkAnnotations.class), getLinkAnnotations.Companion.serializer());
                okHttpCall$1.write(prepareinappmessagewithzippedassethtmllambda3);
                prepareInAppMessageWithZippedAssetHtmllambda3.read(prepareinappmessagewithzippedassethtmllambda3, displayInAppMessagelambda1.serializer(getPlaceholderRects.class), new prepareInAppMessageWithHtmllambda0(getSpanStylesOrNullui_text.RemoteActionCompatParcelizer));
                ontouch.PlaybackStateCompat = prepareinappmessagewithzippedassethtmllambda3.RemoteActionCompatParcelizer();
                int i4 = RemoteActionCompatParcelizer + 99;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return createfromparcel;
                }
                obj2.hashCode();
                throw null;
            case 7:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 8:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return af$$ExternalSyntheticOutline0.m(withBulletListo2QH7mI.write((String) entry.getKey()), ":", withBulletListo2QH7mI.write("sha256-".concat(withBulletListo2QH7mI.read(((getDefaultSizeXSAIIZE) entry.getValue()).write))));
            case 9:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                Object key = entry2.getKey();
                key.getClass();
                Object value = entry2.getValue();
                value.getClass();
                return af$$ExternalSyntheticOutline0.m(Uri.encode((String) key), ContainerUtils.KEY_VALUE_DELIMITER, Uri.encode((String) value));
            case 10:
                onTouch ontouch2 = (onTouch) obj;
                ontouch2.getClass();
                ontouch2.MediaBrowserCompatMediaItem = true;
                ontouch2.MediaDescriptionCompat = true;
                ontouch2.MediaSessionCompatQueueItem = true;
                return createfromparcel;
            case 11:
                getDefaultPaddingXSAIIZE getdefaultpaddingxsaiize = (getDefaultPaddingXSAIIZE) obj;
                getdefaultpaddingxsaiize.getClass();
                return getdefaultpaddingxsaiize.read();
            case 12:
                ((Boolean) obj).getClass();
                return createfromparcel;
            case 13:
                String str = (String) obj;
                str.getClass();
                return new r8lambdabAUvFru7SWhBG96DD9tfaAOGcw4(new r8lambdaDSnLp5A0hnFHUbFJVtSD2Yt4(str));
            case 14:
                String str2 = (String) obj;
                str2.getClass();
                return new r8lambdabAUvFru7SWhBG96DD9tfaAOGcw4(new r8lambdaEUg_GsBvPowLz4lhpWPGLmVFxe0(str2));
            case 15:
                getEnterdhqQ8s getenterdhqq8s = (getEnterdhqQ8s) obj;
                getenterdhqq8s.getClass();
                getenterdhqq8s.write(true);
                getenterdhqq8s.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = 300000L;
                return createfromparcel;
            case 16:
                return createfromparcel;
            case 17:
                ((androidx.compose.ui.graphics.drawscope.DrawScope) obj).getClass();
                return createfromparcel;
            case 18:
                ((IndirectPointerInputDragCycleDetector) obj).getClass();
                return androidx.compose.animation.AnimatedContentKt.RemoteActionCompatParcelizer(onKeyEventZmokQxo.RemoteActionCompatParcelizer(new accessgetTextCentercp(19)).serializer(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3)), onKeyEventZmokQxo.serializer(new accessgetTextCentercp(20), 1).read(onKeyEventZmokQxo.write(null, 3)));
            case 19:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 20:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 21:
                ((IndirectPointerInputDragCycleDetector) obj).getClass();
                int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                int iWrite2 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                int iWrite3 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, iWrite2, -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite3, iWrite, new Object[]{150, 0, null, 6}), 2);
                int iWrite4 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                int iWrite5 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                int iWrite6 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                PressGestureScopeImpl pressGestureScopeImplRemoteActionCompatParcelizer = androidx.compose.animation.AnimatedContentKt.RemoteActionCompatParcelizer(scrollingLogicdoFlingAnimation2reverseScope1Serializer, onKeyEventZmokQxo.write((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, iWrite5, -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite6, iWrite4, new Object[]{150, 0, null, 6}), 2));
                pressGestureScopeImplRemoteActionCompatParcelizer.IconCompatParcelizer = new TapGestureDetectorKtdetectTapAndPress21(false, new ScrollState$$ExternalSyntheticLambda3(29));
                return pressGestureScopeImplRemoteActionCompatParcelizer;
            case 22:
                androidx.compose.ui.graphics.drawscope.DrawScope drawScope = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
                drawScope.getClass();
                androidx.compose.ui.graphics.drawscope.DrawScope.m1292drawOvalnJ9OG0$default(drawScope, LastStopMapPinKt.read, 0L, 0L, 0.0f, null, null, 0, 126, null);
                return createfromparcel;
            case 23:
                androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope = (androidx.compose.ui.graphics.GraphicsLayerScope) obj;
                graphicsLayerScope.getClass();
                graphicsLayerScope.setTranslationY((-Float.intBitsToFloat((int) (graphicsLayerScope.mo919getSizeNHjbRc() & 4294967295L))) / 2.0f);
                return createfromparcel;
            case 24:
                ((getAutofillTree) obj).getClass();
                return Boolean.TRUE;
            case 25:
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((Throwable) obj, "ackNewOrderSeen is failed.", new Object[0]);
                return createfromparcel;
            case 26:
                onTouch ontouch3 = (onTouch) obj;
                ontouch3.getClass();
                ontouch3.MediaDescriptionCompat = true;
                ontouch3.MediaMetadataCompat = true;
                return createfromparcel;
            case 27:
                getTopLeftnOccac gettopleftnoccac = (getTopLeftnOccac) obj;
                gettopleftnoccac.getClass();
                return gettopleftnoccac.read();
            case 28:
                ((String) obj).getClass();
                return createfromparcel;
            default:
                ((String) obj).getClass();
                return createfromparcel;
        }
    }
}
