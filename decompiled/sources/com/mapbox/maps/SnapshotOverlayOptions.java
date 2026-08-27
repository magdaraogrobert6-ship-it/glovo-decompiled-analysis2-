package com.mapbox.maps;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public final class SnapshotOverlayOptions {
    private final boolean showAttributes;
    private final boolean showLogo;

    public final boolean component1() {
        return this.showLogo;
    }

    public final boolean component2() {
        return this.showAttributes;
    }

    public final boolean getShowAttributes() {
        return this.showAttributes;
    }

    public final boolean getShowLogo() {
        return this.showLogo;
    }

    public final SnapshotOverlayOptions copy(boolean z, boolean z2) {
        return new SnapshotOverlayOptions(z, z2);
    }

    public static /* synthetic */ SnapshotOverlayOptions copy$default(SnapshotOverlayOptions snapshotOverlayOptions, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = snapshotOverlayOptions.showLogo;
        }
        if ((i & 2) != 0) {
            z2 = snapshotOverlayOptions.showAttributes;
        }
        return snapshotOverlayOptions.copy(z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnapshotOverlayOptions)) {
            return false;
        }
        SnapshotOverlayOptions snapshotOverlayOptions = (SnapshotOverlayOptions) obj;
        return this.showLogo == snapshotOverlayOptions.showLogo && this.showAttributes == snapshotOverlayOptions.showAttributes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SnapshotOverlayOptions(showLogo=");
        sb.append(this.showLogo);
        sb.append(", showAttributes=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.showAttributes, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.showLogo;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        boolean z2 = this.showAttributes;
        return (r0 * 31) + (z2 ? 1 : z2);
    }

    public /* synthetic */ SnapshotOverlayOptions(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }

    public SnapshotOverlayOptions(boolean z) {
        this(z, false, 2, null);
    }

    public SnapshotOverlayOptions(boolean z, boolean z2) {
        this.showLogo = z;
        this.showAttributes = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SnapshotOverlayOptions() {
        boolean z = false;
        this(z, z, 3, null);
    }
}
