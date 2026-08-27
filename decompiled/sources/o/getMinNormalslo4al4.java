package o;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class getMinNormalslo4al4 implements getPositiveZeroslo4al4 {
    public static final String[] read = new String[0];

    public getMinNormalslo4al4() {
    }

    @Override // o.getPositiveZeroslo4al4
    public String[] write() {
        return read;
    }

    public static void serializer(WebMessage webMessage) {
        webMessage.getData();
        WebMessagePort[] ports = webMessage.getPorts();
        if (ports == null) {
            return;
        }
        getMinNormalslo4al4[] getminnormalslo4al4Arr = new getMinNormalslo4al4[ports.length];
        for (int i = 0; i < ports.length; i++) {
            WebMessagePort webMessagePort = ports[i];
            getminnormalslo4al4Arr[i] = new getMinNormalslo4al4(0);
        }
    }

    @Override // o.getPositiveZeroslo4al4
    public StaticsBoundaryInterface k_() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // o.getPositiveZeroslo4al4
    public WebkitToCompatConverterBoundaryInterface read() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // o.getPositiveZeroslo4al4
    public void write(truncslo4al4 truncslo4al4Var, OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public getMinNormalslo4al4(int i) {
    }
}
