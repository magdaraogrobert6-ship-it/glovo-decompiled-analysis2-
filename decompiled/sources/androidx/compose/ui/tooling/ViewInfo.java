package androidx.compose.ui.tooling;

import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.getCieXyz;
import o.isCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class ViewInfo {
    public static final int $stable = 8;
    private final IntRect bounds;
    private final List<ViewInfo> children;
    private final String fileName;
    private final Object layoutInfo;
    private final int lineNumber;
    private final SourceLocation location;
    private final String name;

    public final String component1() {
        return this.fileName;
    }

    public final int component2() {
        return this.lineNumber;
    }

    public final IntRect component3() {
        return this.bounds;
    }

    public final SourceLocation component4() {
        return this.location;
    }

    public final List<ViewInfo> component5() {
        return this.children;
    }

    public final Object component6() {
        return this.layoutInfo;
    }

    public final String component7() {
        return this.name;
    }

    public final IntRect getBounds() {
        return this.bounds;
    }

    public final List<ViewInfo> getChildren() {
        return this.children;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final Object getLayoutInfo() {
        return this.layoutInfo;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    public final SourceLocation getLocation() {
        return this.location;
    }

    public final String getName() {
        return this.name;
    }

    public final ViewInfo copy(String str, int i, IntRect intRect, SourceLocation sourceLocation, List<ViewInfo> list, Object obj, String str2) {
        return new ViewInfo(str, i, intRect, sourceLocation, list, obj, str2);
    }

    public final boolean hasBounds() {
        return (this.bounds.getBottom() == 0 || this.bounds.getRight() == 0) ? false : true;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.lineNumber, this.fileName.hashCode() * 31, 31);
        int iHashCode = this.bounds.hashCode();
        SourceLocation sourceLocation = this.location;
        int iM2 = c8$$ExternalSyntheticOutline0.m(this.children, (((iHashCode + iM) * 31) + (sourceLocation == null ? 0 : sourceLocation.hashCode())) * 31, 31);
        Object obj = this.layoutInfo;
        int iHashCode2 = obj == null ? 0 : obj.hashCode();
        String str = this.name;
        return ((iM2 + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public ViewInfo(String str, int i, IntRect intRect, SourceLocation sourceLocation, List<ViewInfo> list, Object obj, String str2) {
        this.fileName = str;
        this.lineNumber = i;
        this.bounds = intRect;
        this.location = sourceLocation;
        this.children = list;
        this.layoutInfo = obj;
        this.name = str2;
    }

    public final List<ViewInfo> allChildren() {
        List<ViewInfo> list = this.children;
        List<ViewInfo> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((ViewInfo) it.next()).allChildren(), (Collection) arrayList);
        }
        return onContentCardDismissed.IconCompatParcelizer(arrayList, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewInfo copy$default(ViewInfo viewInfo, String str, int i, IntRect intRect, SourceLocation sourceLocation, List list, Object obj, String str2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = viewInfo.fileName;
        }
        if ((i2 & 2) != 0) {
            i = viewInfo.lineNumber;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            intRect = viewInfo.bounds;
        }
        IntRect intRect2 = intRect;
        if ((i2 & 8) != 0) {
            sourceLocation = viewInfo.location;
        }
        SourceLocation sourceLocation2 = sourceLocation;
        if ((i2 & 16) != 0) {
            list = viewInfo.children;
        }
        List list2 = list;
        if ((i2 & 32) != 0) {
            obj = viewInfo.layoutInfo;
        }
        Object obj3 = obj;
        if ((i2 & 64) != 0) {
            str2 = viewInfo.name;
        }
        return viewInfo.copy(str, i3, intRect2, sourceLocation2, list2, obj3, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo = (ViewInfo) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fileName, viewInfo.fileName}, getCieXyz.write())).booleanValue() || this.lineNumber != viewInfo.lineNumber) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bounds, viewInfo.bounds}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.location, viewInfo.location}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.children, viewInfo.children}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.layoutInfo, viewInfo.layoutInfo}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, viewInfo.name}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.fileName);
        sb.append(':');
        sb.append(this.lineNumber);
        sb.append(",\n            |bounds=(top=");
        sb.append(this.bounds.getTop());
        sb.append(", left=");
        sb.append(this.bounds.getLeft());
        sb.append(",\n            |location=");
        SourceLocation sourceLocation = this.location;
        if (sourceLocation != null) {
            str = "(" + sourceLocation.getOffset() + 'L' + sourceLocation.getLength();
        } else {
            str = "<none>";
        }
        sb.append(str);
        sb.append("\n            |bottom=");
        sb.append(this.bounds.getBottom());
        sb.append(", right=");
        sb.append(this.bounds.getRight());
        sb.append("),\n            |childrenCount=");
        sb.append(this.children.size());
        sb.append(')');
        return isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat(sb.toString());
    }
}
