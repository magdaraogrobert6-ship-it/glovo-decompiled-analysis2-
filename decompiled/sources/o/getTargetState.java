package o;

import android.net.Uri;
import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getTargetState implements getAnimationSpec {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final setTransactionSuccessful RemoteActionCompatParcelizer;
    public final toDebugStringlambda2 read;

    public getTargetState(toDebugStringlambda2 todebugstringlambda2, setTransactionSuccessful settransactionsuccessful) {
        this.read = todebugstringlambda2;
        this.RemoteActionCompatParcelizer = settransactionsuccessful;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e3 A[PHI: r0
  0x00e3: PHI (r0v20 o.AndroidTypeface_androidKt) = (r0v19 o.AndroidTypeface_androidKt), (r0v25 o.AndroidTypeface_androidKt) binds: [B:32:0x00e1, B:29:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e9  */
    /* JADX WARN: Type inference failed for: r9v3, types: [byte[], int] */
    public final void serializer(Uri uri) {
        Object obj;
        accessgetPlatformFontLoaderp accessgetplatformfontloaderpRemoteActionCompatParcelizer;
        AndroidTypeface_androidKt androidTypeface_androidKtSerializer;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            uri.getClass();
            uri.getQueryParameter(RemoteMessageConst.DATA);
            obj2.hashCode();
            throw null;
        }
        uri.getClass();
        String queryParameter = uri.getQueryParameter(RemoteMessageConst.DATA);
        if (queryParameter == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) queryParameter)) {
            throw new com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.domain.ParseException.UriDoesNotHaveParameterException(uri, RemoteMessageConst.DATA);
        }
        int i3 = write + 15;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            uri.getQueryParameter("paymentSessionToken");
            obj2.hashCode();
            throw null;
        }
        String queryParameter2 = uri.getQueryParameter("paymentSessionToken");
        if (queryParameter2 == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) queryParameter2)) {
            throw new com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.domain.ParseException.UriDoesNotHaveParameterException(uri, "paymentSessionToken");
        }
        int i4 = write + 81;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ?? r9 = i4 % 2;
        try {
            try {
                if (r9 != 0) {
                    Base64.getDecoder().decode(queryParameter).getClass();
                    hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) this.RemoteActionCompatParcelizer.IconCompatParcelizer(com.logistics.rider.glovo.R.string.softPosDecryptionKey));
                    throw null;
                }
                byte[] bArrDecode = Base64.getDecoder().decode(queryParameter);
                bArrDecode.getClass();
                String strIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(com.logistics.rider.glovo.R.string.softPosDecryptionKey);
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strIconCompatParcelizer)) {
                    Timber.RemoteActionCompatParcelizer.read(new IllegalArgumentException("ParseSoftPosCallbackResultUseCaseImpl: softPosDecryptionKey not found. key: ".concat(strIconCompatParcelizer)));
                }
                Charset charset = ensureSubscribedToInAppMessageEvents.write;
                byte[] bytes = strIconCompatParcelizer.getBytes(charset);
                bytes.getClass();
                byte[] bytes2 = queryParameter2.getBytes(charset);
                bytes2.getClass();
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                cipher.init(2, new SecretKeySpec(bytes, "AES/CBC/PKCS5PADDING"), new IvParameterSpec(bytes2));
                byte[] bArrDoFinal = cipher.doFinal(bArrDecode);
                bArrDoFinal.getClass();
                String str = new String(bArrDoFinal, charset);
                try {
                    r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglcSerializer = DelayKt.serializer(new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(4));
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(r8lambda3kmch7yklpui_5smgazrgczhglcSerializer.RemoteActionCompatParcelizer, displayInAppMessagelambda1.IconCompatParcelizer(AndroidPreloadedFont.class));
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpIconCompatParcelizer;
                    AndroidPreloadedFont androidPreloadedFont = (AndroidPreloadedFont) r8lambda3kmch7yklpui_5smgazrgczhglcSerializer.serializer(str, setgraphicmodalmaxwidthdpIconCompatParcelizer);
                    boolean z = false;
                    if (androidPreloadedFont.IconCompatParcelizer() == null && (accessgetplatformfontloaderpRemoteActionCompatParcelizer = androidPreloadedFont.RemoteActionCompatParcelizer()) != null) {
                        int i5 = IconCompatParcelizer + 3;
                        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i5 % 2 == 0) {
                            androidTypeface_androidKtSerializer = accessgetplatformfontloaderpRemoteActionCompatParcelizer.serializer();
                            int i6 = 1 / 0;
                            if (androidTypeface_androidKtSerializer != null) {
                                if (androidTypeface_androidKtSerializer.write()) {
                                    int i7 = IconCompatParcelizer + 79;
                                    write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i8 = i7 % 2;
                                    z = true;
                                }
                            }
                        } else {
                            androidTypeface_androidKtSerializer = accessgetplatformfontloaderpRemoteActionCompatParcelizer.serializer();
                            if (androidTypeface_androidKtSerializer != null) {
                                if (androidTypeface_androidKtSerializer.write()) {
                                    int i9 = IconCompatParcelizer + 79;
                                    write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i10 = i9 % 2;
                                    z = true;
                                }
                            }
                        }
                    }
                    r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k r8lambdacjijjdidooiydnd5vwch0kog5_k = new r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k(queryParameter2, z, androidx.camera.camera2.internal.CameraIdUtil.RemoteActionCompatParcelizer(androidPreloadedFont.read()));
                    MutableStateFlow mutableStateFlow = this.read.write;
                    do {
                        obj = mutableStateFlow.read();
                    } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, r8lambdacjijjdidooiydnd5vwch0kog5_k));
                } catch (Throwable th) {
                    String message = th.getMessage();
                    if (message == null) {
                        int i11 = write + 97;
                        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        message = "";
                    }
                    throw new com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.domain.ParseException.ConvertStringToClassException(message);
                }
            } catch (Throwable unused) {
                String string = Arrays.toString((byte[]) r9);
                string.getClass();
                throw new com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.domain.ParseException.DecryptException("can not decrypt: ".concat(string));
            }
        } catch (IllegalArgumentException e) {
            throw new com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.domain.ParseException.Base64DecodeException(af$$ExternalSyntheticOutline0.m("can not decode ", queryParameter, ". msg: ", e.getMessage()));
        }
    }
}
