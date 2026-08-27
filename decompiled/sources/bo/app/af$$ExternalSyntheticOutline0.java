package bo.app;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import o.AndroidContentCaptureManagerCompanion;
import o.ComposeView;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DrawableTransformation;
import o.getPostalCode;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNode;
import o.setSemanticsInvalidatedui;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class af$$ExternalSyntheticOutline0 {
    public static int m$1(int i, int i2, int i3, int i4) {
        return ComposeView.RemoteActionCompatParcelizer(i) + i2 + i3 + i4;
    }

    public static /* synthetic */ void m(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                DrawableTransformation.write();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static int m(int i, int i2, int i3, int i4) {
        return setSemanticsInvalidatedui.read(i) + i2 + i3 + i4;
    }

    public static int m(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int m(ByteBuffer byteBuffer, ByteOrder byteOrder) {
        byteBuffer.order(byteOrder);
        return byteBuffer.getInt(byteBuffer.position());
    }

    public static Object m(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String m(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String m(int i, String str, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String m(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String m(long j, String str) {
        return str + j;
    }

    public static String m(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String m(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder m(double d, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(d);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3, String str4, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(z);
        sb.append(str4);
        return sb;
    }

    public static HashMap m(Class cls, removeNode removenode) {
        HashMap map = new HashMap();
        map.put(cls, removenode);
        return map;
    }

    public static void m(getPostalCode getpostalcode, boolean z, boolean z2, boolean z3) {
        getpostalcode.IconCompatParcelizer(z);
        getpostalcode.IconCompatParcelizer(z2);
        getpostalcode.IconCompatParcelizer(z3);
    }

    public static void m(ComposeUiNode.Companion companion, getPostalCode getpostalcode, MeasurePolicy measurePolicy, getPostalCode getpostalcode2, DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1) {
        AndroidContentCaptureManagerCompanion.write(getpostalcode, measurePolicy, companion.getSetMeasurePolicy());
        AndroidContentCaptureManagerCompanion.write(getpostalcode2, dragAndDropNodestartDragAndDropTransfer1, companion.getSetResolvedCompositionLocals());
    }

    public static int m(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static void m3978m(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static void m(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void m(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static void m(isItemDismissable isitemdismissable, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(isitemdismissable));
    }
}
