package androidx.compose.ui.tooling.data;

import bo.app.af$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@UiToolingDataApi
public final class SourceLocation {
    public static final int $stable = 0;
    private final int length;
    private final int lineNumber;
    private final int offset;
    private final int packageHash;
    private final String sourceFile;

    public final int component1() {
        return this.lineNumber;
    }

    public final int component2() {
        return this.offset;
    }

    public final int component3() {
        return this.length;
    }

    public final String component4() {
        return this.sourceFile;
    }

    public final int component5() {
        return this.packageHash;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getPackageHash() {
        return this.packageHash;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final SourceLocation copy(int i, int i2, int i3, String str, int i4) {
        return new SourceLocation(i, i2, i3, str, i4);
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.length, af$$ExternalSyntheticOutline0.m(this.offset, Integer.hashCode(this.lineNumber) * 31, 31), 31);
        String str = this.sourceFile;
        return Integer.hashCode(this.packageHash) + ((iM + (str == null ? 0 : str.hashCode())) * 31);
    }

    public SourceLocation(int i, int i2, int i3, String str, int i4) {
        this.lineNumber = i;
        this.offset = i2;
        this.length = i3;
        this.sourceFile = str;
        this.packageHash = i4;
    }

    public static /* synthetic */ SourceLocation copy$default(SourceLocation sourceLocation, int i, int i2, int i3, String str, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = sourceLocation.lineNumber;
        }
        if ((i5 & 2) != 0) {
            i2 = sourceLocation.offset;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = sourceLocation.length;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            str = sourceLocation.sourceFile;
        }
        String str2 = str;
        if ((i5 & 16) != 0) {
            i4 = sourceLocation.packageHash;
        }
        return sourceLocation.copy(i, i6, i7, str2, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceLocation)) {
            return false;
        }
        SourceLocation sourceLocation = (SourceLocation) obj;
        if (this.lineNumber != sourceLocation.lineNumber || this.offset != sourceLocation.offset || this.length != sourceLocation.length) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sourceFile, sourceLocation.sourceFile}, getCieXyz.write())).booleanValue() && this.packageHash == sourceLocation.packageHash;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SourceLocation(lineNumber=");
        sb.append(this.lineNumber);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", sourceFile=");
        sb.append(this.sourceFile);
        sb.append(", packageHash=");
        return af$$ExternalSyntheticOutline0.m(sb, this.packageHash, ')');
    }
}
