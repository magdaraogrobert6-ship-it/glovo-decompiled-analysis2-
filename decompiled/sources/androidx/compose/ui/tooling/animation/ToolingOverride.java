package androidx.compose.ui.tooling.animation;

import o.PopulateViewStructure_androidKtpopulate7;

/* JADX INFO: loaded from: classes.dex */
public final class ToolingOverride<T> {
    public static final int $stable = 0;
    private final PopulateViewStructure_androidKtpopulate7 override;
    private final ToolingState<T> state;

    public final PopulateViewStructure_androidKtpopulate7 getOverride() {
        return this.override;
    }

    public final ToolingState<T> getState() {
        return this.state;
    }

    public final void overrideState() {
        this.override.setValue(this.state);
    }

    public ToolingOverride(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, ToolingState<T> toolingState) {
        this.override = populateViewStructure_androidKtpopulate7;
        this.state = toolingState;
    }

    public final void clearOverride() {
        this.override.setValue(null);
    }
}
