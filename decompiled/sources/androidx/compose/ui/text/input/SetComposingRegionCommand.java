package androidx.compose.ui.text.input;

import bo.app.af$$ExternalSyntheticOutline0;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class SetComposingRegionCommand implements EditCommand {
    public static final int $stable = 0;
    private final int end;
    private final int start;

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public SetComposingRegionCommand(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingRegionCommand)) {
            return false;
        }
        SetComposingRegionCommand setComposingRegionCommand = (SetComposingRegionCommand) obj;
        return this.start == setComposingRegionCommand.start && this.end == setComposingRegionCommand.end;
    }

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.start);
        sb.append(", end=");
        return af$$ExternalSyntheticOutline0.m(sb, this.end, ')');
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition$ui_text()) {
            editingBuffer.commitComposition$ui_text();
        }
        int iRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(this.start, 0, editingBuffer.getLength$ui_text());
        int iRemoteActionCompatParcelizer2 = RangesKt.RemoteActionCompatParcelizer(this.end, 0, editingBuffer.getLength$ui_text());
        if (iRemoteActionCompatParcelizer != iRemoteActionCompatParcelizer2) {
            if (iRemoteActionCompatParcelizer < iRemoteActionCompatParcelizer2) {
                editingBuffer.setComposition$ui_text(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
            } else {
                editingBuffer.setComposition$ui_text(iRemoteActionCompatParcelizer2, iRemoteActionCompatParcelizer);
            }
        }
    }
}
