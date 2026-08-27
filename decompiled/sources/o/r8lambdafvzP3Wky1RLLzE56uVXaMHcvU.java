package o;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import java.util.HashMap;
import java.util.List;
import retrofit2.OkHttpCall$1;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class r8lambdafvzP3Wky1RLLzE56uVXaMHcvU {
    public static float write(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static String RemoteActionCompatParcelizer(String str, String str2) {
        return str + str2;
    }

    public static String write(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static int RemoteActionCompatParcelizer(double d, int i, int i2) {
        return (Double.hashCode(d) + i) * i2;
    }

    public static int serializer(int i, int i2, int i3) {
        return RequestChildFocusKt.serializer(i) + i2 + i3;
    }

    public static int serializer(androidx.compose.ui.node.LayoutNode layoutNode) {
        return layoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui();
    }

    public static Object IconCompatParcelizer(int i, List list) {
        return list.get(list.size() - i);
    }

    public static String write(double d, String str, StringBuilder sb) {
        sb.append(RecordUtils.fieldToString(Double.valueOf(d)));
        sb.append(str);
        return sb.toString();
    }

    public static String serializer(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String serializer(String str, String str2) {
        return str + str2;
    }

    public static String serializer(String str, boolean z) {
        return str + z;
    }

    public static String read(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static void read(androidx.compose.ui.node.ComposeUiNode.Companion companion, getPostalCode getpostalcode, supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3default, getPostalCode getpostalcode2, DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1) {
        AndroidContentCaptureManagerCompanion.write(getpostalcode, supportingtextpaddinga9ujit4material3default, companion.getSetMeasurePolicy());
        AndroidContentCaptureManagerCompanion.write(getpostalcode2, dragAndDropNodestartDragAndDropTransfer1, companion.getSetResolvedCompositionLocals());
    }

    public static void IconCompatParcelizer(String str, Expression expression, SymbolLayer symbolLayer) {
        symbolLayer.setProperty$extension_style_release(new PropertyValue(str, expression));
    }

    public static void write(String str, Timber.Forest forest) {
        forest.write(new IllegalStateException(str));
    }

    public static void write(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static void RemoteActionCompatParcelizer(HashMap map, String str, OkHttpCall$1 okHttpCall$1, String str2, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        Object obj = map.get(str);
        okHttpCall$1.write(str2);
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, obj);
    }

    public static void write(getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release, syncClientfwf_client_release syncclientfwf_client_release) {
        syncclientfwf_client_release.read(new getMetricProviderfwf_client_release(getexposurehandlerfwf_client_release));
    }
}
