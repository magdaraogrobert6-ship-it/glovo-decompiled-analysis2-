package com.braze.ui.actions.brazeactions.steps;

import com.braze.Braze;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseBrazeActionStep implements IBrazeActionStep {
    public static final Companion Companion = new Companion(null);

    public /* synthetic */ BaseBrazeActionStep(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void runOnUser$android_sdk_ui_release(Braze braze, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            braze.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            braze.getCurrentUser(new BaseBrazeActionStep$Companion$runOnUser$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm));
        }

        private Companion() {
        }
    }

    private BaseBrazeActionStep() {
    }
}
