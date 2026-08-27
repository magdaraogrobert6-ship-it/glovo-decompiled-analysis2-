package androidx.compose.runtime.tooling;

import androidx.sqlite.SQLite;
import com.huawei.riemann.location.common.utils.Constant;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ReversedListReadOnly;
import o.BaseContentCardViewExternalSyntheticLambda0;
import o.BlurKtblur1;
import o.CacheDrawModifierNode;
import o.CacheDrawModifierNodeImpl1;
import o.accessgetRectanglecp;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticComposeException extends RuntimeException {
    public final BlurKtblur1 serializer;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0111  */
    @Override // java.lang.Throwable
    public final String getMessage() {
        BlurKtblur1 blurKtblur1 = this.serializer;
        if (!blurKtblur1.read) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, getQueryParameterslambda2.serializer());
        List list = blurKtblur1.write;
        list.getClass();
        ReversedListReadOnly reversedListReadOnly = new ReversedListReadOnly(list);
        int size = reversedListReadOnly.size();
        String str = null;
        String str2 = null;
        for (int i = 0; i < size; i++) {
            accessgetRectanglecp accessgetrectanglecp = (accessgetRectanglecp) reversedListReadOnly.get(i);
            CacheDrawModifierNodeImpl1 cacheDrawModifierNodeImpl1 = accessgetrectanglecp.IconCompatParcelizer;
            Integer num = accessgetrectanglecp.write;
            if (cacheDrawModifierNodeImpl1 != null) {
                boolean z = cacheDrawModifierNodeImpl1.read;
                String str3 = (String) cacheDrawModifierNodeImpl1.RemoteActionCompatParcelizer;
                if (str3 == null) {
                    String str4 = z ? "<lambda>" : null;
                    if (str4 != null) {
                        str = str4;
                    } else if (str == null) {
                        str = "<unknown function>";
                    }
                } else {
                    str = str3;
                }
                String str5 = (String) cacheDrawModifierNodeImpl1.MediaMetadataCompat;
                if (str5 != null) {
                    str2 = str5;
                } else if (str2 == null) {
                    str2 = "<unknown file>";
                }
                List list2 = (List) cacheDrawModifierNodeImpl1.IconCompatParcelizer;
                String str6 = str + '(' + str2 + ':' + ((num == null || num.intValue() >= list2.size()) ? "<unknown line>" : String.valueOf(((CacheDrawModifierNode) list2.get(num.intValue())).IconCompatParcelizer)) + ')';
                if (!z) {
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "rememberCompositionContext"}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) cacheDrawModifierNodeImpl1.serializer, "9igjgp"}, getCieXyz.write())).booleanValue()) {
                        baseContentCardViewExternalSyntheticLambda0.add(str6);
                    }
                } else {
                    baseContentCardViewExternalSyntheticLambda0.add(str6);
                }
            }
        }
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0Serializer = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
        baseContentCardViewExternalSyntheticLambda0Serializer.getClass();
        ReversedListReadOnly reversedListReadOnly2 = new ReversedListReadOnly(baseContentCardViewExternalSyntheticLambda0Serializer);
        int size2 = reversedListReadOnly2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str7 = (String) reversedListReadOnly2.get(i2);
            sb.append("\tat ");
            sb.append(str7);
            sb.append('\n');
        }
        return sb.toString();
    }

    public DiagnosticComposeException(BlurKtblur1 blurKtblur1) {
        this.serializer = blurKtblur1;
        if (blurKtblur1.read) {
            return;
        }
        int[] iArr = {201, 202, Constant.ERROR_ACC_INVALID, Constant.ERROR_ACC_JUMP, 207, 125, -127, 126665345, 200};
        List list = blurKtblur1.write;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            accessgetRectanglecp accessgetrectanglecp = (accessgetRectanglecp) list.get(i);
            if (!onContentCardClicked.write(iArr, accessgetrectanglecp.read)) {
                if (accessgetrectanglecp.read == 100) {
                    int i2 = i + 2;
                    if (i2 < size && ((accessgetRectanglecp) list.get(i2)).read == 1000) {
                        break;
                    } else {
                        onContentCardDismissed.serializer((AbstractList) arrayList);
                    }
                } else {
                    arrayList.add(accessgetrectanglecp);
                }
            }
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            stackTraceElementArr[i3] = new StackTraceElement("$$compose", "m$" + ((accessgetRectanglecp) arrayList.get(i3)).read, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }
}
