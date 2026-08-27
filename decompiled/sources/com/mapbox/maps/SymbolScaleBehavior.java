package com.mapbox.maps;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@MapboxExperimental
public final class SymbolScaleBehavior {
    private static final String TYPE_FIXED = "FIXED";
    private static final String TYPE_SYSTEM = "SYSTEM";
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM mapping;
    private final Float scaleFactor;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM defaultMapping = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.SymbolScaleBehavior$Companion$defaultMapping$1
        public final Float invoke(float f) {
            if (f < 0.85f) {
                f = 0.8f;
            } else if (f > 2.0f) {
                f = 2.0f;
            } else if (f < 1.0f) {
                f = (((f - 0.85f) / 0.15f) * 0.2f) + 0.8f;
            }
            return Float.valueOf(f);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }
    };

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getMapping$maps_sdk_release() {
        return this.mapping;
    }

    public final Float getScaleFactor$maps_sdk_release() {
        return this.scaleFactor;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getSystem$annotations() {
        }

        public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getDefaultMapping$maps_sdk_release() {
            return SymbolScaleBehavior.defaultMapping;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final SymbolScaleBehavior getSystem() {
            return new SymbolScaleBehavior(SymbolScaleBehavior.TYPE_SYSTEM, null, getDefaultMapping$maps_sdk_release(), 0 == true ? 1 : 0);
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final SymbolScaleBehavior system(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            return new SymbolScaleBehavior(SymbolScaleBehavior.TYPE_SYSTEM, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final SymbolScaleBehavior fixed(float f) {
            return new SymbolScaleBehavior(SymbolScaleBehavior.TYPE_FIXED, Float.valueOf(f), null, 0 == true ? 1 : 0);
        }
    }

    public static final SymbolScaleBehavior fixed(float f) {
        return Companion.fixed(f);
    }

    public static final SymbolScaleBehavior getSystem() {
        return Companion.getSystem();
    }

    public static final SymbolScaleBehavior system(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return Companion.system(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.scaleFactor, this.mapping);
    }

    private SymbolScaleBehavior(String str, Float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.type = str;
        this.scaleFactor = f;
        this.mapping = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SymbolScaleBehavior)) {
            return false;
        }
        SymbolScaleBehavior symbolScaleBehavior = (SymbolScaleBehavior) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, symbolScaleBehavior.type}, getCieXyz.write())).booleanValue() && removeNodeAtDepth.IconCompatParcelizer(this.scaleFactor, symbolScaleBehavior.scaleFactor) && this.mapping == symbolScaleBehavior.mapping;
    }

    public final boolean isFixed$maps_sdk_release() {
        Object[] objArr = {this.type, TYPE_FIXED};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public final boolean isSystem$maps_sdk_release() {
        Object[] objArr = {this.type, TYPE_SYSTEM};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        String str = this.type;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, TYPE_FIXED}, getCieXyz.write())).booleanValue()) {
            return "SymbolScaleBehavior.Fixed(scaleFactor=" + this.scaleFactor + ')';
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, TYPE_SYSTEM}, getCieXyz.write())).booleanValue()) {
            return ff$$ExternalSyntheticOutline0.m(new StringBuilder("SymbolScaleBehavior(type="), this.type, ')');
        }
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("SymbolScaleBehavior.System(mapping="), ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mapping, defaultMapping}, getCieXyz.write())).booleanValue() ? "default" : "custom", ')');
    }

    public /* synthetic */ SymbolScaleBehavior(String str, Float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
