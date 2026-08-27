package o;

import android.database.Cursor;
import androidx.compose.ui.platform.ValueElementSequence;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import io.reactivex.disposables.Disposable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class MediaSessionCompatQueueItem {
    public static String RemoteActionCompatParcelizer(String str, getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations, String str2, getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations2) {
        return str + getunspecified0d7_kjuannotations + str2 + getunspecified0d7_kjuannotations2;
    }

    public static int IconCompatParcelizer(int i, int i2, long j) {
        return (androidx.compose.ui.graphics.Color.m729hashCodeimpl(j) + i) * i2;
    }

    public static int serializer(androidx.compose.ui.text.TextStyle textStyle, int i, int i2) {
        return (textStyle.hashCode() + i) * i2;
    }

    public static ValueElementSequence serializer(float f, ValueElementSequence valueElementSequence, String str, androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, androidx.compose.ui.unit.Dp.m3671boximpl(f));
        return inspectorInfo.getProperties();
    }

    public static Expression IconCompatParcelizer(Expression.ExpressionBuilder expressionBuilder, Expression expression, LineLayer lineLayer) {
        expressionBuilder.addArgument(expression);
        Expression expressionBuild = expressionBuilder.build();
        lineLayer.getClass();
        return expressionBuild;
    }

    public static Integer IconCompatParcelizer(ByteBuffer byteBuffer, HashMap map, Integer num, int i) {
        map.put(num, byteBuffer.rewind());
        return Integer.valueOf(i);
    }

    public static Object serializer(getPasteEK5gGoQ getpasteek5ggoq, int i, ArrayList arrayList, int i2) {
        getTvInputComposite2EK5gGoQ.serializer(arrayList, i, getpasteek5ggoq.name());
        return arrayList.get(i2);
    }

    public static String read(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        return sb.toString();
    }

    public static int RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        return KeyInputModifierKt.IconCompatParcelizer(i) + i2 + i3 + i4;
    }

    public static String read(String str, String str2, Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str.concat(str2)));
    }

    public static String read(String str, String str2, List list) {
        return str + list + str2;
    }

    public static String serializer(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static String serializer(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String RemoteActionCompatParcelizer(StringBuilder sb, Byte b, String str) {
        sb.append(b);
        sb.append(str);
        return sb.toString();
    }

    public static String read(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static String serializer(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
        return sb.toString();
    }

    public static String read(List list, StringBuilder sb, String str) {
        sb.append(RecordUtils.fieldToString(list));
        sb.append(str);
        return sb.toString();
    }

    public static ArrayList read(int i, HashMap map, ArrayList arrayList, int i2, String str) {
        map.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    public static HashMap serializer(Class cls, accessgetMousecp accessgetmousecp) {
        HashMap map = new HashMap();
        map.put(cls, accessgetmousecp);
        return map;
    }

    public static Iterator write(Map map, r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, byte b, byte b2) throws IOException {
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(b, b2, map.size());
        return map.entrySet().iterator();
    }

    public static void serializer(byte b, StringBuilder sb, String str) {
        sb.append(RecordUtils.fieldToString(Byte.valueOf(b)));
        sb.append(str);
    }

    public static void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, int i, byte b, Boolean bool) throws IOException {
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i, b);
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(bool.booleanValue() ? (byte) 1 : (byte) 0);
    }

    public static /* synthetic */ void serializer(Object obj) {
        throw new ClassCastException();
    }

    public static void RemoteActionCompatParcelizer(StringBuilder sb, String str, String str2, List list, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
    }

    public static void write(StringBuilder sb, boolean z, String str) {
        sb.append(RecordUtils.fieldToString(Boolean.valueOf(z)));
        sb.append(str);
    }

    public static /* synthetic */ boolean IconCompatParcelizer(AtomicReference atomicReference, androidx.compose.ui.text.input.TextInputSession textInputSession) {
        while (!atomicReference.compareAndSet(textInputSession, null)) {
            if (atomicReference.get() != textInputSession) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean IconCompatParcelizer(AtomicReference atomicReference, Disposable disposable) {
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean write(AtomicReference atomicReference, Throwable th) {
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean IconCompatParcelizer(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, BufferedChannel bufferedChannel, Segment segment, Segment segment2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(bufferedChannel, segment, segment2)) {
            if (atomicReferenceFieldUpdater.get(bufferedChannel) != segment) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean IconCompatParcelizer(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, getDefaultInAppMessageViewFactorylambda0 getdefaultinappmessageviewfactorylambda0, _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0) {
        while (!atomicReferenceFieldUpdater.compareAndSet(getdefaultinappmessageviewfactorylambda0, _set_shouldnextunregisterbeskipped_lambda0, null)) {
            if (atomicReferenceFieldUpdater.get(getdefaultinappmessageviewfactorylambda0) != _set_shouldnextunregisterbeskipped_lambda0) {
                return false;
            }
        }
        return true;
    }
}
