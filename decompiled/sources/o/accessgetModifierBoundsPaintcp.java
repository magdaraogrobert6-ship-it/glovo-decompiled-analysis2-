package o;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetModifierBoundsPaintcp {
    public final AtomicReference serializer = new AtomicReference();
    public static final accessgetModifierBoundsPaintcp read = new accessgetModifierBoundsPaintcp();
    public static final getLookaheadConstraintsDWUhwKwui IconCompatParcelizer = new getLookaheadConstraintsDWUhwKwui();

    public static accessgetModifierBoundsPaintcp read() {
        return read;
    }

    public final getLookaheadConstraintsDWUhwKwui write() {
        getLookaheadConstraintsDWUhwKwui getlookaheadconstraintsdwuhwkwui = (getLookaheadConstraintsDWUhwKwui) this.serializer.get();
        return getlookaheadconstraintsdwuhwkwui == null ? IconCompatParcelizer : getlookaheadconstraintsdwuhwkwui;
    }
}
