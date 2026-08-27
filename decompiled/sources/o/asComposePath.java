package o;

import android.content.Context;
import androidx.cardview.widget.CardView$1;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import bo.app.f2$$ExternalSyntheticLambda4;
import com.mapbox.search.SearchEngineImpl$search$3;
import io.sentry.android.navigation.SentryNavigationListener;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class asComposePath {
    public static String write(String str) {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new BigInteger("10" + str, 16).toByteArray());
            byteBufferWrap.get();
            return String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(byteBufferWrap.getShort()), Integer.valueOf(byteBufferWrap.getInt()));
        } catch (NumberFormatException | BufferUnderflowException unused) {
            return null;
        }
    }

    public static final relativeMoveTo read(toAndroidPathDashPathEffectStyleoQv6xUo[] toandroidpathdashpatheffectstyleoqv6xuoArr, getBirthDateFull getbirthdatefull) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Context context = (Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        Object[] objArrCopyOf = Arrays.copyOf(toandroidpathdashpatheffectstyleoqv6xuoArr, toandroidpathdashpatheffectstyleoqv6xuoArr.length);
        CardView$1 cardView$1 = new CardView$1(new ScrollState$$ExternalSyntheticLambda3(23), 5, new f2$$ExternalSyntheticLambda4(3, context));
        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(context);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
            objComponentActivity = new Path(context);
            getpostalcode.write(objComponentActivity);
        }
        relativeMoveTo relativemoveto = (relativeMoveTo) getEventType.read(objArrCopyOf, cardView$1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 0, 4);
        for (toAndroidPathDashPathEffectStyleoQv6xUo toandroidpathdashpatheffectstyleoqv6xuo : toandroidpathdashpatheffectstyleoqv6xuoArr) {
            relativemoveto.read.IconCompatParcelizer.write(toandroidpathdashpatheffectstyleoqv6xuo);
        }
        relativemoveto.getClass();
        Boolean bool = Boolean.TRUE;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = androidx.compose.runtime.CompositionKt.serializer(new SentryNavigationListener(((Boolean) androidx.compose.runtime.CompositionKt.serializer(bool, getbirthdatefull).getValue()).booleanValue(), ((Boolean) androidx.compose.runtime.CompositionKt.serializer(bool, getbirthdatefull).getValue()).booleanValue()), getbirthdatefull);
        supportsColorMatrixQuery lifecycle = ((accessisRenderNodeCompatiblecp) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        lifecycle.getClass();
        boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(relativemoveto);
        boolean z = getpostalcode.read(populateViewStructure_androidKtpopulate7Serializer);
        boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(lifecycle);
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if ((zIconCompatParcelizer2 | z | zIconCompatParcelizer3) || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = new SearchEngineImpl$search$3(relativemoveto, lifecycle, populateViewStructure_androidKtpopulate7Serializer, 7);
            getpostalcode.write(objComponentActivity2);
        }
        getPhoneNumberNational.IconCompatParcelizer(lifecycle, relativemoveto, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode);
        return relativemoveto;
    }
}
