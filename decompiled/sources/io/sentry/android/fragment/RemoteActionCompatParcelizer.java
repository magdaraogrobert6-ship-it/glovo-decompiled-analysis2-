package io.sentry.android.fragment;

import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 io.sentry.android.fragment.RemoteActionCompatParcelizer, still in use, count: 1, list:
  (r0v0 io.sentry.android.fragment.RemoteActionCompatParcelizer) from 0x0099: INVOKE (r11v5 java.util.HashSet), (r0v0 io.sentry.android.fragment.RemoteActionCompatParcelizer) VIRTUAL call: java.util.HashSet.add(java.lang.Object):boolean A[MD:(E):boolean (c)] (LINE:153)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer {
    ATTACHED("attached"),
    SAVE_INSTANCE_STATE("save instance state"),
    CREATED("created"),
    VIEW_CREATED("view created"),
    STARTED("started"),
    RESUMED("resumed"),
    PAUSED("paused"),
    STOPPED("stopped"),
    VIEW_DESTROYED("view destroyed"),
    DESTROYED("destroyed"),
    DETACHED("detached");

    private static final Set<RemoteActionCompatParcelizer> states;
    private final String breadcrumbName;
    public static final write Companion = new write();

    public final String getBreadcrumbName$sentry_android_fragment_release() {
        return this.breadcrumbName;
    }

    public static RemoteActionCompatParcelizer valueOf(String str) {
        return (RemoteActionCompatParcelizer) Enum.valueOf(RemoteActionCompatParcelizer.class, str);
    }

    public static RemoteActionCompatParcelizer[] values() {
        return (RemoteActionCompatParcelizer[]) $VALUES.clone();
    }

    private RemoteActionCompatParcelizer(String str) {
        super(str, i);
        this.breadcrumbName = str;
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(new RemoteActionCompatParcelizer("attached"));
        hashSet.add(new RemoteActionCompatParcelizer("save instance state"));
        hashSet.add(new RemoteActionCompatParcelizer("created"));
        hashSet.add(new RemoteActionCompatParcelizer("view created"));
        hashSet.add(new RemoteActionCompatParcelizer("started"));
        hashSet.add(new RemoteActionCompatParcelizer("resumed"));
        hashSet.add(new RemoteActionCompatParcelizer("paused"));
        hashSet.add(new RemoteActionCompatParcelizer("stopped"));
        hashSet.add(new RemoteActionCompatParcelizer("view destroyed"));
        hashSet.add(new RemoteActionCompatParcelizer("destroyed"));
        hashSet.add(new RemoteActionCompatParcelizer("detached"));
        states = hashSet;
    }
}
