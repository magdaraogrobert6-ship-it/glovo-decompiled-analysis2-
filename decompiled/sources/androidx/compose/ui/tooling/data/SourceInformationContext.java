package androidx.compose.ui.tooling.data;

import java.util.List;
import o.CacheDrawModifierNode;
import o.onMeasureResultChanged;

/* JADX INFO: loaded from: classes.dex */
final class SourceInformationContext {
    private final boolean isCall;
    private final boolean isInline;
    private final List<CacheDrawModifierNode> locations;
    private final String name;
    private int nextLocation;
    private final int packageHash;
    private final List<onMeasureResultChanged> parameters;
    private final int repeatOffset;
    private final String sourceFile;

    public final List<CacheDrawModifierNode> getLocations() {
        return this.locations;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPackageHash() {
        return this.packageHash;
    }

    public final List<onMeasureResultChanged> getParameters() {
        return this.parameters;
    }

    public final int getRepeatOffset() {
        return this.repeatOffset;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final boolean isCall() {
        return this.isCall;
    }

    public final boolean isInline() {
        return this.isInline;
    }

    public final SourceLocation nextSourceLocation() {
        int i;
        if (this.nextLocation >= this.locations.size() && (i = this.repeatOffset) >= 0) {
            this.nextLocation = i;
        }
        if (this.nextLocation >= this.locations.size()) {
            return null;
        }
        List<CacheDrawModifierNode> list = this.locations;
        int i2 = this.nextLocation;
        this.nextLocation = i2 + 1;
        CacheDrawModifierNode cacheDrawModifierNode = list.get(i2);
        return new SourceLocation(cacheDrawModifierNode.IconCompatParcelizer, cacheDrawModifierNode.read, cacheDrawModifierNode.RemoteActionCompatParcelizer, this.sourceFile, this.packageHash);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    public final SourceLocation sourceLocation(int i, SourceInformationContext sourceInformationContext) {
        String str;
        int i2;
        int iIntValue;
        int i3;
        if (i >= this.locations.size() && (i3 = this.repeatOffset) >= 0 && i3 < this.locations.size()) {
            int i4 = this.repeatOffset;
            int size = this.locations.size();
            int i5 = this.repeatOffset;
            i = ((i - i4) % (size - i5)) + i5;
        }
        Integer numValueOf = null;
        if (i >= this.locations.size()) {
            return null;
        }
        CacheDrawModifierNode cacheDrawModifierNode = this.locations.get(i);
        int i6 = cacheDrawModifierNode.IconCompatParcelizer;
        int i7 = cacheDrawModifierNode.read;
        int i8 = cacheDrawModifierNode.RemoteActionCompatParcelizer;
        String str2 = this.sourceFile;
        if (str2 == null) {
            str = sourceInformationContext != null ? sourceInformationContext.sourceFile : null;
        } else {
            str = str2;
        }
        if (str2 == null) {
            if (sourceInformationContext != null) {
                i2 = sourceInformationContext.packageHash;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = -1;
            }
            return new SourceLocation(i6, i7, i8, str, iIntValue);
        }
        i2 = this.packageHash;
        numValueOf = Integer.valueOf(i2);
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        return new SourceLocation(i6, i7, i8, str, iIntValue);
    }

    public SourceInformationContext(String str, String str2, int i, List<CacheDrawModifierNode> list, int i2, List<onMeasureResultChanged> list2, boolean z, boolean z2) {
        this.name = str;
        this.sourceFile = str2;
        this.packageHash = i;
        this.locations = list;
        this.repeatOffset = i2;
        this.parameters = list2;
        this.isCall = z;
        this.isInline = z2;
    }
}
