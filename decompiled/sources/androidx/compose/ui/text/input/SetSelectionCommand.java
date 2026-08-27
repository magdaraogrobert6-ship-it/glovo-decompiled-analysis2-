package androidx.compose.ui.text.input;

import bo.app.af$$ExternalSyntheticOutline0;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class SetSelectionCommand implements EditCommand {
    public static final int $stable = 0;
    private final int end;
    private final int start;

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int iRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(this.start, 0, editingBuffer.getLength$ui_text());
        int iRemoteActionCompatParcelizer2 = RangesKt.RemoteActionCompatParcelizer(this.end, 0, editingBuffer.getLength$ui_text());
        if (iRemoteActionCompatParcelizer < iRemoteActionCompatParcelizer2) {
            editingBuffer.setSelection$ui_text(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
        } else {
            editingBuffer.setSelection$ui_text(iRemoteActionCompatParcelizer2, iRemoteActionCompatParcelizer);
        }
    }

    public SetSelectionCommand(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetSelectionCommand)) {
            return false;
        }
        SetSelectionCommand setSelectionCommand = (SetSelectionCommand) obj;
        return this.start == setSelectionCommand.start && this.end == setSelectionCommand.end;
    }

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.start);
        sb.append(", end=");
        return af$$ExternalSyntheticOutline0.m(sb, this.end, ')');
    }
}
