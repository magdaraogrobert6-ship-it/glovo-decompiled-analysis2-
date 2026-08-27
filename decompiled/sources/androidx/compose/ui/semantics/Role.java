package androidx.compose.ui.semantics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class Role {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Button = m2808constructorimpl(0);
    private static final int Checkbox = m2808constructorimpl(1);
    private static final int Switch = m2808constructorimpl(2);
    private static final int RadioButton = m2808constructorimpl(3);
    private static final int Tab = m2808constructorimpl(4);
    private static final int Image = m2808constructorimpl(5);
    private static final int DropdownList = m2808constructorimpl(6);
    private static final int ValuePicker = m2808constructorimpl(7);
    private static final int Carousel = m2808constructorimpl(8);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m2808constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2810equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2811hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2813unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Role m2807boximpl(int i) {
        return new Role(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2812toStringimpl(int i) {
        if (m2810equalsimpl0(i, Button)) {
            return "Button";
        }
        if (m2810equalsimpl0(i, Checkbox)) {
            return "Checkbox";
        }
        if (m2810equalsimpl0(i, Switch)) {
            return "Switch";
        }
        if (m2810equalsimpl0(i, RadioButton)) {
            return "RadioButton";
        }
        if (m2810equalsimpl0(i, Tab)) {
            return "Tab";
        }
        if (m2810equalsimpl0(i, Image)) {
            return "Image";
        }
        if (m2810equalsimpl0(i, DropdownList)) {
            return "DropdownList";
        }
        if (m2810equalsimpl0(i, ValuePicker)) {
            return "Picker";
        }
        return m2810equalsimpl0(i, Carousel) ? "Carousel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2809equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2811hashCodeimpl(this.value);
    }

    public String toString() {
        return m2812toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m2814getButtono7Vup1c() {
            return Role.Button;
        }

        /* JADX INFO: renamed from: getCarousel-o7Vup1c, reason: not valid java name */
        public final int m2815getCarouselo7Vup1c() {
            return Role.Carousel;
        }

        /* JADX INFO: renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m2816getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* JADX INFO: renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m2817getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }

        /* JADX INFO: renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m2818getImageo7Vup1c() {
            return Role.Image;
        }

        /* JADX INFO: renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m2819getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* JADX INFO: renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m2820getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* JADX INFO: renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m2821getTabo7Vup1c() {
            return Role.Tab;
        }

        /* JADX INFO: renamed from: getValuePicker-o7Vup1c, reason: not valid java name */
        public final int m2822getValuePickero7Vup1c() {
            return Role.ValuePicker;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Role(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2809equalsimpl(int i, Object obj) {
        return (obj instanceof Role) && i == ((Role) obj).m2813unboximpl();
    }
}
