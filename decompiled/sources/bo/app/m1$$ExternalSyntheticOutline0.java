package bo.app;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.deliveryhero.fwf_logger.ILogger;
import com.huawei.hms.support.log.HMSLog;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.CircleLayer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.navigator.R;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.AndroidContentCaptureManagerCompanion;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.getIdentifiersValidationsEnabled;
import o.getPostalCode;
import o.isAppSetIdReadingEnabled;
import o.obtainShadowContext;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.updateAdidI;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class m1$$ExternalSyntheticOutline0 implements obtainShadowContext {
    public static String m(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String m(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String m(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String m(Object obj, String str) {
        return str + obj;
    }

    public static String m(String str, int i, char c) {
        return str + i + c;
    }

    public static Object m(getIdentifiersValidationsEnabled getidentifiersvalidationsenabled, String str, Class cls) {
        getidentifiersvalidationsenabled.getClass();
        getidentifiersvalidationsenabled.write(str);
        Object objWrite = getidentifiersvalidationsenabled.write().write(cls);
        objWrite.getClass();
        return objWrite;
    }

    public static StringBuilder m(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder m(String str, int i, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static Map m(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 m(ComposeUiNode.Companion companion, getPostalCode getpostalcode, MeasurePolicy measurePolicy, getPostalCode getpostalcode2, DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1) {
        AndroidContentCaptureManagerCompanion.write(getpostalcode, measurePolicy, companion.getSetMeasurePolicy());
        AndroidContentCaptureManagerCompanion.write(getpostalcode2, dragAndDropNodestartDragAndDropTransfer1, companion.getSetResolvedCompositionLocals());
        return companion.getSetCompositeKeyHash();
    }

    public static r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 m(ComposeUiNode.Companion companion, getPostalCode getpostalcode, Integer num, getPostalCode getpostalcode2) {
        AndroidContentCaptureManagerCompanion.write(getpostalcode, num, companion.getSetCompositeKeyHash());
        AndroidContentCaptureManagerCompanion.write(getpostalcode2, companion.getApplyOnDeactivatedNodeAssertion());
        return companion.getSetModifier();
    }

    public static void m(double d, String str, StringBuilder sb) {
        sb.append(RecordUtils.fieldToString(Double.valueOf(d)));
        sb.append(str);
    }

    public static void m(long j, long j2, int i) {
        ColorKt.Color(j);
        ColorKt.Color(j2);
        ColorKt.Color(i);
    }

    public static void m(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        HMSLog.e(str, sb.toString());
    }

    public static /* synthetic */ void m(Object obj) {
        if (obj == null) {
            return;
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
    }

    public static void m(String str, Expression expression, CircleLayer circleLayer) {
        circleLayer.setProperty$extension_style_release(new PropertyValue(str, expression));
    }

    public static void m(String str, String str2, ILogger iLogger, String str3) {
        iLogger.logE(str3, str + str2);
    }

    public static void m(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    public static void m(ConcurrentHashMap concurrentHashMap, String str, OkHttpCall$1 okHttpCall$1, String str2, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        Object obj = concurrentHashMap.get(str);
        okHttpCall$1.write(str2);
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, obj);
    }

    public static boolean m(updateAdidI updateadidi, FirebaseRemoteConfigProvider firebaseRemoteConfigProvider, String str, FirebaseRemoteConfigImpl firebaseRemoteConfigImpl) {
        Object[] objArr = {firebaseRemoteConfigImpl, firebaseRemoteConfigProvider.IconCompatParcelizer(updateadidi.getFirebaseFlagName(), str)};
        int iSerializer = R.serializer();
        return ((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(28645399, R.serializer(), R.serializer(), -28645399, R.serializer(), iSerializer, objArr)).booleanValue();
    }
}
