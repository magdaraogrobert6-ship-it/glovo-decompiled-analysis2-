package androidx.transition;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.cardview.widget.CardView$1;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.huawei.wisesecurity.kfs.exception.CodecException;
import com.huawei.wisesecurity.ucs.credential.outer.GrsCapability;
import com.logistics.rider.glovo.R;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.text.Normalizer;
import kotlin.LazyKt__LazyJVMKt;
import o.AuthPromptFailureException;
import o.OuterPlacementScope;
import o.ParentDataModifierDefaultImpls;
import o.PausedPrecompositionImpl;
import o.StrokeCompanion;
import o.TextActionModeCallback;
import o.WrappedCompositionsetContent1211;
import o.WrappedCompositionsetContent1221;
import o._init_lambda5;
import o.accessgetNumPadEntercp;
import o.clipPathKD09W0M;
import o.div7Ah8Wj8;
import o.drawImage9jGpkUE;
import o.drawImagegbVJVH8;
import o.drawPathGBMwjPU;
import o.findLineRoot;
import o.generateOetflambda1;
import o.getCameraXConfig;
import o.getInflatedId;
import o.getMediaStepBackwardEK5gGoQ;
import o.getViewPort;
import o.getViewportBoundsInWindow;
import o.modulate5vOe2sY;
import o.onChange;
import o.r8lambda4MdKbfiHpQQwW57A4NP6ZCybbFA;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.seek;
import o.updateMatrix;

/* JADX INFO: loaded from: classes.dex */
public class Transition$1 implements seek, findLineRoot, _init_lambda5, StrokeCompanion, drawImagegbVJVH8, clipPathKD09W0M, OuterPlacementScope, getMediaStepBackwardEK5gGoQ, PausedPrecompositionImpl, OnFailureListener, GrsCapability, getViewportBoundsInWindow {
    public static Transition$1 read;
    public final /* synthetic */ int write;
    public static final /* synthetic */ Transition$1 RemoteActionCompatParcelizer = new Transition$1(20);
    public static final /* synthetic */ Transition$1 IconCompatParcelizer = new Transition$1(21);
    public static final /* synthetic */ Transition$1 serializer = new Transition$1(22);

    @Override // o.getMediaStepBackwardEK5gGoQ
    public /* synthetic */ void RemoteActionCompatParcelizer(zzdz zzdzVar, accessgetNumPadEntercp accessgetnumpadentercp, boolean z, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        zzdzVar.read(accessgetnumpadentercp, z, parentDataModifierDefaultImpls);
    }

