package bo.app;

import androidx.compose.foundation.MutatorMutex$Mutator;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import coil3.ExtrasKt;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.CircleLayer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import o.IncorrectJpegMetadataQuirk;
import o.TriStateCheckbox;
import o.accessgetRoundcp;
import o.getButtonAEK5gGoQ;
import o.getClickableInAppMessageView;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.hasChangedDevices;
import o.isAppSetIdReadingEnabled;
import o.r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.setContentViewGroupParentLayout;
import org.joda.time.DateTimeZone;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class af$$ExternalSyntheticOutline1 {
    public static /* synthetic */ void m(getButtonAEK5gGoQ getbuttonaek5ggoq) {
        boolean zIsTerminated;
        if (getbuttonaek5ggoq == ForkJoinPool.commonPool() || (zIsTerminated = getbuttonaek5ggoq.isTerminated())) {
            return;
        }
        getbuttonaek5ggoq.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = getbuttonaek5ggoq.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    getbuttonaek5ggoq.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static IncorrectJpegMetadataQuirk m(ArrayList arrayList, IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk) {
        arrayList.add(incorrectJpegMetadataQuirk);
        return new IncorrectJpegMetadataQuirk();
    }

    public static Modifier m(Modifier.Companion companion, float f, getPostalCode getpostalcode, Modifier.Companion companion2, float f2) {
        Object[] objArr = {getpostalcode, SizeKt.m75height3ABfNKs(companion, f)};
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, objArr);
        return SizeKt.write(companion2, f2);
    }

    public static ValueElementSequence m(boolean z, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Boolean.valueOf(z));
        return inspectorInfo.getProperties();
    }

    public static Expression m(Expression.ExpressionBuilder expressionBuilder, Expression expression, CircleLayer circleLayer) {
        expressionBuilder.addArgument(expression);
        Expression expressionBuild = expressionBuilder.build();
        circleLayer.getClass();
        return expressionBuild;
    }

    public static String m(String str, JSONObject jSONObject) {
        return str + jSONObject;
    }

    public static String m(StringBuilder sb, ArrayList arrayList, char c) {
        sb.append(arrayList);
        sb.append(c);
        return sb.toString();
    }

    public static /* synthetic */ Iterator m() {
        try {
            return Arrays.asList(new accessgetRoundcp[0]).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static KotlinNothingValueException m(String str) {
        TriStateCheckbox.write(str);
        return new KotlinNothingValueException();
    }

    public static void m(byte b, int i, r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Byte b2) throws IOException {
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b2.byteValue());
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i, b);
    }

    public static void m(long j, String str, StringBuilder sb) {
        sb.append(RecordUtils.fieldToString(Long.valueOf(j)));
        sb.append(str);
    }

    public static int m(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static void m(Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder, NetworkRequestMetricBuilder networkRequestMetricBuilder2) {
        networkRequestMetricBuilder.IconCompatParcelizer(timer.read());
        hasChangedDevices.RemoteActionCompatParcelizer(networkRequestMetricBuilder2);
    }

    public static void m(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, int i, byte b, Double d) throws IOException {
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i, b);
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(d.doubleValue());
    }

    public static void m(Double d, StringBuilder sb, String str) {
        sb.append(RecordUtils.fieldToString(d));
        sb.append(str);
    }

    public static void m(HashMap map) {
        Collections.unmodifiableMap(new HashMap(map));
    }

    public static /* synthetic */ void m(List list) {
        if (list == null) {
            return;
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
    }

    public static /* synthetic */ boolean write(AtomicReference atomicReference, MutatorMutex$Mutator mutatorMutex$Mutator, MutatorMutex$Mutator mutatorMutex$Mutator2) {
        while (!atomicReference.compareAndSet(mutatorMutex$Mutator, mutatorMutex$Mutator2)) {
            if (atomicReference.get() != mutatorMutex$Mutator) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean IconCompatParcelizer(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean RemoteActionCompatParcelizer(AtomicReference atomicReference, DateTimeZone dateTimeZone) {
        while (!atomicReference.compareAndSet(null, dateTimeZone)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean RemoteActionCompatParcelizer(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, JobSupport jobSupport, setContentViewGroupParentLayout setcontentviewgroupparentlayout, getClickableInAppMessageView getclickableinappmessageview) {
        while (!atomicReferenceFieldUpdater.compareAndSet(jobSupport, setcontentviewgroupparentlayout, getclickableinappmessageview)) {
            if (atomicReferenceFieldUpdater.get(jobSupport) != setcontentviewgroupparentlayout) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean serializer(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, LockFreeLinkedListNode lockFreeLinkedListNode3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, lockFreeLinkedListNode3)) {
            if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) != lockFreeLinkedListNode2) {
                return false;
            }
        }
        return true;
    }
}
