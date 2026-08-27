package o;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.Objects;
import kotlin.io.TextStreamsKt;
import okio.Options;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LOWER_HYPHEN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public abstract class visitLocalDescendantsdefault {
    private static final /* synthetic */ visitLocalDescendantsdefault[] $VALUES;
    public static final visitLocalDescendantsdefault LOWER_CAMEL;
    public static final visitLocalDescendantsdefault LOWER_HYPHEN;
    public static final visitLocalDescendantsdefault LOWER_UNDERSCORE;
    public static final visitLocalDescendantsdefault UPPER_CAMEL;
    public static final visitLocalDescendantsdefault UPPER_UNDERSCORE;
    private final visitLocalAncestors6rFNWt0 wordBoundary;
    private final String wordSeparator;

    public String normalizeFirstWord(String str) {
        return normalizeWord(str);
    }

    public abstract String normalizeWord(String str);

    private static /* synthetic */ visitLocalDescendantsdefault[] $values() {
        return new visitLocalDescendantsdefault[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    public static visitLocalDescendantsdefault valueOf(String str) {
        return (visitLocalDescendantsdefault) Enum.valueOf(visitLocalDescendantsdefault.class, str);
    }

    public static visitLocalDescendantsdefault[] values() {
        return (visitLocalDescendantsdefault[]) $VALUES.clone();
    }

    public visitSelfAndChildrenYYKmho converterTo(visitLocalDescendantsdefault visitlocaldescendantsdefault) {
        return new visitLocalDescendants6rFNWt0(this, visitlocaldescendantsdefault);
    }

    private visitLocalDescendantsdefault(String str, int i, visitLocalAncestors6rFNWt0 visitlocalancestors6rfnwt0, String str2) {
        super(str, i);
        this.wordBoundary = visitlocalancestors6rfnwt0;
        this.wordSeparator = str2;
    }

    public final String to(visitLocalDescendantsdefault visitlocaldescendantsdefault, String str) {
        visitlocaldescendantsdefault.getClass();
        str.getClass();
        return visitlocaldescendantsdefault == this ? str : convert(visitlocaldescendantsdefault, str);
    }

    public String convert(visitLocalDescendantsdefault visitlocaldescendantsdefault, String str) {
        StringBuilder sb = null;
        int length = 0;
        int i = -1;
        while (true) {
            visitLocalAncestors6rFNWt0 visitlocalancestors6rfnwt0 = this.wordBoundary;
            i++;
            visitlocalancestors6rfnwt0.getClass();
            int length2 = str.length();
            TextStreamsKt.serializer(i, length2);
            while (true) {
                if (i >= length2) {
                    i = -1;
                    break;
                }
                if (visitlocalancestors6rfnwt0.read(str.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                break;
            }
            if (length == 0) {
                StringBuilder sb2 = new StringBuilder((visitlocaldescendantsdefault.wordSeparator.length() * 4) + str.length());
                sb2.append(visitlocaldescendantsdefault.normalizeFirstWord(str.substring(length, i)));
                sb = sb2;
            } else {
                Objects.requireNonNull(sb);
                sb.append(visitlocaldescendantsdefault.normalizeWord(str.substring(length, i)));
            }
            sb.append(visitlocaldescendantsdefault.wordSeparator);
            length = this.wordSeparator.length() + i;
        }
        if (length == 0) {
            return visitlocaldescendantsdefault.normalizeFirstWord(str);
        }
        Objects.requireNonNull(sb);
        sb.append(visitlocaldescendantsdefault.normalizeWord(str.substring(length)));
        return sb.toString();
    }

    static {
        final char c = '-';
        String str = "LOWER_HYPHEN";
        LOWER_HYPHEN = new visitLocalDescendantsdefault(str, 0, new visitLocalAncestors(c) { // from class: o.visitSelfAndLocalDescendants6rFNWt0
            public final char read;

            @Override // o.visitLocalAncestors6rFNWt0
            public final boolean read(char c2) {
                return c2 == this.read;
            }

            {
                this.read = c;
            }

            public final String toString() {
                return "CharMatcher.is('" + visitLocalAncestors6rFNWt0.RemoteActionCompatParcelizer(this.read) + "')";
            }
        }, "-") { // from class: o.visitLocalDescendantsdefault.1
            @Override // o.visitLocalDescendantsdefault
            public String normalizeWord(String str2) {
                return Options.Companion.read(str2);
            }

            @Override // o.visitLocalDescendantsdefault
            public String convert(visitLocalDescendantsdefault visitlocaldescendantsdefault, String str2) {
                if (visitlocaldescendantsdefault == visitLocalDescendantsdefault.LOWER_UNDERSCORE) {
                    return str2.replace('-', '_');
                }
                return visitlocaldescendantsdefault == visitLocalDescendantsdefault.UPPER_UNDERSCORE ? Options.Companion.RemoteActionCompatParcelizer(str2.replace('-', '_')) : super.convert(visitlocaldescendantsdefault, str2);
            }
        };
        final char c2 = '_';
        visitLocalAncestors visitlocalancestors = new visitLocalAncestors(c2) { // from class: o.visitSelfAndLocalDescendants6rFNWt0
            public final char read;

            @Override // o.visitLocalAncestors6rFNWt0
            public final boolean read(char c3) {
                return c3 == this.read;
            }

            {
                this.read = c2;
            }

            public final String toString() {
                return "CharMatcher.is('" + visitLocalAncestors6rFNWt0.RemoteActionCompatParcelizer(this.read) + "')";
            }
        };
        String str2 = BundleUtil.UNDERLINE_TAG;
        LOWER_UNDERSCORE = new visitLocalDescendantsdefault("LOWER_UNDERSCORE", 1, visitlocalancestors, str2) { // from class: o.visitLocalDescendantsdefault.3
            @Override // o.visitLocalDescendantsdefault
            public String normalizeWord(String str3) {
                return Options.Companion.read(str3);
            }

            @Override // o.visitLocalDescendantsdefault
            public String convert(visitLocalDescendantsdefault visitlocaldescendantsdefault, String str3) {
                if (visitlocaldescendantsdefault == visitLocalDescendantsdefault.LOWER_HYPHEN) {
                    return str3.replace('_', '-');
                }
                return visitlocaldescendantsdefault == visitLocalDescendantsdefault.UPPER_UNDERSCORE ? Options.Companion.RemoteActionCompatParcelizer(str3) : super.convert(visitlocaldescendantsdefault, str3);
            }
        };
        String str3 = "";
        LOWER_CAMEL = new visitLocalDescendantsdefault("LOWER_CAMEL", 2, new visitLocalAncestors() { // from class: o.visitLocalDescendants
            public final char read = 'A';
            public final char serializer = 'Z';

            @Override // o.visitLocalAncestors6rFNWt0
            public final boolean read(char c3) {
                return this.read <= c3 && c3 <= this.serializer;
            }

            public final String toString() {
                return "CharMatcher.inRange('" + visitLocalAncestors6rFNWt0.RemoteActionCompatParcelizer(this.read) + "', '" + visitLocalAncestors6rFNWt0.RemoteActionCompatParcelizer(this.serializer) + "')";
            }
        }, str3) { // from class: o.visitLocalDescendantsdefault.5
            @Override // o.visitLocalDescendantsdefault
            public String normalizeFirstWord(String str4) {
                return Options.Companion.read(str4);
            }

            @Override // o.visitLocalDescendantsdefault
            public String normalizeWord(String str4) {
                return visitLocalDescendantsdefault.firstCharOnlyToUpper(str4);
            }
        };
        UPPER_CAMEL = new visitLocalDescendantsdefault("UPPER_CAMEL", 3, new visitLocalAncestors() { // from class: o.visitLocalDescendants
            public final char read = 'A';
            public final char serializer = 'Z';

            @Override // o.visitLocalAncestors6rFNWt0
            public final boolean read(char c3) {
                return this.read <= c3 && c3 <= this.serializer;
            }

            public final String toString() {
                return "CharMatcher.inRange('" + visitLocalAncestors6rFNWt0.RemoteActionCompatParcelizer(this.read) + "', '" + visitLocalAncestors6rFNWt0.RemoteActionCompatParcelizer(this.serializer) + "')";
            }
        }, str3) { // from class: o.visitLocalDescendantsdefault.4
            @Override // o.visitLocalDescendantsdefault
            public String normalizeWord(String str4) {
                return visitLocalDescendantsdefault.firstCharOnlyToUpper(str4);
            }
        };
        UPPER_UNDERSCORE = new visitLocalDescendantsdefault("UPPER_UNDERSCORE", 4, new visitLocalAncestors(c2) { // from class: o.visitSelfAndLocalDescendants6rFNWt0
            public final char read;

            @Override // o.visitLocalAncestors6rFNWt0
            public final boolean read(char c3) {
                return c3 == this.read;
            }

            {
                this.read = c2;
            }

            public final String toString() {
                return "CharMatcher.is('" + visitLocalAncestors6rFNWt0.RemoteActionCompatParcelizer(this.read) + "')";
            }
        }, str2) { // from class: o.visitLocalDescendantsdefault.2
            @Override // o.visitLocalDescendantsdefault
            public String normalizeWord(String str4) {
                return Options.Companion.RemoteActionCompatParcelizer(str4);
            }

            @Override // o.visitLocalDescendantsdefault
            public String convert(visitLocalDescendantsdefault visitlocaldescendantsdefault, String str4) {
                if (visitlocaldescendantsdefault == visitLocalDescendantsdefault.LOWER_HYPHEN) {
                    return Options.Companion.read(str4.replace('_', '-'));
                }
                return visitlocaldescendantsdefault == visitLocalDescendantsdefault.LOWER_UNDERSCORE ? Options.Companion.read(str4) : super.convert(visitlocaldescendantsdefault, str4);
            }
        };
        $VALUES = $values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String firstCharOnlyToUpper(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Options.Companion.RemoteActionCompatParcelizer(cCharAt)) {
            cCharAt = (char) (cCharAt ^ ' ');
        }
        sb.append(cCharAt);
        sb.append(Options.Companion.read(str.substring(1)));
        return sb.toString();
    }
}