    @Override // o._init_lambda5
    public void RemoteActionCompatParcelizer(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // o.OuterPlacementScope
    public /* synthetic */ Object then(Task task) {
        return null;
    }

    public static Path RemoteActionCompatParcelizer(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static void RemoteActionCompatParcelizer(int i, String str, String str2) {
        WrappedCompositionsetContent1211.IconCompatParcelizer.getClass();
        WrappedCompositionsetContent1221 wrappedCompositionsetContent1221 = new WrappedCompositionsetContent1221(i, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("LITE_SDK-", str));
        StringBuilder sb = wrappedCompositionsetContent1221.write;
        sb.append((Object) str2);
        sb.append((Object) '\n');
        sb.append((Object) Log.getStackTraceString(null));
        StringBuilder sb2 = new StringBuilder();
        wrappedCompositionsetContent1221.IconCompatParcelizer(sb2);
        Log.println(i, str, Normalizer.normalize(sb2.toString().concat(" ".concat(sb.toString())), Normalizer.Form.NFKC).replace("\\n", "").replace("\\r", ""));
    }

    @Override // o.findLineRoot
    public CharSequence RemoteActionCompatParcelizer(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        CharSequence[] charSequenceArr = listPreference.MediaDescriptionCompat;
        int iIconCompatParcelizer = listPreference.IconCompatParcelizer(listPreference.PlaybackStateCompatCustomAction);
        if (TextUtils.isEmpty((iIconCompatParcelizer < 0 || charSequenceArr == null) ? null : charSequenceArr[iIconCompatParcelizer])) {
            return listPreference.ResultReceiver.getString(R.string.not_set);
        }
        int iIconCompatParcelizer2 = listPreference.IconCompatParcelizer(listPreference.PlaybackStateCompatCustomAction);
        if (iIconCompatParcelizer2 < 0 || charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[iIconCompatParcelizer2];
    }

    @Override // o.StrokeCompanion
    public Object RemoteActionCompatParcelizer() {
        return new generateOetflambda1();
    }

    public Object RemoteActionCompatParcelizer(Object obj) throws Throwable {
        AuthPromptFailureException authPromptFailureException;
        Bitmap bitmapCreateBitmap;
        getViewPort getviewport = (getViewPort) obj;
        int i = getviewport.serializer;
        Object obj2 = getviewport.read;
        int i2 = getviewport.MediaMetadataCompat;
        AuthPromptFailureException authPromptFailureException2 = null;
        try {
            try {
                if (i == 35) {
                    getInflatedId getinflatedid = (getInflatedId) obj2;
                    boolean z = i2 % 180 != 0;
                    authPromptFailureException = new AuthPromptFailureException(r8lambda4MdKbfiHpQQwW57A4NP6ZCybbFA.IconCompatParcelizer(z ? getinflatedid.serializer() : getinflatedid.RatingCompat(), z ? getinflatedid.RatingCompat() : getinflatedid.serializer(), 1, 2));
                    try {
                        getCameraXConfig getcameraxconfig = ImageProcessingUtil.read(getinflatedid, authPromptFailureException, ByteBuffer.allocateDirect(getinflatedid.RatingCompat() * getinflatedid.serializer() * 4), i2, false);
                        getinflatedid.close();
                        if (getcameraxconfig == null) {
                            throw new ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = ImageUtil.IconCompatParcelizer(getcameraxconfig);
                        getcameraxconfig.close();
                        authPromptFailureException2 = authPromptFailureException;
                    } catch (UnsupportedOperationException e) {
                        e = e;
                        throw new ImageCaptureException(0, "Can't convert " + (i == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th) {
                        th = th;
                        if (authPromptFailureException != null) {
                            authPromptFailureException.serializer();
                        }
                        throw th;
                    }
                } else {
                    if (i != 256 && i != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + i);
                    }
                    getInflatedId getinflatedid2 = (getInflatedId) obj2;
                    Bitmap bitmapIconCompatParcelizer = ImageUtil.IconCompatParcelizer(getinflatedid2);
                    getinflatedid2.close();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i2);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapIconCompatParcelizer, 0, 0, bitmapIconCompatParcelizer.getWidth(), bitmapIconCompatParcelizer.getHeight(), matrix, true);
                }
                if (authPromptFailureException2 != null) {
                    authPromptFailureException2.serializer();
                }
                return bitmapCreateBitmap;
            } catch (Throwable th2) {
                th = th2;
                authPromptFailureException = null;
            }
        } catch (UnsupportedOperationException e2) {
            e = e2;
        }
    }

    @Override // o.PausedPrecompositionImpl
    public Task then(Object obj) {
        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(Boolean.TRUE);
    }

    @Override // com.huawei.wisesecurity.ucs.credential.outer.GrsCapability
    public String synGetGrsUrl(String str, String str2) {
        WrappedCompositionsetContent1211.read();
        return onChange.RemoteActionCompatParcelizer(TextActionModeCallback.RemoteActionCompatParcelizer(), str, str2);
    }

    @Override // o.getViewportBoundsInWindow
    public byte[] IconCompatParcelizer(String str) throws CodecException {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        if ((length & 1) != 0) {
            throw new CodecException("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int iDigit = Character.digit(charArray[i], 16);
            if (iDigit == -1) {
                throw new CodecException(c8$$ExternalSyntheticOutline0.m(i, "Illegal hexadecimal character at index "));
            }
            int i3 = i + 1;
            int iDigit2 = Character.digit(charArray[i3], 16);
            if (iDigit2 == -1) {
                throw new CodecException(c8$$ExternalSyntheticOutline0.m(i3, "Illegal hexadecimal character at index "));
            }
            i += 2;
            bArr[i2] = (byte) (((iDigit << 4) | iDigit2) & 255);
            i2++;
        }
        return bArr;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        SentryLogcatAdapter.read("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // o.drawImagegbVJVH8
    public drawImage9jGpkUE IconCompatParcelizer(MultiModelLoaderFactory multiModelLoaderFactory) {
        return new drawPathGBMwjPU(multiModelLoaderFactory.serializer(modulate5vOe2sY.class, InputStream.class), 1);
    }

    @Override // o.seek
    public long MediaDescriptionCompat() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // o.seek
    public long MediaSessionCompatQueueItem() {
        return System.nanoTime() / 1000;
    }

    public Transition$1(updateMatrix updatematrix) {
        this.write = 18;
        updatematrix.getClass();
    }

    public Transition$1(CardView$1 cardView$1, div7Ah8Wj8 div7ah8wj8) {
        this.write = 16;
    }

    public /* synthetic */ Transition$1(int i) {
        this.write = i;
    }
}
