package androidx.compose.ui;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalMediaQueryApi
public interface UiMediaScope {

    /* JADX INFO: loaded from: classes4.dex */
    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    @ExperimentalMediaQueryApi
    public static final class KeyboardKind {
        private final String description;
        public static final Companion Companion = new Companion(null);
        private static final String Physical = m169constructorimpl("Physical");
        private static final String Virtual = m169constructorimpl("Virtual");
        private static final String None = m169constructorimpl("None");

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static String m169constructorimpl(String str) {
            return str;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m171equalsimpl0(String str, String str2) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, str2}, iWrite3)).booleanValue();
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m172hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m173toStringimpl(String str) {
            return str;
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m174unboximpl() {
            return this.description;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ KeyboardKind m168boximpl(String str) {
            return new KeyboardKind(str);
        }

        public boolean equals(Object obj) {
            return m170equalsimpl(this.description, obj);
        }

        public int hashCode() {
            return m172hashCodeimpl(this.description);
        }

        public String toString() {
            return m173toStringimpl(this.description);
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getNone-J9_QTjY, reason: not valid java name */
            public final String m175getNoneJ9_QTjY() {
                return KeyboardKind.None;
            }

            /* JADX INFO: renamed from: getPhysical-J9_QTjY, reason: not valid java name */
            public final String m176getPhysicalJ9_QTjY() {
                return KeyboardKind.Physical;
            }

            /* JADX INFO: renamed from: getVirtual-J9_QTjY, reason: not valid java name */
            public final String m177getVirtualJ9_QTjY() {
                return KeyboardKind.Virtual;
            }

            private Companion() {
            }
        }

        private /* synthetic */ KeyboardKind(String str) {
            this.description = str;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m170equalsimpl(String str, Object obj) {
            if (!(obj instanceof KeyboardKind)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ((KeyboardKind) obj).m174unboximpl()}, getCieXyz.write())).booleanValue();
        }
    }

    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    @ExperimentalMediaQueryApi
    public static final class PointerPrecision {
        private final String description;
        public static final Companion Companion = new Companion(null);
        private static final String Fine = m179constructorimpl("Fine");
        private static final String Coarse = m179constructorimpl("Coarse");
        private static final String Blunt = m179constructorimpl("Blunt");
        private static final String None = m179constructorimpl("None");

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static String m179constructorimpl(String str) {
            return str;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m181equalsimpl0(String str, String str2) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, str2}, iWrite3)).booleanValue();
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m182hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m183toStringimpl(String str) {
            return str;
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m184unboximpl() {
            return this.description;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ PointerPrecision m178boximpl(String str) {
            return new PointerPrecision(str);
        }

        public boolean equals(Object obj) {
            return m180equalsimpl(this.description, obj);
        }

        public int hashCode() {
            return m182hashCodeimpl(this.description);
        }

        public String toString() {
            return m183toStringimpl(this.description);
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getBlunt-fpxItnM, reason: not valid java name */
            public final String m185getBluntfpxItnM() {
                return PointerPrecision.Blunt;
            }

            /* JADX INFO: renamed from: getCoarse-fpxItnM, reason: not valid java name */
            public final String m186getCoarsefpxItnM() {
                return PointerPrecision.Coarse;
            }

            /* JADX INFO: renamed from: getFine-fpxItnM, reason: not valid java name */
            public final String m187getFinefpxItnM() {
                return PointerPrecision.Fine;
            }

            /* JADX INFO: renamed from: getNone-fpxItnM, reason: not valid java name */
            public final String m188getNonefpxItnM() {
                return PointerPrecision.None;
            }

            private Companion() {
            }
        }

        private /* synthetic */ PointerPrecision(String str) {
            this.description = str;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m180equalsimpl(String str, Object obj) {
            if (!(obj instanceof PointerPrecision)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ((PointerPrecision) obj).m184unboximpl()}, getCieXyz.write())).booleanValue();
        }
    }

    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    @ExperimentalMediaQueryApi
    public static final class Posture {
        private final String description;
        public static final Companion Companion = new Companion(null);
        private static final String Flat = m190constructorimpl("Flat");
        private static final String Tabletop = m190constructorimpl("Tabletop");
        private static final String Book = m190constructorimpl("Book");

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static String m190constructorimpl(String str) {
            return str;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m192equalsimpl0(String str, String str2) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, str2}, iWrite3)).booleanValue();
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m193hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m194toStringimpl(String str) {
            return str;
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m195unboximpl() {
            return this.description;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Posture m189boximpl(String str) {
            return new Posture(str);
        }

        public boolean equals(Object obj) {
            return m191equalsimpl(this.description, obj);
        }

        public int hashCode() {
            return m193hashCodeimpl(this.description);
        }

        public String toString() {
            return m194toStringimpl(this.description);
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getBook-m18o9QQ, reason: not valid java name */
            public final String m196getBookm18o9QQ() {
                return Posture.Book;
            }

            /* JADX INFO: renamed from: getFlat-m18o9QQ, reason: not valid java name */
            public final String m197getFlatm18o9QQ() {
                return Posture.Flat;
            }

            /* JADX INFO: renamed from: getTabletop-m18o9QQ, reason: not valid java name */
            public final String m198getTabletopm18o9QQ() {
                return Posture.Tabletop;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Posture(String str) {
            this.description = str;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m191equalsimpl(String str, Object obj) {
            if (!(obj instanceof Posture)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ((Posture) obj).m195unboximpl()}, getCieXyz.write())).booleanValue();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    @ExperimentalMediaQueryApi
    public static final class ViewingDistance {
        private final String description;
        public static final Companion Companion = new Companion(null);
        private static final String Near = m200constructorimpl("Near");
        private static final String Medium = m200constructorimpl("Medium");
        private static final String Far = m200constructorimpl("Far");

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static String m200constructorimpl(String str) {
            return str;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m202equalsimpl0(String str, String str2) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, str2}, iWrite3)).booleanValue();
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m203hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m204toStringimpl(String str) {
            return str;
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m205unboximpl() {
            return this.description;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ViewingDistance m199boximpl(String str) {
            return new ViewingDistance(str);
        }

        public boolean equals(Object obj) {
            return m201equalsimpl(this.description, obj);
        }

        public int hashCode() {
            return m203hashCodeimpl(this.description);
        }

        public String toString() {
            return m204toStringimpl(this.description);
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getFar-tKro-MQ, reason: not valid java name */
            public final String m206getFartKroMQ() {
                return ViewingDistance.Far;
            }

            /* JADX INFO: renamed from: getMedium-tKro-MQ, reason: not valid java name */
            public final String m207getMediumtKroMQ() {
                return ViewingDistance.Medium;
            }

            /* JADX INFO: renamed from: getNear-tKro-MQ, reason: not valid java name */
            public final String m208getNeartKroMQ() {
                return ViewingDistance.Near;
            }

            private Companion() {
            }
        }

        private /* synthetic */ ViewingDistance(String str) {
            this.description = str;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m201equalsimpl(String str, Object obj) {
            if (!(obj instanceof ViewingDistance)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ((ViewingDistance) obj).m205unboximpl()}, getCieXyz.write())).booleanValue();
        }
    }

    boolean getHasCamera();

    boolean getHasMicrophone();

    /* JADX INFO: renamed from: getKeyboardKind-J9_QTjY, reason: not valid java name */
    String mo162getKeyboardKindJ9_QTjY();

    /* JADX INFO: renamed from: getPointerPrecision-fpxItnM, reason: not valid java name */
    String mo163getPointerPrecisionfpxItnM();

    /* JADX INFO: renamed from: getViewingDistance-tKro-MQ, reason: not valid java name */
    String mo164getViewingDistancetKroMQ();

    /* JADX INFO: renamed from: getWindowHeight-D9Ej5fM, reason: not valid java name */
    float mo165getWindowHeightD9Ej5fM();

    /* JADX INFO: renamed from: getWindowPosture-m18o9QQ, reason: not valid java name */
    String mo166getWindowPosturem18o9QQ();

    /* JADX INFO: renamed from: getWindowWidth-D9Ej5fM, reason: not valid java name */
    float mo167getWindowWidthD9Ej5fM();
}
