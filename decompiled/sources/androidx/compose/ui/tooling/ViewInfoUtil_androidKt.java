package androidx.compose.ui.tooling;

import androidx.compose.ui.unit.IntRect;
import androidx.sqlite.SQLite;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.accessgetBlendMode0nO6VwUjd;
import o.getQueryParameterslambda2;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCarryoverInAppMessage;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class ViewInfoUtil_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean filterTree$lambda$0(ViewInfo viewInfo) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toDebugString$lambda$0(ViewInfo viewInfo) {
        return true;
    }

    public static final String toDebugString(List<ViewInfo> list, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        String strRemoteActionCompatParcelizer = setCarryoverInAppMessage.RemoteActionCompatParcelizer(i, ".");
        StringBuilder sb = new StringBuilder();
        for (ViewInfo viewInfo : onContentCardDismissed.serializer(filterTree(list, r8lambdaunavo3sxub_pc9xroryotnrlvsm), setNativeShader.RemoteActionCompatParcelizer(new accessgetBlendMode0nO6VwUjd(1), new accessgetBlendMode0nO6VwUjd(2), new accessgetBlendMode0nO6VwUjd(3)))) {
            if (viewInfo.getLocation() != null) {
                sb.append(strRemoteActionCompatParcelizer + '|' + viewInfo.getFileName() + ':' + viewInfo.getLineNumber());
                sb.append('\n');
            } else {
                sb.append(strRemoteActionCompatParcelizer + "|<root>");
                sb.append('\n');
            }
            String string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) toDebugString(viewInfo.getChildren(), i + 1, r8lambdaunavo3sxub_pc9xroryotnrlvsm)).toString();
            if (string.length() > 0) {
                sb.append(string);
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    private static final List<ViewInfo> filterTree(List<ViewInfo> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) throws IOException {
        Object objWrite;
        List<ViewInfo> children;
        ArrayList arrayList = new ArrayList();
        for (ViewInfo viewInfo : list) {
            List<ViewInfo> listFilterTree = filterTree(viewInfo.getChildren(), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            ArrayList arrayList2 = new ArrayList();
            for (ViewInfo viewInfo2 : listFilterTree) {
                if (viewInfo2.getLocation() == null) {
                    children = viewInfo2.getChildren();
                } else {
                    int iSerializer = getQueryParameterslambda2.serializer();
                    int iSerializer2 = getQueryParameterslambda2.serializer();
                    children = (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{viewInfo2}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
                }
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) children, (Collection) arrayList2);
            }
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(viewInfo)).booleanValue()) {
                Object[] objArr = {new ViewInfo(viewInfo.getFileName(), viewInfo.getLineNumber(), viewInfo.getBounds(), viewInfo.getLocation(), arrayList2, viewInfo.getLayoutInfo(), viewInfo.getName())};
                int iSerializer3 = getQueryParameterslambda2.serializer();
                objWrite = SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer3);
            } else {
                Object[] objArr2 = {new ViewInfo("<root>", -1, IntRect.Companion.getZero(), null, arrayList2, null, null)};
                int iSerializer4 = getQueryParameterslambda2.serializer();
                objWrite = SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr2, getQueryParameterslambda2.serializer(), -516583649, iSerializer4);
            }
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) objWrite, (Collection) arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable toDebugString$lambda$3(ViewInfo viewInfo) {
        return Integer.valueOf(viewInfo.allChildren().size());
    }

    public static /* synthetic */ List filterTree$default(List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 1) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new accessgetBlendMode0nO6VwUjd(5);
        }
        return filterTree(list, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable toDebugString$lambda$2(ViewInfo viewInfo) {
        return Integer.valueOf(viewInfo.getLineNumber());
    }

    public static /* synthetic */ String toDebugString$default(List list, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new accessgetBlendMode0nO6VwUjd(4);
        }
        return toDebugString(list, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
